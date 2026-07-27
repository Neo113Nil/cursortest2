package c8;

import D.H;
import b8.AbstractC0534c;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f5776a = new n();

    public static final h a(Number number, String str) {
        return new h("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) f(str, -1)));
    }

    public static final h b(int i, CharSequence input, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) f(input, i));
        kotlin.jvm.internal.h.e(message2, "message");
        if (i >= 0) {
            message2 = "Unexpected JSON token at offset " + i + ": " + message2;
        }
        kotlin.jvm.internal.h.e(message2, "message");
        return new h(message2);
    }

    public static final Y7.e c(Y7.e eVar, C3.e module) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(module, "module");
        return (!kotlin.jvm.internal.h.a(eVar.d(), Y7.h.f4054g) && eVar.g()) ? c(eVar.i(0), module) : eVar;
    }

    public static final byte d(char c4) {
        if (c4 < '~') {
            return d.f5768b[c4];
        }
        return (byte) 0;
    }

    public static final void e(H h9, String str) {
        h9.m(h9.f491u - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence f(CharSequence charSequence, int i) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i4 = i - 30;
                int i9 = i + 30;
                String str = i4 <= 0 ? "" : ".....";
                String str2 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder b9 = AbstractC5088e.b(str);
                if (i4 < 0) {
                    i4 = 0;
                }
                int length = charSequence.length();
                if (i9 > length) {
                    i9 = length;
                }
                b9.append(charSequence.subSequence(i4, i9).toString());
                b9.append(str2);
                return b9.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void g(Y7.e eVar, AbstractC0534c json) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.a(eVar.d(), Y7.i.f4056g);
    }

    public static final u h(Y7.e desc, AbstractC0534c abstractC0534c) {
        kotlin.jvm.internal.h.e(abstractC0534c, "<this>");
        kotlin.jvm.internal.h.e(desc, "desc");
        com.bumptech.glide.e d2 = desc.d();
        if (d2 instanceof Y7.b) {
            return u.f5808y;
        }
        if (kotlin.jvm.internal.h.a(d2, Y7.i.f4057h)) {
            return u.f5806w;
        }
        if (!kotlin.jvm.internal.h.a(d2, Y7.i.i)) {
            return u.f5805v;
        }
        Y7.e c4 = c(desc.i(0), abstractC0534c.f5584b);
        com.bumptech.glide.e d3 = c4.d();
        if ((d3 instanceof Y7.d) || kotlin.jvm.internal.h.a(d3, Y7.h.f4055h)) {
            return u.f5807x;
        }
        throw new h("Value of type '" + c4.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c4.d() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void i(H h9, Number number) {
        H.n(h9, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String j(byte b9) {
        return b9 == 1 ? "quotation mark '\"'" : b9 == 2 ? "string escape sequence '\\'" : b9 == 4 ? "comma ','" : b9 == 5 ? "colon ':'" : b9 == 6 ? "start of the object '{'" : b9 == 7 ? "end of the object '}'" : b9 == 8 ? "start of the array '['" : b9 == 9 ? "end of the array ']'" : b9 == 10 ? "end of the input" : b9 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}

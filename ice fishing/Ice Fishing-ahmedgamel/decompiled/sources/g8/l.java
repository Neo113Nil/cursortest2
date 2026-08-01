package g8;

import D.H;
import f8.AbstractC4516c;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f37719a = new m();

    public static final g a(Number number, String str) {
        return new g("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) f(str, -1)));
    }

    public static final g b(int i, CharSequence input, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) f(input, i));
        kotlin.jvm.internal.h.e(message2, "message");
        if (i >= 0) {
            message2 = "Unexpected JSON token at offset " + i + ": " + message2;
        }
        kotlin.jvm.internal.h.e(message2, "message");
        return new g(message2);
    }

    public static final c8.e c(c8.e eVar, M2.i module) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(module, "module");
        return (!kotlin.jvm.internal.h.a(eVar.d(), c8.h.f5649b) && eVar.g()) ? c(eVar.i(0), module) : eVar;
    }

    public static final byte d(char c9) {
        if (c9 < '~') {
            return c.f37711b[c9];
        }
        return (byte) 0;
    }

    public static final void e(H h9, String str) {
        h9.l(h9.f436u - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence f(CharSequence charSequence, int i) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i6 = i - 30;
                int i9 = i + 30;
                String str = i6 <= 0 ? "" : ".....";
                String str2 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder b9 = AbstractC5049e.b(str);
                if (i6 < 0) {
                    i6 = 0;
                }
                int length = charSequence.length();
                if (i9 > length) {
                    i9 = length;
                }
                b9.append(charSequence.subSequence(i6, i9).toString());
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

    public static final void g(c8.e eVar, AbstractC4516c json) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.a(eVar.d(), c8.i.f5651b);
    }

    public static final t h(c8.e desc, AbstractC4516c abstractC4516c) {
        kotlin.jvm.internal.h.e(abstractC4516c, "<this>");
        kotlin.jvm.internal.h.e(desc, "desc");
        t8.g d2 = desc.d();
        if (d2 instanceof c8.b) {
            return t.f37750y;
        }
        if (kotlin.jvm.internal.h.a(d2, c8.i.f5652c)) {
            return t.f37748w;
        }
        if (!kotlin.jvm.internal.h.a(d2, c8.i.f5653d)) {
            return t.f37747v;
        }
        c8.e c9 = c(desc.i(0), abstractC4516c.f37540b);
        t8.g d9 = c9.d();
        if ((d9 instanceof c8.d) || kotlin.jvm.internal.h.a(d9, c8.h.f5650c)) {
            return t.f37749x;
        }
        throw new g("Value of type '" + c9.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c9.d() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void i(H h9, Number number) {
        H.m(h9, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String j(byte b9) {
        return b9 == 1 ? "quotation mark '\"'" : b9 == 2 ? "string escape sequence '\\'" : b9 == 4 ? "comma ','" : b9 == 5 ? "colon ':'" : b9 == 6 ? "start of the object '{'" : b9 == 7 ? "end of the object '}'" : b9 == 8 ? "start of the array '['" : b9 == 9 ? "end of the array ']'" : b9 == 10 ? "end of the input" : b9 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}

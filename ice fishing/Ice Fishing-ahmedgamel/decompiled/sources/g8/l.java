package g8;

import D.G;
import f8.AbstractC4526c;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f37744a = new m();

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

    public static final c8.e c(c8.e eVar, G3.e module) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(module, "module");
        return (!kotlin.jvm.internal.h.a(eVar.d(), c8.h.f5825b) && eVar.g()) ? c(eVar.i(0), module) : eVar;
    }

    public static final byte d(char c9) {
        if (c9 < '~') {
            return c.f37736b[c9];
        }
        return (byte) 0;
    }

    public static final void e(G g9, String str) {
        g9.m(g9.f333u - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence f(CharSequence charSequence, int i) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i4 = i - 30;
                int i6 = i + 30;
                String str = i4 <= 0 ? "" : ".....";
                String str2 = i6 >= charSequence.length() ? "" : ".....";
                StringBuilder b9 = AbstractC5050e.b(str);
                if (i4 < 0) {
                    i4 = 0;
                }
                int length = charSequence.length();
                if (i6 > length) {
                    i6 = length;
                }
                b9.append(charSequence.subSequence(i4, i6).toString());
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

    public static final void g(c8.e eVar, AbstractC4526c json) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.a(eVar.d(), c8.i.f5827b);
    }

    public static final t h(c8.e desc, AbstractC4526c abstractC4526c) {
        kotlin.jvm.internal.h.e(abstractC4526c, "<this>");
        kotlin.jvm.internal.h.e(desc, "desc");
        com.bumptech.glide.h d9 = desc.d();
        if (d9 instanceof c8.b) {
            return t.f37776y;
        }
        if (kotlin.jvm.internal.h.a(d9, c8.i.f5828c)) {
            return t.f37774w;
        }
        if (!kotlin.jvm.internal.h.a(d9, c8.i.f5829d)) {
            return t.f37773v;
        }
        c8.e c9 = c(desc.i(0), abstractC4526c.f37502b);
        com.bumptech.glide.h d10 = c9.d();
        if ((d10 instanceof c8.d) || kotlin.jvm.internal.h.a(d10, c8.h.f5826c)) {
            return t.f37775x;
        }
        throw new g("Value of type '" + c9.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c9.d() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void i(G g9, Number number) {
        G.n(g9, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String j(byte b9) {
        return b9 == 1 ? "quotation mark '\"'" : b9 == 2 ? "string escape sequence '\\'" : b9 == 4 ? "comma ','" : b9 == 5 ? "colon ':'" : b9 == 6 ? "start of the object '{'" : b9 == 7 ? "end of the object '}'" : b9 == 8 ? "start of the array '['" : b9 == 9 ? "end of the array ']'" : b9 == 10 ? "end of the input" : b9 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}

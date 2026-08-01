package h6;

import f6.b;
import java.nio.charset.StandardCharsets;
import k6.e;
import u.AbstractC5049e;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4574a {

    /* renamed from: a, reason: collision with root package name */
    public final int f38019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38021c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f38022d;

    /* renamed from: e, reason: collision with root package name */
    public e f38023e;

    public C4574a(int i, String str) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f38019a = i;
        this.f38020b = str;
        this.f38021c = ((AbstractC5049e.d(i) ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static C4574a b(int i, String str) {
        if (str == null) {
            str = "";
        }
        return new C4574a(i, str);
    }

    public static C4574a c(e eVar) {
        int ordinal = eVar.f38685a.ordinal();
        String str = eVar.f38686b;
        switch (ordinal) {
            case 0:
                return b(1, str);
            case 1:
                return b(2, str);
            case 2:
                return b(3, str);
            case 3:
                return b(4, str);
            case 4:
                return b(5, str);
            case 5:
                return b(6, str);
            case 6:
                return b(7, str);
            case 7:
                return b(8, str);
            default:
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f38685a);
        }
    }

    public final e a() {
        e a9;
        String str;
        if (this.f38023e == null) {
            int i = this.f38019a;
            int d2 = AbstractC5049e.d(i);
            String str2 = this.f38020b;
            switch (d2) {
                case 0:
                    a9 = e.a(b.f37516n, str2);
                    break;
                case 1:
                    a9 = e.a(b.f37517u, str2);
                    break;
                case 2:
                    a9 = e.a(b.f37518v, str2);
                    break;
                case 3:
                    a9 = e.a(b.f37519w, str2);
                    break;
                case 4:
                    a9 = e.a(b.f37520x, str2);
                    break;
                case 5:
                    a9 = e.a(b.f37521y, str2);
                    break;
                case 6:
                    a9 = e.a(b.f37522z, str2);
                    break;
                case 7:
                    a9 = e.a(b.f37514A, str2);
                    break;
                case 8:
                    a9 = null;
                    break;
                default:
                    switch (i) {
                        case 1:
                            str = "STRING";
                            break;
                        case 2:
                            str = "BOOLEAN";
                            break;
                        case 3:
                            str = "LONG";
                            break;
                        case 4:
                            str = "DOUBLE";
                            break;
                        case 5:
                            str = "STRING_ARRAY";
                            break;
                        case 6:
                            str = "BOOLEAN_ARRAY";
                            break;
                        case 7:
                            str = "LONG_ARRAY";
                            break;
                        case 8:
                            str = "DOUBLE_ARRAY";
                            break;
                        case 9:
                            str = "EXTENDED_ATTRIBUTES";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalArgumentException("Unrecognized extendedAttributeKey type: ".concat(str));
            }
            this.f38023e = a9;
        }
        return this.f38023e;
    }

    public final byte[] d() {
        byte[] bArr = this.f38022d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f38020b.getBytes(StandardCharsets.UTF_8);
        this.f38022d = bytes;
        return bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4574a)) {
            return false;
        }
        C4574a c4574a = (C4574a) obj;
        return AbstractC5049e.a(this.f38019a, c4574a.f38019a) && this.f38020b.equals(c4574a.f38020b);
    }

    public final int hashCode() {
        return this.f38021c;
    }

    public final String toString() {
        return this.f38020b;
    }
}

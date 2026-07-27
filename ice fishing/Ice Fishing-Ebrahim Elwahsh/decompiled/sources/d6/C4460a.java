package d6;

import b6.b;
import g6.e;
import java.nio.charset.StandardCharsets;
import u.AbstractC5088e;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4460a {

    /* renamed from: a, reason: collision with root package name */
    public final int f37202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37204c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f37205d;

    /* renamed from: e, reason: collision with root package name */
    public e f37206e;

    public C4460a(int i, String str) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f37202a = i;
        this.f37203b = str;
        this.f37204c = ((AbstractC5088e.d(i) ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static C4460a b(int i, String str) {
        if (str == null) {
            str = "";
        }
        return new C4460a(i, str);
    }

    public static C4460a c(e eVar) {
        int ordinal = eVar.f37931a.ordinal();
        String str = eVar.f37932b;
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
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f37931a);
        }
    }

    public final e a() {
        e a9;
        String str;
        if (this.f37206e == null) {
            int i = this.f37202a;
            int d2 = AbstractC5088e.d(i);
            String str2 = this.f37203b;
            switch (d2) {
                case 0:
                    a9 = e.a(b.f5560n, str2);
                    break;
                case 1:
                    a9 = e.a(b.f5561u, str2);
                    break;
                case 2:
                    a9 = e.a(b.f5562v, str2);
                    break;
                case 3:
                    a9 = e.a(b.f5563w, str2);
                    break;
                case 4:
                    a9 = e.a(b.f5564x, str2);
                    break;
                case 5:
                    a9 = e.a(b.f5565y, str2);
                    break;
                case 6:
                    a9 = e.a(b.f5566z, str2);
                    break;
                case 7:
                    a9 = e.a(b.f5558A, str2);
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
            this.f37206e = a9;
        }
        return this.f37206e;
    }

    public final byte[] d() {
        byte[] bArr = this.f37205d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f37203b.getBytes(StandardCharsets.UTF_8);
        this.f37205d = bytes;
        return bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4460a)) {
            return false;
        }
        C4460a c4460a = (C4460a) obj;
        return AbstractC5088e.a(this.f37202a, c4460a.f37202a) && this.f37203b.equals(c4460a.f37203b);
    }

    public final int hashCode() {
        return this.f37204c;
    }

    public final String toString() {
        return this.f37203b;
    }
}

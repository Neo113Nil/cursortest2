package h6;

import f6.b;
import java.nio.charset.StandardCharsets;
import k6.e;
import u.AbstractC5050e;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4579a {

    /* renamed from: a, reason: collision with root package name */
    public final int f38136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38138c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f38139d;

    /* renamed from: e, reason: collision with root package name */
    public e f38140e;

    public C4579a(int i, String str) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f38136a = i;
        this.f38137b = str;
        this.f38138c = ((AbstractC5050e.d(i) ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static C4579a b(int i, String str) {
        if (str == null) {
            str = "";
        }
        return new C4579a(i, str);
    }

    public static C4579a c(e eVar) {
        int ordinal = eVar.f38612a.ordinal();
        String str = eVar.f38613b;
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
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f38612a);
        }
    }

    public final e a() {
        e a9;
        String str;
        if (this.f38140e == null) {
            int i = this.f38136a;
            int d9 = AbstractC5050e.d(i);
            String str2 = this.f38137b;
            switch (d9) {
                case 0:
                    a9 = e.a(b.f37478n, str2);
                    break;
                case 1:
                    a9 = e.a(b.f37479u, str2);
                    break;
                case 2:
                    a9 = e.a(b.f37480v, str2);
                    break;
                case 3:
                    a9 = e.a(b.f37481w, str2);
                    break;
                case 4:
                    a9 = e.a(b.f37482x, str2);
                    break;
                case 5:
                    a9 = e.a(b.f37483y, str2);
                    break;
                case 6:
                    a9 = e.a(b.f37484z, str2);
                    break;
                case 7:
                    a9 = e.a(b.f37476A, str2);
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
            this.f38140e = a9;
        }
        return this.f38140e;
    }

    public final byte[] d() {
        byte[] bArr = this.f38139d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f38137b.getBytes(StandardCharsets.UTF_8);
        this.f38139d = bytes;
        return bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4579a)) {
            return false;
        }
        C4579a c4579a = (C4579a) obj;
        return AbstractC5050e.a(this.f38136a, c4579a.f38136a) && this.f38137b.equals(c4579a.f38137b);
    }

    public final int hashCode() {
        return this.f38138c;
    }

    public final String toString() {
        return this.f38137b;
    }
}

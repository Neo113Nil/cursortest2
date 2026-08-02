package defpackage;

/* loaded from: classes9.dex */
public class uvc {
    public static oe7 a(tls... tlsVarArr) {
        if (tlsVarArr.length > 0) {
            return new oe7(1, tlsVarArr);
        }
        ny61.g("Failed requirement.");
        return null;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}

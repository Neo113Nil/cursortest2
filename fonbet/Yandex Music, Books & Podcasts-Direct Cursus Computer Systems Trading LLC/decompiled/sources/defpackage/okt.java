package defpackage;

/* loaded from: classes3.dex */
public final class okt {
    public static boolean a(Object obj, n8n n8nVar) {
        int k = n8nVar.k();
        int i = k >>> 3;
        int i2 = k & 7;
        if (i2 == 0) {
            ((kkt) obj).c(i << 3, Long.valueOf(n8nVar.W()));
            return true;
        }
        if (i2 == 1) {
            ((kkt) obj).c((i << 3) | 1, Long.valueOf(n8nVar.K()));
            return true;
        }
        if (i2 == 2) {
            ((kkt) obj).c((i << 3) | 2, n8nVar.u());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw aye.b();
            }
            ((kkt) obj).c((i << 3) | 5, Integer.valueOf(n8nVar.H()));
            return true;
        }
        kkt b = kkt.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (n8nVar.h() != Integer.MAX_VALUE && a(b, n8nVar)) {
        }
        if (i4 != n8nVar.k()) {
            throw new aye("Protocol message end-group tag did not match expected tag.");
        }
        b.e = false;
        ((kkt) obj).c(i3 | 3, b);
        return true;
    }
}

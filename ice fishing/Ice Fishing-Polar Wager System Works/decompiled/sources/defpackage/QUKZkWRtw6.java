package defpackage;

/* loaded from: classes.dex */
public final class QUKZkWRtw6 extends defpackage.wKlPRKlRnfqr {
    public static defpackage.QUKZkWRtw6 r1MBDhnF;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.wKlPRKlRnfqr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] F7NU4MC0GW(int i) {
        int length = r1MBDhnF().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && r1MBDhnF().charAt(i - 1) == '\n' && !adDC3e2L(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (r1MBDhnF().charAt(i2) == '\n' || (i2 != 0 && r1MBDhnF().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return oh6vYeIP(i2, i);
    }

    @Override // defpackage.wKlPRKlRnfqr
    public final int[] IHQe1A4L2xu(int i) {
        int length = r1MBDhnF().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && r1MBDhnF().charAt(i) == '\n' && (r1MBDhnF().charAt(i) == '\n' || (i != 0 && r1MBDhnF().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !adDC3e2L(i2)) {
            i2++;
        }
        return oh6vYeIP(i, i2);
    }

    public final boolean adDC3e2L(int i) {
        if (i <= 0 || r1MBDhnF().charAt(i - 1) == '\n') {
            return false;
        }
        return i == r1MBDhnF().length() || r1MBDhnF().charAt(i) == '\n';
    }
}

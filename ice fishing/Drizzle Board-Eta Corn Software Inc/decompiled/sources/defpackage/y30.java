package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y30 {
    public Object NCTxEWno;
    public final boolean qoPGr6Ce;

    public y30(mt mtVar) {
        this.qoPGr6Ce = true;
        this.NCTxEWno = mtVar;
    }

    public boolean NCTxEWno(CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((re) this.NCTxEWno) == null) {
            return qoPGr6Ce();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            y30 y30Var = cc0.qoPGr6Ce;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return qoPGr6Ce();
        }
        return false;
    }

    public boolean qoPGr6Ce() {
        return this.qoPGr6Ce;
    }

    public y30(String str, boolean z) {
        this.qoPGr6Ce = z;
        this.NCTxEWno = str;
    }

    public y30(re reVar, boolean z) {
        this.NCTxEWno = reVar;
        this.qoPGr6Ce = z;
    }
}

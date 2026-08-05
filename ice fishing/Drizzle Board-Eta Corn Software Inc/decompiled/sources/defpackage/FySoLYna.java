package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class FySoLYna extends ra {
    @Override // defpackage.ra
    public final boolean Qr9iLBAD(WYNAV5pd wYNAV5pd, I5GHvsYW i5GHvsYW) {
        I5GHvsYW i5GHvsYW2 = I5GHvsYW.NCTxEWno;
        synchronized (wYNAV5pd) {
            try {
                if (wYNAV5pd.MdtA4re8 != i5GHvsYW) {
                    return false;
                }
                wYNAV5pd.MdtA4re8 = i5GHvsYW2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ra
    public final void U0LaHZX7(gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12) {
        gjv1z5t1.NCTxEWno = gjv1z5t12;
    }

    @Override // defpackage.ra
    public final boolean eVhOlqcC(WYNAV5pd wYNAV5pd, gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12) {
        synchronized (wYNAV5pd) {
            try {
                if (wYNAV5pd.wxUZMvaN != gjv1z5t1) {
                    return false;
                }
                wYNAV5pd.wxUZMvaN = gjv1z5t12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ra
    public final void i7xS8jrb(gjV1z5T1 gjv1z5t1, Thread thread) {
        gjv1z5t1.qoPGr6Ce = thread;
    }

    @Override // defpackage.ra
    public final boolean jb9XjC4I(WYNAV5pd wYNAV5pd, Object obj, Object obj2) {
        synchronized (wYNAV5pd) {
            try {
                if (wYNAV5pd.NCTxEWno != obj) {
                    return false;
                }
                wYNAV5pd.NCTxEWno = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

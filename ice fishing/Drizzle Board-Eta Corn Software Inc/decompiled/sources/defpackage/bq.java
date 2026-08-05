package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class bq {
    public boolean MdtA4re8;
    public final pw NCTxEWno;
    public final /* synthetic */ nt VgvYg0wo;
    public int wxUZMvaN = -1;

    public bq(nt ntVar, pw pwVar) {
        this.VgvYg0wo = ntVar;
        this.NCTxEWno = pwVar;
    }

    public boolean MdtA4re8(vo voVar) {
        return false;
    }

    public final void qoPGr6Ce(boolean z) {
        if (z == this.MdtA4re8) {
            return;
        }
        this.MdtA4re8 = z;
        int i = z ? 1 : -1;
        nt ntVar = this.VgvYg0wo;
        int i2 = ntVar.MdtA4re8;
        ntVar.MdtA4re8 = i + i2;
        if (!ntVar.wxUZMvaN) {
            ntVar.wxUZMvaN = true;
            while (true) {
                try {
                    int i3 = ntVar.MdtA4re8;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    ntVar.wxUZMvaN = false;
                }
            }
        }
        if (this.MdtA4re8) {
            ntVar.MdtA4re8(this);
        }
    }

    public abstract boolean wxUZMvaN();

    public void NCTxEWno() {
    }
}

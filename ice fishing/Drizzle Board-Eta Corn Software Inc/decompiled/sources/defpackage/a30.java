package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a30 implements Runnable {
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno = 0;
    public Object VgvYg0wo;
    public Object wxUZMvaN;

    public a30(m3 m3Var, v30 v30Var, y7 y7Var) {
        this.MdtA4re8 = m3Var;
        this.wxUZMvaN = v30Var;
        this.VgvYg0wo = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.NCTxEWno) {
            case 0:
                try {
                    obj = ((wh) this.MdtA4re8).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.VgvYg0wo).post(new XrPeKzBk((xh) this.wxUZMvaN, obj, 8, false));
                break;
            default:
                m3 m3Var = (m3) this.MdtA4re8;
                try {
                    ra.pRiPUEwG(m3Var.P7K7Inc8.lDXGDhIF(re.MdtA4re8), new jh((v30) this.wxUZMvaN, m3Var, (y7) this.VgvYg0wo, (g9) null, 3));
                    break;
                } catch (Throwable th) {
                    m3Var.OxcuoDLp(th);
                }
        }
    }

    public /* synthetic */ a30() {
    }
}

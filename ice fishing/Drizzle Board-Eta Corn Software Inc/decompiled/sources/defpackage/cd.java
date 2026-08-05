package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class cd extends ob0 {
    public int wxUZMvaN;

    public cd(int i) {
        super(0L, false);
        this.wxUZMvaN = i;
    }

    public abstract g9 VgvYg0wo();

    public Throwable b2ZJblxo(Object obj) {
        c7 c7Var = obj instanceof c7 ? (c7) obj : null;
        if (c7Var != null) {
            return c7Var.qoPGr6Ce;
        }
        return null;
    }

    public final void eVhOlqcC(Throwable th) {
        ej0.gjV1z5T1(VgvYg0wo().wxUZMvaN(), new x9("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object ow5vqvCr();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.vn) r5.OnDfzHZD(defpackage.re.VgvYg0wo);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            g9 VgvYg0wo = VgvYg0wo();
            VgvYg0wo.getClass();
            ad adVar = (ad) VgvYg0wo;
            h9 h9Var = adVar.P7K7Inc8;
            Object obj = adVar.Qr9iLBAD;
            l9 wxUZMvaN = h9Var.wxUZMvaN();
            Object gmkaJpmS = w30.gmkaJpmS(wxUZMvaN, obj);
            vn vnVar = null;
            we0 TrssYQ34 = gmkaJpmS != w30.eVhOlqcC ? w30.TrssYQ34(h9Var, wxUZMvaN, gmkaJpmS) : null;
            try {
                l9 wxUZMvaN2 = h9Var.wxUZMvaN();
                Object ow5vqvCr = ow5vqvCr();
                Throwable b2ZJblxo = b2ZJblxo(ow5vqvCr);
                if (b2ZJblxo == null) {
                    int i = this.wxUZMvaN;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (vnVar != null && !vnVar.VhgXwMj9()) {
                    CancellationException DK9slbsy = vnVar.DK9slbsy();
                    NCTxEWno(DK9slbsy);
                    h9Var.P7K7Inc8(new k30(DK9slbsy));
                } else if (b2ZJblxo != null) {
                    h9Var.P7K7Inc8(new k30(b2ZJblxo));
                } else {
                    h9Var.P7K7Inc8(Qr9iLBAD(ow5vqvCr));
                }
                if (TrssYQ34 != null && !TrssYQ34.VGmz0ccI()) {
                    return;
                }
                w30.FXJmAAN1(wxUZMvaN, gmkaJpmS);
            } catch (Throwable th) {
                if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                    w30.FXJmAAN1(wxUZMvaN, gmkaJpmS);
                }
                throw th;
            }
        } catch (Throwable th2) {
            eVhOlqcC(th2);
        }
    }

    public void NCTxEWno(CancellationException cancellationException) {
    }

    public Object Qr9iLBAD(Object obj) {
        return obj;
    }
}

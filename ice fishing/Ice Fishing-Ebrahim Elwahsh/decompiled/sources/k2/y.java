package k2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4287ze;
import q2.G0;
import q2.K;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38745n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4641l f38746u;

    public /* synthetic */ y(AbstractC4641l abstractC4641l, int i) {
        this.f38745n = i;
        this.f38746u = abstractC4641l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38745n) {
            case 0:
                AbstractC4641l abstractC4641l = this.f38746u;
                try {
                    G0 g02 = abstractC4641l.f38724n;
                    g02.getClass();
                    try {
                        K k6 = g02.i;
                        if (k6 != null) {
                            k6.f();
                            break;
                        }
                    } catch (RemoteException e6) {
                        u2.i.i("#007 Could not call remote method.", e6);
                        return;
                    }
                } catch (IllegalStateException e9) {
                    C4287ze.a(abstractC4641l.getContext()).e("BaseAdView.pause", e9);
                    return;
                }
                break;
            case 1:
                AbstractC4641l abstractC4641l2 = this.f38746u;
                try {
                    G0 g03 = abstractC4641l2.f38724n;
                    g03.getClass();
                    try {
                        K k9 = g03.i;
                        if (k9 != null) {
                            k9.e();
                        }
                    } catch (RemoteException e10) {
                        u2.i.i("#007 Could not call remote method.", e10);
                    }
                    break;
                } catch (IllegalStateException e11) {
                    C4287ze.a(abstractC4641l2.getContext()).e("BaseAdView.resume", e11);
                    return;
                }
            default:
                AbstractC4641l abstractC4641l3 = this.f38746u;
                try {
                    G0 g04 = abstractC4641l3.f38724n;
                    g04.getClass();
                    try {
                        K k10 = g04.i;
                        if (k10 != null) {
                            k10.x();
                            break;
                        }
                    } catch (RemoteException e12) {
                        u2.i.i("#007 Could not call remote method.", e12);
                        return;
                    }
                } catch (IllegalStateException e13) {
                    C4287ze.a(abstractC4641l3.getContext()).e("BaseAdView.destroy", e13);
                }
                break;
        }
    }
}

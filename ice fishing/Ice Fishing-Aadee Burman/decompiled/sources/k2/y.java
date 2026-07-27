package k2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2501Ce;
import q2.G0;
import q2.K;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38625n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f38626u;

    public /* synthetic */ y(l lVar, int i) {
        this.f38625n = i;
        this.f38626u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38625n) {
            case 0:
                l lVar = this.f38626u;
                try {
                    G0 g02 = lVar.f38604n;
                    g02.getClass();
                    try {
                        K k9 = g02.i;
                        if (k9 != null) {
                            k9.d();
                            break;
                        }
                    } catch (RemoteException e9) {
                        v2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                } catch (IllegalStateException e10) {
                    C2501Ce.a(lVar.getContext()).e("BaseAdView.pause", e10);
                    return;
                }
                break;
            case 1:
                l lVar2 = this.f38626u;
                try {
                    G0 g03 = lVar2.f38604n;
                    g03.getClass();
                    try {
                        K k10 = g03.i;
                        if (k10 != null) {
                            k10.e();
                        }
                    } catch (RemoteException e11) {
                        v2.i.i("#007 Could not call remote method.", e11);
                    }
                    break;
                } catch (IllegalStateException e12) {
                    C2501Ce.a(lVar2.getContext()).e("BaseAdView.resume", e12);
                    return;
                }
            default:
                l lVar3 = this.f38626u;
                try {
                    G0 g04 = lVar3.f38604n;
                    g04.getClass();
                    try {
                        K k11 = g04.i;
                        if (k11 != null) {
                            k11.A();
                            break;
                        }
                    } catch (RemoteException e13) {
                        v2.i.i("#007 Could not call remote method.", e13);
                        return;
                    }
                } catch (IllegalStateException e14) {
                    C2501Ce.a(lVar3.getContext()).e("BaseAdView.destroy", e14);
                }
                break;
        }
    }
}

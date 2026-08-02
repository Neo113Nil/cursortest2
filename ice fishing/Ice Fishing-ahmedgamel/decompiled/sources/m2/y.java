package m2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2521Ce;
import s2.G0;
import s2.K;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39414n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f39415u;

    public /* synthetic */ y(l lVar, int i) {
        this.f39414n = i;
        this.f39415u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39414n) {
            case 0:
                l lVar = this.f39415u;
                try {
                    G0 g02 = lVar.f39393n;
                    g02.getClass();
                    try {
                        K k9 = g02.i;
                        if (k9 != null) {
                            k9.d();
                            break;
                        }
                    } catch (RemoteException e9) {
                        x2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                } catch (IllegalStateException e10) {
                    C2521Ce.a(lVar.getContext()).e("BaseAdView.pause", e10);
                    return;
                }
                break;
            case 1:
                l lVar2 = this.f39415u;
                try {
                    G0 g03 = lVar2.f39393n;
                    g03.getClass();
                    try {
                        K k10 = g03.i;
                        if (k10 != null) {
                            k10.e();
                        }
                    } catch (RemoteException e11) {
                        x2.i.i("#007 Could not call remote method.", e11);
                    }
                    break;
                } catch (IllegalStateException e12) {
                    C2521Ce.a(lVar2.getContext()).e("BaseAdView.resume", e12);
                    return;
                }
            default:
                l lVar3 = this.f39415u;
                try {
                    G0 g04 = lVar3.f39393n;
                    g04.getClass();
                    try {
                        K k11 = g04.i;
                        if (k11 != null) {
                            k11.A();
                            break;
                        }
                    } catch (RemoteException e13) {
                        x2.i.i("#007 Could not call remote method.", e13);
                        return;
                    }
                } catch (IllegalStateException e14) {
                    C2521Ce.a(lVar3.getContext()).e("BaseAdView.destroy", e14);
                }
                break;
        }
    }
}

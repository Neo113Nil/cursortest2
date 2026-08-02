package Y0;

import R2.w;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import m2.C4741a;
import y2.AbstractC5206b;

/* loaded from: classes.dex */
public final class g extends m2.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3834c;

    public g(AbstractAdViewAdapter abstractAdViewAdapter, z2.j jVar) {
        this.f3833b = 2;
        this.f3834c = jVar;
    }

    @Override // m2.m
    public final void onAdDismissedFullScreenContent() {
        switch (this.f3833b) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p pVar = ((h) this.f3834c).f3837g;
                p.f();
                break;
            case 1:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                ((h) this.f3834c).f3837g.getClass();
                p.f();
                break;
            default:
                C4297ze c4297ze = (C4297ze) ((z2.j) this.f3834c);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                x2.i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).e();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                }
        }
    }

    @Override // m2.m
    public void onAdFailedToShowFullScreenContent(C4741a c4741a) {
        switch (this.f3833b) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                h hVar = (h) this.f3834c;
                o oVar = hVar.f3838h;
                p.f();
                if (p.f3878g == 1) {
                    p.g(hVar.f3836f);
                    break;
                }
                break;
            case 1:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                h hVar2 = (h) this.f3834c;
                o oVar2 = hVar2.f3838h;
                hVar2.f3837g.getClass();
                p.f();
                if (p.f3878g == 1) {
                    p.g(hVar2.f3836f);
                    break;
                }
                break;
        }
    }

    @Override // m2.m
    public final void onAdShowedFullScreenContent() {
        switch (this.f3833b) {
            case 0:
                ((h) this.f3834c).f3837g.f3899c = null;
                break;
            case 1:
                ((h) this.f3834c).f3837g.f3899c = null;
                break;
            default:
                C4297ze c4297ze = (C4297ze) ((z2.j) this.f3834c);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                x2.i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).n();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                }
        }
    }

    public /* synthetic */ g(AbstractC5206b abstractC5206b, int i) {
        this.f3833b = i;
        this.f3834c = abstractC5206b;
    }
}

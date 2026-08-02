package Y0;

import R2.w;
import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import com.google.android.gms.internal.ads.Qx;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes.dex */
public final class b extends m2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3826n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3827u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3828v;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f3826n = i;
        this.f3827u = obj;
        this.f3828v = obj2;
    }

    @Override // m2.c
    public void onAdClicked() {
        switch (this.f3826n) {
            case 1:
                C4297ze c4297ze = (C4297ze) ((z2.l) this.f3828v);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                com.google.ads.mediation.a aVar = (com.google.ads.mediation.a) c4297ze.f36134v;
                if (((Qx) c4297ze.f36135w) == null) {
                    if (aVar != null) {
                        if (!aVar.f24327n) {
                            x2.i.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        x2.i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                x2.i.a("Adapter called onAdClicked.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).d();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
        }
    }

    @Override // m2.c
    public void onAdClosed() {
        switch (this.f3826n) {
            case 1:
                C4297ze c4297ze = (C4297ze) ((z2.l) this.f3828v);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                x2.i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).e();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // m2.c
    public final void onAdFailedToLoad(m2.n nVar) {
        switch (this.f3826n) {
            case 0:
                if (p.f3878g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f3827u);
                    ViewGroup viewGroup = (ViewGroup) this.f3828v;
                    View inflate = from.inflate(C5248R.layout.qureka_native, viewGroup, false);
                    p.d(inflate.findViewById(C5248R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.gif1);
                    TextView textView = (TextView) inflate.findViewById(C5248R.id.native_ad_title);
                    TextView textView2 = (TextView) inflate.findViewById(C5248R.id.desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(p.f3872S[nextInt]);
                    textView2.setText(p.f3873T[nextInt]);
                    gifImageView.setBackgroundResource(p.f3874U[nextInt]);
                    inflate.findViewById(C5248R.id.nativeclick).setOnClickListener(new N3.n(1, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    break;
                }
                break;
            default:
                ((C4297ze) ((z2.l) this.f3828v)).i(nVar);
                break;
        }
    }

    @Override // m2.c
    public void onAdImpression() {
        switch (this.f3826n) {
            case 1:
                C4297ze c4297ze = (C4297ze) ((z2.l) this.f3828v);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                com.google.ads.mediation.a aVar = (com.google.ads.mediation.a) c4297ze.f36134v;
                if (((Qx) c4297ze.f36135w) == null) {
                    if (aVar != null) {
                        if (!aVar.f24326m) {
                            x2.i.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        x2.i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                x2.i.a("Adapter called onAdImpression.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).k();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
        }
    }

    @Override // m2.c
    public void onAdLoaded() {
        switch (this.f3826n) {
            case 1:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // m2.c
    public void onAdOpened() {
        switch (this.f3826n) {
            case 1:
                C4297ze c4297ze = (C4297ze) ((z2.l) this.f3828v);
                c4297ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                x2.i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3864rd) c4297ze.f36133u).n();
                    break;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
            default:
                super.onAdOpened();
                break;
        }
    }

    private final void a() {
    }
}

package Y0;

import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.BinderC2918Zo;
import java.util.Objects;
import java.util.Random;
import m2.v;
import pl.droidsonroids.gif.GifImageView;
import s2.A0;
import s2.G0;
import s2.K;

/* loaded from: classes.dex */
public final class m extends m2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3848n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3849u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3850v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3851w;

    public m(ViewGroup viewGroup, m2.j jVar, Context context) {
        this.f3849u = viewGroup;
        this.f3850v = jVar;
        this.f3851w = context;
    }

    @Override // m2.c
    public void onAdClicked() {
        switch (this.f3848n) {
            case 2:
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdClicked();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // m2.c
    public void onAdClosed() {
        switch (this.f3848n) {
            case 2:
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdClosed();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onAdClosed();
                return;
        }
    }

    @Override // m2.c
    public final void onAdFailedToLoad(m2.n nVar) {
        switch (this.f3848n) {
            case 0:
                if (p.f3878g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f3851w);
                    ViewGroup viewGroup = (ViewGroup) this.f3849u;
                    View inflate = from.inflate(C5248R.layout.qureka_nativebanner_layout, viewGroup, false);
                    p.d(inflate.findViewById(C5248R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.iv_round_gif);
                    TextView textView = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_name);
                    TextView textView2 = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(p.f3869P[nextInt]);
                    textView2.setText(p.f3870Q[nextInt]);
                    gifImageView.setImageResource(p.f3871R[nextInt]);
                    inflate.findViewById(C5248R.id.bannerclick).setOnClickListener(new N3.n(4, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    return;
                }
                return;
            case 1:
                ((BinderC2918Zo) this.f3851w).V3(BinderC2918Zo.Y3(nVar));
                return;
            default:
                G0 g02 = (G0) this.f3851w;
                v vVar = g02.f40338c;
                K k9 = g02.i;
                A0 a02 = null;
                if (k9 != null) {
                    try {
                        a02 = k9.V();
                    } catch (RemoteException e9) {
                        x2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                vVar.b(a02);
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdFailedToLoad(nVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // m2.c
    public void onAdImpression() {
        switch (this.f3848n) {
            case 2:
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdImpression();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // m2.c
    public final void onAdLoaded() {
        switch (this.f3848n) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f3849u;
                viewGroup.removeAllViews();
                viewGroup.addView((m2.j) this.f3850v);
                return;
            case 1:
                String str = (String) this.f3849u;
                ((BinderC2918Zo) this.f3851w).U3((m2.l) this.f3850v, str);
                return;
            default:
                G0 g02 = (G0) this.f3851w;
                v vVar = g02.f40338c;
                K k9 = g02.i;
                A0 a02 = null;
                if (k9 != null) {
                    try {
                        a02 = k9.V();
                    } catch (RemoteException e9) {
                        x2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                vVar.b(a02);
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdLoaded();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // m2.c
    public void onAdOpened() {
        switch (this.f3848n) {
            case 2:
                synchronized (this.f3849u) {
                    try {
                        m2.c cVar = (m2.c) this.f3850v;
                        if (cVar != null) {
                            cVar.onAdOpened();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onAdOpened();
                return;
        }
    }

    public m(BinderC2918Zo binderC2918Zo, String str, m2.l lVar) {
        this.f3849u = str;
        this.f3850v = lVar;
        Objects.requireNonNull(binderC2918Zo);
        this.f3851w = binderC2918Zo;
    }

    public m(G0 g02) {
        Objects.requireNonNull(g02);
        this.f3851w = g02;
        this.f3849u = new Object();
    }
}

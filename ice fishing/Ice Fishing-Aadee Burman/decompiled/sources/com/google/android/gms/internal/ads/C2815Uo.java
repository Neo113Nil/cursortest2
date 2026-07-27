package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Objects;
import java.util.Random;
import o4.C4799l;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2815Uo extends k2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27980n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27981u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27982v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27983w;

    public C2815Uo(ViewGroup viewGroup, k2.j jVar, Context context) {
        this.f27981u = viewGroup;
        this.f27982v = jVar;
        this.f27983w = context;
    }

    @Override // k2.c
    public void onAdClicked() {
        switch (this.f27980n) {
            case 2:
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    @Override // k2.c
    public void onAdClosed() {
        switch (this.f27980n) {
            case 2:
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    @Override // k2.c
    public final void onAdFailedToLoad(k2.n nVar) {
        switch (this.f27980n) {
            case 0:
                ((BinderC2895Zo) this.f27983w).V3(BinderC2895Zo.Y3(nVar));
                return;
            case 1:
                if (C4799l.f39612g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f27983w);
                    ViewGroup viewGroup = (ViewGroup) this.f27981u;
                    View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
                    C4799l.d(inflate.findViewById(C5275R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
                    TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
                    TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(C4799l.f39603P[nextInt]);
                    textView2.setText(C4799l.f39604Q[nextInt]);
                    gifImageView.setImageResource(C4799l.f39605R[nextInt]);
                    inflate.findViewById(C5275R.id.bannerclick).setOnClickListener(new L3.q(10, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    return;
                }
                return;
            default:
                q2.G0 g02 = (q2.G0) this.f27983w;
                k2.v vVar = g02.f40036c;
                q2.K k9 = g02.i;
                q2.A0 a02 = null;
                if (k9 != null) {
                    try {
                        a02 = k9.V();
                    } catch (RemoteException e9) {
                        v2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                vVar.b(a02);
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    @Override // k2.c
    public void onAdImpression() {
        switch (this.f27980n) {
            case 2:
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    @Override // k2.c
    public final void onAdLoaded() {
        switch (this.f27980n) {
            case 0:
                String str = (String) this.f27981u;
                ((BinderC2895Zo) this.f27983w).U3((k2.l) this.f27982v, str);
                return;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f27981u;
                viewGroup.removeAllViews();
                viewGroup.addView((k2.j) this.f27982v);
                return;
            default:
                q2.G0 g02 = (q2.G0) this.f27983w;
                k2.v vVar = g02.f40036c;
                q2.K k9 = g02.i;
                q2.A0 a02 = null;
                if (k9 != null) {
                    try {
                        a02 = k9.V();
                    } catch (RemoteException e9) {
                        v2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                vVar.b(a02);
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    @Override // k2.c
    public void onAdOpened() {
        switch (this.f27980n) {
            case 2:
                synchronized (this.f27981u) {
                    try {
                        k2.c cVar = (k2.c) this.f27982v;
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

    public C2815Uo(BinderC2895Zo binderC2895Zo, String str, k2.l lVar) {
        this.f27981u = str;
        this.f27982v = lVar;
        Objects.requireNonNull(binderC2895Zo);
        this.f27983w = binderC2895Zo;
    }

    public C2815Uo(q2.G0 g02) {
        Objects.requireNonNull(g02);
        this.f27983w = g02;
        this.f27981u = new Object();
    }
}

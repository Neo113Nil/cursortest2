package com.google.ads.mediation;

import L3.q;
import P2.w;
import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import com.google.android.gms.internal.ads.Qx;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.Random;
import k2.n;
import pl.droidsonroids.gif.GifImageView;
import v2.i;
import x2.m;

/* loaded from: classes.dex */
public final class e extends k2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23548n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23549u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f23550v;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f23548n = i;
        this.f23549u = obj;
        this.f23550v = obj2;
    }

    @Override // k2.c
    public void onAdClicked() {
        switch (this.f23548n) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((m) this.f23550v);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                a aVar = (a) c4274ze.f35361v;
                if (((Qx) c4274ze.f35362w) == null) {
                    if (aVar != null) {
                        if (!aVar.f23542n) {
                            i.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.a("Adapter called onAdClicked.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).d();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
        }
    }

    @Override // k2.c
    public void onAdClosed() {
        switch (this.f23548n) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((m) this.f23550v);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).e();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // k2.c
    public final void onAdFailedToLoad(n nVar) {
        switch (this.f23548n) {
            case 0:
                ((C4274ze) ((m) this.f23550v)).i(nVar);
                break;
            default:
                if (o4.m.f39615g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f23549u);
                    ViewGroup viewGroup = (ViewGroup) this.f23550v;
                    View inflate = from.inflate(C5275R.layout.qureka_native, viewGroup, false);
                    o4.m.d(inflate.findViewById(C5275R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.gif1);
                    TextView textView = (TextView) inflate.findViewById(C5275R.id.native_ad_title);
                    TextView textView2 = (TextView) inflate.findViewById(C5275R.id.desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(o4.m.f39609S[nextInt]);
                    textView2.setText(o4.m.f39610T[nextInt]);
                    gifImageView.setBackgroundResource(o4.m.f39611U[nextInt]);
                    inflate.findViewById(C5275R.id.nativeclick).setOnClickListener(new q(7, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    break;
                }
                break;
        }
    }

    @Override // k2.c
    public void onAdImpression() {
        switch (this.f23548n) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((m) this.f23550v);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                a aVar = (a) c4274ze.f35361v;
                if (((Qx) c4274ze.f35362w) == null) {
                    if (aVar != null) {
                        if (!aVar.f23541m) {
                            i.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.a("Adapter called onAdImpression.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).k();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
        }
    }

    @Override // k2.c
    public void onAdLoaded() {
        switch (this.f23548n) {
            case 0:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // k2.c
    public void onAdOpened() {
        switch (this.f23548n) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((m) this.f23550v);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).n();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
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

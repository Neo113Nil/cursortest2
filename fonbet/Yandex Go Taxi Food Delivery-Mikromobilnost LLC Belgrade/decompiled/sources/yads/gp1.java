package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import defpackage.aj81;
import defpackage.cr71;
import defpackage.d881;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.hj81;
import defpackage.jl40;
import defpackage.jy31;
import defpackage.kgx;
import defpackage.o771;
import defpackage.r581;
import defpackage.sp81;
import defpackage.w511;
import defpackage.z581;
import defpackage.zg71;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class gp1 extends MediatedRewardedAdapter {
    public final MediatedInterstitialAdapter a;
    public final d881 b;
    public final vp2 c;
    public final Handler d;
    public MediatedRewardedAdapterListener e;
    public final AtomicBoolean f;
    public final o771 g;

    public gp1(MediatedInterstitialAdapter mediatedInterstitialAdapter, d881 d881Var, vp2 vp2Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = mediatedInterstitialAdapter;
        this.b = d881Var;
        this.c = vp2Var;
        this.d = handler;
        this.f = new AtomicBoolean(false);
        this.g = new o771();
    }

    public final void a() {
        Map f;
        MediatedAdapterInfo a;
        if (this.f.compareAndSet(false, true)) {
            gv gvVar = this.b.p.c;
            if (gvVar != null) {
                new MediatedReward(gvVar.b, gvVar.c);
            }
            MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.e;
            if (mediatedRewardedAdapterListener != null) {
                zg71 zg71Var = (zg71) mediatedRewardedAdapterListener;
                r581 r581Var = zg71Var.b;
                kgx kgxVar = zg71.c[0];
                hj81 hj81Var = (hj81) r581Var.a.get();
                if (hj81Var != null) {
                    Context context = hj81Var.a;
                    d881 d881Var = hj81Var.b;
                    aj81 aj81Var = zg71Var.a;
                    cr71 cr71Var = aj81Var.h;
                    zp1 zp1Var = cr71Var != null ? (zp1) cr71Var.c : null;
                    if (zp1Var != null) {
                        z581 z581Var = aj81Var.d;
                        String networkName = (cr71Var == null || (a = ((sp81) cr71Var.w).a()) == null) ? null : a.getNetworkName();
                        z581Var.f.getClass();
                        Boolean valueOf = d881Var != null ? Boolean.valueOf(d881Var.p.b) : null;
                        if (jl40.l(valueOf, Boolean.TRUE)) {
                            f = g8e.z("rewarding_side", "server_side");
                        } else if (jl40.l(valueOf, Boolean.FALSE)) {
                            f = g8e.z("rewarding_side", "client_side");
                        } else {
                            if (valueOf != null) {
                                w511.b();
                                return;
                            }
                            f = b.f();
                        }
                        z581Var.a(context, hm2.w, zp1Var, networkName, gw00.e(new Pair("reward_info", f)));
                    }
                    hj81Var.c();
                }
            }
        }
    }

    public final void b() {
        Handler handler = this.d;
        jy31 jy31Var = new jy31(23, this);
        Long l = this.c.b;
        handler.postDelayed(jy31Var, (l != null ? l.longValue() : 5L) * 1000);
    }

    public final boolean isLoaded() {
        return this.a.isLoaded();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final void loadRewardedAd(Context context, MediatedRewardedAdapterListener mediatedRewardedAdapterListener, Map map, Map map2) {
        this.e = mediatedRewardedAdapterListener;
        this.a.loadInterstitial(context, this.g, map, map2);
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final void onInvalidate() {
        this.d.removeCallbacksAndMessages(null);
        this.a.onInvalidate();
        this.e = null;
    }

    public final void showRewardedAd(Activity activity) {
        this.a.showInterstitial(activity);
    }

    public static final void a(gp1 gp1Var) {
        gp1Var.a();
    }
}

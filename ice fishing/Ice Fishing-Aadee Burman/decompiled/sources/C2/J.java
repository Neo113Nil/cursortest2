package C2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2635Kc;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3897sf;
import com.google.android.gms.internal.ads.C4167xf;
import com.google.android.gms.internal.ads.C4274ze;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.UUID;
import l.C4648e;
import l.C4649f;
import l.ViewOnKeyListenerC4650g;
import l2.C4658b;
import m2.AbstractC4730a;
import w2.AbstractC5149b;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f281n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f282u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f283v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f284w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f285x;

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f281n = i;
        this.f282u = obj;
        this.f283v = obj2;
        this.f284w = obj3;
        this.f285x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S0.p h9;
        switch (this.f281n) {
            case 0:
                K k9 = (K) this.f282u;
                C2993bo c2993bo = (C2993bo) this.f283v;
                k9.d(c2993bo, (ArrayDeque) this.f284w, "to");
                k9.d(c2993bo, (ArrayDeque) this.f285x, "of");
                return;
            case 1:
                new C4274ze(0, (Context) this.f282u, (k2.b) this.f283v, ((k2.g) this.f284w).f38584a).n((F2.b) this.f285x);
                return;
            case 2:
                G2.d dVar = (G2.d) this.f285x;
                C4658b c4658b = (C4658b) this.f284w;
                Context context = (Context) this.f282u;
                try {
                    new C3897sf(context, (String) this.f283v).e(c4658b.f38584a, dVar);
                    return;
                } catch (IllegalStateException e9) {
                    C2501Ce.a(context).e("RewardedAd.loadAdManager", e9);
                    return;
                }
            case 3:
                G2.d dVar2 = (G2.d) this.f285x;
                k2.g gVar = (k2.g) this.f284w;
                Context context2 = (Context) this.f282u;
                try {
                    new C3897sf(context2, (String) this.f283v).e(gVar.f38584a, dVar2);
                    return;
                } catch (IllegalStateException e10) {
                    C2501Ce.a(context2).e("RewardedAd.load", e10);
                    return;
                }
            case 4:
                H2.b bVar = (H2.b) this.f285x;
                k2.g gVar2 = (k2.g) this.f284w;
                Context context3 = (Context) this.f282u;
                try {
                    new C4167xf(context3, (String) this.f283v).c(gVar2.f38584a, bVar);
                    return;
                } catch (IllegalStateException e11) {
                    C2501Ce.a(context3).e("RewardedInterstitialAd.load", e11);
                    return;
                }
            case 5:
                ((Activity) this.f282u).startActivityForResult(t8.g.I((String) this.f283v, (String) this.f284w, (HashMap) this.f285x), 0);
                return;
            case 6:
                String str = (String) this.f283v;
                String str2 = (String) this.f284w;
                Bundle bundle = (Bundle) this.f285x;
                L3.g gVar3 = (L3.g) this.f282u;
                gVar3.getClass();
                try {
                    K3.g gVar4 = (K3.g) gVar3.f1693b.f1751k;
                    if (gVar4 == null) {
                        return;
                    }
                    ((K3.e) gVar4).t1(gVar3.f1692a.getPackageName(), str, str2, bundle, gVar3.f1695d);
                    return;
                } catch (DeadObjectException e12) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e12);
                    return;
                } catch (RemoteException e13) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.show", e13);
                    return;
                }
            case 7:
                U0.k kVar = (U0.k) this.f284w;
                UUID uuid = (UUID) this.f282u;
                String uuid2 = uuid.toString();
                J0.s d2 = J0.s.d();
                String str3 = T0.r.f3065c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                J0.h hVar = (J0.h) this.f283v;
                sb.append(hVar);
                sb.append(")");
                d2.a(str3, sb.toString());
                T0.r rVar = (T0.r) this.f285x;
                WorkDatabase workDatabase = rVar.f3066a;
                WorkDatabase workDatabase2 = rVar.f3066a;
                workDatabase.c();
                try {
                    h9 = workDatabase2.t().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h9 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h9.f2809b == 2) {
                    S0.m mVar = new S0.m(uuid2, hVar);
                    S0.n s9 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s9.f2802u;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((S0.b) s9.f2803v).q(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    J0.s.d().g(str3, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                kVar.j(null);
                workDatabase2.o();
                return;
            case 8:
                C4649f c4649f = (C4649f) this.f282u;
                if (c4649f != null) {
                    C4648e c4648e = (C4648e) this.f285x;
                    ((ViewOnKeyListenerC4650g) c4648e.f38761u).f38782S = true;
                    c4649f.f38763b.c(false);
                    ((ViewOnKeyListenerC4650g) c4648e.f38761u).f38782S = false;
                }
                l.o oVar = (l.o) this.f283v;
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((l.m) this.f284w).q(oVar, null, 4);
                    return;
                }
                return;
            case 9:
                AbstractC4730a abstractC4730a = (AbstractC4730a) this.f285x;
                k2.g gVar5 = (k2.g) this.f284w;
                Context context4 = (Context) this.f282u;
                try {
                    new C3(context4, (String) this.f283v, gVar5.f38584a, abstractC4730a).b();
                    return;
                } catch (IllegalStateException e14) {
                    C2501Ce.a(context4).e("AppOpenAd.load", e14);
                    return;
                }
            default:
                AbstractC5149b abstractC5149b = (AbstractC5149b) this.f285x;
                k2.g gVar6 = (k2.g) this.f284w;
                Context context5 = (Context) this.f282u;
                try {
                    new C2635Kc(context5, (String) this.f283v).e(gVar6.f38584a, abstractC5149b);
                    return;
                } catch (IllegalStateException e15) {
                    C2501Ce.a(context5).e("InterstitialAd.load", e15);
                    return;
                }
        }
    }

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f281n = i;
        this.f285x = obj;
        this.f282u = obj2;
        this.f283v = obj3;
        this.f284w = obj4;
    }
}

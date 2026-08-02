package E2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2655Kc;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3920sf;
import com.google.android.gms.internal.ads.C4190xf;
import com.google.android.gms.internal.ads.C4297ze;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.UUID;
import l.C4659e;
import l.C4660f;
import l.ViewOnKeyListenerC4661g;
import n2.C4767b;
import o2.AbstractC4801a;
import y2.AbstractC5206b;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f741n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f742u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f743v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f744w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f745x;

    public /* synthetic */ I(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f741n = i;
        this.f742u = obj;
        this.f743v = obj2;
        this.f744w = obj3;
        this.f745x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S0.p h3;
        switch (this.f741n) {
            case 0:
                J j6 = (J) this.f742u;
                C3069co c3069co = (C3069co) this.f743v;
                j6.d(c3069co, (ArrayDeque) this.f744w, "to");
                j6.d(c3069co, (ArrayDeque) this.f745x, "of");
                return;
            case 1:
                new C4297ze(0, (Context) this.f742u, (m2.b) this.f743v, ((m2.g) this.f744w).f39373a).n((H2.b) this.f745x);
                return;
            case 2:
                I2.d dVar = (I2.d) this.f745x;
                C4767b c4767b = (C4767b) this.f744w;
                Context context = (Context) this.f742u;
                try {
                    new C3920sf(context, (String) this.f743v).e(c4767b.f39373a, dVar);
                    return;
                } catch (IllegalStateException e9) {
                    C2521Ce.a(context).e("RewardedAd.loadAdManager", e9);
                    return;
                }
            case 3:
                I2.d dVar2 = (I2.d) this.f745x;
                m2.g gVar = (m2.g) this.f744w;
                Context context2 = (Context) this.f742u;
                try {
                    new C3920sf(context2, (String) this.f743v).e(gVar.f39373a, dVar2);
                    return;
                } catch (IllegalStateException e10) {
                    C2521Ce.a(context2).e("RewardedAd.load", e10);
                    return;
                }
            case 4:
                J2.b bVar = (J2.b) this.f745x;
                m2.g gVar2 = (m2.g) this.f744w;
                Context context3 = (Context) this.f742u;
                try {
                    new C4190xf(context3, (String) this.f743v).c(gVar2.f39373a, bVar);
                    return;
                } catch (IllegalStateException e11) {
                    C2521Ce.a(context3).e("RewardedInterstitialAd.load", e11);
                    return;
                }
            case 5:
                ((Activity) this.f742u).startActivityForResult(Q3.b.v((String) this.f743v, (String) this.f744w, (HashMap) this.f745x), 0);
                return;
            case 6:
                String str = (String) this.f743v;
                String str2 = (String) this.f744w;
                Bundle bundle = (Bundle) this.f745x;
                N3.g gVar3 = (N3.g) this.f742u;
                gVar3.getClass();
                try {
                    M3.g gVar4 = (M3.g) gVar3.f1972b.f2023k;
                    if (gVar4 == null) {
                        return;
                    }
                    ((M3.e) gVar4).r1(gVar3.f1971a.getPackageName(), str, str2, bundle, gVar3.f1974d);
                    return;
                } catch (DeadObjectException e12) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e12);
                    return;
                } catch (RemoteException e13) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.show", e13);
                    return;
                }
            case 7:
                U0.k kVar = (U0.k) this.f744w;
                UUID uuid = (UUID) this.f742u;
                String uuid2 = uuid.toString();
                J0.r d9 = J0.r.d();
                String str3 = T0.r.f3148c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                J0.g gVar5 = (J0.g) this.f743v;
                sb.append(gVar5);
                sb.append(")");
                d9.a(str3, sb.toString());
                T0.r rVar = (T0.r) this.f745x;
                WorkDatabase workDatabase = rVar.f3149a;
                WorkDatabase workDatabase2 = rVar.f3149a;
                workDatabase.c();
                try {
                    h3 = workDatabase2.t().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h3 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h3.f2938b == 2) {
                    S0.m mVar = new S0.m(uuid2, gVar5);
                    S0.n s9 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s9.f2931u;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((S0.b) s9.f2932v).q(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    J0.r.d().g(str3, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                kVar.j(null);
                workDatabase2.o();
                return;
            case 8:
                C4660f c4660f = (C4660f) this.f742u;
                if (c4660f != null) {
                    C4659e c4659e = (C4659e) this.f745x;
                    ((ViewOnKeyListenerC4661g) c4659e.f38688u).f38709S = true;
                    c4660f.f38690b.c(false);
                    ((ViewOnKeyListenerC4661g) c4659e.f38688u).f38709S = false;
                }
                l.o oVar = (l.o) this.f743v;
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((l.m) this.f744w).q(oVar, null, 4);
                    return;
                }
                return;
            case 9:
                AbstractC4801a abstractC4801a = (AbstractC4801a) this.f745x;
                m2.g gVar6 = (m2.g) this.f744w;
                Context context4 = (Context) this.f742u;
                try {
                    new C3(context4, (String) this.f743v, gVar6.f39373a, abstractC4801a).b();
                    return;
                } catch (IllegalStateException e14) {
                    C2521Ce.a(context4).e("AppOpenAd.load", e14);
                    return;
                }
            default:
                AbstractC5206b abstractC5206b = (AbstractC5206b) this.f745x;
                m2.g gVar7 = (m2.g) this.f744w;
                Context context5 = (Context) this.f742u;
                try {
                    new C2655Kc(context5, (String) this.f743v).e(gVar7.f39373a, abstractC5206b);
                    return;
                } catch (IllegalStateException e15) {
                    C2521Ce.a(context5).e("InterstitialAd.load", e15);
                    return;
                }
        }
    }

    public /* synthetic */ I(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z6) {
        this.f741n = i;
        this.f745x = obj;
        this.f742u = obj2;
        this.f743v = obj3;
        this.f744w = obj4;
    }
}

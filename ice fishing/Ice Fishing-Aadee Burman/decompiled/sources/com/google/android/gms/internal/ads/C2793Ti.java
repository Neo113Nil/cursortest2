package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2793Ti implements InterfaceC4010uk, InterfaceC2643Kk, InterfaceC2524Dk, InterfaceC4870a, InterfaceC2490Bk, InterfaceC2474Al, InterfaceC2827Vk {

    /* renamed from: A, reason: collision with root package name */
    public final C3321hu f27766A;

    /* renamed from: B, reason: collision with root package name */
    public final C3441k7 f27767B;

    /* renamed from: C, reason: collision with root package name */
    public final C2463Aa f27768C;

    /* renamed from: D, reason: collision with root package name */
    public final WeakReference f27769D;

    /* renamed from: E, reason: collision with root package name */
    public final WeakReference f27770E;

    /* renamed from: F, reason: collision with root package name */
    public final C4274ze f27771F;

    /* renamed from: G, reason: collision with root package name */
    public final C2779Sk f27772G;

    /* renamed from: H, reason: collision with root package name */
    public final C3364ik f27773H;

    /* renamed from: I, reason: collision with root package name */
    public final Set f27774I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final AtomicBoolean f27775K = new AtomicBoolean();

    /* renamed from: L, reason: collision with root package name */
    public X2.b f27776L = null;

    /* renamed from: n, reason: collision with root package name */
    public final Context f27777n;

    /* renamed from: u, reason: collision with root package name */
    public final RD f27778u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f27779v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f27780w;

    /* renamed from: x, reason: collision with root package name */
    public final Yt f27781x;

    /* renamed from: y, reason: collision with root package name */
    public final St f27782y;

    /* renamed from: z, reason: collision with root package name */
    public final C4183xv f27783z;

    public C2793Ti(Context context, RD rd, Executor executor, ScheduledExecutorService scheduledExecutorService, Yt yt, St st, C4183xv c4183xv, C3321hu c3321hu, View view, InterfaceC4061vh interfaceC4061vh, C3441k7 c3441k7, C2463Aa c2463Aa, C4274ze c4274ze, C2779Sk c2779Sk, C3364ik c3364ik, Set set) {
        this.f27777n = context;
        this.f27778u = rd;
        this.f27779v = executor;
        this.f27780w = scheduledExecutorService;
        this.f27781x = yt;
        this.f27782y = st;
        this.f27783z = c4183xv;
        this.f27766A = c3321hu;
        this.f27767B = c3441k7;
        this.f27769D = new WeakReference(view);
        this.f27770E = new WeakReference(interfaceC4061vh);
        this.f27768C = c2463Aa;
        this.f27771F = c4274ze;
        this.f27772G = c2779Sk;
        this.f27773H = c3364ik;
        this.f27774I = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
    }

    public final List a() {
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Nc)).booleanValue();
        St st = this.f27782y;
        if (booleanValue) {
            u2.D d2 = C4835j.f39730C.f39735c;
            Context context = this.f27777n;
            if (u2.D.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer valueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (valueOf != null) {
                    int min = Math.min(valueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = st.f27612d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return st.f27612d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490Bk
    public final void b(C4920z0 c4920z0) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32215c2)).booleanValue()) {
            int i = c4920z0.f40210n;
            ArrayList arrayList = new ArrayList();
            St st = this.f27782y;
            for (String str : st.f27632o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(C4183xv.c(str, "@gw_mpe@", sb.toString()));
            }
            this.f27766A.a(this.f27783z.a(this.f27781x, st, arrayList), null);
        }
    }

    public final void c(int i, int i6) {
        View view;
        if (i <= 0 || !((view = (View) this.f27769D.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            f();
        } else {
            this.f27780w.schedule(new RunnableC2777Si(this, i, i6, 0), i6, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
        St st = this.f27782y;
        this.f27766A.a(this.f27783z.a(this.f27781x, st, st.f27618g), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
        St st = this.f27782y;
        this.f27766A.a(this.f27783z.a(this.f27781x, st, st.i), null);
    }

    public final void f() {
        int i;
        X2.b bVar;
        St st = this.f27782y;
        List list = st.f27612d;
        if (list == null || list.isEmpty()) {
            return;
        }
        C3301ha c3301ha = AbstractC3569ma.pf;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && this.f27776L == null) {
            C3199fg c3199fg = C4835j.f39730C.f39740h.f29519c;
            Set set = this.f27774I;
            String str = ((C3052cu) this.f27781x.f28753a.f31863u).f29626g;
            C3092dg c3092dg = c3199fg.f30283w;
            synchronized (c3092dg.f29797g) {
                try {
                    int i6 = c3092dg.f29802m;
                    c3092dg.f29802m = i6 + 1;
                    if (set.isEmpty()) {
                        bVar = new X2.b(i6, -1, -1, false);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            CharSequence charSequence = (CharSequence) it.next();
                            while (true) {
                                sb.append(charSequence);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ",");
                                charSequence = (CharSequence) it.next();
                            }
                        }
                        String sb2 = sb.toString();
                        HashMap hashMap = c3092dg.f29803n;
                        Integer num = (Integer) hashMap.get(sb2);
                        int i9 = 0;
                        int intValue = num == null ? 0 : num.intValue();
                        hashMap.put(sb2, Integer.valueOf(intValue + 1));
                        if (str == null) {
                            bVar = new X2.b(i6, intValue, -1, false);
                        } else {
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(sb2).length());
                            sb3.append(str);
                            sb3.append(com.anythink.expressad.foundation.g.a.bU);
                            sb3.append(sb2);
                            String sb4 = sb3.toString();
                            HashMap hashMap2 = c3092dg.f29804o;
                            Integer num2 = (Integer) hashMap2.get(sb4);
                            if (num2 != null) {
                                i9 = num2.intValue();
                            }
                            hashMap2.put(sb4, Integer.valueOf(i9 + 1));
                            bVar = new X2.b(i6, intValue, i9, false);
                        }
                    }
                } finally {
                }
            }
            this.f27776L = bVar;
        }
        String i10 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32365s4)).booleanValue() ? this.f27767B.f31381b.i(this.f27777n, (View) this.f27769D.get(), null) : null;
        if ((((Boolean) rVar.f40207c.a(AbstractC3569ma.f32184Z0)).booleanValue() && ((Ut) this.f27781x.f28754b.f25043v).f28010h) || !((Boolean) AbstractC2701Oa.f26624h.r()).booleanValue()) {
            this.f27766A.a(this.f27783z.b(this.f27781x, st, false, i10, null, a(), this.f27773H, this.f27776L), this.f27772G);
            return;
        }
        if (((Boolean) AbstractC2701Oa.f26623g.r()).booleanValue() && ((i = st.f27608b) == 1 || i == 2 || i == 5)) {
        }
        ID id = (ID) QC.s(ID.s(ND.f26473u), ((Long) rVar.f40207c.a(AbstractC3569ma.f31998D1)).longValue(), TimeUnit.MILLISECONDS, this.f27780w);
        id.a(new LD(0, id, new S0.e(this, i10)), this.f27778u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final synchronized void h() {
        C4274ze c4274ze;
        long j6;
        try {
            if (this.J) {
                ArrayList arrayList = new ArrayList(a());
                St st = this.f27782y;
                arrayList.addAll(st.f27616f);
                this.f27766A.a(this.f27783z.b(this.f27781x, st, true, null, null, arrayList, null, null), null);
            } else {
                C3321hu c3321hu = this.f27766A;
                C4183xv c4183xv = this.f27783z;
                Yt yt = this.f27781x;
                St st2 = this.f27782y;
                c3321hu.a(c4183xv.a(yt, st2, st2.f27629m), null);
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32411x4)).booleanValue() && (c4274ze = this.f27771F) != null) {
                    List list = ((St) c4274ze.f35361v).f27629m;
                    String d2 = ((Xq) c4274ze.f35362w).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C4183xv.c((String) it.next(), "@gw_adnetstatus@", d2));
                    }
                    Xq xq = (Xq) c4274ze.f35362w;
                    synchronized (xq) {
                        j6 = xq.f28588h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(C4183xv.c((String) it2.next(), "@gw_ttr@", Long.toString(j6, 10)));
                    }
                    c3321hu.a(c4183xv.a((Yt) c4274ze.f35360u, (St) c4274ze.f35361v, arrayList3), null);
                }
                c3321hu.a(c4183xv.a(yt, st2, st2.f27616f), null);
            }
            this.J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2827Vk
    public final void k() {
        St st = this.f27782y;
        if (st.f27614e == 4) {
            this.f27766A.a(this.f27783z.a(this.f27781x, st, st.f27575A0), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2474Al
    public final void n() {
        St st = this.f27782y;
        this.f27766A.a(this.f27783z.a(this.f27781x, st, st.f27645u0), null);
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32184Z0)).booleanValue();
        Yt yt = this.f27781x;
        if ((booleanValue && ((Ut) yt.f28754b.f25043v).f28010h) || !((Boolean) AbstractC2701Oa.f26620d.r()).booleanValue()) {
            St st = this.f27782y;
            this.f27766A.b(true == C4835j.f39730C.f39740h.i(this.f27777n) ? 2 : 1, this.f27783z.a(yt, st, st.f27610c));
        } else {
            C2463Aa c2463Aa = this.f27768C;
            c2463Aa.getClass();
            YC q8 = QC.q(ID.s((ID) QC.s(ID.s(ND.f26473u), ((Long) AbstractC2701Oa.f26619c.r()).longValue(), TimeUnit.MILLISECONDS, c2463Aa.f23681c)), Throwable.class, L2.f26024e, AbstractC3413jg.f31275h);
            q8.a(new LD(0, q8, new Qx(this)), this.f27778u);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
        Zt zt;
        St st = this.f27782y;
        List list = st.f27620h;
        C4183xv c4183xv = this.f27783z;
        c4183xv.getClass();
        ArrayList arrayList = new ArrayList();
        c4183xv.f35078h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC2821Ve.f28214n;
            String num = Integer.toString(binderC2821Ve.f28215u);
            boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32375t4)).booleanValue();
            WA wa = NA.f26470n;
            if (booleanValue) {
                C2945au c2945au = c4183xv.f35077g;
                if (c2945au != null && (zt = c2945au.f29151a) != null) {
                    wa = new C2909aB(zt);
                }
            } else {
                Zt zt2 = c4183xv.f35076f;
                if (zt2 != null) {
                    wa = new C2909aB(zt2);
                }
            }
            String str4 = (String) wa.b(L2.f26037s).a();
            String str5 = (String) wa.b(L2.f26036r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3043cl.g(C4183xv.c(C4183xv.c(C4183xv.c(C4183xv.c(C4183xv.c(C4183xv.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", c4183xv.f35072b), c4183xv.f35075e, st.f27603W, st.f27649w0));
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to determine award type and amount.", e9);
        }
        this.f27766A.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        if (this.f27775K.compareAndSet(false, true)) {
            C3301ha c3301ha = AbstractC3569ma.f31983B4;
            q2.r rVar = q2.r.f40204e;
            int intValue = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            if (intValue > 0) {
                c(intValue, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f31992C4)).intValue());
            } else if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f31973A4)).booleanValue()) {
                f();
            } else {
                this.f27779v.execute(new RunnableC2760Ri(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
    }
}

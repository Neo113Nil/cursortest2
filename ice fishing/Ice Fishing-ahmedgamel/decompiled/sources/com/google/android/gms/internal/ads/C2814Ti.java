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
import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2814Ti implements InterfaceC4033uk, InterfaceC2663Kk, InterfaceC2544Dk, InterfaceC4919a, InterfaceC2510Bk, InterfaceC2511Bl, InterfaceC2850Vk {

    /* renamed from: A, reason: collision with root package name */
    public final C3344hu f28553A;

    /* renamed from: B, reason: collision with root package name */
    public final C3464k7 f28554B;

    /* renamed from: C, reason: collision with root package name */
    public final C2483Aa f28555C;

    /* renamed from: D, reason: collision with root package name */
    public final WeakReference f28556D;

    /* renamed from: E, reason: collision with root package name */
    public final WeakReference f28557E;

    /* renamed from: F, reason: collision with root package name */
    public final C4297ze f28558F;

    /* renamed from: G, reason: collision with root package name */
    public final C2799Sk f28559G;

    /* renamed from: H, reason: collision with root package name */
    public final C3387ik f28560H;

    /* renamed from: I, reason: collision with root package name */
    public final Set f28561I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final AtomicBoolean f28562K = new AtomicBoolean();

    /* renamed from: L, reason: collision with root package name */
    public A3.r f28563L = null;

    /* renamed from: n, reason: collision with root package name */
    public final Context f28564n;

    /* renamed from: u, reason: collision with root package name */
    public final RD f28565u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f28566v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f28567w;

    /* renamed from: x, reason: collision with root package name */
    public final Yt f28568x;

    /* renamed from: y, reason: collision with root package name */
    public final St f28569y;

    /* renamed from: z, reason: collision with root package name */
    public final C4206xv f28570z;

    public C2814Ti(Context context, RD rd, Executor executor, ScheduledExecutorService scheduledExecutorService, Yt yt, St st, C4206xv c4206xv, C3344hu c3344hu, View view, InterfaceC4084vh interfaceC4084vh, C3464k7 c3464k7, C2483Aa c2483Aa, C4297ze c4297ze, C2799Sk c2799Sk, C3387ik c3387ik, Set set) {
        this.f28564n = context;
        this.f28565u = rd;
        this.f28566v = executor;
        this.f28567w = scheduledExecutorService;
        this.f28568x = yt;
        this.f28569y = st;
        this.f28570z = c4206xv;
        this.f28553A = c3344hu;
        this.f28554B = c3464k7;
        this.f28556D = new WeakReference(view);
        this.f28557E = new WeakReference(interfaceC4084vh);
        this.f28555C = c2483Aa;
        this.f28558F = c4297ze;
        this.f28559G = c2799Sk;
        this.f28560H = c3387ik;
        this.f28561I = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
    }

    public final List a() {
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Nc)).booleanValue();
        St st = this.f28569y;
        if (booleanValue) {
            w2.D d9 = C4906k.f40186C.f40191c;
            Context context = this.f28564n;
            if (w2.D.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer valueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (valueOf != null) {
                    int min = Math.min(valueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = st.f28395d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return st.f28395d;
    }

    public final void b(int i, int i4) {
        View view;
        if (i <= 0 || !((view = (View) this.f28556D.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            f();
        } else {
            this.f28567w.schedule(new RunnableC2797Si(this, i, i4, 0), i4, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2510Bk
    public final void c(C4969z0 c4969z0) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32994c2)).booleanValue()) {
            int i = c4969z0.f40512n;
            ArrayList arrayList = new ArrayList();
            St st = this.f28569y;
            for (String str : st.f28415o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(C4206xv.c(str, "@gw_mpe@", sb.toString()));
            }
            this.f28553A.a(this.f28570z.a(this.f28568x, st, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
        St st = this.f28569y;
        this.f28553A.a(this.f28570z.a(this.f28568x, st, st.f28401g), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
        St st = this.f28569y;
        this.f28553A.a(this.f28570z.a(this.f28568x, st, st.i), null);
    }

    public final void f() {
        int i;
        A3.r rVar;
        St st = this.f28569y;
        List list = st.f28395d;
        if (list == null || list.isEmpty()) {
            return;
        }
        C3324ha c3324ha = AbstractC3592ma.pf;
        s2.r rVar2 = s2.r.f40506e;
        if (((Boolean) rVar2.f40509c.a(c3324ha)).booleanValue() && this.f28563L == null) {
            C3222fg c3222fg = C4906k.f40186C.f40196h.f30304c;
            Set set = this.f28561I;
            String str = ((C3075cu) this.f28568x.f29532a.f32643u).f30396g;
            C3115dg c3115dg = c3222fg.f31071w;
            synchronized (c3115dg.f30570g) {
                try {
                    int i4 = c3115dg.f30575m;
                    c3115dg.f30575m = i4 + 1;
                    if (set.isEmpty()) {
                        rVar = new A3.r(i4, -1, -1, false);
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
                        HashMap hashMap = c3115dg.f30576n;
                        Integer num = (Integer) hashMap.get(sb2);
                        int i6 = 0;
                        int intValue = num == null ? 0 : num.intValue();
                        hashMap.put(sb2, Integer.valueOf(intValue + 1));
                        if (str == null) {
                            rVar = new A3.r(i4, intValue, -1, false);
                        } else {
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(sb2).length());
                            sb3.append(str);
                            sb3.append(com.anythink.expressad.foundation.g.a.bU);
                            sb3.append(sb2);
                            String sb4 = sb3.toString();
                            HashMap hashMap2 = c3115dg.f30577o;
                            Integer num2 = (Integer) hashMap2.get(sb4);
                            if (num2 != null) {
                                i6 = num2.intValue();
                            }
                            hashMap2.put(sb4, Integer.valueOf(i6 + 1));
                            rVar = new A3.r(i4, intValue, i6, false);
                        }
                    }
                } finally {
                }
            }
            this.f28563L = rVar;
        }
        String i9 = ((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33144s4)).booleanValue() ? this.f28554B.f32160b.i(this.f28564n, (View) this.f28556D.get(), null) : null;
        if ((((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32963Z0)).booleanValue() && ((Ut) this.f28568x.f29533b.f25831v).f28807h) || !((Boolean) AbstractC2721Oa.f27400h.r()).booleanValue()) {
            this.f28553A.a(this.f28570z.b(this.f28568x, st, false, i9, null, a(), this.f28560H, this.f28563L), this.f28559G);
            return;
        }
        if (((Boolean) AbstractC2721Oa.f27399g.r()).booleanValue() && ((i = st.f28391b) == 1 || i == 2 || i == 5)) {
        }
        ID id = (ID) QC.s(ID.s(ND.f27257u), ((Long) rVar2.f40509c.a(AbstractC3592ma.f32778D1)).longValue(), TimeUnit.MILLISECONDS, this.f28567w);
        id.a(new LD(0, id, new S0.e(this, i9)), this.f28565u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final synchronized void h() {
        C4297ze c4297ze;
        long j6;
        try {
            if (this.J) {
                ArrayList arrayList = new ArrayList(a());
                St st = this.f28569y;
                arrayList.addAll(st.f28399f);
                this.f28553A.a(this.f28570z.b(this.f28568x, st, true, null, null, arrayList, null, null), null);
            } else {
                C3344hu c3344hu = this.f28553A;
                C4206xv c4206xv = this.f28570z;
                Yt yt = this.f28568x;
                St st2 = this.f28569y;
                c3344hu.a(c4206xv.a(yt, st2, st2.f28412m), null);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33190x4)).booleanValue() && (c4297ze = this.f28558F) != null) {
                    List list = ((St) c4297ze.f36134v).f28412m;
                    String d9 = ((Xq) c4297ze.f36135w).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C4206xv.c((String) it.next(), "@gw_adnetstatus@", d9));
                    }
                    Xq xq = (Xq) c4297ze.f36135w;
                    synchronized (xq) {
                        j6 = xq.f29369h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(C4206xv.c((String) it2.next(), "@gw_ttr@", Long.toString(j6, 10)));
                    }
                    c3344hu.a(c4206xv.a((Yt) c4297ze.f36133u, (St) c4297ze.f36134v, arrayList3), null);
                }
                c3344hu.a(c4206xv.a(yt, st2, st2.f28399f), null);
            }
            this.J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2850Vk
    public final void k() {
        St st = this.f28569y;
        if (st.f28397e == 4) {
            this.f28553A.a(this.f28570z.a(this.f28568x, st, st.f28358A0), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2511Bl
    public final void n() {
        St st = this.f28569y;
        this.f28553A.a(this.f28570z.a(this.f28568x, st, st.f28428u0), null);
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32963Z0)).booleanValue();
        Yt yt = this.f28568x;
        if ((booleanValue && ((Ut) yt.f29533b.f25831v).f28807h) || !((Boolean) AbstractC2721Oa.f27396d.r()).booleanValue()) {
            St st = this.f28569y;
            this.f28553A.b(true == C4906k.f40186C.f40196h.i(this.f28564n) ? 2 : 1, this.f28570z.a(yt, st, st.f28393c));
        } else {
            C2483Aa c2483Aa = this.f28555C;
            c2483Aa.getClass();
            YC q8 = QC.q(ID.s((ID) QC.s(ID.s(ND.f27257u), ((Long) AbstractC2721Oa.f27395c.r()).longValue(), TimeUnit.MILLISECONDS, c2483Aa.f24463c)), Throwable.class, L2.f26824e, AbstractC3436jg.f32062h);
            q8.a(new LD(0, q8, new Qx(this)), this.f28565u);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
        Zt zt;
        St st = this.f28569y;
        List list = st.f28403h;
        C4206xv c4206xv = this.f28570z;
        c4206xv.getClass();
        ArrayList arrayList = new ArrayList();
        c4206xv.f35864h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC2844Ve.f29011n;
            String num = Integer.toString(binderC2844Ve.f29012u);
            boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33154t4)).booleanValue();
            WA wa = NA.f27254n;
            if (booleanValue) {
                C2968au c2968au = c4206xv.f35863g;
                if (c2968au != null && (zt = c2968au.f29936a) != null) {
                    wa = new C2932aB(zt);
                }
            } else {
                Zt zt2 = c4206xv.f35862f;
                if (zt2 != null) {
                    wa = new C2932aB(zt2);
                }
            }
            String str4 = (String) wa.b(L2.f26837s).a();
            String str5 = (String) wa.b(L2.f26836r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3066cl.g(C4206xv.c(C4206xv.c(C4206xv.c(C4206xv.c(C4206xv.c(C4206xv.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", c4206xv.f35858b), c4206xv.f35861e, st.f28386W, st.f28432w0));
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to determine award type and amount.", e9);
        }
        this.f28553A.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        if (this.f28562K.compareAndSet(false, true)) {
            C3324ha c3324ha = AbstractC3592ma.f32763B4;
            s2.r rVar = s2.r.f40506e;
            int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (intValue > 0) {
                b(intValue, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32772C4)).intValue());
            } else if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32754A4)).booleanValue()) {
                f();
            } else {
                this.f28566v.execute(new RunnableC2780Ri(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
    }
}

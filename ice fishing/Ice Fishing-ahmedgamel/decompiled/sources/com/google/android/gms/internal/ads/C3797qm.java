package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.anythink.core.api.ErrorCode;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3797qm extends AbstractC2557Fj {
    public static final C3500lC J;

    /* renamed from: A, reason: collision with root package name */
    public boolean f33392A;

    /* renamed from: B, reason: collision with root package name */
    public final C2587Hf f33393B;

    /* renamed from: C, reason: collision with root package name */
    public final C3441k7 f33394C;

    /* renamed from: D, reason: collision with root package name */
    public final C5110a f33395D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f33396E;

    /* renamed from: F, reason: collision with root package name */
    public final C3904sm f33397F;

    /* renamed from: G, reason: collision with root package name */
    public final Er f33398G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f33399H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f33400I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f33401l;

    /* renamed from: m, reason: collision with root package name */
    public final C4012um f33402m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4174xm f33403n;

    /* renamed from: o, reason: collision with root package name */
    public final C2509Cm f33404o;

    /* renamed from: p, reason: collision with root package name */
    public final C4120wm f33405p;

    /* renamed from: q, reason: collision with root package name */
    public final C4282zm f33406q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC3135eN f33407r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3135eN f33408s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC3135eN f33409t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3135eN f33410u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3135eN f33411v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractBinderC3336i8 f33412w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33413x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33414y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33415z;

    static {
        PB pb = RB.f27177u;
        Object[] objArr = {"3010", "3008", "1005", "1009", ErrorCode.loadInShowingFilter, ErrorCode.inRequestFailPacing};
        AbstractC2772Sd.j(objArr, 6);
        J = RB.p(objArr, 6);
    }

    public C3797qm(S0.q qVar, Executor executor, C4012um c4012um, InterfaceC4174xm interfaceC4174xm, C2509Cm c2509Cm, C4120wm c4120wm, C4282zm c4282zm, InterfaceC3135eN interfaceC3135eN, InterfaceC3135eN interfaceC3135eN2, InterfaceC3135eN interfaceC3135eN3, InterfaceC3135eN interfaceC3135eN4, InterfaceC3135eN interfaceC3135eN5, C2587Hf c2587Hf, C3441k7 c3441k7, C5110a c5110a, Context context, C3904sm c3904sm, Er er) {
        super(qVar);
        this.f33401l = executor;
        this.f33402m = c4012um;
        this.f33403n = interfaceC4174xm;
        this.f33404o = c2509Cm;
        this.f33405p = c4120wm;
        this.f33406q = c4282zm;
        this.f33407r = interfaceC3135eN;
        this.f33408s = interfaceC3135eN2;
        this.f33409t = interfaceC3135eN3;
        this.f33410u = interfaceC3135eN4;
        this.f33411v = interfaceC3135eN5;
        this.f33393B = c2587Hf;
        this.f33394C = c3441k7;
        this.f33395D = c5110a;
        this.f33396E = context;
        this.f33397F = c3904sm;
        this.f33398G = er;
        this.f33399H = new HashMap();
        this.f33400I = new ArrayList();
    }

    public static boolean d(View view) {
        C3301ha c3301ha = AbstractC3569ma.Yb;
        q2.r rVar = q2.r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        u2.D d2 = C4835j.f39733C.f39738c;
        long Q8 = u2.D.Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return Q8 >= ((long) ((Integer) rVar.f40210c.a(AbstractC3569ma.Zb)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2557Fj
    public final void a() {
        RunnableC3635nm runnableC3635nm = new RunnableC3635nm(this, 1);
        Executor executor = this.f33401l;
        executor.execute(runnableC3635nm);
        if (this.f33402m.q() != 7) {
            InterfaceC4174xm interfaceC4174xm = this.f33403n;
            Objects.requireNonNull(interfaceC4174xm);
            executor.execute(new RunnableC3470kj(6, interfaceC4174xm));
        }
        super.a();
    }

    public final synchronized void c(final int i, final View view) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Xc)).booleanValue()) {
            AbstractBinderC3336i8 abstractBinderC3336i8 = this.f33412w;
            if (abstractBinderC3336i8 == null) {
                int i6 = u2.z.f41322b;
                v2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z3 = abstractBinderC3336i8 instanceof ViewTreeObserverOnGlobalLayoutListenerC2475Am;
                this.f33401l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pm
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C3797qm c3797qm = C3797qm.this;
                        ?? r12 = c3797qm.f33412w;
                        if (r12 == 0) {
                            int i9 = u2.z.f41322b;
                            v2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        View H02 = r12.H0();
                        Map g4 = c3797qm.f33412w.g();
                        Map n9 = c3797qm.f33412w.n();
                        ImageView.ScaleType k9 = c3797qm.k();
                        c3797qm.f33403n.n(view, H02, g4, n9, z3, k9, i);
                    }
                });
            }
        }
    }

    public final C3209fq e(String str, boolean z3) {
        boolean z6;
        String str2;
        int i;
        int i6;
        C4120wm c4120wm = this.f33405p;
        if (c4120wm.c() && !TextUtils.isEmpty(str)) {
            C4012um c4012um = this.f33402m;
            InterfaceC4061vh j6 = c4012um.j();
            InterfaceC4061vh h9 = c4012um.h();
            if (j6 == null && h9 == null) {
                int i9 = u2.z.f41322b;
                v2.i.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            c4120wm.f();
            int g4 = c4120wm.f().g();
            int i10 = g4 - 1;
            boolean z9 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    String str3 = g4 != 1 ? g4 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String s9 = D.y.s(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i11 = u2.z.f41322b;
                    v2.i.f(s9);
                    return null;
                }
                if (j6 == null) {
                    int i12 = u2.z.f41322b;
                    v2.i.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z6 = false;
                z9 = true;
            } else if (h9 != null) {
                z6 = true;
            } else {
                int i13 = u2.z.f41322b;
                v2.i.f("Omid media type was video but there was no video webview.");
            }
            if (z9) {
                str2 = null;
            } else if (z6) {
                str2 = "javascript";
                j6 = h9;
            } else {
                j6 = null;
                str2 = null;
            }
            if (j6 == null) {
                int i14 = u2.z.f41322b;
                v2.i.f("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.f33396E;
            C4835j c4835j = C4835j.f39733C;
            c4835j.f39758x.getClass();
            if (!C3472kl.e(context)) {
                int i15 = u2.z.f41322b;
                v2.i.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            C5110a c5110a = this.f33395D;
            int i16 = c5110a.f41392u;
            int i17 = c5110a.f41393v;
            StringBuilder sb = new StringBuilder(AbstractC4404f.b(i16, 1) + String.valueOf(i17).length());
            sb.append(i16);
            sb.append(com.anythink.core.common.d.j.f12378z);
            sb.append(i17);
            String sb2 = sb.toString();
            if (z6) {
                i6 = 3;
                i = 2;
            } else {
                i = c4012um.q() == 3 ? 4 : 3;
                i6 = 2;
            }
            C3472kl c3472kl = c4835j.f39758x;
            WebView q8 = j6.q();
            String str4 = this.f24834b.f27628l0;
            c3472kl.getClass();
            C3209fq c3209fq = (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) ? (C3209fq) C3472kl.o(new R3.a(str, sb2, str2, i6, q8, str4, i)) : null;
            if (c3209fq == null) {
                int i18 = u2.z.f41322b;
                v2.i.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (c4012um) {
                c4012um.f34574l = c3209fq;
            }
            j6.Q0(c3209fq);
            if (z6) {
                Uv uv = c3209fq.f30456a;
                if (h9 != null) {
                    View V8 = h9.V();
                    c4835j.f39758x.getClass();
                    C3472kl.i(uv, V8);
                }
                this.f33392A = true;
            }
            if (z3) {
                C3472kl c3472kl2 = c4835j.f39758x;
                Uv uv2 = c3209fq.f30456a;
                c3472kl2.getClass();
                C3472kl.h(uv2);
                j6.d("onSdkLoaded", new s.b());
            }
            return c3209fq;
        }
        return null;
    }

    public final void f(View view) {
        C3467kg c3467kg;
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue();
        C4012um c4012um = this.f33402m;
        if (!booleanValue || c4012um.q() == 3) {
            m(view, c4012um.k());
            return;
        }
        synchronized (c4012um) {
            c3467kg = c4012um.f34576n;
        }
        if (c3467kg == null) {
            return;
        }
        C2991bm c2991bm = new C2991bm(this, view);
        c3467kg.a(new LD(0, c3467kg, c2991bm), this.f33401l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    public final synchronized void g(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        Iterator<String> keys;
        View view;
        InterfaceC3335i7 interfaceC3335i7;
        try {
            if (!this.f33413x) {
                this.f33412w = (AbstractBinderC3336i8) interfaceViewOnClickListenerC2713Om;
                C2509Cm c2509Cm = this.f33404o;
                c2509Cm.f24223g.execute(new RunnableC3973u0(c2509Cm, interfaceViewOnClickListenerC2713Om));
                this.f33403n.i(interfaceViewOnClickListenerC2713Om.H0(), interfaceViewOnClickListenerC2713Om.n(), interfaceViewOnClickListenerC2713Om.j(), interfaceViewOnClickListenerC2713Om, interfaceViewOnClickListenerC2713Om);
                C3301ha c3301ha = AbstractC3569ma.f32391v3;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && (interfaceC3335i7 = this.f33394C.f31381b) != null) {
                    interfaceC3335i7.g(interfaceViewOnClickListenerC2713Om.H0());
                }
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32353r2)).booleanValue()) {
                    St st = this.f24834b;
                    if (st.f27626k0 && (keys = st.f27624j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ?? r22 = this.f33412w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.g().get(next);
                            this.f33399H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC3981u8 viewOnAttachStateChangeListenerC3981u8 = new ViewOnAttachStateChangeListenerC3981u8(this.f33396E, view);
                                this.f33400I.add(viewOnAttachStateChangeListenerC3981u8);
                                viewOnAttachStateChangeListenerC3981u8.f34491E.add(new C3581mm(this, next));
                                viewOnAttachStateChangeListenerC3981u8.d(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC2713Om.e() != null) {
                    ViewOnAttachStateChangeListenerC3981u8 e9 = interfaceViewOnClickListenerC2713Om.e();
                    e9.f34491E.add(this.f33393B);
                    e9.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        View H02 = interfaceViewOnClickListenerC2713Om.H0();
        interfaceViewOnClickListenerC2713Om.g();
        this.f33403n.k(H02);
        if (interfaceViewOnClickListenerC2713Om.D3() != null) {
            interfaceViewOnClickListenerC2713Om.D3().setClickable(false);
            interfaceViewOnClickListenerC2713Om.D3().removeAllViews();
        }
        if (interfaceViewOnClickListenerC2713Om.e() != null) {
            ViewOnAttachStateChangeListenerC3981u8 e9 = interfaceViewOnClickListenerC2713Om.e();
            e9.f34491E.remove(this.f33393B);
        }
        this.f33412w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    public final synchronized void i(View view, Map map, Map map2) {
        this.f33404o.a(this.f33412w);
        this.f33403n.t(view, map, map2, k());
        this.f33414y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.f33415z) {
            synchronized (this) {
                if (map != null) {
                    try {
                        C3500lC c3500lC = J;
                        int i = c3500lC.f31747w;
                        int i6 = 0;
                        while (i6 < i) {
                            WeakReference weakReference = (WeakReference) map.get((String) c3500lC.get(i6));
                            i6++;
                            if (weakReference != null) {
                                view2 = (View) weakReference.get();
                            }
                        }
                    } finally {
                    }
                }
                view2 = null;
                if (view2 != null) {
                    C3301ha c3301ha = AbstractC3569ma.f3if;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.f33403n.r(view, map, map2, k());
                            this.f33415z = true;
                        }
                    } else {
                        if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.jf)).booleanValue()) {
                            C3301ha c3301ha2 = AbstractC3569ma.kf;
                            if (((Float) rVar.f40210c.a(c3301ha2)).floatValue() > 0.0d) {
                                double floatValue = ((Float) rVar.f40210c.a(c3301ha2)).floatValue();
                                if (view2.getGlobalVisibleRect(new Rect(), new Point())) {
                                    if (r4.height() * r4.width() >= view2.getHeight() * view2.getWidth() * (floatValue / 100.0d)) {
                                        this.f33403n.r(view, map, map2, k());
                                        this.f33415z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.f33403n.r(view, map, map2, k());
                            this.f33415z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    public final synchronized ImageView.ScaleType k() {
        ?? r02 = this.f33412w;
        if (r02 == 0) {
            int i = u2.z.f41322b;
            v2.i.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        W2.a b02 = r02.b0();
        if (b02 != null) {
            return (ImageView.ScaleType) W2.b.F0(b02);
        }
        return C2509Cm.f24216k;
    }

    public final void l() {
        N3.a aVar;
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue()) {
            e("Google", true);
            return;
        }
        C4012um c4012um = this.f33402m;
        synchronized (c4012um) {
            aVar = c4012um.f34575m;
        }
        if (aVar == null) {
            return;
        }
        Ux ux = new Ux(this);
        aVar.a(new LD(0, aVar, ux), this.f33401l);
    }

    public final void m(View view, C3209fq c3209fq) {
        InterfaceC4061vh j6 = this.f33402m.j();
        if (!this.f33405p.c() || c3209fq == null || j6 == null || view == null) {
            return;
        }
        C3472kl c3472kl = C4835j.f39733C.f39758x;
        Uv uv = c3209fq.f30456a;
        c3472kl.getClass();
        C3472kl.i(uv, view);
    }

    public final synchronized void n() {
        this.f33413x = true;
        this.f33401l.execute(new RunnableC3635nm(this, 0));
        C2558Fk c2558Fk = this.f24835c;
        c2558Fk.getClass();
        c2558Fk.M1(new C3193fa(null, false));
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f33414y) {
            return true;
        }
        boolean u3 = this.f33403n.u(bundle);
        this.f33414y = u3;
        return u3;
    }

    public final synchronized void p(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32334p2)).booleanValue()) {
            u2.D.f41237l.post(new RunnableC3689om(this, interfaceViewOnClickListenerC2713Om, 0));
        } else {
            g(interfaceViewOnClickListenerC2713Om);
        }
    }

    public final synchronized void r(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32334p2)).booleanValue()) {
            u2.D.f41237l.post(new RunnableC3689om(this, interfaceViewOnClickListenerC2713Om, 1));
        } else {
            h(interfaceViewOnClickListenerC2713Om);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    public final synchronized void s(View view, View view2, Map map, Map map2, boolean z3) {
        InterfaceC4061vh h9;
        C2645Km c2645Km;
        C2509Cm c2509Cm = this.f33404o;
        ?? r12 = this.f33412w;
        if (r12 != 0 && (c2645Km = c2509Cm.f24221e) != null && r12.D3() != null && c2509Cm.f24219c.a()) {
            try {
                r12.D3().addView(c2645Km.a());
            } catch (C2521Dh e9) {
                u2.z.l("web view can not be obtained", e9);
            }
        }
        this.f33403n.f(view, view2, map, map2, z3, k());
        if (this.f33392A) {
            C4012um c4012um = this.f33402m;
            if (c4012um.h() != null && (h9 = c4012um.h()) != null) {
                h9.d("onSdkAdUserInteractionClick", new s.b());
            }
        }
    }

    public final synchronized void t(View view, Map map, Map map2, boolean z3) {
        if (this.f33414y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32353r2)).booleanValue() && this.f24834b.f27626k0) {
            HashMap hashMap = this.f33399H;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) hashMap.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z3) {
            i(view, map, map2);
            j(view, map, map2);
            return;
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32067L4)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && d(view2)) {
                    i(view, map, map2);
                    return;
                }
            }
        }
    }
}

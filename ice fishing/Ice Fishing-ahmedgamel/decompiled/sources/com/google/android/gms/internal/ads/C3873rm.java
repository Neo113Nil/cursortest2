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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3873rm extends AbstractC2577Fj {
    public static final C3523lC J;

    /* renamed from: A, reason: collision with root package name */
    public boolean f34492A;

    /* renamed from: B, reason: collision with root package name */
    public final C2607Hf f34493B;

    /* renamed from: C, reason: collision with root package name */
    public final C3464k7 f34494C;

    /* renamed from: D, reason: collision with root package name */
    public final C5189a f34495D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f34496E;

    /* renamed from: F, reason: collision with root package name */
    public final C3981tm f34497F;

    /* renamed from: G, reason: collision with root package name */
    public final Er f34498G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f34499H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f34500I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f34501l;

    /* renamed from: m, reason: collision with root package name */
    public final C4089vm f34502m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4251ym f34503n;

    /* renamed from: o, reason: collision with root package name */
    public final C2546Dm f34504o;

    /* renamed from: p, reason: collision with root package name */
    public final C4197xm f34505p;

    /* renamed from: q, reason: collision with root package name */
    public final C2495Am f34506q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC3158eN f34507r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3158eN f34508s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC3158eN f34509t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3158eN f34510u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3158eN f34511v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractBinderC3359i8 f34512w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34513x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34514y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f34515z;

    static {
        PB pb = RB.f27933u;
        Object[] objArr = {"3010", "3008", "1005", "1009", ErrorCode.loadInShowingFilter, ErrorCode.inRequestFailPacing};
        AbstractC2792Sd.j(objArr, 6);
        J = RB.p(objArr, 6);
    }

    public C3873rm(S0.q qVar, Executor executor, C4089vm c4089vm, InterfaceC4251ym interfaceC4251ym, C2546Dm c2546Dm, C4197xm c4197xm, C2495Am c2495Am, InterfaceC3158eN interfaceC3158eN, InterfaceC3158eN interfaceC3158eN2, InterfaceC3158eN interfaceC3158eN3, InterfaceC3158eN interfaceC3158eN4, InterfaceC3158eN interfaceC3158eN5, C2607Hf c2607Hf, C3464k7 c3464k7, C5189a c5189a, Context context, C3981tm c3981tm, Er er) {
        super(qVar);
        this.f34501l = executor;
        this.f34502m = c4089vm;
        this.f34503n = interfaceC4251ym;
        this.f34504o = c2546Dm;
        this.f34505p = c4197xm;
        this.f34506q = c2495Am;
        this.f34507r = interfaceC3158eN;
        this.f34508s = interfaceC3158eN2;
        this.f34509t = interfaceC3158eN3;
        this.f34510u = interfaceC3158eN4;
        this.f34511v = interfaceC3158eN5;
        this.f34493B = c2607Hf;
        this.f34494C = c3464k7;
        this.f34495D = c5189a;
        this.f34496E = context;
        this.f34497F = c3981tm;
        this.f34498G = er;
        this.f34499H = new HashMap();
        this.f34500I = new ArrayList();
    }

    public static boolean d(View view) {
        C3324ha c3324ha = AbstractC3592ma.Yb;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        w2.D d9 = C4906k.f40186C.f40191c;
        long Q8 = w2.D.Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return Q8 >= ((long) ((Integer) rVar.f40509c.a(AbstractC3592ma.Zb)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2577Fj
    public final void a() {
        RunnableC3712om runnableC3712om = new RunnableC3712om(this, 1);
        Executor executor = this.f34501l;
        executor.execute(runnableC3712om);
        if (this.f34502m.q() != 7) {
            InterfaceC4251ym interfaceC4251ym = this.f34503n;
            Objects.requireNonNull(interfaceC4251ym);
            executor.execute(new RunnableC3493kj(6, interfaceC4251ym));
        }
        super.a();
    }

    public final synchronized void c(final int i, final View view) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
            AbstractBinderC3359i8 abstractBinderC3359i8 = this.f34512w;
            if (abstractBinderC3359i8 == null) {
                int i4 = w2.z.f41712b;
                x2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z6 = abstractBinderC3359i8 instanceof ViewTreeObserverOnGlobalLayoutListenerC2512Bm;
                this.f34501l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qm
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C3873rm c3873rm = C3873rm.this;
                        ?? r1 = c3873rm.f34512w;
                        if (r1 == 0) {
                            int i6 = w2.z.f41712b;
                            x2.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        View F02 = r1.F0();
                        Map g9 = c3873rm.f34512w.g();
                        Map n9 = c3873rm.f34512w.n();
                        ImageView.ScaleType k9 = c3873rm.k();
                        c3873rm.f34503n.n(view, F02, g9, n9, z6, k9, i);
                    }
                });
            }
        }
    }

    public final C3232fq e(String str, boolean z6) {
        boolean z9;
        String str2;
        int i;
        int i4;
        C4197xm c4197xm = this.f34505p;
        if (c4197xm.c() && !TextUtils.isEmpty(str)) {
            C4089vm c4089vm = this.f34502m;
            InterfaceC4084vh j6 = c4089vm.j();
            InterfaceC4084vh h3 = c4089vm.h();
            if (j6 == null && h3 == null) {
                int i6 = w2.z.f41712b;
                x2.i.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            c4197xm.f();
            int g9 = c4197xm.f().g();
            int i9 = g9 - 1;
            boolean z10 = false;
            if (i9 != 0) {
                if (i9 != 1) {
                    String str3 = g9 != 1 ? g9 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String p9 = D.x.p(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i10 = w2.z.f41712b;
                    x2.i.f(p9);
                    return null;
                }
                if (j6 == null) {
                    int i11 = w2.z.f41712b;
                    x2.i.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z9 = false;
                z10 = true;
            } else if (h3 != null) {
                z9 = true;
            } else {
                int i12 = w2.z.f41712b;
                x2.i.f("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else if (z9) {
                str2 = "javascript";
                j6 = h3;
            } else {
                j6 = null;
                str2 = null;
            }
            if (j6 == null) {
                int i13 = w2.z.f41712b;
                x2.i.f("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.f34496E;
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40211x.getClass();
            if (!C3495kl.e(context)) {
                int i14 = w2.z.f41712b;
                x2.i.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            C5189a c5189a = this.f34495D;
            int i15 = c5189a.f41846u;
            int i16 = c5189a.f41847v;
            StringBuilder sb = new StringBuilder(Wv.b(i15, 1) + String.valueOf(i16).length());
            sb.append(i15);
            sb.append(com.anythink.core.common.d.j.f13164z);
            sb.append(i16);
            String sb2 = sb.toString();
            if (z9) {
                i4 = 3;
                i = 2;
            } else {
                i = c4089vm.q() == 3 ? 4 : 3;
                i4 = 2;
            }
            C3495kl c3495kl = c4906k.f40211x;
            WebView q8 = j6.q();
            String str4 = this.f25623b.f28411l0;
            c3495kl.getClass();
            C3232fq c3232fq = (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) ? (C3232fq) C3495kl.o(new T3.a(str, sb2, str2, i4, q8, str4, i)) : null;
            if (c3232fq == null) {
                int i17 = w2.z.f41712b;
                x2.i.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (c4089vm) {
                c4089vm.f35495l = c3232fq;
            }
            j6.P0(c3232fq);
            if (z9) {
                Uv uv = c3232fq.f31219a;
                if (h3 != null) {
                    View V8 = h3.V();
                    c4906k.f40211x.getClass();
                    C3495kl.i(uv, V8);
                }
                this.f34492A = true;
            }
            if (z6) {
                C3495kl c3495kl2 = c4906k.f40211x;
                Uv uv2 = c3232fq.f31219a;
                c3495kl2.getClass();
                C3495kl.h(uv2);
                j6.d("onSdkLoaded", new s.b());
            }
            return c3232fq;
        }
        return null;
    }

    public final void f(View view) {
        C3490kg c3490kg;
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue();
        C4089vm c4089vm = this.f34502m;
        if (!booleanValue || c4089vm.q() == 3) {
            m(view, c4089vm.k());
            return;
        }
        synchronized (c4089vm) {
            c3490kg = c4089vm.f35497n;
        }
        if (c3490kg == null) {
            return;
        }
        C3067cm c3067cm = new C3067cm(this, view);
        c3490kg.a(new LD(0, c3490kg, c3067cm), this.f34501l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    public final synchronized void g(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        Iterator<String> keys;
        View view;
        InterfaceC3358i7 interfaceC3358i7;
        try {
            if (!this.f34513x) {
                this.f34512w = (AbstractBinderC3359i8) interfaceViewOnClickListenerC2750Pm;
                C2546Dm c2546Dm = this.f34504o;
                c2546Dm.f25209g.execute(new RunnableC3996u0(c2546Dm, interfaceViewOnClickListenerC2750Pm));
                this.f34503n.i(interfaceViewOnClickListenerC2750Pm.F0(), interfaceViewOnClickListenerC2750Pm.n(), interfaceViewOnClickListenerC2750Pm.j(), interfaceViewOnClickListenerC2750Pm, interfaceViewOnClickListenerC2750Pm);
                C3324ha c3324ha = AbstractC3592ma.f33171v3;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && (interfaceC3358i7 = this.f34494C.f32160b) != null) {
                    interfaceC3358i7.g(interfaceViewOnClickListenerC2750Pm.F0());
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33132r2)).booleanValue()) {
                    St st = this.f25623b;
                    if (st.f28409k0 && (keys = st.f28407j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            ?? r22 = this.f34512w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.g().get(next);
                            this.f34499H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC4004u8 viewOnAttachStateChangeListenerC4004u8 = new ViewOnAttachStateChangeListenerC4004u8(this.f34496E, view);
                                this.f34500I.add(viewOnAttachStateChangeListenerC4004u8);
                                viewOnAttachStateChangeListenerC4004u8.f35265E.add(new C3658nm(this, next));
                                viewOnAttachStateChangeListenerC4004u8.d(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC2750Pm.e() != null) {
                    ViewOnAttachStateChangeListenerC4004u8 e9 = interfaceViewOnClickListenerC2750Pm.e();
                    e9.f35265E.add(this.f34493B);
                    e9.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        View F02 = interfaceViewOnClickListenerC2750Pm.F0();
        interfaceViewOnClickListenerC2750Pm.g();
        this.f34503n.k(F02);
        if (interfaceViewOnClickListenerC2750Pm.z3() != null) {
            interfaceViewOnClickListenerC2750Pm.z3().setClickable(false);
            interfaceViewOnClickListenerC2750Pm.z3().removeAllViews();
        }
        if (interfaceViewOnClickListenerC2750Pm.e() != null) {
            ViewOnAttachStateChangeListenerC4004u8 e9 = interfaceViewOnClickListenerC2750Pm.e();
            e9.f35265E.remove(this.f34493B);
        }
        this.f34512w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    public final synchronized void i(View view, Map map, Map map2) {
        this.f34504o.a(this.f34512w);
        this.f34503n.t(view, map, map2, k());
        this.f34514y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.f34515z) {
            synchronized (this) {
                if (map != null) {
                    try {
                        C3523lC c3523lC = J;
                        int i = c3523lC.f32527w;
                        int i4 = 0;
                        while (i4 < i) {
                            WeakReference weakReference = (WeakReference) map.get((String) c3523lC.get(i4));
                            i4++;
                            if (weakReference != null) {
                                view2 = (View) weakReference.get();
                            }
                        }
                    } finally {
                    }
                }
                view2 = null;
                if (view2 != null) {
                    C3324ha c3324ha = AbstractC3592ma.f3if;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.f34503n.q(view, map, map2, k());
                            this.f34515z = true;
                        }
                    } else {
                        if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.jf)).booleanValue()) {
                            C3324ha c3324ha2 = AbstractC3592ma.kf;
                            if (((Float) rVar.f40509c.a(c3324ha2)).floatValue() > 0.0d) {
                                double floatValue = ((Float) rVar.f40509c.a(c3324ha2)).floatValue();
                                if (view2.getGlobalVisibleRect(new Rect(), new Point())) {
                                    if (r4.height() * r4.width() >= view2.getHeight() * view2.getWidth() * (floatValue / 100.0d)) {
                                        this.f34503n.q(view, map, map2, k());
                                        this.f34515z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.f34503n.q(view, map, map2, k());
                            this.f34515z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    public final synchronized ImageView.ScaleType k() {
        ?? r02 = this.f34512w;
        if (r02 == 0) {
            int i = w2.z.f41712b;
            x2.i.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        Y2.a b02 = r02.b0();
        if (b02 != null) {
            return (ImageView.ScaleType) Y2.b.D0(b02);
        }
        return C2546Dm.f25202k;
    }

    public final void l() {
        P3.a aVar;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue()) {
            e("Google", true);
            return;
        }
        C4089vm c4089vm = this.f34502m;
        synchronized (c4089vm) {
            aVar = c4089vm.f35496m;
        }
        if (aVar == null) {
            return;
        }
        Ux ux = new Ux(this);
        aVar.a(new LD(0, aVar, ux), this.f34501l);
    }

    public final void m(View view, C3232fq c3232fq) {
        InterfaceC4084vh j6 = this.f34502m.j();
        if (!this.f34505p.c() || c3232fq == null || j6 == null || view == null) {
            return;
        }
        C3495kl c3495kl = C4906k.f40186C.f40211x;
        Uv uv = c3232fq.f31219a;
        c3495kl.getClass();
        C3495kl.i(uv, view);
    }

    public final synchronized void n() {
        this.f34513x = true;
        this.f34501l.execute(new RunnableC3712om(this, 0));
        C2578Fk c2578Fk = this.f25624c;
        c2578Fk.getClass();
        c2578Fk.M1(new C3216fa(null, false));
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f34514y) {
            return true;
        }
        boolean u6 = this.f34503n.u(bundle);
        this.f34514y = u6;
        return u6;
    }

    public final synchronized void p(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33114p2)).booleanValue()) {
            w2.D.f41627l.post(new RunnableC3766pm(this, interfaceViewOnClickListenerC2750Pm, 0));
        } else {
            g(interfaceViewOnClickListenerC2750Pm);
        }
    }

    public final synchronized void r(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33114p2)).booleanValue()) {
            w2.D.f41627l.post(new RunnableC3766pm(this, interfaceViewOnClickListenerC2750Pm, 1));
        } else {
            h(interfaceViewOnClickListenerC2750Pm);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    public final synchronized void s(View view, View view2, Map map, Map map2, boolean z6) {
        InterfaceC4084vh h3;
        C2682Lm c2682Lm;
        C2546Dm c2546Dm = this.f34504o;
        ?? r1 = this.f34512w;
        if (r1 != 0 && (c2682Lm = c2546Dm.f25207e) != null && r1.z3() != null && c2546Dm.f25205c.a()) {
            try {
                r1.z3().addView(c2682Lm.a());
            } catch (C2541Dh e9) {
                w2.z.l("web view can not be obtained", e9);
            }
        }
        this.f34503n.f(view, view2, map, map2, z6, k());
        if (this.f34492A) {
            C4089vm c4089vm = this.f34502m;
            if (c4089vm.h() != null && (h3 = c4089vm.h()) != null) {
                h3.d("onSdkAdUserInteractionClick", new s.b());
            }
        }
    }

    public final synchronized void t(View view, Map map, Map map2, boolean z6) {
        if (this.f34514y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33132r2)).booleanValue() && this.f25623b.f28409k0) {
            HashMap hashMap = this.f34499H;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) hashMap.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z6) {
            i(view, map, map2);
            j(view, map, map2);
            return;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32846L4)).booleanValue() && map != null) {
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

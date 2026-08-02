package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4938j0;
import s2.InterfaceC4942l0;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2784Rm implements InterfaceC4251ym, InterfaceC3335hl {

    /* renamed from: A, reason: collision with root package name */
    public final C5189a f28008A;

    /* renamed from: B, reason: collision with root package name */
    public final C3075cu f28009B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28010C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f28011D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f28012E = true;

    /* renamed from: F, reason: collision with root package name */
    public final C3972td f28013F;

    /* renamed from: G, reason: collision with root package name */
    public final C4026ud f28014G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4134wd f28015n;

    /* renamed from: u, reason: collision with root package name */
    public final C2527Ck f28016u;

    /* renamed from: v, reason: collision with root package name */
    public final C2833Uk f28017v;

    /* renamed from: w, reason: collision with root package name */
    public final C3925sk f28018w;

    /* renamed from: x, reason: collision with root package name */
    public final C2562El f28019x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f28020y;

    /* renamed from: z, reason: collision with root package name */
    public final St f28021z;

    public C2784Rm(C3972td c3972td, C4026ud c4026ud, InterfaceC4134wd interfaceC4134wd, C2527Ck c2527Ck, C2833Uk c2833Uk, C3925sk c3925sk, C2562El c2562El, Context context, St st, C5189a c5189a, C3075cu c3075cu) {
        this.f28013F = c3972td;
        this.f28014G = c4026ud;
        this.f28015n = interfaceC4134wd;
        this.f28016u = c2527Ck;
        this.f28017v = c2833Uk;
        this.f28018w = c3925sk;
        this.f28019x = c2562El;
        this.f28020y = context;
        this.f28021z = st;
        this.f28008A = c5189a;
        this.f28009B = c3075cu;
    }

    public static final HashMap x(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean B() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void L() {
        try {
            InterfaceC4134wd interfaceC4134wd = this.f28015n;
            if (interfaceC4134wd != null) {
                interfaceC4134wd.B2();
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to call destroy", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void a(C4938j0 c4938j0) {
        int i = w2.z.f41712b;
        x2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void f(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) {
        if (this.f28011D && this.f28021z.f28375L) {
            return;
        }
        z(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean g() {
        return this.f28021z.f28375L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void h() {
        this.f28011D = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void i(View view, Map map, Map map2, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm2) {
        Object obj;
        Y2.a m9;
        try {
            Y2.b bVar = new Y2.b(view);
            JSONObject jSONObject = this.f28021z.f28407j0;
            boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33014e2)).booleanValue();
            C4026ud c4026ud = this.f28014G;
            C3972td c3972td = this.f28013F;
            InterfaceC4134wd interfaceC4134wd = this.f28015n;
            boolean z6 = true;
            if (booleanValue && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f2)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (interfaceC4134wd != null) {
                                    try {
                                        m9 = interfaceC4134wd.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    m9 = c3972td != null ? c3972td.r1() : c4026ud != null ? c4026ud.y() : null;
                                }
                                if (m9 != null) {
                                    obj2 = Y2.b.D0(m9);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                d6.c.p(optJSONArray, arrayList);
                                w2.D d9 = C4906k.f40186C.f40191c;
                                ClassLoader classLoader = this.f28020y.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z6 = false;
                        break loop0;
                    }
                }
            }
            this.f28012E = z6;
            HashMap x9 = x(map);
            HashMap x10 = x(map2);
            if (interfaceC4134wd != null) {
                interfaceC4134wd.X0(bVar, new Y2.b(x9), new Y2.b(x10));
                return;
            }
            if (c3972td != null) {
                Y2.b bVar2 = new Y2.b(x9);
                Y2.b bVar3 = new Y2.b(x10);
                Parcel F02 = c3972td.F0();
                AbstractC3411j8.e(F02, bVar);
                AbstractC3411j8.e(F02, bVar2);
                AbstractC3411j8.e(F02, bVar3);
                c3972td.d1(F02, 22);
                Parcel F03 = c3972td.F0();
                AbstractC3411j8.e(F03, bVar);
                c3972td.d1(F03, 12);
                return;
            }
            if (c4026ud != null) {
                Y2.b bVar4 = new Y2.b(x9);
                Y2.b bVar5 = new Y2.b(x10);
                Parcel F04 = c4026ud.F0();
                AbstractC3411j8.e(F04, bVar);
                AbstractC3411j8.e(F04, bVar4);
                AbstractC3411j8.e(F04, bVar5);
                c4026ud.d1(F04, 22);
                Parcel F05 = c4026ud.F0();
                AbstractC3411j8.e(F05, bVar);
                c4026ud.d1(F05, 10);
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to call trackView", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void k(View view) {
        try {
            Y2.b bVar = new Y2.b(view);
            InterfaceC4134wd interfaceC4134wd = this.f28015n;
            if (interfaceC4134wd != null) {
                interfaceC4134wd.W2(bVar);
                return;
            }
            C3972td c3972td = this.f28013F;
            if (c3972td != null) {
                Parcel F02 = c3972td.F0();
                AbstractC3411j8.e(F02, bVar);
                c3972td.d1(F02, 16);
            } else {
                C4026ud c4026ud = this.f28014G;
                if (c4026ud != null) {
                    Parcel F03 = c4026ud.F0();
                    AbstractC3411j8.e(F03, bVar);
                    c4026ud.d1(F03, 14);
                }
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to call untrackView", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void n(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i) {
        if (!this.f28011D) {
            int i4 = w2.z.f41712b;
            x2.i.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f28021z.f28375L) {
            z(view2);
        } else {
            int i6 = w2.z.f41712b;
            x2.i.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void r(InterfaceC4942l0 interfaceC4942l0) {
        int i = w2.z.f41712b;
        x2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void s() {
        try {
            InterfaceC4134wd interfaceC4134wd = this.f28015n;
            if (interfaceC4134wd == null || !interfaceC4134wd.N()) {
                return;
            }
            St st = this.f28021z;
            if (st.f28397e != 4 && !st.f28363D0) {
                return;
            }
            interfaceC4134wd.v0();
            this.f28016u.t();
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to report impression from an adapter", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z6 = this.f28010C;
            St st = this.f28021z;
            if (!z6) {
                this.f28010C = C4906k.f40186C.f40202o.d(this.f28020y, this.f28008A.f41845n, st.f28361C.toString(), this.f28009B.f30396g);
            }
            if (this.f28012E) {
                InterfaceC4134wd interfaceC4134wd = this.f28015n;
                C2527Ck c2527Ck = this.f28016u;
                if (interfaceC4134wd != null) {
                    if (st.f28363D0) {
                        if (interfaceC4134wd.N()) {
                            return;
                        }
                        interfaceC4134wd.v0();
                        c2527Ck.t();
                        return;
                    }
                    if (interfaceC4134wd.N() && st.f28397e == 4) {
                        this.f28017v.t();
                        return;
                    } else {
                        interfaceC4134wd.v0();
                        c2527Ck.t();
                        return;
                    }
                }
                C3972td c3972td = this.f28013F;
                if (c3972td != null) {
                    Parcel K02 = c3972td.K0(c3972td.F0(), 13);
                    ClassLoader classLoader = AbstractC3411j8.f31986a;
                    boolean z9 = K02.readInt() != 0;
                    K02.recycle();
                    if (!z9) {
                        c3972td.d1(c3972td.F0(), 10);
                        c2527Ck.t();
                        return;
                    }
                }
                C4026ud c4026ud = this.f28014G;
                if (c4026ud != null) {
                    Parcel K03 = c4026ud.K0(c4026ud.F0(), 11);
                    ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                    boolean z10 = K03.readInt() != 0;
                    K03.recycle();
                    if (z10) {
                        return;
                    }
                    c4026ud.d1(c4026ud.F0(), 8);
                    c2527Ck.t();
                }
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to call recordImpression", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean u(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final int y() {
        return 0;
    }

    public final void z(View view) {
        try {
            InterfaceC4134wd interfaceC4134wd = this.f28015n;
            C2562El c2562El = this.f28019x;
            C3925sk c3925sk = this.f28018w;
            if (interfaceC4134wd != null && !interfaceC4134wd.m1()) {
                interfaceC4134wd.Y(new Y2.b(view));
                c3925sk.onAdClicked();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue()) {
                    c2562El.D();
                    return;
                }
                return;
            }
            C3972td c3972td = this.f28013F;
            if (c3972td != null) {
                Parcel K02 = c3972td.K0(c3972td.F0(), 14);
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                boolean z6 = K02.readInt() != 0;
                K02.recycle();
                if (!z6) {
                    Y2.b bVar = new Y2.b(view);
                    Parcel F02 = c3972td.F0();
                    AbstractC3411j8.e(F02, bVar);
                    c3972td.d1(F02, 11);
                    c3925sk.onAdClicked();
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue()) {
                        c2562El.D();
                        return;
                    }
                    return;
                }
            }
            C4026ud c4026ud = this.f28014G;
            if (c4026ud != null) {
                Parcel K03 = c4026ud.K0(c4026ud.F0(), 12);
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                boolean z9 = K03.readInt() != 0;
                K03.recycle();
                if (z9) {
                    return;
                }
                Y2.b bVar2 = new Y2.b(view);
                Parcel F03 = c4026ud.F0();
                AbstractC3411j8.e(F03, bVar2);
                c4026ud.d1(F03, 9);
                c3925sk.onAdClicked();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue()) {
                    c2562El.D();
                }
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to call handleClick", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void e(C2722Ob c2722Ob) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void v(View view, MotionEvent motionEvent) {
    }
}

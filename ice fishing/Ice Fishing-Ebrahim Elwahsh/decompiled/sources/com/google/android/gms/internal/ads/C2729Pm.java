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
import q2.C4896j0;
import q2.InterfaceC4900l0;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2729Pm implements InterfaceC4079vm, InterfaceC3271gl {

    /* renamed from: A, reason: collision with root package name */
    public final C5107a f27035A;

    /* renamed from: B, reason: collision with root package name */
    public final C3226fu f27036B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f27037C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f27038D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f27039E = true;

    /* renamed from: F, reason: collision with root package name */
    public final C3801qd f27040F;

    /* renamed from: G, reason: collision with root package name */
    public final C3854rd f27041G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3962td f27042n;

    /* renamed from: u, reason: collision with root package name */
    public final C2489Bk f27043u;

    /* renamed from: v, reason: collision with root package name */
    public final C2778Sk f27044v;

    /* renamed from: w, reason: collision with root package name */
    public final C3808qk f27045w;

    /* renamed from: x, reason: collision with root package name */
    public final C2507Cl f27046x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f27047y;

    /* renamed from: z, reason: collision with root package name */
    public final Ut f27048z;

    public C2729Pm(C3801qd c3801qd, C3854rd c3854rd, InterfaceC3962td interfaceC3962td, C2489Bk c2489Bk, C2778Sk c2778Sk, C3808qk c3808qk, C2507Cl c2507Cl, Context context, Ut ut, C5107a c5107a, C3226fu c3226fu) {
        this.f27040F = c3801qd;
        this.f27041G = c3854rd;
        this.f27042n = interfaceC3962td;
        this.f27043u = c2489Bk;
        this.f27044v = c2778Sk;
        this.f27045w = c3808qk;
        this.f27046x = c2507Cl;
        this.f27047y = context;
        this.f27048z = ut;
        this.f27035A = c5107a;
        this.f27036B = c3226fu;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void E(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void L() {
        try {
            InterfaceC3962td interfaceC3962td = this.f27042n;
            if (interfaceC3962td != null) {
                interfaceC3962td.J();
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to call destroy", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void c(InterfaceC4900l0 interfaceC4900l0) {
        int i = t2.C.f40822b;
        u2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void e() {
        this.f27038D = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final boolean g() {
        return this.f27048z.f28125L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void h(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType) {
        if (this.f27038D && this.f27048z.f28125L) {
            return;
        }
        z(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void i(View view) {
        try {
            V2.b bVar = new V2.b(view);
            InterfaceC3962td interfaceC3962td = this.f27042n;
            if (interfaceC3962td != null) {
                interfaceC3962td.S0(bVar);
                return;
            }
            C3801qd c3801qd = this.f27040F;
            if (c3801qd != null) {
                Parcel A02 = c3801qd.A0();
                AbstractC3241g8.e(A02, bVar);
                c3801qd.G0(A02, 16);
            } else {
                C3854rd c3854rd = this.f27041G;
                if (c3854rd != null) {
                    Parcel A03 = c3854rd.A0();
                    AbstractC3241g8.e(A03, bVar);
                    c3854rd.G0(A03, 14);
                }
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to call untrackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void k(View view, Map map, Map map2, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm2) {
        Object obj;
        V2.a n9;
        try {
            V2.b bVar = new V2.b(view);
            JSONObject jSONObject = this.f27048z.f28157j0;
            boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31653e2)).booleanValue();
            C3854rd c3854rd = this.f27041G;
            C3801qd c3801qd = this.f27040F;
            InterfaceC3962td interfaceC3962td = this.f27042n;
            boolean z8 = true;
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
                            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31662f2)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (interfaceC3962td != null) {
                                    try {
                                        n9 = interfaceC3962td.n();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    n9 = c3801qd != null ? c3801qd.R0() : c3854rd != null ? c3854rd.u() : null;
                                }
                                if (n9 != null) {
                                    obj2 = V2.b.A0(n9);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                p8.g.p(optJSONArray, arrayList);
                                t2.G g9 = p2.j.f39798C.f39803c;
                                ClassLoader classLoader = this.f27047y.getClassLoader();
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
                        z8 = false;
                        break loop0;
                    }
                }
            }
            this.f27039E = z8;
            HashMap x3 = x(map);
            HashMap x9 = x(map2);
            if (interfaceC3962td != null) {
                interfaceC3962td.U2(bVar, new V2.b(x3), new V2.b(x9));
                return;
            }
            if (c3801qd != null) {
                V2.b bVar2 = new V2.b(x3);
                V2.b bVar3 = new V2.b(x9);
                Parcel A02 = c3801qd.A0();
                AbstractC3241g8.e(A02, bVar);
                AbstractC3241g8.e(A02, bVar2);
                AbstractC3241g8.e(A02, bVar3);
                c3801qd.G0(A02, 22);
                Parcel A03 = c3801qd.A0();
                AbstractC3241g8.e(A03, bVar);
                c3801qd.G0(A03, 12);
                return;
            }
            if (c3854rd != null) {
                V2.b bVar4 = new V2.b(x3);
                V2.b bVar5 = new V2.b(x9);
                Parcel A04 = c3854rd.A0();
                AbstractC3241g8.e(A04, bVar);
                AbstractC3241g8.e(A04, bVar4);
                AbstractC3241g8.e(A04, bVar5);
                c3854rd.G0(A04, 22);
                Parcel A05 = c3854rd.A0();
                AbstractC3241g8.e(A05, bVar);
                c3854rd.G0(A05, 10);
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to call trackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void l(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType, int i) {
        if (!this.f27038D) {
            int i4 = t2.C.f40822b;
            u2.i.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f27048z.f28125L) {
            z(view2);
        } else {
            int i9 = t2.C.f40822b;
            u2.i.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void n(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void o() {
        try {
            InterfaceC3962td interfaceC3962td = this.f27042n;
            if (interfaceC3962td == null || !interfaceC3962td.M()) {
                return;
            }
            Ut ut = this.f27048z;
            if (ut.f28147e != 4 && !ut.f28113D0) {
                return;
            }
            interfaceC3962td.v();
            this.f27043u.a();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to report impression from an adapter", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void p(C4896j0 c4896j0) {
        int i = t2.C.f40822b;
        u2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z8 = this.f27037C;
            Ut ut = this.f27048z;
            if (!z8) {
                this.f27037C = p2.j.f39798C.f39814o.d(this.f27047y, this.f27035A.f41217n, ut.f28111C.toString(), this.f27036B.f30904g);
            }
            if (this.f27039E) {
                InterfaceC3962td interfaceC3962td = this.f27042n;
                C2489Bk c2489Bk = this.f27043u;
                if (interfaceC3962td != null) {
                    if (ut.f28113D0) {
                        if (interfaceC3962td.M()) {
                            return;
                        }
                        interfaceC3962td.v();
                        c2489Bk.a();
                        return;
                    }
                    if (interfaceC3962td.M() && ut.f28147e == 4) {
                        this.f27044v.a();
                        return;
                    } else {
                        interfaceC3962td.v();
                        c2489Bk.a();
                        return;
                    }
                }
                C3801qd c3801qd = this.f27040F;
                if (c3801qd != null) {
                    Parcel D02 = c3801qd.D0(c3801qd.A0(), 13);
                    ClassLoader classLoader = AbstractC3241g8.f30958a;
                    boolean z9 = D02.readInt() != 0;
                    D02.recycle();
                    if (!z9) {
                        c3801qd.G0(c3801qd.A0(), 10);
                        c2489Bk.a();
                        return;
                    }
                }
                C3854rd c3854rd = this.f27041G;
                if (c3854rd != null) {
                    Parcel D03 = c3854rd.D0(c3854rd.A0(), 11);
                    ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                    boolean z10 = D03.readInt() != 0;
                    D03.recycle();
                    if (z10) {
                        return;
                    }
                    c3854rd.G0(c3854rd.A0(), 8);
                    c2489Bk.a();
                }
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to call recordImpression", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final boolean s(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final int u() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final boolean v() {
        return true;
    }

    public final void z(View view) {
        try {
            InterfaceC3962td interfaceC3962td = this.f27042n;
            C2507Cl c2507Cl = this.f27046x;
            C3808qk c3808qk = this.f27045w;
            if (interfaceC3962td != null && !interfaceC3962td.t1()) {
                interfaceC3962td.a0(new V2.b(view));
                c3808qk.onAdClicked();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue()) {
                    c2507Cl.C();
                    return;
                }
                return;
            }
            C3801qd c3801qd = this.f27040F;
            if (c3801qd != null) {
                Parcel D02 = c3801qd.D0(c3801qd.A0(), 14);
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                boolean z8 = D02.readInt() != 0;
                D02.recycle();
                if (!z8) {
                    V2.b bVar = new V2.b(view);
                    Parcel A02 = c3801qd.A0();
                    AbstractC3241g8.e(A02, bVar);
                    c3801qd.G0(A02, 11);
                    c3808qk.onAdClicked();
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue()) {
                        c2507Cl.C();
                        return;
                    }
                    return;
                }
            }
            C3854rd c3854rd = this.f27041G;
            if (c3854rd != null) {
                Parcel D03 = c3854rd.D0(c3854rd.A0(), 12);
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                boolean z9 = D03.readInt() != 0;
                D03.recycle();
                if (z9) {
                    return;
                }
                V2.b bVar2 = new V2.b(view);
                Parcel A03 = c3854rd.A0();
                AbstractC3241g8.e(A03, bVar2);
                c3854rd.G0(A03, 9);
                c3808qk.onAdClicked();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue()) {
                    c2507Cl.C();
                }
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to call handleClick", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void Y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void b(C2633Kb c2633Kb) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void w(View view, MotionEvent motionEvent) {
    }
}

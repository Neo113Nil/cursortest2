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
import p2.C4835j;
import q2.C4889j0;
import q2.InterfaceC4893l0;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2747Qm implements InterfaceC4174xm, InterfaceC3312hl {

    /* renamed from: A, reason: collision with root package name */
    public final C5110a f27064A;

    /* renamed from: B, reason: collision with root package name */
    public final C3052cu f27065B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f27066C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f27067D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f27068E = true;

    /* renamed from: F, reason: collision with root package name */
    public final C3949td f27069F;

    /* renamed from: G, reason: collision with root package name */
    public final C4003ud f27070G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4111wd f27071n;

    /* renamed from: u, reason: collision with root package name */
    public final C2507Ck f27072u;

    /* renamed from: v, reason: collision with root package name */
    public final C2811Uk f27073v;

    /* renamed from: w, reason: collision with root package name */
    public final C3902sk f27074w;

    /* renamed from: x, reason: collision with root package name */
    public final C2525Dl f27075x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f27076y;

    /* renamed from: z, reason: collision with root package name */
    public final St f27077z;

    public C2747Qm(C3949td c3949td, C4003ud c4003ud, InterfaceC4111wd interfaceC4111wd, C2507Ck c2507Ck, C2811Uk c2811Uk, C3902sk c3902sk, C2525Dl c2525Dl, Context context, St st, C5110a c5110a, C3052cu c3052cu) {
        this.f27069F = c3949td;
        this.f27070G = c4003ud;
        this.f27071n = interfaceC4111wd;
        this.f27072u = c2507Ck;
        this.f27073v = c2811Uk;
        this.f27074w = c3902sk;
        this.f27075x = c2525Dl;
        this.f27076y = context;
        this.f27077z = st;
        this.f27064A = c5110a;
        this.f27065B = c3052cu;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean B() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void M() {
        try {
            InterfaceC4111wd interfaceC4111wd = this.f27071n;
            if (interfaceC4111wd != null) {
                interfaceC4111wd.E2();
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to call destroy", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void a(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void b(InterfaceC4893l0 interfaceC4893l0) {
        int i = u2.z.f41322b;
        v2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void f(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        if (this.f27067D && this.f27077z.f27592L) {
            return;
        }
        z(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean g() {
        return this.f27077z.f27592L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void h() {
        this.f27067D = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void i(View view, Map map, Map map2, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om2) {
        Object obj;
        W2.a m4;
        try {
            W2.b bVar = new W2.b(view);
            JSONObject jSONObject = this.f27077z.f27624j0;
            boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32234e2)).booleanValue();
            C4003ud c4003ud = this.f27070G;
            C3949td c3949td = this.f27069F;
            InterfaceC4111wd interfaceC4111wd = this.f27071n;
            boolean z3 = true;
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
                            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32244f2)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (interfaceC4111wd != null) {
                                    try {
                                        m4 = interfaceC4111wd.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    m4 = c3949td != null ? c3949td.t1() : c4003ud != null ? c4003ud.y() : null;
                                }
                                if (m4 != null) {
                                    obj2 = W2.b.F0(m4);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                A8.b.E(optJSONArray, arrayList);
                                u2.D d2 = C4835j.f39733C.f39738c;
                                ClassLoader classLoader = this.f27076y.getClassLoader();
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
                        z3 = false;
                        break loop0;
                    }
                }
            }
            this.f27068E = z3;
            HashMap x9 = x(map);
            HashMap x10 = x(map2);
            if (interfaceC4111wd != null) {
                interfaceC4111wd.a1(bVar, new W2.b(x9), new W2.b(x10));
                return;
            }
            if (c3949td != null) {
                W2.b bVar2 = new W2.b(x9);
                W2.b bVar3 = new W2.b(x10);
                Parcel H02 = c3949td.H0();
                AbstractC3388j8.e(H02, bVar);
                AbstractC3388j8.e(H02, bVar2);
                AbstractC3388j8.e(H02, bVar3);
                c3949td.f1(H02, 22);
                Parcel H03 = c3949td.H0();
                AbstractC3388j8.e(H03, bVar);
                c3949td.f1(H03, 12);
                return;
            }
            if (c4003ud != null) {
                W2.b bVar4 = new W2.b(x9);
                W2.b bVar5 = new W2.b(x10);
                Parcel H04 = c4003ud.H0();
                AbstractC3388j8.e(H04, bVar);
                AbstractC3388j8.e(H04, bVar4);
                AbstractC3388j8.e(H04, bVar5);
                c4003ud.f1(H04, 22);
                Parcel H05 = c4003ud.H0();
                AbstractC3388j8.e(H05, bVar);
                c4003ud.f1(H05, 10);
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to call trackView", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void k(View view) {
        try {
            W2.b bVar = new W2.b(view);
            InterfaceC4111wd interfaceC4111wd = this.f27071n;
            if (interfaceC4111wd != null) {
                interfaceC4111wd.l2(bVar);
                return;
            }
            C3949td c3949td = this.f27069F;
            if (c3949td != null) {
                Parcel H02 = c3949td.H0();
                AbstractC3388j8.e(H02, bVar);
                c3949td.f1(H02, 16);
            } else {
                C4003ud c4003ud = this.f27070G;
                if (c4003ud != null) {
                    Parcel H03 = c4003ud.H0();
                    AbstractC3388j8.e(H03, bVar);
                    c4003ud.f1(H03, 14);
                }
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to call untrackView", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i) {
        if (!this.f27067D) {
            int i6 = u2.z.f41322b;
            v2.i.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f27077z.f27592L) {
            z(view2);
        } else {
            int i9 = u2.z.f41322b;
            v2.i.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void q(C4889j0 c4889j0) {
        int i = u2.z.f41322b;
        v2.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void s() {
        try {
            InterfaceC4111wd interfaceC4111wd = this.f27071n;
            if (interfaceC4111wd == null || !interfaceC4111wd.N()) {
                return;
            }
            St st = this.f27077z;
            if (st.f27614e != 4 && !st.f27580D0) {
                return;
            }
            interfaceC4111wd.z0();
            this.f27072u.t();
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to report impression from an adapter", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z3 = this.f27066C;
            St st = this.f27077z;
            if (!z3) {
                this.f27066C = C4835j.f39733C.f39749o.d(this.f27076y, this.f27064A.f41391n, st.f27578C.toString(), this.f27065B.f29626g);
            }
            if (this.f27068E) {
                InterfaceC4111wd interfaceC4111wd = this.f27071n;
                C2507Ck c2507Ck = this.f27072u;
                if (interfaceC4111wd != null) {
                    if (st.f27580D0) {
                        if (interfaceC4111wd.N()) {
                            return;
                        }
                        interfaceC4111wd.z0();
                        c2507Ck.t();
                        return;
                    }
                    if (interfaceC4111wd.N() && st.f27614e == 4) {
                        this.f27073v.t();
                        return;
                    } else {
                        interfaceC4111wd.z0();
                        c2507Ck.t();
                        return;
                    }
                }
                C3949td c3949td = this.f27069F;
                if (c3949td != null) {
                    Parcel M02 = c3949td.M0(c3949td.H0(), 13);
                    ClassLoader classLoader = AbstractC3388j8.f31199a;
                    boolean z6 = M02.readInt() != 0;
                    M02.recycle();
                    if (!z6) {
                        c3949td.f1(c3949td.H0(), 10);
                        c2507Ck.t();
                        return;
                    }
                }
                C4003ud c4003ud = this.f27070G;
                if (c4003ud != null) {
                    Parcel M03 = c4003ud.M0(c4003ud.H0(), 11);
                    ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                    boolean z9 = M03.readInt() != 0;
                    M03.recycle();
                    if (z9) {
                        return;
                    }
                    c4003ud.f1(c4003ud.H0(), 8);
                    c2507Ck.t();
                }
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to call recordImpression", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean u(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final int y() {
        return 0;
    }

    public final void z(View view) {
        try {
            InterfaceC4111wd interfaceC4111wd = this.f27071n;
            C2525Dl c2525Dl = this.f27075x;
            C3902sk c3902sk = this.f27074w;
            if (interfaceC4111wd != null && !interfaceC4111wd.n1()) {
                interfaceC4111wd.h0(new W2.b(view));
                c3902sk.onAdClicked();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.gc)).booleanValue()) {
                    c2525Dl.J();
                    return;
                }
                return;
            }
            C3949td c3949td = this.f27069F;
            if (c3949td != null) {
                Parcel M02 = c3949td.M0(c3949td.H0(), 14);
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                boolean z3 = M02.readInt() != 0;
                M02.recycle();
                if (!z3) {
                    W2.b bVar = new W2.b(view);
                    Parcel H02 = c3949td.H0();
                    AbstractC3388j8.e(H02, bVar);
                    c3949td.f1(H02, 11);
                    c3902sk.onAdClicked();
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.gc)).booleanValue()) {
                        c2525Dl.J();
                        return;
                    }
                    return;
                }
            }
            C4003ud c4003ud = this.f27070G;
            if (c4003ud != null) {
                Parcel M03 = c4003ud.M0(c4003ud.H0(), 12);
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                boolean z6 = M03.readInt() != 0;
                M03.recycle();
                if (z6) {
                    return;
                }
                W2.b bVar2 = new W2.b(view);
                Parcel H03 = c4003ud.H0();
                AbstractC3388j8.e(H03, bVar2);
                c4003ud.f1(H03, 9);
                c3902sk.onAdClicked();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.gc)).booleanValue()) {
                    c2525Dl.J();
                }
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to call handleClick", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void e(C2702Ob c2702Ob) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void w(View view, MotionEvent motionEvent) {
    }
}

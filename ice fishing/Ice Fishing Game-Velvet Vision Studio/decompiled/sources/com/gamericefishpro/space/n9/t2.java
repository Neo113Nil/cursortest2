package com.gamericefishpro.space.n9;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.r8;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends g0 {
    public final Object A;
    public boolean B;
    public int C;
    public i2 D;
    public i2 E;
    public PriorityQueue F;
    public boolean G;
    public e2 H;
    public final AtomicLong I;
    public long J;
    public final h1 K;
    public boolean L;
    public i2 M;
    public s2 N;
    public i2 O;
    public final com.gamericefishpro.space.m.d P;
    public q2 i;
    public com.gamericefishpro.space.u6.c v;
    public final CopyOnWriteArraySet w;
    public boolean y;
    public final AtomicReference z;

    public t2(r1 r1Var) {
        super(r1Var);
        this.w = new CopyOnWriteArraySet();
        this.A = new Object();
        this.B = false;
        this.C = 1;
        this.L = true;
        this.P = new com.gamericefishpro.space.m.d(12, this);
        this.z = new AtomicReference();
        this.H = e2.c;
        this.J = -1L;
        this.I = new AtomicLong(0L);
        this.K = new h1(r1Var, 3);
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0511  */
    /* JADX WARN: Code duplicated, block: B:225:0x051d A[SYNTHETIC] */
    public final void A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        t2 t2Var;
        f1 f1Var;
        r4 r4Var;
        r4 r4Var2;
        f1 f1Var2;
        boolean z4;
        r4 r4Var3;
        long j2;
        boolean zA;
        long j3;
        r4 r4Var4;
        Bundle[] bundleArr;
        int i;
        t2 t2Var2;
        boolean zY;
        Iterator it;
        r1 r1Var;
        Bundle[] bundleArr2;
        int i2;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.g(bundle);
        r();
        s();
        r1 r1Var2 = (r1) this.d;
        boolean zB = r1Var2.b();
        w3 w3Var = r1Var2.A;
        g gVar = r1Var2.v;
        Context context = r1Var2.d;
        r4 r4Var5 = r1Var2.B;
        v0 v0Var = r1Var2.y;
        if (!zB) {
            r1.l(v0Var);
            v0Var.F.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = r1Var2.q().D;
        if (list != null && !list.contains(str2)) {
            r1.l(v0Var);
            v0Var.F.c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.y) {
            this.y = true;
            try {
                try {
                    (!r1Var2.e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    r1.l(v0Var);
                    v0Var.B.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                r1.l(v0Var);
                v0Var.E.a("Tag Manager is not found and thus will not be used");
            }
        }
        p0 p0Var = r1Var2.C;
        f1 f1Var3 = r1Var2.w;
        com.gamericefishpro.space.z8.a aVar = r1Var2.D;
        if (!gVar.B(null, e0.f1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar.getClass();
            t2Var = this;
            f1Var = f1Var3;
            r4Var = r4Var5;
            t2Var.C(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            t2Var = this;
            f1Var = f1Var3;
            r4Var = r4Var5;
        }
        if (!z || r4.C[0].equals(str2)) {
            r4Var2 = r4Var;
            f1Var2 = f1Var;
        } else {
            r1.j(r4Var);
            r1.j(f1Var);
            f1Var2 = f1Var;
            r4Var2 = r4Var;
            r4Var2.C(bundle, f1Var2.R.k());
        }
        com.gamericefishpro.space.m.d dVar = t2Var.P;
        if (!z3 && !"_iap".equals(str2)) {
            r1.j(r4Var2);
            int i3 = 2;
            if (!r4Var2.r0("event", str2)) {
                i2 = 40;
            } else if (r4Var2.t0("event", f2.a, f2.b, str2)) {
                ((r1) r4Var2.d).getClass();
                i2 = 40;
                if (r4Var2.u0(40, "event", str2)) {
                    i3 = 0;
                }
            } else {
                i3 = 13;
                i2 = 40;
            }
            if (i3 != 0) {
                r1.l(v0Var);
                v0Var.A.b(p0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                r1.j(r4Var2);
                r4.H(dVar, null, i3, "_ev", r4.w(str2, true, i2), str2 != null ? str2.length() : 0);
                return;
            }
        }
        e3 e3Var = r1Var2.E;
        r1.k(e3Var);
        b3 b3VarX = e3Var.x(false);
        if (b3VarX != null && !bundle.containsKey("_sc")) {
            b3VarX.d = true;
        }
        r4.i0(b3VarX, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zP = r4.P(str2);
        if (z) {
            z4 = zEquals;
            if (t2Var.v != null && !zP) {
                if (z4) {
                    z4 = true;
                } else {
                    r1.l(v0Var);
                    v0Var.F.c("Passing event to registered event handler (FE)", p0Var.a(str2), p0Var.e(bundle));
                    com.gamericefishpro.space.v8.c0.g(t2Var.v);
                    com.gamericefishpro.space.u6.c cVar = t2Var.v;
                    cVar.getClass();
                    try {
                        com.gamericefishpro.space.i9.o0 o0Var = (com.gamericefishpro.space.i9.o0) ((com.gamericefishpro.space.i9.q0) cVar.d);
                        Parcel parcelH = o0Var.H();
                        parcelH.writeString(str);
                        parcelH.writeString(str2);
                        com.gamericefishpro.space.i9.y.b(parcelH, bundle);
                        parcelH.writeLong(j);
                        o0Var.I(parcelH, 1);
                    } catch (RemoteException e2) {
                        r1 r1Var3 = ((AppMeasurementDynamiteService) cVar.e).d;
                        if (r1Var3 != null) {
                            v0 v0Var2 = r1Var3.y;
                            r1.l(v0Var2);
                            v0Var2.B.b(e2, "Event interceptor threw exception");
                        }
                    }
                }
            }
        }
        z4 = zEquals;
        if (r1Var2.h()) {
            r1.j(r4Var2);
            r1 r1Var4 = (r1) r4Var2.d;
            int iV0 = r4Var2.v0(str2);
            if (iV0 != 0) {
                r1.l(v0Var);
                v0Var.A.b(p0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                String strW = r4.w(str2, true, 40);
                int length = str2 != null ? str2.length() : 0;
                r1.j(r4Var2);
                r4.H(dVar, null, iV0, "_ev", strW, length);
                return;
            }
            Bundle bundleZ = r4Var2.z(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
            com.gamericefishpro.space.v8.c0.g(bundleZ);
            r1.k(e3Var);
            r4 r4Var6 = r4Var2;
            if (e3Var.x(false) == null || !"_ae".equals(str2)) {
                r4Var3 = r4Var6;
                j2 = 0;
            } else {
                r1.k(w3Var);
                v3 v3Var = w3Var.y;
                j2 = 0;
                ((r1) ((w3) v3Var.v).d).D.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = jElapsedRealtime - v3Var.e;
                v3Var.e = jElapsedRealtime;
                r4Var3 = r4Var6;
                if (j4 > 0) {
                    r4Var3.Y(bundleZ, j4);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                String string2 = bundleZ.getString("_ffr");
                int i4 = com.gamericefishpro.space.z8.c.a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                f1 f1Var4 = r1Var4.w;
                r1.j(f1Var4);
                if (Objects.equals(string2, f1Var4.O.d())) {
                    v0 v0Var3 = r1Var4.y;
                    r1.l(v0Var3);
                    v0Var3.F.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    f1 f1Var5 = r1Var4.w;
                    r1.j(f1Var5);
                    f1Var5.O.e(string2);
                }
            } else if ("_ae".equals(str2)) {
                f1 f1Var6 = r1Var4.w;
                r1.j(f1Var6);
                String strD = f1Var6.O.d();
                if (!TextUtils.isEmpty(strD)) {
                    bundleZ.putString("_ffr", strD);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZ);
            if (gVar.B(null, e0.U0)) {
                r1.k(w3Var);
                w3Var.r();
                zA = w3Var.v;
            } else {
                r1.j(f1Var2);
                zA = f1Var2.L.a();
            }
            r1.j(f1Var2);
            if (f1Var2.I.a() > j2 && f1Var2.B(j) && zA) {
                r1.l(v0Var);
                v0Var.G.a("Current session is expired, remove the session number, ID, and engagement time");
                aVar.getClass();
                bundleArr = null;
                r4Var4 = r4Var3;
                j3 = j2;
                i = 0;
                C(System.currentTimeMillis(), null, "auto", "_sid");
                aVar.getClass();
                C(System.currentTimeMillis(), null, "auto", "_sno");
                aVar.getClass();
                C(System.currentTimeMillis(), null, "auto", "_se");
                t2Var2 = this;
                f1Var2.J.b(j3);
            } else {
                j3 = j2;
                r4Var4 = r4Var3;
                bundleArr = null;
                i = 0;
                t2Var2 = this;
            }
            if (bundleZ.getLong("extend_session", j3) == 1) {
                r1.l(v0Var);
                v0Var.G.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                r1.k(w3Var);
                w3Var.w.F(j);
            }
            ArrayList arrayList2 = new ArrayList(bundleZ.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i5 = i; i5 < size; i5++) {
                String str3 = (String) arrayList2.get(i5);
                if (str3 != null) {
                    r1.j(r4Var4);
                    Object obj = bundleZ.get(str3);
                    if (obj instanceof Bundle) {
                        Bundle[] bundleArr3 = new Bundle[1];
                        bundleArr3[i] = (Bundle) obj;
                        bundleArr2 = bundleArr3;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr2 = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr2 = bundleArr;
                    }
                    if (bundleArr2 != null) {
                        bundleZ.putParcelableArray(str3, bundleArr2);
                    }
                }
            }
            int i6 = i;
            while (i6 < arrayList.size()) {
                Bundle bundleS = (Bundle) arrayList.get(i6);
                String str4 = i6 != 0 ? "_ep" : str2;
                bundleS.putString("_o", str);
                r4 r4Var7 = r4Var4;
                if (z2) {
                    bundleS = r4Var7.S(bundleS);
                }
                Bundle bundle2 = bundleS;
                u uVar = new u(str4, new t(bundle2), str, j);
                o3 o3VarO = r1Var2.o();
                o3VarO.getClass();
                o3VarO.r();
                o3VarO.s();
                o3VarO.D();
                o0 o0VarN = ((r1) o3VarO.d).n();
                o0VarN.getClass();
                Parcel parcelObtain = Parcel.obtain();
                com.gamericefishpro.space.h.a.a(uVar, parcelObtain, i);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    v0 v0Var4 = ((r1) o0VarN.d).y;
                    r1.l(v0Var4);
                    v0Var4.z.a("Event is too long for local database. Sending event directly to service");
                    zY = false;
                } else {
                    zY = o0VarN.y(0, bArrMarshall);
                }
                o3VarO.F(new i3(o3VarO, o3VarO.H(true), zY, uVar, 1));
                if (!z4) {
                    Iterator it2 = t2Var2.w.iterator();
                    while (it2.hasNext()) {
                        s4 s4Var = (s4) it2.next();
                        Bundle bundle3 = new Bundle(bundle2);
                        s4Var.getClass();
                        try {
                            com.gamericefishpro.space.i9.o0 o0Var2 = (com.gamericefishpro.space.i9.o0) s4Var.a;
                            Parcel parcelH2 = o0Var2.H();
                            parcelH2.writeString(str);
                            try {
                                parcelH2.writeString(str2);
                                com.gamericefishpro.space.i9.y.b(parcelH2, bundle3);
                                parcelH2.writeLong(j);
                                it = it2;
                                try {
                                    o0Var2.I(parcelH2, 1);
                                } catch (RemoteException e3) {
                                    e = e3;
                                    r1Var = s4Var.b.d;
                                    if (r1Var != null) {
                                        v0 v0Var5 = r1Var.y;
                                        r1.l(v0Var5);
                                        v0Var5.B.b(e, "Event listener threw exception");
                                    }
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                                it = it2;
                                r1Var = s4Var.b.d;
                                if (r1Var != null) {
                                    v0 v0Var6 = r1Var.y;
                                    r1.l(v0Var6);
                                    v0Var6.B.b(e, "Event listener threw exception");
                                }
                                it2 = it;
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                        it2 = it;
                    }
                }
                i6++;
                r4Var4 = r4Var7;
                i = 0;
            }
            r1.k(r13);
            if (e3Var.x(false) == null || !"_ae".equals(str2)) {
                return;
            }
            r1.k(w3Var);
            aVar.getClass();
            w3Var.y.e(true, true, SystemClock.elapsedRealtime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void B(String str, String str2, Object obj, boolean z, long j) {
        int iW0;
        int length;
        r1 r1Var = (r1) this.d;
        if (z) {
            r4 r4Var = r1Var.B;
            r1.j(r4Var);
            iW0 = r4Var.w0(str2);
        } else {
            r4 r4Var2 = r1Var.B;
            r1.j(r4Var2);
            if (!r4Var2.r0("user property", str2)) {
                iW0 = 6;
            } else if (r4Var2.t0("user property", f2.i, null, str2)) {
                ((r1) r4Var2.d).getClass();
                if (r4Var2.u0(24, "user property", str2)) {
                    iW0 = 0;
                } else {
                    iW0 = 6;
                }
            } else {
                iW0 = 15;
            }
        }
        com.gamericefishpro.space.m.d dVar = this.P;
        if (iW0 != 0) {
            r1.j(r1Var.B);
            String strW = r4.w(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            r1.j(r1Var.B);
            r4.H(dVar, null, iW0, "_ev", strW, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new u1(this, str3, str2, null, j, 1));
            return;
        }
        r4 r4Var3 = r1Var.B;
        r1.j(r4Var3);
        int iE = r4Var3.E(obj, str2);
        if (iE != 0) {
            r1.j(r4Var3);
            String strW2 = r4.w(str2, true, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            r1.j(r1Var.B);
            r4.H(dVar, null, iE, "_ev", strW2, length);
            return;
        }
        r1.j(r4Var3);
        Object objF = r4Var3.F(obj, str2);
        if (objF != null) {
            p1 p1Var2 = r1Var.z;
            r1.l(p1Var2);
            p1Var2.A(new u1(this, str3, str2, objF, j, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public final void C(long j, Object obj, String str, String str2) {
        String str3;
        boolean zY;
        Object objValueOf = obj;
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.d(str2);
        r();
        s();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    f1 f1Var = r1Var.w;
                    r1.j(f1Var);
                    f1Var.F.e(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    f1 f1Var2 = r1Var.w;
                    r1.j(f1Var2);
                    f1Var2.F.e("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                f1 f1Var3 = r1Var.w;
                r1.j(f1Var3);
                f1Var3.F.e("unset");
            } else {
                str4 = str2;
            }
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.c("Setting user property(FE)", "non_personalized_ads(_npa)", objValueOf);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!r1Var.b()) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.G.a("User property not set since app measurement is disabled");
            return;
        }
        if (r1Var.h()) {
            o4 o4Var = new o4(j, obj2, str3, str);
            o3 o3VarO = r1Var.o();
            o3VarO.r();
            o3VarO.s();
            o3VarO.D();
            o0 o0VarN = ((r1) o3VarO.d).n();
            o0VarN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            com.gamericefishpro.space.h.a.b(o4Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                v0 v0Var3 = ((r1) o0VarN.d).y;
                r1.l(v0Var3);
                v0Var3.z.a("User property too long for local database. Sending directly to service");
                zY = false;
            } else {
                zY = o0VarN.y(1, bArrMarshall);
            }
            o3VarO.F(new i3(o3VarO, o3VarO.H(true), zY, o4Var, 0));
        }
    }

    public final void D() {
        r();
        s();
        r1 r1Var = (r1) this.d;
        if (r1Var.h()) {
            g gVar = r1Var.v;
            ((r1) gVar.d).getClass();
            Boolean boolD = gVar.D("google_analytics_deferred_deep_link_enabled");
            if (boolD != null && boolD.booleanValue()) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.F.a("Deferred Deep Link feature enabled.");
                p1 p1Var = r1Var.z;
                r1.l(p1Var);
                p1Var.A(new h2(this, 2));
            }
            o3 o3VarO = r1Var.o();
            o3VarO.r();
            o3VarO.s();
            t4 t4VarH = o3VarO.H(true);
            o3VarO.D();
            r1 r1Var2 = (r1) o3VarO.d;
            r1Var2.v.B(null, e0.b1);
            r1Var2.n().y(3, new byte[0]);
            o3VarO.F(new j3(o3VarO, t4VarH, 1));
            this.L = false;
            f1 f1Var = r1Var.w;
            r1.j(f1Var);
            f1Var.r();
            String string = f1Var.v().getString("previous_os_version", null);
            ((r1) f1Var.d).p().t();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = f1Var.v().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            r1Var.p().t();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            y("auto", "_ou", bundle);
        }
    }

    public final void E(Bundle bundle, long j) {
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.v8.c0.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.B.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        f2.e(bundle2, "app_id", String.class, null);
        f2.e(bundle2, "origin", String.class, null);
        f2.e(bundle2, "name", String.class, null);
        f2.e(bundle2, "value", Object.class, null);
        f2.e(bundle2, "trigger_event_name", String.class, null);
        f2.e(bundle2, "trigger_timeout", Long.class, 0L);
        f2.e(bundle2, "timed_out_event_name", String.class, null);
        f2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        f2.e(bundle2, "triggered_event_name", String.class, null);
        f2.e(bundle2, "triggered_event_params", Bundle.class, null);
        f2.e(bundle2, "time_to_live", Long.class, 0L);
        f2.e(bundle2, "expired_event_name", String.class, null);
        f2.e(bundle2, "expired_event_params", Bundle.class, null);
        com.gamericefishpro.space.v8.c0.d(bundle2.getString("name"));
        com.gamericefishpro.space.v8.c0.d(bundle2.getString("origin"));
        com.gamericefishpro.space.v8.c0.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        r4 r4Var = r1Var.B;
        p0 p0Var = r1Var.C;
        v0 v0Var2 = r1Var.y;
        r1.j(r4Var);
        if (r4Var.w0(string) != 0) {
            r1.l(v0Var2);
            v0Var2.y.b(p0Var.c(string), "Invalid conditional user property name");
            return;
        }
        r1.j(r4Var);
        if (r4Var.E(obj, string) != 0) {
            r1.l(v0Var2);
            v0Var2.y.c("Invalid conditional user property value", p0Var.c(string), obj);
            return;
        }
        Object objF = r4Var.F(obj, string);
        if (objF == null) {
            r1.l(v0Var2);
            v0Var2.y.c("Unable to normalize conditional user property value", p0Var.c(string), obj);
            return;
        }
        f2.c(bundle2, objF);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            r1.l(v0Var2);
            v0Var2.y.c("Invalid conditional user property timeout", p0Var.c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            r1.l(v0Var2);
            v0Var2.y.c("Invalid conditional user property time to live", p0Var.c(string), Long.valueOf(j3));
        } else {
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new o2(this, bundle2, 0));
        }
    }

    public final void F(String str, String str2, Bundle bundle) {
        r1 r1Var = (r1) this.d;
        r1Var.D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.gamericefishpro.space.v8.c0.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.A(new o2(this, bundle2, 1));
    }

    public final String G() {
        r1 r1Var = (r1) this.d;
        try {
            return f2.b(r1Var.d, r1Var.I);
        } catch (IllegalStateException e) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void H(e2 e2Var, long j, boolean z) {
        int i = e2Var.b;
        r();
        s();
        r1 r1Var = (r1) this.d;
        f1 f1Var = r1Var.w;
        v0 v0Var = r1Var.y;
        r1.j(f1Var);
        e2 e2VarY = f1Var.y();
        if (j <= this.J && e2.l(e2VarY.b, i)) {
            r1.l(v0Var);
            v0Var.E.b(e2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        f1 f1Var2 = r1Var.w;
        r1.j(f1Var2);
        f1Var2.r();
        if (!e2.l(i, f1Var2.v().getInt("consent_source", 100))) {
            r1.l(v0Var);
            v0Var.E.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = f1Var2.v().edit();
        editorEdit.putString("consent_settings", e2Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        r1.l(v0Var);
        v0Var.G.b(e2Var, "Setting storage consent(FE)");
        this.J = j;
        if (r1Var.o().B()) {
            o3 o3VarO = r1Var.o();
            o3VarO.r();
            o3VarO.s();
            o3VarO.F(new m3(o3VarO, 2));
        } else {
            o3 o3VarO2 = r1Var.o();
            o3VarO2.r();
            o3VarO2.s();
            if (o3VarO2.A()) {
                o3VarO2.F(new j3(o3VarO2, o3VarO2.H(false)));
            }
        }
        if (z) {
            r1Var.o().v(new AtomicReference());
        }
    }

    public final void I(Boolean bool, boolean z) {
        r();
        s();
        r1 r1Var = (r1) this.d;
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.F.b(bool, "Setting app measurement enabled (FE)");
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        f1Var.r();
        SharedPreferences.Editor editorEdit = f1Var.v().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            f1Var.r();
            SharedPreferences.Editor editorEdit2 = f1Var.v().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.r();
        if (r1Var.S || !(bool == null || bool.booleanValue())) {
            J();
        }
    }

    public final void J() {
        r();
        r1 r1Var = (r1) this.d;
        f1 f1Var = r1Var.w;
        v0 v0Var = r1Var.y;
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        r1.j(f1Var);
        String strD = f1Var.F.d();
        if (strD != null) {
            if ("unset".equals(strD)) {
                aVar.getClass();
                C(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strD) ? 0L : 1L);
                aVar.getClass();
                C(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!r1Var.b() || !this.L) {
            r1.l(v0Var);
            v0Var.F.a("Updating Scion state (FE)");
            o3 o3VarO = r1Var.o();
            o3VarO.r();
            o3VarO.s();
            o3VarO.F(new j3(o3VarO, o3VarO.H(true), 3));
            return;
        }
        r1.l(v0Var);
        v0Var.F.a("Recording app launch after enabling measurement for the first time (FE)");
        D();
        w3 w3Var = r1Var.A;
        r1.k(w3Var);
        w3Var.w.D();
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.A(new h2(this, 1));
    }

    public final void K() {
        r1 r1Var = (r1) this.d;
        if (!(r1Var.d.getApplicationContext() instanceof Application) || this.i == null) {
            return;
        }
        ((Application) r1Var.d.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.i);
    }

    public final void L(Bundle bundle, int i, long j) throws Throwable {
        Boolean bool;
        String string;
        b2 b2Var;
        Boolean bool2;
        r1 r1Var = (r1) this.d;
        s();
        e2 e2Var = e2.c;
        d2[] d2VarArr = c2.STORAGE.d;
        int length = d2VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = d2VarArr[i2].d;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.D.b(string, "Ignoring invalid consent setting");
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.D.a("Valid consent values are 'granted', 'denied'");
        }
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        boolean zX = p1Var.x();
        e2 e2VarB = e2.b(bundle, i);
        Iterator it = e2VarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            b2Var = b2.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((b2) it.next()) != b2Var) {
                N(e2VarB, zX);
                break;
            }
        }
        o oVarC = o.c(bundle, i);
        Iterator it2 = oVarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((b2) it2.next()) != b2Var) {
                M(oVarC, zX);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = e2.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zX) {
                C(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                B(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void M(o oVar, boolean z) {
        com.gamericefishpro.space.va.a aVar = new com.gamericefishpro.space.va.a(14, this, oVar, false);
        if (z) {
            r();
            aVar.run();
        } else {
            p1 p1Var = ((r1) this.d).z;
            r1.l(p1Var);
            p1Var.A(aVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void N(com.gamericefishpro.space.n9.e2 r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.n9.t2.N(com.gamericefishpro.space.n9.e2, boolean):void");
    }

    public final void O() {
        r8.a();
        r1 r1Var = (r1) this.d;
        g gVar = r1Var.v;
        p1 p1Var = r1Var.z;
        v0 v0Var = r1Var.y;
        if (gVar.B(null, e0.Q0)) {
            r1.l(p1Var);
            if (p1Var.x()) {
                r1.l(v0Var);
                v0Var.y.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (com.gamericefishpro.space.lb.e.g()) {
                r1.l(v0Var);
                v0Var.y.a("Cannot get trigger URIs from main thread");
                return;
            }
            s();
            r1.l(v0Var);
            v0Var.G.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            r1.l(p1Var);
            p1Var.B(atomicReference, 10000L, "get trigger URIs", new n2(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                r1.l(v0Var);
                v0Var.A.a("Timed out waiting for get trigger URIs");
            } else {
                r1.l(p1Var);
                p1Var.A(new com.gamericefishpro.space.va.a(16, this, list));
            }
        }
    }

    public final PriorityQueue P() {
        if (this.F == null) {
            this.F = new PriorityQueue(Comparator.comparing(r2.a, com.gamericefishpro.space.fa.m.b));
        }
        return this.F;
    }

    public final void Q() {
        a4 a4Var;
        r();
        this.G = false;
        if (P().isEmpty() || this.B || (a4Var = (a4) P().poll()) == null) {
            return;
        }
        r1 r1Var = (r1) this.d;
        r4 r4Var = r1Var.B;
        r1.j(r4Var);
        com.gamericefishpro.space.n5.b bVarL = r4Var.L();
        if (bVarL != null) {
            this.B = true;
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            t0 t0Var = v0Var.G;
            String str = a4Var.d;
            t0Var.b(str, "Registering trigger URI");
            com.gamericefishpro.space.va.b bVarE = bVarL.e(Uri.parse(str));
            if (bVarE == null) {
                this.B = false;
                P().add(a4Var);
                return;
            }
            com.gamericefishpro.space.c8.p pVar = new com.gamericefishpro.space.c8.p(1, this);
            com.gamericefishpro.space.u6.l lVar = new com.gamericefishpro.space.u6.l();
            lVar.d = a4Var;
            lVar.e = this;
            bVarE.a(new com.gamericefishpro.space.va.a(0, bVarE, lVar), pVar);
        }
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return false;
    }

    public final void v(e2 e2Var) {
        r();
        boolean z = (e2Var.i(d2.ANALYTICS_STORAGE) && e2Var.i(d2.AD_STORAGE)) || ((r1) this.d).o().A();
        r1 r1Var = (r1) this.d;
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.r();
        if (z != r1Var.S) {
            p1 p1Var2 = r1Var.z;
            r1.l(p1Var2);
            p1Var2.r();
            r1Var.S = z;
            f1 f1Var = ((r1) this.d).w;
            r1.j(f1Var);
            f1Var.r();
            Boolean boolValueOf = f1Var.v().contains("measurement_enabled_from_api") ? Boolean.valueOf(f1Var.v().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                I(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.v == null || r4.P(str2);
            if (str == null) {
                str = "app";
            }
            String str3 = str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            p1 p1Var = ((r1) this.d).z;
            r1.l(p1Var);
            p1Var.A(new m2(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        e3 e3Var = ((r1) this.d).E;
        r1.k(e3Var);
        synchronized (e3Var.E) {
            try {
                if (!e3Var.D) {
                    v0 v0Var = ((r1) e3Var.d).y;
                    r1.l(v0Var);
                    v0Var.D.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((r1) e3Var.d).v.getClass();
                    }
                    v0 v0Var2 = ((r1) e3Var.d).y;
                    r1.l(v0Var2);
                    v0Var2.D.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((r1) e3Var.d).v.getClass();
                    }
                    v0 v0Var3 = ((r1) e3Var.d).y;
                    r1.l(v0Var3);
                    v0Var3.D.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    com.gamericefishpro.space.i9.v0 v0Var4 = e3Var.z;
                    string2 = v0Var4 != null ? e3Var.y(v0Var4.e) : "Activity";
                }
                String str5 = string2;
                b3 b3Var = e3Var.i;
                if (e3Var.A && b3Var != null) {
                    e3Var.A = false;
                    boolean zEquals = Objects.equals(b3Var.b, str5);
                    boolean zEquals2 = Objects.equals(b3Var.a, string);
                    if (zEquals && zEquals2) {
                        v0 v0Var5 = ((r1) e3Var.d).y;
                        r1.l(v0Var5);
                        v0Var5.D.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                r1 r1Var = (r1) e3Var.d;
                v0 v0Var6 = r1Var.y;
                r1.l(v0Var6);
                v0Var6.G.c("Logging screen view with name, class", string == null ? "null" : string, str5 == null ? "null" : str5);
                b3 b3Var2 = e3Var.i == null ? e3Var.v : e3Var.i;
                r4 r4Var = r1Var.B;
                r1.j(r4Var);
                b3 b3Var3 = new b3(string, str5, r4Var.n0(), true, j);
                e3Var.i = b3Var3;
                e3Var.v = b3Var2;
                e3Var.B = b3Var3;
                r1Var.D.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                p1 p1Var2 = r1Var.z;
                r1.l(p1Var2);
                p1Var2.A(new u1(e3Var, bundle2, b3Var3, b3Var2, jElapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x() throws Throwable {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        x3 x3Var;
        x3 x3Var2;
        t2 t2Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        com.gamericefishpro.space.f1.z zVar;
        com.gamericefishpro.space.h9.g gVarN;
        com.gamericefishpro.space.i9.o4 o4Var;
        com.gamericefishpro.space.ua.m mVarC;
        r();
        r1 r1Var = (r1) this.d;
        v0 v0Var = r1Var.y;
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        r1.l(v0Var);
        v0Var.F.a("Handle tcf update.");
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        SharedPreferences sharedPreferencesW = f1Var.w();
        HashMap map = new HashMap();
        d0 d0Var = e0.Z0;
        int i10 = 2;
        int i11 = 1;
        if (((Boolean) d0Var.a(null)).booleanValue()) {
            com.gamericefishpro.space.ua.h hVar = z3.a;
            com.gamericefishpro.space.i9.n4 n4Var = com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            y3 y3Var = y3.d;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(n4Var, y3Var);
            com.gamericefishpro.space.i9.n4 n4Var2 = com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            y3 y3Var2 = y3.e;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(n4Var2, y3Var2);
            com.gamericefishpro.space.i9.n4 n4Var3 = com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(n4Var3, y3Var);
            com.gamericefishpro.space.i9.n4 n4Var4 = com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(n4Var4, y3Var);
            com.gamericefishpro.space.i9.n4 n4Var5 = com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(n4Var5, y3Var2), new AbstractMap.SimpleImmutableEntry(com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, y3Var2), new AbstractMap.SimpleImmutableEntry(com.gamericefishpro.space.i9.n4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, y3Var2));
            com.gamericefishpro.space.f1.z zVar2 = new com.gamericefishpro.space.f1.z(listAsList != null ? listAsList.size() : 4);
            zVar2.j(listAsList);
            com.gamericefishpro.space.ua.m mVarC2 = zVar2.c();
            int i12 = com.gamericefishpro.space.ua.f.i;
            com.gamericefishpro.space.ua.o oVar = new com.gamericefishpro.space.ua.o("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesW.contains("IABTCF_TCString");
            try {
                i5 = sharedPreferencesW.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                i6 = sharedPreferencesW.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i6 = -1;
            }
            try {
                i7 = sharedPreferencesW.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i7 = -1;
            }
            int i13 = i6;
            try {
                i8 = sharedPreferencesW.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i8 = -1;
            }
            try {
                i9 = sharedPreferencesW.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                while (true) {
                    boolean zHasNext = gVarN.hasNext();
                    o4Var = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_UNDEFINED;
                    if (!zHasNext) {
                        break;
                    }
                    com.gamericefishpro.space.i9.n4 n4Var6 = (com.gamericefishpro.space.i9.n4) gVarN.next();
                    int iA = n4Var6.a();
                    com.gamericefishpro.space.h9.g gVar = gVarN;
                    com.gamericefishpro.space.ua.m mVar = mVarC2;
                    StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 28);
                    sb.append("IABTCF_PublisherRestrictions");
                    sb.append(iA);
                    String strA = z3.a(sharedPreferencesW, sb.toString());
                    if (!TextUtils.isEmpty(strA) && strA.length() >= 755) {
                        int iDigit = Character.digit(strA.charAt(754), 10);
                        com.gamericefishpro.space.i9.o4 o4Var2 = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                        if (iDigit < 0 || iDigit > com.gamericefishpro.space.i9.o4.values().length || iDigit == 0) {
                            o4Var = o4Var2;
                        } else if (iDigit == i11) {
                            o4Var = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                        } else if (iDigit == i10) {
                            o4Var = com.gamericefishpro.space.i9.o4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                        }
                    }
                    zVar.i(n4Var6, o4Var);
                    gVarN = gVar;
                    mVarC2 = mVar;
                    i10 = 2;
                    i11 = 1;
                }
            } catch (ClassCastException unused5) {
                i9 = -1;
            }
            String strA2 = z3.a(sharedPreferencesW, "IABTCF_PublisherCC");
            int i14 = i5;
            zVar = new com.gamericefishpro.space.f1.z(4);
            com.gamericefishpro.space.ua.k kVar = mVarC2.e;
            if (kVar == null) {
                com.gamericefishpro.space.ua.k kVar2 = new com.gamericefishpro.space.ua.k(mVarC2, new com.gamericefishpro.space.ua.l(mVarC2.w, 0, mVarC2.y));
                mVarC2.e = kVar2;
                kVar = kVar2;
            }
            gVarN = kVar.iterator();
            com.gamericefishpro.space.ua.m mVar2 = mVarC2;
            com.gamericefishpro.space.ua.m mVarC3 = zVar.c();
            String strA3 = z3.a(sharedPreferencesW, "IABTCF_PurposeConsents");
            String strA4 = z3.a(sharedPreferencesW, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = z3.a(sharedPreferencesW, "IABTCF_PurposeLegitimateInterests");
            String strA6 = z3.a(sharedPreferencesW, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                com.gamericefishpro.space.i9.o4 o4Var3 = (com.gamericefishpro.space.i9.o4) mVarC3.get(n4Var);
                com.gamericefishpro.space.i9.o4 o4Var4 = (com.gamericefishpro.space.i9.o4) mVarC3.get(n4Var3);
                com.gamericefishpro.space.i9.o4 o4Var5 = (com.gamericefishpro.space.i9.o4) mVarC3.get(n4Var4);
                com.gamericefishpro.space.i9.o4 o4Var6 = (com.gamericefishpro.space.i9.o4) mVarC3.get(n4Var5);
                com.gamericefishpro.space.f1.z zVar3 = new com.gamericefishpro.space.f1.z(4);
                zVar3.i("Version", "2");
                boolean z3 = z;
                zVar3.i("VendorConsent", true != z ? "0" : "1");
                boolean z4 = z2;
                zVar3.i("VendorLegitimateInterest", true != z2 ? "0" : "1");
                zVar3.i("gdprApplies", i7 != 1 ? "0" : "1");
                int i15 = i9;
                zVar3.i("EnableAdvertiserConsentMode", i15 != 1 ? "0" : "1");
                zVar3.i("PolicyVersion", String.valueOf(i13));
                zVar3.i("CmpSdkID", String.valueOf(i14));
                int i16 = i8;
                zVar3.i("PurposeOneTreatment", i16 != 1 ? "0" : "1");
                zVar3.i("PublisherCC", strA2);
                zVar3.i("PublisherRestrictions1", String.valueOf(o4Var3 != null ? o4Var3.a() : o4Var.a()));
                zVar3.i("PublisherRestrictions3", String.valueOf(o4Var4 != null ? o4Var4.a() : o4Var.a()));
                zVar3.i("PublisherRestrictions4", String.valueOf(o4Var5 != null ? o4Var5.a() : o4Var.a()));
                zVar3.i("PublisherRestrictions7", String.valueOf(o4Var6 != null ? o4Var6.a() : o4Var.a()));
                String strD = z3.d(n4Var, strA3, strA5);
                String strD2 = z3.d(n4Var3, strA3, strA5);
                String strD3 = z3.d(n4Var4, strA3, strA5);
                String strD4 = z3.d(n4Var5, strA3, strA5);
                com.gamericefishpro.space.a.a.d("Purpose1", strD);
                com.gamericefishpro.space.a.a.d("Purpose3", strD2);
                com.gamericefishpro.space.a.a.d("Purpose4", strD3);
                com.gamericefishpro.space.a.a.d("Purpose7", strD4);
                zVar3.j(com.gamericefishpro.space.ua.m.a(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                int i17 = i7;
                zVar3.j(com.gamericefishpro.space.ua.m.a(5, new Object[]{"AuthorizePurpose1", true != z3.b(n4Var, mVar2, mVarC3, oVar, cArr, i15, i17, i16, strA2, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose3", true != z3.b(n4Var3, mVar2, mVarC3, oVar, cArr, i15, i17, i16, strA2, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose4", true != z3.b(n4Var4, mVar2, mVarC3, oVar, cArr, i15, i17, i16, strA2, strA3, strA5, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != z3.b(n4Var5, mVar2, mVarC3, oVar, cArr, i15, i17, i16, strA2, strA3, strA5, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                mVarC = zVar3.c();
            } else {
                mVarC = com.gamericefishpro.space.ua.m.z;
            }
            x3Var = new x3(mVarC);
            str = "";
        } else {
            String strA7 = z3.a(sharedPreferencesW, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i = sharedPreferencesW.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = sharedPreferencesW.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = sharedPreferencesW.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                map.put("PolicyVersion", String.valueOf(i3));
            }
            String strA8 = z3.a(sharedPreferencesW, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i4 = sharedPreferencesW.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                map.put("CmpSdkID", String.valueOf(i4));
            }
            x3Var = new x3(map);
        }
        r1.l(v0Var);
        t0 t0Var = v0Var.G;
        t0Var.b(x3Var, "Tcf preferences read");
        if (!r1Var.v.B(null, d0Var)) {
            if (f1Var.z(x3Var)) {
                Bundle bundleB = x3Var.b();
                r1.l(v0Var);
                t0Var.b(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    L(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", x3Var.c());
                y("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        f1Var.r();
        String string = f1Var.v().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            x3Var2 = new x3(map2);
        } else {
            for (String str2 : string.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length >= 2 && z3.a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            x3Var2 = new x3(map2);
        }
        if (f1Var.z(x3Var)) {
            Bundle bundleB2 = x3Var.b();
            r1.l(v0Var);
            t0Var.b(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                t2Var = this;
                t2Var.L(bundleB2, -30, System.currentTimeMillis());
            } else {
                t2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = x3Var2.a;
            String str3 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = x3Var.b();
            Bundle bundleB4 = x3Var2.b();
            bundle2.putString("_tcfm", str3.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str4 = (String) x3Var.a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str4)) {
                str4 = "200000";
            }
            bundle2.putString("_tcfd2", str4);
            bundle2.putString("_tcfd", x3Var.c());
            t2Var.y("auto", "_tcf", bundle2);
        }
    }

    public final void y(String str, String str2, Bundle bundle) {
        r();
        ((r1) this.d).D.getClass();
        z(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void z(long j, Bundle bundle, String str, String str2) {
        r();
        boolean z = true;
        if (this.v != null && !r4.P(str2)) {
            z = false;
        }
        A(str, str2, j, bundle, true, z, true);
    }
}

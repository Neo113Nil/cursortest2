package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;
import w2.C5140B;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Jv extends AbstractBinderC3359i8 implements s2.S {

    /* renamed from: n, reason: collision with root package name */
    public final Kv f26563n;

    /* renamed from: u, reason: collision with root package name */
    public final Ev f26564u;

    public Jv(Kv kv, Ev ev) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f26563n = kv;
        this.f26564u = ev;
    }

    @Override // s2.S
    public final void Q(int i) {
        Ev ev = this.f26564u;
        ev.getClass();
        m2.b a9 = m2.b.a(i);
        if (a9 == null) {
            return;
        }
        HashMap hashMap = ev.f25429a;
        synchronized (hashMap) {
            try {
                if (hashMap.containsKey(a9)) {
                    Map map = (Map) hashMap.get(a9);
                    int size = map.size();
                    if (size == 0) {
                        return;
                    }
                    RB n9 = RB.n(map.values());
                    map.clear();
                    int size2 = n9.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fv fv = (Fv) n9.get(i4);
                        if (fv != null) {
                            fv.f25662g.set(false);
                            fv.f25670p.set(false);
                            Cv cv = ev.i;
                            if (cv != null) {
                                cv.d(fv);
                            }
                            Queue queue = fv.f25664j;
                            synchronized (queue) {
                                queue.clear();
                            }
                            String valueOf = String.valueOf(fv.f25666l);
                            int i6 = w2.z.f41712b;
                            x2.i.e("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(a9.toString());
                    int i9 = w2.z.f41712b;
                    x2.i.e(concat);
                    C3557lt c3557lt = ev.f25431c;
                    ev.f25435g.getClass();
                    c3557lt.z("pda", System.currentTimeMillis(), null, null, a9, -1, -1, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        s2.N n9 = null;
        r5 = null;
        r5 = null;
        s2.V0 v02 = null;
        s2.P p9 = null;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(s2.V0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    n9 = queryLocalInterface instanceof s2.N ? (s2.N) queryLocalInterface : new s2.N(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                U3(createTypedArrayList, n9);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                AbstractC3411j8.f(parcel);
                boolean V32 = V3(readString);
                parcel2.writeNoException();
                parcel2.writeInt(V32 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                InterfaceC3435jf W3 = W3(readString2);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, W3);
                return true;
            case 4:
                String readString3 = parcel.readString();
                AbstractC3411j8.f(parcel);
                boolean X32 = X3(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(X32 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                AbstractC3411j8.f(parcel);
                N8 Y32 = Y3(readString4);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, Y32);
                return true;
            case 6:
                String readString5 = parcel.readString();
                AbstractC3411j8.f(parcel);
                boolean Z32 = Z3(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(Z32 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                AbstractC3411j8.f(parcel);
                s2.K a42 = a4(readString6);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, a42);
                return true;
            case 8:
                BinderC3487kd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                s2.V0 v03 = (s2.V0) AbstractC3411j8.b(parcel, s2.V0.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    p9 = queryLocalInterface2 instanceof s2.P ? (s2.P) queryLocalInterface2 : new s2.P(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 1);
                }
                AbstractC3411j8.f(parcel);
                boolean b42 = b4(readString7, v03, p9);
                parcel2.writeNoException();
                parcel2.writeInt(b42 ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                AbstractC3411j8.f(parcel);
                boolean c42 = c4(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(c42 ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                AbstractC3411j8.f(parcel);
                s2.K k9 = (s2.K) this.f26564u.b(s2.K.class, readString9, m2.b.INTERSTITIAL);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, k9);
                return true;
            case 12:
                String readString10 = parcel.readString();
                AbstractC3411j8.f(parcel);
                N8 n82 = (N8) this.f26564u.b(N8.class, readString10, m2.b.APP_OPEN_AD);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, n82);
                return true;
            case 13:
                String readString11 = parcel.readString();
                AbstractC3411j8.f(parcel);
                InterfaceC3435jf interfaceC3435jf = (InterfaceC3435jf) this.f26564u.b(InterfaceC3435jf.class, readString11, m2.b.REWARDED);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3435jf);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                AbstractC3411j8.f(parcel);
                m2.b a9 = m2.b.a(readInt2);
                if (a9 != null) {
                    Ev ev = this.f26564u;
                    HashMap hashMap = ev.f25429a;
                    synchronized (hashMap) {
                        try {
                            if (hashMap.containsKey(a9)) {
                                Fv fv = (Fv) ((Map) hashMap.get(a9)).get(readString12);
                                C3557lt c3557lt = ev.f25431c;
                                ev.f25435g.getClass();
                                c3557lt.z("pgc", System.currentTimeMillis(), readString12, fv == null ? null : fv.r(), a9, fv == null ? -1 : fv.s(), fv != null ? fv.t() : -1, 1);
                                if (fv != null) {
                                    v02 = (s2.V0) fv.f25660e.get();
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, v02);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                Ev ev2 = this.f26564u;
                ev2.getClass();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = ev2.f25429a;
                m2.b a10 = m2.b.a(readInt3);
                synchronized (hashMap3) {
                    if (a10 != null) {
                        try {
                            if (hashMap3.containsKey(a10)) {
                                for (Fv fv2 : ((Map) hashMap3.get(a10)).values()) {
                                    hashMap2.put(fv2.f25666l, (s2.V0) fv2.f25660e.get());
                                }
                                C3557lt c3557lt2 = ev2.f25431c;
                                ev2.f25435g.getClass();
                                c3557lt2.z("pgcs", System.currentTimeMillis(), null, null, a10, -1, -1, hashMap2.size());
                            }
                        } finally {
                        }
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    String str = (String) entry.getKey();
                    s2.V0 v04 = (s2.V0) entry.getValue();
                    Parcel obtain = Parcel.obtain();
                    v04.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    bundle.putByteArray(str, marshall);
                }
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                AbstractC3411j8.f(parcel);
                m2.b a11 = m2.b.a(readInt4);
                if (a11 != null) {
                    Ev ev3 = this.f26564u;
                    HashMap hashMap4 = ev3.f25429a;
                    synchronized (hashMap4) {
                        try {
                            if (hashMap4.containsKey(a11)) {
                                Fv fv3 = (Fv) ((Map) hashMap4.get(a11)).get(readString13);
                                int t6 = fv3 != null ? fv3.t() : 0;
                                C3557lt c3557lt3 = ev3.f25431c;
                                ev3.f25435g.getClass();
                                c3557lt3.z("pnav", System.currentTimeMillis(), readString13, fv3 != null ? fv3.r() : null, a11, fv3 != null ? fv3.s() : -1, t6, 1);
                                r6 = t6;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(r6);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                AbstractC3411j8.f(parcel);
                m2.b a12 = m2.b.a(readInt5);
                if (a12 != null) {
                    Ev ev4 = this.f26564u;
                    HashMap hashMap5 = ev4.f25429a;
                    synchronized (hashMap5) {
                        try {
                            if (hashMap5.containsKey(a12)) {
                                Fv fv4 = (Fv) ((Map) hashMap5.get(a12)).remove(readString14);
                                if (fv4 != null) {
                                    fv4.f25662g.set(false);
                                    fv4.f25670p.set(false);
                                    Cv cv = ev4.i;
                                    if (cv != null) {
                                        cv.d(fv4);
                                    }
                                    int t9 = fv4.t();
                                    Queue queue = fv4.f25664j;
                                    synchronized (queue) {
                                        queue.clear();
                                    }
                                    C3557lt c3557lt4 = ev4.f25431c;
                                    ev4.f25435g.getClass();
                                    c3557lt4.z("pd", System.currentTimeMillis(), readString14, fv4.r(), a12, fv4.s(), t9, 1);
                                    r6 = 1;
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(r6);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                AbstractC3411j8.f(parcel);
                Q(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        r7 = 0;
        r9 = x2.d.f41852b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r0.containsKey(r6) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        r7 = r0.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        r0.put((java.util.EnumMap) r6, (m2.b) java.lang.Integer.valueOf(((java.lang.Integer) r7).intValue() + 1));
        r8 = new com.google.android.gms.internal.ads.Lv(new com.google.android.gms.internal.ads.C3504ku(17, r5, r6));
        r5 = r4.f40379w;
        r2.f26797h.getClass();
        r4.l(r5, java.lang.System.currentTimeMillis(), r8, "1");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x0004, B:7:0x0091, B:8:0x00a0, B:10:0x00a6, B:15:0x00be, B:17:0x00c2, B:18:0x00c9, B:19:0x00d2, B:22:0x00e2, B:23:0x00e3, B:25:0x00ef, B:26:0x00f3, B:33:0x0122, B:38:0x0123, B:41:0x000f, B:43:0x0013, B:58:0x0033, B:59:0x0038, B:61:0x003e, B:64:0x0043, B:65:0x0085, B:68:0x004f, B:69:0x006e, B:45:0x0014, B:51:0x0018, B:47:0x0030, B:54:0x0029, B:21:0x00d3), top: B:3:0x0004, inners: #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U3(ArrayList arrayList, s2.N n9) {
        Iterator it;
        Kv kv = this.f26563n;
        synchronized (kv) {
            try {
                if (!kv.f26796g.getAndSet(true)) {
                    if (kv.f26795f == null) {
                        synchronized (kv) {
                            if (kv.f26795f == null) {
                                try {
                                    kv.f26795f = (ConnectivityManager) kv.f26794e.getSystemService("connectivity");
                                } catch (ClassCastException e9) {
                                    int i = w2.z.f41712b;
                                    x2.i.g("Failed to get connectivity manager", e9);
                                }
                            }
                        }
                    }
                    if (V2.b.f() || kv.f26795f == null) {
                        kv.i = new AtomicInteger(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32842L)).intValue());
                    } else {
                        try {
                            kv.f26795f.registerDefaultNetworkCallback(new Q0.h(kv));
                        } catch (RuntimeException e10) {
                            int i4 = w2.z.f41712b;
                            x2.i.g("Failed to register network callback", e10);
                            kv.i = new AtomicInteger(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32842L)).intValue());
                        }
                    }
                    C4906k.f40186C.f40195g.i(new S8(kv));
                }
                ArrayList d9 = kv.d(arrayList);
                EnumMap enumMap = new EnumMap(m2.b.class);
                it = d9.iterator();
                while (it.hasNext()) {
                    s2.V0 v02 = (s2.V0) it.next();
                    String str = v02.f40376n;
                    m2.b a9 = m2.b.a(v02.f40377u);
                    Fv a10 = kv.f26792c.a(v02, n9);
                    if (a9 != null && a10 != null) {
                        AtomicInteger atomicInteger = kv.i;
                        if (atomicInteger != null) {
                            a10.p(atomicInteger.get());
                        }
                        C3557lt c3557lt = kv.f26793d;
                        a10.f25671q = c3557lt;
                        String a11 = Kv.a(str, a9);
                        synchronized (kv) {
                            a10.f25668n.submit(new Nv(a10, 0));
                            kv.f26790a.put(a11, a10);
                        }
                    }
                }
                C3557lt c3557lt2 = kv.f26793d;
                kv.f26797h.getClass();
                c3557lt2.t(enumMap, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        if (V2.b.f()) {
        }
        kv.i = new AtomicInteger(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32842L)).intValue());
        C4906k.f40186C.f40195g.i(new S8(kv));
        ArrayList d92 = kv.d(arrayList);
        EnumMap enumMap2 = new EnumMap(m2.b.class);
        it = d92.iterator();
        while (it.hasNext()) {
        }
        C3557lt c3557lt22 = kv.f26793d;
        kv.f26797h.getClass();
        c3557lt22.t(enumMap2, System.currentTimeMillis());
    }

    public final boolean V3(String str) {
        boolean e9;
        Kv kv = this.f26563n;
        synchronized (kv) {
            e9 = kv.e(str, m2.b.REWARDED);
        }
        return e9;
    }

    public final InterfaceC3435jf W3(String str) {
        InterfaceC3435jf interfaceC3435jf;
        Kv kv = this.f26563n;
        synchronized (kv) {
            interfaceC3435jf = (InterfaceC3435jf) kv.f(InterfaceC3435jf.class, str, m2.b.REWARDED);
        }
        return interfaceC3435jf;
    }

    public final boolean X3(String str) {
        boolean e9;
        Kv kv = this.f26563n;
        synchronized (kv) {
            e9 = kv.e(str, m2.b.APP_OPEN_AD);
        }
        return e9;
    }

    public final N8 Y3(String str) {
        N8 n82;
        Kv kv = this.f26563n;
        synchronized (kv) {
            n82 = (N8) kv.f(N8.class, str, m2.b.APP_OPEN_AD);
        }
        return n82;
    }

    public final boolean Z3(String str) {
        boolean e9;
        Kv kv = this.f26563n;
        synchronized (kv) {
            e9 = kv.e(str, m2.b.INTERSTITIAL);
        }
        return e9;
    }

    public final s2.K a4(String str) {
        s2.K k9;
        Kv kv = this.f26563n;
        synchronized (kv) {
            k9 = (s2.K) kv.f(s2.K.class, str, m2.b.INTERSTITIAL);
        }
        return k9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b4(String str, s2.V0 v02, s2.P p9) {
        boolean z6;
        s2.V0 v03;
        m2.b a9;
        Fv fv;
        m2.b bVar;
        Ev ev;
        HashMap hashMap;
        boolean z9;
        Fv fv2;
        HashMap hashMap2;
        int i;
        String str2 = str;
        Ev ev2 = this.f26564u;
        if (!ev2.f25434f.getAndSet(true)) {
            if (ev2.f25433e == null) {
                synchronized (ev2) {
                    if (ev2.f25433e == null) {
                        try {
                            ev2.f25433e = (ConnectivityManager) ev2.f25432d.getSystemService("connectivity");
                        } catch (ClassCastException e9) {
                            int i4 = w2.z.f41712b;
                            x2.i.g("Failed to get connectivity manager", e9);
                        }
                    }
                }
            }
            if (!V2.b.f() || ev2.f25433e == null) {
                ev2.f25436h = new AtomicInteger(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32842L)).intValue());
            } else {
                try {
                    ev2.f25433e.registerDefaultNetworkCallback(new Q0.h(ev2));
                } catch (RuntimeException e10) {
                    int i6 = w2.z.f41712b;
                    x2.i.g("Failed to register network callback", e10);
                    ev2.f25436h = new AtomicInteger(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32842L)).intValue());
                }
            }
            C4906k.f40186C.f40195g.i(new S8(ev2));
        }
        m2.b a10 = m2.b.a(v02.f40377u);
        if (a10 != null) {
            HashMap hashMap3 = ev2.f25429a;
            synchronized (hashMap3) {
                try {
                    if (hashMap3.containsKey(a10)) {
                        if (!((Map) hashMap3.get(a10)).containsKey(str2)) {
                            if (ev2.c(a10)) {
                                if (v02.f40380x) {
                                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32911T)).booleanValue()) {
                                        C5140B c5140b = ev2.f25437j;
                                        c5140b.i();
                                        synchronized (c5140b.f41599a) {
                                            i = c5140b.f41598G;
                                        }
                                        if (i > 0) {
                                            if (i <= 0) {
                                                i = v02.f40379w;
                                            }
                                            String str3 = v02.f40376n;
                                            boolean z10 = v02.f40380x;
                                            v03 = new s2.V0(str3, v02.f40377u, v02.f40378v, i, z10);
                                            Qv qv = ev2.f25430b;
                                            qv.getClass();
                                            a9 = m2.b.a(v03.f40377u);
                                            if (a9 != null) {
                                                int ordinal = a9.ordinal();
                                                C5189a c5189a = qv.f27885b;
                                                if (ordinal == 1) {
                                                    bVar = a10;
                                                    ev = ev2;
                                                    hashMap = hashMap3;
                                                    int i9 = c5189a.f41847v;
                                                    Gv b9 = qv.b();
                                                    ClientApi clientApi = qv.f27888e;
                                                    Context context = qv.f27884a;
                                                    C3504ku c3504ku = qv.f27889f;
                                                    str2 = str;
                                                    fv2 = new Fv(str2, clientApi, context, i9, c3504ku, v03, p9, qv.f27886c, qv.f27887d, b9, qv.f27890g, qv.f27891h, 1);
                                                    hashMap2 = c3504ku;
                                                } else if (ordinal == 2) {
                                                    bVar = a10;
                                                    ev = ev2;
                                                    hashMap = hashMap3;
                                                    int i10 = c5189a.f41847v;
                                                    Gv b10 = qv.b();
                                                    ClientApi clientApi2 = qv.f27888e;
                                                    Context context2 = qv.f27884a;
                                                    C3504ku c3504ku2 = qv.f27889f;
                                                    str2 = str;
                                                    fv2 = new Fv(str2, clientApi2, context2, i10, c3504ku2, v03, p9, qv.f27886c, qv.f27887d, b10, qv.f27890g, qv.f27891h, 2);
                                                    hashMap2 = c3504ku2;
                                                } else if (ordinal == 5) {
                                                    int i11 = c5189a.f41847v;
                                                    Gv b11 = qv.b();
                                                    ClientApi clientApi3 = qv.f27888e;
                                                    Context context3 = qv.f27884a;
                                                    C3504ku c3504ku3 = qv.f27889f;
                                                    ev = ev2;
                                                    bVar = a10;
                                                    hashMap = hashMap3;
                                                    fv2 = new Fv(str2, clientApi3, context3, i11, c3504ku3, v03, p9, qv.f27886c, qv.f27887d, b11, qv.f27890g, qv.f27891h, 0);
                                                    str2 = str;
                                                    hashMap2 = c3504ku3;
                                                }
                                                fv = fv2;
                                                hashMap3 = hashMap2;
                                                if (fv != null) {
                                                    AtomicInteger atomicInteger = ev.f25436h;
                                                    if (atomicInteger != null) {
                                                        fv.p(atomicInteger.get());
                                                    }
                                                    C3557lt c3557lt = ev.f25431c;
                                                    fv.f25671q = c3557lt;
                                                    synchronized (hashMap) {
                                                        m2.b bVar2 = bVar;
                                                        if (((Map) hashMap.get(bVar2)).containsKey(str2) || !ev.c(bVar2)) {
                                                            z6 = false;
                                                            return z6;
                                                        }
                                                        ((Map) hashMap.get(bVar2)).put(str2, fv);
                                                        Cv cv = ev.i;
                                                        if (cv != null) {
                                                            LinkedHashMap linkedHashMap = cv.f25012d;
                                                            String g9 = Cv.g(str2, bVar2);
                                                            synchronized (linkedHashMap) {
                                                                if (linkedHashMap.containsKey(g9)) {
                                                                    z9 = true;
                                                                } else {
                                                                    linkedHashMap.put(g9, fv);
                                                                    z9 = true;
                                                                    cv.f25014f.execute(new RunnableC4314zv(cv, fv, 1));
                                                                }
                                                            }
                                                        } else {
                                                            z9 = true;
                                                            fv.f25668n.submit(new Nv(fv, 0));
                                                        }
                                                        C3504ku c3504ku4 = new C3504ku(17, v03.f40376n, bVar2);
                                                        c3504ku4.f32447w = str2;
                                                        Lv lv = new Lv(c3504ku4);
                                                        int i12 = v03.f40379w;
                                                        ev.f25435g.getClass();
                                                        c3557lt.l(i12, System.currentTimeMillis(), lv, "2");
                                                        return z9;
                                                    }
                                                }
                                            }
                                            fv = null;
                                            bVar = a10;
                                            ev = ev2;
                                            hashMap = hashMap3;
                                            hashMap3 = hashMap3;
                                            if (fv != null) {
                                            }
                                        }
                                    }
                                }
                                v03 = v02;
                                Qv qv2 = ev2.f25430b;
                                qv2.getClass();
                                a9 = m2.b.a(v03.f40377u);
                                if (a9 != null) {
                                }
                                fv = null;
                                bVar = a10;
                                ev = ev2;
                                hashMap = hashMap3;
                                hashMap3 = hashMap3;
                                if (fv != null) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
        }
        z6 = false;
        return z6;
    }

    public final boolean c4(int i, String str) {
        Lv lv;
        m2.b a9 = m2.b.a(i);
        if (a9 == null) {
            return false;
        }
        Ev ev = this.f26564u;
        ev.f25435g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = ev.f25429a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(a9)) {
                    return false;
                }
                Fv fv = (Fv) ((Map) hashMap.get(a9)).get(str);
                String o4 = fv == null ? null : fv.o();
                boolean z6 = o4 != null && a9.equals(fv.q());
                Long valueOf = z6 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (fv == null) {
                    lv = null;
                } else {
                    C3504ku c3504ku = new C3504ku(17, fv.r(), a9);
                    c3504ku.f32447w = str;
                    lv = new Lv(c3504ku);
                }
                ev.f25431c.v(fv == null ? 0 : fv.s(), fv != null ? fv.t() : 0, currentTimeMillis, valueOf, o4, lv, "2");
                return z6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s2.S
    public final void U0(BinderC3487kd binderC3487kd) {
    }
}

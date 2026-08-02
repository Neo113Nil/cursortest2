package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.anythink.core.c.b.e;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4938j0;
import s2.InterfaceC4942l0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.pn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3767pn extends AbstractBinderC3359i8 implements InterfaceC2756Qb {

    /* renamed from: n, reason: collision with root package name */
    public final String f33916n;

    /* renamed from: u, reason: collision with root package name */
    public final C3873rm f33917u;

    /* renamed from: v, reason: collision with root package name */
    public final C4089vm f33918v;

    /* renamed from: w, reason: collision with root package name */
    public final C3230fo f33919w;

    public BinderC3767pn(String str, C3873rm c3873rm, C4089vm c4089vm, C3230fo c3230fo) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f33916n = str;
        this.f33917u = c3873rm;
        this.f33918v = c4089vm;
        this.f33919w = c3230fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final Y2.a B() {
        Y2.a aVar;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            aVar = c4089vm.f35500q;
        }
        return aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void I() {
        this.f33917u.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3755pb P() {
        InterfaceC3755pb interfaceC3755pb;
        C3981tm c3981tm = this.f33917u.f34497F;
        synchronized (c3981tm) {
            interfaceC3755pb = c3981tm.f35164a;
        }
        return interfaceC3755pb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3862rb interfaceC3862rb;
        double d9;
        String p9;
        String p10;
        Y2.a aVar;
        List list2;
        s2.L0 l02;
        boolean g9;
        C3387ik c3387ik;
        C3387ik c3387ik2;
        int i4 = 0;
        C2722Ob c2722Ob = null;
        C4938j0 c4938j0 = null;
        switch (i) {
            case 2:
                String a9 = this.f33918v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 3:
                C4089vm c4089vm = this.f33918v;
                synchronized (c4089vm) {
                    list = c4089vm.f35489e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String c9 = this.f33918v.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 5:
                C4089vm c4089vm2 = this.f33918v;
                synchronized (c4089vm2) {
                    interfaceC3862rb = c4089vm2.f35502s;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC3862rb);
                return true;
            case 6:
                String e9 = this.f33918v.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 7:
                String f2 = this.f33918v.f();
                parcel2.writeNoException();
                parcel2.writeString(f2);
                return true;
            case 8:
                C4089vm c4089vm3 = this.f33918v;
                synchronized (c4089vm3) {
                    d9 = c4089vm3.f35501r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d9);
                return true;
            case 9:
                C4089vm c4089vm4 = this.f33918v;
                synchronized (c4089vm4) {
                    p9 = c4089vm4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 10:
                C4089vm c4089vm5 = this.f33918v;
                synchronized (c4089vm5) {
                    p10 = c4089vm5.p(e.a.f12854h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 11:
                s2.A0 r9 = this.f33918v.r();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, r9);
                return true;
            case 12:
                String str = this.f33916n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                I();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC3647nb s9 = this.f33918v.s();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, s9);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm = this.f33917u;
                synchronized (c3873rm) {
                    c3873rm.f34503n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                boolean o4 = this.f33917u.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm2 = this.f33917u;
                synchronized (c3873rm2) {
                    c3873rm2.f34503n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                Y2.a y7 = y();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, y7);
                return true;
            case 19:
                C4089vm c4089vm6 = this.f33918v;
                synchronized (c4089vm6) {
                    aVar = c4089vm6.f35500q;
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, aVar);
                return true;
            case 20:
                Bundle d10 = this.f33918v.d();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, d10);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2722Ob = queryLocalInterface instanceof C2722Ob ? (C2722Ob) queryLocalInterface : new C2722Ob(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 1);
                }
                AbstractC3411j8.f(parcel);
                V3(c2722Ob);
                parcel2.writeNoException();
                return true;
            case 22:
                C3873rm c3873rm3 = this.f33917u;
                synchronized (c3873rm3) {
                    c3873rm3.f34503n.m();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List u6 = u();
                parcel2.writeNoException();
                parcel2.writeList(u6);
                return true;
            case 24:
                C4089vm c4089vm7 = this.f33918v;
                synchronized (c4089vm7) {
                    list2 = c4089vm7.f35490f;
                }
                if (!list2.isEmpty()) {
                    synchronized (c4089vm7) {
                        l02 = c4089vm7.f35491g;
                    }
                    if (l02 != null) {
                        i4 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(i4);
                return true;
            case 25:
                InterfaceC4942l0 U32 = s2.L0.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                U3(U32);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c4938j0 = queryLocalInterface2 instanceof C4938j0 ? (C4938j0) queryLocalInterface2 : new C4938j0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 1);
                }
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm4 = this.f33917u;
                synchronized (c3873rm4) {
                    c3873rm4.f34503n.a(c4938j0);
                }
                parcel2.writeNoException();
                return true;
            case 27:
                C3873rm c3873rm5 = this.f33917u;
                synchronized (c3873rm5) {
                    c3873rm5.f34503n.h();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                C3873rm c3873rm6 = this.f33917u;
                synchronized (c3873rm6) {
                    AbstractBinderC3359i8 abstractBinderC3359i8 = c3873rm6.f34512w;
                    if (abstractBinderC3359i8 == null) {
                        int i6 = w2.z.f41712b;
                        x2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        c3873rm6.f34501l.execute(new E2.B(3, c3873rm6, abstractBinderC3359i8 instanceof ViewTreeObserverOnGlobalLayoutListenerC2512Bm));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC3755pb P8 = P();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, P8);
                return true;
            case 30:
                C3873rm c3873rm7 = this.f33917u;
                synchronized (c3873rm7) {
                    g9 = c3873rm7.f34503n.g();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeInt(g9 ? 1 : 0);
                return true;
            case 31:
                InterfaceC4963w0 i02 = i0();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, i02);
                return true;
            case 32:
                InterfaceC4953r0 U33 = s2.U0.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                a1(U33);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                n2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                C3873rm c3873rm8 = this.f33917u;
                long j6 = (c3873rm8 == null || (c3387ik = c3873rm8.f25630j) == null) ? 0L : c3387ik.f31884a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 35:
                long readLong = parcel.readLong();
                AbstractC3411j8.f(parcel);
                C3873rm c3873rm9 = this.f33917u;
                if (c3873rm9 != null && (c3387ik2 = c3873rm9.f25630j) != null) {
                    c3387ik2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void U3(InterfaceC4942l0 interfaceC4942l0) {
        C3873rm c3873rm = this.f33917u;
        synchronized (c3873rm) {
            c3873rm.f34503n.r(interfaceC4942l0);
        }
    }

    public final void V3(C2722Ob c2722Ob) {
        C3873rm c3873rm = this.f33917u;
        synchronized (c3873rm) {
            c3873rm.f34503n.e(c2722Ob);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void a1(InterfaceC4953r0 interfaceC4953r0) {
        try {
            if (!interfaceC4953r0.e()) {
                this.f33919w.b();
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        C3873rm c3873rm = this.f33917u;
        synchronized (c3873rm) {
            c3873rm.f34498G.f25420n.set(interfaceC4953r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String d() {
        return this.f33918v.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final List e() {
        List list;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            list = c4089vm.f35489e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3862rb g() {
        InterfaceC3862rb interfaceC3862rb;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            interfaceC3862rb = c4089vm.f35502s;
        }
        return interfaceC3862rb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String h() {
        return this.f33918v.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC4963w0 i0() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue()) {
            return this.f33917u.f25627f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String j() {
        return this.f33918v.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final double k() {
        double d9;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            d9 = c4089vm.f35501r;
        }
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String l() {
        String p9;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            p9 = c4089vm.p("store");
        }
        return p9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3647nb m() {
        return this.f33918v.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String n() {
        return this.f33918v.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void n2(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ce)).booleanValue()) {
            C3873rm c3873rm = this.f33917u;
            InterfaceC4084vh h3 = c3873rm.f34502m.h();
            if (h3 == null) {
                int i = w2.z.f41712b;
                x2.i.c("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                c3873rm.f34501l.execute(new RunnableC2896Yi(h3, jSONObject));
            } catch (JSONException e9) {
                int i4 = w2.z.f41712b;
                x2.i.d("Error reading event signals", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final s2.A0 p() {
        return this.f33918v.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String q() {
        String p9;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            p9 = c4089vm.p(e.a.f12854h);
        }
        return p9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final List u() {
        List list;
        s2.L0 l02;
        List list2;
        C4089vm c4089vm = this.f33918v;
        synchronized (c4089vm) {
            list = c4089vm.f35490f;
        }
        if (!list.isEmpty()) {
            synchronized (c4089vm) {
                l02 = c4089vm.f35491g;
            }
            if (l02 != null) {
                C4089vm c4089vm2 = this.f33918v;
                synchronized (c4089vm2) {
                    list2 = c4089vm2.f35490f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final Y2.a y() {
        return new Y2.b(this.f33917u);
    }
}

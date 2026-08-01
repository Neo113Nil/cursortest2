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
import q2.C4889j0;
import q2.InterfaceC4893l0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3690on extends AbstractBinderC3336i8 implements InterfaceC2736Qb {

    /* renamed from: n, reason: collision with root package name */
    public final String f32941n;

    /* renamed from: u, reason: collision with root package name */
    public final C3797qm f32942u;

    /* renamed from: v, reason: collision with root package name */
    public final C4012um f32943v;

    /* renamed from: w, reason: collision with root package name */
    public final C3153eo f32944w;

    public BinderC3690on(String str, C3797qm c3797qm, C4012um c4012um, C3153eo c3153eo) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f32941n = str;
        this.f32942u = c3797qm;
        this.f32943v = c4012um;
        this.f32944w = c3153eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final W2.a B() {
        W2.a aVar;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            aVar = c4012um.f34579q;
        }
        return aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void J() {
        this.f32942u.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3732pb P() {
        InterfaceC3732pb interfaceC3732pb;
        C3904sm c3904sm = this.f32942u.f33397F;
        synchronized (c3904sm) {
            interfaceC3732pb = c3904sm.f34135a;
        }
        return interfaceC3732pb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3839rb interfaceC3839rb;
        double d2;
        String p9;
        String p10;
        W2.a aVar;
        List list2;
        q2.L0 l02;
        boolean g4;
        C3364ik c3364ik;
        C3364ik c3364ik2;
        int i6 = 0;
        C2702Ob c2702Ob = null;
        C4889j0 c4889j0 = null;
        switch (i) {
            case 2:
                String a9 = this.f32943v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 3:
                C4012um c4012um = this.f32943v;
                synchronized (c4012um) {
                    list = c4012um.f34568e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String c9 = this.f32943v.c();
                parcel2.writeNoException();
                parcel2.writeString(c9);
                return true;
            case 5:
                C4012um c4012um2 = this.f32943v;
                synchronized (c4012um2) {
                    interfaceC3839rb = c4012um2.f34581s;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC3839rb);
                return true;
            case 6:
                String e9 = this.f32943v.e();
                parcel2.writeNoException();
                parcel2.writeString(e9);
                return true;
            case 7:
                String f3 = this.f32943v.f();
                parcel2.writeNoException();
                parcel2.writeString(f3);
                return true;
            case 8:
                C4012um c4012um3 = this.f32943v;
                synchronized (c4012um3) {
                    d2 = c4012um3.f34580r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                C4012um c4012um4 = this.f32943v;
                synchronized (c4012um4) {
                    p9 = c4012um4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 10:
                C4012um c4012um5 = this.f32943v;
                synchronized (c4012um5) {
                    p10 = c4012um5.p(e.a.f12068h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 11:
                q2.A0 r9 = this.f32943v.r();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, r9);
                return true;
            case 12:
                String str = this.f32941n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                J();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC3624nb s9 = this.f32943v.s();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, s9);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm = this.f32942u;
                synchronized (c3797qm) {
                    c3797qm.f33403n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                boolean o6 = this.f32942u.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o6 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm2 = this.f32942u;
                synchronized (c3797qm2) {
                    c3797qm2.f33403n.o(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                W2.a y7 = y();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, y7);
                return true;
            case 19:
                C4012um c4012um6 = this.f32943v;
                synchronized (c4012um6) {
                    aVar = c4012um6.f34579q;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, aVar);
                return true;
            case 20:
                Bundle d9 = this.f32943v.d();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, d9);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2702Ob = queryLocalInterface instanceof C2702Ob ? (C2702Ob) queryLocalInterface : new C2702Ob(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 2);
                }
                AbstractC3388j8.f(parcel);
                V3(c2702Ob);
                parcel2.writeNoException();
                return true;
            case 22:
                C3797qm c3797qm3 = this.f32942u;
                synchronized (c3797qm3) {
                    c3797qm3.f33403n.m();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List u3 = u();
                parcel2.writeNoException();
                parcel2.writeList(u3);
                return true;
            case 24:
                C4012um c4012um7 = this.f32943v;
                synchronized (c4012um7) {
                    list2 = c4012um7.f34569f;
                }
                if (!list2.isEmpty()) {
                    synchronized (c4012um7) {
                        l02 = c4012um7.f34570g;
                    }
                    if (l02 != null) {
                        i6 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(i6);
                return true;
            case 25:
                InterfaceC4893l0 U3 = q2.L0.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                U3(U3);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c4889j0 = queryLocalInterface2 instanceof C4889j0 ? (C4889j0) queryLocalInterface2 : new C4889j0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 2);
                }
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm4 = this.f32942u;
                synchronized (c3797qm4) {
                    c3797qm4.f33403n.q(c4889j0);
                }
                parcel2.writeNoException();
                return true;
            case 27:
                C3797qm c3797qm5 = this.f32942u;
                synchronized (c3797qm5) {
                    c3797qm5.f33403n.h();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                C3797qm c3797qm6 = this.f32942u;
                synchronized (c3797qm6) {
                    AbstractBinderC3336i8 abstractBinderC3336i8 = c3797qm6.f33412w;
                    if (abstractBinderC3336i8 == null) {
                        int i9 = u2.z.f41322b;
                        v2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        c3797qm6.f33401l.execute(new C2.C(3, c3797qm6, abstractBinderC3336i8 instanceof ViewTreeObserverOnGlobalLayoutListenerC2475Am));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC3732pb P8 = P();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, P8);
                return true;
            case 30:
                C3797qm c3797qm7 = this.f32942u;
                synchronized (c3797qm7) {
                    g4 = c3797qm7.f33403n.g();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(g4 ? 1 : 0);
                return true;
            case 31:
                InterfaceC4914w0 i02 = i0();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, i02);
                return true;
            case 32:
                InterfaceC4904r0 U32 = q2.U0.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                h3(U32);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
                AbstractC3388j8.f(parcel);
                s2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                C3797qm c3797qm8 = this.f32942u;
                long j6 = (c3797qm8 == null || (c3364ik = c3797qm8.f24841j) == null) ? 0L : c3364ik.f31114a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 35:
                long readLong = parcel.readLong();
                AbstractC3388j8.f(parcel);
                C3797qm c3797qm9 = this.f32942u;
                if (c3797qm9 != null && (c3364ik2 = c3797qm9.f24841j) != null) {
                    c3364ik2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void U3(InterfaceC4893l0 interfaceC4893l0) {
        C3797qm c3797qm = this.f32942u;
        synchronized (c3797qm) {
            c3797qm.f33403n.b(interfaceC4893l0);
        }
    }

    public final void V3(C2702Ob c2702Ob) {
        C3797qm c3797qm = this.f32942u;
        synchronized (c3797qm) {
            c3797qm.f33403n.e(c2702Ob);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String d() {
        return this.f32943v.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final List e() {
        List list;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            list = c4012um.f34568e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3839rb g() {
        InterfaceC3839rb interfaceC3839rb;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            interfaceC3839rb = c4012um.f34581s;
        }
        return interfaceC3839rb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String h() {
        return this.f32943v.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void h3(InterfaceC4904r0 interfaceC4904r0) {
        try {
            if (!interfaceC4904r0.e()) {
                this.f32944w.b();
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        C3797qm c3797qm = this.f32942u;
        synchronized (c3797qm) {
            c3797qm.f33398G.f24664n.set(interfaceC4904r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC4914w0 i0() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32021F7)).booleanValue()) {
            return this.f32942u.f24838f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String j() {
        return this.f32943v.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final double k() {
        double d2;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            d2 = c4012um.f34580r;
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String l() {
        String p9;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            p9 = c4012um.p("store");
        }
        return p9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3624nb m() {
        return this.f32943v.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String n() {
        return this.f32943v.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final q2.A0 p() {
        return this.f32943v.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String q() {
        String p9;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            p9 = c4012um.p(e.a.f12068h);
        }
        return p9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void s2(Bundle bundle) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ce)).booleanValue()) {
            C3797qm c3797qm = this.f32942u;
            InterfaceC4061vh h9 = c3797qm.f33402m.h();
            if (h9 == null) {
                int i = u2.z.f41322b;
                v2.i.c("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                c3797qm.f33401l.execute(new RunnableC2873Yi(h9, jSONObject));
            } catch (JSONException e9) {
                int i6 = u2.z.f41322b;
                v2.i.d("Error reading event signals", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final List u() {
        List list;
        q2.L0 l02;
        List list2;
        C4012um c4012um = this.f32943v;
        synchronized (c4012um) {
            list = c4012um.f34569f;
        }
        if (!list.isEmpty()) {
            synchronized (c4012um) {
                l02 = c4012um.f34570g;
            }
            if (l02 != null) {
                C4012um c4012um2 = this.f32943v;
                synchronized (c4012um2) {
                    list2 = c4012um2.f34569f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final W2.a y() {
        return new W2.b(this.f32942u);
    }
}

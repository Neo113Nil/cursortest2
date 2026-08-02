package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import s2.InterfaceC4942l0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3166ee extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2756Qb f30743a;

    /* renamed from: c, reason: collision with root package name */
    public final C3113de f30745c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30744b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f30746d = new ArrayList();

    public C3166ee(InterfaceC2756Qb interfaceC2756Qb) {
        new AtomicLong();
        this.f30743a = interfaceC2756Qb;
        C3113de c3113de = null;
        try {
            List e9 = interfaceC2756Qb.e();
            if (e9 != null) {
                for (Object obj : e9) {
                    InterfaceC3862rb U32 = obj instanceof IBinder ? BinderC3379ib.U3((IBinder) obj) : null;
                    if (U32 != null) {
                        this.f30744b.add(new C3113de(U32));
                    }
                }
            }
        } catch (RemoteException e10) {
            x2.i.d("", e10);
        }
        try {
            List u6 = this.f30743a.u();
            if (u6 != null) {
                for (Object obj2 : u6) {
                    InterfaceC4942l0 U33 = obj2 instanceof IBinder ? s2.L0.U3((IBinder) obj2) : null;
                    if (U33 != null) {
                        this.f30746d.add(new F2.b(U33));
                    }
                }
            }
        } catch (RemoteException e11) {
            x2.i.d("", e11);
        }
        try {
            InterfaceC3862rb g9 = this.f30743a.g();
            if (g9 != null) {
                c3113de = new C3113de(g9);
            }
        } catch (RemoteException e12) {
            x2.i.d("", e12);
        }
        this.f30745c = c3113de;
        try {
            if (this.f30743a.m() != null) {
                new C3680o7(this.f30743a.m());
            }
        } catch (RemoteException e13) {
            x2.i.d("", e13);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f30743a.I();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f30743a.j();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f30743a.h();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f30743a.n();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f30743a.d();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C3113de f() {
        return this.f30745c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ArrayList g() {
        return this.f30744b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final s2.N0 h() {
        try {
            InterfaceC2756Qb interfaceC2756Qb = this.f30743a;
            if (interfaceC2756Qb.P() != null) {
                return new s2.N0(interfaceC2756Qb.P());
            }
            return null;
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String i() {
        try {
            return this.f30743a.q();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final m2.s j() {
        InterfaceC4963w0 interfaceC4963w0;
        try {
            interfaceC4963w0 = this.f30743a.i0();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            interfaceC4963w0 = null;
        }
        if (interfaceC4963w0 != null) {
            return new m2.s(interfaceC4963w0);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double k() {
        try {
            double k9 = this.f30743a.k();
            if (k9 == -1.0d) {
                return null;
            }
            return Double.valueOf(k9);
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String l() {
        try {
            return this.f30743a.l();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void m(m2.p pVar) {
        try {
            this.f30743a.a1(new s2.U0(pVar));
        } catch (RemoteException e9) {
            x2.i.d("Failed to setOnPaidEventListener", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Y2.a n() {
        try {
            return this.f30743a.y();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f30743a.n2(bundle);
        } catch (RemoteException e9) {
            x2.i.d("Failed to record native event", e9);
        }
    }
}

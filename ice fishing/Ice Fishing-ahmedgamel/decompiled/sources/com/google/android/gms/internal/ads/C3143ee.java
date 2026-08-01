package com.google.android.gms.internal.ads;

import C2.C0281n;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q2.InterfaceC4893l0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3143ee extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2736Qb f29952a;

    /* renamed from: c, reason: collision with root package name */
    public final C3090de f29954c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29953b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29955d = new ArrayList();

    public C3143ee(InterfaceC2736Qb interfaceC2736Qb) {
        new AtomicLong();
        this.f29952a = interfaceC2736Qb;
        C3090de c3090de = null;
        try {
            List e9 = interfaceC2736Qb.e();
            if (e9 != null) {
                for (Object obj : e9) {
                    InterfaceC3839rb U3 = obj instanceof IBinder ? BinderC3356ib.U3((IBinder) obj) : null;
                    if (U3 != null) {
                        this.f29953b.add(new C3090de(U3));
                    }
                }
            }
        } catch (RemoteException e10) {
            v2.i.d("", e10);
        }
        try {
            List u3 = this.f29952a.u();
            if (u3 != null) {
                for (Object obj2 : u3) {
                    InterfaceC4893l0 U32 = obj2 instanceof IBinder ? q2.L0.U3((IBinder) obj2) : null;
                    if (U32 != null) {
                        this.f29955d.add(new C0281n(U32));
                    }
                }
            }
        } catch (RemoteException e11) {
            v2.i.d("", e11);
        }
        try {
            InterfaceC3839rb g4 = this.f29952a.g();
            if (g4 != null) {
                c3090de = new C3090de(g4);
            }
        } catch (RemoteException e12) {
            v2.i.d("", e12);
        }
        this.f29954c = c3090de;
        try {
            if (this.f29952a.m() != null) {
                new C3657o7(this.f29952a.m());
            }
        } catch (RemoteException e13) {
            v2.i.d("", e13);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f29952a.J();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f29952a.j();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f29952a.h();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f29952a.n();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f29952a.d();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C3090de f() {
        return this.f29954c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ArrayList g() {
        return this.f29953b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final q2.N0 h() {
        try {
            InterfaceC2736Qb interfaceC2736Qb = this.f29952a;
            if (interfaceC2736Qb.P() != null) {
                return new q2.N0(interfaceC2736Qb.P());
            }
            return null;
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String i() {
        try {
            return this.f29952a.q();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final k2.s j() {
        InterfaceC4914w0 interfaceC4914w0;
        try {
            interfaceC4914w0 = this.f29952a.i0();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            interfaceC4914w0 = null;
        }
        if (interfaceC4914w0 != null) {
            return new k2.s(interfaceC4914w0);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double k() {
        try {
            double k9 = this.f29952a.k();
            if (k9 == -1.0d) {
                return null;
            }
            return Double.valueOf(k9);
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String l() {
        try {
            return this.f29952a.l();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void m(k2.p pVar) {
        try {
            this.f29952a.h3(new q2.U0(pVar));
        } catch (RemoteException e9) {
            v2.i.d("Failed to setOnPaidEventListener", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ W2.a n() {
        try {
            return this.f29952a.y();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f29952a.s2(bundle);
        } catch (RemoteException e9) {
            v2.i.d("Failed to record native event", e9);
        }
    }
}

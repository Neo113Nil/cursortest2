package s2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC2684Lo;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.C4295zc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: k, reason: collision with root package name */
    public static J0 f40352k;

    /* renamed from: a, reason: collision with root package name */
    public H0 f40353a;

    /* renamed from: b, reason: collision with root package name */
    public H0 f40354b;

    /* renamed from: c, reason: collision with root package name */
    public H0 f40355c;
    public InterfaceC4932g0 i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f40356d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f40358f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40359g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f40360h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public m2.r f40361j = new m2.r(new ArrayList(), -1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f40357e = new ArrayList();

    static {
        new HashSet(Arrays.asList(m2.b.APP_OPEN_AD, m2.b.INTERSTITIAL, m2.b.REWARDED));
    }

    public static C2889Yb a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((C4295zc) it.next()).f36122n, new C2889Yb(1));
        }
        return new C2889Yb(2);
    }

    public static J0 c() {
        J0 j02;
        synchronized (J0.class) {
            try {
                if (f40352k == null) {
                    f40352k = new J0();
                }
                j02 = f40352k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    public final void b() {
        InterfaceC4932g0 interfaceC4932g0 = this.i;
        if (interfaceC4932g0 == null) {
            return;
        }
        try {
            interfaceC4932g0.d();
            this.i.i3(new Y2.b(null), null);
        } catch (RemoteException e9) {
            x2.i.g("MobileAdsSettingManager initialization failed", e9);
        }
    }

    public final void d(Context context, com.IceFishing.LiveIceFishing.A a9) {
        InterfaceC4932g0 interfaceC4932g0;
        synchronized (this.f40356d) {
            try {
                if (this.f40358f) {
                    if (a9 != null) {
                        this.f40357e.add(a9);
                    }
                    return;
                }
                if (this.f40359g) {
                    if (a9 != null) {
                        e();
                    }
                    return;
                }
                this.f40358f = true;
                if (a9 != null) {
                    this.f40357e.add(a9);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f40360h) {
                    try {
                        if (this.i == null) {
                            this.i = (InterfaceC4932g0) new C4941l(C4949p.f40498g.f40500b, context).d(context, false);
                        }
                        InterfaceC4932g0 interfaceC4932g02 = this.i;
                        if (interfaceC4932g02 != null) {
                            interfaceC4932g02.S3(new BinderC2684Lo(this));
                            this.i.a2(new BinderC3487kd());
                        }
                        m2.r rVar = this.f40361j;
                        if (rVar.f39396a != -1 && (interfaceC4932g0 = this.i) != null) {
                            try {
                                interfaceC4932g0.W1(new W0(rVar));
                            } catch (RemoteException e9) {
                                x2.i.d("Unable to set request configuration parcel.", e9);
                            }
                        }
                    } catch (RemoteException e10) {
                        x2.i.g("MobileAdsSettingManager initialization failed", e10);
                    } finally {
                    }
                    AbstractC3592ma.a(context);
                    if (((Boolean) AbstractC2704Na.f27276a.r()).booleanValue()) {
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Bc)).booleanValue()) {
                            x2.i.a("Initializing on bg thread");
                            final int i = 1;
                            AbstractC5190b.f41850a.execute(new Runnable(this) { // from class: s2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f40351u;

                                {
                                    this.f40351u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            J0 j02 = this.f40351u;
                                            synchronized (j02.f40360h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f40351u;
                                            synchronized (j03.f40360h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f40353a = new H0(context, m2.b.INTERSTITIAL);
                            this.f40354b = new H0(context, m2.b.REWARDED);
                            this.f40355c = new H0(context, m2.b.APP_OPEN_AD);
                        }
                    }
                    if (((Boolean) AbstractC2704Na.f27277b.r()).booleanValue()) {
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Bc)).booleanValue()) {
                            final int i4 = 0;
                            AbstractC5190b.f41851b.execute(new Runnable(this) { // from class: s2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f40351u;

                                {
                                    this.f40351u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i4) {
                                        case 0:
                                            J0 j02 = this.f40351u;
                                            synchronized (j02.f40360h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f40351u;
                                            synchronized (j03.f40360h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f40353a = new H0(context, m2.b.INTERSTITIAL);
                            this.f40354b = new H0(context, m2.b.REWARDED);
                            this.f40355c = new H0(context, m2.b.APP_OPEN_AD);
                        }
                    }
                    x2.i.a("Initializing on calling thread");
                    b();
                    this.f40353a = new H0(context, m2.b.INTERSTITIAL);
                    this.f40354b = new H0(context, m2.b.REWARDED);
                    this.f40355c = new H0(context, m2.b.APP_OPEN_AD);
                }
            } finally {
            }
        }
    }

    public final void e() {
        synchronized (this.f40360h) {
            R2.w.j("MobileAds.initialize() must be called prior to getting initialization status.", this.i != null);
            InterfaceC4932g0 interfaceC4932g0 = this.i;
            if (interfaceC4932g0 == null) {
                return;
            }
            try {
                a(interfaceC4932g0.m());
            } catch (RemoteException unused) {
                x2.i.c("Unable to get Initialization status.");
            }
        }
    }
}

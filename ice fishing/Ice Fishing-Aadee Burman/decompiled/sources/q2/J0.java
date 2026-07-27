package q2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2647Ko;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.C4272zc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: k, reason: collision with root package name */
    public static J0 f40050k;

    /* renamed from: a, reason: collision with root package name */
    public H0 f40051a;

    /* renamed from: b, reason: collision with root package name */
    public H0 f40052b;

    /* renamed from: c, reason: collision with root package name */
    public H0 f40053c;
    public InterfaceC4883g0 i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f40054d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f40056f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40057g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f40058h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public k2.r f40059j = new k2.r(new ArrayList(), -1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f40055e = new ArrayList();

    static {
        new HashSet(Arrays.asList(k2.b.APP_OPEN_AD, k2.b.INTERSTITIAL, k2.b.REWARDED));
    }

    public static C2866Yb a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((C4272zc) it.next()).f35349n, new C2866Yb(1));
        }
        return new C2866Yb(2);
    }

    public static J0 c() {
        J0 j02;
        synchronized (J0.class) {
            try {
                if (f40050k == null) {
                    f40050k = new J0();
                }
                j02 = f40050k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    public final void b() {
        InterfaceC4883g0 interfaceC4883g0 = this.i;
        if (interfaceC4883g0 == null) {
            return;
        }
        try {
            interfaceC4883g0.d();
            this.i.i1(new W2.b(null), null);
        } catch (RemoteException e9) {
            v2.i.g("MobileAdsSettingManager initialization failed", e9);
        }
    }

    public final void d(Context context, com.icefishing.icefishinglive2.z zVar) {
        InterfaceC4883g0 interfaceC4883g0;
        synchronized (this.f40054d) {
            try {
                if (this.f40056f) {
                    if (zVar != null) {
                        this.f40055e.add(zVar);
                    }
                    return;
                }
                if (this.f40057g) {
                    if (zVar != null) {
                        e();
                    }
                    return;
                }
                this.f40056f = true;
                if (zVar != null) {
                    this.f40055e.add(zVar);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f40058h) {
                    try {
                        if (this.i == null) {
                            this.i = (InterfaceC4883g0) new C4892l(C4900p.f40196g.f40198b, context).d(context, false);
                        }
                        InterfaceC4883g0 interfaceC4883g02 = this.i;
                        if (interfaceC4883g02 != null) {
                            interfaceC4883g02.S3(new BinderC2647Ko(this));
                            this.i.c2(new BinderC3464kd());
                        }
                        k2.r rVar = this.f40059j;
                        if (rVar.f38607a != -1 && (interfaceC4883g0 = this.i) != null) {
                            try {
                                interfaceC4883g0.i2(new W0(rVar));
                            } catch (RemoteException e9) {
                                v2.i.d("Unable to set request configuration parcel.", e9);
                            }
                        }
                    } catch (RemoteException e10) {
                        v2.i.g("MobileAdsSettingManager initialization failed", e10);
                    } finally {
                    }
                    AbstractC3569ma.a(context);
                    if (((Boolean) AbstractC2684Na.f26493a.r()).booleanValue()) {
                        if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Bc)).booleanValue()) {
                            v2.i.a("Initializing on bg thread");
                            final int i = 1;
                            AbstractC5111b.f41393a.execute(new Runnable(this) { // from class: q2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f40049u;

                                {
                                    this.f40049u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            J0 j02 = this.f40049u;
                                            synchronized (j02.f40058h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f40049u;
                                            synchronized (j03.f40058h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f40051a = new H0(context, k2.b.INTERSTITIAL);
                            this.f40052b = new H0(context, k2.b.REWARDED);
                            this.f40053c = new H0(context, k2.b.APP_OPEN_AD);
                        }
                    }
                    if (((Boolean) AbstractC2684Na.f26494b.r()).booleanValue()) {
                        if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Bc)).booleanValue()) {
                            final int i6 = 0;
                            AbstractC5111b.f41394b.execute(new Runnable(this) { // from class: q2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f40049u;

                                {
                                    this.f40049u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i6) {
                                        case 0:
                                            J0 j02 = this.f40049u;
                                            synchronized (j02.f40058h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f40049u;
                                            synchronized (j03.f40058h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f40051a = new H0(context, k2.b.INTERSTITIAL);
                            this.f40052b = new H0(context, k2.b.REWARDED);
                            this.f40053c = new H0(context, k2.b.APP_OPEN_AD);
                        }
                    }
                    v2.i.a("Initializing on calling thread");
                    b();
                    this.f40051a = new H0(context, k2.b.INTERSTITIAL);
                    this.f40052b = new H0(context, k2.b.REWARDED);
                    this.f40053c = new H0(context, k2.b.APP_OPEN_AD);
                }
            } finally {
            }
        }
    }

    public final void e() {
        synchronized (this.f40058h) {
            P2.w.j("MobileAds.initialize() must be called prior to getting initialization status.", this.i != null);
            InterfaceC4883g0 interfaceC4883g0 = this.i;
            if (interfaceC4883g0 == null) {
                return;
            }
            try {
                a(interfaceC4883g0.m());
            } catch (RemoteException unused) {
                v2.i.c("Unable to get Initialization status.");
            }
        }
    }
}

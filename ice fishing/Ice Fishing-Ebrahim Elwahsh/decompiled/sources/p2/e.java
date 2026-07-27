package p2;

import B2.D;
import B2.y;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.AbstractC3035cL;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3075d6;
import com.google.android.gms.internal.ads.C3077d8;
import com.google.android.gms.internal.ads.C3129e6;
import com.google.android.gms.internal.ads.C3130e7;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3294h7;
import com.google.android.gms.internal.ads.C3562m7;
import com.google.android.gms.internal.ads.C3615n6;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3761pr;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.Dw;
import com.google.android.gms.internal.ads.E0;
import com.google.android.gms.internal.ads.Ew;
import com.google.android.gms.internal.ads.InterfaceC3240g7;
import com.google.android.gms.internal.ads.K6;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.O6;
import com.google.android.gms.internal.ads.P6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.Zw;
import g1.C4524d;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4907p;
import q2.r;
import t2.C;
import t2.G;
import u2.C5107a;

/* loaded from: classes.dex */
public final class e implements Runnable, InterfaceC3240g7 {

    /* renamed from: I, reason: collision with root package name */
    public static final long f39765I = System.currentTimeMillis();

    /* renamed from: A, reason: collision with root package name */
    public final Dw f39766A;

    /* renamed from: B, reason: collision with root package name */
    public Context f39767B;

    /* renamed from: C, reason: collision with root package name */
    public final Context f39768C;

    /* renamed from: D, reason: collision with root package name */
    public C5107a f39769D;

    /* renamed from: E, reason: collision with root package name */
    public final C5107a f39770E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f39771F;

    /* renamed from: H, reason: collision with root package name */
    public int f39773H;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39777w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39778x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f39779y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f39780z;

    /* renamed from: n, reason: collision with root package name */
    public final Vector f39774n = new Vector();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f39775u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f39776v = new AtomicReference();

    /* renamed from: G, reason: collision with root package name */
    public final CountDownLatch f39772G = new CountDownLatch(1);

    public e(Context context, C5107a c5107a) {
        this.f39767B = context;
        this.f39768C = context;
        this.f39769D = c5107a;
        this.f39770E = c5107a;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f39780z = newCachedThreadPool;
        C3151ea c3151ea = AbstractC3368ia.f31700j3;
        r rVar = r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        this.f39771F = booleanValue;
        this.f39766A = Dw.a(context, newCachedThreadPool, booleanValue);
        C3151ea c3151ea2 = AbstractC3368ia.f31672g3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        this.f39778x = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
        this.f39779y = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31710k3)).booleanValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31691i3)).booleanValue()) {
            this.f39773H = 2;
        } else {
            this.f39773H = 1;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31747o4)).booleanValue()) {
            this.f39777w = l();
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31711k4)).booleanValue()) {
            AbstractC3212fg.f30738a.execute(this);
            return;
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC3212fg.f30738a.execute(this);
        } else {
            run();
        }
    }

    public static final C3130e7 p(Context context, C5107a c5107a, boolean z8, boolean z9) {
        C3130e7 m8;
        C3075d6 E8 = C3129e6.E();
        E8.h();
        ((C3129e6) E8.f30000u).G(z8);
        String str = c5107a.f41217n;
        E8.h();
        ((C3129e6) E8.f30000u).F(str);
        C3129e6 c3129e6 = (C3129e6) E8.j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (C3130e7.class) {
            Ew ew = new Ew();
            ew.f24857b = false;
            byte b9 = (byte) (ew.f24861f | 1);
            ew.f24858c = true;
            ew.f24859d = 100L;
            ew.f24860e = 300L;
            ew.f24861f = (byte) (((byte) (((byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8)) | 16)) | 32);
            String A8 = c3129e6.A();
            if (A8 == null) {
                throw new NullPointerException("Null clientVersion");
            }
            ew.f24856a = A8;
            ew.f24857b = c3129e6.B();
            ew.f24861f = (byte) (ew.f24861f | 1);
            m8 = C3130e7.m(context, Executors.newCachedThreadPool(), ew.a(), z9);
        }
        return m8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void a(int i, int i4, int i9) {
        InterfaceC3240g7 o9 = o();
        if (o9 == null) {
            this.f39774n.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9)});
            return;
        }
        m();
        try {
            o9.a(i, i4, i9);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void b(MotionEvent motionEvent) {
        InterfaceC3240g7 o9 = o();
        if (o9 == null) {
            this.f39774n.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            o9.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        InterfaceC3240g7 o9 = o();
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
            G g9 = j.f39798C.f39803c;
            G.j(4, view);
        }
        if (o9 == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o9.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String d(Context context) {
        try {
            return (String) C3686oN.p(new y(1, this, context), this.f39780z).get(((Integer) r.f40116e.f40119c.a(AbstractC3368ia.x3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f39770E.f41217n;
            long j9 = f39765I;
            try {
                K6 A8 = L6.A();
                A8.h();
                ((L6) A8.f30000u).C(str);
                A8.h();
                ((L6) A8.f30000u).B("0.828153725");
                String packageName = context.getPackageName();
                A8.h();
                ((L6) A8.f30000u).E(packageName);
                long currentTimeMillis = (System.currentTimeMillis() - j9) / 1000;
                A8.h();
                ((L6) A8.f30000u).G(currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                A8.h();
                ((L6) A8.f30000u).D(currentTimeMillis2);
                try {
                    long j10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    A8.h();
                    ((L6) A8.f30000u).F(j10);
                } catch (PackageManager.NameNotFoundException unused3) {
                    A8.h();
                    ((L6) A8.f30000u).F(-1L);
                }
                O6 b9 = V6.b(null, ((L6) A8.j()).b());
                b9.h();
                ((P6) b9.f30000u).D(5);
                b9.h();
                ((P6) b9.f30000u).E(2);
                return Base64.encodeToString(((P6) b9.j()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        InterfaceC3240g7 o9;
        InterfaceC3240g7 o10;
        try {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31420D3)).booleanValue()) {
                if (this.f39772G.getCount() != 0 || (o10 = o()) == null) {
                    return;
                }
                o10.e(stackTraceElementArr);
                return;
            }
            if (!j() || (o9 = o()) == null) {
                return;
            }
            o9.e(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void g(View view) {
        InterfaceC3240g7 o9 = o();
        if (o9 != null) {
            try {
                o9.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String i(Context context, View view, Activity activity) {
        C3151ea c3151ea = AbstractC3368ia.ac;
        r rVar = r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        try {
            if (!booleanValue) {
                InterfaceC3240g7 o9 = o();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.bc)).booleanValue()) {
                    G g9 = j.f39798C.f39803c;
                    G.j(2, view);
                }
                return o9 != null ? o9.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            InterfaceC3240g7 o10 = o();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.bc)).booleanValue()) {
                G g10 = j.f39798C.f39803c;
                G.j(2, view);
            }
            return o10 != null ? o10.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() {
        try {
            this.f39772G.await();
            return true;
        } catch (InterruptedException e6) {
            int i = C.f40822b;
            u2.i.g("Interrupted during GADSignals creation.", e6);
            return false;
        }
    }

    public final String k(Context context) {
        InterfaceC3240g7 o9;
        if (!j() || (o9 = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o9.f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() {
        Context context = this.f39767B;
        C4524d c4524d = new C4524d(this);
        Dw dw = this.f39766A;
        Zw zw = new Zw(this.f39767B, AbstractC3035cL.q(context, dw), c4524d, ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31682h3)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (Zw.f29109y) {
            try {
                C3077d8 r9 = zw.r(1);
                if (r9 == null) {
                    zw.p(4025, currentTimeMillis);
                    return false;
                }
                File j9 = zw.j(r9.A());
                if (!new File(j9, "pcam.jar").exists()) {
                    zw.p(4026, currentTimeMillis);
                    return false;
                }
                if (new File(j9, "pcbc").exists()) {
                    zw.p(5019, currentTimeMillis);
                    return true;
                }
                zw.p(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        Vector vector = this.f39774n;
        InterfaceC3240g7 o9 = o();
        if (vector.isEmpty() || o9 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    o9.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    o9.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z8) {
        String str = this.f39769D.f41217n;
        Context context = this.f39767B;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        C3075d6 E8 = C3129e6.E();
        E8.h();
        ((C3129e6) E8.f30000u).G(z8);
        E8.h();
        ((C3129e6) E8.f30000u).F(str);
        o oVar = new o((C3129e6) E8.j());
        synchronized (C3294h7.class) {
            if (!C3294h7.f31178R) {
                C3294h7.f31179S = System.currentTimeMillis() / 1000;
                C3294h7.f31176P = C3294h7.n(context, oVar.f23623u);
                C3294h7.f31180T = C3562m7.g(context);
                ExecutorService executorService = C3294h7.f31176P.f34930b;
                C3294h7.f31181U = D7.a(context, executorService);
                C3294h7.f31182V = new E0();
                C3761pr c3761pr = new C3761pr(context, executorService);
                C3294h7.f31184X = c3761pr;
                C3294h7.f31183W = new C4017ue(context, executorService, (C3615n6) oVar.f23625w, c3761pr);
                C3294h7.f31178R = true;
            }
        }
        this.f39775u.set(new C3294h7(context, oVar));
    }

    public final InterfaceC3240g7 o() {
        return ((!this.f39778x || this.f39777w) ? this.f39773H : 1) == 2 ? (InterfaceC3240g7) this.f39776v.get() : (InterfaceC3240g7) this.f39775u.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            C3151ea c3151ea = AbstractC3368ia.f31747o4;
            r rVar = r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                this.f39777w = l();
            }
            boolean z9 = this.f39769D.f41220w;
            boolean z10 = false;
            if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.E1)).booleanValue() && z9) {
                z10 = true;
            }
            if (((!this.f39778x || this.f39777w) ? this.f39773H : 1) == 1) {
                n(z10);
                if (this.f39773H == 2) {
                    this.f39780z.execute(new D(5, this, z10));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C3130e7 p6 = p(this.f39767B, this.f39769D, z10, this.f39771F);
                    this.f39776v.set(p6);
                    if (this.f39779y) {
                        synchronized (p6) {
                            z8 = p6.J;
                        }
                        if (!z8) {
                            this.f39773H = 1;
                            n(z10);
                        }
                    }
                } catch (NullPointerException e6) {
                    this.f39773H = 1;
                    n(z10);
                    this.f39766A.c(2031, System.currentTimeMillis() - currentTimeMillis, e6);
                }
            }
            this.f39772G.countDown();
            this.f39767B = null;
            this.f39769D = null;
        } catch (Throwable th) {
            this.f39772G.countDown();
            this.f39767B = null;
            this.f39769D = null;
            throw th;
        }
    }
}

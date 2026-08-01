package p2;

import C2.C;
import C2.x;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.manager.p;
import com.google.android.gms.internal.ads.AbstractC3043cl;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3227g7;
import com.google.android.gms.internal.ads.C3228g8;
import com.google.android.gms.internal.ads.C3280h6;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3334i6;
import com.google.android.gms.internal.ads.C3387j7;
import com.google.android.gms.internal.ads.C3657o7;
import com.google.android.gms.internal.ads.C3694or;
import com.google.android.gms.internal.ads.C3764q6;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.Cw;
import com.google.android.gms.internal.ads.Dw;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.F0;
import com.google.android.gms.internal.ads.InterfaceC3335i7;
import com.google.android.gms.internal.ads.N6;
import com.google.android.gms.internal.ads.O6;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.R6;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import com.google.android.gms.internal.ads.Xw;
import com.google.android.gms.internal.ads.Z6;
import g1.C4522b;
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
import q2.C4900p;
import q2.r;
import u2.D;
import u2.z;
import v2.C5110a;

/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4830e implements Runnable, InterfaceC3335i7 {

    /* renamed from: I, reason: collision with root package name */
    public static final long f39700I = System.currentTimeMillis();

    /* renamed from: A, reason: collision with root package name */
    public final Cw f39701A;

    /* renamed from: B, reason: collision with root package name */
    public Context f39702B;

    /* renamed from: C, reason: collision with root package name */
    public final Context f39703C;

    /* renamed from: D, reason: collision with root package name */
    public C5110a f39704D;

    /* renamed from: E, reason: collision with root package name */
    public final C5110a f39705E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f39706F;

    /* renamed from: H, reason: collision with root package name */
    public int f39708H;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39712w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39713x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f39714y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f39715z;

    /* renamed from: n, reason: collision with root package name */
    public final Vector f39709n = new Vector();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f39710u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f39711v = new AtomicReference();

    /* renamed from: G, reason: collision with root package name */
    public final CountDownLatch f39707G = new CountDownLatch(1);

    public RunnableC4830e(Context context, C5110a c5110a) {
        this.f39702B = context;
        this.f39703C = context;
        this.f39704D = c5110a;
        this.f39705E = c5110a;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f39715z = newCachedThreadPool;
        C3301ha c3301ha = AbstractC3569ma.f32281j3;
        r rVar = r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        this.f39706F = booleanValue;
        this.f39701A = Cw.a(context, newCachedThreadPool, booleanValue);
        C3301ha c3301ha2 = AbstractC3569ma.f32254g3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        this.f39713x = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
        this.f39714y = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32290k3)).booleanValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32272i3)).booleanValue()) {
            this.f39708H = 2;
        } else {
            this.f39708H = 1;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32328o4)).booleanValue()) {
            this.f39712w = l();
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32291k4)).booleanValue()) {
            AbstractC3413jg.f31268a.execute(this);
            return;
        }
        v2.d dVar = C4900p.f40199g.f40200a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC3413jg.f31268a.execute(this);
        } else {
            run();
        }
    }

    public static final C3227g7 p(Context context, C5110a c5110a, boolean z3, boolean z6) {
        C3227g7 m4;
        C3280h6 E8 = C3334i6.E();
        E8.h();
        ((C3334i6) E8.f27721u).G(z3);
        String str = c5110a.f41391n;
        E8.h();
        ((C3334i6) E8.f27721u).F(str);
        C3334i6 c3334i6 = (C3334i6) E8.j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (C3227g7.class) {
            Dw dw = new Dw();
            dw.f24491b = false;
            byte b9 = (byte) (dw.f24495f | 1);
            dw.f24492c = true;
            dw.f24493d = 100L;
            dw.f24494e = 300L;
            dw.f24495f = (byte) (((byte) (((byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8)) | 16)) | 32);
            String A9 = c3334i6.A();
            if (A9 == null) {
                throw new NullPointerException("Null clientVersion");
            }
            dw.f24490a = A9;
            dw.f24491b = c3334i6.B();
            dw.f24495f = (byte) (dw.f24495f | 1);
            m4 = C3227g7.m(context, Executors.newCachedThreadPool(), dw.a(), z6);
        }
        return m4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void a(int i, int i6, int i9) {
        InterfaceC3335i7 o6 = o();
        if (o6 == null) {
            this.f39709n.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i9)});
            return;
        }
        m();
        try {
            o6.a(i, i6, i9);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void b(MotionEvent motionEvent) {
        InterfaceC3335i7 o6 = o();
        if (o6 == null) {
            this.f39709n.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            o6.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        InterfaceC3335i7 o6 = o();
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.bc)).booleanValue()) {
            D d2 = C4835j.f39733C.f39738c;
            D.j(4, view);
        }
        if (o6 == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o6.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String d(Context context) {
        try {
            return (String) QC.o(new x(15, this, context), this.f39715z).get(((Integer) r.f40207e.f40210c.a(AbstractC3569ma.f32410x3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f39705E.f41391n;
            long j6 = f39700I;
            try {
                N6 A9 = O6.A();
                A9.h();
                ((O6) A9.f27721u).C(str);
                A9.h();
                ((O6) A9.f27721u).B("0.828153725");
                String packageName = context.getPackageName();
                A9.h();
                ((O6) A9.f27721u).E(packageName);
                long currentTimeMillis = (System.currentTimeMillis() - j6) / 1000;
                A9.h();
                ((O6) A9.f27721u).G(currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                A9.h();
                ((O6) A9.f27721u).D(currentTimeMillis2);
                try {
                    long j9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    A9.h();
                    ((O6) A9.f27721u).F(j9);
                } catch (PackageManager.NameNotFoundException unused3) {
                    A9.h();
                    ((O6) A9.f27721u).F(-1L);
                }
                R6 b9 = Z6.b(null, ((O6) A9.j()).b());
                b9.h();
                ((S6) b9.f27721u).D(5);
                b9.h();
                ((S6) b9.f27721u).E(2);
                return Base64.encodeToString(((S6) b9.j()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        InterfaceC3335i7 o6;
        InterfaceC3335i7 o9;
        try {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32000D3)).booleanValue()) {
                if (this.f39707G.getCount() != 0 || (o9 = o()) == null) {
                    return;
                }
                o9.e(stackTraceElementArr);
                return;
            }
            if (!j() || (o6 = o()) == null) {
                return;
            }
            o6.e(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void g(View view) {
        InterfaceC3335i7 o6 = o();
        if (o6 != null) {
            try {
                o6.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String i(Context context, View view, Activity activity) {
        C3301ha c3301ha = AbstractC3569ma.ac;
        r rVar = r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        try {
            if (!booleanValue) {
                InterfaceC3335i7 o6 = o();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.bc)).booleanValue()) {
                    D d2 = C4835j.f39733C.f39738c;
                    D.j(2, view);
                }
                return o6 != null ? o6.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            InterfaceC3335i7 o9 = o();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.bc)).booleanValue()) {
                D d9 = C4835j.f39733C.f39738c;
                D.j(2, view);
            }
            return o9 != null ? o9.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() {
        try {
            this.f39707G.await();
            return true;
        } catch (InterruptedException e9) {
            int i = z.f41322b;
            v2.i.g("Interrupted during GADSignals creation.", e9);
            return false;
        }
    }

    public final String k(Context context) {
        InterfaceC3335i7 o6;
        if (!j() || (o6 = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o6.f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() {
        Context context = this.f39702B;
        C4522b c4522b = new C4522b(this);
        Cw cw = this.f39701A;
        Xw xw = new Xw(this.f39702B, AbstractC3043cl.r(context, cw), c4522b, ((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32263h3)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (Xw.f28605y) {
            try {
                C3228g8 r9 = xw.r(1);
                if (r9 == null) {
                    xw.p(4025, currentTimeMillis);
                    return false;
                }
                File j6 = xw.j(r9.A());
                if (!new File(j6, "pcam.jar").exists()) {
                    xw.p(4026, currentTimeMillis);
                    return false;
                }
                if (new File(j6, "pcbc").exists()) {
                    xw.p(5019, currentTimeMillis);
                    return true;
                }
                xw.p(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        Vector vector = this.f39709n;
        InterfaceC3335i7 o6 = o();
        if (vector.isEmpty() || o6 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    o6.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    o6.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z3) {
        String str = this.f39704D.f41391n;
        Context context = this.f39702B;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        C3280h6 E8 = C3334i6.E();
        E8.h();
        ((C3334i6) E8.f27721u).G(z3);
        E8.h();
        ((C3334i6) E8.f27721u).F(str);
        p pVar = new p((C3334i6) E8.j());
        synchronized (C3387j7.class) {
            if (!C3387j7.f31171R) {
                C3387j7.f31172S = System.currentTimeMillis() / 1000;
                C3387j7.f31169P = C3387j7.n(context, pVar.f23469u);
                C3387j7.f31173T = C3657o7.b(context);
                ExecutorService executorService = C3387j7.f31169P.f35096b;
                C3387j7.f31174U = E7.a(context, executorService);
                C3387j7.f31175V = new F0();
                C3694or c3694or = new C3694or(context, executorService);
                C3387j7.f31177X = c3694or;
                C3387j7.f31176W = new C4274ze(context, executorService, (C3764q6) pVar.f23471w, c3694or);
                C3387j7.f31171R = true;
            }
        }
        this.f39710u.set(new C3387j7(context, pVar));
    }

    public final InterfaceC3335i7 o() {
        return ((!this.f39713x || this.f39712w) ? this.f39708H : 1) == 2 ? (InterfaceC3335i7) this.f39711v.get() : (InterfaceC3335i7) this.f39710u.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            C3301ha c3301ha = AbstractC3569ma.f32328o4;
            r rVar = r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                this.f39712w = l();
            }
            boolean z6 = this.f39704D.f41394w;
            boolean z9 = false;
            if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.E1)).booleanValue() && z6) {
                z9 = true;
            }
            if (((!this.f39713x || this.f39712w) ? this.f39708H : 1) == 1) {
                n(z9);
                if (this.f39708H == 2) {
                    this.f39715z.execute(new C(5, this, z9));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C3227g7 p9 = p(this.f39702B, this.f39704D, z9, this.f39706F);
                    this.f39711v.set(p9);
                    if (this.f39714y) {
                        synchronized (p9) {
                            z3 = p9.J;
                        }
                        if (!z3) {
                            this.f39708H = 1;
                            n(z9);
                        }
                    }
                } catch (NullPointerException e9) {
                    this.f39708H = 1;
                    n(z9);
                    this.f39701A.c(2031, System.currentTimeMillis() - currentTimeMillis, e9);
                }
            }
            this.f39707G.countDown();
            this.f39702B = null;
            this.f39704D = null;
        } catch (Throwable th) {
            this.f39707G.countDown();
            this.f39702B = null;
            this.f39704D = null;
            throw th;
        }
    }
}

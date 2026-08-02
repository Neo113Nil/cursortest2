package r2;

import E2.B;
import E2.w;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.AbstractC3066cl;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3250g7;
import com.google.android.gms.internal.ads.C3251g8;
import com.google.android.gms.internal.ads.C3303h6;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3357i6;
import com.google.android.gms.internal.ads.C3410j7;
import com.google.android.gms.internal.ads.C3680o7;
import com.google.android.gms.internal.ads.C3717or;
import com.google.android.gms.internal.ads.C3787q6;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.Cw;
import com.google.android.gms.internal.ads.Dw;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.F0;
import com.google.android.gms.internal.ads.InterfaceC3358i7;
import com.google.android.gms.internal.ads.N6;
import com.google.android.gms.internal.ads.O6;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.R6;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import com.google.android.gms.internal.ads.Xw;
import com.google.android.gms.internal.ads.Z6;
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
import s2.C4949p;
import s2.r;
import w2.D;
import w2.z;
import x2.C5189a;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4901f implements Runnable, InterfaceC3358i7 {

    /* renamed from: I, reason: collision with root package name */
    public static final long f40153I = System.currentTimeMillis();

    /* renamed from: A, reason: collision with root package name */
    public final Cw f40154A;

    /* renamed from: B, reason: collision with root package name */
    public Context f40155B;

    /* renamed from: C, reason: collision with root package name */
    public final Context f40156C;

    /* renamed from: D, reason: collision with root package name */
    public C5189a f40157D;

    /* renamed from: E, reason: collision with root package name */
    public final C5189a f40158E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f40159F;

    /* renamed from: H, reason: collision with root package name */
    public int f40161H;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40165w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40166x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40167y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f40168z;

    /* renamed from: n, reason: collision with root package name */
    public final Vector f40162n = new Vector();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f40163u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f40164v = new AtomicReference();

    /* renamed from: G, reason: collision with root package name */
    public final CountDownLatch f40160G = new CountDownLatch(1);

    public RunnableC4901f(Context context, C5189a c5189a) {
        this.f40155B = context;
        this.f40156C = context;
        this.f40157D = c5189a;
        this.f40158E = c5189a;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f40168z = newCachedThreadPool;
        C3324ha c3324ha = AbstractC3592ma.f33060j3;
        r rVar = r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        this.f40159F = booleanValue;
        this.f40154A = Cw.a(context, newCachedThreadPool, booleanValue);
        C3324ha c3324ha2 = AbstractC3592ma.f33034g3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        this.f40166x = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
        this.f40167y = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33069k3)).booleanValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33052i3)).booleanValue()) {
            this.f40161H = 2;
        } else {
            this.f40161H = 1;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.o4)).booleanValue()) {
            this.f40165w = l();
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33070k4)).booleanValue()) {
            AbstractC3436jg.f32055a.execute(this);
            return;
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC3436jg.f32055a.execute(this);
        } else {
            run();
        }
    }

    public static final C3250g7 p(Context context, C5189a c5189a, boolean z6, boolean z9) {
        C3250g7 m9;
        C3303h6 E8 = C3357i6.E();
        E8.h();
        ((C3357i6) E8.f28504u).G(z6);
        String str = c5189a.f41845n;
        E8.h();
        ((C3357i6) E8.f28504u).F(str);
        C3357i6 c3357i6 = (C3357i6) E8.j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (C3250g7.class) {
            Dw dw = new Dw();
            dw.f25252b = false;
            byte b9 = (byte) (dw.f25256f | 1);
            dw.f25253c = true;
            dw.f25254d = 100L;
            dw.f25255e = 300L;
            dw.f25256f = (byte) (((byte) (((byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8)) | 16)) | 32);
            String A9 = c3357i6.A();
            if (A9 == null) {
                throw new NullPointerException("Null clientVersion");
            }
            dw.f25251a = A9;
            dw.f25252b = c3357i6.B();
            dw.f25256f = (byte) (dw.f25256f | 1);
            m9 = C3250g7.m(context, Executors.newCachedThreadPool(), dw.a(), z9);
        }
        return m9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void a(int i, int i4, int i6) {
        InterfaceC3358i7 o4 = o();
        if (o4 == null) {
            this.f40162n.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6)});
            return;
        }
        m();
        try {
            o4.a(i, i4, i6);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void b(MotionEvent motionEvent) {
        InterfaceC3358i7 o4 = o();
        if (o4 == null) {
            this.f40162n.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            o4.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        InterfaceC3358i7 o4 = o();
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
            D d9 = C4906k.f40186C.f40191c;
            D.j(4, view);
        }
        if (o4 == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o4.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String d(Context context) {
        try {
            return (String) QC.o(new w(15, this, context), this.f40168z).get(((Integer) r.f40506e.f40509c.a(AbstractC3592ma.f33189x3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f40158E.f41845n;
            long j6 = f40153I;
            try {
                N6 A9 = O6.A();
                A9.h();
                ((O6) A9.f28504u).C(str);
                A9.h();
                ((O6) A9.f28504u).B("0.828153725");
                String packageName = context.getPackageName();
                A9.h();
                ((O6) A9.f28504u).E(packageName);
                long currentTimeMillis = (System.currentTimeMillis() - j6) / 1000;
                A9.h();
                ((O6) A9.f28504u).G(currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                A9.h();
                ((O6) A9.f28504u).D(currentTimeMillis2);
                try {
                    long j9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    A9.h();
                    ((O6) A9.f28504u).F(j9);
                } catch (PackageManager.NameNotFoundException unused3) {
                    A9.h();
                    ((O6) A9.f28504u).F(-1L);
                }
                R6 b9 = Z6.b(null, ((O6) A9.j()).b());
                b9.h();
                ((S6) b9.f28504u).D(5);
                b9.h();
                ((S6) b9.f28504u).E(2);
                return Base64.encodeToString(((S6) b9.j()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        InterfaceC3358i7 o4;
        InterfaceC3358i7 o6;
        try {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32780D3)).booleanValue()) {
                if (this.f40160G.getCount() != 0 || (o6 = o()) == null) {
                    return;
                }
                o6.e(stackTraceElementArr);
                return;
            }
            if (!j() || (o4 = o()) == null) {
                return;
            }
            o4.e(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void g(View view) {
        InterfaceC3358i7 o4 = o();
        if (o4 != null) {
            try {
                o4.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String i(Context context, View view, Activity activity) {
        C3324ha c3324ha = AbstractC3592ma.ac;
        r rVar = r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        try {
            if (!booleanValue) {
                InterfaceC3358i7 o4 = o();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.bc)).booleanValue()) {
                    D d9 = C4906k.f40186C.f40191c;
                    D.j(2, view);
                }
                return o4 != null ? o4.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            InterfaceC3358i7 o6 = o();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.bc)).booleanValue()) {
                D d10 = C4906k.f40186C.f40191c;
                D.j(2, view);
            }
            return o6 != null ? o6.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() {
        try {
            this.f40160G.await();
            return true;
        } catch (InterruptedException e9) {
            int i = z.f41712b;
            x2.i.g("Interrupted during GADSignals creation.", e9);
            return false;
        }
    }

    public final String k(Context context) {
        InterfaceC3358i7 o4;
        if (!j() || (o4 = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return o4.f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() {
        Context context = this.f40155B;
        C4900e c4900e = new C4900e(this);
        Cw cw = this.f40154A;
        Xw xw = new Xw(this.f40155B, AbstractC3066cl.r(context, cw), c4900e, ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.h3)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (Xw.f29382y) {
            try {
                C3251g8 r9 = xw.r(1);
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
        Vector vector = this.f40162n;
        InterfaceC3358i7 o4 = o();
        if (vector.isEmpty() || o4 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    o4.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    o4.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z6) {
        String str = this.f40157D.f41845n;
        Context context = this.f40155B;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        C3303h6 E8 = C3357i6.E();
        E8.h();
        ((C3357i6) E8.f28504u).G(z6);
        E8.h();
        ((C3357i6) E8.f28504u).F(str);
        o oVar = new o((C3357i6) E8.j());
        synchronized (C3410j7.class) {
            if (!C3410j7.f31958R) {
                C3410j7.f31959S = System.currentTimeMillis() / 1000;
                C3410j7.f31956P = C3410j7.n(context, oVar.f24254u);
                C3410j7.f31960T = C3680o7.k(context);
                ExecutorService executorService = C3410j7.f31956P.f35882b;
                C3410j7.f31961U = E7.a(context, executorService);
                C3410j7.f31962V = new F0();
                C3717or c3717or = new C3717or(context, executorService);
                C3410j7.f31964X = c3717or;
                C3410j7.f31963W = new C4297ze(context, executorService, (C3787q6) oVar.f24256w, c3717or);
                C3410j7.f31958R = true;
            }
        }
        this.f40163u.set(new C3410j7(context, oVar));
    }

    public final InterfaceC3358i7 o() {
        return ((!this.f40166x || this.f40165w) ? this.f40161H : 1) == 2 ? (InterfaceC3358i7) this.f40164v.get() : (InterfaceC3358i7) this.f40163u.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            C3324ha c3324ha = AbstractC3592ma.o4;
            r rVar = r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                this.f40165w = l();
            }
            boolean z9 = this.f40157D.f41848w;
            boolean z10 = false;
            if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f32787E1)).booleanValue() && z9) {
                z10 = true;
            }
            if (((!this.f40166x || this.f40165w) ? this.f40161H : 1) == 1) {
                n(z10);
                if (this.f40161H == 2) {
                    this.f40168z.execute(new B(5, this, z10));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C3250g7 p9 = p(this.f40155B, this.f40157D, z10, this.f40159F);
                    this.f40164v.set(p9);
                    if (this.f40167y) {
                        synchronized (p9) {
                            z6 = p9.J;
                        }
                        if (!z6) {
                            this.f40161H = 1;
                            n(z10);
                        }
                    }
                } catch (NullPointerException e9) {
                    this.f40161H = 1;
                    n(z10);
                    this.f40154A.c(2031, System.currentTimeMillis() - currentTimeMillis, e9);
                }
            }
            this.f40160G.countDown();
            this.f40155B = null;
            this.f40157D = null;
        } catch (Throwable th) {
            this.f40160G.countDown();
            this.f40155B = null;
            this.f40157D = null;
            throw th;
        }
    }
}

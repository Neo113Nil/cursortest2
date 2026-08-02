package R2;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c3.AbstractC0549a;
import com.google.android.gms.common.api.Scope;
import i1.C4585b;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: R2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0380f {

    /* renamed from: V, reason: collision with root package name */
    public static final O2.d[] f2774V = new O2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public final Context f2775A;

    /* renamed from: B, reason: collision with root package name */
    public final I f2776B;

    /* renamed from: C, reason: collision with root package name */
    public final O2.f f2777C;

    /* renamed from: D, reason: collision with root package name */
    public final z f2778D;

    /* renamed from: G, reason: collision with root package name */
    public v f2781G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0378d f2782H;

    /* renamed from: I, reason: collision with root package name */
    public IInterface f2783I;

    /* renamed from: K, reason: collision with root package name */
    public B f2784K;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC0376b f2786M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC0377c f2787N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2788O;

    /* renamed from: P, reason: collision with root package name */
    public final String f2789P;

    /* renamed from: Q, reason: collision with root package name */
    public volatile String f2790Q;

    /* renamed from: n, reason: collision with root package name */
    public int f2795n;

    /* renamed from: u, reason: collision with root package name */
    public long f2796u;

    /* renamed from: v, reason: collision with root package name */
    public long f2797v;

    /* renamed from: w, reason: collision with root package name */
    public int f2798w;

    /* renamed from: x, reason: collision with root package name */
    public long f2799x;

    /* renamed from: z, reason: collision with root package name */
    public J f2801z;

    /* renamed from: y, reason: collision with root package name */
    public volatile String f2800y = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f2779E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public final Object f2780F = new Object();
    public final ArrayList J = new ArrayList();

    /* renamed from: L, reason: collision with root package name */
    public int f2785L = 1;

    /* renamed from: R, reason: collision with root package name */
    public O2.b f2791R = null;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2792S = false;

    /* renamed from: T, reason: collision with root package name */
    public volatile E f2793T = null;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicInteger f2794U = new AtomicInteger(0);

    public AbstractC0380f(Context context, Looper looper, I i, O2.f fVar, int i4, InterfaceC0376b interfaceC0376b, InterfaceC0377c interfaceC0377c, String str) {
        w.i(context, "Context must not be null");
        this.f2775A = context;
        w.i(looper, "Looper must not be null");
        w.i(i, "Supervisor must not be null");
        this.f2776B = i;
        w.i(fVar, "API availability must not be null");
        this.f2777C = fVar;
        this.f2778D = new z(this, looper);
        this.f2788O = i4;
        this.f2786M = interfaceC0376b;
        this.f2787N = interfaceC0377c;
        this.f2789P = str;
    }

    public final void b(String str) {
        this.f2800y = str;
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(InterfaceC0384j interfaceC0384j, Set set) {
        Bundle s9 = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.f2790Q : this.f2790Q;
        int i = this.f2788O;
        int i4 = O2.f.f2269a;
        Scope[] scopeArr = C0382h.f2808H;
        Bundle bundle = new Bundle();
        O2.d[] dVarArr = C0382h.f2809I;
        C0382h c0382h = new C0382h(6, i, i4, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0382h.f2820w = this.f2775A.getPackageName();
        c0382h.f2823z = s9;
        if (set != null) {
            c0382h.f2822y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account q8 = q();
            if (q8 == null) {
                q8 = new Account("<<default account>>", "com.google");
            }
            c0382h.f2810A = q8;
            if (interfaceC0384j != 0) {
                c0382h.f2821x = ((AbstractC0549a) interfaceC0384j).f5722u;
            }
        }
        c0382h.f2811B = f2774V;
        c0382h.f2812C = r();
        if (this instanceof b3.b) {
            c0382h.f2815F = true;
        }
        try {
            synchronized (this.f2780F) {
                try {
                    v vVar = this.f2781G;
                    if (vVar != null) {
                        vVar.S(new A(this, this.f2794U.get()), c0382h);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            int i6 = this.f2794U.get();
            z zVar = this.f2778D;
            zVar.sendMessage(zVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i9 = this.f2794U.get();
            C c9 = new C(this, 8, null, null);
            z zVar2 = this.f2778D;
            zVar2.sendMessage(zVar2.obtainMessage(1, i9, -1, c9));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i92 = this.f2794U.get();
            C c92 = new C(this, 8, null, null);
            z zVar22 = this.f2778D;
            zVar22.sendMessage(zVar22.obtainMessage(1, i92, -1, c92));
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f2779E) {
            int i = this.f2785L;
            z6 = true;
            if (i != 2 && i != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    public final void e(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        v vVar;
        long j6;
        synchronized (this.f2779E) {
            i = this.f2785L;
            iInterface = this.f2783I;
        }
        synchronized (this.f2780F) {
            vVar = this.f2781G;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (vVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(vVar.f2874n)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2797v > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j9 = this.f2797v;
            String format = simpleDateFormat.format(new Date(j9));
            j6 = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 1 + String.valueOf(format).length());
            sb.append(j9);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j6 = 0;
        }
        if (this.f2796u > j6) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i4 = this.f2795n;
            if (i4 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i4 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i4 != 3) {
                printWriter.append((CharSequence) String.valueOf(i4));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.f2796u;
            String format2 = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format2).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f2799x > j6) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.bumptech.glide.h.h(this.f2798w));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.f2799x;
            String format3 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format3).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void f() {
        if (!h() || this.f2801z == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void g() {
        this.f2794U.incrementAndGet();
        ArrayList arrayList = this.J;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    u uVar = (u) arrayList.get(i);
                    synchronized (uVar) {
                        uVar.f2868a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2780F) {
            this.f2781G = null;
        }
        z(1, null);
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f2779E) {
            z6 = this.f2785L == 4;
        }
        return z6;
    }

    public int i() {
        return O2.f.f2269a;
    }

    public final O2.d[] j() {
        E e9 = this.f2793T;
        if (e9 == null) {
            return null;
        }
        return e9.f2748u;
    }

    public final String k() {
        return this.f2800y;
    }

    public final void l(InterfaceC0378d interfaceC0378d) {
        w.i(interfaceC0378d, "Connection progress callbacks cannot be null.");
        this.f2782H = interfaceC0378d;
        z(2, null);
    }

    public boolean m() {
        return false;
    }

    public final void n(C4585b c4585b) {
        ((Q2.C) c4585b.f38152u).f2488F.f2553F.post(new G0.c(9, c4585b));
    }

    public final void o() {
        int c9 = this.f2777C.c(this.f2775A, i());
        if (c9 == 0) {
            l(new C0379e(this));
            return;
        }
        z(1, null);
        this.f2782H = new C0379e(this);
        int i = this.f2794U.get();
        z zVar = this.f2778D;
        zVar.sendMessage(zVar.obtainMessage(3, i, c9, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public O2.d[] r() {
        return f2774V;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f2779E) {
            try {
                if (this.f2785L == 5) {
                    throw new DeadObjectException();
                }
                if (!h()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2783I;
                w.i(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return i() >= 211700000;
    }

    public final /* synthetic */ boolean y(int i, int i4, IInterface iInterface) {
        synchronized (this.f2779E) {
            try {
                if (this.f2785L != i) {
                    return false;
                }
                z(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        J j6;
        w.b((i == 4) == (iInterface != null));
        synchronized (this.f2779E) {
            try {
                this.f2785L = i;
                this.f2783I = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    B b9 = this.f2784K;
                    if (b9 != null) {
                        I i4 = this.f2776B;
                        String str = this.f2801z.f2771b;
                        w.h(str);
                        this.f2801z.getClass();
                        if (this.f2789P == null) {
                            this.f2775A.getClass();
                        }
                        i4.c(str, b9, this.f2801z.f2770a);
                        this.f2784K = null;
                    }
                } else if (i == 2 || i == 3) {
                    B b10 = this.f2784K;
                    if (b10 != null && (j6 = this.f2801z) != null) {
                        String str2 = j6.f2771b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        I i6 = this.f2776B;
                        String str3 = this.f2801z.f2771b;
                        w.h(str3);
                        this.f2801z.getClass();
                        if (this.f2789P == null) {
                            this.f2775A.getClass();
                        }
                        i6.c(str3, b10, this.f2801z.f2770a);
                        this.f2794U.incrementAndGet();
                    }
                    B b11 = new B(this, this.f2794U.get());
                    this.f2784K = b11;
                    String w3 = w();
                    boolean x9 = x();
                    this.f2801z = new J(w3, x9);
                    if (x9 && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2801z.f2771b)));
                    }
                    I i9 = this.f2776B;
                    String str4 = this.f2801z.f2771b;
                    w.h(str4);
                    this.f2801z.getClass();
                    String str5 = this.f2789P;
                    if (str5 == null) {
                        str5 = this.f2775A.getClass().getName();
                    }
                    O2.b b12 = i9.b(new F(str4, this.f2801z.f2770a), b11, str5, null);
                    if (!b12.b()) {
                        String str6 = this.f2801z.f2771b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i10 = b12.f2256u;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b12.f2257v != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b12.f2257v);
                        }
                        int i11 = this.f2794U.get();
                        D d9 = new D(this, i10, bundle);
                        z zVar = this.f2778D;
                        zVar.sendMessage(zVar.obtainMessage(7, i11, -1, d9));
                    }
                } else if (i == 4) {
                    w.h(iInterface);
                    this.f2797v = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}

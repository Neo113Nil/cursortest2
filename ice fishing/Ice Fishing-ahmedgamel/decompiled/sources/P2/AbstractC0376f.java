package P2;

import a3.AbstractC0432a;
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
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: P2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0376f {

    /* renamed from: V, reason: collision with root package name */
    public static final M2.d[] f2453V = new M2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public final Context f2454A;

    /* renamed from: B, reason: collision with root package name */
    public final I f2455B;

    /* renamed from: C, reason: collision with root package name */
    public final M2.f f2456C;

    /* renamed from: D, reason: collision with root package name */
    public final z f2457D;

    /* renamed from: G, reason: collision with root package name */
    public v f2460G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0374d f2461H;

    /* renamed from: I, reason: collision with root package name */
    public IInterface f2462I;

    /* renamed from: K, reason: collision with root package name */
    public B f2463K;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC0372b f2465M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC0373c f2466N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2467O;

    /* renamed from: P, reason: collision with root package name */
    public final String f2468P;

    /* renamed from: Q, reason: collision with root package name */
    public volatile String f2469Q;

    /* renamed from: n, reason: collision with root package name */
    public int f2474n;

    /* renamed from: u, reason: collision with root package name */
    public long f2475u;

    /* renamed from: v, reason: collision with root package name */
    public long f2476v;

    /* renamed from: w, reason: collision with root package name */
    public int f2477w;

    /* renamed from: x, reason: collision with root package name */
    public long f2478x;

    /* renamed from: z, reason: collision with root package name */
    public J f2480z;

    /* renamed from: y, reason: collision with root package name */
    public volatile String f2479y = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f2458E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public final Object f2459F = new Object();
    public final ArrayList J = new ArrayList();

    /* renamed from: L, reason: collision with root package name */
    public int f2464L = 1;

    /* renamed from: R, reason: collision with root package name */
    public M2.b f2470R = null;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2471S = false;

    /* renamed from: T, reason: collision with root package name */
    public volatile E f2472T = null;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicInteger f2473U = new AtomicInteger(0);

    public AbstractC0376f(Context context, Looper looper, I i, M2.f fVar, int i6, InterfaceC0372b interfaceC0372b, InterfaceC0373c interfaceC0373c, String str) {
        w.i(context, "Context must not be null");
        this.f2454A = context;
        w.i(looper, "Looper must not be null");
        w.i(i, "Supervisor must not be null");
        this.f2455B = i;
        w.i(fVar, "API availability must not be null");
        this.f2456C = fVar;
        this.f2457D = new z(this, looper);
        this.f2467O = i6;
        this.f2465M = interfaceC0372b;
        this.f2466N = interfaceC0373c;
        this.f2468P = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC0380j interfaceC0380j, Set set) {
        Bundle s9 = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.f2469Q : this.f2469Q;
        int i = this.f2467O;
        int i6 = M2.f.f1843a;
        Scope[] scopeArr = C0378h.f2487H;
        Bundle bundle = new Bundle();
        M2.d[] dVarArr = C0378h.f2488I;
        C0378h c0378h = new C0378h(6, i, i6, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0378h.f2499w = this.f2454A.getPackageName();
        c0378h.f2502z = s9;
        if (set != null) {
            c0378h.f2501y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account q8 = q();
            if (q8 == null) {
                q8 = new Account("<<default account>>", "com.google");
            }
            c0378h.f2489A = q8;
            if (interfaceC0380j != 0) {
                c0378h.f2500x = ((AbstractC0432a) interfaceC0380j).f4329u;
            }
        }
        c0378h.f2490B = f2453V;
        c0378h.f2491C = r();
        if (this instanceof Z2.b) {
            c0378h.f2494F = true;
        }
        try {
            synchronized (this.f2459F) {
                try {
                    v vVar = this.f2460G;
                    if (vVar != null) {
                        vVar.S(new A(this, this.f2473U.get()), c0378h);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            int i9 = this.f2473U.get();
            z zVar = this.f2457D;
            zVar.sendMessage(zVar.obtainMessage(6, i9, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i10 = this.f2473U.get();
            C c9 = new C(this, 8, null, null);
            z zVar2 = this.f2457D;
            zVar2.sendMessage(zVar2.obtainMessage(1, i10, -1, c9));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i102 = this.f2473U.get();
            C c92 = new C(this, 8, null, null);
            z zVar22 = this.f2457D;
            zVar22.sendMessage(zVar22.obtainMessage(1, i102, -1, c92));
        }
    }

    public final void c(InterfaceC0374d interfaceC0374d) {
        w.i(interfaceC0374d, "Connection progress callbacks cannot be null.");
        this.f2461H = interfaceC0374d;
        z(2, null);
    }

    public final void d(String str) {
        this.f2479y = str;
        h();
    }

    public final boolean e() {
        boolean z3;
        synchronized (this.f2458E) {
            int i = this.f2464L;
            z3 = true;
            if (i != 2 && i != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    public final void f(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        v vVar;
        long j6;
        synchronized (this.f2458E) {
            i = this.f2464L;
            iInterface = this.f2462I;
        }
        synchronized (this.f2459F) {
            vVar = this.f2460G;
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
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(vVar.f2553n)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2476v > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j9 = this.f2476v;
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
        if (this.f2475u > j6) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i6 = this.f2474n;
            if (i6 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i6 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i6 != 3) {
                printWriter.append((CharSequence) String.valueOf(i6));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.f2475u;
            String format2 = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format2).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f2478x > j6) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) S0.f.l(this.f2477w));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.f2478x;
            String format3 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format3).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void g() {
        if (!i() || this.f2480z == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void h() {
        this.f2473U.incrementAndGet();
        ArrayList arrayList = this.J;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    u uVar = (u) arrayList.get(i);
                    synchronized (uVar) {
                        uVar.f2547a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2459F) {
            this.f2460G = null;
        }
        z(1, null);
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f2458E) {
            z3 = this.f2464L == 4;
        }
        return z3;
    }

    public int j() {
        return M2.f.f1843a;
    }

    public final M2.d[] k() {
        E e9 = this.f2472T;
        if (e9 == null) {
            return null;
        }
        return e9.f2427u;
    }

    public final String l() {
        return this.f2479y;
    }

    public boolean m() {
        return false;
    }

    public final void n(I0.j jVar) {
        ((O2.D) jVar.f1264u).f2170F.f2235F.post(new G0.c(9, jVar));
    }

    public final void o() {
        int c9 = this.f2456C.c(this.f2454A, j());
        if (c9 == 0) {
            c(new C0375e(this));
            return;
        }
        z(1, null);
        this.f2461H = new C0375e(this);
        int i = this.f2473U.get();
        z zVar = this.f2457D;
        zVar.sendMessage(zVar.obtainMessage(3, i, c9, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public M2.d[] r() {
        return f2453V;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f2458E) {
            try {
                if (this.f2464L == 5) {
                    throw new DeadObjectException();
                }
                if (!i()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2462I;
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
        return j() >= 211700000;
    }

    public final /* synthetic */ boolean y(int i, int i6, IInterface iInterface) {
        synchronized (this.f2458E) {
            try {
                if (this.f2464L != i) {
                    return false;
                }
                z(i6, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        J j6;
        w.b((i == 4) == (iInterface != null));
        synchronized (this.f2458E) {
            try {
                this.f2464L = i;
                this.f2462I = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    B b9 = this.f2463K;
                    if (b9 != null) {
                        I i6 = this.f2455B;
                        String str = this.f2480z.f2450b;
                        w.h(str);
                        this.f2480z.getClass();
                        if (this.f2468P == null) {
                            this.f2454A.getClass();
                        }
                        i6.c(str, b9, this.f2480z.f2449a);
                        this.f2463K = null;
                    }
                } else if (i == 2 || i == 3) {
                    B b10 = this.f2463K;
                    if (b10 != null && (j6 = this.f2480z) != null) {
                        String str2 = j6.f2450b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        I i9 = this.f2455B;
                        String str3 = this.f2480z.f2450b;
                        w.h(str3);
                        this.f2480z.getClass();
                        if (this.f2468P == null) {
                            this.f2454A.getClass();
                        }
                        i9.c(str3, b10, this.f2480z.f2449a);
                        this.f2473U.incrementAndGet();
                    }
                    B b11 = new B(this, this.f2473U.get());
                    this.f2463K = b11;
                    String w6 = w();
                    boolean x9 = x();
                    this.f2480z = new J(w6, x9);
                    if (x9 && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2480z.f2450b)));
                    }
                    I i10 = this.f2455B;
                    String str4 = this.f2480z.f2450b;
                    w.h(str4);
                    this.f2480z.getClass();
                    String str5 = this.f2468P;
                    if (str5 == null) {
                        str5 = this.f2454A.getClass().getName();
                    }
                    M2.b b12 = i10.b(new F(str4, this.f2480z.f2449a), b11, str5, null);
                    if (!b12.b()) {
                        String str6 = this.f2480z.f2450b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i11 = b12.f1830u;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b12.f1831v != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b12.f1831v);
                        }
                        int i12 = this.f2473U.get();
                        D d2 = new D(this, i11, bundle);
                        z zVar = this.f2457D;
                        zVar.sendMessage(zVar.obtainMessage(7, i12, -1, d2));
                    }
                } else if (i == 4) {
                    w.h(iInterface);
                    this.f2476v = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}

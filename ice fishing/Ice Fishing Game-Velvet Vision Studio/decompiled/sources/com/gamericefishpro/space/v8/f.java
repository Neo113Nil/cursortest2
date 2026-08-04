package com.gamericefishpro.space.v8;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final com.gamericefishpro.space.s8.d[] V = new com.gamericefishpro.space.s8.d[0];
    public final Context A;
    public final n0 B;
    public final com.gamericefishpro.space.s8.f C;
    public final f0 D;
    public y G;
    public d H;
    public IInterface I;
    public h0 K;
    public final b M;
    public final c N;
    public final int O;
    public final String P;
    public volatile String Q;
    public int d;
    public long e;
    public long i;
    public int v;
    public long w;
    public com.gamericefishpro.space.o8.a z;
    public volatile String y = null;
    public final Object E = new Object();
    public final Object F = new Object();
    public final ArrayList J = new ArrayList();
    public int L = 1;
    public com.gamericefishpro.space.s8.b R = null;
    public boolean S = false;
    public volatile k0 T = null;
    public final AtomicInteger U = new AtomicInteger(0);

    public f(Context context, Looper looper, n0 n0Var, com.gamericefishpro.space.s8.f fVar, int i, b bVar, c cVar, String str) {
        c0.h(context, "Context must not be null");
        this.A = context;
        c0.h(looper, "Looper must not be null");
        c0.h(n0Var, "Supervisor must not be null");
        this.B = n0Var;
        c0.h(fVar, "API availability must not be null");
        this.C = fVar;
        this.D = new f0(this, looper);
        this.O = i;
        this.M = bVar;
        this.N = cVar;
        this.P = str;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.E) {
            z = this.L == 4;
        }
        return z;
    }

    public final void c(String str) {
        this.y = str;
        l();
    }

    public final void d(d dVar) {
        c0.h(dVar, "Connection progress callbacks cannot be null.");
        this.H = dVar;
        z(2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(j jVar, Set set) {
        Bundle bundleS = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.Q : this.Q;
        int i = this.O;
        int i2 = com.gamericefishpro.space.s8.f.a;
        Scope[] scopeArr = h.H;
        Bundle bundle = new Bundle();
        com.gamericefishpro.space.s8.d[] dVarArr = h.I;
        h hVar = new h(6, i, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        hVar.v = this.A.getPackageName();
        hVar.z = bundleS;
        if (set != null) {
            hVar.y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountQ = q();
            if (accountQ == null) {
                accountQ = new Account("<<default account>>", "com.google");
            }
            hVar.A = accountQ;
            if (jVar != 0) {
                hVar.w = ((com.gamericefishpro.space.f9.a) jVar).e;
            }
        }
        hVar.B = V;
        hVar.C = r();
        try {
            synchronized (this.F) {
                try {
                    y yVar = this.G;
                    if (yVar != null) {
                        yVar.E(new g0(this, this.U.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.U.get();
            f0 f0Var = this.D;
            f0Var.sendMessage(f0Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.U.get();
            i0 i0Var = new i0(this, 8, null, null);
            f0 f0Var2 = this.D;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i4, -1, i0Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.U.get();
            i0 i0Var2 = new i0(this, 8, null, null);
            f0 f0Var3 = this.D;
            f0Var3.sendMessage(f0Var3.obtainMessage(1, i5, -1, i0Var2));
        }
    }

    public abstract int f();

    public final boolean g() {
        boolean z;
        synchronized (this.E) {
            int i = this.L;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void h(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        y yVar;
        synchronized (this.E) {
            i = this.L;
            iInterface = this.I;
        }
        synchronized (this.F) {
            yVar = this.G;
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
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.d)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.i > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.i;
            String str2 = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 1 + String.valueOf(str2).length());
            sb.append(j);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.e > r9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.d;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.e;
            String str3 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(str3).length());
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.w > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.gamericefishpro.space.u6.f.D(this.v));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.w;
            String str4 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str4).length());
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public final com.gamericefishpro.space.s8.d[] i() {
        k0 k0Var = this.T;
        if (k0Var == null) {
            return null;
        }
        return k0Var.e;
    }

    public final void j() {
        if (!a() || this.z == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final String k() {
        return this.y;
    }

    public final void l() {
        this.U.incrementAndGet();
        ArrayList arrayList = this.J;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    x xVar = (x) arrayList.get(i);
                    synchronized (xVar) {
                        xVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.F) {
            this.G = null;
        }
        z(1, null);
    }

    public boolean m() {
        return false;
    }

    public final void n(com.gamericefishpro.space.tb.u uVar) {
        ((com.gamericefishpro.space.u8.a0) uVar.e).o.F.post(new com.gamericefishpro.space.h4.b(23, uVar));
    }

    public final void o() {
        int iB = this.C.b(this.A, f());
        if (iB == 0) {
            d(new e(this));
            return;
        }
        z(1, null);
        this.H = new e(this);
        int i = this.U.get();
        f0 f0Var = this.D;
        f0Var.sendMessage(f0Var.obtainMessage(3, i, iB, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public com.gamericefishpro.space.s8.d[] r() {
        return V;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.E) {
            try {
                if (this.L == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.I;
                c0.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return f() >= 211700000;
    }

    public final /* synthetic */ boolean y(int i, int i2, IInterface iInterface) {
        synchronized (this.E) {
            try {
                if (this.L != i) {
                    return false;
                }
                z(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        com.gamericefishpro.space.o8.a aVar;
        c0.b((i == 4) == (iInterface != null));
        synchronized (this.E) {
            try {
                this.L = i;
                this.I = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    h0 h0Var = this.K;
                    if (h0Var != null) {
                        n0 n0Var = this.B;
                        String str = this.z.c;
                        c0.g(str);
                        this.z.getClass();
                        if (this.P == null) {
                            this.A.getClass();
                        }
                        n0Var.c(str, h0Var, this.z.b);
                        this.K = null;
                    }
                } else if (i == 2 || i == 3) {
                    h0 h0Var2 = this.K;
                    if (h0Var2 != null && (aVar = this.z) != null) {
                        String str2 = aVar.c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        n0 n0Var2 = this.B;
                        String str3 = this.z.c;
                        c0.g(str3);
                        this.z.getClass();
                        if (this.P == null) {
                            this.A.getClass();
                        }
                        n0Var2.c(str3, h0Var2, this.z.b);
                        this.U.incrementAndGet();
                    }
                    h0 h0Var3 = new h0(this, this.U.get());
                    this.K = h0Var3;
                    String strW = w();
                    boolean zX = x();
                    this.z = new com.gamericefishpro.space.o8.a(strW, zX, 3);
                    if (zX && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.z.c)));
                    }
                    n0 n0Var3 = this.B;
                    String str4 = this.z.c;
                    c0.g(str4);
                    this.z.getClass();
                    String name = this.P;
                    if (name == null) {
                        name = this.A.getClass().getName();
                    }
                    com.gamericefishpro.space.s8.b bVarB = n0Var3.b(new l0(str4, this.z.b), h0Var3, name, null);
                    if (!bVarB.c()) {
                        String str5 = this.z.c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = bVarB.e;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (bVarB.i != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarB.i);
                        }
                        int i3 = this.U.get();
                        j0 j0Var = new j0(this, i2, bundle);
                        f0 f0Var = this.D;
                        f0Var.sendMessage(f0Var.obtainMessage(7, i3, -1, j0Var));
                    }
                } else if (i == 4) {
                    c0.g(iInterface);
                    this.i = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

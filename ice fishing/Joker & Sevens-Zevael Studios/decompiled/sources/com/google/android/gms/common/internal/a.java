package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b4.m;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m6.d;
import m6.e;
import m7.g;
import n6.f;
import o6.b0;
import p6.a0;
import p6.b;
import p6.d0;
import p6.e0;
import p6.r;
import p6.t;
import p6.u;
import p6.v;
import p6.w;
import p6.x;
import p6.y;
import p6.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements n6.a {
    public static final d[] C = new d[0];
    public final AtomicInteger A;
    public final Set B;

    /* renamed from: a, reason: collision with root package name */
    public int f1425a;

    /* renamed from: b, reason: collision with root package name */
    public long f1426b;

    /* renamed from: c, reason: collision with root package name */
    public long f1427c;

    /* renamed from: d, reason: collision with root package name */
    public int f1428d;

    /* renamed from: e, reason: collision with root package name */
    public long f1429e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f1430f;

    /* renamed from: g, reason: collision with root package name */
    public m f1431g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f1432h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f1433i;

    /* renamed from: j, reason: collision with root package name */
    public final v f1434j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1435k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1436l;

    /* renamed from: m, reason: collision with root package name */
    public t f1437m;

    /* renamed from: n, reason: collision with root package name */
    public b f1438n;

    /* renamed from: o, reason: collision with root package name */
    public IInterface f1439o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1440p;

    /* renamed from: q, reason: collision with root package name */
    public x f1441q;

    /* renamed from: r, reason: collision with root package name */
    public int f1442r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1443s;

    /* renamed from: t, reason: collision with root package name */
    public final g f1444t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1445u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1446v;

    /* renamed from: w, reason: collision with root package name */
    public volatile String f1447w;

    /* renamed from: x, reason: collision with root package name */
    public m6.b f1448x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1449y;

    /* renamed from: z, reason: collision with root package name */
    public volatile a0 f1450z;

    public a(Context context, Looper looper, int i10, p6.d dVar, f fVar, n6.g gVar) {
        synchronized (d0.f5562g) {
            try {
                if (d0.f5563h == null) {
                    d0.f5563h = new d0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d0 d0Var = d0.f5563h;
        Object obj = e.f4912c;
        u.g(fVar);
        u.g(gVar);
        g gVar2 = new g(10, fVar);
        g gVar3 = new g(11, gVar);
        String str = (String) dVar.f5560f;
        this.f1430f = null;
        this.f1435k = new Object();
        this.f1436l = new Object();
        this.f1440p = new ArrayList();
        this.f1442r = 1;
        this.f1448x = null;
        this.f1449y = false;
        this.f1450z = null;
        this.A = new AtomicInteger(0);
        u.h(context, "Context must not be null");
        this.f1432h = context;
        u.h(looper, "Looper must not be null");
        u.h(d0Var, "Supervisor must not be null");
        this.f1433i = d0Var;
        this.f1434j = new v(this, looper);
        this.f1445u = i10;
        this.f1443s = gVar2;
        this.f1444t = gVar3;
        this.f1446v = str;
        Set set = (Set) dVar.f5558d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.B = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i10, int i11, IInterface iInterface) {
        synchronized (aVar.f1435k) {
            try {
                if (aVar.f1442r != i10) {
                    return false;
                }
                aVar.w(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n6.a
    public final boolean a() {
        boolean z10;
        synchronized (this.f1435k) {
            z10 = this.f1442r == 4;
        }
        return z10;
    }

    @Override // n6.a
    public final Set b() {
        return n() ? this.B : Collections.EMPTY_SET;
    }

    @Override // n6.a
    public final void c(String str) {
        this.f1430f = str;
        m();
    }

    @Override // n6.a
    public final void d(b bVar) {
        u.h(bVar, "Connection progress callbacks cannot be null.");
        this.f1438n = bVar;
        w(2, null);
    }

    @Override // n6.a
    public final boolean f() {
        boolean z10;
        synchronized (this.f1435k) {
            int i10 = this.f1442r;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // n6.a
    public final void g(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        t tVar;
        synchronized (this.f1435k) {
            i10 = this.f1442r;
            iInterface = this.f1439o;
        }
        synchronized (this.f1436l) {
            tVar = this.f1437m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) s()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (tVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(tVar.f5642d)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f1427c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j3 = this.f1427c;
            append.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
        if (this.f1426b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f1425a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j6 = this.f1426b;
            append2.println(j6 + " " + simpleDateFormat.format(new Date(j6)));
        }
        if (this.f1429e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) i7.b.y(this.f1428d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j10 = this.f1429e;
            append3.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
    }

    @Override // n6.a
    public final d[] h() {
        a0 a0Var = this.f1450z;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f5540h;
    }

    @Override // n6.a
    public final void i() {
        if (!a() || this.f1431g == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // n6.a
    public final String j() {
        return this.f1430f;
    }

    @Override // n6.a
    public final void k(p6.g gVar, Set set) {
        Bundle q10 = q();
        String str = this.f1447w;
        int i10 = m6.f.f4914a;
        Scope[] scopeArr = p6.f.f5578u;
        Bundle bundle = new Bundle();
        int i11 = this.f1445u;
        d[] dVarArr = p6.f.f5579v;
        p6.f fVar = new p6.f(6, i11, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        fVar.f5583j = this.f1432h.getPackageName();
        fVar.f5586m = q10;
        if (set != null) {
            fVar.f5585l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            fVar.f5587n = new Account("<<default account>>", "com.google");
            if (gVar != null) {
                fVar.f5584k = ((e0) gVar).f5577d;
            }
        }
        fVar.f5588o = C;
        fVar.f5589p = p();
        try {
            synchronized (this.f1436l) {
                try {
                    t tVar = this.f1437m;
                    if (tVar != null) {
                        tVar.b(new w(this, this.A.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.A.get();
            v vVar = this.f1434j;
            vVar.sendMessage(vVar.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.A.get();
            y yVar = new y(this, 8, null, null);
            v vVar2 = this.f1434j;
            vVar2.sendMessage(vVar2.obtainMessage(1, i13, -1, yVar));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i132 = this.A.get();
            y yVar2 = new y(this, 8, null, null);
            v vVar22 = this.f1434j;
            vVar22.sendMessage(vVar22.obtainMessage(1, i132, -1, yVar2));
        }
    }

    @Override // n6.a
    public final void l(g gVar) {
        ((b0) gVar.f4957h).f5243o.f5267m.post(new b4.g(10, gVar));
    }

    @Override // n6.a
    public final void m() {
        this.A.incrementAndGet();
        synchronized (this.f1440p) {
            try {
                int size = this.f1440p.size();
                for (int i10 = 0; i10 < size; i10++) {
                    r rVar = (r) this.f1440p.get(i10);
                    synchronized (rVar) {
                        rVar.f5636a = null;
                    }
                }
                this.f1440p.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f1436l) {
            this.f1437m = null;
        }
        w(1, null);
    }

    @Override // n6.a
    public boolean n() {
        return false;
    }

    public abstract IInterface o(IBinder iBinder);

    public d[] p() {
        return C;
    }

    public abstract Bundle q();

    public final IInterface r() {
        IInterface iInterface;
        synchronized (this.f1435k) {
            try {
                if (this.f1442r == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f1439o;
                u.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String s();

    public abstract String t();

    public boolean u() {
        return e() >= 211700000;
    }

    public final void w(int i10, IInterface iInterface) {
        m mVar;
        if ((i10 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f1435k) {
            try {
                this.f1442r = i10;
                this.f1439o = iInterface;
                if (i10 == 1) {
                    x xVar = this.f1441q;
                    if (xVar != null) {
                        d0 d0Var = this.f1433i;
                        String str = (String) this.f1431g.f999b;
                        u.g(str);
                        this.f1431g.getClass();
                        if (this.f1446v == null) {
                            this.f1432h.getClass();
                        }
                        d0Var.a(str, xVar, this.f1431g.f1000c);
                        this.f1441q = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    x xVar2 = this.f1441q;
                    if (xVar2 != null && (mVar = this.f1431g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) mVar.f999b) + " on com.google.android.gms");
                        d0 d0Var2 = this.f1433i;
                        String str2 = (String) this.f1431g.f999b;
                        u.g(str2);
                        this.f1431g.getClass();
                        if (this.f1446v == null) {
                            this.f1432h.getClass();
                        }
                        d0Var2.a(str2, xVar2, this.f1431g.f1000c);
                        this.A.incrementAndGet();
                    }
                    x xVar3 = new x(this, this.A.get());
                    this.f1441q = xVar3;
                    String t3 = t();
                    boolean u10 = u();
                    this.f1431g = new m(2, t3, u10);
                    if (u10 && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f1431g.f999b)));
                    }
                    d0 d0Var3 = this.f1433i;
                    String str3 = (String) this.f1431g.f999b;
                    u.g(str3);
                    this.f1431g.getClass();
                    String str4 = this.f1446v;
                    if (str4 == null) {
                        str4 = this.f1432h.getClass().getName();
                    }
                    if (!d0Var3.b(new p6.b0(str3, this.f1431g.f1000c), xVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f1431g.f999b) + " on com.google.android.gms");
                        int i11 = this.A.get();
                        z zVar = new z(this, 16);
                        v vVar = this.f1434j;
                        vVar.sendMessage(vVar.obtainMessage(7, i11, -1, zVar));
                    }
                } else if (i10 == 4) {
                    u.g(iInterface);
                    this.f1427c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}

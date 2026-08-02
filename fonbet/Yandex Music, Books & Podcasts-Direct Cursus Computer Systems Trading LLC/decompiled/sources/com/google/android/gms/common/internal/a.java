package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.common.api.Scope;
import defpackage.axw;
import defpackage.bnx;
import defpackage.c7f;
import defpackage.cr2;
import defpackage.d0x;
import defpackage.eix;
import defpackage.f3x;
import defpackage.f4m;
import defpackage.fo0;
import defpackage.g8e;
import defpackage.gbd;
import defpackage.gfx;
import defpackage.h66;
import defpackage.hzw;
import defpackage.i6c;
import defpackage.i7x;
import defpackage.ilx;
import defpackage.k6o;
import defpackage.knn;
import defpackage.l9x;
import defpackage.m0x;
import defpackage.pmd;
import defpackage.qld;
import defpackage.qmd;
import defpackage.r8x;
import defpackage.rmd;
import defpackage.rn5;
import defpackage.smd;
import defpackage.wax;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.y1g;
import defpackage.yyo;
import defpackage.z6n;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements fo0 {
    public static final i6c[] D = new i6c[0];
    public volatile gfx A;
    public final AtomicInteger B;
    public final Set C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public c7f g;
    public final Context h;
    public final Looper i;
    public final ilx j;
    public final f3x k;
    public final Object l;
    public final Object m;
    public m0x n;
    public cr2 o;
    public IInterface p;
    public final ArrayList q;
    public r8x r;
    public int s;
    public final f4m t;
    public final knn u;
    public final int v;
    public final String w;
    public volatile String x;
    public h66 y;
    public boolean z;

    public a(Context context, Looper looper, int i, rn5 rn5Var, rmd rmdVar, smd smdVar, int i2) {
        synchronized (ilx.g) {
            try {
                if (ilx.h == null) {
                    ilx.h = new ilx(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ilx ilxVar = ilx.h;
        int i3 = pmd.c;
        y1g.G(rmdVar);
        y1g.G(smdVar);
        f4m f4mVar = new f4m(27, rmdVar);
        knn knnVar = new knn(23, smdVar);
        String str = (String) rn5Var.f;
        this.f = null;
        this.l = new Object();
        this.m = new Object();
        this.q = new ArrayList();
        this.s = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.B = new AtomicInteger(0);
        y1g.H(context, "Context must not be null");
        this.h = context;
        y1g.H(looper, "Looper must not be null");
        this.i = looper;
        y1g.H(ilxVar, "Supervisor must not be null");
        this.j = ilxVar;
        this.k = new f3x(this, looper);
        this.v = i;
        this.t = f4mVar;
        this.u = knnVar;
        this.w = str;
        Set set = (Set) rn5Var.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                xq0.q("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.C = set;
    }

    public static /* bridge */ /* synthetic */ boolean z(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.l) {
            try {
                if (aVar.s != i) {
                    return false;
                }
                aVar.A(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(int i, IInterface iInterface) {
        c7f c7fVar;
        y1g.z((i == 4) == (iInterface != null));
        synchronized (this.l) {
            try {
                this.s = i;
                this.p = iInterface;
                if (i == 1) {
                    r8x r8xVar = this.r;
                    if (r8xVar != null) {
                        ilx ilxVar = this.j;
                        String str = this.g.c;
                        y1g.G(str);
                        this.g.getClass();
                        if (this.w == null) {
                            this.h.getClass();
                        }
                        ilxVar.a(str, r8xVar, this.g.b);
                        this.r = null;
                    }
                } else if (i == 2 || i == 3) {
                    r8x r8xVar2 = this.r;
                    if (r8xVar2 != null && (c7fVar = this.g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c7fVar.c + " on com.google.android.gms");
                        ilx ilxVar2 = this.j;
                        String str2 = this.g.c;
                        y1g.G(str2);
                        this.g.getClass();
                        if (this.w == null) {
                            this.h.getClass();
                        }
                        ilxVar2.a(str2, r8xVar2, this.g.b);
                        this.B.incrementAndGet();
                    }
                    r8x r8xVar3 = new r8x(this, this.B.get());
                    this.r = r8xVar3;
                    String u = u();
                    boolean v = v();
                    this.g = new c7f(u, v, 4);
                    if (v && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.c)));
                    }
                    ilx ilxVar3 = this.j;
                    String str3 = this.g.c;
                    y1g.G(str3);
                    this.g.getClass();
                    String str4 = this.w;
                    if (str4 == null) {
                        str4 = this.h.getClass().getName();
                    }
                    if (!ilxVar3.b(new eix(str3, this.g.b), r8xVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.g.c + " on com.google.android.gms");
                        int i2 = this.B.get();
                        wax waxVar = new wax(this, 16);
                        f3x f3xVar = this.k;
                        f3xVar.sendMessage(f3xVar.obtainMessage(7, i2, -1, waxVar));
                    }
                } else if (i == 4) {
                    y1g.G(iInterface);
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.fo0
    public boolean a() {
        return this instanceof hzw;
    }

    @Override // defpackage.fo0
    public final void b(String str) {
        this.f = str;
        disconnect();
    }

    @Override // defpackage.fo0
    public final boolean c() {
        boolean z;
        synchronized (this.l) {
            int i = this.s;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fo0
    public final void d() {
        if (!isConnected() || this.g == null) {
            wvs.p("Failed to connect when checking package");
        }
    }

    @Override // defpackage.fo0
    public void disconnect() {
        this.B.incrementAndGet();
        synchronized (this.q) {
            try {
                int size = this.q.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.q;
                    if (i < size) {
                        d0x d0xVar = (d0x) arrayList.get(i);
                        synchronized (d0xVar) {
                            d0xVar.a = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.m) {
            this.n = null;
        }
        A(1, null);
    }

    @Override // defpackage.fo0
    public boolean e() {
        return false;
    }

    @Override // defpackage.fo0
    public final void f(g8e g8eVar, Set set) {
        Bundle r = r();
        String str = this.x;
        int i = qmd.a;
        Scope[] scopeArr = gbd.o;
        Bundle bundle = new Bundle();
        int i2 = this.v;
        i6c[] i6cVarArr = gbd.p;
        gbd gbdVar = new gbd(6, i2, i, null, null, scopeArr, bundle, null, i6cVarArr, i6cVarArr, true, 0, false, str);
        gbdVar.d = this.h.getPackageName();
        gbdVar.g = r;
        if (set != null) {
            gbdVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (e()) {
            gbdVar.h = new Account("<<default account>>", "com.google");
            if (g8eVar != null) {
                gbdVar.e = g8eVar.asBinder();
            }
        } else if (this instanceof bnx) {
            gbdVar.h = null;
        }
        gbdVar.i = D;
        gbdVar.j = p();
        if (y()) {
            gbdVar.m = true;
        }
        try {
            synchronized (this.m) {
                try {
                    m0x m0xVar = this.n;
                    if (m0xVar != null) {
                        m0xVar.R(new i7x(this, this.B.get()), gbdVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.B.get();
            f3x f3xVar = this.k;
            f3xVar.sendMessage(f3xVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            x(8, null, null, this.B.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            x(8, null, null, this.B.get());
        }
    }

    @Override // defpackage.fo0
    public final Set g() {
        return e() ? this.C : Collections.EMPTY_SET;
    }

    @Override // defpackage.fo0
    public final void h(z6n z6nVar) {
        ((axw) z6nVar.b).s.n.post(new yyo(15, z6nVar));
    }

    @Override // defpackage.fo0
    public final void i(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        m0x m0xVar;
        synchronized (this.l) {
            i = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            m0xVar = this.n;
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
            printWriter.append((CharSequence) t()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (m0xVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(m0xVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.c;
            append.println(j + StringUtil.SPACE + simpleDateFormat.format(new Date(j)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.b;
            append2.println(j2 + StringUtil.SPACE + simpleDateFormat.format(new Date(j2)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) qld.G(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.e;
            append3.println(j3 + StringUtil.SPACE + simpleDateFormat.format(new Date(j3)));
        }
    }

    @Override // defpackage.fo0
    public final boolean isConnected() {
        boolean z;
        synchronized (this.l) {
            z = this.s == 4;
        }
        return z;
    }

    @Override // defpackage.fo0
    public final void j(cr2 cr2Var) {
        y1g.H(cr2Var, "Connection progress callbacks cannot be null.");
        this.o = cr2Var;
        A(2, null);
    }

    @Override // defpackage.fo0
    public int k() {
        return qmd.a;
    }

    @Override // defpackage.fo0
    public final i6c[] l() {
        gfx gfxVar = this.A;
        if (gfxVar == null) {
            return null;
        }
        return gfxVar.b;
    }

    @Override // defpackage.fo0
    public final String m() {
        return this.f;
    }

    @Override // defpackage.fo0
    public Intent n() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract IInterface o(IBinder iBinder);

    public i6c[] p() {
        return D;
    }

    public Bundle q() {
        return null;
    }

    public Bundle r() {
        return new Bundle();
    }

    public final IInterface s() {
        IInterface iInterface;
        synchronized (this.l) {
            try {
                if (this.s == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.p;
                y1g.H(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String t();

    public abstract String u();

    public boolean v() {
        return k() >= 211700000;
    }

    public void w(h66 h66Var) {
        this.d = h66Var.b;
        this.e = System.currentTimeMillis();
    }

    public void x(int i, IBinder iBinder, Bundle bundle, int i2) {
        l9x l9xVar = new l9x(this, i, iBinder, bundle);
        f3x f3xVar = this.k;
        f3xVar.sendMessage(f3xVar.obtainMessage(1, i2, -1, l9xVar));
    }

    public boolean y() {
        return this instanceof k6o;
    }
}

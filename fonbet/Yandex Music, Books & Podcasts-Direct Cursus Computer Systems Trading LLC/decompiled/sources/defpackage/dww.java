package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class dww implements mxw {
    public final Context a;
    public final uww h;
    public final Looper i;
    public final xww j;
    public final xww k;
    public final Map l;
    public final fo0 n;
    public Bundle o;
    public final Lock s;
    public final Set m = Collections.newSetFromMap(new WeakHashMap());
    public h66 p = null;
    public h66 q = null;
    public boolean r = false;
    public int t = 0;

    public dww(Context context, uww uwwVar, ReentrantLock reentrantLock, Looper looper, qmd qmdVar, xy0 xy0Var, xy0 xy0Var2, rn5 rn5Var, i4w i4wVar, fo0 fo0Var, ArrayList arrayList, ArrayList arrayList2, xy0 xy0Var3, xy0 xy0Var4) {
        this.a = context;
        this.h = uwwVar;
        this.s = reentrantLock;
        this.i = looper;
        this.n = fo0Var;
        this.j = new xww(context, uwwVar, reentrantLock, looper, qmdVar, xy0Var2, null, xy0Var4, null, arrayList2, new sml(this));
        this.k = new xww(context, uwwVar, reentrantLock, looper, qmdVar, xy0Var, rn5Var, xy0Var3, i4wVar, arrayList, new uiq(16, this));
        xy0 xy0Var5 = new xy0(0);
        Iterator it = ((uy0) xy0Var2.keySet()).iterator();
        while (it.hasNext()) {
            xy0Var5.put((go0) it.next(), this.j);
        }
        Iterator it2 = ((uy0) xy0Var.keySet()).iterator();
        while (it2.hasNext()) {
            xy0Var5.put((go0) it2.next(), this.k);
        }
        this.l = Collections.unmodifiableMap(xy0Var5);
    }

    public static /* bridge */ /* synthetic */ void j(dww dwwVar, int i) {
        dwwVar.h.z(i);
        dwwVar.q = null;
        dwwVar.p = null;
    }

    public static void k(dww dwwVar) {
        h66 h66Var;
        h66 h66Var2;
        h66 h66Var3;
        h66 h66Var4 = dwwVar.p;
        xww xwwVar = dwwVar.k;
        xww xwwVar2 = dwwVar.j;
        if (h66Var4 == null || !h66Var4.e()) {
            if (dwwVar.p != null && (h66Var2 = dwwVar.q) != null && h66Var2.e()) {
                xwwVar.d();
                h66 h66Var5 = dwwVar.p;
                y1g.G(h66Var5);
                dwwVar.h(h66Var5);
                return;
            }
            h66 h66Var6 = dwwVar.p;
            if (h66Var6 == null || (h66Var = dwwVar.q) == null) {
                return;
            }
            if (xwwVar.r < xwwVar2.r) {
                h66Var6 = h66Var;
            }
            dwwVar.h(h66Var6);
            return;
        }
        h66 h66Var7 = dwwVar.q;
        if ((h66Var7 == null || !h66Var7.e()) && ((h66Var3 = dwwVar.q) == null || h66Var3.b != 4)) {
            if (h66Var3 != null) {
                if (dwwVar.t == 1) {
                    dwwVar.i();
                    return;
                } else {
                    dwwVar.h(h66Var3);
                    xwwVar2.d();
                    return;
                }
            }
            return;
        }
        int i = dwwVar.t;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                dwwVar.t = 0;
            } else {
                uww uwwVar = dwwVar.h;
                y1g.G(uwwVar);
                uwwVar.f(dwwVar.o);
            }
        }
        dwwVar.i();
        dwwVar.t = 0;
    }

    @Override // defpackage.mxw
    public final void a() {
        this.t = 2;
        this.r = false;
        this.q = null;
        this.p = null;
        this.j.a();
        this.k.a();
    }

    @Override // defpackage.mxw
    public final boolean b(dzw dzwVar) {
        Lock lock;
        this.s.lock();
        try {
            lock = this.s;
            lock.lock();
            try {
                boolean z = true;
                boolean z2 = this.t == 2;
                lock.unlock();
                if (!z2) {
                    if (g()) {
                    }
                    z = false;
                    return z;
                }
                if (!(this.k.q instanceof hww)) {
                    this.m.add(dzwVar);
                    if (this.t == 0) {
                        this.t = 1;
                    }
                    this.q = null;
                    this.k.a();
                    return z;
                }
                z = false;
                return z;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.s;
        }
    }

    @Override // defpackage.mxw
    public final void c() {
        Lock lock = this.s;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = this.t == 2;
                lock.unlock();
                this.k.d();
                this.q = new h66(4);
                if (z) {
                    new fsn(this.i, 1).post(new yyo(17, this));
                } else {
                    i();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.mxw
    public final void d() {
        this.q = null;
        this.p = null;
        this.t = 0;
        this.j.d();
        this.k.d();
        i();
    }

    @Override // defpackage.mxw
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.k.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.j.e(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.mxw
    public final gr2 f(gr2 gr2Var) {
        xww xwwVar = (xww) this.l.get(gr2Var.o);
        y1g.H(xwwVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (!xwwVar.equals(this.k)) {
            xww xwwVar2 = this.j;
            xwwVar2.getClass();
            gr2Var.k();
            return xwwVar2.q.l(gr2Var);
        }
        h66 h66Var = this.q;
        if (h66Var != null && h66Var.b == 4) {
            fo0 fo0Var = this.n;
            gr2Var.m(new Status(4, null, fo0Var == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.h), fo0Var.n(), tyw.a | 134217728), null));
            return gr2Var;
        }
        xww xwwVar3 = this.k;
        xwwVar3.getClass();
        gr2Var.k();
        return xwwVar3.q.l(gr2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.t == 1) goto L16;
     */
    @Override // defpackage.mxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.s.lock();
        try {
            boolean z = false;
            if (this.j.q instanceof hww) {
                if (!(this.k.q instanceof hww)) {
                    h66 h66Var = this.q;
                    if (!(h66Var != null && h66Var.b == 4)) {
                    }
                }
                z = true;
            }
            return z;
        } finally {
            this.s.unlock();
        }
    }

    public final void h(h66 h66Var) {
        int i = this.t;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.t = 0;
            }
            this.h.p(h66Var);
        }
        i();
        this.t = 0;
    }

    public final void i() {
        Set set = this.m;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dzw) it.next()).i.release();
        }
        set.clear();
    }
}

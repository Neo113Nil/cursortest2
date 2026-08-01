package O2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import g1.C4523c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.b1;

/* loaded from: classes.dex */
public final class z implements K, N2.i {

    /* renamed from: A, reason: collision with root package name */
    public final b1 f2317A;

    /* renamed from: B, reason: collision with root package name */
    public final s.b f2318B;

    /* renamed from: C, reason: collision with root package name */
    public final R2.b f2319C;

    /* renamed from: D, reason: collision with root package name */
    public volatile x f2320D;

    /* renamed from: E, reason: collision with root package name */
    public int f2321E;

    /* renamed from: F, reason: collision with root package name */
    public final w f2322F;

    /* renamed from: G, reason: collision with root package name */
    public final I f2323G;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f2324n;

    /* renamed from: u, reason: collision with root package name */
    public final Condition f2325u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2326v;

    /* renamed from: w, reason: collision with root package name */
    public final M2.f f2327w;

    /* renamed from: x, reason: collision with root package name */
    public final HandlerC0370u f2328x;

    /* renamed from: y, reason: collision with root package name */
    public final s.b f2329y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f2330z = new HashMap();

    public z(Context context, w wVar, ReentrantLock reentrantLock, Looper looper, M2.f fVar, s.b bVar, b1 b1Var, s.b bVar2, R2.b bVar3, ArrayList arrayList, I i) {
        this.f2326v = context;
        this.f2324n = reentrantLock;
        this.f2327w = fVar;
        this.f2329y = bVar;
        this.f2317A = b1Var;
        this.f2318B = bVar2;
        this.f2319C = bVar3;
        this.f2322F = wVar;
        this.f2323G = i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((U) arrayList.get(i6)).f2217v = this;
        }
        this.f2328x = new HandlerC0370u(this, looper, 1);
        this.f2325u = reentrantLock.newCondition();
        this.f2320D = new C4523c(8, this);
    }

    @Override // O2.K
    public final void a() {
        this.f2320D.i();
    }

    @Override // O2.K
    public final boolean b() {
        return this.f2320D instanceof C0362l;
    }

    @Override // O2.K
    public final void c() {
        if (this.f2320D.x()) {
            this.f2330z.clear();
        }
    }

    @Override // O2.K
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f2320D);
        Iterator it = ((s.g) this.f2318B.keySet()).iterator();
        while (it.hasNext()) {
            N2.e eVar = (N2.e) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f1938c).println(":");
            N2.c cVar = (N2.c) this.f2329y.getOrDefault(eVar.f1937b, null);
            P2.w.h(cVar);
            cVar.f(concat, printWriter);
        }
    }

    public final void e() {
        this.f2324n.lock();
        try {
            this.f2320D = new C4523c(8, this);
            this.f2320D.t();
            this.f2325u.signalAll();
        } finally {
            this.f2324n.unlock();
        }
    }

    @Override // N2.i
    public final void onConnected(Bundle bundle) {
        this.f2324n.lock();
        try {
            this.f2320D.g(bundle);
        } finally {
            this.f2324n.unlock();
        }
    }

    @Override // N2.i
    public final void onConnectionSuspended(int i) {
        this.f2324n.lock();
        try {
            this.f2320D.r(i);
        } finally {
            this.f2324n.unlock();
        }
    }
}

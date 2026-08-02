package Q2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* loaded from: classes.dex */
public final class y implements J, P2.i {

    /* renamed from: A, reason: collision with root package name */
    public final c1 f2633A;

    /* renamed from: B, reason: collision with root package name */
    public final s.b f2634B;

    /* renamed from: C, reason: collision with root package name */
    public final T2.b f2635C;

    /* renamed from: D, reason: collision with root package name */
    public volatile w f2636D;

    /* renamed from: E, reason: collision with root package name */
    public int f2637E;

    /* renamed from: F, reason: collision with root package name */
    public final v f2638F;

    /* renamed from: G, reason: collision with root package name */
    public final H f2639G;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f2640n;

    /* renamed from: u, reason: collision with root package name */
    public final Condition f2641u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2642v;

    /* renamed from: w, reason: collision with root package name */
    public final O2.f f2643w;

    /* renamed from: x, reason: collision with root package name */
    public final HandlerC0374t f2644x;

    /* renamed from: y, reason: collision with root package name */
    public final s.b f2645y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f2646z = new HashMap();

    public y(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, O2.f fVar, s.b bVar, c1 c1Var, s.b bVar2, T2.b bVar3, ArrayList arrayList, H h3) {
        this.f2642v = context;
        this.f2640n = reentrantLock;
        this.f2643w = fVar;
        this.f2645y = bVar;
        this.f2633A = c1Var;
        this.f2634B = bVar2;
        this.f2635C = bVar3;
        this.f2638F = vVar;
        this.f2639G = h3;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((T) arrayList.get(i)).f2535v = this;
        }
        this.f2644x = new HandlerC0374t(this, looper, 1);
        this.f2641u = reentrantLock.newCondition();
        this.f2636D = new n4.c(12, this);
    }

    @Override // Q2.J
    public final void a() {
        this.f2636D.i();
    }

    @Override // Q2.J
    public final boolean b() {
        return this.f2636D instanceof C0366k;
    }

    @Override // Q2.J
    public final void c() {
        if (this.f2636D.y()) {
            this.f2646z.clear();
        }
    }

    @Override // Q2.J
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f2636D);
        Iterator it = ((s.g) this.f2634B.keySet()).iterator();
        while (it.hasNext()) {
            P2.e eVar = (P2.e) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f2382c).println(":");
            P2.c cVar = (P2.c) this.f2645y.getOrDefault(eVar.f2381b, null);
            R2.w.h(cVar);
            cVar.e(concat, printWriter);
        }
    }

    public final void e() {
        this.f2640n.lock();
        try {
            this.f2636D = new n4.c(12, this);
            this.f2636D.t();
            this.f2641u.signalAll();
        } finally {
            this.f2640n.unlock();
        }
    }

    @Override // P2.i
    public final void onConnected(Bundle bundle) {
        this.f2640n.lock();
        try {
            this.f2636D.g(bundle);
        } finally {
            this.f2640n.unlock();
        }
    }

    @Override // P2.i
    public final void onConnectionSuspended(int i) {
        this.f2640n.lock();
        try {
            this.f2636D.r(i);
        } finally {
            this.f2640n.unlock();
        }
    }
}

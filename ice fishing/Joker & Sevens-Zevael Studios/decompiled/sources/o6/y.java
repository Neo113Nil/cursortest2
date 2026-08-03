package o6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y implements i0, n6.f {

    /* renamed from: d, reason: collision with root package name */
    public final Lock f5373d;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f5374e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f5375f;

    /* renamed from: g, reason: collision with root package name */
    public final m6.f f5376g;

    /* renamed from: h, reason: collision with root package name */
    public final t f5377h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f5378i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5379j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final p6.d f5380k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f5381l;

    /* renamed from: m, reason: collision with root package name */
    public final a.a f5382m;

    /* renamed from: n, reason: collision with root package name */
    public volatile w f5383n;

    /* renamed from: o, reason: collision with root package name */
    public int f5384o;

    /* renamed from: p, reason: collision with root package name */
    public final v f5385p;

    /* renamed from: q, reason: collision with root package name */
    public final g0 f5386q;

    public y(Context context, v vVar, Lock lock, Looper looper, m6.f fVar, s.f fVar2, p6.d dVar, s.f fVar3, a.a aVar, ArrayList arrayList, g0 g0Var) {
        this.f5375f = context;
        this.f5373d = lock;
        this.f5376g = fVar;
        this.f5378i = fVar2;
        this.f5380k = dVar;
        this.f5381l = fVar3;
        this.f5382m = aVar;
        this.f5385p = vVar;
        this.f5386q = g0Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q0) arrayList.get(i10)).f5321f = this;
        }
        this.f5377h = new t(this, looper, 1);
        this.f5374e = lock.newCondition();
        this.f5383n = new m7.g(4, this);
    }

    @Override // o6.i0
    public final void a() {
        this.f5383n.f();
    }

    @Override // o6.i0
    public final void b() {
        if (this.f5383n.h()) {
            this.f5379j.clear();
        }
    }

    @Override // o6.i0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f5383n);
        for (n6.c cVar : this.f5381l.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) cVar.f5073c).println(":");
            n6.a aVar = (n6.a) this.f5378i.get(cVar.f5072b);
            p6.u.g(aVar);
            aVar.g(valueOf.concat("  "), printWriter);
        }
    }

    @Override // o6.i0
    public final boolean d() {
        return this.f5383n instanceof k;
    }

    public final void e() {
        this.f5373d.lock();
        try {
            this.f5383n = new m7.g(4, this);
            this.f5383n.e();
            this.f5374e.signalAll();
        } finally {
            this.f5373d.unlock();
        }
    }

    @Override // n6.f
    public final void onConnected(Bundle bundle) {
        this.f5373d.lock();
        try {
            this.f5383n.c(bundle);
        } finally {
            this.f5373d.unlock();
        }
    }

    @Override // n6.f
    public final void onConnectionSuspended(int i10) {
        this.f5373d.lock();
        try {
            this.f5383n.d(i10);
        } finally {
            this.f5373d.unlock();
        }
    }
}

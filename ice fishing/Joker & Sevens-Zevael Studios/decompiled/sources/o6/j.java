package o6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public final v f5279d;

    /* renamed from: e, reason: collision with root package name */
    public final y f5280e;

    /* renamed from: f, reason: collision with root package name */
    public final y f5281f;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f5283h;

    /* renamed from: l, reason: collision with root package name */
    public final Lock f5287l;

    /* renamed from: g, reason: collision with root package name */
    public final Set f5282g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    public m6.b f5284i = null;

    /* renamed from: j, reason: collision with root package name */
    public m6.b f5285j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5286k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f5288m = 0;

    public j(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, m6.f fVar, s.f fVar2, s.f fVar3, p6.d dVar, d7.b bVar, n6.a aVar, ArrayList arrayList, ArrayList arrayList2, s.f fVar4, s.f fVar5) {
        this.f5279d = vVar;
        this.f5287l = reentrantLock;
        this.f5280e = new y(context, vVar, reentrantLock, looper, fVar, fVar3, null, fVar5, null, arrayList2, new r0(this, 0));
        this.f5281f = new y(context, vVar, reentrantLock, looper, fVar, fVar2, dVar, fVar4, bVar, arrayList, new r0(this, 1));
        s.f fVar6 = new s.f(0);
        Iterator it = ((s.c) fVar3.keySet()).iterator();
        while (it.hasNext()) {
            fVar6.put((n6.b) it.next(), this.f5280e);
        }
        Iterator it2 = ((s.c) fVar2.keySet()).iterator();
        while (it2.hasNext()) {
            fVar6.put((n6.b) it2.next(), this.f5281f);
        }
        Collections.unmodifiableMap(fVar6);
    }

    public static /* bridge */ /* synthetic */ void g(j jVar, int i10) {
        jVar.f5279d.c(i10);
        jVar.f5285j = null;
        jVar.f5284i = null;
    }

    public static void h(j jVar) {
        m6.b bVar;
        m6.b bVar2;
        m6.b bVar3;
        m6.b bVar4 = jVar.f5284i;
        y yVar = jVar.f5281f;
        y yVar2 = jVar.f5280e;
        if (bVar4 == null || !bVar4.b()) {
            if (jVar.f5284i != null && (bVar2 = jVar.f5285j) != null && bVar2.b()) {
                yVar.b();
                m6.b bVar5 = jVar.f5284i;
                p6.u.g(bVar5);
                jVar.e(bVar5);
                return;
            }
            m6.b bVar6 = jVar.f5284i;
            if (bVar6 == null || (bVar = jVar.f5285j) == null) {
                return;
            }
            if (yVar.f5384o < yVar2.f5384o) {
                bVar6 = bVar;
            }
            jVar.e(bVar6);
            return;
        }
        m6.b bVar7 = jVar.f5285j;
        if ((bVar7 == null || !bVar7.b()) && ((bVar3 = jVar.f5285j) == null || bVar3.f4903h != 4)) {
            if (bVar3 != null) {
                if (jVar.f5288m == 1) {
                    jVar.f();
                    return;
                } else {
                    jVar.e(bVar3);
                    yVar2.b();
                    return;
                }
            }
            return;
        }
        int i10 = jVar.f5288m;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                jVar.f5288m = 0;
            } else {
                v vVar = jVar.f5279d;
                p6.u.g(vVar);
                vVar.a(jVar.f5283h);
            }
        }
        jVar.f();
        jVar.f5288m = 0;
    }

    @Override // o6.i0
    public final void a() {
        this.f5288m = 2;
        this.f5286k = false;
        this.f5285j = null;
        this.f5284i = null;
        this.f5280e.a();
        this.f5281f.a();
    }

    @Override // o6.i0
    public final void b() {
        this.f5285j = null;
        this.f5284i = null;
        this.f5288m = 0;
        this.f5280e.b();
        this.f5281f.b();
        f();
    }

    @Override // o6.i0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f5281f.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f5280e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.f5288m == 1) goto L16;
     */
    @Override // o6.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        this.f5287l.lock();
        try {
            boolean z10 = false;
            if (this.f5280e.f5383n instanceof k) {
                if (!(this.f5281f.f5383n instanceof k)) {
                    m6.b bVar = this.f5285j;
                    if (!(bVar != null && bVar.f4903h == 4)) {
                    }
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.f5287l.unlock();
        }
    }

    public final void e(m6.b bVar) {
        int i10 = this.f5288m;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f5288m = 0;
            }
            this.f5279d.b(bVar);
        }
        f();
        this.f5288m = 0;
    }

    public final void f() {
        Set set = this.f5282g;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        set.clear();
    }
}

package O2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import g1.C4523c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m.b1;

/* renamed from: O2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360j implements K {

    /* renamed from: A, reason: collision with root package name */
    public Object f2245A;

    /* renamed from: B, reason: collision with root package name */
    public Object f2246B;

    /* renamed from: C, reason: collision with root package name */
    public Object f2247C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2248n;

    /* renamed from: u, reason: collision with root package name */
    public int f2249u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2250v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2251w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2252x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2253y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2254z;

    public C0360j(Context context, w wVar, ReentrantLock reentrantLock, Looper looper, M2.f fVar, s.b bVar, s.b bVar2, b1 b1Var, R2.b bVar3, N2.c cVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar4, s.b bVar5) {
        this.f2253y = Collections.newSetFromMap(new WeakHashMap());
        this.f2245A = null;
        this.f2246B = null;
        this.f2248n = false;
        this.f2249u = 0;
        this.f2250v = wVar;
        this.f2247C = reentrantLock;
        this.f2251w = new z(context, wVar, reentrantLock, looper, fVar, bVar2, null, bVar5, null, arrayList2, new C4523c(9, this));
        this.f2252x = new z(context, wVar, reentrantLock, looper, fVar, bVar, b1Var, bVar4, bVar3, arrayList, new F1.a(6, this));
        s.b bVar6 = new s.b();
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            bVar6.put((N2.d) it.next(), (z) this.f2251w);
        }
        Iterator it2 = ((s.g) bVar.keySet()).iterator();
        while (it2.hasNext()) {
            bVar6.put((N2.d) it2.next(), (z) this.f2252x);
        }
        Collections.unmodifiableMap(bVar6);
    }

    public static /* bridge */ /* synthetic */ void g(C0360j c0360j, int i) {
        ((w) c0360j.f2250v).l(i);
        c0360j.f2246B = null;
        c0360j.f2245A = null;
    }

    public static void h(C0360j c0360j) {
        M2.b bVar;
        M2.b bVar2;
        M2.b bVar3;
        M2.b bVar4 = (M2.b) c0360j.f2245A;
        boolean z3 = bVar4 != null && bVar4.b();
        z zVar = (z) c0360j.f2251w;
        if (!z3) {
            M2.b bVar5 = (M2.b) c0360j.f2245A;
            z zVar2 = (z) c0360j.f2252x;
            if (bVar5 != null && (bVar2 = (M2.b) c0360j.f2246B) != null && bVar2.b()) {
                zVar2.c();
                M2.b bVar6 = (M2.b) c0360j.f2245A;
                P2.w.h(bVar6);
                c0360j.e(bVar6);
                return;
            }
            M2.b bVar7 = (M2.b) c0360j.f2245A;
            if (bVar7 == null || (bVar = (M2.b) c0360j.f2246B) == null) {
                return;
            }
            if (zVar2.f2321E < zVar.f2321E) {
                bVar7 = bVar;
            }
            c0360j.e(bVar7);
            return;
        }
        M2.b bVar8 = (M2.b) c0360j.f2246B;
        if (!(bVar8 != null && bVar8.b()) && ((bVar3 = (M2.b) c0360j.f2246B) == null || bVar3.f1830u != 4)) {
            if (bVar3 != null) {
                if (c0360j.f2249u == 1) {
                    c0360j.f();
                    return;
                } else {
                    c0360j.e(bVar3);
                    zVar.c();
                    return;
                }
            }
            return;
        }
        int i = c0360j.f2249u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c0360j.f2249u = 0;
            } else {
                w wVar = (w) c0360j.f2250v;
                P2.w.h(wVar);
                wVar.m((Bundle) c0360j.f2254z);
            }
        }
        c0360j.f();
        c0360j.f2249u = 0;
    }

    @Override // O2.K
    public void a() {
        this.f2249u = 2;
        this.f2248n = false;
        this.f2246B = null;
        this.f2245A = null;
        ((z) this.f2251w).a();
        ((z) this.f2252x).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4.f2249u == 1) goto L16;
     */
    @Override // O2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        ((ReentrantLock) this.f2247C).lock();
        try {
            boolean z3 = false;
            if (((z) this.f2251w).f2320D instanceof C0362l) {
                if (!(((z) this.f2252x).f2320D instanceof C0362l)) {
                    M2.b bVar = (M2.b) this.f2246B;
                    if (!(bVar != null && bVar.f1830u == 4)) {
                    }
                }
                z3 = true;
            }
            return z3;
        } finally {
            ((ReentrantLock) this.f2247C).unlock();
        }
    }

    @Override // O2.K
    public void c() {
        this.f2246B = null;
        this.f2245A = null;
        this.f2249u = 0;
        ((z) this.f2251w).c();
        ((z) this.f2252x).c();
        f();
    }

    @Override // O2.K
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        ((z) this.f2252x).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        ((z) this.f2251w).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public void e(M2.b bVar) {
        int i = this.f2249u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2249u = 0;
            }
            ((w) this.f2250v).f(bVar);
        }
        f();
        this.f2249u = 0;
    }

    public void f() {
        Set set = (Set) this.f2253y;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
        set.clear();
    }

    public C0360j(ContextThemeWrapper contextThemeWrapper) {
        this.f2249u = -1;
        this.f2250v = contextThemeWrapper;
        this.f2251w = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}

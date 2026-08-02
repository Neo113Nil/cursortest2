package Q2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* renamed from: Q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365j implements J {

    /* renamed from: A, reason: collision with root package name */
    public Object f2563A;

    /* renamed from: B, reason: collision with root package name */
    public Object f2564B;

    /* renamed from: C, reason: collision with root package name */
    public Object f2565C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2566n;

    /* renamed from: u, reason: collision with root package name */
    public int f2567u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2568v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2569w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2570x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2571y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2572z;

    public C0365j(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, O2.f fVar, s.b bVar, s.b bVar2, c1 c1Var, T2.b bVar3, P2.c cVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar4, s.b bVar5) {
        this.f2571y = Collections.newSetFromMap(new WeakHashMap());
        this.f2563A = null;
        this.f2564B = null;
        this.f2566n = false;
        this.f2567u = 0;
        this.f2568v = vVar;
        this.f2565C = reentrantLock;
        this.f2569w = new y(context, vVar, reentrantLock, looper, fVar, bVar2, null, bVar5, null, arrayList2, new n4.c(13, this));
        this.f2570x = new y(context, vVar, reentrantLock, looper, fVar, bVar, c1Var, bVar4, bVar3, arrayList, new I0.j(12, this));
        s.b bVar6 = new s.b();
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            bVar6.put((P2.d) it.next(), (y) this.f2569w);
        }
        Iterator it2 = ((s.g) bVar.keySet()).iterator();
        while (it2.hasNext()) {
            bVar6.put((P2.d) it2.next(), (y) this.f2570x);
        }
        Collections.unmodifiableMap(bVar6);
    }

    public static /* bridge */ /* synthetic */ void g(C0365j c0365j, int i) {
        ((v) c0365j.f2568v).k(i);
        c0365j.f2564B = null;
        c0365j.f2563A = null;
    }

    public static void h(C0365j c0365j) {
        O2.b bVar;
        O2.b bVar2;
        O2.b bVar3;
        O2.b bVar4 = (O2.b) c0365j.f2563A;
        boolean z6 = bVar4 != null && bVar4.b();
        y yVar = (y) c0365j.f2569w;
        if (!z6) {
            O2.b bVar5 = (O2.b) c0365j.f2563A;
            y yVar2 = (y) c0365j.f2570x;
            if (bVar5 != null && (bVar2 = (O2.b) c0365j.f2564B) != null && bVar2.b()) {
                yVar2.c();
                O2.b bVar6 = (O2.b) c0365j.f2563A;
                R2.w.h(bVar6);
                c0365j.e(bVar6);
                return;
            }
            O2.b bVar7 = (O2.b) c0365j.f2563A;
            if (bVar7 == null || (bVar = (O2.b) c0365j.f2564B) == null) {
                return;
            }
            if (yVar2.f2637E < yVar.f2637E) {
                bVar7 = bVar;
            }
            c0365j.e(bVar7);
            return;
        }
        O2.b bVar8 = (O2.b) c0365j.f2564B;
        if (!(bVar8 != null && bVar8.b()) && ((bVar3 = (O2.b) c0365j.f2564B) == null || bVar3.f2256u != 4)) {
            if (bVar3 != null) {
                if (c0365j.f2567u == 1) {
                    c0365j.f();
                    return;
                } else {
                    c0365j.e(bVar3);
                    yVar.c();
                    return;
                }
            }
            return;
        }
        int i = c0365j.f2567u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c0365j.f2567u = 0;
            } else {
                v vVar = (v) c0365j.f2568v;
                R2.w.h(vVar);
                vVar.o((Bundle) c0365j.f2572z);
            }
        }
        c0365j.f();
        c0365j.f2567u = 0;
    }

    @Override // Q2.J
    public void a() {
        this.f2567u = 2;
        this.f2566n = false;
        this.f2564B = null;
        this.f2563A = null;
        ((y) this.f2569w).a();
        ((y) this.f2570x).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4.f2567u == 1) goto L16;
     */
    @Override // Q2.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        ((ReentrantLock) this.f2565C).lock();
        try {
            boolean z6 = false;
            if (((y) this.f2569w).f2636D instanceof C0366k) {
                if (!(((y) this.f2570x).f2636D instanceof C0366k)) {
                    O2.b bVar = (O2.b) this.f2564B;
                    if (!(bVar != null && bVar.f2256u == 4)) {
                    }
                }
                z6 = true;
            }
            return z6;
        } finally {
            ((ReentrantLock) this.f2565C).unlock();
        }
    }

    @Override // Q2.J
    public void c() {
        this.f2564B = null;
        this.f2563A = null;
        this.f2567u = 0;
        ((y) this.f2569w).c();
        ((y) this.f2570x).c();
        f();
    }

    @Override // Q2.J
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        ((y) this.f2570x).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        ((y) this.f2569w).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public void e(O2.b bVar) {
        int i = this.f2567u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2567u = 0;
            }
            ((v) this.f2568v).s(bVar);
        }
        f();
        this.f2567u = 0;
    }

    public void f() {
        Set set = (Set) this.f2571y;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
        set.clear();
    }

    public C0365j(ContextThemeWrapper contextThemeWrapper) {
        this.f2567u = -1;
        this.f2568v = contextThemeWrapper;
        this.f2569w = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}

package N2;

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

/* renamed from: N2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324j implements J {

    /* renamed from: A, reason: collision with root package name */
    public Object f2062A;

    /* renamed from: B, reason: collision with root package name */
    public Object f2063B;

    /* renamed from: C, reason: collision with root package name */
    public Object f2064C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2065n;

    /* renamed from: u, reason: collision with root package name */
    public int f2066u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2067v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2068w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2069x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2070y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2071z;

    public C0324j(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, L2.f fVar, s.b bVar, s.b bVar2, c1 c1Var, Q2.b bVar3, M2.c cVar, ArrayList arrayList, ArrayList arrayList2, s.b bVar4, s.b bVar5) {
        this.f2070y = Collections.newSetFromMap(new WeakHashMap());
        this.f2062A = null;
        this.f2063B = null;
        this.f2065n = false;
        this.f2066u = 0;
        this.f2067v = vVar;
        this.f2064C = reentrantLock;
        this.f2068w = new y(context, vVar, reentrantLock, looper, fVar, bVar2, null, bVar5, null, arrayList2, new h4.c(9, this));
        this.f2069x = new y(context, vVar, reentrantLock, looper, fVar, bVar, c1Var, bVar4, bVar3, arrayList, new I0.j(10, this));
        s.b bVar6 = new s.b();
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            bVar6.put((M2.d) it.next(), (y) this.f2068w);
        }
        Iterator it2 = ((s.g) bVar.keySet()).iterator();
        while (it2.hasNext()) {
            bVar6.put((M2.d) it2.next(), (y) this.f2069x);
        }
        Collections.unmodifiableMap(bVar6);
    }

    public static /* bridge */ /* synthetic */ void g(C0324j c0324j, int i) {
        ((v) c0324j.f2067v).m(i);
        c0324j.f2063B = null;
        c0324j.f2062A = null;
    }

    public static void h(C0324j c0324j) {
        L2.b bVar;
        L2.b bVar2;
        L2.b bVar3;
        L2.b bVar4 = (L2.b) c0324j.f2062A;
        boolean z8 = bVar4 != null && bVar4.b();
        y yVar = (y) c0324j.f2068w;
        if (!z8) {
            L2.b bVar5 = (L2.b) c0324j.f2062A;
            y yVar2 = (y) c0324j.f2069x;
            if (bVar5 != null && (bVar2 = (L2.b) c0324j.f2063B) != null && bVar2.b()) {
                yVar2.c();
                L2.b bVar6 = (L2.b) c0324j.f2062A;
                O2.w.h(bVar6);
                c0324j.e(bVar6);
                return;
            }
            L2.b bVar7 = (L2.b) c0324j.f2062A;
            if (bVar7 == null || (bVar = (L2.b) c0324j.f2063B) == null) {
                return;
            }
            if (yVar2.f2136E < yVar.f2136E) {
                bVar7 = bVar;
            }
            c0324j.e(bVar7);
            return;
        }
        L2.b bVar8 = (L2.b) c0324j.f2063B;
        if (!(bVar8 != null && bVar8.b()) && ((bVar3 = (L2.b) c0324j.f2063B) == null || bVar3.f1712u != 4)) {
            if (bVar3 != null) {
                if (c0324j.f2066u == 1) {
                    c0324j.f();
                    return;
                } else {
                    c0324j.e(bVar3);
                    yVar.c();
                    return;
                }
            }
            return;
        }
        int i = c0324j.f2066u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c0324j.f2066u = 0;
            } else {
                v vVar = (v) c0324j.f2067v;
                O2.w.h(vVar);
                vVar.n((Bundle) c0324j.f2071z);
            }
        }
        c0324j.f();
        c0324j.f2066u = 0;
    }

    @Override // N2.J
    public void a() {
        this.f2066u = 2;
        this.f2065n = false;
        this.f2063B = null;
        this.f2062A = null;
        ((y) this.f2068w).a();
        ((y) this.f2069x).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4.f2066u == 1) goto L16;
     */
    @Override // N2.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        ((ReentrantLock) this.f2064C).lock();
        try {
            boolean z8 = false;
            if (((y) this.f2068w).f2135D instanceof C0325k) {
                if (!(((y) this.f2069x).f2135D instanceof C0325k)) {
                    L2.b bVar = (L2.b) this.f2063B;
                    if (!(bVar != null && bVar.f1712u == 4)) {
                    }
                }
                z8 = true;
            }
            return z8;
        } finally {
            ((ReentrantLock) this.f2064C).unlock();
        }
    }

    @Override // N2.J
    public void c() {
        this.f2063B = null;
        this.f2062A = null;
        this.f2066u = 0;
        ((y) this.f2068w).c();
        ((y) this.f2069x).c();
        f();
    }

    @Override // N2.J
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        ((y) this.f2069x).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        ((y) this.f2068w).d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public void e(L2.b bVar) {
        int i = this.f2066u;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2066u = 0;
            }
            ((v) this.f2067v).i(bVar);
        }
        f();
        this.f2066u = 0;
    }

    public void f() {
        Set set = (Set) this.f2070y;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
        set.clear();
    }

    public C0324j(ContextThemeWrapper contextThemeWrapper) {
        this.f2066u = -1;
        this.f2067v = contextThemeWrapper;
        this.f2068w = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}

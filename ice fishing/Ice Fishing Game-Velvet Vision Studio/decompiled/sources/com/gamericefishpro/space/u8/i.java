package com.gamericefishpro.space.u8;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements i0 {
    public final u d;
    public final x e;
    public final x f;
    public Bundle h;
    public final Lock l;
    public final Set g = Collections.newSetFromMap(new WeakHashMap());
    public com.gamericefishpro.space.s8.b i = null;
    public com.gamericefishpro.space.s8.b j = null;
    public boolean k = false;
    public int m = 0;

    public i(Context context, u uVar, ReentrantLock reentrantLock, Looper looper, com.gamericefishpro.space.s8.f fVar, com.gamericefishpro.space.t.e eVar, com.gamericefishpro.space.t.e eVar2, com.gamericefishpro.space.b8.k kVar, com.gamericefishpro.space.o9.b bVar, com.gamericefishpro.space.t8.a aVar, ArrayList arrayList, ArrayList arrayList2, com.gamericefishpro.space.t.e eVar3, com.gamericefishpro.space.t.e eVar4) {
        this.d = uVar;
        this.l = reentrantLock;
        this.e = new x(context, uVar, reentrantLock, looper, fVar, eVar2, null, eVar4, null, arrayList2, new s0(this, 0));
        this.f = new x(context, uVar, reentrantLock, looper, fVar, eVar, kVar, eVar3, bVar, arrayList, new s0(this, 1));
        com.gamericefishpro.space.t.e eVar5 = new com.gamericefishpro.space.t.e(0);
        Iterator it = ((com.gamericefishpro.space.t.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            eVar5.put((com.gamericefishpro.space.t8.b) it.next(), this.e);
        }
        Iterator it2 = ((com.gamericefishpro.space.t.b) eVar.keySet()).iterator();
        while (it2.hasNext()) {
            eVar5.put((com.gamericefishpro.space.t8.b) it2.next(), this.f);
        }
        Collections.unmodifiableMap(eVar5);
    }

    public static /* bridge */ /* synthetic */ void g(i iVar, int i) {
        iVar.d.c(i);
        iVar.j = null;
        iVar.i = null;
    }

    public static void h(i iVar) {
        com.gamericefishpro.space.s8.b bVar;
        com.gamericefishpro.space.s8.b bVar2;
        com.gamericefishpro.space.s8.b bVar3;
        com.gamericefishpro.space.s8.b bVar4 = iVar.i;
        x xVar = iVar.f;
        x xVar2 = iVar.e;
        if (bVar4 == null || !bVar4.c()) {
            if (iVar.i != null && (bVar2 = iVar.j) != null && bVar2.c()) {
                xVar.b();
                com.gamericefishpro.space.s8.b bVar5 = iVar.i;
                com.gamericefishpro.space.v8.c0.g(bVar5);
                iVar.e(bVar5);
                return;
            }
            com.gamericefishpro.space.s8.b bVar6 = iVar.i;
            if (bVar6 == null || (bVar = iVar.j) == null) {
                return;
            }
            if (xVar.o < xVar2.o) {
                bVar6 = bVar;
            }
            iVar.e(bVar6);
            return;
        }
        com.gamericefishpro.space.s8.b bVar7 = iVar.j;
        if ((bVar7 == null || !bVar7.c()) && ((bVar3 = iVar.j) == null || bVar3.e != 4)) {
            if (bVar3 != null) {
                if (iVar.m == 1) {
                    iVar.f();
                    return;
                } else {
                    iVar.e(bVar3);
                    xVar2.b();
                    return;
                }
            }
            return;
        }
        int i = iVar.m;
        if (i == 1) {
            iVar.f();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            u uVar = iVar.d;
            com.gamericefishpro.space.v8.c0.g(uVar);
            uVar.a(iVar.h);
            iVar.f();
        }
        iVar.m = 0;
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void a() {
        this.m = 2;
        this.k = false;
        this.j = null;
        this.i = null;
        this.e.a();
        this.f.a();
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void b() {
        this.j = null;
        this.i = null;
        this.m = 0;
        this.e.b();
        this.f.b();
        f();
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    @Override // com.gamericefishpro.space.u8.i0
    public final boolean d() {
        this.l.lock();
        try {
            boolean z = false;
            if (this.e.n instanceof j) {
                if (this.f.n instanceof j) {
                    z = true;
                } else {
                    com.gamericefishpro.space.s8.b bVar = this.j;
                    if ((bVar != null && bVar.e == 4) || this.m == 1) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            this.l.unlock();
        }
    }

    public final void e(com.gamericefishpro.space.s8.b bVar) {
        int i = this.m;
        if (i == 1) {
            f();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.d.b(bVar);
            f();
        }
        this.m = 0;
    }

    public final void f() {
        Set set = this.g;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        set.clear();
    }
}

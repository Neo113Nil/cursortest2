package com.gamericefishpro.space.u8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.gamericefishpro.space.i9.d5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements i0, com.gamericefishpro.space.t8.f {
    public final Lock d;
    public final Condition e;
    public final Context f;
    public final com.gamericefishpro.space.s8.f g;
    public final s h;
    public final Map i;
    public final HashMap j = new HashMap();
    public final com.gamericefishpro.space.b8.k k;
    public final Map l;
    public final d5 m;
    public volatile v n;
    public int o;
    public final u p;
    public final g0 q;

    public x(Context context, u uVar, Lock lock, Looper looper, com.gamericefishpro.space.s8.f fVar, com.gamericefishpro.space.t.e eVar, com.gamericefishpro.space.b8.k kVar, com.gamericefishpro.space.t.e eVar2, d5 d5Var, ArrayList arrayList, g0 g0Var) {
        this.f = context;
        this.d = lock;
        this.g = fVar;
        this.i = eVar;
        this.k = kVar;
        this.l = eVar2;
        this.m = d5Var;
        this.p = uVar;
        this.q = g0Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r0) arrayList.get(i)).f = this;
        }
        this.h = new s(this, looper, 1);
        this.e = lock.newCondition();
        this.n = new com.gamericefishpro.space.tb.u(8, this);
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void a() {
        this.n.n();
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void b() {
        if (this.n.q()) {
            this.j.clear();
        }
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.n);
        for (com.gamericefishpro.space.t8.c cVar : this.l.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) cVar.c).println(":");
            com.gamericefishpro.space.t8.a aVar = (com.gamericefishpro.space.t8.a) this.i.get(cVar.b);
            com.gamericefishpro.space.v8.c0.g(aVar);
            aVar.h(strValueOf.concat("  "), printWriter);
        }
    }

    @Override // com.gamericefishpro.space.u8.i0
    public final boolean d() {
        return this.n instanceof j;
    }

    public final void e() {
        this.d.lock();
        try {
            this.n = new com.gamericefishpro.space.tb.u(8, this);
            this.n.i();
            this.e.signalAll();
        } finally {
            this.d.unlock();
        }
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnected(Bundle bundle) {
        this.d.lock();
        try {
            this.n.d(bundle);
        } finally {
            this.d.unlock();
        }
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnectionSuspended(int i) {
        this.d.lock();
        try {
            this.n.g(i);
        } finally {
            this.d.unlock();
        }
    }
}

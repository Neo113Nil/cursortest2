package com.gamericefishpro.space.t0;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public final x a;
    public final u b;
    public final r c;
    public final Function2 d;
    public final boolean e;
    public final com.gamericefishpro.space.h2.d2 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(j1.i);
    public long i = com.gamericefishpro.space.b1.n.b();
    public com.gamericefishpro.space.t.i0 j;
    public final com.gamericefishpro.space.u6.q k;
    public final v1 l;

    public i1(x xVar, u uVar, r rVar, com.gamericefishpro.space.t.k0 k0Var, Function2 function2, boolean z, com.gamericefishpro.space.h2.d2 d2Var, Object obj) {
        this.a = xVar;
        this.b = uVar;
        this.c = rVar;
        this.d = function2;
        this.e = z;
        this.f = d2Var;
        this.g = obj;
        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.t.q0.a;
        Intrinsics.c(i0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = i0Var;
        com.gamericefishpro.space.u6.q qVar = new com.gamericefishpro.space.u6.q();
        qVar.o(k0Var, rVar.C());
        this.k = qVar;
        this.l = new v1(d2Var.i);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((j1) atomicReference.get()).ordinal()) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    b();
                    j1 j1Var = j1.y;
                    j1 j1Var2 = j1.z;
                    while (!atomicReference.compareAndSet(j1Var, j1Var2)) {
                        if (atomicReference.get() != j1Var) {
                            m1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new com.gamericefishpro.space.oh.k();
            }
        } catch (Exception e) {
            atomicReference.set(j1.d);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.J = null;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.J = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((j1) this.h.get()).compareTo(j1.y) >= 0;
    }

    public final void d() {
        boolean z;
        j1 j1Var = j1.v;
        j1 j1Var2 = j1.y;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(j1Var, j1Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != j1Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        m1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:26:0x007f->B:83:?, LOOP_END, SYNTHETIC] */
    public final boolean e(c2 c2Var) throws Exception {
        long j;
        j1 j1Var;
        j1 j1Var2;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((j1) atomicReference.get()).ordinal();
            x xVar = this.a;
            u uVar = this.b;
            switch (iOrdinal) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    r rVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        rVar.z = 100;
                        rVar.y = true;
                    }
                    try {
                        this.j = uVar.b(xVar, c2Var, this.d);
                        if (z) {
                            rVar.u();
                        }
                        j1 j1Var3 = j1.i;
                        j1 j1Var4 = j1.v;
                        while (!atomicReference.compareAndSet(j1Var3, j1Var4)) {
                            if (atomicReference.get() != j1Var3) {
                                m1.b("Unexpected state change from: " + j1Var3 + " to: " + j1Var4 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            rVar.u();
                        }
                        throw th;
                    }
                case 3:
                    j1 j1Var5 = j1.v;
                    j1 j1Var6 = j1.w;
                    try {
                        while (!atomicReference.compareAndSet(j1Var5, j1Var6)) {
                            if (atomicReference.get() != j1Var5) {
                                m1.b("Unexpected state change from: " + j1Var5 + " to: " + j1Var6 + '.');
                                j = this.i;
                                this.i = com.gamericefishpro.space.b1.n.b();
                                this.j = uVar.n(xVar, c2Var, this.j);
                                this.i = j;
                                j1Var = j1.w;
                                j1Var2 = j1.v;
                                while (!atomicReference.compareAndSet(j1Var, j1Var2)) {
                                    if (atomicReference.get() != j1Var) {
                                        m1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = com.gamericefishpro.space.b1.n.b();
                        this.j = uVar.n(xVar, c2Var, this.j);
                        this.i = j;
                        j1Var = j1.w;
                        j1Var2 = j1.v;
                        while (!atomicReference.compareAndSet(j1Var, j1Var2)) {
                            if (atomicReference.get() != j1Var) {
                                m1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.i = j;
                        j1 j1Var7 = j1.w;
                        j1 j1Var8 = j1.v;
                        while (!atomicReference.compareAndSet(j1Var7, j1Var8)) {
                            if (atomicReference.get() != j1Var7) {
                                m1.b("Unexpected state change from: " + j1Var7 + " to: " + j1Var8 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.i;
                case 4:
                    s.b("Recursive call to resume()");
                    throw new com.gamericefishpro.space.oh.e();
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new com.gamericefishpro.space.oh.k();
            }
        } catch (Exception e) {
            atomicReference.set(j1.d);
            throw e;
        }
    }
}

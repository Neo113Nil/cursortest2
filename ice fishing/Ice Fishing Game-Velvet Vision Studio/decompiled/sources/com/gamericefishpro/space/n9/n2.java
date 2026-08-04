package com.gamericefishpro.space.n9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ t2 i;

    public /* synthetic */ n2(t2 t2Var, AtomicReference atomicReference, int i, boolean z) {
        this.d = i;
        this.i = t2Var;
        this.e = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.e;
        synchronized (atomicReference) {
            try {
                try {
                    r1 r1Var = (r1) this.i.d;
                    atomicReference.set(Double.valueOf(r1Var.v.A(r1Var.q().x(), e0.e0)));
                    this.e.notify();
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AtomicReference atomicReference = this.e;
                synchronized (atomicReference) {
                    try {
                        try {
                            r1 r1Var = (r1) this.i.d;
                            atomicReference.set(Boolean.valueOf(r1Var.v.B(r1Var.q().x(), e0.a0)));
                            this.e.notify();
                        } catch (Throwable th) {
                            this.e.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            r1 r1Var2 = (r1) this.i.d;
                            atomicReference2.set(r1Var2.v.x(r1Var2.q().x(), e0.b0));
                            this.e.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.e.notify();
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.e;
                synchronized (atomicReference3) {
                    try {
                        try {
                            r1 r1Var3 = (r1) this.i.d;
                            atomicReference3.set(Long.valueOf(r1Var3.v.y(r1Var3.q().x(), e0.c0)));
                            this.e.notify();
                        } catch (Throwable th5) {
                            this.e.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.e;
                synchronized (atomicReference4) {
                    try {
                        try {
                            r1 r1Var4 = (r1) this.i.d;
                            atomicReference4.set(Integer.valueOf(r1Var4.v.z(r1Var4.q().x(), e0.d0)));
                            this.e.notify();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        this.e.notify();
                        throw th8;
                    }
                }
                return;
            case 4:
                a();
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                t2 t2Var = this.i;
                f1 f1Var = ((r1) t2Var.d).w;
                r1.j(f1Var);
                Bundle bundleK = f1Var.G.k();
                o3 o3VarO = ((r1) t2Var.d).o();
                AtomicReference atomicReference5 = this.e;
                o3VarO.r();
                o3VarO.s();
                o3VarO.F(new com.gamericefishpro.space.d4.r0(o3VarO, atomicReference5, o3VarO.H(false), bundleK, 8));
                return;
            default:
                o3 o3VarO2 = ((r1) this.i.d).o();
                e4 e4VarB = e4.b(a3.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.e;
                o3VarO2.r();
                o3VarO2.s();
                o3VarO2.F(new com.gamericefishpro.space.d4.r0(o3VarO2, atomicReference6, o3VarO2.H(false), e4VarB, 9));
                return;
        }
    }

    public n2(t2 t2Var, AtomicReference atomicReference, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = atomicReference;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
            case 2:
                this.e = atomicReference;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
            case 3:
                this.e = atomicReference;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
            case 4:
                this.e = atomicReference;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
            default:
                this.e = atomicReference;
                Objects.requireNonNull(t2Var);
                this.i = t2Var;
                break;
        }
    }
}

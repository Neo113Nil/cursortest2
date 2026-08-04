package com.gamericefishpro.space.s5;

import android.database.SQLException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.z0;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ k0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(k0 k0Var, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = k0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = new f0(this.v, aVar, 0);
                f0Var.i = obj;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(this.v, aVar, 1);
                f0Var2.i = obj;
                return f0Var2;
            default:
                f0 f0Var3 = new f0(this.v, aVar, 2);
                f0Var3.i = obj;
                return f0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((f0) create((com.gamericefishpro.space.u5.k) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((f0) create((a0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((f0) create((a0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        Object objA;
        Object objB;
        a0 a0Var2;
        Object objA2;
        j[] jVarArr;
        j jVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.u5.k kVar = (com.gamericefishpro.space.u5.k) this.i;
                this.e = 1;
                Object objA3 = k0.a(this.v, kVar, this);
                return objA3 == aVar ? aVar : objA3;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            a0Var = (a0) this.i;
                            com.gamericefishpro.space.wa.b.P(obj);
                            objA = obj;
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.gamericefishpro.space.wa.b.P(obj);
                            objB = obj;
                        }
                        return (Set) objB;
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    a0Var = (a0) this.i;
                    this.i = a0Var;
                    this.e = 1;
                    objA = a0Var.a(this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    if (((Boolean) objA).booleanValue()) {
                        return com.gamericefishpro.space.ph.i0.d;
                    }
                    z zVar = z.e;
                    f0 f0Var = new f0(this.v, null, 0);
                    this.i = null;
                    this.e = 2;
                    objB = a0Var.b(zVar, f0Var, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                    return (Set) objB;
                } catch (SQLException unused) {
                    return com.gamericefishpro.space.ph.i0.d;
                }
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                boolean z = true;
                if (i3 != 0) {
                    if (i3 == 1) {
                        a0Var2 = (a0) this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                        objA2 = obj;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                a0Var2 = (a0) this.i;
                this.i = a0Var2;
                this.e = 1;
                objA2 = a0Var2.a(this);
                if (objA2 == aVar3) {
                    return aVar3;
                }
                if (((Boolean) objA2).booleanValue()) {
                    return Unit.a;
                }
                k0 k0Var = this.v;
                z0 z0Var = k0Var.h;
                long[] jArr = (long[]) z0Var.c;
                ReentrantLock reentrantLock = (ReentrantLock) z0Var.b;
                reentrantLock.lock();
                try {
                    if (z0Var.a) {
                        boolean z2 = false;
                        z0Var.a = false;
                        int length = jArr.length;
                        jVarArr = new j[length];
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 < length) {
                            boolean z4 = jArr[i4] > 0 ? z : z2;
                            boolean[] zArr = (boolean[]) z0Var.d;
                            if (z4 != zArr[i4]) {
                                zArr[i4] = z4;
                                jVar = z4 ? j.e : j.i;
                                z3 = true;
                            } else {
                                jVar = j.d;
                            }
                            jVarArr[i4] = jVar;
                            i4++;
                            z = true;
                            z2 = false;
                        }
                        if (!z3) {
                            jVarArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        jVarArr = null;
                    }
                    if (jVarArr != null) {
                        z zVar2 = z.e;
                        j0 j0Var = new j0(jVarArr, k0Var, a0Var2, null);
                        this.i = null;
                        this.e = 2;
                        if (a0Var2.b(zVar2, j0Var, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}

package ru.yandex.taxi.preorder.source.userposition.repository;

import defpackage.dqs;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.icz;
import defpackage.jst;
import defpackage.k421;
import defpackage.ny61;
import defpackage.tst;
import defpackage.xby;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final tst a;
    public final k421 b;
    public final h3y c;
    public final h3y d;
    public final icz e;
    public volatile dqs f;
    public volatile e g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public b(tst tstVar, k421 k421Var, h3y h3yVar, h3y h3yVar2, icz iczVar) {
        this.a = tstVar;
        this.b = k421Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = iczVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(2:11|(7:13|14|15|16|17|18|19)(2:21|22))(8:23|24|25|15|16|17|18|19))(1:26))(1:46)|27|(3:29|30|(3:32|(5:35|25|15|16|17)|34)(5:36|37|15|16|17))|18|19))|60|6|7|(0)(0)|27|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        if (r13.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0044, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r13v1, types: [g050, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1 fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1;
        ?? r13;
        int i;
        dqs dqsVar;
        g050 g050Var;
        dqs dqsVar2;
        try {
            if (continuationImpl instanceof FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1) {
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1 = (FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1) continuationImpl;
                int i2 = fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label = i2 - Integer.MIN_VALUE;
                    r13 = fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.result;
                    Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label;
                    if (i != 0) {
                        kotlin.b.b(r13);
                        g050Var = this.h;
                        fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.L$0 = g050Var;
                        fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                obj = (g050) fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.L$0;
                                kotlin.b.b(r13);
                                jst.e.n("Fused location: using GMS");
                                dqsVar2 = (dqs) this.c.get();
                                dqsVar = dqsVar2;
                                g050Var = obj;
                                this.f = dqsVar;
                                g050Var.d(null);
                                return dqsVar;
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = (g050) fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.L$0;
                            kotlin.b.b(r13);
                            jst.e.n("Fused location: using HMS");
                            dqsVar2 = (dqs) this.d.get();
                            dqsVar = dqsVar2;
                            g050Var = obj;
                            this.f = dqsVar;
                            g050Var.d(null);
                            return dqsVar;
                        }
                        g050 g050Var2 = (g050) fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.L$0;
                        kotlin.b.b(r13);
                        g050Var = g050Var2;
                    }
                    dqsVar = this.f;
                    if (dqsVar == null) {
                        try {
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            obj = g050Var;
                            Throwable th2 = th;
                            xby.l(jst.e, "LOCATION:FUSED_UNAVAILABLE", null, th2, "Fused location: unavailable", 2);
                            dqsVar = null;
                            g050Var = obj;
                            this.f = dqsVar;
                            g050Var.d(null);
                            return dqsVar;
                        }
                        if (((ru.yandex.taxi.vendor_api.google.b) this.a).b()) {
                            tst tstVar = this.a;
                            fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.L$0 = g050Var;
                            fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label = 2;
                            if (((ru.yandex.taxi.vendor_api.google.b) tstVar).a(fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1) != obj) {
                                obj = g050Var;
                                jst.e.n("Fused location: using GMS");
                                dqsVar2 = (dqs) this.c.get();
                                dqsVar = dqsVar2;
                                g050Var = obj;
                                this.f = dqsVar;
                            }
                            return obj;
                        }
                        this.b.getClass();
                        jst.e.n("Fused location: unavailable");
                        obj = g050Var;
                        dqsVar2 = null;
                        dqsVar = dqsVar2;
                        g050Var = obj;
                        this.f = dqsVar;
                    }
                    g050Var.d(null);
                    return dqsVar;
                }
            }
            if (i != 0) {
            }
            dqsVar = this.f;
            if (dqsVar == null) {
            }
            g050Var.d(null);
            return dqsVar;
        } catch (Throwable th3) {
            r13.d(null);
            throw th3;
        }
        fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1 = new FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1(this, continuationImpl);
        r13 = fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0076, B:14:0x007a), top: B:11:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1 fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1;
        int i;
        dqs dqsVar;
        b bVar;
        dqs dqsVar2;
        g050 g050Var;
        e eVar;
        if (continuationImpl instanceof FusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1) {
            fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1 = (FusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1) continuationImpl;
            int i2 = fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar2 = this.g;
                    if (eVar2 != null) {
                        return eVar2;
                    }
                    fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$0 = this;
                    fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label = 1;
                    obj = a(fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dqsVar2 = (dqs) fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$2;
                        g050Var = (g050) fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$1;
                        bVar = (b) fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$0;
                        kotlin.b.b(obj);
                        try {
                            eVar = bVar.g;
                            if (eVar == null) {
                                eVar = bVar.e.a(dqsVar2);
                                bVar.g = eVar;
                            }
                            return eVar;
                        } finally {
                            g050Var.d(null);
                        }
                    }
                    this = (b) fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$0;
                    kotlin.b.b(obj);
                }
                dqsVar = (dqs) obj;
                if (dqsVar != null) {
                    return null;
                }
                kotlinx.coroutines.sync.a aVar = this.h;
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$0 = this;
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$1 = aVar;
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$2 = dqsVar;
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.L$3 = null;
                fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label = 2;
                if (aVar.a(fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1) != coroutineSingletons) {
                    bVar = this;
                    dqsVar2 = dqsVar;
                    g050Var = aVar;
                    eVar = bVar.g;
                    if (eVar == null) {
                    }
                    return eVar;
                }
                return coroutineSingletons;
            }
        }
        fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1 = new FusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1(this, continuationImpl);
        Object obj2 = fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fusedLocationApiCachingFactoryImpl$getOrCreateLocationRepository$1.label;
        if (i != 0) {
        }
        dqsVar = (dqs) obj2;
        if (dqsVar != null) {
        }
    }
}

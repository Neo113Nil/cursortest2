package flex.core.loader.network;

import defpackage.hoe0;
import defpackage.i7x0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.u1m;
import defpackage.wzl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class g {
    public static final g a = new g();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u1m u1mVar, i7x0 i7x0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        PrefetchStore$execute$1 prefetchStore$execute$1;
        int i;
        b bVar;
        hoe0 hoe0Var;
        b bVar2;
        Exception e;
        u1m u1mVar2;
        hoe0 hoe0Var2;
        if (continuationImpl instanceof PrefetchStore$execute$1) {
            prefetchStore$execute$1 = (PrefetchStore$execute$1) continuationImpl;
            int i2 = prefetchStore$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prefetchStore$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = prefetchStore$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchStore$execute$1.label;
                ConcurrentHashMap concurrentHashMap = b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hoe0 hoe0Var3 = (hoe0) concurrentHashMap.get(u1mVar);
                    try {
                        if (hoe0Var3 != null) {
                            b bVar3 = hoe0Var3.a;
                            if (!bVar3.b.k0()) {
                                prefetchStore$execute$1.L$0 = null;
                                prefetchStore$execute$1.L$1 = null;
                                prefetchStore$execute$1.L$2 = null;
                                prefetchStore$execute$1.L$3 = null;
                                prefetchStore$execute$1.Z$0 = false;
                                prefetchStore$execute$1.label = 1;
                                Object a2 = bVar3.a(false, i7x0Var, prefetchStore$execute$1);
                                return a2 == coroutineSingletons ? coroutineSingletons : a2;
                            }
                        }
                        prefetchStore$execute$1.L$0 = u1mVar;
                        prefetchStore$execute$1.L$1 = null;
                        prefetchStore$execute$1.L$2 = null;
                        prefetchStore$execute$1.L$3 = null;
                        prefetchStore$execute$1.L$4 = bVar;
                        prefetchStore$execute$1.L$5 = hoe0Var;
                        prefetchStore$execute$1.Z$0 = false;
                        prefetchStore$execute$1.label = 2;
                        Object invoke = ((NetworkDocumentLoader$prefetchDocumentInternal$2) tlsVar).invoke(prefetchStore$execute$1);
                        if (invoke != coroutineSingletons) {
                            bVar2 = bVar;
                            obj = invoke;
                            u1mVar2 = u1mVar;
                            hoe0Var2 = hoe0Var;
                        }
                    } catch (Exception e2) {
                        bVar2 = bVar;
                        e = e2;
                        bVar2.b.j0(e);
                        throw e;
                    }
                    bVar = new b(i7x0Var);
                    hoe0Var = new hoe0(bVar);
                    concurrentHashMap.put(u1mVar, hoe0Var);
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hoe0Var2 = (hoe0) prefetchStore$execute$1.L$5;
                    bVar2 = (b) prefetchStore$execute$1.L$4;
                    u1mVar2 = (u1m) prefetchStore$execute$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Exception e3) {
                        e = e3;
                        bVar2.b.j0(e);
                        throw e;
                    }
                }
                wzl wzlVar = (wzl) obj;
                bVar2.b.T(wzlVar);
                if (hoe0Var2.b.get()) {
                    concurrentHashMap.remove(u1mVar2, hoe0Var2);
                }
                return wzlVar;
            }
        }
        prefetchStore$execute$1 = new PrefetchStore$execute$1(this, continuationImpl);
        Object obj2 = prefetchStore$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchStore$execute$1.label;
        ConcurrentHashMap concurrentHashMap2 = b;
        if (i != 0) {
        }
        wzl wzlVar2 = (wzl) obj2;
        bVar2.b.T(wzlVar2);
        if (hoe0Var2.b.get()) {
        }
        return wzlVar2;
    }
}

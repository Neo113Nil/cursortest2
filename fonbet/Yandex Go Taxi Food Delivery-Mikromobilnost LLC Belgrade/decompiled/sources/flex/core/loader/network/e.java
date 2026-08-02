package flex.core.loader.network;

import defpackage.d2m;
import defpackage.dez;
import defpackage.e2m;
import defpackage.hoe0;
import defpackage.i7x0;
import defpackage.kq90;
import defpackage.m0m;
import defpackage.ny61;
import defpackage.q370;
import defpackage.s8o;
import defpackage.tje;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.wzl;
import defpackage.xfz;
import defpackage.ywl;
import defpackage.zjr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e implements m0m, dez {
    public final d a;
    public final List b;
    public final zjr c = new zjr(xfz.b(e.class.getSimpleName()));

    public e(d dVar, List list) {
        this.a = dVar;
        this.b = list;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    @Override // defpackage.m0m
    public final Object b(u1m u1mVar, i7x0 i7x0Var, boolean z, ContinuationImpl continuationImpl) {
        return g.a.a(u1mVar, i7x0Var, new NetworkDocumentLoader$prefetchDocumentInternal$2(this, u1mVar, true, false, false, i7x0Var, false, z, null), continuationImpl);
    }

    @Override // defpackage.m0m
    public final Object c(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        return f(u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.m0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        NetworkDocumentLoader$fetchPortion$1 networkDocumentLoader$fetchPortion$1;
        int i;
        kq90 kq90Var2;
        wbe0 wbe0Var2;
        q370 q370Var2;
        u1m u1mVar2;
        d dVar;
        if (continuation instanceof NetworkDocumentLoader$fetchPortion$1) {
            networkDocumentLoader$fetchPortion$1 = (NetworkDocumentLoader$fetchPortion$1) continuation;
            int i2 = networkDocumentLoader$fetchPortion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkDocumentLoader$fetchPortion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkDocumentLoader$fetchPortion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkDocumentLoader$fetchPortion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar2 = this.a;
                    s8o.S(this, dVar2);
                    e2m e2mVar = new e2m(u1mVar);
                    networkDocumentLoader$fetchPortion$1.L$0 = null;
                    networkDocumentLoader$fetchPortion$1.L$1 = null;
                    networkDocumentLoader$fetchPortion$1.L$2 = q370Var;
                    networkDocumentLoader$fetchPortion$1.L$3 = kq90Var;
                    networkDocumentLoader$fetchPortion$1.L$4 = dVar2;
                    networkDocumentLoader$fetchPortion$1.L$5 = u1mVar;
                    networkDocumentLoader$fetchPortion$1.L$6 = wbe0Var;
                    networkDocumentLoader$fetchPortion$1.label = 1;
                    obj = f.a(this.b, null, e2mVar, networkDocumentLoader$fetchPortion$1);
                    if (obj != coroutineSingletons) {
                        kq90Var2 = kq90Var;
                        wbe0Var2 = wbe0Var;
                        q370Var2 = q370Var;
                        u1mVar2 = u1mVar;
                        dVar = dVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                wbe0 wbe0Var3 = (wbe0) networkDocumentLoader$fetchPortion$1.L$6;
                u1m u1mVar3 = (u1m) networkDocumentLoader$fetchPortion$1.L$5;
                d dVar3 = (d) networkDocumentLoader$fetchPortion$1.L$4;
                kq90 kq90Var3 = (kq90) networkDocumentLoader$fetchPortion$1.L$3;
                q370 q370Var3 = (q370) networkDocumentLoader$fetchPortion$1.L$2;
                kotlin.b.b(obj);
                wbe0Var2 = wbe0Var3;
                kq90Var2 = kq90Var3;
                u1mVar2 = u1mVar3;
                dVar = dVar3;
                q370Var2 = q370Var3;
                networkDocumentLoader$fetchPortion$1.L$0 = null;
                networkDocumentLoader$fetchPortion$1.L$1 = null;
                networkDocumentLoader$fetchPortion$1.L$2 = null;
                networkDocumentLoader$fetchPortion$1.L$3 = null;
                networkDocumentLoader$fetchPortion$1.L$4 = null;
                networkDocumentLoader$fetchPortion$1.L$5 = null;
                networkDocumentLoader$fetchPortion$1.L$6 = null;
                networkDocumentLoader$fetchPortion$1.label = 2;
                Object k0 = tje.k0(dVar.c, new DocumentService$fetchPortion$2(dVar, u1mVar2, (Map) obj, kq90Var2, wbe0Var2, q370Var2, null), networkDocumentLoader$fetchPortion$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        networkDocumentLoader$fetchPortion$1 = new NetworkDocumentLoader$fetchPortion$1(this, (ContinuationImpl) continuation);
        Object obj2 = networkDocumentLoader$fetchPortion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkDocumentLoader$fetchPortion$1.label;
        if (i != 0) {
        }
        networkDocumentLoader$fetchPortion$1.L$0 = null;
        networkDocumentLoader$fetchPortion$1.L$1 = null;
        networkDocumentLoader$fetchPortion$1.L$2 = null;
        networkDocumentLoader$fetchPortion$1.L$3 = null;
        networkDocumentLoader$fetchPortion$1.L$4 = null;
        networkDocumentLoader$fetchPortion$1.L$5 = null;
        networkDocumentLoader$fetchPortion$1.L$6 = null;
        networkDocumentLoader$fetchPortion$1.label = 2;
        Object k02 = tje.k0(dVar.c, new DocumentService$fetchPortion$2(dVar, u1mVar2, (Map) obj2, kq90Var2, wbe0Var2, q370Var2, null), networkDocumentLoader$fetchPortion$1);
        if (k02 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.m0m
    public final Object e(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        return f(u1mVar, ywlVar, z, z2, false, i7x0Var, false, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        NetworkDocumentLoader$fetchDocumentInternal$1 networkDocumentLoader$fetchDocumentInternal$1;
        int i;
        boolean z5;
        Object obj;
        u1m u1mVar2;
        boolean z6;
        ywl ywlVar2;
        wzl wzlVar;
        boolean z7;
        CoroutineSingletons coroutineSingletons;
        d dVar;
        boolean z8;
        i7x0 i7x0Var2;
        ywl ywlVar3;
        boolean z9;
        u1m u1mVar3;
        Object k0;
        boolean z10 = z2;
        boolean z11 = z3;
        i7x0 i7x0Var3 = i7x0Var;
        if (continuationImpl instanceof NetworkDocumentLoader$fetchDocumentInternal$1) {
            networkDocumentLoader$fetchDocumentInternal$1 = (NetworkDocumentLoader$fetchDocumentInternal$1) continuationImpl;
            int i2 = networkDocumentLoader$fetchDocumentInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkDocumentLoader$fetchDocumentInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = networkDocumentLoader$fetchDocumentInternal$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkDocumentLoader$fetchDocumentInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g gVar = g.a;
                    networkDocumentLoader$fetchDocumentInternal$1.L$0 = u1mVar;
                    networkDocumentLoader$fetchDocumentInternal$1.L$1 = ywlVar;
                    networkDocumentLoader$fetchDocumentInternal$1.L$2 = i7x0Var3;
                    z5 = z;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$0 = z5;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$1 = z10;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$2 = z11;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$3 = z4;
                    networkDocumentLoader$fetchDocumentInternal$1.label = 1;
                    ConcurrentHashMap concurrentHashMap = g.b;
                    hoe0 hoe0Var = (hoe0) concurrentHashMap.get(u1mVar);
                    if (!z10 && hoe0Var != null) {
                        if (hoe0Var.b.compareAndSet(false, true)) {
                            obj = hoe0Var.a.a(z11, i7x0Var3, networkDocumentLoader$fetchDocumentInternal$1);
                            if (obj != coroutineSingletons2) {
                                obj = (wzl) obj;
                            }
                            if (obj != coroutineSingletons2) {
                                u1mVar2 = u1mVar;
                                z6 = z4;
                                ywlVar2 = ywlVar;
                                obj2 = obj;
                            }
                            return coroutineSingletons2;
                        }
                        concurrentHashMap.remove(u1mVar, hoe0Var);
                    }
                    obj = null;
                    if (obj != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    z7 = networkDocumentLoader$fetchDocumentInternal$1.Z$3;
                    boolean z12 = networkDocumentLoader$fetchDocumentInternal$1.Z$2;
                    z10 = networkDocumentLoader$fetchDocumentInternal$1.Z$1;
                    boolean z13 = networkDocumentLoader$fetchDocumentInternal$1.Z$0;
                    ywl ywlVar4 = (ywl) networkDocumentLoader$fetchDocumentInternal$1.L$5;
                    u1mVar3 = (u1m) networkDocumentLoader$fetchDocumentInternal$1.L$4;
                    d dVar2 = (d) networkDocumentLoader$fetchDocumentInternal$1.L$3;
                    i7x0Var2 = (i7x0) networkDocumentLoader$fetchDocumentInternal$1.L$2;
                    kotlin.b.b(obj2);
                    z8 = z12;
                    z9 = z13;
                    coroutineSingletons = coroutineSingletons2;
                    dVar = dVar2;
                    ywlVar3 = ywlVar4;
                    Map map = (Map) obj2;
                    networkDocumentLoader$fetchDocumentInternal$1.L$0 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$1 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$2 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$3 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$4 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$5 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$0 = z9;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$1 = z10;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$2 = z8;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$3 = z7;
                    networkDocumentLoader$fetchDocumentInternal$1.label = 3;
                    if (z7) {
                        k0 = tje.k0(dVar.c, new DocumentService$fetchDocument$3(dVar, u1mVar3, ywlVar3, map, i7x0Var2, z9, z10, false, z8, false, null), networkDocumentLoader$fetchDocumentInternal$1);
                    } else {
                        k0 = dVar.f(u1mVar3, ywlVar3, map, i7x0Var2, z9, z10, false, z8, false, networkDocumentLoader$fetchDocumentInternal$1);
                    }
                    return k0 != coroutineSingletons ? coroutineSingletons : k0;
                }
                z6 = networkDocumentLoader$fetchDocumentInternal$1.Z$3;
                boolean z14 = networkDocumentLoader$fetchDocumentInternal$1.Z$2;
                boolean z15 = networkDocumentLoader$fetchDocumentInternal$1.Z$1;
                boolean z16 = networkDocumentLoader$fetchDocumentInternal$1.Z$0;
                i7x0 i7x0Var4 = (i7x0) networkDocumentLoader$fetchDocumentInternal$1.L$2;
                ywlVar2 = (ywl) networkDocumentLoader$fetchDocumentInternal$1.L$1;
                u1mVar2 = (u1m) networkDocumentLoader$fetchDocumentInternal$1.L$0;
                kotlin.b.b(obj2);
                z11 = z14;
                z10 = z15;
                z5 = z16;
                i7x0Var3 = i7x0Var4;
                wzlVar = (wzl) obj2;
                if (wzlVar == null) {
                    return wzlVar;
                }
                d dVar3 = this.a;
                s8o.S(this, dVar3);
                d2m d2mVar = new d2m(u1mVar2, z10, false);
                networkDocumentLoader$fetchDocumentInternal$1.L$0 = null;
                networkDocumentLoader$fetchDocumentInternal$1.L$1 = null;
                networkDocumentLoader$fetchDocumentInternal$1.L$2 = i7x0Var3;
                networkDocumentLoader$fetchDocumentInternal$1.L$3 = dVar3;
                networkDocumentLoader$fetchDocumentInternal$1.L$4 = u1mVar2;
                networkDocumentLoader$fetchDocumentInternal$1.L$5 = ywlVar2;
                networkDocumentLoader$fetchDocumentInternal$1.Z$0 = z5;
                networkDocumentLoader$fetchDocumentInternal$1.Z$1 = z10;
                networkDocumentLoader$fetchDocumentInternal$1.Z$2 = z11;
                networkDocumentLoader$fetchDocumentInternal$1.Z$3 = z6;
                networkDocumentLoader$fetchDocumentInternal$1.label = 2;
                Object a = f.a(this.b, ywlVar2, d2mVar, networkDocumentLoader$fetchDocumentInternal$1);
                if (a != coroutineSingletons2) {
                    obj2 = a;
                    z7 = z6;
                    coroutineSingletons = coroutineSingletons2;
                    dVar = dVar3;
                    z8 = z11;
                    i7x0Var2 = i7x0Var3;
                    ywlVar3 = ywlVar2;
                    z9 = z5;
                    u1mVar3 = u1mVar2;
                    Map map2 = (Map) obj2;
                    networkDocumentLoader$fetchDocumentInternal$1.L$0 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$1 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$2 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$3 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$4 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.L$5 = null;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$0 = z9;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$1 = z10;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$2 = z8;
                    networkDocumentLoader$fetchDocumentInternal$1.Z$3 = z7;
                    networkDocumentLoader$fetchDocumentInternal$1.label = 3;
                    if (z7) {
                    }
                    if (k0 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons2;
            }
        }
        networkDocumentLoader$fetchDocumentInternal$1 = new NetworkDocumentLoader$fetchDocumentInternal$1(this, continuationImpl);
        Object obj22 = networkDocumentLoader$fetchDocumentInternal$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkDocumentLoader$fetchDocumentInternal$1.label;
        if (i != 0) {
        }
        wzlVar = (wzl) obj22;
        if (wzlVar == null) {
        }
    }
}

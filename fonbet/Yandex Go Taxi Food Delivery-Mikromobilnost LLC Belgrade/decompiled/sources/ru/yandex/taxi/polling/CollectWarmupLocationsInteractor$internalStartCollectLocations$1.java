package ru.yandex.taxi.polling;

import defpackage.c9z;
import defpackage.jl40;
import defpackage.kbn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.CollectWarmupLocationsInteractor$internalStartCollectLocations$1", f = "CollectWarmupLocationsInteractor.kt", l = {44, 45, 47, 50, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CollectWarmupLocationsInteractor$internalStartCollectLocations$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectWarmupLocationsInteractor$internalStartCollectLocations$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectWarmupLocationsInteractor$internalStartCollectLocations$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectWarmupLocationsInteractor$internalStartCollectLocations$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r14 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        if (r14 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0063, code lost:
    
        if (r14 == r0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kbn kbnVar;
        kbn kbnVar2;
        c9z c9zVar;
        Long l;
        Object obj2;
        kbn kbnVar3;
        Object O;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.d.getClass();
            c cVar = this.this$0.a;
            this.label = 1;
            obj = cVar.d(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kbnVar = (kbn) this.L$0;
                    kotlin.b.b(obj);
                    c9z c9zVar2 = (c9z) obj;
                    this.this$0.d.getClass();
                    po21 po21Var = this.this$0.c;
                    this.L$0 = kbnVar;
                    this.L$1 = c9zVar2;
                    this.label = 3;
                    if (((ru.yandex.taxi.preorder.source.userposition.e) po21Var).d(this) != coroutineSingletons) {
                        kbnVar2 = kbnVar;
                        c9zVar = c9zVar2;
                        this.this$0.e.f.set(true);
                        e eVar = this.this$0.b;
                        if (c9zVar == null) {
                        }
                        this.L$0 = kbnVar2;
                        this.L$1 = c9zVar;
                        this.label = 4;
                        eVar.getClass();
                        if (l != null) {
                        }
                        obj2 = zy11Var;
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    c9zVar = (c9z) this.L$1;
                    kbnVar3 = (kbn) this.L$0;
                    kotlin.b.b(obj);
                    this.this$0.d.getClass();
                    e eVar2 = this.this$0.b;
                    Long l2 = c9zVar == null ? new Long(c9zVar.a()) : null;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    eVar2.getClass();
                    O = jl40.O(new LocationsFlowRepository$startCollect$2(eVar2, kbnVar3, l2, null), this);
                    if (O != coroutineSingletons) {
                        O = zy11Var;
                    }
                    return O != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                c9zVar = (c9z) this.L$1;
                kbnVar2 = (kbn) this.L$0;
                kotlin.b.b(obj);
                this.this$0.e.f.set(true);
                e eVar3 = this.this$0.b;
                l = c9zVar == null ? new Long(c9zVar.a()) : null;
                this.L$0 = kbnVar2;
                this.L$1 = c9zVar;
                this.label = 4;
                eVar3.getClass();
                if (l != null) {
                    if ((l.longValue() > 0 ? l : null) != null) {
                        obj2 = eVar3.g(l.longValue(), this);
                    }
                }
                obj2 = zy11Var;
                if (obj2 != coroutineSingletons) {
                    kbnVar3 = kbnVar2;
                    this.this$0.d.getClass();
                    e eVar22 = this.this$0.b;
                    if (c9zVar == null) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    eVar22.getClass();
                    O = jl40.O(new LocationsFlowRepository$startCollect$2(eVar22, kbnVar3, l2, null), this);
                    if (O != coroutineSingletons) {
                    }
                    if (O != coroutineSingletons) {
                    }
                }
            }
            kotlin.b.b(obj);
        }
        kbnVar = (kbn) obj;
        c cVar2 = this.this$0.a;
        this.L$0 = kbnVar;
        this.label = 2;
        obj = cVar2.h(this);
    }
}

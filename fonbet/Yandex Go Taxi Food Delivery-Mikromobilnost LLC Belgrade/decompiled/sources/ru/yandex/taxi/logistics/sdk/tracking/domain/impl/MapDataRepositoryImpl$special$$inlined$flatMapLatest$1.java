package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.g92;
import defpackage.gri;
import defpackage.hh00;
import defpackage.l7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tpr;
import defpackage.u701;
import defpackage.v701;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w701;
import defpackage.x701;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.MapDataRepositoryImpl$special$$inlined$flatMapLatest$1", f = "MapDataRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MapDataRepositoryImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ hh00 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapDataRepositoryImpl$special$$inlined$flatMapLatest$1(Continuation continuation, hh00 hh00Var) {
        super(3, continuation);
        this.receiver$inlined = hh00Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapDataRepositoryImpl$special$$inlined$flatMapLatest$1 mapDataRepositoryImpl$special$$inlined$flatMapLatest$1 = new MapDataRepositoryImpl$special$$inlined$flatMapLatest$1((Continuation) obj3, this.receiver$inlined);
        mapDataRepositoryImpl$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mapDataRepositoryImpl$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return mapDataRepositoryImpl$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            x701 x701Var = (x701) this.L$1;
            hh00 hh00Var = this.receiver$inlined;
            hh00Var.getClass();
            if (x701Var instanceof t701) {
                t701 t701Var = (t701) x701Var;
                gri griVar = t701Var.a;
                g92Var = new l7(15, griVar.b.b ? hh00Var.b.b(griVar.a) : new g92(2, null), hh00Var, t701Var);
            } else {
                if (!(x701Var instanceof u701) && !(x701Var instanceof v701) && !(x701Var instanceof w701)) {
                    w511.b();
                    return null;
                }
                g92Var = new g92(2, null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}

package ru.yandex.taxi.layers.domain;

import defpackage.byx;
import defpackage.bzw0;
import defpackage.cq60;
import defpackage.fxe0;
import defpackage.hzk;
import defpackage.jl40;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oaq0;
import defpackage.rp60;
import defpackage.s5u;
import defpackage.t7s0;
import defpackage.txx;
import defpackage.uxx;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1", f = "MapObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    final /* synthetic */ cq60 $response$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1(cq60 cq60Var, Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$response$inlined = cq60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1 mapObjectsInteractor$onResponse$$inlined$flatMapMerge$1 = new MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1(this.$response$inlined, continuation, this.this$0);
        mapObjectsInteractor$onResponse$$inlined$flatMapMerge$1.L$0 = obj;
        return mapObjectsInteractor$onResponse$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Map map = (Map) obj2;
        txx txxVar = (txx) kotlin.collections.a.b0(this.this$0.p.a);
        if (!(txxVar instanceof ru.yandex.taxi.logistics.ndd_map.layers.a)) {
            txxVar = null;
        }
        ru.yandex.taxi.logistics.ndd_map.layers.a aVar = (ru.yandex.taxi.logistics.ndd_map.layers.a) txxVar;
        if (aVar != null) {
            aVar.c(map, this.$response$inlined.a);
        }
        hzk hzkVar = this.this$0.n;
        String str = this.$response$inlined.h;
        hzkVar.getClass();
        txx txxVar2 = (txx) kotlin.collections.a.b0(((uxx) hzkVar.b).a);
        if (!(txxVar2 instanceof s5u)) {
            txxVar2 = null;
        }
        s5u s5uVar = (s5u) txxVar2;
        if (s5uVar != null) {
            str = s5uVar.a(str);
        } else if (jl40.l(((rp60) hzkVar.a).a(), str)) {
            str = null;
        }
        if (str == null) {
            Boolean bool = this.$response$inlined.i;
            bzw0 bzw0Var = new bzw0(bool != null && (bool.booleanValue() ^ true));
            byx byxVar = this.$response$inlined.n;
            return new kotlinx.coroutines.flow.h(new fxe0[]{bzw0Var, new t7s0(map)});
        }
        lm00 lm00Var = (lm00) map.get(str);
        if (lm00Var != null) {
            txx txxVar3 = (txx) kotlin.collections.a.b0(this.this$0.p.a);
            ru.yandex.taxi.logistics.ndd_map.layers.a aVar2 = (ru.yandex.taxi.logistics.ndd_map.layers.a) (txxVar3 instanceof ru.yandex.taxi.logistics.ndd_map.layers.a ? txxVar3 : null);
            if (aVar2 != null) {
                aVar2.d(lm00Var);
            }
        }
        Boolean bool2 = this.$response$inlined.i;
        bzw0 bzw0Var2 = new bzw0(bool2 != null && (bool2.booleanValue() ^ true));
        byx byxVar2 = this.$response$inlined.n;
        return new kotlinx.coroutines.flow.h(new fxe0[]{bzw0Var2, new t7s0(map), new oaq0(lm00Var)});
    }
}

package ru.yandex.taxi.surge.mapper;

import defpackage.bvf0;
import defpackage.duw0;
import defpackage.guw0;
import defpackage.jl40;
import defpackage.juw0;
import defpackage.kuw0;
import defpackage.luw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pky0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.h1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpky0;", "<anonymous>", "(Ltse;)Lpky0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapTextBlockItem$2$trail$1", f = "SurgeInfoStateMapper.kt", l = {282}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapTextBlockItem$2$trail$1 extends SuspendLambda implements wls {
    final /* synthetic */ h1 $item;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapTextBlockItem$2$trail$1(a aVar, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = h1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapTextBlockItem$2$trail$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapTextBlockItem$2$trail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        luw0 luw0Var = this.$item.a.e;
        this.label = 1;
        if (luw0Var instanceof juw0) {
            obj2 = aVar.l((juw0) luw0Var, this);
            if (obj2 != coroutineSingletons) {
                obj2 = (pky0) obj2;
            }
        } else if (luw0Var instanceof duw0) {
            obj2 = aVar.k((duw0) luw0Var, this);
        } else {
            aVar.getClass();
            if (luw0Var instanceof guw0) {
                obj2 = bvf0.n(new SurgeInfoStateMapper$mapIconTrail$2((guw0) luw0Var, aVar, null), this);
                if (obj2 != coroutineSingletons) {
                    obj2 = (pky0) obj2;
                }
            } else if (!jl40.l(luw0Var, kuw0.INSTANCE)) {
                w511.b();
                return null;
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}

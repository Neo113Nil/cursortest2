package ru.yandex.taxi.map.utils;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luc4;", "<anonymous>", "(Ltse;)Luc4;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.utils.MapUtils$visibleBBox$2", f = "MapUtils.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapUtils$visibleBBox$2 extends SuspendLambda implements wls {
    final /* synthetic */ ah00 $this_visibleBBox;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUtils$visibleBBox$2(ah00 ah00Var, Continuation continuation) {
        super(2, continuation);
        this.$this_visibleBBox = ah00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapUtils$visibleBBox$2(this.$this_visibleBBox, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapUtils$visibleBBox$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return a.D(((gh00) this.$this_visibleBBox).e.f());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

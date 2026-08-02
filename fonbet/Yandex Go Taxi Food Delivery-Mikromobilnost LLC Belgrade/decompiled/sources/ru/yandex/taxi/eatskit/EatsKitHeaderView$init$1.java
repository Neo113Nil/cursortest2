package ru.yandex.taxi.eatskit;

import defpackage.h1p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.eatskit.EatsKitHeaderView$init$1", f = "EatsKitHeaderView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class EatsKitHeaderView$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ h1p $service;
    int label;
    final /* synthetic */ EatsKitHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitHeaderView$init$1(EatsKitHeaderView eatsKitHeaderView, h1p h1pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eatsKitHeaderView;
        this.$service = h1pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitHeaderView$init$1(this.this$0, this.$service, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        EatsKitHeaderView$init$1 eatsKitHeaderView$init$1 = (EatsKitHeaderView$init$1) create((ThemeType) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        eatsKitHeaderView$init$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.applyTheme(this.$service.getLogoColorId());
        return zy11.a;
    }
}

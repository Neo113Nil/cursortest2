package ru.yandex.taxi.summary.solid.interactor;

import defpackage.ilv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "Lxlv0;", "<anonymous>", "(Ljava/lang/Object;Lru/yandex/taxi/theme/ThemeType;)Lxlv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.SummaryPromotionModalWindowsInteractor$uiStateFlow$2", f = "SummaryPromotionModalWindowsInteractor.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ ilv0 $modalWindow;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsInteractor$uiStateFlow$2(u uVar, ilv0 ilv0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = uVar;
        this.$modalWindow = ilv0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new SummaryPromotionModalWindowsInteractor$uiStateFlow$2(this.this$0, this.$modalWindow, (Continuation) obj3).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u uVar = this.this$0;
        ilv0 ilv0Var = this.$modalWindow;
        this.label = 1;
        Object a = u.a(uVar, ilv0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}

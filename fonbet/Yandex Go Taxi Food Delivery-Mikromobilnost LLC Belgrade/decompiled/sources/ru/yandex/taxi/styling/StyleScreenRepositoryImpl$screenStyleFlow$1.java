package ru.yandex.taxi.styling;

import defpackage.e430;
import defpackage.mvg;
import defpackage.nrt;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le430;", "modeStyle", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lcxu0;", "<anonymous>", "(Le430;Lru/yandex/taxi/theme/ThemeType;)Lcxu0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.styling.StyleScreenRepositoryImpl$screenStyleFlow$1", f = "StyleScreenRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StyleScreenRepositoryImpl$screenStyleFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleScreenRepositoryImpl$screenStyleFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StyleScreenRepositoryImpl$screenStyleFlow$1 styleScreenRepositoryImpl$screenStyleFlow$1 = new StyleScreenRepositoryImpl$screenStyleFlow$1(this.this$0, (Continuation) obj3);
        styleScreenRepositoryImpl$screenStyleFlow$1.L$0 = (e430) obj;
        styleScreenRepositoryImpl$screenStyleFlow$1.L$1 = (ThemeType) obj2;
        return styleScreenRepositoryImpl$screenStyleFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e430 e430Var = (e430) this.L$0;
        ThemeType themeType = (ThemeType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return ((nrt) this.this$0.d).b(themeType, e430Var.c);
    }
}

package ru.yandex.taxi.widgets.domain;

import defpackage.j551;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lx251;", "widgetDtos", "Lw201;", "orders", "Lzy11;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.domain.WidgetsInteractorImpl$requestWidgets$1", f = "WidgetsInteractorImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsInteractorImpl$requestWidgets$1 extends SuspendLambda implements zls {
    final /* synthetic */ yaf0 $screenType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ j551 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsInteractorImpl$requestWidgets$1(j551 j551Var, yaf0 yaf0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = j551Var;
        this.$screenType = yaf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WidgetsInteractorImpl$requestWidgets$1 widgetsInteractorImpl$requestWidgets$1 = new WidgetsInteractorImpl$requestWidgets$1(this.this$0, this.$screenType, (Continuation) obj3);
        widgetsInteractorImpl$requestWidgets$1.L$0 = (List) obj;
        widgetsInteractorImpl$requestWidgets$1.L$1 = (List) obj2;
        return widgetsInteractorImpl$requestWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widgets.data.repository.widget_models.c cVar = this.this$0.d;
            yaf0 yaf0Var = this.$screenType;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (cVar.a(yaf0Var, list, list2, this) == coroutineSingletons) {
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

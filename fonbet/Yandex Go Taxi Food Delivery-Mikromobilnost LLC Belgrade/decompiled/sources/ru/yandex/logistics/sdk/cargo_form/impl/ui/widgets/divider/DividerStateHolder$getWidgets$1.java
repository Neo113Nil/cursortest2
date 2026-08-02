package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider;

import defpackage.frl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lfrl;", "coreWidget", "", "Ln351;", "<anonymous>", "(ZLfrl;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.DividerStateHolder$getWidgets$1", f = "DividerStateHolder.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DividerStateHolder$getWidgets$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        DividerStateHolder$getWidgets$1 dividerStateHolder$getWidgets$1 = new DividerStateHolder$getWidgets$1(this.this$0, (Continuation) obj3);
        dividerStateHolder$getWidgets$1.L$0 = (frl) obj2;
        return dividerStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        frl frlVar = (frl) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (frlVar == null || this.this$0.d.C(frlVar)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.b;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(frlVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Collections.singletonList(obj);
    }
}

package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.roj;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<unused var>", "Lroj;", "coreWidget", "Lj6s;", "", "Ln351;", "<anonymous>", "(ZLroj;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount.DiscountStateHolder$getWidgets$1", f = "DiscountStateHolder.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DiscountStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        DiscountStateHolder$getWidgets$1 discountStateHolder$getWidgets$1 = new DiscountStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        discountStateHolder$getWidgets$1.L$0 = (roj) obj2;
        return discountStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        roj rojVar = (roj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (rojVar == null || this.this$0.e.C(rojVar)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.c;
            this.L$0 = null;
            this.label = 1;
            obj = bVar.a(rojVar, this);
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

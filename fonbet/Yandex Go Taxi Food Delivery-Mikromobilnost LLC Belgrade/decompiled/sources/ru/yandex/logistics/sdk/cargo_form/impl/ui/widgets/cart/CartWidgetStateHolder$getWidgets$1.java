package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart;

import defpackage.bms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v09;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Lv09;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(ZLv09;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart.CartWidgetStateHolder$getWidgets$1", f = "CartWidgetStateHolder.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CartWidgetStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartWidgetStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        CartWidgetStateHolder$getWidgets$1 cartWidgetStateHolder$getWidgets$1 = new CartWidgetStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        cartWidgetStateHolder$getWidgets$1.L$0 = (v09) obj2;
        cartWidgetStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return cartWidgetStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v09 v09Var = (v09) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (v09Var == null || this.this$0.e.C(v09Var)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = aVar.a(v09Var, j6sVar, this);
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

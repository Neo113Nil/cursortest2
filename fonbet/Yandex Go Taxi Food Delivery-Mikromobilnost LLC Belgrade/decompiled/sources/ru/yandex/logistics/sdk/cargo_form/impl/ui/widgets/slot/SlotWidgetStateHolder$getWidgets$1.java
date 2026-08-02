package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot;

import defpackage.bms;
import defpackage.eus0;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Leus0;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(ZLeus0;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.SlotWidgetStateHolder$getWidgets$1", f = "SlotWidgetStateHolder.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SlotWidgetStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotWidgetStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        SlotWidgetStateHolder$getWidgets$1 slotWidgetStateHolder$getWidgets$1 = new SlotWidgetStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        slotWidgetStateHolder$getWidgets$1.L$0 = (eus0) obj2;
        slotWidgetStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return slotWidgetStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eus0 eus0Var = (eus0) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (eus0Var == null || this.this$0.e.C(eus0Var)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar.a(eus0Var, j6sVar, this);
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

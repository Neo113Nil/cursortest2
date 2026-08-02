package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address;

import defpackage.bms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yk40;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lyk40;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "<unused var>", "", "Ln351;", "<anonymous>", "(Lyk40;Lj6s;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.MultiAddressStateHolder$getWidgets$1", f = "MultiAddressStateHolder.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MultiAddressStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAddressStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        MultiAddressStateHolder$getWidgets$1 multiAddressStateHolder$getWidgets$1 = new MultiAddressStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        multiAddressStateHolder$getWidgets$1.L$0 = (yk40) obj;
        multiAddressStateHolder$getWidgets$1.L$1 = (j6s) obj2;
        return multiAddressStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yk40 yk40Var = (yk40) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (yk40Var == null || this.this$0.e.C(yk40Var)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar.a(yk40Var, j6sVar, this);
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

package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field;

import defpackage.dms;
import defpackage.iw0;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "<unused var>", "Liw0;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "", "bubbles", "", "Ln351;", "<anonymous>", "(ZLiw0;Lj6s;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.AddressInputFieldStateHolder$getWidgets$1", f = "AddressInputFieldStateHolder.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressInputFieldStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInputFieldStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        AddressInputFieldStateHolder$getWidgets$1 addressInputFieldStateHolder$getWidgets$1 = new AddressInputFieldStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        addressInputFieldStateHolder$getWidgets$1.L$0 = (iw0) obj2;
        addressInputFieldStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        addressInputFieldStateHolder$getWidgets$1.L$2 = (Set) obj4;
        return addressInputFieldStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iw0 iw0Var = (iw0) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        Set set = (Set) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (iw0Var == null || this.this$0.e.C(iw0Var)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = aVar.a(iw0Var, j6sVar, set, this);
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

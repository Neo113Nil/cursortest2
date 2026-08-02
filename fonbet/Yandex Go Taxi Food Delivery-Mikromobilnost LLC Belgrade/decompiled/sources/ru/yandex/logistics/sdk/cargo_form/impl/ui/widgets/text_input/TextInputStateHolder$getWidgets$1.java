package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import defpackage.j6s;
import defpackage.kpy0;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkpy0;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(Lkpy0;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.TextInputStateHolder$getWidgets$1", f = "TextInputStateHolder.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TextInputStateHolder$getWidgets$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextInputStateHolder$getWidgets$1 textInputStateHolder$getWidgets$1 = new TextInputStateHolder$getWidgets$1(this.this$0, (Continuation) obj3);
        textInputStateHolder$getWidgets$1.L$0 = (kpy0) obj;
        textInputStateHolder$getWidgets$1.L$1 = (j6s) obj2;
        return textInputStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kpy0 kpy0Var = (kpy0) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (kpy0Var == null || this.this$0.d.C(kpy0Var)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.c;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar.a(j6sVar, kpy0Var, this);
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

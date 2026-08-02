package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tag_line;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.y6x0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Ly6x0;", "coreWidget", "", "Ln351;", "<anonymous>", "(ZLy6x0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tag_line.TagLineStateHolder$getWidgets$1", f = "TagLineStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TagLineStateHolder$getWidgets$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagLineStateHolder$getWidgets$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        TagLineStateHolder$getWidgets$1 tagLineStateHolder$getWidgets$1 = new TagLineStateHolder$getWidgets$1(this.this$0, (Continuation) obj3);
        tagLineStateHolder$getWidgets$1.L$0 = (y6x0) obj2;
        return tagLineStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6x0 y6x0Var = (y6x0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return (y6x0Var == null || this.this$0.d.C(y6x0Var)) ? EmptyList.a : Collections.singletonList(this.this$0.b.a(y6x0Var));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

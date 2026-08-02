package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget;

import defpackage.bms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.u0s0;
import defpackage.y0s0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Lj6s;", ClidProvider.STATE, "Ly0s0;", "coreWidget", "", "Ln351;", "<anonymous>", "(ZLj6s;Ly0s0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.ShortcutStateHolder$getWidgets$1", f = "ShortcutStateHolder.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShortcutStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        ShortcutStateHolder$getWidgets$1 shortcutStateHolder$getWidgets$1 = new ShortcutStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        shortcutStateHolder$getWidgets$1.L$0 = (j6s) obj2;
        shortcutStateHolder$getWidgets$1.L$1 = (y0s0) obj3;
        return shortcutStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j6s j6sVar = (j6s) this.L$0;
        y0s0 y0s0Var = (y0s0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (y0s0Var == null || this.this$0.e.C(y0s0Var)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = aVar.a(y0s0Var, j6sVar, this);
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
        return scc.h((u0s0) obj);
    }
}

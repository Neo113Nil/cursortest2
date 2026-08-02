package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.ay40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9m;
import defpackage.s9m;
import defpackage.tse;
import defpackage.wls;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.UtilKt$draggable$3$2$1$3$1$1", f = "Util.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UtilKt$draggable$3$2$1$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zx40 $interactionSource;
    final /* synthetic */ s9m $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilKt$draggable$3$2$1$3$1$1(zx40 zx40Var, s9m s9mVar, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = zx40Var;
        this.$it = s9mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UtilKt$draggable$3$2$1$3$1$1(this.$interactionSource, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UtilKt$draggable$3$2$1$3$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zx40 zx40Var = this.$interactionSource;
            if (zx40Var != null) {
                r9m r9mVar = new r9m(this.$it);
                this.label = 1;
                if (((ay40) zx40Var).a(r9mVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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

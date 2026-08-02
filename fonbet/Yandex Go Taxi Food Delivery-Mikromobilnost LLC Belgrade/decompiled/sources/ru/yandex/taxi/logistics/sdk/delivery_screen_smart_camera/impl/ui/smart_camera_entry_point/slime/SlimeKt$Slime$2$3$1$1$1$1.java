package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.SlimeKt$Slime$2$3$1$1$1$1", f = "Slime.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SlimeKt$Slime$2$3$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zvd0 $change;
    final /* synthetic */ oz40 $dragAmount$delegate;
    final /* synthetic */ c $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlimeKt$Slime$2$3$1$1$1$1(c cVar, zvd0 zvd0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$state = cVar;
        this.$change = zvd0Var;
        this.$dragAmount$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlimeKt$Slime$2$3$1$1$1$1(this.$state, this.$change, this.$dragAmount$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlimeKt$Slime$2$3$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.$state;
            long j = this.$change.c;
            long j2 = ((wu60) this.$dragAmount$delegate.getValue()).a;
            this.label = 1;
            if (cVar.b(j, j2, this) == coroutineSingletons) {
                return coroutineSingletons;
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

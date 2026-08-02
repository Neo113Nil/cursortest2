package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.SlimeKt$Slime$1$1", f = "Slime.kt", l = {100, 101}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SlimeKt$Slime$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Long $dismissAfterMs;
    final /* synthetic */ boolean $isFullyExpanded;
    final /* synthetic */ c $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlimeKt$Slime$1$1(boolean z, Long l, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$isFullyExpanded = z;
        this.$dismissAfterMs = l;
        this.$state = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlimeKt$Slime$1$1(this.$isFullyExpanded, this.$dismissAfterMs, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlimeKt$Slime$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isFullyExpanded && (l = this.$dismissAfterMs) != null) {
                long longValue = l.longValue();
                this.label = 1;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.$state;
        this.label = 2;
        Object f = cVar.b.f(new Float(0.0f), this);
        if (f != coroutineSingletons) {
            f = zy11Var;
        }
        return f == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}

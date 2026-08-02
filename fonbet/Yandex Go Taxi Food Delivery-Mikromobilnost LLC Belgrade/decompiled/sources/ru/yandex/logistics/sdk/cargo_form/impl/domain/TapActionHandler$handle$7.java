package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import defpackage.kt7;
import defpackage.m8x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9x0;
import defpackage.t9x0;
import defpackage.tse;
import defpackage.txs0;
import defpackage.uxs0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$handle$7", f = "TapActionHandler.kt", l = {192, 198}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TapActionHandler$handle$7 extends SuspendLambda implements wls {
    final /* synthetic */ r9x0 $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapActionHandler$handle$7(r9x0 r9x0Var, Continuation continuation, c cVar) {
        super(2, continuation);
        this.$action = r9x0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapActionHandler$handle$7(this.$action, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapActionHandler$handle$7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i2 = t9x0.a[((m8x0) this.$action).a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c cVar = (ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) this.this$0.s.get();
            this.label = 2;
            kt7 kt7Var = cVar.f;
            if (kt7Var != null) {
                kt7Var.c(txs0.a);
            }
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c cVar2 = (ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) this.this$0.s.get();
        this.label = 1;
        kt7 kt7Var2 = cVar2.f;
        if (kt7Var2 != null) {
            kt7Var2.c(uxs0.a);
        }
        if (zy11Var == coroutineSingletons) {
        }
    }
}

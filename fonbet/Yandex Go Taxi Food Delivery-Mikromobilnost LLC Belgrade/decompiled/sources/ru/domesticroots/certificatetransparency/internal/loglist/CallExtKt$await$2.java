package ru.domesticroots.certificatetransparency.internal.loglist;

import defpackage.bp5;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.yf7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {1, 9, 0})
@mvg(c = "ru.domesticroots.certificatetransparency.internal.loglist.CallExtKt$await$2", f = "CallExt.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CallExtKt$await$2 extends SuspendLambda implements wls {
    final /* synthetic */ yf7 $this_await;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallExtKt$await$2(yf7 yf7Var, Continuation continuation) {
        super(2, continuation);
        this.$this_await = yf7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallExtKt$await$2(this.$this_await, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallExtKt$await$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        final yf7 yf7Var = this.$this_await;
        this.L$0 = yf7Var;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        yf7Var.I(new bp5(j18Var));
        j18Var.w(new tls() { // from class: ru.domesticroots.certificatetransparency.internal.loglist.CallExtKt$await$2$1$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                try {
                    yf7.this.cancel();
                } catch (Throwable unused) {
                }
                return zy11.a;
            }
        });
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}

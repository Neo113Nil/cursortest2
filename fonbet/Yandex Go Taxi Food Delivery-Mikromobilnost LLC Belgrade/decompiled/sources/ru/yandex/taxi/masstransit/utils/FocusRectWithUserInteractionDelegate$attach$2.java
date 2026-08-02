package ru.yandex.taxi.masstransit.utils;

import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.utils.FocusRectWithUserInteractionDelegate$attach$2", f = "FocusRectWithUserInteractionDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FocusRectWithUserInteractionDelegate$attach$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onFocusRectUpdate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.utils.FocusRectWithUserInteractionDelegate$attach$2$1", f = "FocusRectWithUserInteractionDelegate.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.utils.FocusRectWithUserInteractionDelegate$attach$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ sls $onFocusRectUpdate;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$onFocusRectUpdate = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$onFocusRectUpdate, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                tpr M2 = this.this$0.b.M2();
                xur xurVar = new xur(0, this.this$0, this.$onFocusRectUpdate);
                this.label = 1;
                if (M2.collect(xurVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRectWithUserInteractionDelegate$attach$2(a aVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$onFocusRectUpdate = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FocusRectWithUserInteractionDelegate$attach$2 focusRectWithUserInteractionDelegate$attach$2 = new FocusRectWithUserInteractionDelegate$attach$2(this.this$0, this.$onFocusRectUpdate, continuation);
        focusRectWithUserInteractionDelegate$attach$2.L$0 = obj;
        return focusRectWithUserInteractionDelegate$attach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FocusRectWithUserInteractionDelegate$attach$2 focusRectWithUserInteractionDelegate$attach$2 = (FocusRectWithUserInteractionDelegate$attach$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        focusRectWithUserInteractionDelegate$attach$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        ((gh00) aVar.a).e(aVar.d);
        this.this$0.b.b8(tseVar);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(this.this$0, this.$onFocusRectUpdate, null), 3);
        return zy11.a;
    }
}

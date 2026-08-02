package ru.yandex.taxi.logistics.postcard.presentation;

import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofe0;
import defpackage.pep0;
import defpackage.sfe0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.postcard.presentation.PostcardNavigator$launchPostcard$1", f = "PostcardNavigator.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PostcardNavigator$launchPostcard$1 extends SuspendLambda implements wls {
    final /* synthetic */ ofe0 $params;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardNavigator$launchPostcard$1(g gVar, ofe0 ofe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$params = ofe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostcardNavigator$launchPostcard$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PostcardNavigator$launchPostcard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        int intValue;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.e;
            do {
                value = r0Var.getValue();
                intValue = ((Number) value).intValue();
                if (intValue > 0) {
                    break;
                }
            } while (!r0Var.k(value, new Integer(intValue + 1)));
            g gVar = this.this$0;
            ((pep0) gVar.b).f((sfe0) gVar.d.getValue(), this.$params, hxx.a);
            sfe0 sfe0Var = (sfe0) this.this$0.d.getValue();
            this.label = 1;
            if (com.yandex.go.navigation.base.a.d(sfe0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var2 = this.this$0.e;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, new Integer(((Number) value2).intValue() - 1)));
        return zy11.a;
    }
}

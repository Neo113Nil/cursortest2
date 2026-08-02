package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import defpackage.di9;
import defpackage.nb81;
import defpackage.ny61;
import defpackage.q971;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class t91 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ IntegrationInspectorActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(IntegrationInspectorActivity integrationInspectorActivity, Continuation continuation) {
        super(2, continuation);
        this.c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t91(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new t91(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q971 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            b = this.c.b();
            di9 di9Var = b.p;
            nb81 nb81Var = new nb81(this.c, 0);
            this.b = 1;
            if (di9Var.collect(nb81Var, this) == coroutineSingletons) {
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

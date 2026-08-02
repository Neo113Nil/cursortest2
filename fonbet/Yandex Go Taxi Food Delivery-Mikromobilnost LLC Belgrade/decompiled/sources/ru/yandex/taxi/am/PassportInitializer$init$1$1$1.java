package ru.yandex.taxi.am;

import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.am2;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jo90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportInitializer$init$1$1$1", f = "PassportInitializer.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class PassportInitializer$init$1$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $senderId;
    int label;
    final /* synthetic */ jo90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitializer$init$1$1$1(jo90 jo90Var, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jo90Var;
        this.$senderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassportInitializer$init$1$1$1(this.this$0, this.$senderId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PassportInitializer$init$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseMessaging firebaseMessaging;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yvi0 yvi0Var = this.this$0.g;
        String str = this.$senderId;
        this.label = 1;
        am2 am2Var = (am2) yvi0Var.a;
        if (jl40.l(str, "1087931301371")) {
            firebaseMessaging = (FirebaseMessaging) com.google.firebase.a.e((String) ((i3y) am2Var.b).getValue()).b(FirebaseMessaging.class);
        } else {
            if (!jl40.l(str, "410800666107")) {
                ny61.g(g8e.o("Unknown senderId=", str));
                return null;
            }
            firebaseMessaging = (FirebaseMessaging) com.google.firebase.a.e((String) ((i3y) am2Var.c).getValue()).b(FirebaseMessaging.class);
        }
        Object c = gtq0.c(firebaseMessaging.d(), this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}

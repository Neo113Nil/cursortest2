package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.d;
import defpackage.da20;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zvs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.AuthManager$requestAuth$1", f = "AuthManager.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AuthManager$requestAuth$1 extends SuspendLambda implements wls {
    final /* synthetic */ da20 $result;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManager$requestAuth$1(a aVar, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthManager$requestAuth$1(this.this$0, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$requestAuth$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.a;
            this.label = 1;
            dVar.getClass();
            kol0 kol0Var = new kol0(dvw.b(this));
            dVar.f.g(new qzj0(null, new zvs(kol0Var, 4)));
            Object a = kol0Var.a();
            if (a != coroutineSingletons) {
                a = zy11Var;
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$result.success(null);
        return zy11Var;
    }
}

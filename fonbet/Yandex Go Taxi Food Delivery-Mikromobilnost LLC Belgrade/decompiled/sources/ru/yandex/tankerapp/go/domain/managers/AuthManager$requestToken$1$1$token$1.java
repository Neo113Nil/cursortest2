package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.AuthManager$requestToken$1$1$token$1", f = "AuthManager.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AuthManager$requestToken$1$1$token$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $clientId;
    final /* synthetic */ String $clientSecret;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManager$requestToken$1$1$token$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$clientId = str;
        this.$clientSecret = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthManager$requestToken$1$1$token$1(this.this$0, this.$clientId, this.$clientSecret, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$requestToken$1$1$token$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        d dVar = this.this$0.a;
        this.label = 1;
        Object c = dVar.c(this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}

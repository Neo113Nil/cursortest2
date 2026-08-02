package ru.yandex.tankerapp.go.domain.managers;

import defpackage.da20;
import defpackage.icx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv00;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zko;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.tankerapp.go.domain.error.PluginError;
import ru.yandex.tankerapp.go.models.PassportSecretsModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.AuthManager$requestToken$1", f = "AuthManager.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AuthManager$requestToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $arguments;
    final /* synthetic */ da20 $result;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManager$requestToken$1(a aVar, Object obj, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$arguments = obj;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthManager$requestToken$1(this.this$0, this.$arguments, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$requestToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da20 da20Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
            Object a = pv00.a(this.$arguments);
            if (a instanceof Result.Failure) {
                a = null;
            }
            String str = (String) a;
            PassportSecretsModel passportSecretsModel = str != null ? (PassportSecretsModel) icx.a().c(PassportSecretsModel.class, str) : null;
            if (passportSecretsModel == null) {
                da20 da20Var2 = this.$result;
                PluginError.InvalidArguments invalidArguments = PluginError.InvalidArguments.a;
                da20Var2.error(invalidArguments.getErrorCode(), invalidArguments.getErrorMessage(), null);
                return zy11.a;
            }
            a aVar = this.this$0;
            da20 da20Var3 = this.$result;
            String clientId = passportSecretsModel.getClientId();
            String clientSecret = passportSecretsModel.getClientSecret();
            zko zkoVar = aVar.b.b;
            AuthManager$requestToken$1$1$token$1 authManager$requestToken$1$1$token$1 = new AuthManager$requestToken$1$1$token$1(aVar, clientId, clientSecret, null);
            this.L$0 = da20Var3;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = tje.k0(zkoVar, authManager$requestToken$1$1$token$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            da20Var = da20Var3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da20Var = (da20) this.L$0;
            kotlin.b.b(obj);
        }
        da20Var.success((String) obj);
        return zy11.a;
    }
}

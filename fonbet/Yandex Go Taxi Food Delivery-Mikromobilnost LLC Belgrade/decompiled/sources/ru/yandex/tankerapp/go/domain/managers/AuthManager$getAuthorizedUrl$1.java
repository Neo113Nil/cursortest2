package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.d;
import defpackage.da20;
import defpackage.evu0;
import defpackage.icx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.tankerapp.go.models.AuthorizedUrlRequestModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.AuthManager$getAuthorizedUrl$1", f = "AuthManager.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AuthManager$getAuthorizedUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $arguments;
    final /* synthetic */ da20 $result;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManager$getAuthorizedUrl$1(a aVar, Object obj, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$arguments = obj;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthManager$getAuthorizedUrl$1(this.this$0, this.$arguments, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$getAuthorizedUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            AuthorizedUrlRequestModel authorizedUrlRequestModel = str != null ? (AuthorizedUrlRequestModel) icx.a().c(AuthorizedUrlRequestModel.class, str) : null;
            if (authorizedUrlRequestModel == null) {
                this.$result.success(null);
                return zy11.a;
            }
            a aVar = this.this$0;
            da20 da20Var2 = this.$result;
            d dVar = aVar.a;
            String url = authorizedUrlRequestModel.getUrl();
            long uid = authorizedUrlRequestModel.getUid();
            this.L$0 = da20Var2;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = dVar.a(uid, url, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            da20Var = da20Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da20Var = (da20) this.L$0;
            kotlin.b.b(obj);
        }
        String str2 = (String) obj;
        if (str2 != null) {
            if (evu0.J(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                da20Var.success(str2);
                return zy11.a;
            }
        }
        da20Var.success(null);
        return zy11.a;
    }
}

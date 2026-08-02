package ru.yandex.taxi.security;

import com.yandex.go.protector.net.UserConfigApi;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.network.api.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.security.UserConfigRepository$sendRequest$1", f = "UserConfigRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class UserConfigRepository$sendRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $handlePath;
    final /* synthetic */ meu $headers;
    final /* synthetic */ wls $onSuccess;
    final /* synthetic */ m5j0 $requestBody;
    int label;
    final /* synthetic */ UserConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserConfigRepository$sendRequest$1(UserConfigRepository userConfigRepository, String str, meu meuVar, m5j0 m5j0Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userConfigRepository;
        this.$handlePath = str;
        this.$headers = meuVar;
        this.$requestBody = m5j0Var;
        this.$onSuccess = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserConfigRepository$sendRequest$1(this.this$0, this.$handlePath, this.$headers, this.$requestBody, this.$onSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserConfigRepository$sendRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            cmt<rvj0> a = ((UserConfigApi) this.this$0.b.getValue()).a(this.$handlePath, this.$headers, this.$requestBody);
            this.label = 1;
            obj = a.b(a, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        fmt fmtVar = (fmt) obj;
        this.$onSuccess.invoke(fmtVar.a, fmtVar.e);
        return zy11.a;
    }
}

package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.g;
import defpackage.da20;
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
import ru.yandex.tankerapp.go.sdk.location.CartechLocationPermission;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.LocationManager$requestPermission$1", f = "LocationManager.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class LocationManager$requestPermission$1 extends SuspendLambda implements wls {
    final /* synthetic */ da20 $result;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$requestPermission$1(da20 da20Var, Continuation continuation, b bVar) {
        super(2, continuation);
        this.$result = da20Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationManager$requestPermission$1(this.$result, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationManager$requestPermission$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da20 da20Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            da20 da20Var2 = this.$result;
            g gVar = this.this$0.a;
            this.L$0 = da20Var2;
            this.label = 1;
            Enum b = gVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            da20Var = da20Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da20Var = (da20) this.L$0;
            kotlin.b.b(obj);
        }
        da20Var.success(((CartechLocationPermission) obj).getValue());
        return zy11.a;
    }
}

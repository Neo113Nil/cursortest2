package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.g;
import defpackage.da20;
import defpackage.icx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.tankerapp.go.sdk.location.CartechPosition;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.LocationManager$getLastKnownPosition$1", f = "LocationManager.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class LocationManager$getLastKnownPosition$1 extends SuspendLambda implements wls {
    final /* synthetic */ da20 $result;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$getLastKnownPosition$1(da20 da20Var, Continuation continuation, b bVar) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationManager$getLastKnownPosition$1(this.$result, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationManager$getLastKnownPosition$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.a;
            this.label = 1;
            obj = gVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        CartechPosition cartechPosition = (CartechPosition) obj;
        if (cartechPosition != null) {
            pv00 pv00Var = this.this$0.c;
            this.$result.success((Map) icx.a().c(Map.class, icx.a().h(cartechPosition)));
        } else {
            this.$result.success(null);
        }
        return zy11.a;
    }
}

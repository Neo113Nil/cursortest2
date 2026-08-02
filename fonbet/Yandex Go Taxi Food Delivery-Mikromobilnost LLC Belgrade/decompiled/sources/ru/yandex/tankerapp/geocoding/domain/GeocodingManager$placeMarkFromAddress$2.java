package ru.yandex.tankerapp.geocoding.domain;

import defpackage.da20;
import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.geocoding.domain.GeocodingManager$placeMarkFromAddress$2", f = "GeocodingManager.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GeocodingManager$placeMarkFromAddress$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $address;
    final /* synthetic */ da20 $result;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeocodingManager$placeMarkFromAddress$2(a aVar, da20 da20Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$result = da20Var;
        this.$address = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeocodingManager$placeMarkFromAddress$2(this.this$0, this.$result, this.$address, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeocodingManager$placeMarkFromAddress$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            fse fseVar = aVar.d;
            GeocodingManager$placeMarkFromAddress$2$addresses$1 geocodingManager$placeMarkFromAddress$2$addresses$1 = new GeocodingManager$placeMarkFromAddress$2$addresses$1(aVar, this.$address, null);
            this.label = 1;
            obj = tje.k0(fseVar, geocodingManager$placeMarkFromAddress$2$addresses$1, this);
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
        a.b(this.this$0, (List) obj, this.$result);
        return zy11.a;
    }
}

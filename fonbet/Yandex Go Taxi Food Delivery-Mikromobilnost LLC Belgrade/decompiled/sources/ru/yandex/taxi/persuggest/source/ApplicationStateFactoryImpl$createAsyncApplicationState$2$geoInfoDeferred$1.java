package ru.yandex.taxi.persuggest.source;

import defpackage.lk6;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llk6;", "<anonymous>", "(Ltse;)Llk6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1", f = "ApplicationStateFactoryImpl.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ lk6 $briefGeoInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1(lk6 lk6Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$briefGeoInfo = lk6Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1(this.$briefGeoInfo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationStateFactoryImpl$createAsyncApplicationState$2$geoInfoDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lk6 lk6Var = this.$briefGeoInfo;
            if (lk6Var != null) {
                return lk6Var;
            }
            ru.yandex.taxi.preorder.source.userposition.b bVar = this.this$0.e;
            this.label = 1;
            obj = bVar.a(this);
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
        return (lk6) obj;
    }
}

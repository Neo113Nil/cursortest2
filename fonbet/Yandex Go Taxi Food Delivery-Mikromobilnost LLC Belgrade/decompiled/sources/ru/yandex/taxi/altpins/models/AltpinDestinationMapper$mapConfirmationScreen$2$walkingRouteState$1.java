package ru.yandex.taxi.altpins.models;

import defpackage.cwa1;
import defpackage.f4e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/map/WalkingRouteUiState;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/map/WalkingRouteUiState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.models.AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1", f = "AltpinDestinationMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1 extends SuspendLambda implements wls {
    final /* synthetic */ f4e $model;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1(a aVar, f4e f4eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = f4eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        f4e f4eVar = this.$model;
        aVar.getClass();
        List list = f4eVar.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cwa1.d((zzs) it.next()));
        }
        return new WalkingRouteUiState(arrayList, f4eVar.g, 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA);
    }
}

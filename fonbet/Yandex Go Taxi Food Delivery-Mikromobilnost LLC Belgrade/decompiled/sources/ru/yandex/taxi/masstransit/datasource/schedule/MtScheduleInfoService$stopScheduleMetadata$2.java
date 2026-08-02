package ru.yandex.taxi.masstransit.datasource.schedule;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.transport.masstransit.StopScheduleMetadata;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.yandex.runtime.TypeDictionary;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/transport/masstransit/StopScheduleMetadata;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/transport/masstransit/StopScheduleMetadata;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.schedule.MtScheduleInfoService$stopScheduleMetadata$2", f = "MtScheduleInfoService.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtScheduleInfoService$stopScheduleMetadata$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    final /* synthetic */ long $timeInMillis;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtScheduleInfoService$stopScheduleMetadata$2(a aVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$stopId = str;
        this.$timeInMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtScheduleInfoService$stopScheduleMetadata$2(this.this$0, this.$stopId, this.$timeInMillis, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtScheduleInfoService$stopScheduleMetadata$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        GeoObject geoObject;
        TypeDictionary<BaseMetadata> metadataContainer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            String str = this.$stopId;
            long j = this.$timeInMillis;
            this.label = 1;
            a = a.a(aVar, str, j, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            geoObject = (GeoObject) a;
        } else {
            jst.e.j(a2);
            geoObject = null;
        }
        if (geoObject == null || (metadataContainer = geoObject.getMetadataContainer()) == null) {
            return null;
        }
        String str2 = this.$stopId;
        try {
            return (StopScheduleMetadata) metadataContainer.getItem(StopScheduleMetadata.class);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error during attempt to get StopScheduleMetadata for stop " + str2);
            return null;
        }
    }
}

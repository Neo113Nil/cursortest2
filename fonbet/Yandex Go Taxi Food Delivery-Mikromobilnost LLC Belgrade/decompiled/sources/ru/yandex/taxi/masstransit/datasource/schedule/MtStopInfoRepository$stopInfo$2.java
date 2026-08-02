package ru.yandex.taxi.masstransit.datasource.schedule;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.StopMetadata;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o140;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo140;", "<anonymous>", "(Ltse;)Lo140;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.schedule.MtStopInfoRepository$stopInfo$2", f = "MtStopInfoRepository.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopInfoRepository$stopInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopInfoRepository$stopInfo$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$stopId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopInfoRepository$stopInfo$2(this.this$0, this.$stopId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopInfoRepository$stopInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        StopMetadata stopMetadata;
        Object obj2;
        Point point;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zzs zzsVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String str = this.$stopId;
            this.label = 1;
            a = b.a(bVar, str, this);
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
        if (a2 != null) {
            jst.e.k(a2, "Stop info request error");
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        GeoObject geoObject = (GeoObject) a;
        if (geoObject != null) {
            b bVar2 = this.this$0;
            String str2 = this.$stopId;
            bVar2.getClass();
            try {
                stopMetadata = (StopMetadata) geoObject.getMetadataContainer().getItem(StopMetadata.class);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                jst.e.k(th, "Error during attempt to get metadata item for stop with id " + str2);
                stopMetadata = null;
            }
            if (stopMetadata != null) {
                Iterator<T> it = geoObject.getGeometry().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((Geometry) obj2).getPoint() != null) {
                        break;
                    }
                }
                Geometry geometry = (Geometry) obj2;
                if (geometry != null && (point = geometry.getPoint()) != null) {
                    zzsVar = ru.yandex.taxi.map.utils.a.E(point, null);
                }
                Stop stop = stopMetadata.getStop();
                List<LineAtStop> linesAtStop = stopMetadata.getLinesAtStop();
                if (zzsVar == null) {
                    zzsVar = zzs.f;
                }
                return new o140(stop, linesAtStop, zzsVar);
            }
        }
        return null;
    }
}

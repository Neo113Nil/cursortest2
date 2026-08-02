package ru.yandex.taxi.masstransit.overlay.onmap;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.dyc;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2", f = "StopVehicleMapFocus.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $animationDurationMs;
    final /* synthetic */ ah00 $mapController;
    final /* synthetic */ float $stopOnlyZoom;
    final /* synthetic */ Point $stopPoint;
    final /* synthetic */ Point $vehiclePoint;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2(Point point, Point point2, ah00 ah00Var, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.$stopPoint = point;
        this.$vehiclePoint = point2;
        this.$mapController = ah00Var;
        this.$animationDurationMs = f;
        this.$stopOnlyZoom = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2(this.$stopPoint, this.$vehiclePoint, this.$mapController, this.$animationDurationMs, this.$stopOnlyZoom, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2 stopVehicleMapFocusKt$focusStopAndVehicleOnMap$2 = (StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        stopVehicleMapFocusKt$focusStopAndVehicleOnMap$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ArrayList arrayList = (ArrayList) j73.A(new Point[]{this.$stopPoint, this.$vehiclePoint});
        int size = arrayList.size();
        zy11 zy11Var = zy11.a;
        if (size >= 2) {
            Point point = (Point) arrayList.get(0);
            Point point2 = (Point) arrayList.get(1);
            Point point3 = new Point((point2.getLatitude() + point.getLatitude()) / 2.0d, (point2.getLongitude() + point.getLongitude()) / 2.0d);
            fi6 fi6Var = new fi6();
            fi6Var.c(point);
            fi6Var.c(point2);
            BoundingBox h = fi6Var.h(point3);
            Point southWest = h.getSouthWest();
            Point northEast = h.getNorthEast();
            double latitude = southWest.getLatitude() - 9.0E-4d;
            double latitude2 = northEast.getLatitude() + 9.0E-4d;
            double longitude = southWest.getLongitude() - 0.0012d;
            double longitude2 = northEast.getLongitude() + 0.0012d;
            double d = latitude2 - latitude;
            if (d < 0.0038d) {
                double d2 = (0.0038d - d) / 2.0d;
                latitude -= d2;
                latitude2 += d2;
            }
            double d3 = longitude2 - longitude;
            if (d3 < 0.0052d) {
                double d4 = (0.0052d - d3) / 2.0d;
                longitude -= d4;
                longitude2 += d4;
            }
            BoundingBox boundingBox = new BoundingBox(new Point(latitude, longitude), new Point(latitude2, longitude2));
            if (!((gh00) this.$mapController).m(boundingBox) || ((gh00) this.$mapController).j() < 12.0f) {
                ((gh00) this.$mapController).B(boundingBox, null, this.$animationDurationMs, new dyc(4));
                return zy11Var;
            }
        } else {
            Point point4 = this.$stopPoint;
            if (point4 != null) {
                ((gh00) this.$mapController).D(point4, this.$stopOnlyZoom, 200.0f, null);
            }
        }
        return zy11Var;
    }
}

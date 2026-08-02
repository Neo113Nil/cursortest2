package ru.yandex.taxi.masstransit.mapper;

import defpackage.ee01;
import defpackage.fe01;
import defpackage.g4z0;
import defpackage.ge01;
import defpackage.hj40;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.r440;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public final class f {
    public final ru.yandex.taxi.widget.c a;

    public f(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    public static fe01 a(r440 r440Var) {
        hj40 hj40Var = (hj40) kotlin.collections.a.R(r440Var.h);
        String str = hj40Var != null ? hj40Var.c : null;
        hj40 hj40Var2 = (hj40) kotlin.collections.a.b0(r440Var.h);
        return new fe01(str, hj40Var2 != null ? hj40Var2.c : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oov0 oov0Var, fe01 fe01Var, VehicleType vehicleType, MtTransportType mtTransportType, ContinuationImpl continuationImpl) {
        MtTrainsButtonsMapper$mapScheduleButton$1 mtTrainsButtonsMapper$mapScheduleButton$1;
        int i;
        if (continuationImpl instanceof MtTrainsButtonsMapper$mapScheduleButton$1) {
            mtTrainsButtonsMapper$mapScheduleButton$1 = (MtTrainsButtonsMapper$mapScheduleButton$1) continuationImpl;
            int i2 = mtTrainsButtonsMapper$mapScheduleButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainsButtonsMapper$mapScheduleButton$1.label = i2 - Integer.MIN_VALUE;
                MtTrainsButtonsMapper$mapScheduleButton$1 mtTrainsButtonsMapper$mapScheduleButton$12 = mtTrainsButtonsMapper$mapScheduleButton$1;
                Object obj = mtTrainsButtonsMapper$mapScheduleButton$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainsButtonsMapper$mapScheduleButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = oov0Var.b.a;
                    mtTrainsButtonsMapper$mapScheduleButton$12.L$0 = null;
                    mtTrainsButtonsMapper$mapScheduleButton$12.L$1 = fe01Var;
                    mtTrainsButtonsMapper$mapScheduleButton$12.L$2 = vehicleType;
                    mtTrainsButtonsMapper$mapScheduleButton$12.L$3 = mtTransportType;
                    mtTrainsButtonsMapper$mapScheduleButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, mtTrainsButtonsMapper$mapScheduleButton$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mtTransportType = (MtTransportType) mtTrainsButtonsMapper$mapScheduleButton$12.L$3;
                    vehicleType = (VehicleType) mtTrainsButtonsMapper$mapScheduleButton$12.L$2;
                    fe01Var = (fe01) mtTrainsButtonsMapper$mapScheduleButton$12.L$1;
                    kotlin.b.b(obj);
                }
                return new ee01((CharSequence) obj, fe01Var, vehicleType, mtTransportType);
            }
        }
        mtTrainsButtonsMapper$mapScheduleButton$1 = new MtTrainsButtonsMapper$mapScheduleButton$1(this, continuationImpl);
        MtTrainsButtonsMapper$mapScheduleButton$1 mtTrainsButtonsMapper$mapScheduleButton$122 = mtTrainsButtonsMapper$mapScheduleButton$1;
        Object obj2 = mtTrainsButtonsMapper$mapScheduleButton$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainsButtonsMapper$mapScheduleButton$122.label;
        if (i != 0) {
        }
        return new ee01((CharSequence) obj2, fe01Var, vehicleType, mtTransportType);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(oov0 oov0Var, boolean z, VehicleType vehicleType, MtTransportType mtTransportType, ContinuationImpl continuationImpl) {
        MtTrainsButtonsMapper$mapTicketsButton$1 mtTrainsButtonsMapper$mapTicketsButton$1;
        int i;
        g4z0 g4z0Var;
        if (continuationImpl instanceof MtTrainsButtonsMapper$mapTicketsButton$1) {
            mtTrainsButtonsMapper$mapTicketsButton$1 = (MtTrainsButtonsMapper$mapTicketsButton$1) continuationImpl;
            int i2 = mtTrainsButtonsMapper$mapTicketsButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainsButtonsMapper$mapTicketsButton$1.label = i2 - Integer.MIN_VALUE;
                MtTrainsButtonsMapper$mapTicketsButton$1 mtTrainsButtonsMapper$mapTicketsButton$12 = mtTrainsButtonsMapper$mapTicketsButton$1;
                Object obj = mtTrainsButtonsMapper$mapTicketsButton$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainsButtonsMapper$mapTicketsButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        return null;
                    }
                    g4z0 g4z0Var2 = oov0Var.a;
                    FormattedText formattedText = g4z0Var2.a;
                    mtTrainsButtonsMapper$mapTicketsButton$12.L$0 = null;
                    mtTrainsButtonsMapper$mapTicketsButton$12.L$1 = vehicleType;
                    mtTrainsButtonsMapper$mapTicketsButton$12.L$2 = mtTransportType;
                    mtTrainsButtonsMapper$mapTicketsButton$12.L$3 = g4z0Var2;
                    mtTrainsButtonsMapper$mapTicketsButton$12.Z$0 = z;
                    mtTrainsButtonsMapper$mapTicketsButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, mtTrainsButtonsMapper$mapTicketsButton$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    g4z0Var = g4z0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g4z0Var = (g4z0) mtTrainsButtonsMapper$mapTicketsButton$12.L$3;
                    mtTransportType = (MtTransportType) mtTrainsButtonsMapper$mapTicketsButton$12.L$2;
                    vehicleType = (VehicleType) mtTrainsButtonsMapper$mapTicketsButton$12.L$1;
                    kotlin.b.b(obj);
                }
                return new ge01((CharSequence) obj, g4z0Var.b, vehicleType, mtTransportType);
            }
        }
        mtTrainsButtonsMapper$mapTicketsButton$1 = new MtTrainsButtonsMapper$mapTicketsButton$1(this, continuationImpl);
        MtTrainsButtonsMapper$mapTicketsButton$1 mtTrainsButtonsMapper$mapTicketsButton$122 = mtTrainsButtonsMapper$mapTicketsButton$1;
        Object obj2 = mtTrainsButtonsMapper$mapTicketsButton$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainsButtonsMapper$mapTicketsButton$122.label;
        if (i != 0) {
        }
        return new ge01((CharSequence) obj2, g4z0Var.b, vehicleType, mtTransportType);
    }
}

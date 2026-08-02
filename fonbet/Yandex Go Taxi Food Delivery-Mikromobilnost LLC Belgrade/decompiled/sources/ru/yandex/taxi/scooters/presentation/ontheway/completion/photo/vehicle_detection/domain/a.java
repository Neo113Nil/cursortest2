package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.cvu0;
import defpackage.d3a;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.q9n0;
import defpackage.w511;
import defpackage.zuo0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class a {
    public static final /* synthetic */ int b = 0;
    public final d3a a;

    public a(d3a d3aVar) {
        this.a = d3aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1 scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1;
        int i;
        ScootersVehicleDetectionOnPhotoExperiment scootersVehicleDetectionOnPhotoExperiment;
        ScootersVehicleDetectionOnPhotoExperiment.VehicleType vehicleType;
        if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1) {
            scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1 = (ScootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1) continuationImpl;
            int i2 = scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.L$0 = zuo0Var;
                    scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.label = 1;
                    obj = this.a.b.b(scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zuo0Var = (zuo0) scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersVehicleDetectionOnPhotoExperiment = (ScootersVehicleDetectionOnPhotoExperiment) obj;
                if (scootersVehicleDetectionOnPhotoExperiment.b) {
                    int i3 = q9n0.a[zuo0Var.q().ordinal()];
                    if (i3 == 1) {
                        vehicleType = ScootersVehicleDetectionOnPhotoExperiment.VehicleType.SCOOTER;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        vehicleType = ScootersVehicleDetectionOnPhotoExperiment.VehicleType.BIKE;
                    }
                    String k = zuo0Var.getNumber().b.k();
                    for (Object obj2 : scootersVehicleDetectionOnPhotoExperiment.c.a) {
                        ScootersVehicleDetectionOnPhotoExperiment.b bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj2;
                        if (!evu0.J(bVar.a) && bVar.c.contains(vehicleType)) {
                            List list = bVar.b;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (cvu0.t((String) it.next(), k, true)) {
                                        return obj2;
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }
        scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1 = new ScootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1(this, continuationImpl);
        Object obj3 = scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionConfiguredModelInteractor$getConfiguredModelOrNull$1.label;
        if (i != 0) {
        }
        scootersVehicleDetectionOnPhotoExperiment = (ScootersVehicleDetectionOnPhotoExperiment) obj3;
        if (scootersVehicleDetectionOnPhotoExperiment.b) {
        }
        return null;
    }
}

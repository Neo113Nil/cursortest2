package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.p7p0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment", aVar, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j(ConstantDeviceInfo.APP_PLATFORM, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, b.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ScootersVehicleDetectionOnPhotoExperiment.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (ScootersVehicleDetectionOnPhotoExperiment.a) b.A(serialDescriptor, 1, b.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScootersVehicleDetectionOnPhotoExperiment(i, z2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment.a.c) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ScootersVehicleDetectionOnPhotoExperiment scootersVehicleDetectionOnPhotoExperiment = (ScootersVehicleDetectionOnPhotoExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        p7p0 p7p0Var = ScootersVehicleDetectionOnPhotoExperiment.Companion;
        if (b.F() || scootersVehicleDetectionOnPhotoExperiment.b) {
            b.n(serialDescriptor, 0, scootersVehicleDetectionOnPhotoExperiment.b);
        }
        if (!b.F()) {
            ScootersVehicleDetectionOnPhotoExperiment.a aVar = scootersVehicleDetectionOnPhotoExperiment.c;
            ScootersVehicleDetectionOnPhotoExperiment.a.Companion.getClass();
        }
        b.e(serialDescriptor, 1, b.a, scootersVehicleDetectionOnPhotoExperiment.c);
        b.c(serialDescriptor);
    }
}

package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment.Model", dVar, 4);
        pluginGeneratedSerialDescriptor.j("link", true);
        pluginGeneratedSerialDescriptor.j("vehicle_vendors", true);
        pluginGeneratedSerialDescriptor.j("vehicle_types", true);
        pluginGeneratedSerialDescriptor.j("resize_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersVehicleDetectionOnPhotoExperiment.b.e;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersVehicleDetectionOnPhotoExperiment.b.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        ScootersVehicleDetectionOnPhotoExperiment.ResizeMode resizeMode = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                resizeMode = (ScootersVehicleDetectionOnPhotoExperiment.ResizeMode) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), resizeMode);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScootersVehicleDetectionOnPhotoExperiment.b(i, str, list, list2, resizeMode);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersVehicleDetectionOnPhotoExperiment.b bVar = (ScootersVehicleDetectionOnPhotoExperiment.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersVehicleDetectionOnPhotoExperiment.b.e;
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(bVar.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), bVar.c);
        }
        if (b.F() || bVar.d != ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.RESIZE) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), bVar.d);
        }
        b.c(serialDescriptor);
    }
}

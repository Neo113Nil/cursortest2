package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class r68 implements uxs {
    public static final r68 a;
    private static final SerialDescriptor descriptor;

    static {
        r68 r68Var = new r68();
        a = r68Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment", r68Var, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("short_plate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, CarPlateAppearanceExperiment.d[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CarPlateAppearanceExperiment.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        jsq0 jsq0Var = null;
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
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new CarPlateAppearanceExperiment(i, z2, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CarPlateAppearanceExperiment carPlateAppearanceExperiment = (CarPlateAppearanceExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CarPlateAppearanceExperiment.d;
        if (b.F() || carPlateAppearanceExperiment.b) {
            b.n(serialDescriptor, 0, carPlateAppearanceExperiment.b);
        }
        if (b.F() || !jl40.l(carPlateAppearanceExperiment.c, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), carPlateAppearanceExperiment.c);
        }
        b.c(serialDescriptor);
    }
}

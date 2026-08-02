package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class k0 implements uxs {
    public static final k0 a;
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment.Camera.ScooterPreview", k0Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("add_and_replace_buttons", true);
        pluginGeneratedSerialDescriptor.j("add_button", true);
        pluginGeneratedSerialDescriptor.j("icons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, ScootersMultiOrderExperiment.Camera.ScooterPreview.e[1].getValue(), l0.a, p0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.Camera.ScooterPreview.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        ScootersMultiOrderExperiment.Camera.ScooterPreview.a aVar = null;
        ScootersMultiOrderExperiment.Camera.ScooterPreview.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                aVar = (ScootersMultiOrderExperiment.Camera.ScooterPreview.a) b.A(serialDescriptor, 2, l0.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bVar = (ScootersMultiOrderExperiment.Camera.ScooterPreview.b) b.A(serialDescriptor, 3, p0.a, bVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScootersMultiOrderExperiment.Camera.ScooterPreview(i, z2, list, aVar, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.Camera.ScooterPreview.e;
        if (b.F() || scooterPreview.a) {
            b.n(serialDescriptor, 0, scooterPreview.a);
        }
        if (b.F() || !jl40.l(scooterPreview.b, scc.g(new ScootersMultiOrderExperiment.Camera.ScooterPreview.a(ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.ADD, 14), new ScootersMultiOrderExperiment.Camera.ScooterPreview.a(ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.REPLACE, 14)))) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), scooterPreview.b);
        }
        if (b.F() || !jl40.l(scooterPreview.c, new ScootersMultiOrderExperiment.Camera.ScooterPreview.a(null, 15))) {
            b.e(serialDescriptor, 2, l0.a, scooterPreview.c);
        }
        if (b.F() || !jl40.l(scooterPreview.d, new ScootersMultiOrderExperiment.Camera.ScooterPreview.b(0))) {
            b.e(serialDescriptor, 3, p0.a, scooterPreview.d);
        }
        b.c(serialDescriptor);
    }
}

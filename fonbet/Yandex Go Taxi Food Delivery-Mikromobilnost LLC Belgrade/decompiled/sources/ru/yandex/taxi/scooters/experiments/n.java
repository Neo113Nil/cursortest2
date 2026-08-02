package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes9.dex */
public final /* synthetic */ class n implements uxs {
    public static final n a;
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersCardV2.ChargeConfig.BatteryAppearanceOptions.V2Battery", nVar, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("multicolor", true);
        pluginGeneratedSerialDescriptor.j("fill", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p.e;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ScootersCardV2.ChargeConfig.ValueOption valueOption = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                valueOption = (ScootersCardV2.ChargeConfig.ValueOption) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), valueOption);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new p(i, z2, valueOption, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p pVar = (p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p.e;
        if (b.F() || !pVar.a) {
            b.n(serialDescriptor, 0, pVar.a);
        }
        if (b.F() || pVar.b != ScootersCardV2.ChargeConfig.ValueOption.PERCENTS) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pVar.b);
        }
        if (b.F() || !pVar.c) {
            b.n(serialDescriptor, 2, pVar.c);
        }
        if (b.F() || !pVar.d) {
            b.n(serialDescriptor, 3, pVar.d);
        }
        b.c(serialDescriptor);
    }
}

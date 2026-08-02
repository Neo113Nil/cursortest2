package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements uxs {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersCardV2.ChargeConfig", kVar, 3);
        pluginGeneratedSerialDescriptor.j("battery", true);
        pluginGeneratedSerialDescriptor.j("plates", true);
        pluginGeneratedSerialDescriptor.j("scooter", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersCardV2.ChargeConfig.d;
        return new KSerializer[]{m.e, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersCardV2.ChargeConfig.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        t tVar = null;
        jsq0 jsq0Var = null;
        ScootersCardV2.ChargeConfig.ValueOption valueOption = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                tVar = (t) b.A(serialDescriptor, 0, m.e, tVar);
                i |= 1;
            } else if (v == 1) {
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                valueOption = (ScootersCardV2.ChargeConfig.ValueOption) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), valueOption);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ScootersCardV2.ChargeConfig(i, tVar, jsq0Var, valueOption);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersCardV2.ChargeConfig chargeConfig = (ScootersCardV2.ChargeConfig) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersCardV2.ChargeConfig.d;
        if (b.F() || !jl40.l(chargeConfig.a, new p(0))) {
            b.e(serialDescriptor, 0, m.e, chargeConfig.a);
        }
        if (b.F() || !jl40.l(chargeConfig.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), chargeConfig.b);
        }
        if (b.F() || chargeConfig.c != ScootersCardV2.ChargeConfig.ValueOption.NONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), chargeConfig.c);
        }
        b.c(serialDescriptor);
    }
}

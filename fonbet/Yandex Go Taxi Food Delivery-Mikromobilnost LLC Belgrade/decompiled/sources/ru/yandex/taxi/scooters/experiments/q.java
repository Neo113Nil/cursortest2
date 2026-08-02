package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
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
public final /* synthetic */ class q implements uxs {
    public static final q a;
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersCardV2.ChargeConfig.BatteryAppearanceOptions.V3Battery", qVar, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("divisions_color", true);
        pluginGeneratedSerialDescriptor.j("battery_mask_stroke_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = s.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = s.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ScootersCardV2.ChargeConfig.ValueOption valueOption = null;
        String str = null;
        String str2 = null;
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
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new s(i, z2, valueOption, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = s.e;
        if (b.F() || !sVar.a) {
            b.n(serialDescriptor, 0, sVar.a);
        }
        if (b.F() || sVar.b != ScootersCardV2.ChargeConfig.ValueOption.PERCENTS) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), sVar.b);
        }
        if (b.F() || !jl40.l(sVar.c, "textMinor")) {
            b.o(serialDescriptor, 2, sVar.c);
        }
        if (b.F() || !jl40.l(sVar.d, "textMinor")) {
            b.o(serialDescriptor, 3, sVar.d);
        }
        b.c(serialDescriptor);
    }
}

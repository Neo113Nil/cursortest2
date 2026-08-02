package ru.yandex.taxi.scooters.experiments;

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
public final /* synthetic */ class h implements uxs {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersCardV2", hVar, 2);
        pluginGeneratedSerialDescriptor.j("battery_charge_percents", true);
        pluginGeneratedSerialDescriptor.j("charge_config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i.a, k.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersCardV2.a aVar = null;
        ScootersCardV2.ChargeConfig chargeConfig = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (ScootersCardV2.a) b.A(serialDescriptor, 0, i.a, aVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                chargeConfig = (ScootersCardV2.ChargeConfig) b.A(serialDescriptor, 1, k.a, chargeConfig);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScootersCardV2(i, aVar, chargeConfig);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.scooters.experiments.ScootersCardV2.a.c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.scooters.experiments.ScootersCardV2.ChargeConfig.e) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ScootersCardV2 scootersCardV2 = (ScootersCardV2) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            ScootersCardV2.a aVar = scootersCardV2.a;
            ScootersCardV2.a.Companion.getClass();
        }
        b.e(serialDescriptor, 0, i.a, scootersCardV2.a);
        if (!b.F()) {
            ScootersCardV2.ChargeConfig chargeConfig = scootersCardV2.b;
            ScootersCardV2.ChargeConfig.Companion.getClass();
        }
        b.e(serialDescriptor, 1, k.a, scootersCardV2.b);
        b.c(serialDescriptor);
    }
}

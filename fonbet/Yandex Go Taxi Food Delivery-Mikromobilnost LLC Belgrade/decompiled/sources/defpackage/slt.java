package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class slt implements uxs {
    public static final slt a;
    private static final SerialDescriptor descriptor;

    static {
        slt sltVar = new slt();
        a = sltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.GnssSatelliteParams", sltVar, 9);
        pluginGeneratedSerialDescriptor.j("svid", true);
        pluginGeneratedSerialDescriptor.j("constellation_type", true);
        pluginGeneratedSerialDescriptor.j("cn0_db_hz", true);
        pluginGeneratedSerialDescriptor.j("elevation_degrees", true);
        pluginGeneratedSerialDescriptor.j("azimuth_degrees", true);
        pluginGeneratedSerialDescriptor.j("carrier_frequency_hz", true);
        pluginGeneratedSerialDescriptor.j("used_in_fix", true);
        pluginGeneratedSerialDescriptor.j("has_almanac", true);
        pluginGeneratedSerialDescriptor.j("has_ephemeris", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z8 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z9 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z10 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ult(i, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ult ultVar = (ult) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ultVar.a) {
            b.n(serialDescriptor, 0, ultVar.a);
        }
        if (b.F() || ultVar.b) {
            b.n(serialDescriptor, 1, ultVar.b);
        }
        if (b.F() || ultVar.c) {
            b.n(serialDescriptor, 2, ultVar.c);
        }
        if (b.F() || ultVar.d) {
            b.n(serialDescriptor, 3, ultVar.d);
        }
        if (b.F() || ultVar.e) {
            b.n(serialDescriptor, 4, ultVar.e);
        }
        if (b.F() || ultVar.f) {
            b.n(serialDescriptor, 5, ultVar.f);
        }
        if (b.F() || ultVar.g) {
            b.n(serialDescriptor, 6, ultVar.g);
        }
        if (b.F() || ultVar.h) {
            b.n(serialDescriptor, 7, ultVar.h);
        }
        if (b.F() || ultVar.i) {
            b.n(serialDescriptor, 8, ultVar.i);
        }
        b.c(serialDescriptor);
    }
}

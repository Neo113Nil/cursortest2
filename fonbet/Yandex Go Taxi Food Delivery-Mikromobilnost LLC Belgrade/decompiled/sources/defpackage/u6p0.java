package defpackage;

import defpackage.w6p0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class u6p0 implements uxs {
    public static final u6p0 a;
    private static final SerialDescriptor descriptor;

    static {
        u6p0 u6p0Var = new u6p0();
        a = u6p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersUserStateResponse.UserStateInsurance.UserStateInsuranceFullInsurancePrices", u6p0Var, 2);
        pluginGeneratedSerialDescriptor.j("fixed_price", true);
        pluginGeneratedSerialDescriptor.j("coverage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{pnzVar, pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                j2 = b.f(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new w6p0.a.C0131a(i, j, j2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w6p0.a.C0131a c0131a = (w6p0.a.C0131a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c0131a.a != 0) {
            b.s(serialDescriptor, 0, c0131a.a);
        }
        if (b.F() || c0131a.b != 0) {
            b.s(serialDescriptor, 1, c0131a.b);
        }
        b.c(serialDescriptor);
    }
}

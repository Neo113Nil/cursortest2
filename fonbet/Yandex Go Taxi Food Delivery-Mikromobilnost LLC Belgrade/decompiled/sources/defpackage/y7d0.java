package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class y7d0 implements uxs {
    public static final y7d0 a;
    private static final SerialDescriptor descriptor;

    static {
        y7d0 y7d0Var = new y7d0();
        a = y7d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGeoLocationDto", y7d0Var, 3);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.j("accuracy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar, qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        Double d3 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d3 = (Double) b.s(serialDescriptor, 2, e6m.a, d3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new a8d0(i, d, d2, d3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a8d0 a8d0Var = (a8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.E(serialDescriptor, 0, a8d0Var.a);
        b.E(serialDescriptor, 1, a8d0Var.b);
        b.g(serialDescriptor, 2, e6m.a, a8d0Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

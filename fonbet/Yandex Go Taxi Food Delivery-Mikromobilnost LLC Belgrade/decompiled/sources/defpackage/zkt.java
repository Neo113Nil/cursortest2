package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class zkt implements uxs {
    public static final zkt a;
    private static final SerialDescriptor descriptor;

    static {
        zkt zktVar = new zkt();
        a = zktVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.fingerprint.GnssClockData", zktVar, 9);
        pluginGeneratedSerialDescriptor.j("time_nanos", true);
        pluginGeneratedSerialDescriptor.j("hw_clock_discontinuity_count", true);
        pluginGeneratedSerialDescriptor.j("full_bias_nanos", true);
        pluginGeneratedSerialDescriptor.j("bias_nanos", true);
        pluginGeneratedSerialDescriptor.j("bias_uncertainty_nanos", true);
        pluginGeneratedSerialDescriptor.j("drift_nanos_per_second", true);
        pluginGeneratedSerialDescriptor.j("drift_uncertainty_nanos_per_second", true);
        pluginGeneratedSerialDescriptor.j("leap_second", true);
        pluginGeneratedSerialDescriptor.j("time_uncertainty_nanos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        KSerializer n = qke.n(pnzVar);
        h6w h6wVar = h6w.a;
        KSerializer n2 = qke.n(h6wVar);
        KSerializer n3 = qke.n(pnzVar);
        e6m e6mVar = e6m.a;
        return new KSerializer[]{n, n2, n3, qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(h6wVar), qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        Double d = null;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Integer num2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) b.s(serialDescriptor, 3, e6m.a, d2);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) b.s(serialDescriptor, 4, e6m.a, d3);
                    i |= 16;
                    break;
                case 5:
                    d4 = (Double) b.s(serialDescriptor, 5, e6m.a, d4);
                    i |= 32;
                    break;
                case 6:
                    d5 = (Double) b.s(serialDescriptor, 6, e6m.a, d5);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) b.s(serialDescriptor, 7, h6w.a, num2);
                    i |= 128;
                    break;
                case 8:
                    d = (Double) b.s(serialDescriptor, 8, e6m.a, d);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new blt(i, l, num, l2, d2, d3, d4, d5, num2, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        blt bltVar = (blt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bltVar.a != null) {
            b.g(serialDescriptor, 0, pnz.a, bltVar.a);
        }
        if (b.F() || bltVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, bltVar.b);
        }
        if (b.F() || bltVar.c != null) {
            b.g(serialDescriptor, 2, pnz.a, bltVar.c);
        }
        if (b.F() || bltVar.d != null) {
            b.g(serialDescriptor, 3, e6m.a, bltVar.d);
        }
        if (b.F() || bltVar.e != null) {
            b.g(serialDescriptor, 4, e6m.a, bltVar.e);
        }
        if (b.F() || bltVar.f != null) {
            b.g(serialDescriptor, 5, e6m.a, bltVar.f);
        }
        if (b.F() || bltVar.g != null) {
            b.g(serialDescriptor, 6, e6m.a, bltVar.g);
        }
        if (b.F() || bltVar.h != null) {
            b.g(serialDescriptor, 7, h6w.a, bltVar.h);
        }
        if (b.F() || bltVar.i != null) {
            b.g(serialDescriptor, 8, e6m.a, bltVar.i);
        }
        b.c(serialDescriptor);
    }
}

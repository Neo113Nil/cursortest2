package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class sb40 implements uxs {
    public static final sb40 a;
    private static final SerialDescriptor descriptor;

    static {
        sb40 sb40Var = new sb40();
        a = sb40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto", sb40Var, 5);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("info", true);
        pluginGeneratedSerialDescriptor.j("back_and_forth", true);
        pluginGeneratedSerialDescriptor.j("passengers_counter", true);
        pluginGeneratedSerialDescriptor.j("payment_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hc40.a, jc40.a, tb40.a, nc40.a, pc40.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vb40.g gVar = null;
        vb40.h hVar = null;
        vb40.a aVar = null;
        vb40.j jVar = null;
        vb40.k kVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                gVar = (vb40.g) b.A(serialDescriptor, 0, hc40.a, gVar);
                i |= 1;
            } else if (v == 1) {
                hVar = (vb40.h) b.A(serialDescriptor, 1, jc40.a, hVar);
                i |= 2;
            } else if (v == 2) {
                aVar = (vb40.a) b.A(serialDescriptor, 2, tb40.a, aVar);
                i |= 4;
            } else if (v == 3) {
                jVar = (vb40.j) b.A(serialDescriptor, 3, nc40.a, jVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                kVar = (vb40.k) b.A(serialDescriptor, 4, pc40.a, kVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new vb40(i, gVar, hVar, aVar, jVar, kVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40 vb40Var = (vb40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(vb40Var.a, new vb40.g(0))) {
            b.e(serialDescriptor, 0, hc40.a, vb40Var.a);
        }
        if (b.F() || !jl40.l(vb40Var.b, new vb40.h(0))) {
            b.e(serialDescriptor, 1, jc40.a, vb40Var.b);
        }
        if (b.F() || !jl40.l(vb40Var.c, new vb40.a(0))) {
            b.e(serialDescriptor, 2, tb40.a, vb40Var.c);
        }
        if (b.F() || !jl40.l(vb40Var.d, new vb40.j(0))) {
            b.e(serialDescriptor, 3, nc40.a, vb40Var.d);
        }
        if (b.F() || !jl40.l(vb40Var.e, new vb40.k(0))) {
            b.e(serialDescriptor, 4, pc40.a, vb40Var.e);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.model.e;

/* loaded from: classes9.dex */
public final /* synthetic */ class qiu0 implements uxs {
    public static final qiu0 a;
    private static final SerialDescriptor descriptor;

    static {
        qiu0 qiu0Var = new qiu0();
        a = qiu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.StopsScale", qiu0Var, 3);
        pluginGeneratedSerialDescriptor.j("zoom_range", true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        pluginGeneratedSerialDescriptor.j("override_icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.a, nor.a, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        float f = 0.0f;
        boolean z = true;
        int i = 0;
        VariantStyle.b bVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (VariantStyle.b) b.A(serialDescriptor, 0, e.a, bVar);
                i |= 1;
            } else if (v == 1) {
                f = b.y(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new siu0(i, bVar, f, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        siu0 siu0Var = (siu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(siu0Var.a, new VariantStyle.b(3))) {
            b.e(serialDescriptor, 0, e.a, siu0Var.a);
        }
        if (b.F() || Float.compare(siu0Var.b, 1.0f) != 0) {
            b.z(serialDescriptor, 1, siu0Var.b);
        }
        if (b.F() || siu0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, siu0Var.c);
        }
        b.c(serialDescriptor);
    }
}

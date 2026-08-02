package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class s3e0 implements uxs {
    public static final s3e0 a;
    private static final SerialDescriptor descriptor;

    static {
        s3e0 s3e0Var = new s3e0();
        a = s3e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolygonStyle", s3e0Var, 5);
        pluginGeneratedSerialDescriptor.j("stroke_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_color_multi_hex", true);
        pluginGeneratedSerialDescriptor.j("stroke_opacity", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        pluginGeneratedSerialDescriptor.j("fill_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(nor.a), qke.n(n3r.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Float f = null;
        p3r p3rVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else if (v == 3) {
                f = (Float) b.s(serialDescriptor, 3, nor.a, f);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                p3rVar = (p3r) b.s(serialDescriptor, 4, n3r.a, p3rVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new u3e0(i, str, str2, num, f, p3rVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u3e0 u3e0Var = (u3e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || u3e0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, u3e0Var.a);
        }
        if (b.F() || u3e0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, u3e0Var.b);
        }
        if (b.F() || u3e0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, u3e0Var.c);
        }
        if (b.F() || u3e0Var.d != null) {
            b.g(serialDescriptor, 3, nor.a, u3e0Var.d);
        }
        if (b.F() || u3e0Var.e != null) {
            b.g(serialDescriptor, 4, n3r.a, u3e0Var.e);
        }
        b.c(serialDescriptor);
    }
}

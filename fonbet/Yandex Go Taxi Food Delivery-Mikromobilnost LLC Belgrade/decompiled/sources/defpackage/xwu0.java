package defpackage;

import com.yandex.go.layers.api.model.params.AutoScale;
import com.yandex.go.layers.api.model.params.AutoScale$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class xwu0 implements uxs {
    public static final xwu0 a;
    private static final SerialDescriptor descriptor;

    static {
        xwu0 xwu0Var = new xwu0();
        a = xwu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.Style", xwu0Var, 6);
        pluginGeneratedSerialDescriptor.j("azimuth", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        pluginGeneratedSerialDescriptor.j("autoscale", true);
        pluginGeneratedSerialDescriptor.j("selected_image", true);
        pluginGeneratedSerialDescriptor.j("outline", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        fxu0 fxu0Var = fxu0.a;
        return new KSerializer[]{n, qke.n(fxu0Var), qke.n(nor.a), qke.n(AutoScale$$serializer.INSTANCE), qke.n(fxu0Var), qke.n(lxu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        hxu0 hxu0Var = null;
        Float f = null;
        AutoScale autoScale = null;
        hxu0 hxu0Var2 = null;
        nxu0 nxu0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    hxu0Var = (hxu0) b.s(serialDescriptor, 1, fxu0.a, hxu0Var);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) b.s(serialDescriptor, 2, nor.a, f);
                    i |= 4;
                    break;
                case 3:
                    autoScale = (AutoScale) b.s(serialDescriptor, 3, AutoScale$$serializer.INSTANCE, autoScale);
                    i |= 8;
                    break;
                case 4:
                    hxu0Var2 = (hxu0) b.s(serialDescriptor, 4, fxu0.a, hxu0Var2);
                    i |= 16;
                    break;
                case 5:
                    nxu0Var = (nxu0) b.s(serialDescriptor, 5, lxu0.a, nxu0Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new bxu0(i, num, hxu0Var, f, autoScale, hxu0Var2, nxu0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bxu0 bxu0Var = (bxu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bxu0Var.a != null) {
            b.g(serialDescriptor, 0, h6w.a, bxu0Var.a);
        }
        if (b.F() || bxu0Var.b != null) {
            b.g(serialDescriptor, 1, fxu0.a, bxu0Var.b);
        }
        if (b.F() || bxu0Var.c != null) {
            b.g(serialDescriptor, 2, nor.a, bxu0Var.c);
        }
        if (b.F() || bxu0Var.d != null) {
            b.g(serialDescriptor, 3, AutoScale$$serializer.INSTANCE, bxu0Var.d);
        }
        if (b.F() || bxu0Var.e != null) {
            b.g(serialDescriptor, 4, fxu0.a, bxu0Var.e);
        }
        if (b.F() || bxu0Var.f != null) {
            b.g(serialDescriptor, 5, lxu0.a, bxu0Var.f);
        }
        b.c(serialDescriptor);
    }
}

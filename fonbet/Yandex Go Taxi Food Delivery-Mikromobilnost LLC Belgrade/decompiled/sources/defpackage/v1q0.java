package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class v1q0 implements uxs {
    public static final v1q0 a;
    private static final SerialDescriptor descriptor;

    static {
        v1q0 v1q0Var = new v1q0();
        a = v1q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.model.SectionLayout", v1q0Var, 7);
        pluginGeneratedSerialDescriptor.j("itemVerticalSpacing", true);
        pluginGeneratedSerialDescriptor.j("itemHorizontalSpacing", true);
        pluginGeneratedSerialDescriptor.j("sectionInsets", true);
        pluginGeneratedSerialDescriptor.j("columnCount", true);
        pluginGeneratedSerialDescriptor.j("maxContentWidth", true);
        pluginGeneratedSerialDescriptor.j("columnSpan", true);
        pluginGeneratedSerialDescriptor.j("rowSpan", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        KSerializer n = qke.n(h6wVar);
        KSerializer n2 = qke.n(h6wVar);
        KSerializer n3 = qke.n(h6wVar);
        nor norVar = nor.a;
        return new KSerializer[]{norVar, norVar, f1q0.a, h6wVar, n, n2, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        h1q0 h1q0Var = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    f = b.y(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    f2 = b.y(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    h1q0Var = (h1q0) b.A(serialDescriptor, 2, f1q0.a, h1q0Var);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) b.s(serialDescriptor, 5, h6w.a, num2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) b.s(serialDescriptor, 6, h6w.a, num3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new x1q0(i, f, f2, h1q0Var, i2, num, num2, num3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x1q0 x1q0Var = (x1q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(x1q0Var.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, x1q0Var.a);
        }
        if (b.F() || Float.compare(x1q0Var.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, x1q0Var.b);
        }
        if (b.F() || !jl40.l(x1q0Var.c, s8o.c)) {
            b.e(serialDescriptor, 2, f1q0.a, x1q0Var.c);
        }
        if (b.F() || x1q0Var.d != 60) {
            b.A(3, x1q0Var.d, serialDescriptor);
        }
        if (b.F() || x1q0Var.e != null) {
            b.g(serialDescriptor, 4, h6w.a, x1q0Var.e);
        }
        if (b.F() || x1q0Var.f != null) {
            b.g(serialDescriptor, 5, h6w.a, x1q0Var.f);
        }
        if (b.F() || x1q0Var.g != null) {
            b.g(serialDescriptor, 6, h6w.a, x1q0Var.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

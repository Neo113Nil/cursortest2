package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class u68 implements uxs {
    public static final u68 a;
    private static final SerialDescriptor descriptor;

    static {
        u68 u68Var = new u68();
        a = u68Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.carplates.model.CarPlatesFontStyle", u68Var, 5);
        pluginGeneratedSerialDescriptor.j("letterSpacing", true);
        pluginGeneratedSerialDescriptor.j("fontFeature", true);
        pluginGeneratedSerialDescriptor.j("textSize", true);
        pluginGeneratedSerialDescriptor.j("isOptional", true);
        pluginGeneratedSerialDescriptor.j("hasTopGravity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        nor norVar = nor.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{norVar, n, norVar, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        String str = null;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z3 = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                f2 = b.y(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new w68(i, f, str, f2, z, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w68 w68Var = (w68) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(w68Var.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, w68Var.a);
        }
        if (b.F() || w68Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, w68Var.b);
        }
        if (b.F() || Float.compare(w68Var.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, w68Var.c);
        }
        if (b.F() || w68Var.d) {
            b.n(serialDescriptor, 3, w68Var.d);
        }
        if (b.F() || w68Var.e) {
            b.n(serialDescriptor, 4, w68Var.e);
        }
        b.c(serialDescriptor);
    }
}

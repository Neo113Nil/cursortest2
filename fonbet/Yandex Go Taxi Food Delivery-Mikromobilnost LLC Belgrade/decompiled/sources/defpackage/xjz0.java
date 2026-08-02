package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class xjz0 implements uxs {
    public static final xjz0 a;
    private static final SerialDescriptor descriptor;

    static {
        xjz0 xjz0Var = new xjz0();
        a = xjz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.Toggle", xjz0Var, 3);
        pluginGeneratedSerialDescriptor.j("is_selected", true);
        pluginGeneratedSerialDescriptor.j("option_on", true);
        pluginGeneratedSerialDescriptor.j("option_off", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ekz0 ekz0Var = ekz0.a;
        return new KSerializer[]{z96.a, ekz0Var, ekz0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        gkz0 gkz0Var = null;
        gkz0 gkz0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                gkz0Var = (gkz0) b.A(serialDescriptor, 1, ekz0.a, gkz0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                gkz0Var2 = (gkz0) b.A(serialDescriptor, 2, ekz0.a, gkz0Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new akz0(i, z2, gkz0Var, gkz0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        akz0 akz0Var = (akz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || akz0Var.a) {
            b.n(serialDescriptor, 0, akz0Var.a);
        }
        if (b.F() || !jl40.l(akz0Var.b, new gkz0(0))) {
            b.e(serialDescriptor, 1, ekz0.a, akz0Var.b);
        }
        if (b.F() || !jl40.l(akz0Var.c, new gkz0(0))) {
            b.e(serialDescriptor, 2, ekz0.a, akz0Var.c);
        }
        b.c(serialDescriptor);
    }
}

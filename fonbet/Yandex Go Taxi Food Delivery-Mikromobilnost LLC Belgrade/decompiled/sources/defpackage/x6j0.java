package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class x6j0 implements uxs {
    public static final x6j0 a;
    private static final SerialDescriptor descriptor;

    static {
        x6j0 x6j0Var = new x6j0();
        a = x6j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.RequestHasBoundCardsInGooglePayParams", x6j0Var, 2);
        pluginGeneratedSerialDescriptor.j("networks", true);
        pluginGeneratedSerialDescriptor.j("tokenizedOnly", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) z6j0.c[0].getValue()), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = z6j0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new z6j0(i, bool, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z6j0 z6j0Var = (z6j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = z6j0.c;
        if (b.F() || z6j0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), z6j0Var.a);
        }
        if (b.F() || !jl40.l(z6j0Var.b, Boolean.TRUE)) {
            b.g(serialDescriptor, 1, z96.a, z6j0Var.b);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class w9s0 implements uxs {
    public static final w9s0 a;
    private static final SerialDescriptor descriptor;

    static {
        w9s0 w9s0Var = new w9s0();
        a = w9s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.source.ShownLimit", w9s0Var, 1);
        pluginGeneratedSerialDescriptor.j("bubbles_per_user", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y9s0.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y9s0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new y9s0(i, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y9s0 y9s0Var = (y9s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = y9s0.b;
        if (b.F() || !jl40.l(y9s0Var.a, new LinkedHashMap())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), y9s0Var.a);
        }
        b.c(serialDescriptor);
    }
}

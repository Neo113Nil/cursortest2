package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType;

/* loaded from: classes6.dex */
public final /* synthetic */ class wtw0 implements uxs {
    public static final wtw0 a;
    private static final SerialDescriptor descriptor;

    static {
        wtw0 wtw0Var = new wtw0();
        a = wtw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIcon", wtw0Var, 2);
        pluginGeneratedSerialDescriptor.j("tag", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) ytw0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ytw0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SurgeInfoTextBlockIconType surgeInfoTextBlockIconType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                surgeInfoTextBlockIconType = (SurgeInfoTextBlockIconType) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), surgeInfoTextBlockIconType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ytw0(i, str, surgeInfoTextBlockIconType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ytw0 ytw0Var = (ytw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ytw0.c;
        if (b.F() || !jl40.l(ytw0Var.a, "")) {
            b.o(serialDescriptor, 0, ytw0Var.a);
        }
        if (b.F() || ytw0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ytw0Var.b);
        }
        b.c(serialDescriptor);
    }
}

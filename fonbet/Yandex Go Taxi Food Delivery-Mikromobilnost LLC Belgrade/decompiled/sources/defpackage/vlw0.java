package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;

/* loaded from: classes9.dex */
public final /* synthetic */ class vlw0 implements uxs {
    public static final vlw0 a;
    private static final SerialDescriptor descriptor;

    static {
        vlw0 vlw0Var = new vlw0();
        a = vlw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.SupportedOption", vlw0Var, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bmw0.c[0].getValue(), qke.n(ylw0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bmw0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        SupportedOptionType supportedOptionType = null;
        amw0 amw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                supportedOptionType = (SupportedOptionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), supportedOptionType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                amw0Var = (amw0) b.s(serialDescriptor, 1, ylw0.a, amw0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new bmw0(i, supportedOptionType, amw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bmw0 bmw0Var = (bmw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) bmw0.c[0].getValue();
        SupportedOptionType supportedOptionType = bmw0Var.a;
        amw0 amw0Var = bmw0Var.b;
        b.e(serialDescriptor, 0, kSerializer, supportedOptionType);
        if (b.F() || amw0Var != null) {
            b.g(serialDescriptor, 1, ylw0.a, amw0Var);
        }
        b.c(serialDescriptor);
    }
}

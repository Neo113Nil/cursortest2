package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class sc61 implements uxs {
    public static final sc61 a;
    private static final SerialDescriptor descriptor;

    static {
        sc61 sc61Var = new sc61();
        a = sc61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.ZeroSuggestResponseV2", sc61Var, 1);
        pluginGeneratedSerialDescriptor.j("sections", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uc61.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uc61.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new uc61(i, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uc61 uc61Var = (uc61) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uc61.b;
        if (b.F() || !jl40.l(uc61Var.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), uc61Var.a);
        }
        b.c(serialDescriptor);
    }
}

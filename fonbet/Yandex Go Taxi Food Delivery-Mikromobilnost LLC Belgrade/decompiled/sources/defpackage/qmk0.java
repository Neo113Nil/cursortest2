package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final /* synthetic */ class qmk0 implements uxs {
    public static final qmk0 a;
    private static final SerialDescriptor descriptor;

    static {
        qmk0 qmk0Var = new qmk0();
        a = qmk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.RideCardRatingSelectorDecorationsExperiment", qmk0Var, 2);
        pluginGeneratedSerialDescriptor.j("background_glow_image", true);
        pluginGeneratedSerialDescriptor.j("rating_items_decoration_states", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c7v.a, smk0.d[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = smk0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        n7v n7vVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                n7vVar = (n7v) b.A(serialDescriptor, 0, c7v.a, n7vVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new smk0(i, n7vVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        smk0 smk0Var = (smk0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = smk0.d;
        if (b.F() || !jl40.l(smk0Var.b, n7v.f)) {
            b.e(serialDescriptor, 0, c7v.a, smk0Var.b);
        }
        if (b.F() || !jl40.l(smk0Var.c, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), smk0Var.c);
        }
        b.c(serialDescriptor);
    }
}

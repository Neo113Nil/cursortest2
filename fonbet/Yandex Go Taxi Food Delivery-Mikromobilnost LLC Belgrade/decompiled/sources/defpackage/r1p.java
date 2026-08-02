package defpackage;

import defpackage.t1p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class r1p implements uxs {
    public static final r1p a;
    private static final SerialDescriptor descriptor;

    static {
        r1p r1pVar = new r1p();
        a = r1pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.superapp.ExternalServiceFullScreenExperiment.ServiceFullScreenConfig", r1pVar, 3);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("provide_context", true);
        pluginGeneratedSerialDescriptor.j("is_url_path_coordinates_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new t1p.a(i, z2, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1p.a aVar = (t1p.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a) {
            b.n(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || aVar.b) {
            b.n(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || aVar.c) {
            b.n(serialDescriptor, 2, aVar.c);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class voz0 implements uxs {
    public static final voz0 a;
    private static final SerialDescriptor descriptor;

    static {
        voz0 voz0Var = new voz0();
        a = voz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.MultipleRoads", voz0Var, 2);
        pluginGeneratedSerialDescriptor.j("texts", true);
        pluginGeneratedSerialDescriptor.j("list_items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hpz0.a, toz0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        soz0.i iVar = null;
        soz0.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                iVar = (soz0.i) b.A(serialDescriptor, 0, hpz0.a, iVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bVar = (soz0.b) b.A(serialDescriptor, 1, toz0.a, bVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new soz0.c(i, iVar, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.c cVar = (soz0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, new soz0.i(0))) {
            b.e(serialDescriptor, 0, hpz0.a, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, new soz0.b(0))) {
            b.e(serialDescriptor, 1, toz0.a, cVar.b);
        }
        b.c(serialDescriptor);
    }
}

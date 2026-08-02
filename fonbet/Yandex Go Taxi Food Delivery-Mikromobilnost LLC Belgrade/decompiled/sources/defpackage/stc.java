package defpackage;

import defpackage.utc;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class stc implements uxs {
    public static final stc a;
    private static final SerialDescriptor descriptor;

    static {
        stc stcVar = new stc();
        a = stcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.CommunicationsParam.ApplicationState.ApplicationStateField", stcVar, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, b0t.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        zzs zzsVar = null;
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
                zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new utc.a.C0130a(i, zzsVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        utc.a.C0130a c0130a = (utc.a.C0130a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(c0130a.a, "")) {
            b.o(serialDescriptor, 0, c0130a.a);
        }
        if (b.F() || !jl40.l(c0130a.b, zzs.f)) {
            b.e(serialDescriptor, 1, b0t.a, c0130a.b);
        }
        b.c(serialDescriptor);
    }
}

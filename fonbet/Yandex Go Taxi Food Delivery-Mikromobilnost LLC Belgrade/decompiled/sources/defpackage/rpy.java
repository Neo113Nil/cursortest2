package defpackage;

import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class rpy implements uxs {
    public static final rpy a;
    private static final SerialDescriptor descriptor;

    static {
        rpy rpyVar = new rpy();
        a = rpyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.LinkedOrderTrackRequest", rpyVar, 3);
        pluginGeneratedSerialDescriptor.j("key", true);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(b0t.a), qke.n(ant.a)};
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
        Date date = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                date = (Date) b.s(serialDescriptor, 2, ant.a, date);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new tpy(i, str, zzsVar, date);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tpy tpyVar = (tpy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(tpyVar.a, "")) {
            b.o(serialDescriptor, 0, tpyVar.a);
        }
        if (b.F() || tpyVar.b != null) {
            b.g(serialDescriptor, 1, b0t.a, tpyVar.b);
        }
        if (b.F() || tpyVar.c != null) {
            b.g(serialDescriptor, 2, ant.a, tpyVar.c);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes9.dex */
public final /* synthetic */ class y7y implements uxs {
    public static final y7y a;
    private static final SerialDescriptor descriptor;

    static {
        y7y y7yVar = new y7y();
        a = y7yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.location.dto.LbsParams.GsmCell", y7yVar, 5);
        pluginGeneratedSerialDescriptor.j("countrycode", false);
        pluginGeneratedSerialDescriptor.j("operatorid", false);
        pluginGeneratedSerialDescriptor.j(StartupRequest.PARAM_CELLID, false);
        pluginGeneratedSerialDescriptor.j("lac", false);
        pluginGeneratedSerialDescriptor.j("signal_strength", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, pnz.a, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                j = b.f(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i4 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                i5 = b.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new a8y(i, j, i2, i3, i4, i5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a8y a8yVar = (a8y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.A(0, a8yVar.a, serialDescriptor);
        b.A(1, a8yVar.b, serialDescriptor);
        b.s(serialDescriptor, 2, a8yVar.c);
        b.A(3, a8yVar.d, serialDescriptor);
        b.A(4, a8yVar.e, serialDescriptor);
        b.c(serialDescriptor);
    }
}

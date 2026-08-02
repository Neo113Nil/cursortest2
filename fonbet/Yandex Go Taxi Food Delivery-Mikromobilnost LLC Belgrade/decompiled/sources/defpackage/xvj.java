package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class xvj implements uxs {
    public static final xvj a;
    private static final SerialDescriptor descriptor;

    static {
        xvj xvjVar = new xvj();
        a = xvjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.DiscoveryOpenTransportStopAction", xvjVar, 1);
        pluginGeneratedSerialDescriptor.j("stop_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{twj.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vwj vwjVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                vwjVar = (vwj) b.A(serialDescriptor, 0, twj.a, vwjVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new zvj(i, vwjVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zvj zvjVar = (zvj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(zvjVar.a, new vwj(0))) {
            b.e(serialDescriptor, 0, twj.a, zvjVar.a);
        }
        b.c(serialDescriptor);
    }
}

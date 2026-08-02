package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class qe1 implements uxs {
    public static final qe1 a;
    private static final SerialDescriptor descriptor;

    static {
        qe1 qe1Var = new qe1();
        a = qe1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.feed.advertisement.AdvertisementPixelBillingAction", qe1Var, 3);
        pluginGeneratedSerialDescriptor.j("impression", false);
        pluginGeneratedSerialDescriptor.j("sendYaCookies", false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(z96.a), qke.n((KSerializer) ue1.d[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ue1.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ue1(i, bool, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ue1 ue1Var = (ue1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ue1.d;
        b.o(serialDescriptor, 0, ue1Var.a);
        b.g(serialDescriptor, 1, z96.a, ue1Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ue1Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

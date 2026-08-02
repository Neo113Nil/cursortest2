package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes7.dex */
public final class qy61 implements uxs {
    public static final qy61 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        qy61 qy61Var = new qy61();
        a = qy61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", qy61Var, 4);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("tag", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{pnz.a, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b2.f(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = b2.k(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new x471(i, j, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x471 x471Var = (x471) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.s(pluginGeneratedSerialDescriptor, 0, x471Var.a);
        b2.o(pluginGeneratedSerialDescriptor, 1, x471Var.b);
        b2.o(pluginGeneratedSerialDescriptor, 2, x471Var.c);
        b2.o(pluginGeneratedSerialDescriptor, 3, x471Var.d);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

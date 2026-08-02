package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class tt50 implements uxs {
    public static final tt50 a;
    private static final SerialDescriptor descriptor;

    static {
        tt50 tt50Var = new tt50();
        a = tt50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkExperimentsResponseModel", tt50Var, 2);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ku50.a), qke.n(nt50.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        mu50 mu50Var = null;
        pt50 pt50Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mu50Var = (mu50) b.s(serialDescriptor, 0, ku50.a, mu50Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                pt50Var = (pt50) b.s(serialDescriptor, 1, nt50.a, pt50Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vt50(i, mu50Var, pt50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vt50 vt50Var = (vt50) obj;
        pt50 pt50Var = vt50Var.b;
        mu50 mu50Var = vt50Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || mu50Var != null) {
            b.g(serialDescriptor, 0, ku50.a, mu50Var);
        }
        if (b.F() || pt50Var != null) {
            b.g(serialDescriptor, 1, nt50.a, pt50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

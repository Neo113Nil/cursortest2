package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ylv implements uxs {
    public static final ylv a;
    private static final SerialDescriptor descriptor;

    static {
        ylv ylvVar = new ylv();
        a = ylvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CHANGE_OPTION_STATUS_RESPONSE", ylvVar, 6);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j("optionId", false);
        pluginGeneratedSerialDescriptor.j("currentStatus", false);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.DISABLED, false);
        pluginGeneratedSerialDescriptor.j("show", false);
        pluginGeneratedSerialDescriptor.j(ErrorResponseData.JSON_ERROR_MESSAGE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, auu0Var, qke.n(z96Var), z96Var, z96Var, qke.n(auu0Var)};
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
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new amv(i, str, str2, bool, z2, z3, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        amv amvVar = (amv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, amvVar.a);
        b.o(serialDescriptor, 1, amvVar.b);
        b.g(serialDescriptor, 2, z96.a, amvVar.c);
        b.n(serialDescriptor, 3, amvVar.d);
        b.n(serialDescriptor, 4, amvVar.e);
        b.g(serialDescriptor, 5, auu0Var, amvVar.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

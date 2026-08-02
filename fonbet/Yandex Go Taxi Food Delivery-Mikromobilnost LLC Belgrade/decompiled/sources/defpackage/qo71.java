package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class qo71 implements uxs {
    public static final qo71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        qo71 qo71Var = new qo71();
        a = qo71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", qo71Var, 4);
        pluginGeneratedSerialDescriptor.j("has_location_consent", false);
        pluginGeneratedSerialDescriptor.j("age_restricted_user", false);
        pluginGeneratedSerialDescriptor.j("has_user_consent", false);
        pluginGeneratedSerialDescriptor.j("has_cmp_value", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, qke.n(z96Var), qke.n(z96Var), z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b2.C(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b2.s(pluginGeneratedSerialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else if (v == 2) {
                bool2 = (Boolean) b2.s(pluginGeneratedSerialDescriptor, 2, z96.a, bool2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z3 = b2.C(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new ru71(i, z2, bool, bool2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ru71 ru71Var = (ru71) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.n(pluginGeneratedSerialDescriptor, 0, ru71Var.a);
        z96 z96Var = z96.a;
        b2.g(pluginGeneratedSerialDescriptor, 1, z96Var, ru71Var.b);
        b2.g(pluginGeneratedSerialDescriptor, 2, z96Var, ru71Var.c);
        b2.n(pluginGeneratedSerialDescriptor, 3, ru71Var.d);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

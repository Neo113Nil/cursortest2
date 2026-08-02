package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes7.dex */
public final class w271 implements uxs {
    public static final w271 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        w271 w271Var = new w271();
        a = w271Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", w271Var, 4);
        pluginGeneratedSerialDescriptor.j(CommonUrlParts.APP_ID, false);
        pluginGeneratedSerialDescriptor.j(StartupRequest.PARAM_APP_VERSION, false);
        pluginGeneratedSerialDescriptor.j("system", false);
        pluginGeneratedSerialDescriptor.j("api_level", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b2.k(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b2.k(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = b2.k(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new b971(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b971 b971Var = (b971) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.o(pluginGeneratedSerialDescriptor, 0, b971Var.a);
        b2.o(pluginGeneratedSerialDescriptor, 1, b971Var.b);
        b2.o(pluginGeneratedSerialDescriptor, 2, b971Var.c);
        b2.o(pluginGeneratedSerialDescriptor, 3, b971Var.d);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class tl71 implements uxs {
    public static final tl71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        tl71 tl71Var = new tl71();
        a = tl71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", tl71Var, 6);
        pluginGeneratedSerialDescriptor.j("adapter", true);
        pluginGeneratedSerialDescriptor.j("network_name", false);
        pluginGeneratedSerialDescriptor.j("waterfall_parameters", false);
        pluginGeneratedSerialDescriptor.j("network_ad_unit_id_name", true);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("cpm_floors", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = sx71.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(fm71.a), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = sx71.g;
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        as71 as71Var = null;
        List list2 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b2.s(pluginGeneratedSerialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b2.A(pluginGeneratedSerialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b2.s(pluginGeneratedSerialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    as71Var = (as71) b2.s(pluginGeneratedSerialDescriptor, 4, fm71.a, as71Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b2.A(pluginGeneratedSerialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new sx71(i, str, str2, list, str3, as71Var, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sx71 sx71Var = (sx71) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = sx71.g;
        if (b2.F() || sx71Var.a != null) {
            b2.g(pluginGeneratedSerialDescriptor, 0, auu0.a, sx71Var.a);
        }
        String str = sx71Var.b;
        String str2 = sx71Var.d;
        b2.o(pluginGeneratedSerialDescriptor, 1, str);
        b2.e(pluginGeneratedSerialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), sx71Var.c);
        if (b2.F() || str2 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, auu0.a, str2);
        }
        b2.g(pluginGeneratedSerialDescriptor, 4, fm71.a, sx71Var.e);
        b2.e(pluginGeneratedSerialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), sx71Var.f);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

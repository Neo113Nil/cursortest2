package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class vh61 implements uxs {
    public static final vh61 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        vh61 vh61Var = new vh61();
        a = vh61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", vh61Var, 5);
        pluginGeneratedSerialDescriptor.j("adapter", false);
        pluginGeneratedSerialDescriptor.j("network_winner", false);
        pluginGeneratedSerialDescriptor.j("revenue", false);
        pluginGeneratedSerialDescriptor.j(TarifficatorScenarioActivity.RESULT_KEY, false);
        pluginGeneratedSerialDescriptor.j("network_ad_info", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(eg71.a), qke.n(p191.a), zb81.a, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        nm71 nm71Var = null;
        em61 em61Var = null;
        ql81 ql81Var = null;
        String str2 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b2.k(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                nm71Var = (nm71) b2.s(pluginGeneratedSerialDescriptor, 1, eg71.a, nm71Var);
                i |= 2;
            } else if (v == 2) {
                em61Var = (em61) b2.s(pluginGeneratedSerialDescriptor, 2, p191.a, em61Var);
                i |= 4;
            } else if (v == 3) {
                ql81Var = (ql81) b2.A(pluginGeneratedSerialDescriptor, 3, zb81.a, ql81Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b2.s(pluginGeneratedSerialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new np61(i, str, nm71Var, em61Var, ql81Var, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        np61 np61Var = (np61) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.o(pluginGeneratedSerialDescriptor, 0, np61Var.a);
        b2.g(pluginGeneratedSerialDescriptor, 1, eg71.a, np61Var.b);
        b2.g(pluginGeneratedSerialDescriptor, 2, p191.a, np61Var.c);
        b2.e(pluginGeneratedSerialDescriptor, 3, zb81.a, np61Var.d);
        b2.g(pluginGeneratedSerialDescriptor, 4, auu0.a, np61Var.e);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

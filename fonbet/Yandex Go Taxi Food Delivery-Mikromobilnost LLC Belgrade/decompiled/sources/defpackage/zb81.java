package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.yf2;

/* loaded from: classes7.dex */
public final class zb81 implements uxs {
    public static final zb81 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        zb81 zb81Var = new zb81();
        a = zb81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", zb81Var, 3);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("error_message", false);
        pluginGeneratedSerialDescriptor.j("status_code", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ql81.d[0].getValue(), qke.n(auu0.a), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = ql81.d;
        b2.getClass();
        boolean z = true;
        int i = 0;
        yf2 yf2Var = null;
        String str = null;
        Integer num = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                yf2Var = (yf2) b2.A(pluginGeneratedSerialDescriptor, 0, (myi) i3yVarArr[0].getValue(), yf2Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b2.s(pluginGeneratedSerialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b2.s(pluginGeneratedSerialDescriptor, 2, h6w.a, num);
                i |= 4;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new ql81(i, yf2Var, str, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ql81 ql81Var = (ql81) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.e(pluginGeneratedSerialDescriptor, 0, (KSerializer) ql81.d[0].getValue(), ql81Var.a);
        b2.g(pluginGeneratedSerialDescriptor, 1, auu0.a, ql81Var.b);
        b2.g(pluginGeneratedSerialDescriptor, 2, h6w.a, ql81Var.c);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

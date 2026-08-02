package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import yads.qr1;

/* loaded from: classes7.dex */
public final class tw71 implements uxs {
    public static final tw71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        tw71 tw71Var = new tw71();
        a = tw71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", tw71Var, 2);
        pluginGeneratedSerialDescriptor.j("load_timeout_millis", true);
        pluginGeneratedSerialDescriptor.j("mediation_prefetch_ad_units", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, qr1.d[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = qr1.d;
        b2.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b2.f(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b2.A(pluginGeneratedSerialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new qr1(i, j, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qr1 qr1Var = (qr1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = qr1.d;
        if (b2.F() || qr1Var.b != 30000) {
            b2.s(pluginGeneratedSerialDescriptor, 0, qr1Var.b);
        }
        if (b2.F() || !jl40.l(qr1Var.c, EmptyList.a)) {
            b2.e(pluginGeneratedSerialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qr1Var.c);
        }
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

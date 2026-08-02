package defpackage;

import com.yandex.plus.pay.repository.api.model.widget.WebPaymentWidgetTimeoutParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class zi41 implements uxs {
    public static final zi41 a;
    private static final SerialDescriptor descriptor;

    static {
        zi41 zi41Var = new zi41();
        a = zi41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.repository.api.model.widget.WebPaymentWidgetTimeoutParams", zi41Var, 2);
        pluginGeneratedSerialDescriptor.j("loadMessageTimeoutMillis", false);
        pluginGeneratedSerialDescriptor.j("startMessageTimeoutMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{qke.n(pnzVar), qke.n(pnzVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                l2 = (Long) b.s(serialDescriptor, 1, pnz.a, l2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new WebPaymentWidgetTimeoutParams(i, l, l2, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        WebPaymentWidgetTimeoutParams.write$Self$pay_sdk_domain_repository_api_release((WebPaymentWidgetTimeoutParams) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

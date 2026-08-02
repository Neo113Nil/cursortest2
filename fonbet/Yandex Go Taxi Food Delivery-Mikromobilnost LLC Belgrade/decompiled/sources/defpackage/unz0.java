package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class unz0 implements uxs {
    public static final unz0 a;
    private static final SerialDescriptor descriptor;

    static {
        unz0 unz0Var = new unz0();
        a = unz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.request.TokenizeRequestDto", unz0Var, 3);
        pluginGeneratedSerialDescriptor.j("context", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, false);
        pluginGeneratedSerialDescriptor.j("method", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mdx.a, onz0.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        c cVar = null;
        qnz0 qnz0Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (c) b.A(serialDescriptor, 0, mdx.a, cVar);
                i |= 1;
            } else if (v == 1) {
                qnz0Var = (qnz0) b.A(serialDescriptor, 1, onz0.a, qnz0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wnz0(i, cVar, qnz0Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wnz0 wnz0Var = (wnz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, mdx.a, wnz0Var.a);
        b.e(serialDescriptor, 1, onz0.a, wnz0Var.b);
        b.o(serialDescriptor, 2, wnz0Var.c);
        b.c(serialDescriptor);
    }
}

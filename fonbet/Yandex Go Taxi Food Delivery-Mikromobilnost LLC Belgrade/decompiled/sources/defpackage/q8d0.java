package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class q8d0 implements uxs {
    public static final q8d0 a;
    private static final SerialDescriptor descriptor;

    static {
        q8d0 q8d0Var = new q8d0();
        a = q8d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferDto", q8d0Var, 5);
        pluginGeneratedSerialDescriptor.j("positionId", false);
        pluginGeneratedSerialDescriptor.j("forActiveTariff", true);
        pluginGeneratedSerialDescriptor.j("tariffOffer", true);
        pluginGeneratedSerialDescriptor.j("optionOffers", true);
        pluginGeneratedSerialDescriptor.j("asset", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(k8d0.a), qke.n(y9d0.a), s8d0.f[3].getValue(), n8d0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = s8d0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        m8d0 m8d0Var = null;
        aad0 aad0Var = null;
        List list = null;
        p8d0 p8d0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                m8d0Var = (m8d0) b.s(serialDescriptor, 1, k8d0.a, m8d0Var);
                i |= 2;
            } else if (v == 2) {
                aad0Var = (aad0) b.s(serialDescriptor, 2, y9d0.a, aad0Var);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                p8d0Var = (p8d0) b.A(serialDescriptor, 4, n8d0.a, p8d0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new s8d0(i, str, m8d0Var, aad0Var, list, p8d0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s8d0 s8d0Var = (s8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = s8d0.f;
        String str = s8d0Var.a;
        List list = s8d0Var.d;
        aad0 aad0Var = s8d0Var.c;
        m8d0 m8d0Var = s8d0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || m8d0Var != null) {
            b.g(serialDescriptor, 1, k8d0.a, m8d0Var);
        }
        if (b.F() || aad0Var != null) {
            b.g(serialDescriptor, 2, y9d0.a, aad0Var);
        }
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list);
        }
        b.e(serialDescriptor, 4, n8d0.a, s8d0Var.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

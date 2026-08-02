package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class wze implements uxs {
    public static final wze a;
    private static final SerialDescriptor descriptor;

    static {
        wze wzeVar = new wze();
        a = wzeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.CounterOffersDto", wzeVar, 8);
        pluginGeneratedSerialDescriptor.j("eventSessionId", false);
        pluginGeneratedSerialDescriptor.j("batchId", false);
        pluginGeneratedSerialDescriptor.j("counterOfferTarget", false);
        pluginGeneratedSerialDescriptor.j("errorTitle", true);
        pluginGeneratedSerialDescriptor.j("errorSubtitle", true);
        pluginGeneratedSerialDescriptor.j("offers", false);
        pluginGeneratedSerialDescriptor.j("alternativeActionTitle", true);
        pluginGeneratedSerialDescriptor.j("supportTitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b0f.i;
        auu0 auu0Var = auu0.a;
        k3k0 k3k0Var = k3k0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(k3k0Var), qke.n(k3k0Var), i3yVarArr[5].getValue(), qke.n(k3k0Var), qke.n(k3k0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0f.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        q3k0 q3k0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        q3k0 q3k0Var2 = null;
        q3k0 q3k0Var3 = null;
        List list = null;
        q3k0 q3k0Var4 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    q3k0Var2 = (q3k0) b.s(serialDescriptor, 3, k3k0.a, q3k0Var2);
                    i |= 8;
                    break;
                case 4:
                    q3k0Var3 = (q3k0) b.s(serialDescriptor, 4, k3k0.a, q3k0Var3);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    q3k0Var4 = (q3k0) b.s(serialDescriptor, 6, k3k0.a, q3k0Var4);
                    i |= 64;
                    break;
                case 7:
                    q3k0Var = (q3k0) b.s(serialDescriptor, 7, k3k0.a, q3k0Var);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new b0f(i, str, str2, str3, q3k0Var2, q3k0Var3, list, q3k0Var4, q3k0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b0f b0fVar = (b0f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0f.i;
        String str = b0fVar.a;
        q3k0 q3k0Var = b0fVar.h;
        q3k0 q3k0Var2 = b0fVar.g;
        q3k0 q3k0Var3 = b0fVar.e;
        q3k0 q3k0Var4 = b0fVar.d;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, b0fVar.b);
        b.o(serialDescriptor, 2, b0fVar.c);
        if (b.F() || q3k0Var4 != null) {
            b.g(serialDescriptor, 3, k3k0.a, q3k0Var4);
        }
        if (b.F() || q3k0Var3 != null) {
            b.g(serialDescriptor, 4, k3k0.a, q3k0Var3);
        }
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), b0fVar.f);
        if (b.F() || q3k0Var2 != null) {
            b.g(serialDescriptor, 6, k3k0.a, q3k0Var2);
        }
        if (b.F() || q3k0Var != null) {
            b.g(serialDescriptor, 7, k3k0.a, q3k0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

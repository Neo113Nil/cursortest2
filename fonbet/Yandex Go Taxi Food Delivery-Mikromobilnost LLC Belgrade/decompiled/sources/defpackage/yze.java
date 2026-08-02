package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class yze implements uxs {
    public static final yze a;
    private static final SerialDescriptor descriptor;

    static {
        yze yzeVar = new yze();
        a = yzeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.CounterOffersDto.CounterOffer", yzeVar, 6);
        pluginGeneratedSerialDescriptor.j("offer", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("benefits", false);
        pluginGeneratedSerialDescriptor.j("buttonText", false);
        pluginGeneratedSerialDescriptor.j("additionalButtonText", true);
        pluginGeneratedSerialDescriptor.j("icon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = a0f.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{tnd.a, k3k0.a, i3yVarArr[2].getValue(), auu0Var, qke.n(auu0Var), m9v.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a0f.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        spd spdVar = null;
        q3k0 q3k0Var = null;
        List list = null;
        String str = null;
        String str2 = null;
        q9v q9vVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    spdVar = (spd) b.A(serialDescriptor, 0, tnd.a, spdVar);
                    i |= 1;
                    break;
                case 1:
                    q3k0Var = (q3k0) b.A(serialDescriptor, 1, k3k0.a, q3k0Var);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    q9vVar = (q9v) b.A(serialDescriptor, 5, m9v.a, q9vVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new a0f(i, spdVar, q3k0Var, list, str, str2, q9vVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a0f a0fVar = (a0f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = a0f.g;
        tnd tndVar = tnd.a;
        spd spdVar = a0fVar.a;
        String str = a0fVar.e;
        b.e(serialDescriptor, 0, tndVar, spdVar);
        b.e(serialDescriptor, 1, k3k0.a, a0fVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), a0fVar.c);
        b.o(serialDescriptor, 3, a0fVar.d);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 4, auu0.a, str);
        }
        b.e(serialDescriptor, 5, m9v.a, a0fVar.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

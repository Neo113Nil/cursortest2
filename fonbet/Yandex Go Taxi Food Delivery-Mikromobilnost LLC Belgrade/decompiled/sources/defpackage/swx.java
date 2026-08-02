package defpackage;

import com.adjust.sdk.Constants;
import defpackage.owx;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class swx implements uxs {
    public static final swx a;
    private static final SerialDescriptor descriptor;

    static {
        swx swxVar = new swx();
        a = swxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.response.LaunchResponse.FamilyInvite", swxVar, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("family_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(auu0Var), auu0Var, qke.n(qwx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        owx.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
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
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    bVar = (owx.b) b.s(serialDescriptor, 5, qwx.a, bVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new owx.c(i, str, str2, str3, str4, str5, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        owx.c cVar = (owx.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, "")) {
            b.o(serialDescriptor, 1, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, "")) {
            b.o(serialDescriptor, 2, cVar.c);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cVar.d);
        }
        if (b.F() || !jl40.l(cVar.e, "")) {
            b.o(serialDescriptor, 4, cVar.e);
        }
        if (b.F() || cVar.f != null) {
            b.g(serialDescriptor, 5, qwx.a, cVar.f);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class s7v0 implements uxs {
    public static final s7v0 a;
    private static final SerialDescriptor descriptor;

    static {
        s7v0 s7v0Var = new s7v0();
        a = s7v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.suggest.SuggestResponse", s7v0Var, 6);
        pluginGeneratedSerialDescriptor.j("part", true);
        pluginGeneratedSerialDescriptor.j("results", true);
        pluginGeneratedSerialDescriptor.j("client_reqid", true);
        pluginGeneratedSerialDescriptor.j("additional_info", true);
        pluginGeneratedSerialDescriptor.j("additional_items", true);
        pluginGeneratedSerialDescriptor.j("suggest_provider", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = u7v0.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(rl0.a), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = u7v0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        ul0 ul0Var = null;
        List list2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    ul0Var = (ul0) b.s(serialDescriptor, 3, rl0.a, ul0Var);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new u7v0(i, str, list, str2, ul0Var, list2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u7v0 u7v0Var = (u7v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = u7v0.g;
        if (b.F() || u7v0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, u7v0Var.a);
        }
        if (b.F() || u7v0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), u7v0Var.b);
        }
        if (b.F() || u7v0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, u7v0Var.c);
        }
        if (b.F() || u7v0Var.d != null) {
            b.g(serialDescriptor, 3, rl0.a, u7v0Var.d);
        }
        if (b.F() || u7v0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), u7v0Var.e);
        }
        if (b.F() || u7v0Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, u7v0Var.f);
        }
        b.c(serialDescriptor);
    }
}

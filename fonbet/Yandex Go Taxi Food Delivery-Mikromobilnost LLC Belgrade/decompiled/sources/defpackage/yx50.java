package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class yx50 implements uxs {
    public static final yx50 a;
    private static final SerialDescriptor descriptor;

    static {
        yx50 yx50Var = new yx50();
        a = yx50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkPlaqueDefinitionsModel", yx50Var, 5);
        pluginGeneratedSerialDescriptor.j("defaultPlaque", false);
        pluginGeneratedSerialDescriptor.j("widgets", false);
        pluginGeneratedSerialDescriptor.j("prefetchPlaque", true);
        pluginGeneratedSerialDescriptor.j("fallbackPlaque", true);
        pluginGeneratedSerialDescriptor.j("conditionalPlaques", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ay50.f;
        m060 m060Var = m060.a;
        return new KSerializer[]{m060Var, i3yVarArr[1].getValue(), qke.n(m060Var), qke.n(m060Var), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ay50.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        o060 o060Var = null;
        List list = null;
        o060 o060Var2 = null;
        o060 o060Var3 = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                o060Var = (o060) b.A(serialDescriptor, 0, m060.a, o060Var);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                o060Var2 = (o060) b.s(serialDescriptor, 2, m060.a, o060Var2);
                i |= 4;
            } else if (v == 3) {
                o060Var3 = (o060) b.s(serialDescriptor, 3, m060.a, o060Var3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ay50(i, o060Var, list, o060Var2, o060Var3, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ay50 ay50Var = (ay50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ay50.f;
        m060 m060Var = m060.a;
        o060 o060Var = ay50Var.a;
        List list = ay50Var.e;
        o060 o060Var2 = ay50Var.d;
        o060 o060Var3 = ay50Var.c;
        b.e(serialDescriptor, 0, m060Var, o060Var);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ay50Var.b);
        if (b.F() || o060Var3 != null) {
            b.g(serialDescriptor, 2, m060Var, o060Var3);
        }
        if (b.F() || o060Var2 != null) {
            b.g(serialDescriptor, 3, m060Var, o060Var2);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

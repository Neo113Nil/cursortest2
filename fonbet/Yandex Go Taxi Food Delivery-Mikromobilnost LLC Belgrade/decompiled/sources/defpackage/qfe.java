package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class qfe implements uxs {
    public static final qfe a;
    private static final SerialDescriptor descriptor;

    static {
        qfe qfeVar = new qfe();
        a = qfeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ContentDescriptionDto", qfeVar, 4);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("templates", false);
        pluginGeneratedSerialDescriptor.j("actionText", false);
        pluginGeneratedSerialDescriptor.j("accessibilityEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = sfe.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = sfe.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new sfe(i, bool, str, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sfe sfeVar = (sfe) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = sfe.e;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, sfeVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), sfeVar.b);
        b.g(serialDescriptor, 2, auu0Var, sfeVar.c);
        b.g(serialDescriptor, 3, z96.a, sfeVar.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class x8r implements uxs {
    public static final x8r a;
    private static final SerialDescriptor descriptor;

    static {
        x8r x8rVar = new x8r();
        a = x8rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.fingerprint.FingerprintGnss", x8rVar, 4);
        pluginGeneratedSerialDescriptor.j("clock", true);
        pluginGeneratedSerialDescriptor.j("measurements", true);
        pluginGeneratedSerialDescriptor.j("satellites", true);
        pluginGeneratedSerialDescriptor.j("is_spoofed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = z8r.e;
        return new KSerializer[]{qke.n(zkt.a), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = z8r.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        blt bltVar = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bltVar = (blt) b.s(serialDescriptor, 0, zkt.a, bltVar);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
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
        return new z8r(i, bltVar, list, list2, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z8r z8rVar = (z8r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = z8r.e;
        if (b.F() || z8rVar.a != null) {
            b.g(serialDescriptor, 0, zkt.a, z8rVar.a);
        }
        if (b.F() || z8rVar.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), z8rVar.b);
        }
        if (b.F() || z8rVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), z8rVar.c);
        }
        if (b.F() || z8rVar.d != null) {
            b.g(serialDescriptor, 3, z96.a, z8rVar.d);
        }
        b.c(serialDescriptor);
    }
}

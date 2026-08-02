package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class zru implements uxs {
    public static final zru a;
    private static final SerialDescriptor descriptor;

    static {
        zru zruVar = new zru();
        a = zruVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.redirect.response.HostAppDto", zruVar, 5);
        pluginGeneratedSerialDescriptor.j("fingerprints", false);
        pluginGeneratedSerialDescriptor.j("min_am_sdk_version", false);
        pluginGeneratedSerialDescriptor.j("min_pay_sdk_version", false);
        pluginGeneratedSerialDescriptor.j("package_name", false);
        pluginGeneratedSerialDescriptor.j("strategy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{bsu.f[0].getValue(), h6wVar, h6wVar, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bsu.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new bsu(i, list, i2, i3, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bsu bsuVar = (bsu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) bsu.f[0].getValue(), bsuVar.a);
        b.A(1, bsuVar.b, serialDescriptor);
        b.A(2, bsuVar.c, serialDescriptor);
        b.o(serialDescriptor, 3, bsuVar.d);
        b.o(serialDescriptor, 4, bsuVar.e);
        b.c(serialDescriptor);
    }
}

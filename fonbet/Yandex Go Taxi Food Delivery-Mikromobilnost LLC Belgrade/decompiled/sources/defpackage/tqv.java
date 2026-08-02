package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class tqv implements uxs {
    public static final tqv a;
    private static final SerialDescriptor descriptor;

    static {
        tqv tqvVar = new tqv();
        a = tqvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.IndentDto", tqvVar, 4);
        pluginGeneratedSerialDescriptor.j("indentLeft", false);
        pluginGeneratedSerialDescriptor.j("indentRight", false);
        pluginGeneratedSerialDescriptor.j("indentTop", false);
        pluginGeneratedSerialDescriptor.j("indentBottom", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i5 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vqv(i, i2, i3, i4, i5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vqv vqvVar = (vqv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.A(0, vqvVar.a, serialDescriptor);
        b.A(1, vqvVar.b, serialDescriptor);
        b.A(2, vqvVar.c, serialDescriptor);
        b.A(3, vqvVar.d, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

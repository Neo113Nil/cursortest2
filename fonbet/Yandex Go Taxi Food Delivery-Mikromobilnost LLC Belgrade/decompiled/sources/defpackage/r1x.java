package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class r1x implements uxs {
    public static final r1x a;
    private static final SerialDescriptor descriptor;

    static {
        r1x r1xVar = new r1x();
        a = r1xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ItemDto.Image", r1xVar, 6);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("metaColor", false);
        pluginGeneratedSerialDescriptor.j("verticalAlignment", false);
        pluginGeneratedSerialDescriptor.j("imageTag", false);
        pluginGeneratedSerialDescriptor.j("width", false);
        pluginGeneratedSerialDescriptor.j("height", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, n3, auu0Var, qke.n(h6wVar), qke.n(h6wVar)};
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
        Integer num = null;
        Integer num2 = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) b.s(serialDescriptor, 5, h6w.a, num2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new t1x(i, str, str2, str3, str4, num, num2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1x t1xVar = (t1x) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, t1xVar.a);
        b.g(serialDescriptor, 1, auu0Var, t1xVar.b);
        b.g(serialDescriptor, 2, auu0Var, t1xVar.c);
        b.o(serialDescriptor, 3, t1xVar.d);
        h6w h6wVar = h6w.a;
        b.g(serialDescriptor, 4, h6wVar, t1xVar.e);
        b.g(serialDescriptor, 5, h6wVar, t1xVar.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

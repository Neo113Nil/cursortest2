package defpackage;

import defpackage.xpo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class vpo implements uxs {
    public static final vpo a;
    private static final SerialDescriptor descriptor;

    static {
        vpo vpoVar = new vpo();
        a = vpoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.suggested.destinations.ExpectedDestinations.ScreenOptions", vpoVar, 2);
        pluginGeneratedSerialDescriptor.j("mainscreen_results", true);
        pluginGeneratedSerialDescriptor.j("summary_results", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new xpo.a(i, i2, i3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xpo.a aVar = (xpo.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != 0) {
            b.A(0, aVar.a, serialDescriptor);
        }
        if (b.F() || aVar.b != 0) {
            b.A(1, aVar.b, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}

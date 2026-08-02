package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class uyx implements uxs {
    public static final uyx a;
    private static final SerialDescriptor descriptor;

    static {
        uyx uyxVar = new uyx();
        a = uyxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.LayersParams", uyxVar, 3);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("context", true);
        pluginGeneratedSerialDescriptor.j("known_versions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wyx.d;
        rcx rcxVar = rcx.a;
        return new KSerializer[]{rcxVar, qke.n(rcxVar), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wyx.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        b bVar = null;
        b bVar2 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (b) b.A(serialDescriptor, 0, rcx.a, bVar);
                i |= 1;
            } else if (v == 1) {
                bVar2 = (b) b.s(serialDescriptor, 1, rcx.a, bVar2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wyx(i, bVar, bVar2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wyx wyxVar = (wyx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wyx.d;
        rcx rcxVar = rcx.a;
        b bVar = wyxVar.a;
        Map map = wyxVar.c;
        b bVar2 = wyxVar.b;
        b.e(serialDescriptor, 0, rcxVar, bVar);
        if (b.F() || bVar2 != null) {
            b.g(serialDescriptor, 1, rcxVar, bVar2);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), map);
        }
        b.c(serialDescriptor);
    }
}

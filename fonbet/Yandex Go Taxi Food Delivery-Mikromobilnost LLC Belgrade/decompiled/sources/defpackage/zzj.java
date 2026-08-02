package defpackage;

import defpackage.f0k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzj implements uxs {
    public static final zzj a;
    private static final SerialDescriptor descriptor;

    static {
        zzj zzjVar = new zzj();
        a = zzjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.DisplaySettings.Extra", zzjVar, 4);
        pluginGeneratedSerialDescriptor.j("block_direct_pixel_show_urls", true);
        pluginGeneratedSerialDescriptor.j("yclid", true);
        pluginGeneratedSerialDescriptor.j("banner_id", true);
        pluginGeneratedSerialDescriptor.j("advert_poi_analytics_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{f0k.a.e[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(a0k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f0k.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        f0k.a.C0095a c0095a = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                c0095a = (f0k.a.C0095a) b.s(serialDescriptor, 3, a0k.a, c0095a);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new f0k.a(i, list, str, str2, c0095a);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0k.a aVar = (f0k.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f0k.a.e;
        if (b.F() || !jl40.l(aVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, a0k.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}

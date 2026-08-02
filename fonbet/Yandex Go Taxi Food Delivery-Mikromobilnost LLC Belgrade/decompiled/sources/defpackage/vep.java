package defpackage;

import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.FavoriteAddressRequest$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class vep implements uxs {
    public static final vep a;
    private static final SerialDescriptor descriptor;

    static {
        vep vepVar = new vep();
        a = vepVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.dto.FavoriteAddressUpdate.Request", vepVar, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("userplace", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(h6w.a), qke.n(FavoriteAddressRequest$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        FavoriteAddressRequest favoriteAddressRequest = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                favoriteAddressRequest = (FavoriteAddressRequest) b.s(serialDescriptor, 2, FavoriteAddressRequest$$serializer.INSTANCE, favoriteAddressRequest);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xep(i, str, num, favoriteAddressRequest);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xep xepVar = (xep) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || xepVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, xepVar.a);
        }
        if (b.F() || xepVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, xepVar.b);
        }
        if (b.F() || xepVar.c != null) {
            b.g(serialDescriptor, 2, FavoriteAddressRequest$$serializer.INSTANCE, xepVar.c);
        }
        b.c(serialDescriptor);
    }
}

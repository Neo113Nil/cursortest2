package defpackage;

import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.FavoriteAddressRequest$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class qcp implements uxs {
    public static final qcp a;
    private static final SerialDescriptor descriptor;

    static {
        qcp qcpVar = new qcp();
        a = qcpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.dto.FavoriteAddressCreate.Request", qcpVar, 1);
        pluginGeneratedSerialDescriptor.j("userplace", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(FavoriteAddressRequest$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FavoriteAddressRequest favoriteAddressRequest = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                favoriteAddressRequest = (FavoriteAddressRequest) b.s(serialDescriptor, 0, FavoriteAddressRequest$$serializer.INSTANCE, favoriteAddressRequest);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new scp(i, favoriteAddressRequest);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        scp scpVar = (scp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || scpVar.a != null) {
            b.g(serialDescriptor, 0, FavoriteAddressRequest$$serializer.INSTANCE, scpVar.a);
        }
        b.c(serialDescriptor);
    }
}

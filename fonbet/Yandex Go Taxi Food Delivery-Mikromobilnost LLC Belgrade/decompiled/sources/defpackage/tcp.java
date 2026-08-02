package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddress$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class tcp implements uxs {
    public static final tcp a;
    private static final SerialDescriptor descriptor;

    static {
        tcp tcpVar = new tcp();
        a = tcpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.dto.FavoriteAddressCreate.Response", tcpVar, 1);
        pluginGeneratedSerialDescriptor.j("userplace", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{FavoriteAddress$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FavoriteAddress favoriteAddress = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                favoriteAddress = (FavoriteAddress) b.A(serialDescriptor, 0, FavoriteAddress$$serializer.INSTANCE, favoriteAddress);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new vcp(i, favoriteAddress);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (defpackage.jl40.l(r0.a, new com.yandex.go.address.models.FavoriteAddress(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303)) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        vcp vcpVar = (vcp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
        }
        b.e(serialDescriptor, 0, FavoriteAddress$$serializer.INSTANCE, vcpVar.a);
        b.c(serialDescriptor);
    }
}

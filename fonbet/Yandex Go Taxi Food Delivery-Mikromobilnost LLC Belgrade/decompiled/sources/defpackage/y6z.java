package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;

/* loaded from: classes5.dex */
public final /* synthetic */ class y6z implements uxs {
    public static final y6z a;
    private static final SerialDescriptor descriptor;

    static {
        y6z y6zVar = new y6z();
        a = y6zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.LocationAvailabilityResponse", y6zVar, 1);
        pluginGeneratedSerialDescriptor.j("locationStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7z.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a7z.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        LocationAvailabilityStatus locationAvailabilityStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                locationAvailabilityStatus = (LocationAvailabilityStatus) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), locationAvailabilityStatus);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new a7z(i, locationAvailabilityStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) a7z.b[0].getValue(), ((a7z) obj).a);
        b.c(serialDescriptor);
    }
}

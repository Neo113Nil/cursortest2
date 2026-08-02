package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public final /* synthetic */ class qu90 implements uxs {
    public static final qu90 a;
    private static final SerialDescriptor descriptor;

    static {
        qu90 qu90Var = new qu90();
        a = qu90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Payload.Default", qu90Var, 1);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{su90.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = su90.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersErrorCode scootersErrorCode = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                scootersErrorCode = (ScootersErrorCode) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), scootersErrorCode);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new su90(i, scootersErrorCode);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) su90.b[0].getValue(), ((su90) obj).a);
        b.c(serialDescriptor);
    }
}

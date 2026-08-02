package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;

/* loaded from: classes5.dex */
public final /* synthetic */ class u731 implements uxs {
    public static final u731 a;
    private static final SerialDescriptor descriptor;

    static {
        u731 u731Var = new u731();
        a = u731Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sdkError", u731Var, 1);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w731.c[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = w731.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        SdkErrorCode sdkErrorCode = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                sdkErrorCode = (SdkErrorCode) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), sdkErrorCode);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new w731(i, sdkErrorCode);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) w731.c[0].getValue(), ((w731) obj).b);
        b.c(serialDescriptor);
    }
}

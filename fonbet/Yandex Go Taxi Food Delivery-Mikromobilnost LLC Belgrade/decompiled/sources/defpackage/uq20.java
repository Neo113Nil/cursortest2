package defpackage;

import com.yandex.mob.params.MobRemoteNotificationStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final /* synthetic */ class uq20 implements uxs {
    public static final uq20 a;
    private static final SerialDescriptor descriptor;

    static {
        uq20 uq20Var = new uq20();
        a = uq20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.params.MobRemoteNotificationNotifyParams", uq20Var, 3);
        pluginGeneratedSerialDescriptor.j("push_id", false);
        pluginGeneratedSerialDescriptor.j("client_dttm", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wq20.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wq20.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        MobRemoteNotificationStatus mobRemoteNotificationStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                mobRemoteNotificationStatus = (MobRemoteNotificationStatus) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), mobRemoteNotificationStatus);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wq20(i, str, str2, mobRemoteNotificationStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wq20 wq20Var = (wq20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wq20.d;
        b.o(serialDescriptor, 0, wq20Var.a);
        b.o(serialDescriptor, 1, wq20Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), wq20Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

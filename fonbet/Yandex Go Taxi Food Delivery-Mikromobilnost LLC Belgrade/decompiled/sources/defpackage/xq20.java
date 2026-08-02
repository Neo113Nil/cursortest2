package defpackage;

import com.yandex.mob.model.MobRemoteNotificationCommand;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes15.dex */
public final /* synthetic */ class xq20 implements uxs {
    public static final xq20 a;
    private static final SerialDescriptor descriptor;

    static {
        xq20 xq20Var = new xq20();
        a = xq20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.model.MobRemoteNotificationPayload", xq20Var, 2);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("proxy_list", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zq20.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zq20.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        MobRemoteNotificationCommand mobRemoteNotificationCommand = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mobRemoteNotificationCommand = (MobRemoteNotificationCommand) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mobRemoteNotificationCommand);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new zq20(i, mobRemoteNotificationCommand, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zq20 zq20Var = (zq20) obj;
        List list = zq20Var.b;
        MobRemoteNotificationCommand mobRemoteNotificationCommand = zq20Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zq20.c;
        if (b.F() || mobRemoteNotificationCommand != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mobRemoteNotificationCommand);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

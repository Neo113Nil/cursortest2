package defpackage;

import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.NotificationParams;

/* loaded from: classes9.dex */
public final /* synthetic */ class ti60 implements uxs {
    public static final ti60 a;
    private static final SerialDescriptor descriptor;

    static {
        ti60 ti60Var = new ti60();
        a = ti60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.NotificationParams", ti60Var, 4);
        pluginGeneratedSerialDescriptor.j("max_alerts_per_session", true);
        pluginGeneratedSerialDescriptor.j("max_alerts_per_user", true);
        pluginGeneratedSerialDescriptor.j("due_date", true);
        pluginGeneratedSerialDescriptor.j("behavior_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = NotificationParams.e;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, qke.n(vmt.a), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = NotificationParams.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Calendar calendar = null;
        jsq0 jsq0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                calendar = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                jsq0Var = (jsq0) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), jsq0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new NotificationParams(i, i2, i3, calendar, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        NotificationParams notificationParams = (NotificationParams) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = NotificationParams.e;
        if (b.F() || notificationParams.a != 0) {
            b.A(0, notificationParams.a, serialDescriptor);
        }
        if (b.F() || notificationParams.b != 0) {
            b.A(1, notificationParams.b, serialDescriptor);
        }
        if (b.F() || notificationParams.c != null) {
            b.g(serialDescriptor, 2, vmt.a, notificationParams.c);
        }
        if (b.F() || !jl40.l(notificationParams.d, ksq0.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), notificationParams.d);
        }
        b.c(serialDescriptor);
    }
}

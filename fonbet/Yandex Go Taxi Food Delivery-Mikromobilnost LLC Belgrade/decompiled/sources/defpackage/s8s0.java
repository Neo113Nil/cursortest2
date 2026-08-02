package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.NotificationParams;
import ru.yandex.taxi.common_models.net.map_object.p0;

/* loaded from: classes5.dex */
public final /* synthetic */ class s8s0 implements uxs {
    public static final s8s0 a;
    private static final SerialDescriptor descriptor;

    static {
        s8s0 s8s0Var = new s8s0();
        a = s8s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.ShowPopupAction", s8s0Var, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("notification_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(ti60.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        NotificationParams notificationParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    notificationParams = (NotificationParams) b.s(serialDescriptor, 5, ti60.a, notificationParams);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new p0(i, str, str2, str3, str4, str5, notificationParams);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p0 p0Var = (p0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || p0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, p0Var.a);
        }
        if (b.F() || p0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, p0Var.b);
        }
        if (b.F() || p0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, p0Var.c);
        }
        if (b.F() || p0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, p0Var.d);
        }
        if (b.F() || p0Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, p0Var.e);
        }
        if (b.F() || p0Var.f != null) {
            b.g(serialDescriptor, 5, ti60.a, p0Var.f);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ws20 implements uxs {
    public static final ws20 a;
    private static final SerialDescriptor descriptor;

    static {
        ws20 ws20Var = new ws20();
        a = ws20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.object.MobileNetwork", ws20Var, 3);
        pluginGeneratedSerialDescriptor.j("mcc", true);
        pluginGeneratedSerialDescriptor.j("mnc", true);
        pluginGeneratedSerialDescriptor.j("country_guessed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ys20(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ys20 ys20Var = (ys20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ys20Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ys20Var.a);
        }
        if (b.F() || ys20Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, ys20Var.b);
        }
        if (b.F() || ys20Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, ys20Var.c);
        }
        b.c(serialDescriptor);
    }
}

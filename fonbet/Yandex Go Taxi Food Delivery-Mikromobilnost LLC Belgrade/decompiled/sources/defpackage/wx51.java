package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.YbTransaction$Type;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class wx51 implements uxs {
    public static final wx51 a;
    private static final SerialDescriptor descriptor;

    static {
        wx51 wx51Var = new wx51();
        a = wx51Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.YbTransaction", wx51Var, 4);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("plusAmount", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zx51.e;
        ms51 ms51Var = ms51.a;
        return new KSerializer[]{qke.n(ms51Var), qke.n(ms51Var), auu0.a, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zx51.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        os51 os51Var = null;
        os51 os51Var2 = null;
        String str = null;
        YbTransaction$Type ybTransaction$Type = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                os51Var = (os51) b.s(serialDescriptor, 0, ms51.a, os51Var);
                i |= 1;
            } else if (v == 1) {
                os51Var2 = (os51) b.s(serialDescriptor, 1, ms51.a, os51Var2);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                ybTransaction$Type = (YbTransaction$Type) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), ybTransaction$Type);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new zx51(i, os51Var, os51Var2, str, ybTransaction$Type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zx51 zx51Var = (zx51) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zx51.e;
        ms51 ms51Var = ms51.a;
        b.g(serialDescriptor, 0, ms51Var, zx51Var.a);
        b.g(serialDescriptor, 1, ms51Var, zx51Var.b);
        b.o(serialDescriptor, 2, zx51Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), zx51Var.d);
        b.c(serialDescriptor);
    }
}

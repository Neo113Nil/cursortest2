package defpackage;

import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class q36 implements uxs {
    public static final q36 a;
    private static final SerialDescriptor descriptor;

    static {
        q36 q36Var = new q36();
        a = q36Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.BlockedUserDto", q36Var, 6);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("appeal_button_text", true);
        pluginGeneratedSerialDescriptor.j("change_phone_button_text", true);
        pluginGeneratedSerialDescriptor.j("blocked", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) s36.g[0].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(vmt.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = s36.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        BlockedUserTypeDto blockedUserTypeDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Calendar calendar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    blockedUserTypeDto = (BlockedUserTypeDto) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), blockedUserTypeDto);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    calendar = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new s36(i, blockedUserTypeDto, str, str2, str3, str4, calendar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s36 s36Var = (s36) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = s36.g;
        if (b.F() || s36Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), s36Var.a);
        }
        if (b.F() || !jl40.l(s36Var.b, "")) {
            b.o(serialDescriptor, 1, s36Var.b);
        }
        if (b.F() || !jl40.l(s36Var.c, "")) {
            b.o(serialDescriptor, 2, s36Var.c);
        }
        if (b.F() || s36Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, s36Var.d);
        }
        if (b.F() || s36Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, s36Var.e);
        }
        if (b.F() || s36Var.f != null) {
            b.g(serialDescriptor, 5, vmt.a, s36Var.f);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderIconTypeDto;

/* loaded from: classes5.dex */
public final /* synthetic */ class vmy implements uxs {
    public static final vmy a;
    private static final SerialDescriptor descriptor;

    static {
        vmy vmyVar = new vmy();
        a = vmyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderFlagsDto", vmyVar, 6);
        pluginGeneratedSerialDescriptor.j("door_to_door", true);
        pluginGeneratedSerialDescriptor.j("show_point_a", true);
        pluginGeneratedSerialDescriptor.j("show_track", true);
        pluginGeneratedSerialDescriptor.j("show_driving_route", true);
        pluginGeneratedSerialDescriptor.j("icons_type", true);
        pluginGeneratedSerialDescriptor.j("metrica_order_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xmy.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, i3yVarArr[4].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xmy.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        LinkedOrderIconTypeDto linkedOrderIconTypeDto = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    linkedOrderIconTypeDto = (LinkedOrderIconTypeDto) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), linkedOrderIconTypeDto);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new xmy(i, z2, z3, z4, z5, linkedOrderIconTypeDto, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xmy xmyVar = (xmy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xmy.g;
        if (b.F() || xmyVar.a) {
            b.n(serialDescriptor, 0, xmyVar.a);
        }
        if (b.F() || xmyVar.b) {
            b.n(serialDescriptor, 1, xmyVar.b);
        }
        if (b.F() || xmyVar.c) {
            b.n(serialDescriptor, 2, xmyVar.c);
        }
        if (b.F() || xmyVar.d) {
            b.n(serialDescriptor, 3, xmyVar.d);
        }
        if (b.F() || xmyVar.e != LinkedOrderIconTypeDto.C2C) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), xmyVar.e);
        }
        if (b.F() || !jl40.l(xmyVar.f, "")) {
            b.o(serialDescriptor, 5, xmyVar.f);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes5.dex */
public final /* synthetic */ class smy implements uxs {
    public static final smy a;
    private static final SerialDescriptor descriptor;

    static {
        smy smyVar = new smy();
        a = smyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderDto", smyVar, 7);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("display_info", true);
        pluginGeneratedSerialDescriptor.j("driver", true);
        pluginGeneratedSerialDescriptor.j("client_flags", true);
        pluginGeneratedSerialDescriptor.j("request", true);
        pluginGeneratedSerialDescriptor.j("trusting_contact", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) umy.h[0].getValue()), bmy.a, mmy.a, vmy.a, moy.a, qke.n(ni11.a), qke.n(zn11.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = umy.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        LinkedOrderStatusDto linkedOrderStatusDto = null;
        fmy fmyVar = null;
        omy omyVar = null;
        xmy xmyVar = null;
        ooy ooyVar = null;
        pi11 pi11Var = null;
        zn11 zn11Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    linkedOrderStatusDto = (LinkedOrderStatusDto) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), linkedOrderStatusDto);
                    i |= 1;
                    break;
                case 1:
                    fmyVar = (fmy) b.A(serialDescriptor, 1, bmy.a, fmyVar);
                    i |= 2;
                    break;
                case 2:
                    omyVar = (omy) b.A(serialDescriptor, 2, mmy.a, omyVar);
                    i |= 4;
                    break;
                case 3:
                    xmyVar = (xmy) b.A(serialDescriptor, 3, vmy.a, xmyVar);
                    i |= 8;
                    break;
                case 4:
                    ooyVar = (ooy) b.A(serialDescriptor, 4, moy.a, ooyVar);
                    i |= 16;
                    break;
                case 5:
                    pi11Var = (pi11) b.s(serialDescriptor, 5, ni11.a, pi11Var);
                    i |= 32;
                    break;
                case 6:
                    zn11Var = (zn11) b.s(serialDescriptor, 6, zn11.Companion.serializer(), zn11Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new umy(i, linkedOrderStatusDto, fmyVar, omyVar, xmyVar, ooyVar, pi11Var, zn11Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        umy umyVar = (umy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = umy.h;
        if (b.F() || umyVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), umyVar.a);
        }
        if (b.F() || !jl40.l(umyVar.b, new fmy(0))) {
            b.e(serialDescriptor, 1, bmy.a, umyVar.b);
        }
        if (b.F() || !jl40.l(umyVar.c, new omy(0))) {
            b.e(serialDescriptor, 2, mmy.a, umyVar.c);
        }
        if (b.F() || !jl40.l(umyVar.d, new xmy(0))) {
            b.e(serialDescriptor, 3, vmy.a, umyVar.d);
        }
        if (b.F() || !jl40.l(umyVar.e, new ooy(0))) {
            b.e(serialDescriptor, 4, moy.a, umyVar.e);
        }
        if (b.F() || umyVar.f != null) {
            b.g(serialDescriptor, 5, ni11.a, umyVar.f);
        }
        if (b.F() || umyVar.g != null) {
            b.g(serialDescriptor, 6, zn11.Companion.serializer(), umyVar.g);
        }
        b.c(serialDescriptor);
    }
}

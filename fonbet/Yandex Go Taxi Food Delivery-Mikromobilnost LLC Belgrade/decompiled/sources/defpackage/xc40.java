package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class xc40 implements uxs {
    public static final xc40 a;
    private static final SerialDescriptor descriptor;

    static {
        xc40 xc40Var = new xc40();
        a = xc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.TariffSectionDto", xc40Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("info_dialog", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(tc40.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        vb40.m mVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                mVar = (vb40.m) b.s(serialDescriptor, 3, tc40.a, mVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vb40.o(i, formattedText, formattedText2, formattedText3, mVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.o oVar = (vb40.o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(oVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, oVar.a);
        }
        if (b.F() || !jl40.l(oVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, oVar.b);
        }
        if (b.F() || !jl40.l(oVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, oVar.c);
        }
        if (b.F() || oVar.d != null) {
            b.g(serialDescriptor, 3, tc40.a, oVar.d);
        }
        b.c(serialDescriptor);
    }
}

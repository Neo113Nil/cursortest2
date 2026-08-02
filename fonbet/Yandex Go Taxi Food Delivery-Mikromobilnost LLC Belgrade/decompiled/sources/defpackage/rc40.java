package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class rc40 implements uxs {
    public static final rc40 a;
    private static final SerialDescriptor descriptor;

    static {
        rc40 rc40Var = new rc40();
        a = rc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.RouteDto", rc40Var, 2);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vb40.l(i, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.l lVar = (vb40.l) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(lVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, lVar.a);
        }
        if (b.F() || !jl40.l(lVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, lVar.b);
        }
        b.c(serialDescriptor);
    }
}

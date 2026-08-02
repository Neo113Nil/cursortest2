package defpackage;

import defpackage.qe40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class te40 implements uxs {
    public static final te40 a;
    private static final SerialDescriptor descriptor;

    static {
        te40 te40Var = new te40();
        a = te40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainDateSelectorDto.DatePicker", te40Var, 8);
        pluginGeneratedSerialDescriptor.j("validity_period", true);
        pluginGeneratedSerialDescriptor.j("description_date_format", true);
        pluginGeneratedSerialDescriptor.j("starting_date_title", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("expiration_date_title", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_title", true);
        pluginGeneratedSerialDescriptor.j("locale", true);
        pluginGeneratedSerialDescriptor.j("date_interval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        auu0 auu0Var = auu0.a;
        KSerializer n2 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, n2, qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(auu0Var), qke.n(ve40.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str2 = null;
        qe40.b.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText4);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    aVar = (qe40.b.a) b.s(serialDescriptor, 7, ve40.a, aVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new qe40.b(i, num, str, formattedText, formattedText2, formattedText3, formattedText4, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qe40.b bVar = (qe40.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, bVar.c);
        }
        if (b.F() || bVar.d != null) {
            b.g(serialDescriptor, 3, w7s.a, bVar.d);
        }
        if (b.F() || bVar.e != null) {
            b.g(serialDescriptor, 4, w7s.a, bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, w7s.a, bVar.f);
        }
        if (b.F() || bVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, bVar.g);
        }
        if (b.F() || bVar.h != null) {
            b.g(serialDescriptor, 7, ve40.a, bVar.h);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import defpackage.b4o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class y3o implements uxs {
    public static final y3o a;
    private static final SerialDescriptor descriptor;

    static {
        y3o y3oVar = new y3o();
        a = y3oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.EntryPoint", y3oVar, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("package_price_per_minute", true);
        pluginGeneratedSerialDescriptor.j("entrypoint_details", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("display_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b4o.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, qke.n(auu0.a), qke.n(w7sVar), qke.n(e4o.a), qke.n(z3o.a), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b4o.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        FormattedText formattedText3 = null;
        b4o.b bVar = null;
        b4o.a aVar = null;
        SuperPassesDisplayVersionDto superPassesDisplayVersionDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    bVar = (b4o.b) b.s(serialDescriptor, 4, e4o.a, bVar);
                    i |= 16;
                    break;
                case 5:
                    aVar = (b4o.a) b.s(serialDescriptor, 5, z3o.a, aVar);
                    i |= 32;
                    break;
                case 6:
                    superPassesDisplayVersionDto = (SuperPassesDisplayVersionDto) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), superPassesDisplayVersionDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new b4o(i, formattedText, formattedText2, str, formattedText3, bVar, aVar, superPassesDisplayVersionDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b4o b4oVar = (b4o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b4o.h;
        if (b.F() || !jl40.l(b4oVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, b4oVar.a);
        }
        if (b.F() || !jl40.l(b4oVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, b4oVar.b);
        }
        if (b.F() || b4oVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, b4oVar.c);
        }
        if (b.F() || b4oVar.d != null) {
            b.g(serialDescriptor, 3, w7s.a, b4oVar.d);
        }
        if (b.F() || b4oVar.e != null) {
            b.g(serialDescriptor, 4, e4o.a, b4oVar.e);
        }
        if (b.F() || b4oVar.f != null) {
            b.g(serialDescriptor, 5, z3o.a, b4oVar.f);
        }
        if (b.F() || b4oVar.g != SuperPassesDisplayVersionDto.V2) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), b4oVar.g);
        }
        b.c(serialDescriptor);
    }
}

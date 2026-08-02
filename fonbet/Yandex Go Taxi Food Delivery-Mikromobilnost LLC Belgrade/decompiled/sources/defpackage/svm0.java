package defpackage;

import defpackage.ovm0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class svm0 implements uxs {
    public static final svm0 a;
    private static final SerialDescriptor descriptor;

    static {
        svm0 svm0Var = new svm0();
        a = svm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.DetailDto", svm0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("trail_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), auu0.a, qke.n(uvm0.a)};
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
        String str = null;
        ovm0.c.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (ovm0.c.a) b.s(serialDescriptor, 3, uvm0.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ovm0.c(i, formattedText, formattedText2, str, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ovm0.c cVar = (ovm0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, "")) {
            b.o(serialDescriptor, 2, cVar.c);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, uvm0.a, cVar.d);
        }
        b.c(serialDescriptor);
    }
}

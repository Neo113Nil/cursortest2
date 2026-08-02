package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.t0;
import ru.yandex.taxi.surge.models.dto.w;

/* loaded from: classes6.dex */
public final /* synthetic */ class qow0 implements uxs {
    public static final qow0 a;
    private static final SerialDescriptor descriptor;

    static {
        qow0 qow0Var = new qow0();
        a = qow0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.FeedbackSentModalContent", qow0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("buttons_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, t0.a};
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
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                surgeInfoItem$ActionButtonsContent = (SurgeInfoItem$ActionButtonsContent) b.A(serialDescriptor, 3, t0.a, surgeInfoItem$ActionButtonsContent);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new w(i, str, str2, str3, surgeInfoItem$ActionButtonsContent);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w wVar = (w) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(wVar.a, "")) {
            b.o(serialDescriptor, 0, wVar.a);
        }
        if (b.F() || !jl40.l(wVar.b, "")) {
            b.o(serialDescriptor, 1, wVar.b);
        }
        if (b.F() || !jl40.l(wVar.c, "")) {
            b.o(serialDescriptor, 2, wVar.c);
        }
        if (b.F() || !jl40.l(wVar.d, new SurgeInfoItem$ActionButtonsContent(0))) {
            b.e(serialDescriptor, 3, t0.a, wVar.d);
        }
        b.c(serialDescriptor);
    }
}

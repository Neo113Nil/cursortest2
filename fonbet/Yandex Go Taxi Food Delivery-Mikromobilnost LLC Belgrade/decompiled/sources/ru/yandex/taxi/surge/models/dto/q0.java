package ru.yandex.taxi.surge.models.dto;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.l0;

/* loaded from: classes6.dex */
public final /* synthetic */ class q0 implements uxs {
    public static final q0 a;
    private static final SerialDescriptor descriptor;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoChartContent.ChartValueBubble", q0Var, 2);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new l0.d(i, str, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0.d dVar = (l0.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dVar.a, "")) {
            b.o(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, dVar.b);
        }
        b.c(serialDescriptor);
    }
}

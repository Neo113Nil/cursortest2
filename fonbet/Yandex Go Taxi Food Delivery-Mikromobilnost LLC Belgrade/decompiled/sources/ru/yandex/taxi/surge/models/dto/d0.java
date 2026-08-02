package ru.yandex.taxi.surge.models.dto;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.c0;

/* loaded from: classes6.dex */
public final /* synthetic */ class d0 implements uxs {
    public static final d0 a;
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.PriceFeedbackModalContent.FeedbackOptions", d0Var, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var)};
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new c0.b(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0.b bVar = (c0.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, "")) {
            b.o(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bVar.c);
        }
        b.c(serialDescriptor);
    }
}

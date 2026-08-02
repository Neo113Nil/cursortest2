package ru.yandex.taxi.surge.models.dto;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.nor;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class l implements uxs {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent.GradientBackground", lVar, 4);
        pluginGeneratedSerialDescriptor.j("gradient_first_color", true);
        pluginGeneratedSerialDescriptor.j("gradient_second_color", true);
        pluginGeneratedSerialDescriptor.j("gradient_left_bound", true);
        pluginGeneratedSerialDescriptor.j("gradient_right_bound", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        nor norVar = nor.a;
        return new KSerializer[]{auu0Var, auu0Var, norVar, norVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = true;
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
                f = b.y(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f2 = b.y(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new i.c(i, str, str2, f, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i.c cVar = (i.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, "")) {
            b.o(serialDescriptor, 1, cVar.b);
        }
        if (b.F() || Float.compare(cVar.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, cVar.c);
        }
        if (b.F() || Float.compare(cVar.d, 0.0f) != 0) {
            b.z(serialDescriptor, 3, cVar.d);
        }
        b.c(serialDescriptor);
    }
}

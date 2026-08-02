package ru.yandex.taxi.surge.models.dto;

import defpackage.jl40;
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
public final /* synthetic */ class n implements uxs {
    public static final n a;
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent.GradientBody", nVar, 2);
        pluginGeneratedSerialDescriptor.j("top_line", true);
        pluginGeneratedSerialDescriptor.j("bottom_line", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        p pVar = p.a;
        return new KSerializer[]{pVar, pVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        i.e eVar = null;
        i.e eVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                eVar = (i.e) b.A(serialDescriptor, 0, p.a, eVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                eVar2 = (i.e) b.A(serialDescriptor, 1, p.a, eVar2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new i.d(i, eVar, eVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i.d dVar = (i.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dVar.a, new i.e(0))) {
            b.e(serialDescriptor, 0, p.a, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, new i.e(0))) {
            b.e(serialDescriptor, 1, p.a, dVar.b);
        }
        b.c(serialDescriptor);
    }
}

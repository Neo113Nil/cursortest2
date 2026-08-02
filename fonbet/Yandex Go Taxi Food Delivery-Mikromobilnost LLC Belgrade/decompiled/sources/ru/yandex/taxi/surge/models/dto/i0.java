package ru.yandex.taxi.surge.models.dto;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.l0;

/* loaded from: classes6.dex */
public final /* synthetic */ class i0 implements uxs {
    public static final i0 a;
    private static final SerialDescriptor descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoChartContent", i0Var, 3);
        pluginGeneratedSerialDescriptor.j("accessibility", true);
        pluginGeneratedSerialDescriptor.j("bars", true);
        pluginGeneratedSerialDescriptor.j("current_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j0.a, l0.d[1].getValue(), qke.n(o0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        l0.a aVar = null;
        List list = null;
        l0.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (l0.a) b.A(serialDescriptor, 0, j0.a, aVar);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                cVar = (l0.c) b.s(serialDescriptor, 2, o0.a, cVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new l0(i, aVar, list, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0 l0Var = (l0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l0.d;
        if (b.F() || !jl40.l(l0Var.a, new l0.a(0))) {
            b.e(serialDescriptor, 0, j0.a, l0Var.a);
        }
        if (b.F() || !jl40.l(l0Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), l0Var.b);
        }
        if (b.F() || l0Var.c != null) {
            b.g(serialDescriptor, 2, o0.a, l0Var.c);
        }
        b.c(serialDescriptor);
    }
}

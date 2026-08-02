package ru.yandex.taxi.communications.api.dto;

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
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes5.dex */
public final /* synthetic */ class h0 implements uxs {
    public static final h0 a;
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story.Preview", h0Var, 3);
        pluginGeneratedSerialDescriptor.j("backgrounds", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        j0 j0Var = j0.a;
        return new KSerializer[]{Story.e.d[0].getValue(), qke.n(j0Var), qke.n(j0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.e.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Story.f fVar = null;
        Story.f fVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                fVar = (Story.f) b.s(serialDescriptor, 1, j0.a, fVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                fVar2 = (Story.f) b.s(serialDescriptor, 2, j0.a, fVar2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new Story.e(i, list, fVar, fVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Story.e eVar = (Story.e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.e.d;
        if (b.F() || !jl40.l(eVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), eVar.a);
        }
        if (b.F() || eVar.b != null) {
            b.g(serialDescriptor, 1, j0.a, eVar.b);
        }
        if (b.F() || eVar.c != null) {
            b.g(serialDescriptor, 2, j0.a, eVar.c);
        }
        b.c(serialDescriptor);
    }
}

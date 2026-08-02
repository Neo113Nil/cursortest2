package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes5.dex */
public final /* synthetic */ class f0 implements uxs {
    public static final f0 a;
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story.Payload", f0Var, 4);
        pluginGeneratedSerialDescriptor.j("mark_read_after_tap", true);
        pluginGeneratedSerialDescriptor.j("is_tapable", true);
        pluginGeneratedSerialDescriptor.j("preview", true);
        pluginGeneratedSerialDescriptor.j("pages", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Story.d.e;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, qke.n(h0.a), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.d.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Story.e eVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                eVar = (Story.e) b.s(serialDescriptor, 2, h0.a, eVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new Story.d(i, z2, z3, eVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Story.d dVar = (Story.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.d.e;
        if (b.F() || dVar.a) {
            b.n(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || dVar.b) {
            b.n(serialDescriptor, 1, dVar.b);
        }
        if (b.F() || dVar.c != null) {
            b.g(serialDescriptor, 2, h0.a, dVar.c);
        }
        if (b.F() || !jl40.l(dVar.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), dVar.d);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class xi20 implements uxs {
    public static final xi20 a;
    private static final SerialDescriptor descriptor;

    static {
        xi20 xi20Var = new xi20();
        a = xi20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.MissedSeenBanner", xi20Var, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zi20.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), i3yVarArr[2].getValue(), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zi20.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        Map map = null;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                i |= 4;
            } else if (v == 3) {
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z3 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new zi20(i, str, map, set, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zi20 zi20Var = (zi20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zi20.g;
        if (b.F() || !jl40.l(zi20Var.b, "")) {
            b.o(serialDescriptor, 0, zi20Var.b);
        }
        if (b.F() || zi20Var.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zi20Var.c);
        }
        if (b.F() || !jl40.l(zi20Var.d, EmptySet.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), zi20Var.d);
        }
        if (b.F() || zi20Var.e) {
            b.n(serialDescriptor, 3, zi20Var.e);
        }
        if (b.F() || !zi20Var.f) {
            b.n(serialDescriptor, 4, zi20Var.f);
        }
        b.c(serialDescriptor);
    }
}

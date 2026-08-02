package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class vtd0 implements uxs {
    public static final vtd0 a;
    private static final SerialDescriptor descriptor;

    static {
        vtd0 vtd0Var = new vtd0();
        a = vtd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PointAdjustmentSelectableOptionItem", vtd0Var, 5);
        pluginGeneratedSerialDescriptor.j("lead", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("associated_result_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xtd0.f;
        return new KSerializer[]{qke.n(bud0.a), i3yVarArr[1].getValue(), qke.n((KSerializer) i3yVarArr[2].getValue()), i3yVarArr[3].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xtd0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        dud0 dud0Var = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dud0Var = (dud0) b.s(serialDescriptor, 0, bud0.a, dud0Var);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            } else if (v == 3) {
                list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new xtd0(i, dud0Var, list, list2, list3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xtd0 xtd0Var = (xtd0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xtd0.f;
        if (b.F() || xtd0Var.a != null) {
            b.g(serialDescriptor, 0, bud0.a, xtd0Var.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(xtd0Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), xtd0Var.b);
        }
        if (b.F() || xtd0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), xtd0Var.c);
        }
        if (b.F() || !jl40.l(xtd0Var.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), xtd0Var.d);
        }
        if (b.F() || !jl40.l(xtd0Var.e, "")) {
            b.o(serialDescriptor, 4, xtd0Var.e);
        }
        b.c(serialDescriptor);
    }
}

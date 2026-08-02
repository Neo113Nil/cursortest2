package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ze20 implements uxs {
    public static final ze20 a;
    private static final SerialDescriptor descriptor;

    static {
        ze20 ze20Var = new ze20();
        a = ze20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque_v2.MicroWidgetConditionDto", ze20Var, 7);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("order_states", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("selected_tariffs", true);
        pluginGeneratedSerialDescriptor.j("available_tariffs", true);
        pluginGeneratedSerialDescriptor.j("unseen_typed_screens", true);
        pluginGeneratedSerialDescriptor.j("payment_methods", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = df20.h;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = df20.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    list5 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list5);
                    i |= 16;
                    break;
                case 5:
                    list6 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list6);
                    i |= 32;
                    break;
                case 6:
                    list7 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list7);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new df20(i, list, list2, list3, list4, list5, list6, list7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        df20 df20Var = (df20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = df20.h;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(df20Var.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), df20Var.a);
        }
        if (b.F() || !jl40.l(df20Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), df20Var.b);
        }
        if (b.F() || !jl40.l(df20Var.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), df20Var.c);
        }
        if (b.F() || !jl40.l(df20Var.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), df20Var.d);
        }
        if (b.F() || !jl40.l(df20Var.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), df20Var.e);
        }
        if (b.F() || !jl40.l(df20Var.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), df20Var.f);
        }
        if (b.F() || !jl40.l(df20Var.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), df20Var.g);
        }
        b.c(serialDescriptor);
    }
}

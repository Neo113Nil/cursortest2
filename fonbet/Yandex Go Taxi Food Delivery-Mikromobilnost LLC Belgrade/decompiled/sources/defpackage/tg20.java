package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;

/* loaded from: classes9.dex */
public final /* synthetic */ class tg20 implements uxs {
    public static final tg20 a;
    private static final SerialDescriptor descriptor;

    static {
        tg20 tg20Var = new tg20();
        a = tg20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetsPlaqueDefinitionDto", tg20Var, 4);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("plaques", true);
        pluginGeneratedSerialDescriptor.j("widgets_levels", true);
        pluginGeneratedSerialDescriptor.j("widget_groups", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = e0.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list4 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new e0(i, list, list2, list3, list4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e0 e0Var = (e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e0.e;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(e0Var.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), e0Var.a);
        }
        if (b.F() || !jl40.l(e0Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), e0Var.b);
        }
        if (b.F() || !jl40.l(e0Var.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), e0Var.c);
        }
        if (b.F() || !jl40.l(e0Var.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), e0Var.d);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ysa0 implements uxs {
    public static final ysa0 a;
    private static final SerialDescriptor descriptor;

    static {
        ysa0 ysa0Var = new ysa0();
        a = ysa0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.PendingOrdersState", ysa0Var, 4);
        pluginGeneratedSerialDescriptor.j("multiorder_availability", true);
        pluginGeneratedSerialDescriptor.j("active_orders", true);
        pluginGeneratedSerialDescriptor.j("feedback_wanted_orders", true);
        pluginGeneratedSerialDescriptor.j("orders_with_b_routes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ata0.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue()), i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ata0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        CanMakeMoreOrders canMakeMoreOrders = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                canMakeMoreOrders = (CanMakeMoreOrders) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), canMakeMoreOrders);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ata0(i, canMakeMoreOrders, list, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ata0 ata0Var = (ata0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ata0.e;
        if (b.F() || ata0Var.a != CanMakeMoreOrders.UNMODIFIED) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ata0Var.a);
        }
        if (b.F() || ata0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ata0Var.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(ata0Var.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ata0Var.c);
        }
        if (b.F() || !jl40.l(ata0Var.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), ata0Var.d);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class ski implements uxs {
    public static final ski a;
    private static final SerialDescriptor descriptor;

    static {
        ski skiVar = new ski();
        a = skiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.preorder.DeliveryPreorderData", skiVar, 6);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("preorder", true);
        pluginGeneratedSerialDescriptor.j("is_pay_on_delivery_selected", true);
        pluginGeneratedSerialDescriptor.j("courier_comment", true);
        pluginGeneratedSerialDescriptor.j("selected_alt_choice_key", true);
        pluginGeneratedSerialDescriptor.j("selected_alt_choice_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, Preorder$$serializer.INSTANCE, z96.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        Preorder preorder = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    preorder = (Preorder) b.A(serialDescriptor, 1, Preorder$$serializer.INSTANCE, preorder);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new uki(i, str, preorder, z2, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uki ukiVar = (uki) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ukiVar.a, "")) {
            b.o(serialDescriptor, 0, ukiVar.a);
        }
        if (b.F() || !jl40.l(ukiVar.b, new Preorder(0))) {
            b.e(serialDescriptor, 1, Preorder$$serializer.INSTANCE, ukiVar.b);
        }
        if (b.F() || ukiVar.c) {
            b.n(serialDescriptor, 2, ukiVar.c);
        }
        if (b.F() || ukiVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, ukiVar.d);
        }
        if (b.F() || ukiVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, ukiVar.e);
        }
        if (b.F() || ukiVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, ukiVar.f);
        }
        b.c(serialDescriptor);
    }
}

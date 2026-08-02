package defpackage;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips$$serializer;
import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public final /* synthetic */ class xd9 implements uxs {
    public static final xd9 a;
    private static final SerialDescriptor descriptor;

    static {
        xd9 xd9Var = new xd9();
        a = xd9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.ChangePaymentParam", xd9Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j("created_time", false);
        pluginGeneratedSerialDescriptor.j("payment_method_type", false);
        pluginGeneratedSerialDescriptor.j("payment_method_id", false);
        pluginGeneratedSerialDescriptor.j("tips", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zd9.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, vmt.a, i3yVarArr[3].getValue(), qke.n(auu0Var), qke.n(Tips$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zd9.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Calendar calendar = null;
        PaymentMethod$Type paymentMethod$Type = null;
        String str3 = null;
        Tips tips = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    calendar = (Calendar) b.A(serialDescriptor, 2, vmt.a, calendar);
                    i |= 4;
                    break;
                case 3:
                    paymentMethod$Type = (PaymentMethod$Type) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), paymentMethod$Type);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    tips = (Tips) b.s(serialDescriptor, 5, Tips$$serializer.INSTANCE, tips);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new zd9(i, str, str2, calendar, paymentMethod$Type, str3, tips);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zd9 zd9Var = (zd9) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zd9.g;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, zd9Var.a);
        b.o(serialDescriptor, 1, zd9Var.b);
        b.e(serialDescriptor, 2, vmt.a, zd9Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), zd9Var.d);
        b.g(serialDescriptor, 4, auu0Var, zd9Var.e);
        b.g(serialDescriptor, 5, Tips$$serializer.INSTANCE, zd9Var.f);
        b.c(serialDescriptor);
    }
}

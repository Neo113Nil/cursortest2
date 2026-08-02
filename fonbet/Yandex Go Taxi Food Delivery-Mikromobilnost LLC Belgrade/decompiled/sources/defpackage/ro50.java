package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel$Currency;
import java.math.BigDecimal;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ro50 implements uxs {
    public static final ro50 a;
    private static final SerialDescriptor descriptor;

    static {
        ro50 ro50Var = new ro50();
        a = ro50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel", ro50Var, 2);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bs5.a, to50.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = to50.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        BigDecimal bigDecimal = null;
        NetworkBalanceModel$Currency networkBalanceModel$Currency = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bigDecimal = (BigDecimal) b.A(serialDescriptor, 0, bs5.a, bigDecimal);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                networkBalanceModel$Currency = (NetworkBalanceModel$Currency) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), networkBalanceModel$Currency);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new to50(i, bigDecimal, networkBalanceModel$Currency);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        to50 to50Var = (to50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = to50.c;
        b.e(serialDescriptor, 0, bs5.a, to50Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), to50Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

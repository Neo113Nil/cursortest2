package defpackage;

import java.util.Calendar;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class v99 implements uxs {
    public static final v99 a;
    private static final SerialDescriptor descriptor;

    static {
        v99 v99Var = new v99();
        a = v99Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.ChangeCorpCostCenter", v99Var, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j("created_time", false);
        pluginGeneratedSerialDescriptor.j("cost_centers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = x99.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, vmt.a, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = x99.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Calendar calendar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                calendar = (Calendar) b.A(serialDescriptor, 2, vmt.a, calendar);
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
        return new x99(i, str, str2, calendar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x99 x99Var = (x99) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = x99.e;
        b.g(serialDescriptor, 0, auu0.a, x99Var.a);
        b.o(serialDescriptor, 1, x99Var.b);
        b.e(serialDescriptor, 2, vmt.a, x99Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), x99Var.d);
        b.c(serialDescriptor);
    }
}

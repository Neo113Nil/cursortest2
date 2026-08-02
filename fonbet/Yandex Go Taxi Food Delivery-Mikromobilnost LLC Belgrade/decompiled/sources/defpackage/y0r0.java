package defpackage;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class y0r0 implements uxs {
    public static final y0r0 a;
    private static final SerialDescriptor descriptor;

    static {
        y0r0 y0r0Var = new y0r0();
        a = y0r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegment", y0r0Var, 5);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, true);
        pluginGeneratedSerialDescriptor.j("car_number", true);
        pluginGeneratedSerialDescriptor.j("vehicle_id", true);
        pluginGeneratedSerialDescriptor.j("slowdowns", true);
        pluginGeneratedSerialDescriptor.j("session", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = a1r0.f;
        KSerializer n = qke.n(q1r0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(b1r0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a1r0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        s1r0 s1r0Var = null;
        String str = null;
        String str2 = null;
        List list = null;
        d1r0 d1r0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                s1r0Var = (s1r0) b.s(serialDescriptor, 0, q1r0.a, s1r0Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                d1r0Var = (d1r0) b.s(serialDescriptor, 4, b1r0.a, d1r0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new a1r0(i, s1r0Var, str, str2, list, d1r0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a1r0 a1r0Var = (a1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = a1r0.f;
        if (b.F() || a1r0Var.a != null) {
            b.g(serialDescriptor, 0, q1r0.a, a1r0Var.a);
        }
        if (b.F() || a1r0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, a1r0Var.b);
        }
        if (b.F() || a1r0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, a1r0Var.c);
        }
        if (b.F() || a1r0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), a1r0Var.d);
        }
        if (b.F() || a1r0Var.e != null) {
            b.g(serialDescriptor, 4, b1r0.a, a1r0Var.e);
        }
        b.c(serialDescriptor);
    }
}

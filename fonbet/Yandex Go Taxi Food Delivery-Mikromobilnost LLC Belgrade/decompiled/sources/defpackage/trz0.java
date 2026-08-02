package defpackage;

import com.yandex.go.zone.dto.objects.TollRoadsAvailability;
import com.yandex.go.zone.dto.objects.o6;
import com.yandex.go.zone.dto.objects.r6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class trz0 implements uxs {
    public static final trz0 a;
    private static final SerialDescriptor descriptor;

    static {
        trz0 trz0Var = new trz0();
        a = trz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.TollRoadsResponse", trz0Var, 7);
        pluginGeneratedSerialDescriptor.j("has_tolls", true);
        pluginGeneratedSerialDescriptor.j("available", true);
        pluginGeneratedSerialDescriptor.j("ui", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("original_price", true);
        pluginGeneratedSerialDescriptor.j("auto_payment", true);
        pluginGeneratedSerialDescriptor.j("discount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = vrz0.h;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(z96Var), i3yVarArr[1].getValue(), xrz0.e, auu0Var, auu0Var, z96Var, qke.n(lrz0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vrz0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Boolean bool = null;
        TollRoadsAvailability tollRoadsAvailability = null;
        o6 o6Var = null;
        String str = null;
        String str2 = null;
        nrz0 nrz0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                    i |= 1;
                    break;
                case 1:
                    tollRoadsAvailability = (TollRoadsAvailability) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), tollRoadsAvailability);
                    i |= 2;
                    break;
                case 2:
                    o6Var = (o6) b.A(serialDescriptor, 2, xrz0.e, o6Var);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    nrz0Var = (nrz0) b.s(serialDescriptor, 6, lrz0.a, nrz0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new vrz0(i, bool, tollRoadsAvailability, o6Var, str, str2, z2, nrz0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vrz0 vrz0Var = (vrz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vrz0.h;
        if (b.F() || vrz0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, vrz0Var.a);
        }
        if (b.F() || vrz0Var.b != TollRoadsAvailability.DISABLED) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vrz0Var.b);
        }
        if (b.F() || !jl40.l(vrz0Var.c, r6.INSTANCE)) {
            b.e(serialDescriptor, 2, xrz0.e, vrz0Var.c);
        }
        if (b.F() || !jl40.l(vrz0Var.d, "")) {
            b.o(serialDescriptor, 3, vrz0Var.d);
        }
        if (b.F() || !jl40.l(vrz0Var.e, "")) {
            b.o(serialDescriptor, 4, vrz0Var.e);
        }
        if (b.F() || vrz0Var.f) {
            b.n(serialDescriptor, 5, vrz0Var.f);
        }
        if (b.F() || vrz0Var.g != null) {
            b.g(serialDescriptor, 6, lrz0.a, vrz0Var.g);
        }
        b.c(serialDescriptor);
    }
}

package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class z480 implements uxs {
    public static final z480 a;
    private static final SerialDescriptor descriptor;

    static {
        z480 z480Var = new z480();
        a = z480Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.domain.OrderRequirement", z480Var, 6);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("pickedOptionsNames", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b580.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(pf70.a), i3yVarArr[4].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b580.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        rf70 rf70Var = null;
        List list = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    rf70Var = (rf70) b.s(serialDescriptor, 3, pf70.a, rf70Var);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
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
        return new b580(i, str, str2, str3, rf70Var, list, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b580 b580Var = (b580) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b580.g;
        if (b.F() || !jl40.l(b580Var.a, "")) {
            b.o(serialDescriptor, 0, b580Var.a);
        }
        if (b.F() || !jl40.l(b580Var.b, "")) {
            b.o(serialDescriptor, 1, b580Var.b);
        }
        if (b.F() || !jl40.l(b580Var.c, "")) {
            b.o(serialDescriptor, 2, b580Var.c);
        }
        if (b.F() || b580Var.d != null) {
            b.g(serialDescriptor, 3, pf70.a, b580Var.d);
        }
        if (b.F() || !jl40.l(b580Var.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), b580Var.e);
        }
        if (b.F() || b580Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, b580Var.f);
        }
        b.c(serialDescriptor);
    }
}

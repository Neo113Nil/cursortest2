package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class s03 implements uxs {
    public static final s03 a;
    private static final SerialDescriptor descriptor;

    static {
        s03 s03Var = new s03();
        a = s03Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.ApplicationState", s03Var, 8);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        pluginGeneratedSerialDescriptor.j("nz", true);
        pluginGeneratedSerialDescriptor.j("known_orders", true);
        pluginGeneratedSerialDescriptor.j("fields", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("available_payment_methods", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w03.i;
        return new KSerializer[]{qke.n(b0t.a), qke.n(h6w.a), qke.n(uc4.Companion.serializer()), qke.n(auu0.a), i3yVarArr[4].getValue(), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(orx.a), qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = w03.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        zzs zzsVar = null;
        Integer num = null;
        uc4 uc4Var = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        srx srxVar = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zzsVar = (zzs) b.s(serialDescriptor, 0, b0t.a, zzsVar);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    uc4Var = (uc4) b.s(serialDescriptor, 2, uc4.Companion.serializer(), uc4Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    srxVar = (srx) b.s(serialDescriptor, 6, orx.a, srxVar);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new w03(i, zzsVar, num, uc4Var, str, list2, list3, srxVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w03 w03Var = (w03) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w03.i;
        if (b.F() || w03Var.a != null) {
            b.g(serialDescriptor, 0, b0t.a, w03Var.a);
        }
        if (b.F() || w03Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, w03Var.b);
        }
        if (b.F() || w03Var.c != null) {
            b.g(serialDescriptor, 2, uc4.Companion.serializer(), w03Var.c);
        }
        if (b.F() || w03Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, w03Var.d);
        }
        if (b.F() || !jl40.l(w03Var.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), w03Var.e);
        }
        if (b.F() || w03Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), w03Var.f);
        }
        if (b.F() || w03Var.g != null) {
            b.g(serialDescriptor, 6, orx.a, w03Var.g);
        }
        if (b.F() || w03Var.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), w03Var.h);
        }
        b.c(serialDescriptor);
    }
}

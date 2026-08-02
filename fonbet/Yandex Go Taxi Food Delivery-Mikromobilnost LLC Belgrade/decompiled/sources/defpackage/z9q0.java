package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

/* loaded from: classes5.dex */
public final /* synthetic */ class z9q0 implements uxs {
    public static final z9q0 a;
    private static final SerialDescriptor descriptor;

    static {
        z9q0 z9q0Var = new z9q0();
        a = z9q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.SelectAction", z9q0Var, 8);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("alt_offer", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("goals", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("accept_rules_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = baq0.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), tu1.a, rcx.a, auu0Var, auu0Var, i3yVarArr[5].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = baq0.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        ArrowActionType arrowActionType = null;
        vu1 vu1Var = null;
        b bVar = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    arrowActionType = (ArrowActionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), arrowActionType);
                    i |= 1;
                    break;
                case 1:
                    vu1Var = (vu1) b.A(serialDescriptor, 1, tu1.a, vu1Var);
                    i |= 2;
                    break;
                case 2:
                    bVar = (b) b.A(serialDescriptor, 2, rcx.a, bVar);
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
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    str3 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    str4 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new baq0(i, arrowActionType, vu1Var, bVar, str, str2, list, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        baq0 baq0Var = (baq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = baq0.j;
        if (b.F() || baq0Var.a != ArrowActionType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), baq0Var.a);
        }
        if (b.F() || !jl40.l(baq0Var.b, new vu1(0))) {
            b.e(serialDescriptor, 1, tu1.a, baq0Var.b);
        }
        if (b.F() || !jl40.l(baq0Var.c, new c(kotlin.collections.b.f()))) {
            b.e(serialDescriptor, 2, rcx.a, baq0Var.c);
        }
        if (b.F() || !jl40.l(baq0Var.d, "")) {
            b.o(serialDescriptor, 3, baq0Var.d);
        }
        if (b.F() || !jl40.l(baq0Var.e, "")) {
            b.o(serialDescriptor, 4, baq0Var.e);
        }
        if (b.F() || !jl40.l(baq0Var.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), baq0Var.f);
        }
        if (b.F() || !jl40.l(baq0Var.g, "")) {
            b.o(serialDescriptor, 6, baq0Var.g);
        }
        if (b.F() || !jl40.l(baq0Var.h, "")) {
            b.o(serialDescriptor, 7, baq0Var.h);
        }
        b.c(serialDescriptor);
    }
}

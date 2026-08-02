package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;

/* loaded from: classes9.dex */
public final /* synthetic */ class vn0 implements uxs {
    public static final vn0 a;
    private static final SerialDescriptor descriptor;

    static {
        vn0 vn0Var = new vn0();
        a = vn0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.AdditionalStepConfig", vn0Var, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("placeholder", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{xn0.f[0].getValue(), auu0Var, auu0Var, auu0Var, dfi.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xn0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        StepType stepType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        cfi cfiVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                stepType = (StepType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), stepType);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                cfiVar = (cfi) b.A(serialDescriptor, 4, dfi.a, cfiVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new xn0(i, stepType, str, str2, str3, cfiVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.cfi.b) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        xn0 xn0Var = (xn0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xn0.f;
        if (b.F() || xn0Var.a != StepType.SOURCE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), xn0Var.a);
        }
        if (b.F() || !jl40.l(xn0Var.b, "")) {
            b.o(serialDescriptor, 1, xn0Var.b);
        }
        if (b.F() || !jl40.l(xn0Var.c, "")) {
            b.o(serialDescriptor, 2, xn0Var.c);
        }
        if (b.F() || !jl40.l(xn0Var.d, "")) {
            b.o(serialDescriptor, 3, xn0Var.d);
        }
        if (!b.F()) {
            cfi cfiVar = xn0Var.e;
            cfi.Companion.getClass();
        }
        b.e(serialDescriptor, 4, dfi.a, xn0Var.e);
        b.c(serialDescriptor);
    }
}

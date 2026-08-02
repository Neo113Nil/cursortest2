package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final /* synthetic */ class w5g0 implements uxs {
    public static final w5g0 a;
    private static final SerialDescriptor descriptor;

    static {
        w5g0 w5g0Var = new w5g0();
        a = w5g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.qrcode.QrCodeCustomProps", w5g0Var, 6);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j("cutouts", true);
        pluginGeneratedSerialDescriptor.j("errorCorrectionLevel", true);
        pluginGeneratedSerialDescriptor.j("finderCornerRadius", true);
        pluginGeneratedSerialDescriptor.j("moduleCornerRadius", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = y5g0.g;
        auu0 auu0Var = auu0.a;
        udx udxVar = udx.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), auu0Var, udxVar, udxVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y5g0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        d dVar = null;
        d dVar2 = null;
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
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dVar = (d) b.A(serialDescriptor, 4, udx.a, dVar);
                    i |= 16;
                    break;
                case 5:
                    dVar2 = (d) b.A(serialDescriptor, 5, udx.a, dVar2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new y5g0(i, str, str2, list, str3, dVar, dVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y5g0 y5g0Var = (y5g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = y5g0.g;
        String str = y5g0Var.a;
        d dVar = y5g0Var.f;
        d dVar2 = y5g0Var.e;
        String str2 = y5g0Var.d;
        List list = y5g0Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, y5g0Var.b);
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        if (b.F() || !jl40.l(str2, "M")) {
            b.o(serialDescriptor, 3, str2);
        }
        if (b.F() || !jl40.l(dVar2, qcx.b(Double.valueOf(0.6d)))) {
            b.e(serialDescriptor, 4, udx.a, dVar2);
        }
        if (b.F() || !jl40.l(dVar, qcx.b(Double.valueOf(1.0d)))) {
            b.e(serialDescriptor, 5, udx.a, dVar);
        }
        b.c(serialDescriptor);
    }
}

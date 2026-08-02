package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$OpenFormat;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class twe0 implements uxs {
    public static final twe0 a;
    private static final SerialDescriptor descriptor;

    static {
        twe0 twe0Var = new twe0();
        a = twe0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto", twe0Var, 5);
        pluginGeneratedSerialDescriptor.j("openFormat", false);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("modalHeight", true);
        pluginGeneratedSerialDescriptor.j("shadowAlpha", true);
        pluginGeneratedSerialDescriptor.j("disableClose", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{exe0.f[0].getValue(), qke.n(vwe0.a), qke.n(ywe0.a), qke.n(h6w.a), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = exe0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat = null;
        xwe0 xwe0Var = null;
        bxe0 bxe0Var = null;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                presentationOptionsDto$OpenFormat = (PresentationOptionsDto$OpenFormat) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), presentationOptionsDto$OpenFormat);
                i |= 1;
            } else if (v == 1) {
                xwe0Var = (xwe0) b.s(serialDescriptor, 1, vwe0.a, xwe0Var);
                i |= 2;
            } else if (v == 2) {
                bxe0Var = (bxe0) b.s(serialDescriptor, 2, ywe0.a, bxe0Var);
                i |= 4;
            } else if (v == 3) {
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new exe0(i, presentationOptionsDto$OpenFormat, xwe0Var, bxe0Var, num, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        exe0 exe0Var = (exe0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) exe0.f[0].getValue();
        PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat = exe0Var.a;
        Boolean bool = exe0Var.e;
        Integer num = exe0Var.d;
        bxe0 bxe0Var = exe0Var.c;
        xwe0 xwe0Var = exe0Var.b;
        b.e(serialDescriptor, 0, kSerializer, presentationOptionsDto$OpenFormat);
        if (b.F() || xwe0Var != null) {
            b.g(serialDescriptor, 1, vwe0.a, xwe0Var);
        }
        if (b.F() || bxe0Var != null) {
            b.g(serialDescriptor, 2, ywe0.a, bxe0Var);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 3, h6w.a, num);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 4, z96.a, bool);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

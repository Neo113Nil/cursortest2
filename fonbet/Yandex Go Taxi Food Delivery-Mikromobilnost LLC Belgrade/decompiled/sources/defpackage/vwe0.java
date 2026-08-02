package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ToolbarNavigationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class vwe0 implements uxs {
    public static final vwe0 a;
    private static final SerialDescriptor descriptor;

    static {
        vwe0 vwe0Var = new vwe0();
        a = vwe0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.Header", vwe0Var, 3);
        pluginGeneratedSerialDescriptor.j("showNavigationBar", true);
        pluginGeneratedSerialDescriptor.j("showDash", true);
        pluginGeneratedSerialDescriptor.j("navigationBarType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xwe0.d;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xwe0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                presentationOptionsDto$ToolbarNavigationType = (PresentationOptionsDto$ToolbarNavigationType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), presentationOptionsDto$ToolbarNavigationType);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xwe0(i, bool, bool2, presentationOptionsDto$ToolbarNavigationType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xwe0 xwe0Var = (xwe0) obj;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType = xwe0Var.c;
        Boolean bool = xwe0Var.b;
        Boolean bool2 = xwe0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xwe0.d;
        if (b.F() || bool2 != null) {
            b.g(serialDescriptor, 0, z96.a, bool2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 1, z96.a, bool);
        }
        if (b.F() || presentationOptionsDto$ToolbarNavigationType != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), presentationOptionsDto$ToolbarNavigationType);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

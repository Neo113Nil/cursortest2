package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import flex.theme.ThemedColor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class qyp0 implements uxs {
    public static final qyp0 a;
    private static final SerialDescriptor descriptor;

    static {
        qyp0 qyp0Var = new qyp0();
        a = qyp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.model.SectionAppearance", qyp0Var, 1);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) syp0.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = syp0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        ThemedColor themedColor = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                themedColor = (ThemedColor) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), themedColor);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new syp0(i, themedColor);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        syp0 syp0Var = (syp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = syp0.b;
        if (b.F() || syp0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), syp0Var.a);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

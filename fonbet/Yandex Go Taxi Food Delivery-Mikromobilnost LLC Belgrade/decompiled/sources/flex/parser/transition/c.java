package flex.parser.transition;

import defpackage.e6m;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option", cVar, 3);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("interpolator", true);
        pluginGeneratedSerialDescriptor.j("transition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = g.d;
        return new KSerializer[]{e6m.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = g.d;
        b.getClass();
        int i = 0;
        double d = 0.0d;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator = null;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator = (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition = (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new g(i, d, transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator, transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = g.d;
        double d = gVar.a;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition = gVar.c;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator = gVar.b;
        b.E(serialDescriptor, 0, d);
        if (b.F() || transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator);
        }
        if (b.F() || transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}

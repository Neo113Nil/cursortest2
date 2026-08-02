package ru.yandex.taxi.themes.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment", aVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("invite", true);
        pluginGeneratedSerialDescriptor.j("follow_sunset_option", true);
        pluginGeneratedSerialDescriptor.j("default_setting", true);
        pluginGeneratedSerialDescriptor.j("system_theme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DarkThemeSwitchExperiment.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, qke.n(b.a), z96Var, i3yVarArr[3].getValue(), z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DarkThemeSwitchExperiment.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        DarkThemeSwitchExperiment.a aVar = null;
        DarkThemeSwitchExperiment.ThemeDefaultSetting themeDefaultSetting = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (DarkThemeSwitchExperiment.a) b.s(serialDescriptor, 1, b.a, aVar);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                themeDefaultSetting = (DarkThemeSwitchExperiment.ThemeDefaultSetting) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), themeDefaultSetting);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new DarkThemeSwitchExperiment(i, z2, aVar, z3, themeDefaultSetting, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DarkThemeSwitchExperiment.g;
        if (b.F() || darkThemeSwitchExperiment.b) {
            b.n(serialDescriptor, 0, darkThemeSwitchExperiment.b);
        }
        if (b.F() || darkThemeSwitchExperiment.c != null) {
            b.g(serialDescriptor, 1, b.a, darkThemeSwitchExperiment.c);
        }
        if (b.F() || darkThemeSwitchExperiment.d) {
            b.n(serialDescriptor, 2, darkThemeSwitchExperiment.d);
        }
        if (b.F() || darkThemeSwitchExperiment.e != DarkThemeSwitchExperiment.ThemeDefaultSetting.DARK_THEME_OFF) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), darkThemeSwitchExperiment.e);
        }
        if (b.F() || darkThemeSwitchExperiment.f) {
            b.n(serialDescriptor, 4, darkThemeSwitchExperiment.f);
        }
        b.c(serialDescriptor);
    }
}

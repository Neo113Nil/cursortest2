package flex.parser.transition;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.tc01;
import kotlin.LazyThreadSafetyMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class g {
    public static final d Companion = new d();
    public static final i3y[] d;
    public final double a;
    public final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator b;
    public final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new tc01(19)), kotlin.a.b(lazyThreadSafetyMode, new tc01(20))};
    }

    public /* synthetic */ g(int i, double d2, TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator, TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, c.a.getDescriptor());
            throw null;
        }
        this.a = d2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition;
        }
    }

    public final double a() {
        return this.a;
    }

    public final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator b() {
        return this.b;
    }

    public final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(this.a, gVar.a) == 0 && this.b == gVar.b && this.c == gVar.c;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator = this.b;
        int hashCode2 = (hashCode + (transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator == null ? 0 : transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.hashCode())) * 31;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition = this.c;
        return hashCode2 + (transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition != null ? transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.hashCode() : 0);
    }

    public final String toString() {
        return "Option(duration=" + this.a + ", interpolator=" + this.b + ", transition=" + this.c + Extension.C_BRAKE;
    }
}

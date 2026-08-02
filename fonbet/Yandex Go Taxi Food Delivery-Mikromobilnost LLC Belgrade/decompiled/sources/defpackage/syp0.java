package defpackage;

import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsyp0;", "", "Companion", "qyp0", "ryp0", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class syp0 {
    public static final ryp0 Companion = new ryp0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(5))};
    public final ThemedColor a;

    public /* synthetic */ syp0(int i, ThemedColor themedColor) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = themedColor;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return syp0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((syp0) obj).a);
    }

    public final int hashCode() {
        ThemedColor themedColor = this.a;
        if (themedColor != null) {
            return themedColor.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SectionAppearance(backgroundColor=" + this.a + Extension.C_BRAKE;
    }

    public syp0() {
        this(0);
    }

    public syp0(int i) {
        this.a = null;
    }
}

package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;

@gsq0(with = gsg.class)
/* loaded from: classes4.dex */
public final class vrg extends trg {
    public static final urg Companion = new urg();
    public final int b;

    public vrg(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        w511.f(oyr.j(i, "Unit duration must be positive, but was ", " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vrg) {
            return this.b == ((vrg) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 65536;
    }

    public final String toString() {
        int i = this.b;
        return i % 7 == 0 ? asg.a(i / 7, "WEEK") : asg.a(i, DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE);
    }
}

package defpackage;

import com.yandex.div.internal.drawable.RadialGradientDrawable$Radius$Relative$Type;

/* loaded from: classes11.dex */
public final class t5i0 extends u5i0 {
    public final RadialGradientDrawable$Radius$Relative$Type a;

    public t5i0(RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type) {
        this.a = radialGradientDrawable$Radius$Relative$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5i0) && this.a == ((t5i0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Relative(type=" + this.a + ')';
    }
}

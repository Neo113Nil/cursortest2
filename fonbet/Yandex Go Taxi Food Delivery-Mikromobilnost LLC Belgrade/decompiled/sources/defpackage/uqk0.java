package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.RideTimeAppearanceType;

/* loaded from: classes6.dex */
public final class uqk0 extends pqk0 {
    public final Drawable a;

    public uqk0(Drawable drawable) {
        RideTimeAppearanceType rideTimeAppearanceType = RideTimeAppearanceType.PLAIN_TEXT;
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqk0) && jl40.l(this.a, ((uqk0) obj).a);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.hashCode();
    }

    public final String toString() {
        return "RideTimeTextWithIcon(icon=" + this.a + Extension.C_BRAKE;
    }

    public uqk0() {
        this(null);
    }
}

package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xbm0 {
    public final ColorModel a;

    public xbm0(ColorModel colorModel) {
        this.a = colorModel;
    }

    public final ColorModel a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbm0) && this.a.equals(((xbm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Theme(descriptionTextColor=" + this.a + Extension.C_BRAKE;
    }
}

package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rlk {
    public final ColorModel a;
    public final float b;

    public rlk(float f, ColorModel colorModel) {
        this.a = colorModel;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlk)) {
            return false;
        }
        rlk rlkVar = (rlk) obj;
        return this.a.equals(rlkVar.a) && Float.compare(this.b, rlkVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorStop(color=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}

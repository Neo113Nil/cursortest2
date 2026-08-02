package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r0q0 extends s0q0 {
    public final BitmapDrawable a;

    public r0q0(BitmapDrawable bitmapDrawable) {
        this.a = bitmapDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0q0) && this.a.equals(((r0q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.a + Extension.C_BRAKE;
    }
}

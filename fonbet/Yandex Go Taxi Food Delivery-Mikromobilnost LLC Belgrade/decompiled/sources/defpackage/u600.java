package defpackage;

import android.graphics.drawable.ShapeDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u600 extends x600 {
    public final ShapeDrawable a;

    public u600(ShapeDrawable shapeDrawable) {
        this.a = shapeDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u600) && this.a.equals(((u600) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CustomDrawable(drawable=" + this.a + Extension.C_BRAKE;
    }
}

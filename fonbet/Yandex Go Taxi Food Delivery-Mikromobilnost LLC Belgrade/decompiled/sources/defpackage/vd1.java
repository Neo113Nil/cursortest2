package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vd1 {
    public final ImageProvider a;
    public final int b;
    public final rl6 c;

    public vd1(ImageProvider imageProvider, int i, rl6 rl6Var) {
        this.a = imageProvider;
        this.b = i;
        this.c = rl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return jl40.l(this.a, vd1Var.a) && this.b == vd1Var.b && jl40.l(this.c, vd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BubbleRenderResult(image=" + this.a + ", heightPx=" + this.b + ", bubble=" + this.c + Extension.C_BRAKE;
    }
}

package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class td1 {
    public final ImageProvider a;
    public final int b;
    public final rl6 c;

    public td1(ImageProvider imageProvider, int i, rl6 rl6Var) {
        this.a = imageProvider;
        this.b = i;
        this.c = rl6Var;
    }

    public final int a() {
        return this.b;
    }

    public final ImageProvider b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof td1) {
            td1 td1Var = (td1) obj;
            return jl40.l(this.a, td1Var.a) && this.b == td1Var.b && this.c == td1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BubbleRenderResult(image=" + this.a + ", heightPx=" + this.b + ", bubble=" + this.c + Extension.C_BRAKE;
    }
}

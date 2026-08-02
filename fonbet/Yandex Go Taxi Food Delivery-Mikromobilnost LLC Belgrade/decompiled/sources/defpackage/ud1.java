package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ud1 {
    public final ImageProvider a;
    public final int b;
    public final int c;

    public ud1(ImageProvider imageProvider, int i, int i2) {
        this.a = imageProvider;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final ImageProvider b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud1)) {
            return false;
        }
        ud1 ud1Var = (ud1) obj;
        return this.a.equals(ud1Var.a) && this.b == ud1Var.b && this.c == ud1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenderedImage(provider=");
        sb.append(this.a);
        sb.append(", widthPx=");
        sb.append(this.b);
        sb.append(", heightPx=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}

package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.linked_order.models.data.IconType;

/* loaded from: classes5.dex */
public final class w48 {
    public final ImageProvider a;
    public final IconType b;
    public final boolean c;

    public w48(ImageProvider imageProvider, IconType iconType, boolean z) {
        this.a = imageProvider;
        this.b = iconType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w48)) {
            return false;
        }
        w48 w48Var = (w48) obj;
        return jl40.l(this.a, w48Var.a) && this.b == w48Var.b && this.c == w48Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarIconInfo(image=");
        sb.append(this.a);
        sb.append(", iconType=");
        sb.append(this.b);
        sb.append(", isOrderFinisehd=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}

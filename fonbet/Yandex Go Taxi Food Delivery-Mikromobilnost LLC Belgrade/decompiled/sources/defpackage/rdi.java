package defpackage;

import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rdi {
    public final ImageProvider a;
    public final IconStyle b;

    public rdi(ImageProvider imageProvider, IconStyle iconStyle) {
        this.a = imageProvider;
        this.b = iconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdi)) {
            return false;
        }
        rdi rdiVar = (rdi) obj;
        return jl40.l(this.a, rdiVar.a) && jl40.l(this.b, rdiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        IconStyle iconStyle = this.b;
        return hashCode + (iconStyle == null ? 0 : iconStyle.hashCode());
    }

    public final String toString() {
        return "DeliveryMapPin(image=" + this.a + ", iconStyle=" + this.b + Extension.C_BRAKE;
    }
}

package defpackage;

import com.yandex.go.address.models.PlaceType;
import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z050 {
    public final String a;
    public final PlaceType b;
    public final zzs c;
    public final ImageProvider d;
    public final boolean e;
    public final ImageProvider f;

    public z050(String str, PlaceType placeType, zzs zzsVar, ImageProvider imageProvider, boolean z, ImageProvider imageProvider2) {
        this.a = str;
        this.b = placeType;
        this.c = zzsVar;
        this.d = imageProvider;
        this.e = z;
        this.f = imageProvider2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z050)) {
            return false;
        }
        z050 z050Var = (z050) obj;
        return jl40.l(this.a, z050Var.a) && this.b == z050Var.b && jl40.l(this.c, z050Var.c) && jl40.l(this.d, z050Var.d) && this.e == z050Var.e && jl40.l(this.f, z050Var.f);
    }

    public final int hashCode() {
        int e = unr0.e((this.d.hashCode() + nnm.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e);
        ImageProvider imageProvider = this.f;
        return e + (imageProvider == null ? 0 : imageProvider.hashCode());
    }

    public final String toString() {
        return "MyPlacesPin(id=" + this.a + ", type=" + this.b + ", location=" + this.c + ", icon=" + this.d + ", isSelected=" + this.e + ", selectedIcon=" + this.f + Extension.C_BRAKE;
    }
}

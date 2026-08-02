package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class uaf0 implements yaf0 {
    public final ProductsScreenType$Type e;
    public boolean f = true;

    public uaf0(ProductsScreenType$Type productsScreenType$Type) {
        this.e = productsScreenType$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uaf0) && this.e == ((uaf0) obj).e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Main(type=" + this.e + Extension.C_BRAKE;
    }
}

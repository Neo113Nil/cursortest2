package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

/* loaded from: classes14.dex */
public final class vb90 {
    public final FloatButtonHolderLayout a;
    public final Address b;
    public final FrameLayout c;

    public vb90(FloatButtonHolderLayout floatButtonHolderLayout, Address address, FrameLayout frameLayout) {
        this.a = floatButtonHolderLayout;
        this.b = address;
        this.c = frameLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb90)) {
            return false;
        }
        vb90 vb90Var = (vb90) obj;
        return jl40.l(this.a, vb90Var.a) && jl40.l(this.b, vb90Var.b) && jl40.l(this.c, vb90Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Address address = this.b;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        FrameLayout frameLayout = this.c;
        return hashCode2 + (frameLayout != null ? frameLayout.hashCode() : 0);
    }

    public final String toString() {
        return "PanoramaEntryPointSnapshot(floatButtonHolderLayout=" + this.a + ", sourceAddress=" + this.b + ", tooltipContainer=" + this.c + Extension.C_BRAKE;
    }
}

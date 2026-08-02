package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Size;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t510 {
    public final k510 a;
    public final h510 b;
    public final s510 c;
    public final n410 d;
    public final MasstransitSlotItemUiState$Size e;

    static {
        m410 m410Var = m410.INSTANCE;
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.XS;
    }

    public t510(k510 k510Var, h510 h510Var, s510 s510Var, n410 n410Var, MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size) {
        this.a = k510Var;
        this.b = h510Var;
        this.c = s510Var;
        this.d = n410Var;
        this.e = masstransitSlotItemUiState$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t510)) {
            return false;
        }
        t510 t510Var = (t510) obj;
        return jl40.l(this.a, t510Var.a) && jl40.l(this.b, t510Var.b) && jl40.l(this.c, t510Var.c) && jl40.l(this.d, t510Var.d) && this.e == t510Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MasstransitSlotItemUiState(lead=" + this.a + ", body=" + this.b + ", trail=" + this.c + ", action=" + this.d + ", size=" + this.e + Extension.C_BRAKE;
    }
}

package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xss0 {
    public static final xss0 f = new xss0(ess0.a, yrs0.a, rss0.a, new mqs0(), SlotItemUiState$Size.L);
    public final gss0 a;
    public final css0 b;
    public final tss0 c;
    public final nqs0 d;
    public final SlotItemUiState$Size e;

    public xss0(gss0 gss0Var, css0 css0Var, tss0 tss0Var, nqs0 nqs0Var, SlotItemUiState$Size slotItemUiState$Size) {
        this.a = gss0Var;
        this.b = css0Var;
        this.c = tss0Var;
        this.d = nqs0Var;
        this.e = slotItemUiState$Size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [nqs0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [gss0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [css0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [tss0] */
    public static xss0 a(xss0 xss0Var, fss0 fss0Var, zrs0 zrs0Var, hss0 hss0Var, ibk0 ibk0Var, SlotItemUiState$Size slotItemUiState$Size, int i) {
        fss0 fss0Var2 = fss0Var;
        if ((i & 1) != 0) {
            fss0Var2 = xss0Var.a;
        }
        fss0 fss0Var3 = fss0Var2;
        zrs0 zrs0Var2 = zrs0Var;
        if ((i & 2) != 0) {
            zrs0Var2 = xss0Var.b;
        }
        zrs0 zrs0Var3 = zrs0Var2;
        hss0 hss0Var2 = hss0Var;
        if ((i & 4) != 0) {
            hss0Var2 = xss0Var.c;
        }
        hss0 hss0Var3 = hss0Var2;
        ibk0 ibk0Var2 = ibk0Var;
        if ((i & 8) != 0) {
            ibk0Var2 = xss0Var.d;
        }
        ibk0 ibk0Var3 = ibk0Var2;
        if ((i & 16) != 0) {
            slotItemUiState$Size = xss0Var.e;
        }
        xss0Var.getClass();
        return new xss0(fss0Var3, zrs0Var3, hss0Var3, ibk0Var3, slotItemUiState$Size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xss0)) {
            return false;
        }
        xss0 xss0Var = (xss0) obj;
        return jl40.l(this.a, xss0Var.a) && jl40.l(this.b, xss0Var.b) && jl40.l(this.c, xss0Var.c) && jl40.l(this.d, xss0Var.d) && this.e == xss0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SlotItemUiState(lead=" + this.a + ", body=" + this.b + ", trail=" + this.c + ", action=" + this.d + ", size=" + this.e + Extension.C_BRAKE;
    }
}

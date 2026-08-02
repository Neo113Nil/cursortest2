package defpackage;

import com.yandex.go.design.compose.list.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vq5 {
    public static final uq5 c = new uq5();
    public final bpl0 a;
    public final boolean b;

    static {
        a.b(EmptyList.a, new mq5(1));
    }

    public vq5(bpl0 bpl0Var, boolean z) {
        this.a = bpl0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq5)) {
            return false;
        }
        vq5 vq5Var = (vq5) obj;
        return jl40.l(this.a, vq5Var.a) && this.b == vq5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "BidsListUiState(bids=" + this.a + ", isProgressEnabled=" + this.b + Extension.C_BRAKE;
    }
}

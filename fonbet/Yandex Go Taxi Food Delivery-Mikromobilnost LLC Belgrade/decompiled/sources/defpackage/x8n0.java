package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class x8n0 {
    public final List a;
    public final int b;
    public final boolean c;

    public x8n0(ListBuilder listBuilder, int i, boolean z) {
        this.a = listBuilder;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8n0)) {
            return false;
        }
        x8n0 x8n0Var = (x8n0) obj;
        return jl40.l(this.a, x8n0Var.a) && this.b == x8n0Var.b && this.c == x8n0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersCompletionAcceptanceUiState(items=");
        sb.append(this.a);
        sb.append(", doneButtonStringId=");
        sb.append(this.b);
        sb.append(", lockButtonVisible=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}

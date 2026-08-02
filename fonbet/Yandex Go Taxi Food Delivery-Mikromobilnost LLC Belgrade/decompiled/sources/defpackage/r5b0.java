package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r5b0 {
    public final List a;
    public final Long b;

    public r5b0(List list, Long l) {
        this.a = list;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5b0)) {
            return false;
        }
        r5b0 r5b0Var = (r5b0) obj;
        return jl40.l(this.a, r5b0Var.a) && jl40.l(this.b, r5b0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "PersonalOrganizationsUiState(organizations=" + this.a + ", currentOrganizationId=" + this.b + Extension.C_BRAKE;
    }

    public r5b0() {
        this(0);
    }

    public /* synthetic */ r5b0(int i) {
        this(EmptyList.a, null);
    }
}

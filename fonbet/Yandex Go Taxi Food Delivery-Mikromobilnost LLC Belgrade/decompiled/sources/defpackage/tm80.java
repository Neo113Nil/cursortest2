package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tm80 {
    public final List a;
    public final ArrayList b;

    public tm80(ListBuilder listBuilder, ArrayList arrayList) {
        this.a = listBuilder;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm80)) {
            return false;
        }
        tm80 tm80Var = (tm80) obj;
        return jl40.l(this.a, tm80Var.a) && this.b.equals(tm80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationsFiltersUiState(filterBlocks=" + this.a + ", buttons=" + this.b + Extension.C_BRAKE;
    }
}

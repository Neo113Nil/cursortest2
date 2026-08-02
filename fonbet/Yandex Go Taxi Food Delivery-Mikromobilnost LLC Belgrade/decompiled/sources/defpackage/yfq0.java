package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yfq0 {
    public final List a;

    public yfq0(List list) {
        this.a = list;
    }

    public final String a() {
        h9b0 h9b0Var = (h9b0) a.b0(this.a);
        if (h9b0Var != null) {
            return h9b0Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfq0) && jl40.l(this.a, ((yfq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SelectedCategoriesInfo(selectedCategoriesPath=", Extension.C_BRAKE, this.a);
    }

    public yfq0() {
        this(0);
    }

    public /* synthetic */ yfq0(int i) {
        this(EmptyList.a);
    }
}

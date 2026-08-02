package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yt30 {
    public final List a;

    public yt30(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt30) && jl40.l(this.a, ((yt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtPurchaseFooterUiState(buttons=", Extension.C_BRAKE, this.a);
    }

    public yt30() {
        this(EmptyList.a);
    }
}

package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rlq0 extends n351 {
    public final List c;
    public final CharSequence d;
    public final x2s e;
    public final String f;

    public rlq0(List list, CharSequence charSequence, x2s x2sVar, String str) {
        super("selector", false, 14);
        this.c = list;
        this.d = charSequence;
        this.e = x2sVar;
        this.f = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlq0)) {
            return false;
        }
        rlq0 rlq0Var = (rlq0) obj;
        return jl40.l(this.c, rlq0Var.c) && jl40.l(this.d, rlq0Var.d) && this.e.equals(rlq0Var.e) && jl40.l(this.f, rlq0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        CharSequence charSequence = this.d;
        int a = tse0.a(this.e, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        String str = this.f;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SelectorModel(items=" + this.c + ", bottomText=" + ((Object) this.d) + ", onShownAnalyticsData=" + this.e + ", id=" + this.f + Extension.C_BRAKE;
    }
}

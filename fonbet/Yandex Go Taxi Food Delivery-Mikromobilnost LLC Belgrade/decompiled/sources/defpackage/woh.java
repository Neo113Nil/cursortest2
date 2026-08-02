package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class woh {
    public final List a;
    public final String b;

    public woh(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woh)) {
            return false;
        }
        woh wohVar = (woh) obj;
        return this.a.equals(wohVar.a) && jl40.l(this.b, wohVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb.append(this.a);
        sb.append(", label=");
        return b64.p(sb, this.b, ')');
    }
}

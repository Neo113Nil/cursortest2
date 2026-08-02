package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class uiu0 implements wiu0 {
    public final CharSequence a;
    public final List b;
    public final req0 c;
    public final String d;
    public final String e;

    public /* synthetic */ uiu0(String str, List list, req0 req0Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? null : req0Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiu0)) {
            return false;
        }
        uiu0 uiu0Var = (uiu0) obj;
        return jl40.l(this.a, uiu0Var.a) && jl40.l(this.b, uiu0Var.b) && jl40.l(this.c, uiu0Var.c) && jl40.l(this.d, uiu0Var.d) && jl40.l(this.e, uiu0Var.e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int c = unr0.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        req0 req0Var = this.c;
        int hashCode = (c + (req0Var == null ? 0 : req0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopsSuccessUIState(title=");
        sb.append((Object) this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", selectStopAction=");
        sb.append(this.c);
        sb.append(", directionId=");
        sb.append(this.d);
        sb.append(", selectedStartingStopId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public uiu0(CharSequence charSequence, List list, req0 req0Var, String str, String str2) {
        this.a = charSequence;
        this.b = list;
        this.c = req0Var;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uiu0() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }
}

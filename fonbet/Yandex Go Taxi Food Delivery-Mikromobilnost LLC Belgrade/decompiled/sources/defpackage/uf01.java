package defpackage;

import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uf01 {
    public final String a;
    public final String b;
    public final String c;
    public final ppl d;
    public final TransactionsState e;
    public final Throwable f;
    public final boolean g;

    public uf01(String str, String str2, String str3, ppl pplVar, TransactionsState transactionsState, Throwable th, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pplVar;
        this.e = transactionsState;
        this.f = th;
        this.g = z;
    }

    public static uf01 a(uf01 uf01Var, String str, String str2, ppl pplVar, TransactionsState transactionsState, Throwable th, boolean z, int i) {
        if ((i & 1) != 0) {
            str = uf01Var.a;
        }
        String str3 = str;
        String str4 = (i & 2) != 0 ? uf01Var.b : null;
        if ((i & 4) != 0) {
            str2 = uf01Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            pplVar = uf01Var.d;
        }
        ppl pplVar2 = pplVar;
        if ((i & 16) != 0) {
            transactionsState = uf01Var.e;
        }
        TransactionsState transactionsState2 = transactionsState;
        if ((i & 32) != 0) {
            th = uf01Var.f;
        }
        Throwable th2 = th;
        if ((i & 64) != 0) {
            z = uf01Var.g;
        }
        uf01Var.getClass();
        return new uf01(str3, str4, str5, pplVar2, transactionsState2, th2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf01)) {
            return false;
        }
        uf01 uf01Var = (uf01) obj;
        return jl40.l(this.a, uf01Var.a) && jl40.l(this.b, uf01Var.b) && jl40.l(this.c, uf01Var.c) && jl40.l(this.d, uf01Var.d) && this.e == uf01Var.e && jl40.l(this.f, uf01Var.f) && this.g == uf01Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ppl pplVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (pplVar == null ? 0 : pplVar.hashCode())) * 31)) * 31;
        Throwable th = this.f;
        return Boolean.hashCode(this.g) + ((hashCode4 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransactionsScreenState(title=", this.a, ", subtitle=", this.b, ", amount=");
        v.append(this.c);
        v.append(", transactions=");
        v.append(this.d);
        v.append(", transactionsState=");
        v.append(this.e);
        v.append(", error=");
        v.append(this.f);
        v.append(", refreshFailed=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    public uf01() {
        this(0);
    }

    public /* synthetic */ uf01(int i) {
        this("", null, null, null, TransactionsState.IDLE, null, false);
    }
}

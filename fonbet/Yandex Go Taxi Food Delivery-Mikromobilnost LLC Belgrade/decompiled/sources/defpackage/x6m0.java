package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import com.ybsdk.feature.savings.internal.entities.PlusSubscriptionStatus;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x6m0 {
    public final String a;
    public final String b;
    public final rr51 c;
    public final AccountType d;
    public final MoneyEntity e;
    public final String f;
    public final boolean g;
    public final String h;
    public final MoneyEntity i;
    public final MoneyEntity j;
    public final String k;
    public final b3m0 l;
    public final List m;
    public final ArrayList n;
    public final PlusSubscriptionStatus o;

    public x6m0(String str, String str2, rr51 rr51Var, AccountType accountType, MoneyEntity moneyEntity, String str3, boolean z, String str4, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, String str5, b3m0 b3m0Var, List list, ArrayList arrayList, PlusSubscriptionStatus plusSubscriptionStatus) {
        this.a = str;
        this.b = str2;
        this.c = rr51Var;
        this.d = accountType;
        this.e = moneyEntity;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = moneyEntity2;
        this.j = moneyEntity3;
        this.k = str5;
        this.l = b3m0Var;
        this.m = list;
        this.n = arrayList;
        this.o = plusSubscriptionStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof x6m0) {
                x6m0 x6m0Var = (x6m0) obj;
                if (jl40.l(this.a, x6m0Var.a) && jl40.l(this.b, x6m0Var.b) && jl40.l(this.c, x6m0Var.c) && this.d == x6m0Var.d && jl40.l(this.e, x6m0Var.e) && jl40.l(this.f, x6m0Var.f) && this.g == x6m0Var.g && jl40.l(this.h, x6m0Var.h) && jl40.l(this.i, x6m0Var.i) && jl40.l(this.j, x6m0Var.j)) {
                    String str = x6m0Var.k;
                    String str2 = this.k;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && jl40.l(this.l, x6m0Var.l) && jl40.l(this.m, x6m0Var.m) && this.n.equals(x6m0Var.n) && this.o == x6m0Var.o) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rr51 rr51Var = this.c;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        AccountType accountType = this.d;
        int d = ly3.d(this.e, (hashCode3 + (accountType == null ? 0 : accountType.hashCode())) * 31, 31);
        String str2 = this.f;
        int e = unr0.e((d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        MoneyEntity moneyEntity = this.i;
        int d2 = ly3.d(this.j, (hashCode4 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31, 31);
        String str4 = this.k;
        int hashCode5 = (d2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b3m0 b3m0Var = this.l;
        return this.o.hashCode() + ly3.b(unr0.c((hashCode5 + (b3m0Var != null ? b3m0Var.hashCode() : 0)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        String str = this.k;
        String a = str == null ? "null" : jr.a(str);
        StringBuilder v = b64.v("SavingsAccountInfoEntity(title=", this.a, ", subtitle=", this.b, ", divSubtitle=");
        v.append(this.c);
        v.append(", accountType=");
        v.append(this.d);
        v.append(", gains=");
        v.append(this.e);
        v.append(", gainsHint=");
        v.append(this.f);
        v.append(", gainsLocked=");
        unr0.A(", gainsPaymentTerm=", this.h, ", target=", v, this.g);
        v.append(this.i);
        v.append(", balance=");
        v.append(this.j);
        v.append(", supportAction=");
        v.append(a);
        v.append(", buttonGroup=");
        v.append(this.l);
        v.append(", widgets=");
        v.append(this.m);
        v.append(", themes=");
        v.append(this.n);
        v.append(", plusSubscriptionStatus=");
        v.append(this.o);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

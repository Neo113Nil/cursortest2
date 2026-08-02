package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditType;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class waf {
    public final String a;
    public final u8j0 b;
    public final saf c;
    public final MoneyEntity d;
    public final Text e;
    public final u8j0 f;
    public final List g;
    public final rr51 h;
    public final vaf i;
    public final s2e0 j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Text o;
    public final CreditType p;
    public final boolean q;
    public final List r;

    public waf(String str, u8j0 u8j0Var, saf safVar, MoneyEntity moneyEntity, Text text, u8j0 u8j0Var2, List list, rr51 rr51Var, vaf vafVar, s2e0 s2e0Var, String str2, String str3, String str4, String str5, Text text2, CreditType creditType, boolean z, List list2) {
        this.a = str;
        this.b = u8j0Var;
        this.c = safVar;
        this.d = moneyEntity;
        this.e = text;
        this.f = u8j0Var2;
        this.g = list;
        this.h = rr51Var;
        this.i = vafVar;
        this.j = s2e0Var;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = text2;
        this.p = creditType;
        this.q = z;
        this.r = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    public static waf a(waf wafVar, u8j0 u8j0Var, saf safVar, MoneyEntity moneyEntity, Text text, u8j0 u8j0Var2, List list, rr51 rr51Var, vaf vafVar, s2e0 s2e0Var, String str, String str2, String str3, String str4, Text text2, boolean z, ArrayList arrayList, int i) {
        CreditType creditType;
        boolean z2;
        String str5 = wafVar.a;
        u8j0 u8j0Var3 = (i & 2) != 0 ? wafVar.b : u8j0Var;
        saf safVar2 = (i & 4) != 0 ? wafVar.c : safVar;
        MoneyEntity moneyEntity2 = (i & 8) != 0 ? wafVar.d : moneyEntity;
        Text text3 = (i & 16) != 0 ? wafVar.e : text;
        u8j0 u8j0Var4 = (i & 32) != 0 ? wafVar.f : u8j0Var2;
        List list2 = (i & 64) != 0 ? wafVar.g : list;
        rr51 rr51Var2 = (i & 128) != 0 ? wafVar.h : rr51Var;
        vaf vafVar2 = (i & 256) != 0 ? wafVar.i : vafVar;
        s2e0 s2e0Var2 = (i & 512) != 0 ? wafVar.j : s2e0Var;
        String str6 = (i & 1024) != 0 ? wafVar.k : str;
        String str7 = (i & 2048) != 0 ? wafVar.l : str2;
        String str8 = (i & 4096) != 0 ? wafVar.m : str3;
        String str9 = (i & 8192) != 0 ? wafVar.n : str4;
        Text text4 = (i & 16384) != 0 ? wafVar.o : text2;
        CreditType creditType2 = wafVar.p;
        if ((i & 65536) != 0) {
            creditType = creditType2;
            z2 = wafVar.q;
        } else {
            creditType = creditType2;
            z2 = z;
        }
        boolean z3 = z2;
        ArrayList arrayList2 = (i & 131072) != 0 ? wafVar.r : arrayList;
        wafVar.getClass();
        return new waf(str5, u8j0Var3, safVar2, moneyEntity2, text3, u8j0Var4, list2, rr51Var2, vafVar2, s2e0Var2, str6, str7, str8, str9, text4, creditType, z3, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waf)) {
            return false;
        }
        waf wafVar = (waf) obj;
        return jl40.l(this.a, wafVar.a) && this.b.equals(wafVar.b) && jl40.l(this.c, wafVar.c) && this.d.equals(wafVar.d) && jl40.l(this.e, wafVar.e) && jl40.l(this.f, wafVar.f) && jl40.l(this.g, wafVar.g) && jl40.l(this.h, wafVar.h) && jl40.l(this.i, wafVar.i) && jl40.l(this.j, wafVar.j) && jl40.l(this.k, wafVar.k) && jl40.l(this.l, wafVar.l) && jl40.l(this.m, wafVar.m) && jl40.l(this.n, wafVar.n) && jl40.l(this.o, wafVar.o) && this.p == wafVar.p && this.q == wafVar.q && this.r.equals(wafVar.r);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        saf safVar = this.c;
        int d = ly3.d(this.d, (hashCode + (safVar == null ? 0 : safVar.hashCode())) * 31, 31);
        Text text = this.e;
        int hashCode2 = (d + (text == null ? 0 : text.hashCode())) * 31;
        u8j0 u8j0Var = this.f;
        int c = unr0.c((hashCode2 + (u8j0Var == null ? 0 : u8j0Var.hashCode())) * 31, 31, this.g);
        rr51 rr51Var = this.h;
        int hashCode3 = (c + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        vaf vafVar = this.i;
        int hashCode4 = (hashCode3 + (vafVar == null ? 0 : vafVar.hashCode())) * 31;
        s2e0 s2e0Var = this.j;
        int hashCode5 = (hashCode4 + (s2e0Var == null ? 0 : s2e0Var.hashCode())) * 31;
        String str = this.k;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Text text2 = this.o;
        return this.r.hashCode() + unr0.e((this.p.hashCode() + ((hashCode9 + (text2 != null ? text2.hashCode() : 0)) * 31)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreditDepositState(agreementId=");
        sb.append(this.a);
        sb.append(", creditPageDataRequestStatus=");
        sb.append(this.b);
        sb.append(", selectedPaymentItem=");
        sb.append(this.c);
        sb.append(", amountValue=");
        sb.append(this.d);
        sb.append(", amountDescriptionValue=");
        sb.append(this.e);
        sb.append(", amountCheckRequestStatus=");
        sb.append(this.f);
        sb.append(", suggests=");
        sb.append(this.g);
        sb.append(", divkitData=");
        sb.append(this.h);
        sb.append(", bottomSheetType=");
        sb.append(this.i);
        sb.append(", transactionPollingStatus=");
        sb.append(this.j);
        sb.append(", operationActionButtonAction=");
        g8e.D(sb, this.k, ", operationSubActionButtonAction=", this.l, ", lastTransactionId=");
        g8e.D(sb, this.m, ", newCardTrustId=", this.n, ", currentTooltipText=");
        sb.append(this.o);
        sb.append(", creditType=");
        sb.append(this.p);
        sb.append(", isKeyboardVisible=");
        sb.append(this.q);
        sb.append(", paymentMethodsList=");
        sb.append(this.r);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}

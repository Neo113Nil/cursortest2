package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u04 {
    public final u8j0 a;
    public final isz0 b;
    public final rr51 c;
    public final s24 d;
    public final r24 e;
    public final MoneyEntity f;
    public final su3 g;
    public final thq0 h;
    public final iaa0 i;
    public final String j;
    public final String k;
    public final String l;
    public final AutoTopupApiVersion m;
    public final uy21 n;
    public final boolean o;

    public u04(u8j0 u8j0Var, isz0 isz0Var, rr51 rr51Var, s24 s24Var, r24 r24Var, MoneyEntity moneyEntity, su3 su3Var, thq0 thq0Var, iaa0 iaa0Var, String str, String str2, String str3, AutoTopupApiVersion autoTopupApiVersion, uy21 uy21Var, boolean z) {
        this.a = u8j0Var;
        this.b = isz0Var;
        this.c = rr51Var;
        this.d = s24Var;
        this.e = r24Var;
        this.f = moneyEntity;
        this.g = su3Var;
        this.h = thq0Var;
        this.i = iaa0Var;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = autoTopupApiVersion;
        this.n = uy21Var;
        this.o = z;
    }

    public static u04 a(u04 u04Var, u8j0 u8j0Var, isz0 isz0Var, rr51 rr51Var, s24 s24Var, r24 r24Var, MoneyEntity moneyEntity, su3 su3Var, thq0 thq0Var, iaa0 iaa0Var, String str, String str2, String str3, AutoTopupApiVersion autoTopupApiVersion, uy21 uy21Var, boolean z, int i) {
        u8j0 u8j0Var2 = (i & 1) != 0 ? u04Var.a : u8j0Var;
        isz0 isz0Var2 = (i & 2) != 0 ? u04Var.b : isz0Var;
        rr51 rr51Var2 = (i & 4) != 0 ? u04Var.c : rr51Var;
        s24 s24Var2 = (i & 8) != 0 ? u04Var.d : s24Var;
        r24 r24Var2 = (i & 16) != 0 ? u04Var.e : r24Var;
        MoneyEntity moneyEntity2 = (i & 32) != 0 ? u04Var.f : moneyEntity;
        su3 su3Var2 = (i & 64) != 0 ? u04Var.g : su3Var;
        thq0 thq0Var2 = (i & 128) != 0 ? u04Var.h : thq0Var;
        iaa0 iaa0Var2 = (i & 256) != 0 ? u04Var.i : iaa0Var;
        String str4 = (i & 512) != 0 ? u04Var.j : str;
        String str5 = (i & 1024) != 0 ? u04Var.k : str2;
        String str6 = (i & 2048) != 0 ? u04Var.l : str3;
        AutoTopupApiVersion autoTopupApiVersion2 = (i & 4096) != 0 ? u04Var.m : autoTopupApiVersion;
        uy21 uy21Var2 = (i & 8192) != 0 ? u04Var.n : uy21Var;
        boolean z2 = (i & 16384) != 0 ? u04Var.o : z;
        u04Var.getClass();
        return new u04(u8j0Var2, isz0Var2, rr51Var2, s24Var2, r24Var2, moneyEntity2, su3Var2, thq0Var2, iaa0Var2, str4, str5, str6, autoTopupApiVersion2, uy21Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u04)) {
            return false;
        }
        u04 u04Var = (u04) obj;
        return jl40.l(this.a, u04Var.a) && jl40.l(this.b, u04Var.b) && jl40.l(this.c, u04Var.c) && jl40.l(this.d, u04Var.d) && jl40.l(this.e, u04Var.e) && jl40.l(this.f, u04Var.f) && jl40.l(this.g, u04Var.g) && jl40.l(this.h, u04Var.h) && jl40.l(this.i, u04Var.i) && jl40.l(this.j, u04Var.j) && jl40.l(this.k, u04Var.k) && jl40.l(this.l, u04Var.l) && this.m == u04Var.m && jl40.l(this.n, u04Var.n) && this.o == u04Var.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        isz0 isz0Var = this.b;
        int hashCode2 = (hashCode + (isz0Var == null ? 0 : isz0Var.hashCode())) * 31;
        rr51 rr51Var = this.c;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        s24 s24Var = this.d;
        int hashCode4 = (hashCode3 + (s24Var == null ? 0 : s24Var.hashCode())) * 31;
        r24 r24Var = this.e;
        int hashCode5 = (hashCode4 + (r24Var == null ? 0 : r24Var.hashCode())) * 31;
        MoneyEntity moneyEntity = this.f;
        int hashCode6 = (hashCode5 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        su3 su3Var = this.g;
        int hashCode7 = (hashCode6 + (su3Var == null ? 0 : su3Var.hashCode())) * 31;
        thq0 thq0Var = this.h;
        int hashCode8 = (hashCode7 + (thq0Var == null ? 0 : thq0Var.hashCode())) * 31;
        iaa0 iaa0Var = this.i;
        int hashCode9 = (hashCode8 + (iaa0Var == null ? 0 : iaa0Var.hashCode())) * 31;
        String str = this.j;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AutoTopupApiVersion autoTopupApiVersion = this.m;
        int hashCode13 = (hashCode12 + (autoTopupApiVersion == null ? 0 : autoTopupApiVersion.hashCode())) * 31;
        uy21 uy21Var = this.n;
        return Boolean.hashCode(this.o) + ((hashCode13 + (uy21Var != null ? uy21Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupSetupV2State(autoTopupSettingsResponse=");
        sb.append(this.a);
        sb.append(", toolbar=");
        sb.append(this.b);
        sb.append(", contentMainBlock=");
        sb.append(this.c);
        sb.append(", autoTopup=");
        sb.append(this.d);
        sb.append(", autoFund=");
        sb.append(this.e);
        sb.append(", prefillLimit=");
        sb.append(this.f);
        sb.append(", bottomSheetState=");
        sb.append(this.g);
        sb.append(", selectedPaymentMethod=");
        sb.append(this.h);
        sb.append(", paymentMethods=");
        sb.append(this.i);
        sb.append(", autoTopupId=");
        sb.append(this.j);
        sb.append(", agreementId=");
        g8e.D(sb, this.k, ", operationIdSaveAutoTopup=", this.l, ", apiVersionPolingForTwoAuth=");
        sb.append(this.m);
        sb.append(", validateEntity=");
        sb.append(this.n);
        sb.append(", isSaveSettings=");
        return x4e.i(sb, this.o, Extension.C_BRAKE);
    }

    public u04() {
        this(0);
    }

    public /* synthetic */ u04(int i) {
        this(new t8j0(), null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }
}

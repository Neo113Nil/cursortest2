package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tg6 implements vg6 {
    public final sl a;
    public final String b;
    public final String c;
    public final rr51 w;
    public final BottomSheetState$SelectAccount$Type x;

    public tg6(sl slVar, String str, String str2, rr51 rr51Var, BottomSheetState$SelectAccount$Type bottomSheetState$SelectAccount$Type) {
        this.a = slVar;
        this.b = str;
        this.c = str2;
        this.w = rr51Var;
        this.x = bottomSheetState$SelectAccount$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg6)) {
            return false;
        }
        tg6 tg6Var = (tg6) obj;
        return jl40.l(this.a, tg6Var.a) && jl40.l(this.b, tg6Var.b) && jl40.l(this.c, tg6Var.c) && jl40.l(this.w, tg6Var.w) && this.x == tg6Var.x;
    }

    public final int hashCode() {
        sl slVar = this.a;
        int hashCode = (slVar == null ? 0 : slVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        rr51 rr51Var = this.w;
        return this.x.hashCode() + ((hashCode3 + (rr51Var != null ? rr51Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SelectAccount(selectedAgreement=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", divkitData=" + this.w + ", type=" + this.x + Extension.C_BRAKE;
    }
}

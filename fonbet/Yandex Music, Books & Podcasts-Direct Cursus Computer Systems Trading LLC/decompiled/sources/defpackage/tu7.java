package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tu7 {
    public final bnq a;
    public final nso b;
    public final u7t c;
    public final ilm d;
    public final Bitmap.Config e;
    public final Boolean f;
    public final dq3 g;
    public final dq3 h;
    public final dq3 i;

    public tu7(bnq bnqVar, nso nsoVar, u7t u7tVar, ilm ilmVar, Bitmap.Config config, Boolean bool, dq3 dq3Var, dq3 dq3Var2, dq3 dq3Var3) {
        this.a = bnqVar;
        this.b = nsoVar;
        this.c = u7tVar;
        this.d = ilmVar;
        this.e = config;
        this.f = bool;
        this.g = dq3Var;
        this.h = dq3Var2;
        this.i = dq3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu7)) {
            return false;
        }
        tu7 tu7Var = (tu7) obj;
        return Intrinsics.d(this.a, tu7Var.a) && this.b == tu7Var.b && Intrinsics.d(this.c, tu7Var.c) && this.d == tu7Var.d && this.e == tu7Var.e && Intrinsics.d(this.f, tu7Var.f) && this.g == tu7Var.g && this.h == tu7Var.h && this.i == tu7Var.i;
    }

    public final int hashCode() {
        bnq bnqVar = this.a;
        int hashCode = (bnqVar != null ? bnqVar.hashCode() : 0) * 31;
        nso nsoVar = this.b;
        int hashCode2 = (hashCode + (nsoVar != null ? nsoVar.hashCode() : 0)) * 28629151;
        u7t u7tVar = this.c;
        int hashCode3 = (hashCode2 + (u7tVar != null ? u7tVar.hashCode() : 0)) * 31;
        ilm ilmVar = this.d;
        int hashCode4 = (hashCode3 + (ilmVar != null ? ilmVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.e;
        int hashCode5 = (hashCode4 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 961;
        dq3 dq3Var = this.g;
        int hashCode7 = (hashCode6 + (dq3Var != null ? dq3Var.hashCode() : 0)) * 31;
        dq3 dq3Var2 = this.h;
        int hashCode8 = (hashCode7 + (dq3Var2 != null ? dq3Var2.hashCode() : 0)) * 31;
        dq3 dq3Var3 = this.i;
        return hashCode8 + (dq3Var3 != null ? dq3Var3.hashCode() : 0);
    }
}

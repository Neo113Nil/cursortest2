package defpackage;

import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rgs0 {
    public final u8j0 a;
    public final boolean b;
    public final u8j0 c;
    public final boolean d;
    public final zqj0 e;
    public final e7r0 f;
    public final boolean g;
    public final CardProductTypeEntity h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rgs0(CardProductTypeEntity cardProductTypeEntity, int i) {
        this(new t8j0(), false, null, false, null, new e7r0(r2, r2, 7), false, (i & 512) != 0 ? null : cardProductTypeEntity);
        String str = null;
    }

    public static rgs0 a(rgs0 rgs0Var, u8j0 u8j0Var, boolean z, u8j0 u8j0Var2, boolean z2, zqj0 zqj0Var, e7r0 e7r0Var, boolean z3, int i) {
        if ((i & 1) != 0) {
            u8j0Var = rgs0Var.a;
        }
        u8j0 u8j0Var3 = u8j0Var;
        if ((i & 2) != 0) {
            z = rgs0Var.b;
        }
        boolean z4 = z;
        rgs0Var.getClass();
        rgs0Var.getClass();
        if ((i & 16) != 0) {
            u8j0Var2 = rgs0Var.c;
        }
        u8j0 u8j0Var4 = u8j0Var2;
        if ((i & 32) != 0) {
            z2 = rgs0Var.d;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            zqj0Var = rgs0Var.e;
        }
        zqj0 zqj0Var2 = zqj0Var;
        if ((i & 128) != 0) {
            e7r0Var = rgs0Var.f;
        }
        e7r0 e7r0Var2 = e7r0Var;
        boolean z6 = (i & 256) != 0 ? rgs0Var.g : z3;
        CardProductTypeEntity cardProductTypeEntity = rgs0Var.h;
        rgs0Var.getClass();
        return new rgs0(u8j0Var3, z4, u8j0Var4, z5, zqj0Var2, e7r0Var2, z6, cardProductTypeEntity);
    }

    public final hgs0 b() {
        return (hgs0) this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgs0)) {
            return false;
        }
        rgs0 rgs0Var = (rgs0) obj;
        return jl40.l(this.a, rgs0Var.a) && this.b == rgs0Var.b && jl40.l(this.c, rgs0Var.c) && this.d == rgs0Var.d && jl40.l(this.e, rgs0Var.e) && jl40.l(this.f, rgs0Var.f) && this.g == rgs0Var.g && this.h == rgs0Var.h;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 961, this.b), 31, false);
        u8j0 u8j0Var = this.c;
        int e2 = unr0.e((e + (u8j0Var == null ? 0 : u8j0Var.hashCode())) * 31, 31, this.d);
        zqj0 zqj0Var = this.e;
        int e3 = unr0.e((this.f.hashCode() + ((e2 + (zqj0Var == null ? 0 : zqj0Var.hashCode())) * 31)) * 31, 31, this.g);
        CardProductTypeEntity cardProductTypeEntity = this.h;
        return e3 + (cardProductTypeEntity != null ? cardProductTypeEntity.hashCode() : 0);
    }

    public final String toString() {
        return "SingleCardState(cardData=" + this.a + ", isNfcEnabled=" + this.b + ", cardRequisites=null, isRequisitesLoading=false, requisitesDetails=" + this.c + ", cardDetailsVisible=" + this.d + ", requisites2faData=" + this.e + ", settingsChanging=" + this.f + ", isFreezingInProgress=" + this.g + ", productType=" + this.h + Extension.C_BRAKE;
    }

    public rgs0(u8j0 u8j0Var, boolean z, u8j0 u8j0Var2, boolean z2, zqj0 zqj0Var, e7r0 e7r0Var, boolean z3, CardProductTypeEntity cardProductTypeEntity) {
        this.a = u8j0Var;
        this.b = z;
        this.c = u8j0Var2;
        this.d = z2;
        this.e = zqj0Var;
        this.f = e7r0Var;
        this.g = z3;
        this.h = cardProductTypeEntity;
    }

    public rgs0() {
        this(null, 1023);
    }
}

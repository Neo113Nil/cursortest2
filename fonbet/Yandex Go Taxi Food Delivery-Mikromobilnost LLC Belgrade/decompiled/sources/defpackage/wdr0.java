package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wdr0 {
    public final u8j0 a;
    public final Set b;
    public final o8r0 c;
    public final String d;
    public final boolean e;
    public final j59 f;
    public final j59 g;
    public final j59 h;
    public final j59 i;
    public final j59 j;
    public final boolean k;
    public final boolean l;

    public wdr0(u8j0 u8j0Var, Set set, o8r0 o8r0Var, String str, boolean z, j59 j59Var, j59 j59Var2, j59 j59Var3, j59 j59Var4, j59 j59Var5, boolean z2, boolean z3) {
        this.a = u8j0Var;
        this.b = set;
        this.c = o8r0Var;
        this.d = str;
        this.e = z;
        this.f = j59Var;
        this.g = j59Var2;
        this.h = j59Var3;
        this.i = j59Var4;
        this.j = j59Var5;
        this.k = z2;
        this.l = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Set] */
    public static wdr0 a(wdr0 wdr0Var, u8j0 u8j0Var, LinkedHashSet linkedHashSet, o8r0 o8r0Var, String str, boolean z, j59 j59Var, j59 j59Var2, j59 j59Var3, j59 j59Var4, boolean z2, int i) {
        u8j0 u8j0Var2 = (i & 1) != 0 ? wdr0Var.a : u8j0Var;
        LinkedHashSet linkedHashSet2 = (i & 2) != 0 ? wdr0Var.b : linkedHashSet;
        o8r0 o8r0Var2 = (i & 4) != 0 ? wdr0Var.c : o8r0Var;
        String str2 = (i & 8) != 0 ? wdr0Var.d : str;
        boolean z3 = (i & 16) != 0 ? wdr0Var.e : z;
        j59 j59Var5 = (i & 32) != 0 ? wdr0Var.f : j59Var;
        j59 j59Var6 = (i & 64) != 0 ? wdr0Var.g : j59Var2;
        j59 j59Var7 = (i & 128) != 0 ? wdr0Var.h : null;
        j59 j59Var8 = (i & 256) != 0 ? wdr0Var.i : j59Var3;
        j59 j59Var9 = (i & 512) != 0 ? wdr0Var.j : j59Var4;
        boolean z4 = (i & 1024) != 0 ? wdr0Var.k : z2;
        boolean z5 = (i & 2048) != 0 ? wdr0Var.l : false;
        wdr0Var.getClass();
        return new wdr0(u8j0Var2, linkedHashSet2, o8r0Var2, str2, z3, j59Var5, j59Var6, j59Var7, j59Var8, j59Var9, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdr0)) {
            return false;
        }
        wdr0 wdr0Var = (wdr0) obj;
        return this.a.equals(wdr0Var.a) && jl40.l(this.b, wdr0Var.b) && jl40.l(this.c, wdr0Var.c) && jl40.l(this.d, wdr0Var.d) && this.e == wdr0Var.e && jl40.l(this.f, wdr0Var.f) && jl40.l(this.g, wdr0Var.g) && jl40.l(this.h, wdr0Var.h) && jl40.l(this.i, wdr0Var.i) && jl40.l(this.j, wdr0Var.j) && this.k == wdr0Var.k && this.l == wdr0Var.l;
    }

    public final int hashCode() {
        int e = g8e.e(this.b, this.a.hashCode() * 31, 31);
        o8r0 o8r0Var = this.c;
        int hashCode = (e + (o8r0Var == null ? 0 : o8r0Var.hashCode())) * 31;
        String str = this.d;
        int e2 = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        j59 j59Var = this.f;
        int hashCode2 = (e2 + (j59Var == null ? 0 : j59Var.hashCode())) * 31;
        j59 j59Var2 = this.g;
        int hashCode3 = (hashCode2 + (j59Var2 == null ? 0 : j59Var2.hashCode())) * 31;
        j59 j59Var3 = this.h;
        int hashCode4 = (hashCode3 + (j59Var3 == null ? 0 : j59Var3.hashCode())) * 31;
        j59 j59Var4 = this.i;
        int hashCode5 = (hashCode4 + (j59Var4 == null ? 0 : j59Var4.hashCode())) * 31;
        j59 j59Var5 = this.j;
        return Boolean.hashCode(this.l) + unr0.e((hashCode5 + (j59Var5 != null ? j59Var5.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsState(settingsEntityRequest=");
        sb.append(this.a);
        sb.append(", updatingSettings=");
        sb.append(this.b);
        sb.append(", waitingFor2fa=");
        sb.append(this.c);
        sb.append(", operationId=");
        sb.append(this.d);
        sb.append(", waitingForChangeSetting=");
        sb.append(this.e);
        sb.append(", themeSettings=");
        sb.append(this.f);
        sb.append(", securityCategory=");
        sb.append(this.g);
        sb.append(", nfcCategory=");
        sb.append(this.h);
        sb.append(", pushSettingsCategory=");
        sb.append(this.i);
        sb.append(", spoilerCategory=");
        sb.append(this.j);
        sb.append(", isThemeChanging=");
        return smw0.k(", isFirstOpen=", Extension.C_BRAKE, sb, this.k, this.l);
    }
}

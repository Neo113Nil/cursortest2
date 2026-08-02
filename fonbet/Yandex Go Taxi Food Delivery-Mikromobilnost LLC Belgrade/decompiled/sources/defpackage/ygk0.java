package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ygk0 implements zjk0 {
    public static final ygk0 m;
    public final String a;
    public final String b;
    public final xgk0 c;
    public final CharSequence d;
    public final String e;
    public final ogk0 f;
    public final hgk0 g;
    public final zuc0 h;
    public final ibk0 i;
    public final ibk0 j;
    public final ugk0 k;
    public final akk0 l;

    static {
        vgk0 vgk0Var = new vgk0(null);
        ogk0 ogk0Var = ogk0.b;
        hgk0 hgk0Var = hgk0.c;
        s9k0 s9k0Var = s9k0.a;
        m = new ygk0("", null, vgk0Var, null, "", ogk0Var, hgk0Var, zuc0.f, s9k0Var, s9k0Var, rgk0.a);
    }

    public ygk0(String str, String str2, xgk0 xgk0Var, CharSequence charSequence, String str3, ogk0 ogk0Var, hgk0 hgk0Var, zuc0 zuc0Var, ibk0 ibk0Var, ibk0 ibk0Var2, ugk0 ugk0Var) {
        this.a = str;
        this.b = str2;
        this.c = xgk0Var;
        this.d = charSequence;
        this.e = str3;
        this.f = ogk0Var;
        this.g = hgk0Var;
        this.h = zuc0Var;
        this.i = ibk0Var;
        this.j = ibk0Var2;
        this.k = ugk0Var;
        this.l = qpa1.e(str2, EmptyList.a, ibk0Var, ibk0Var2);
    }

    public static ygk0 c(ygk0 ygk0Var, ogk0 ogk0Var, hgk0 hgk0Var, ibk0 ibk0Var, ibk0 ibk0Var2, int i) {
        String str = ygk0Var.a;
        String str2 = ygk0Var.b;
        xgk0 xgk0Var = ygk0Var.c;
        CharSequence charSequence = ygk0Var.d;
        String str3 = ygk0Var.e;
        if ((i & 32) != 0) {
            ogk0Var = ygk0Var.f;
        }
        ogk0 ogk0Var2 = ogk0Var;
        if ((i & 64) != 0) {
            hgk0Var = ygk0Var.g;
        }
        hgk0 hgk0Var2 = hgk0Var;
        zuc0 zuc0Var = ygk0Var.h;
        ibk0 ibk0Var3 = (i & 256) != 0 ? ygk0Var.i : ibk0Var;
        ibk0 ibk0Var4 = (i & 512) != 0 ? ygk0Var.j : ibk0Var2;
        ugk0 ugk0Var = (i & 1024) != 0 ? ygk0Var.k : sgk0.a;
        ygk0Var.getClass();
        return new ygk0(str, str2, xgk0Var, charSequence, str3, ogk0Var2, hgk0Var2, zuc0Var, ibk0Var3, ibk0Var4, ugk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygk0)) {
            return false;
        }
        ygk0 ygk0Var = (ygk0) obj;
        return jl40.l(this.a, ygk0Var.a) && jl40.l(this.b, ygk0Var.b) && jl40.l(this.c, ygk0Var.c) && jl40.l(this.d, ygk0Var.d) && this.e.equals(ygk0Var.e) && jl40.l(this.f, ygk0Var.f) && jl40.l(this.g, ygk0Var.g) && this.h.equals(ygk0Var.h) && jl40.l(this.i, ygk0Var.i) && jl40.l(this.j, ygk0Var.j) && jl40.l(this.k, ygk0Var.k);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.l;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.d;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + unr0.b((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardDriverItemUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", subtitle=");
        v.append((Object) this.d);
        v.append(", driverDescription=");
        v.append(this.e);
        v.append(", carIconState=");
        v.append(this.f);
        v.append(", avatarState=");
        v.append(this.g);
        v.append(", carPlateState=");
        v.append(this.h);
        v.append(", driverClickAction=");
        v.append(this.i);
        v.append(", carPlateClickAction=");
        v.append(this.j);
        v.append(", driverState=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

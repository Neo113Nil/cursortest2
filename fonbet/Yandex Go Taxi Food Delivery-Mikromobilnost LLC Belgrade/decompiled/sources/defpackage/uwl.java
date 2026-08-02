package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uwl {
    public final kr a;
    public final kr b;
    public final kr c;
    public final kr d;
    public final kr e;
    public final kr f;

    public uwl(kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, kr krVar6) {
        this.a = krVar;
        this.b = krVar2;
        this.c = krVar3;
        this.d = krVar4;
        this.e = krVar5;
        this.f = krVar6;
    }

    public static uwl a(uwl uwlVar, kr krVar, kr krVar2, kr krVar3, int i) {
        kr krVar4 = uwlVar.a;
        if ((i & 2) != 0) {
            krVar = uwlVar.b;
        }
        kr krVar5 = krVar;
        if ((i & 4) != 0) {
            krVar2 = uwlVar.c;
        }
        kr krVar6 = krVar2;
        kr krVar7 = uwlVar.d;
        kr krVar8 = uwlVar.e;
        if ((i & 32) != 0) {
            krVar3 = uwlVar.f;
        }
        uwlVar.getClass();
        return new uwl(krVar4, krVar5, krVar6, krVar7, krVar8, krVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uwl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uwl uwlVar = (uwl) obj;
        return jl40.l(this.a, uwlVar.a) && jl40.l(this.b, uwlVar.b) && jl40.l(this.c, uwlVar.c) && jl40.l(this.d, uwlVar.d) && jl40.l(this.e, uwlVar.e) && jl40.l(this.f, uwlVar.f);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        kr krVar2 = this.b;
        int hashCode2 = (hashCode + (krVar2 != null ? krVar2.hashCode() : 0)) * 31;
        kr krVar3 = this.c;
        int hashCode3 = (hashCode2 + (krVar3 != null ? krVar3.hashCode() : 0)) * 31;
        kr krVar4 = this.d;
        int hashCode4 = (hashCode3 + (krVar4 != null ? krVar4.hashCode() : 0)) * 31;
        kr krVar5 = this.e;
        int hashCode5 = (hashCode4 + (krVar5 != null ? krVar5.hashCode() : 0)) * 31;
        kr krVar6 = this.f;
        return hashCode5 + (krVar6 != null ? krVar6.hashCode() : 0);
    }

    public final String toString() {
        return "Actions(onAwake=" + this.a + ", onApply=" + this.b + ", onError=" + this.c + ", onReload=" + this.d + ", onFinish=" + this.e + ", onReloadingFailed=" + this.f + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ChipsState;

/* loaded from: classes5.dex */
public final class zqb {
    public final ChipsState a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final tqb e;

    public /* synthetic */ zqb(ChipsState chipsState, String str, String str2, tqb tqbVar, int i) {
        this((i & 1) != 0 ? ChipsState.DEFAULT : chipsState, (i & 2) != 0 ? "" : str, (String) null, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? rqb.a : tqbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqb)) {
            return false;
        }
        zqb zqbVar = (zqb) obj;
        return this.a == zqbVar.a && jl40.l(this.b, zqbVar.b) && jl40.l(this.c, zqbVar.c) && jl40.l(this.d, zqbVar.d) && jl40.l(this.e, zqbVar.e);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipsInfo(state=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", iconUrl=");
        g8e.D(sb, this.c, ", price=null, description=", this.d, ", action=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public zqb(ChipsState chipsState, CharSequence charSequence, String str, String str2, tqb tqbVar) {
        this.a = chipsState;
        this.b = charSequence;
        this.c = str;
        this.d = str2;
        this.e = tqbVar;
    }

    public zqb() {
        this((ChipsState) null, (String) null, (String) null, (tqb) null, 63);
    }
}

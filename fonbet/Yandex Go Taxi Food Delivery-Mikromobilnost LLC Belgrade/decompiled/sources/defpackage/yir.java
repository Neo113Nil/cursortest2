package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class yir implements zir {
    public final boolean a;
    public final zzs b;
    public final Set c;
    public final Set d;

    public yir(boolean z, zzs zzsVar, Set set, Set set2) {
        this.a = z;
        this.b = zzsVar;
        this.c = set;
        this.d = set2;
    }

    @Override // defpackage.zir
    public final zzs a() {
        return this.b;
    }

    @Override // defpackage.zir
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.zir
    public final Set c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yir)) {
            return false;
        }
        yir yirVar = (yir) obj;
        return this.a == yirVar.a && jl40.l(this.b, yirVar.b) && jl40.l(this.c, yirVar.c) && jl40.l(this.d, yirVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g8e.e(this.c, nnm.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Resolved(isChangedByUser=" + this.a + ", selectedPosition=" + this.b + ", geoRequestIds=" + this.c + ", geoResponseIds=" + this.d + Extension.C_BRAKE;
    }
}

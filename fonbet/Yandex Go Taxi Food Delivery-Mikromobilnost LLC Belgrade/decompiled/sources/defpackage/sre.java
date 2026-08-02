package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.badge.dashboard.BadgeAnchor;

/* loaded from: classes5.dex */
public final class sre extends z3b1 {
    public final String a;
    public final qfc b;
    public final qfc c;
    public final BadgeAnchor d;

    public sre(String str, qfc qfcVar, qfc qfcVar2, BadgeAnchor badgeAnchor) {
        this.a = str;
        this.b = qfcVar;
        this.c = qfcVar2;
        this.d = badgeAnchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sre)) {
            return false;
        }
        sre sreVar = (sre) obj;
        return jl40.l(this.a, sreVar.a) && jl40.l(this.b, sreVar.b) && jl40.l(this.c, sreVar.c) && this.d == sreVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qfc qfcVar = this.b;
        int hashCode2 = (hashCode + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        qfc qfcVar2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (qfcVar2 != null ? qfcVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CornerBadgeModel(text=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + ", anchor=" + this.d + Extension.C_BRAKE;
    }
}

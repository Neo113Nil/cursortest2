package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.badge.dashboard.BadgeAnchor;

/* loaded from: classes5.dex */
public final class tre extends a4b1 {
    public final String a;
    public final ldc b;
    public final ldc c;
    public final BadgeAnchor d;

    public tre(String str, ldc ldcVar, ldc ldcVar2, BadgeAnchor badgeAnchor) {
        this.a = str;
        this.b = ldcVar;
        this.c = ldcVar2;
        this.d = badgeAnchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tre)) {
            return false;
        }
        tre treVar = (tre) obj;
        return jl40.l(this.a, treVar.a) && jl40.l(this.b, treVar.b) && jl40.l(this.c, treVar.c) && this.d == treVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31);
    }

    public final String toString() {
        return "CornerBadgeState(text=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + ", anchor=" + this.d + Extension.C_BRAKE;
    }
}

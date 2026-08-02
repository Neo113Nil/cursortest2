package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersStationSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yqa {
    public final ChargersStationSection a;
    public final String b;
    public final String c;

    public yqa(ChargersStationSection chargersStationSection, String str, String str2) {
        this.a = chargersStationSection;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqa)) {
            return false;
        }
        yqa yqaVar = (yqa) obj;
        return this.a == yqaVar.a && jl40.l(this.b, yqaVar.b) && jl40.l(this.c, yqaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersStationDeeplink(section=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", vendor=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}

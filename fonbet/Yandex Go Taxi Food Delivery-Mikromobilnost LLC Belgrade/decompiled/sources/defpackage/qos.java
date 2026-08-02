package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qos {
    public final Boolean a;
    public final String b;
    public final List c;

    public qos(Boolean bool, String str, ArrayList arrayList) {
        this.a = bool;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qos)) {
            return false;
        }
        qos qosVar = (qos) obj;
        return jl40.l(this.a, qosVar.a) && jl40.l(this.b, qosVar.b) && jl40.l(this.c, qosVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FundIncomeLoadedAnalytics(hasIncomeWidget=");
        sb.append(this.a);
        sb.append(", widgetPeriod=");
        sb.append(this.b);
        sb.append(", availablePeriods=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}

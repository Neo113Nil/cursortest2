package defpackage;

import com.ybsdk.core.analytics.generated.PfmAnalyticsItemStatePfm;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class yab0 {
    public final String a;
    public final PfmAnalyticsItemStatePfm b;
    public final p9b0 c;
    public final List d;

    public yab0(String str, PfmAnalyticsItemStatePfm pfmAnalyticsItemStatePfm, p9b0 p9b0Var, ArrayList arrayList) {
        this.a = str;
        this.b = pfmAnalyticsItemStatePfm;
        this.c = p9b0Var;
        this.d = arrayList;
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("filter_id", this.a);
        linkedHashMap.put(ClidProvider.STATE, this.b.getOriginalValue());
        p9b0 p9b0Var = this.c;
        if (p9b0Var != null) {
            linkedHashMap.put(MetaDataField.DATE_FIELD, p9b0Var.a());
        }
        List list = this.d;
        if (list != null) {
            List<zab0> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (zab0 zab0Var : list2) {
                zab0Var.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                linkedHashMap2.put("id", zab0Var.a);
                linkedHashMap2.put(ClidProvider.STATE, zab0Var.b.getOriginalValue());
                arrayList.add(linkedHashMap2);
            }
            linkedHashMap.put("options", arrayList);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yab0)) {
            return false;
        }
        yab0 yab0Var = (yab0) obj;
        return this.a.equals(yab0Var.a) && this.b == yab0Var.b && jl40.l(this.c, yab0Var.c) && jl40.l(this.d, yab0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        p9b0 p9b0Var = this.c;
        int hashCode2 = (hashCode + (p9b0Var == null ? 0 : p9b0Var.hashCode())) * 31;
        List list = this.d;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PfmFilterItemPfm(filterId=" + this.a + ", state=" + this.b + ", date=" + this.c + ", options=" + this.d + Extension.C_BRAKE;
    }
}

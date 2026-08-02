package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class p4c extends yeo {
    public final String d;
    public final String e;
    public final Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4c(int i, Integer num, String str, String str2, String str3, String str4) {
        super(str, str2, i);
        str3.getClass();
        this.d = str3;
        this.e = str4;
        this.f = num;
    }

    @Override // defpackage.yeo
    public final Map h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.h());
        linkedHashMap.put("errorType", this.d);
        String str = this.e;
        if (str != null) {
            linkedHashMap.put("errorSubtype", str);
        }
        Integer num = this.f;
        if (num != null) {
            linkedHashMap.put("code", Integer.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }
}

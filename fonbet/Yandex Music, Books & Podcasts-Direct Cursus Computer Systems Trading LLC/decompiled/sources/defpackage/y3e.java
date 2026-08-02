package defpackage;

import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class y3e {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public y3e(String str, String str2) {
        this.a = 1;
        str.getClass();
        this.b = str;
        this.c = str2;
    }

    public y6n a() {
        if ("first_party".equals(this.c)) {
            xq0.x("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.b == null) {
            xq0.x("Product id must be provided.");
            return null;
        }
        if (this.c != null) {
            return new y6n(this);
        }
        xq0.x("Product type must be provided.");
        return null;
    }

    public LinkedHashMap b(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("X-Yandex-Plus-AppId", this.b);
        linkedHashMap.put("Accept-Language", str3);
        linkedHashMap.put("X-Yandex-Plus-HostAppVersion", this.c);
        if (str != null) {
            linkedHashMap.put("Authorization", "OAuth ".concat(str));
        }
        linkedHashMap.put("X-Yandex-Plus-Platform", "ANDROID");
        linkedHashMap.put("X-Request-Id", UUID.randomUUID().toString());
        linkedHashMap.put("X-Yandex-Plus-Service", str2);
        return linkedHashMap;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y3e(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}

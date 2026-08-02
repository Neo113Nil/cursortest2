package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class q89 {
    public final String a;
    public final Map b;

    public q89(String str, Map map) {
        this.a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            linkedHashMap.put(str2 != null ? str2.toLowerCase(Locale.US) : null, (String) entry.getValue());
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public final Charset a() {
        String str = (String) this.b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return uza.e;
    }

    public final String b() {
        return (String) this.b.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q89)) {
            return false;
        }
        q89 q89Var = (q89) obj;
        return q89Var.a.equals(this.a) && jl40.l(q89Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.b(899, 31, this.a);
    }

    public final String toString() {
        return this.a + " authParams=" + this.b;
    }
}

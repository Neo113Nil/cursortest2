package defpackage;

import android.util.Base64;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class s6s {
    public final l6s a;
    public final c7s b;

    public s6s(l6s l6sVar, c7s c7sVar) {
        this.a = l6sVar;
        this.b = c7sVar;
    }

    public final void a(String str, String str2, Map map) {
        Map map2 = null;
        if (str2 != null) {
            l6s l6sVar = this.a;
            l6sVar.getClass();
            try {
                map2 = (Map) l6sVar.c.fromJson(new String(Base64.decode(str2, 2), uza.a));
            } catch (Exception e) {
                jgz jgzVar = jgz.a;
                jgz.d(e, "Failed to decode base64", new Object[0]);
            }
        }
        c7s c7sVar = this.b;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                c7sVar.a(str, gw00.e(new Pair((String) entry.getKey(), entry.getValue())));
            }
            return;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            String str3 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof String) {
                String str4 = (String) value;
                if (evu0.j0(str4) != null) {
                    value = Boolean.valueOf(Boolean.parseBoolean(str4));
                } else if (bvu0.m(10, str4) != null) {
                    value = Long.valueOf(Long.parseLong(str4));
                } else if (avu0.i(str4) != null) {
                    value = Double.valueOf(Double.parseDouble(str4));
                }
                c7sVar.a(str, gw00.e(new Pair(str3, value)));
            } else {
                c7sVar.a(str, gw00.e(new Pair(str3, value)));
            }
        }
    }
}

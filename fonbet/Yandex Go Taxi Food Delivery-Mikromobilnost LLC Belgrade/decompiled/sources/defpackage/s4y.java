package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class s4y implements peu {
    public final Map b;
    public volatile Map c;

    public s4y(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((r4y) list.get(i)).a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(HexString.CHAR_COMMA);
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s4y) {
            return this.b.equals(((s4y) obj).b);
        }
        return false;
    }

    @Override // defpackage.peu
    public final Map getHeaders() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("LazyHeaders{headers="), this.b, '}');
    }
}

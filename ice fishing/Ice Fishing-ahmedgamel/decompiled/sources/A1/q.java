package A1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q implements n {

    /* renamed from: b, reason: collision with root package name */
    public final Map f78b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f79c;

    public q(Map map) {
        this.f78b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f78b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((p) list.get(i)).f77a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put((String) entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final Map b() {
        if (this.f79c == null) {
            synchronized (this) {
                try {
                    if (this.f79c == null) {
                        this.f79c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f79c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f78b.equals(((q) obj).f78b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f78b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f78b + '}';
    }
}

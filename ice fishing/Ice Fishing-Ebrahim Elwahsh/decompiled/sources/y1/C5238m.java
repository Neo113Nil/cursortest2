package y1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5238m implements InterfaceC5235j {

    /* renamed from: b, reason: collision with root package name */
    public final Map f41847b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f41848c;

    public C5238m(Map map) {
        this.f41847b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f41847b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C5237l) list.get(i)).f41846a;
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
        if (this.f41848c == null) {
            synchronized (this) {
                try {
                    if (this.f41848c == null) {
                        this.f41848c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f41848c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5238m) {
            return this.f41847b.equals(((C5238m) obj).f41847b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41847b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f41847b + '}';
    }
}

package y1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5217l implements InterfaceC5214i {

    /* renamed from: b, reason: collision with root package name */
    public final Map f41810b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f41811c;

    public C5217l(Map map) {
        this.f41810b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f41810b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C5216k) list.get(i)).f41809a;
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
        if (this.f41811c == null) {
            synchronized (this) {
                try {
                    if (this.f41811c == null) {
                        this.f41811c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f41811c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5217l) {
            return this.f41810b.equals(((C5217l) obj).f41810b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41810b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f41810b + '}';
    }
}

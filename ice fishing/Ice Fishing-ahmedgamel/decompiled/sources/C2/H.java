package C2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f277n;

    public H(K k9) {
        Objects.requireNonNull(k9);
        this.f277n = k9;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        K k9 = this.f277n;
        synchronized (k9) {
            try {
                if (size() <= k9.f286a) {
                    return false;
                }
                k9.f291f.add(new Pair((String) entry.getKey(), ((I) entry.getValue()).f279b));
                return size() > k9.f286a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

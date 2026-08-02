package E2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f737n;

    public G(J j6) {
        Objects.requireNonNull(j6);
        this.f737n = j6;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        J j6 = this.f737n;
        synchronized (j6) {
            try {
                if (size() <= j6.f746a) {
                    return false;
                }
                j6.f751f.add(new Pair((String) entry.getKey(), ((H) entry.getValue()).f739b));
                return size() > j6.f746a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package androidx.webkit;

import H0.b;
import I0.h;
import I0.m;
import I0.n;
import java.util.List;

/* loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!m.f1299g.b()) {
            throw m.a();
        }
        if (h.f1285b == null) {
            h.f1285b = new h(n.f1301a.getProfileStore());
        }
        return h.f1285b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}

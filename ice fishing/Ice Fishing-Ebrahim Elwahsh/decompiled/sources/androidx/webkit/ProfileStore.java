package androidx.webkit;

import H0.b;
import I0.h;
import I0.m;
import I0.n;
import java.util.List;

/* loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!m.f1241g.b()) {
            throw m.a();
        }
        if (h.f1229b == null) {
            h.f1229b = new h(n.f1243a.getProfileStore());
        }
        return h.f1229b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}

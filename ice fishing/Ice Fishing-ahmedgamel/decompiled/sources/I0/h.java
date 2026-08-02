package I0;

import androidx.webkit.ProfileStore;
import i1.C4586c;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class h implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static h f1285b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f1286a;

    public h(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f1286a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (m.f1299g.b()) {
            return this.f1286a.deleteProfile(str);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (m.f1299g.b()) {
            return this.f1286a.getAllProfileNames();
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final H0.b getOrCreateProfile(String str) {
        if (!m.f1299g.b()) {
            throw m.a();
        }
        return new C4586c(4, (ProfileBoundaryInterface) A8.b.b(ProfileBoundaryInterface.class, this.f1286a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final H0.b getProfile(String str) {
        if (!m.f1299g.b()) {
            throw m.a();
        }
        InvocationHandler profile = this.f1286a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new C4586c(4, (ProfileBoundaryInterface) A8.b.b(ProfileBoundaryInterface.class, profile));
    }
}

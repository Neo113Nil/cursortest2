package A1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class L implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f42b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final x f43a;

    public L(x xVar) {
        this.f43a = xVar;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        return f42b.contains(((Uri) obj).getScheme());
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        return this.f43a.b(new m(((Uri) obj).toString()), i, i4, hVar);
    }
}

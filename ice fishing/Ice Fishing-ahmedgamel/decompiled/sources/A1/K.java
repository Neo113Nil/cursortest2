package A1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class K implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f40b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f41a;

    public K(J j6) {
        this.f41a = j6;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        return f40b.contains(((Uri) obj).getScheme());
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        O1.d dVar = new O1.d(uri);
        J j6 = (J) this.f41a;
        switch (j6.f37n) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(j6.f38u, uri, j6.f39v, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(j6.f38u, uri, j6.f39v, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.m(j6.f38u, uri, j6.f39v);
                break;
        }
        return new w(dVar, aVar);
    }
}

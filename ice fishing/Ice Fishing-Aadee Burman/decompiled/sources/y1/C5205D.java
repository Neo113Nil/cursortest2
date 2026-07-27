package y1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5205D implements InterfaceC5223r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f41783b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5223r f41784a;

    public C5205D(InterfaceC5223r interfaceC5223r) {
        this.f41784a = interfaceC5223r;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        return f41783b.contains(((Uri) obj).getScheme());
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        return this.f41784a.b(new C5213h(((Uri) obj).toString()), i, i6, hVar);
    }
}

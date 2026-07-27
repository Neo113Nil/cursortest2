package y1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5225E implements InterfaceC5244s {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f41821b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5244s f41822a;

    public C5225E(InterfaceC5244s interfaceC5244s) {
        this.f41822a = interfaceC5244s;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        return f41821b.contains(((Uri) obj).getScheme());
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        return this.f41822a.b(new C5234i(((Uri) obj).toString()), i, i4, hVar);
    }
}

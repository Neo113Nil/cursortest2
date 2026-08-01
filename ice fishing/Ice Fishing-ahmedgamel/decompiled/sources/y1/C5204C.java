package y1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5204C implements InterfaceC5223r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f41784b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f41785a;

    public C5204C(C5203B c5203b) {
        this.f41785a = c5203b;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        return f41784b.contains(((Uri) obj).getScheme());
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        M1.d dVar = new M1.d(uri);
        C5203B c5203b = (C5203B) this.f41785a;
        switch (c5203b.f41781n) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(c5203b.f41782u, uri, c5203b.f41783v, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(c5203b.f41782u, uri, c5203b.f41783v, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.m(c5203b.f41782u, uri, c5203b.f41783v);
                break;
        }
        return new C5222q(dVar, aVar);
    }
}

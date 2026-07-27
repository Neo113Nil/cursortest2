package y1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5224D implements InterfaceC5244s {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f41819b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f41820a;

    public C5224D(C5223C c5223c) {
        this.f41820a = c5223c;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        return f41819b.contains(((Uri) obj).getScheme());
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        M1.d dVar = new M1.d(uri);
        C5223C c5223c = (C5223C) this.f41820a;
        switch (c5223c.f41816n) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(c5223c.f41817u, uri, c5223c.f41818v, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(c5223c.f41817u, uri, c5223c.f41818v, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.m(c5223c.f41817u, uri, c5223c.f41818v);
                break;
        }
        return new C5243r(dVar, aVar);
    }
}

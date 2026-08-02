package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.af;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class v<T> implements t.c {

    /* renamed from: a, reason: collision with root package name */
    public final k f9043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9044b;

    /* renamed from: c, reason: collision with root package name */
    private final h f9045c;

    /* renamed from: d, reason: collision with root package name */
    private final a<? extends T> f9046d;

    /* renamed from: e, reason: collision with root package name */
    private volatile T f9047e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f9048f;

    public interface a<T> {
        T a();
    }

    private v(h hVar, Uri uri, a<? extends T> aVar) {
        this(hVar, new k(uri, 3), aVar);
    }

    private T c() {
        return this.f9047e;
    }

    private long d() {
        return this.f9048f;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        j jVar = new j(this.f9045c, this.f9043a);
        try {
            jVar.b();
            a<? extends T> aVar = this.f9046d;
            this.f9045c.a();
            this.f9047e = aVar.a();
        } finally {
            this.f9048f = jVar.a();
            af.a((Closeable) jVar);
        }
    }

    private v(h hVar, k kVar, a<? extends T> aVar) {
        this.f9045c = hVar;
        this.f9043a = kVar;
        this.f9044b = 0;
        this.f9046d = aVar;
    }

    private static <T> T a(h hVar, a<? extends T> aVar, Uri uri) {
        v vVar = new v(hVar, uri, aVar);
        vVar.b();
        return vVar.f9047e;
    }
}

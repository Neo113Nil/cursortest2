package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.af;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class v<T> implements t.c {

    /* renamed from: a, reason: collision with root package name */
    public final k f8257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8258b;

    /* renamed from: c, reason: collision with root package name */
    private final h f8259c;

    /* renamed from: d, reason: collision with root package name */
    private final a<? extends T> f8260d;

    /* renamed from: e, reason: collision with root package name */
    private volatile T f8261e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f8262f;

    public interface a<T> {
        T a();
    }

    private v(h hVar, Uri uri, a<? extends T> aVar) {
        this(hVar, new k(uri, 3), aVar);
    }

    private T c() {
        return this.f8261e;
    }

    private long d() {
        return this.f8262f;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        j jVar = new j(this.f8259c, this.f8257a);
        try {
            jVar.b();
            a<? extends T> aVar = this.f8260d;
            this.f8259c.a();
            this.f8261e = aVar.a();
        } finally {
            this.f8262f = jVar.a();
            af.a((Closeable) jVar);
        }
    }

    private v(h hVar, k kVar, a<? extends T> aVar) {
        this.f8259c = hVar;
        this.f8257a = kVar;
        this.f8258b = 0;
        this.f8260d = aVar;
    }

    private static <T> T a(h hVar, a<? extends T> aVar, Uri uri) {
        v vVar = new v(hVar, uri, aVar);
        vVar.b();
        return vVar.f8261e;
    }
}

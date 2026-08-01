package com.anythink.basead.exoplayer.a;

import android.net.NetworkInfo;
import android.view.Surface;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.g;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.v;
import java.io.IOException;

/* loaded from: classes.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f6302a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f6303b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6304c;

        /* renamed from: d, reason: collision with root package name */
        public final s.a f6305d;

        /* renamed from: e, reason: collision with root package name */
        public final long f6306e;

        /* renamed from: f, reason: collision with root package name */
        public final long f6307f;

        /* renamed from: g, reason: collision with root package name */
        public final long f6308g;

        public a(long j6, ae aeVar, int i, s.a aVar, long j9, long j10, long j11) {
            this.f6302a = j6;
            this.f6303b = aeVar;
            this.f6304c = i;
            this.f6305d = aVar;
            this.f6306e = j9;
            this.f6307f = j10;
            this.f6308g = j11;
        }
    }

    void a();

    void a(a aVar);

    void a(a aVar, int i);

    void a(a aVar, int i, int i6);

    void a(a aVar, int i, long j6, long j9);

    void a(a aVar, int i, m mVar);

    void a(a aVar, int i, String str);

    void a(a aVar, NetworkInfo networkInfo);

    void a(a aVar, Surface surface);

    void a(a aVar, com.anythink.basead.exoplayer.g.a aVar2);

    void a(a aVar, g gVar);

    void a(a aVar, t.c cVar);

    void a(a aVar, com.anythink.basead.exoplayer.i.g gVar);

    void a(a aVar, v vVar);

    void a(a aVar, IOException iOException);

    void a(a aVar, Exception exc);

    void a(a aVar, boolean z3);

    void a(a aVar, boolean z3, int i);

    void b();

    void b(a aVar);

    void b(a aVar, int i);

    void b(a aVar, int i, int i6);

    void b(a aVar, t.c cVar);

    void b(a aVar, boolean z3);

    void c();

    void c(a aVar);

    void c(a aVar, int i);

    void d();

    void d(a aVar);

    void d(a aVar, int i);

    void e(a aVar);

    void e(a aVar, int i);

    void f(a aVar);

    void f(a aVar, int i);

    void g(a aVar);

    void g(a aVar, int i);

    void h(a aVar);
}

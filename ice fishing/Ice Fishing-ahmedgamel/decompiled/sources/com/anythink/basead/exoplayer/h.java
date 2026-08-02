package com.anythink.basead.exoplayer;

import android.os.Looper;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;

/* loaded from: classes.dex */
public interface h extends w {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f8180a = 1;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f8181b = 2;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f8182c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f8183d = 4;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f8184e = 0;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f8185f = 1;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f8186g = 2;

    @Deprecated
    public interface a extends w.c {
    }

    @Deprecated
    public interface b extends x.b {
    }

    @Deprecated
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final x.b f8371a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8372b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8373c;

        @Deprecated
        private c(x.b bVar, int i, Object obj) {
            this.f8371a = bVar;
            this.f8372b = i;
            this.f8373c = obj;
        }
    }

    Looper a();

    x a(x.b bVar);

    void a(ac acVar);

    void a(com.anythink.basead.exoplayer.h.s sVar);

    void a(com.anythink.basead.exoplayer.h.s sVar, boolean z6, boolean z9);

    @Deprecated
    void a(c... cVarArr);

    @Deprecated
    void b(c... cVarArr);
}

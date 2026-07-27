package com.anythink.basead.exoplayer;

import android.os.Looper;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;

/* loaded from: classes.dex */
public interface h extends w {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f7551a = 1;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f7552b = 2;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f7553c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f7554d = 4;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f7555e = 0;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f7556f = 1;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f7557g = 2;

    @Deprecated
    public interface a extends w.c {
    }

    @Deprecated
    public interface b extends x.b {
    }

    @Deprecated
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final x.b f7742a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7743b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f7744c;

        @Deprecated
        private c(x.b bVar, int i, Object obj) {
            this.f7742a = bVar;
            this.f7743b = i;
            this.f7744c = obj;
        }
    }

    Looper a();

    x a(x.b bVar);

    void a(ac acVar);

    void a(com.anythink.basead.exoplayer.h.s sVar);

    void a(com.anythink.basead.exoplayer.h.s sVar, boolean z8, boolean z9);

    @Deprecated
    void a(c... cVarArr);

    @Deprecated
    void b(c... cVarArr);
}

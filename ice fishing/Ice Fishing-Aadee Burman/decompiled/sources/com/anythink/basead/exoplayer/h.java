package com.anythink.basead.exoplayer;

import android.os.Looper;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;

/* loaded from: classes.dex */
public interface h extends w {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f7394a = 1;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f7395b = 2;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f7396c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f7397d = 4;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f7398e = 0;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f7399f = 1;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f7400g = 2;

    @Deprecated
    public interface a extends w.c {
    }

    @Deprecated
    public interface b extends x.b {
    }

    @Deprecated
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final x.b f7585a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7586b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f7587c;

        @Deprecated
        private c(x.b bVar, int i, Object obj) {
            this.f7585a = bVar;
            this.f7586b = i;
            this.f7587c = obj;
        }
    }

    Looper a();

    x a(x.b bVar);

    void a(ac acVar);

    void a(com.anythink.basead.exoplayer.h.s sVar);

    void a(com.anythink.basead.exoplayer.h.s sVar, boolean z3, boolean z6);

    @Deprecated
    void a(c... cVarArr);

    @Deprecated
    void b(c... cVarArr);
}

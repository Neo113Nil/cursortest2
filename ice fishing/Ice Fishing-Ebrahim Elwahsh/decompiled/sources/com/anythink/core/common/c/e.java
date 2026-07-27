package com.anythink.core.common.c;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class e implements f {

    /* renamed from: a, reason: collision with root package name */
    static final int f12444a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f12445b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f12446c = 3;

    /* renamed from: d, reason: collision with root package name */
    protected final long f12447d = 86400000;

    /* renamed from: e, reason: collision with root package name */
    protected String f12448e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f12449f;

    /* renamed from: g, reason: collision with root package name */
    protected String f12450g;

    /* renamed from: h, reason: collision with root package name */
    protected long f12451h;

    public e(Context context, String str, String str2, long j9) {
        this.f12448e = str;
        this.f12449f = context;
        this.f12450g = str2;
        this.f12451h = j9;
    }

    private String c() {
        return this.f12448e;
    }

    private String d() {
        return this.f12450g;
    }

    private long e() {
        return this.f12451h;
    }
}

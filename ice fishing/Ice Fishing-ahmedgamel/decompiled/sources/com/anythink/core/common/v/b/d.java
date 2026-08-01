package com.anythink.core.common.v.b;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16715d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16716e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f16717f = 3;

    /* renamed from: h, reason: collision with root package name */
    protected e f16721h;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f16720g = true;
    protected int i = 1;

    /* renamed from: a, reason: collision with root package name */
    private long f16718a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String f16719b = "anythink_default_thread";

    private String c() {
        return this.f16719b;
    }

    public abstract void a();

    public final void a(long j6) {
        this.f16718a = j6;
    }

    public final long b() {
        return this.f16718a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f16719b);
        a();
    }

    private void a(e eVar) {
        this.f16721h = eVar;
    }

    public final void a(String str) {
        this.f16719b = str;
    }
}

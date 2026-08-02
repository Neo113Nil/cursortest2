package com.anythink.core.common.v.b;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17502d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17503e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17504f = 3;

    /* renamed from: h, reason: collision with root package name */
    protected e f17508h;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f17507g = true;
    protected int i = 1;

    /* renamed from: a, reason: collision with root package name */
    private long f17505a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String f17506b = "anythink_default_thread";

    private String c() {
        return this.f17506b;
    }

    public abstract void a();

    public final void a(long j6) {
        this.f17505a = j6;
    }

    public final long b() {
        return this.f17505a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f17506b);
        a();
    }

    private void a(e eVar) {
        this.f17508h = eVar;
    }

    public final void a(String str) {
        this.f17506b = str;
    }
}

package com.anythink.expressad.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f21383a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f21384b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f21385c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f21386d;

    /* renamed from: e, reason: collision with root package name */
    private a f21387e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.dynview.i.c.a f21388a;

        public a(long j9, long j10) {
            super(j9, j10);
        }

        public final void a(com.anythink.expressad.video.dynview.i.c.a aVar) {
            this.f21388a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f21388a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j9) {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f21388a;
            if (aVar != null) {
                aVar.a(j9);
            }
        }
    }

    private void d() {
        a aVar = this.f21387e;
        if (aVar != null) {
            aVar.cancel();
            this.f21387e = null;
        }
        if (this.f21385c <= 0) {
            this.f21385c = this.f21384b + f21383a;
        }
        a aVar2 = new a(this.f21384b, this.f21385c);
        this.f21387e = aVar2;
        aVar2.a(this.f21386d);
    }

    public final b a() {
        this.f21385c = f21383a;
        return this;
    }

    public final void b() {
        if (this.f21387e == null) {
            d();
        }
        this.f21387e.start();
    }

    public final void c() {
        a aVar = this.f21387e;
        if (aVar != null) {
            aVar.cancel();
            this.f21387e = null;
        }
    }

    public final b a(com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f21386d = aVar;
        return this;
    }

    public final b a(long j9) {
        this.f21384b = j9;
        return this;
    }

    public final void a(long j9, com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f21384b = j9;
        this.f21386d = aVar;
        d();
        a aVar2 = this.f21387e;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}

package com.anythink.expressad.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f21225a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f21226b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f21227c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f21228d;

    /* renamed from: e, reason: collision with root package name */
    private a f21229e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.dynview.i.c.a f21230a;

        public a(long j6, long j9) {
            super(j6, j9);
        }

        public final void a(com.anythink.expressad.video.dynview.i.c.a aVar) {
            this.f21230a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f21230a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j6) {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f21230a;
            if (aVar != null) {
                aVar.a(j6);
            }
        }
    }

    private void d() {
        a aVar = this.f21229e;
        if (aVar != null) {
            aVar.cancel();
            this.f21229e = null;
        }
        if (this.f21227c <= 0) {
            this.f21227c = this.f21226b + f21225a;
        }
        a aVar2 = new a(this.f21226b, this.f21227c);
        this.f21229e = aVar2;
        aVar2.a(this.f21228d);
    }

    public final b a() {
        this.f21227c = f21225a;
        return this;
    }

    public final void b() {
        if (this.f21229e == null) {
            d();
        }
        this.f21229e.start();
    }

    public final void c() {
        a aVar = this.f21229e;
        if (aVar != null) {
            aVar.cancel();
            this.f21229e = null;
        }
    }

    public final b a(com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f21228d = aVar;
        return this;
    }

    public final b a(long j6) {
        this.f21226b = j6;
        return this;
    }

    public final void a(long j6, com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f21226b = j6;
        this.f21228d = aVar;
        d();
        a aVar2 = this.f21229e;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}

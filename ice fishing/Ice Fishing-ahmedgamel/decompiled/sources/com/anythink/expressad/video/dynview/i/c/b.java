package com.anythink.expressad.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f22012a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f22013b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f22014c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f22015d;

    /* renamed from: e, reason: collision with root package name */
    private a f22016e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.video.dynview.i.c.a f22017a;

        public a(long j6, long j9) {
            super(j6, j9);
        }

        public final void a(com.anythink.expressad.video.dynview.i.c.a aVar) {
            this.f22017a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f22017a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j6) {
            com.anythink.expressad.video.dynview.i.c.a aVar = this.f22017a;
            if (aVar != null) {
                aVar.a(j6);
            }
        }
    }

    private void d() {
        a aVar = this.f22016e;
        if (aVar != null) {
            aVar.cancel();
            this.f22016e = null;
        }
        if (this.f22014c <= 0) {
            this.f22014c = this.f22013b + f22012a;
        }
        a aVar2 = new a(this.f22013b, this.f22014c);
        this.f22016e = aVar2;
        aVar2.a(this.f22015d);
    }

    public final b a() {
        this.f22014c = f22012a;
        return this;
    }

    public final void b() {
        if (this.f22016e == null) {
            d();
        }
        this.f22016e.start();
    }

    public final void c() {
        a aVar = this.f22016e;
        if (aVar != null) {
            aVar.cancel();
            this.f22016e = null;
        }
    }

    public final b a(com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f22015d = aVar;
        return this;
    }

    public final b a(long j6) {
        this.f22013b = j6;
        return this;
    }

    public final void a(long j6, com.anythink.expressad.video.dynview.i.c.a aVar) {
        this.f22013b = j6;
        this.f22015d = aVar;
        d();
        a aVar2 = this.f22016e;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}

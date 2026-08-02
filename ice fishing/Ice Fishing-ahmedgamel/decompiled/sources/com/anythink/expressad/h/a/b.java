package com.anythink.expressad.h.a;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20591a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f20592b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f20593c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.h.a.a f20594d;

    /* renamed from: e, reason: collision with root package name */
    private a f20595e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.h.a.a f20596a;

        public a(long j6, long j9) {
            super(j6, j9);
        }

        public final void a(com.anythink.expressad.h.a.a aVar) {
            this.f20596a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j6) {
        }
    }

    private b a(long j6) {
        if (j6 < 0) {
            j6 = f20591a;
        }
        this.f20593c = j6;
        return this;
    }

    private b b(long j6) {
        this.f20592b = j6;
        return this;
    }

    private void c() {
        a aVar = this.f20595e;
        if (aVar != null) {
            aVar.cancel();
            this.f20595e = null;
        }
    }

    private b a(com.anythink.expressad.h.a.a aVar) {
        this.f20594d = aVar;
        return this;
    }

    private void b() {
        a aVar = this.f20595e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f20595e = null;
            }
            if (this.f20593c <= 0) {
                this.f20593c = this.f20592b + f20591a;
            }
            a aVar2 = new a(this.f20592b, this.f20593c);
            this.f20595e = aVar2;
            aVar2.a(this.f20594d);
        }
        this.f20595e.start();
    }

    private void a() {
        a aVar = this.f20595e;
        if (aVar != null) {
            aVar.cancel();
            this.f20595e = null;
        }
        if (this.f20593c <= 0) {
            this.f20593c = this.f20592b + f20591a;
        }
        a aVar2 = new a(this.f20592b, this.f20593c);
        this.f20595e = aVar2;
        aVar2.a(this.f20594d);
    }
}

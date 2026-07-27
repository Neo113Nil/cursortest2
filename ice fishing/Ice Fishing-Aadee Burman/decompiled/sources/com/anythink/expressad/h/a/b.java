package com.anythink.expressad.h.a;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f19804a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f19805b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f19806c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.h.a.a f19807d;

    /* renamed from: e, reason: collision with root package name */
    private a f19808e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.h.a.a f19809a;

        public a(long j6, long j9) {
            super(j6, j9);
        }

        public final void a(com.anythink.expressad.h.a.a aVar) {
            this.f19809a = aVar;
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
            j6 = f19804a;
        }
        this.f19806c = j6;
        return this;
    }

    private b b(long j6) {
        this.f19805b = j6;
        return this;
    }

    private void c() {
        a aVar = this.f19808e;
        if (aVar != null) {
            aVar.cancel();
            this.f19808e = null;
        }
    }

    private b a(com.anythink.expressad.h.a.a aVar) {
        this.f19807d = aVar;
        return this;
    }

    private void b() {
        a aVar = this.f19808e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f19808e = null;
            }
            if (this.f19806c <= 0) {
                this.f19806c = this.f19805b + f19804a;
            }
            a aVar2 = new a(this.f19805b, this.f19806c);
            this.f19808e = aVar2;
            aVar2.a(this.f19807d);
        }
        this.f19808e.start();
    }

    private void a() {
        a aVar = this.f19808e;
        if (aVar != null) {
            aVar.cancel();
            this.f19808e = null;
        }
        if (this.f19806c <= 0) {
            this.f19806c = this.f19805b + f19804a;
        }
        a aVar2 = new a(this.f19805b, this.f19806c);
        this.f19808e = aVar2;
        aVar2.a(this.f19807d);
    }
}

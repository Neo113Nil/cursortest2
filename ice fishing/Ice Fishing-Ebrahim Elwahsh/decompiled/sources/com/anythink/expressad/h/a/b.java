package com.anythink.expressad.h.a;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f19962a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private long f19963b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f19964c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.h.a.a f19965d;

    /* renamed from: e, reason: collision with root package name */
    private a f19966e;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.h.a.a f19967a;

        public a(long j9, long j10) {
            super(j9, j10);
        }

        public final void a(com.anythink.expressad.h.a.a aVar) {
            this.f19967a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j9) {
        }
    }

    private b a(long j9) {
        if (j9 < 0) {
            j9 = f19962a;
        }
        this.f19964c = j9;
        return this;
    }

    private b b(long j9) {
        this.f19963b = j9;
        return this;
    }

    private void c() {
        a aVar = this.f19966e;
        if (aVar != null) {
            aVar.cancel();
            this.f19966e = null;
        }
    }

    private b a(com.anythink.expressad.h.a.a aVar) {
        this.f19965d = aVar;
        return this;
    }

    private void b() {
        a aVar = this.f19966e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f19966e = null;
            }
            if (this.f19964c <= 0) {
                this.f19964c = this.f19963b + f19962a;
            }
            a aVar2 = new a(this.f19963b, this.f19964c);
            this.f19966e = aVar2;
            aVar2.a(this.f19965d);
        }
        this.f19966e.start();
    }

    private void a() {
        a aVar = this.f19966e;
        if (aVar != null) {
            aVar.cancel();
            this.f19966e = null;
        }
        if (this.f19964c <= 0) {
            this.f19964c = this.f19963b + f19962a;
        }
        a aVar2 = new a(this.f19963b, this.f19964c);
        this.f19966e = aVar2;
        aVar2.a(this.f19965d);
    }
}

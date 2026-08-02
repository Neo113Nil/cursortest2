package com.anythink.core.common.v;

import android.os.CountDownTimer;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17665a = "CountDownTimerExt";

    /* renamed from: b, reason: collision with root package name */
    private CountDownTimer f17666b;

    /* renamed from: c, reason: collision with root package name */
    private long f17667c = 500;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17668d = true;

    /* renamed from: e, reason: collision with root package name */
    private long f17669e;

    /* renamed from: f, reason: collision with root package name */
    private long f17670f;

    public s(long j6) {
        this.f17669e = j6;
        this.f17670f = j6;
    }

    private void a(boolean z6) {
        this.f17668d = z6;
    }

    private void c(long j6) {
        this.f17669e = j6;
    }

    private boolean f() {
        return this.f17668d;
    }

    private long g() {
        return this.f17669e;
    }

    private long h() {
        return this.f17670f;
    }

    private boolean i() {
        return !this.f17668d;
    }

    public abstract void a();

    public abstract void a(long j6);

    public final void b(long j6) {
        this.f17670f = j6;
    }

    public final void d() {
        if (this.f17668d) {
            return;
        }
        try {
            this.f17666b.cancel();
        } catch (Throwable unused) {
        }
        this.f17668d = true;
    }

    public final void e() {
        if (this.f17668d) {
            a(this.f17670f, this.f17667c);
        }
    }

    private void a(long j6, long j9, long j10) {
        this.f17669e = j6;
        this.f17670f = j9;
        this.f17667c = j10;
        b();
    }

    public final void b() {
        a(this.f17670f, this.f17667c);
    }

    public final void c() {
        try {
            this.f17666b.cancel();
        } catch (Throwable unused) {
        }
        this.f17668d = true;
        this.f17670f = this.f17669e;
    }

    private synchronized void a(long j6, long j9) {
        Throwable th;
        try {
            try {
                this.f17670f = j6;
                this.f17667c = j9;
                if (this.f17669e > 0 && j9 > 0) {
                    if (!this.f17668d) {
                        try {
                            c();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    if (this.f17668d) {
                        CountDownTimer countDownTimer = new CountDownTimer(this.f17670f, this.f17667c) { // from class: com.anythink.core.common.v.s.1
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                s.this.a();
                                s.this.c();
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j10) {
                                s.this.b(j10);
                                s.this.a(j10);
                            }
                        };
                        this.f17666b = countDownTimer;
                        try {
                            countDownTimer.start();
                        } catch (Throwable unused) {
                        }
                        this.f17668d = false;
                        return;
                    }
                    Log.d(f17665a, "ignore start");
                    return;
                }
                Log.d(f17665a, "invalid parameter");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}

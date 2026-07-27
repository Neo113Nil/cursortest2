package com.anythink.core.common.v;

import android.os.CountDownTimer;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16878a = "CountDownTimerExt";

    /* renamed from: b, reason: collision with root package name */
    private CountDownTimer f16879b;

    /* renamed from: c, reason: collision with root package name */
    private long f16880c = 500;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16881d = true;

    /* renamed from: e, reason: collision with root package name */
    private long f16882e;

    /* renamed from: f, reason: collision with root package name */
    private long f16883f;

    public s(long j6) {
        this.f16882e = j6;
        this.f16883f = j6;
    }

    private void a(boolean z3) {
        this.f16881d = z3;
    }

    private void c(long j6) {
        this.f16882e = j6;
    }

    private boolean f() {
        return this.f16881d;
    }

    private long g() {
        return this.f16882e;
    }

    private long h() {
        return this.f16883f;
    }

    private boolean i() {
        return !this.f16881d;
    }

    public abstract void a();

    public abstract void a(long j6);

    public final void b(long j6) {
        this.f16883f = j6;
    }

    public final void d() {
        if (this.f16881d) {
            return;
        }
        try {
            this.f16879b.cancel();
        } catch (Throwable unused) {
        }
        this.f16881d = true;
    }

    public final void e() {
        if (this.f16881d) {
            a(this.f16883f, this.f16880c);
        }
    }

    private void a(long j6, long j9, long j10) {
        this.f16882e = j6;
        this.f16883f = j9;
        this.f16880c = j10;
        b();
    }

    public final void b() {
        a(this.f16883f, this.f16880c);
    }

    public final void c() {
        try {
            this.f16879b.cancel();
        } catch (Throwable unused) {
        }
        this.f16881d = true;
        this.f16883f = this.f16882e;
    }

    private synchronized void a(long j6, long j9) {
        Throwable th;
        try {
            try {
                this.f16883f = j6;
                this.f16880c = j9;
                if (this.f16882e > 0 && j9 > 0) {
                    if (!this.f16881d) {
                        try {
                            c();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    if (this.f16881d) {
                        CountDownTimer countDownTimer = new CountDownTimer(this.f16883f, this.f16880c) { // from class: com.anythink.core.common.v.s.1
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
                        this.f16879b = countDownTimer;
                        try {
                            countDownTimer.start();
                        } catch (Throwable unused) {
                        }
                        this.f16881d = false;
                        return;
                    }
                    Log.d(f16878a, "ignore start");
                    return;
                }
                Log.d(f16878a, "invalid parameter");
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

package defpackage;

import com.ybsdk.core.stories.ProgressCountDownTimer$createTimer$1;

/* loaded from: classes2.dex */
public final class tif0 {
    public final long a;
    public final tls b;
    public final sls c;
    public ProgressCountDownTimer$createTimer$1 d;
    public long e;
    public boolean f;

    public tif0(long j, tls tlsVar, sls slsVar) {
        this.a = j;
        this.b = tlsVar;
        this.c = slsVar;
        this.e = j;
    }

    public final void a() {
        ProgressCountDownTimer$createTimer$1 progressCountDownTimer$createTimer$1 = this.d;
        if (progressCountDownTimer$createTimer$1 != null) {
            progressCountDownTimer$createTimer$1.cancel();
        }
        this.d = null;
    }

    public final void b() {
        if (this.d != null) {
            return;
        }
        ProgressCountDownTimer$createTimer$1 progressCountDownTimer$createTimer$1 = new ProgressCountDownTimer$createTimer$1(this.e, this);
        this.d = progressCountDownTimer$createTimer$1;
        progressCountDownTimer$createTimer$1.start();
    }

    public final void c() {
        ProgressCountDownTimer$createTimer$1 progressCountDownTimer$createTimer$1 = this.d;
        if (progressCountDownTimer$createTimer$1 != null) {
            progressCountDownTimer$createTimer$1.cancel();
        }
        ProgressCountDownTimer$createTimer$1 progressCountDownTimer$createTimer$12 = new ProgressCountDownTimer$createTimer$1(this.a, this);
        this.d = progressCountDownTimer$createTimer$12;
        progressCountDownTimer$createTimer$12.start();
    }
}

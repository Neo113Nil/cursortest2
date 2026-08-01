package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long f8608a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final long f8609b = 20000000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f8610c = 80;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8611d = 6;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f8612e;

    /* renamed from: f, reason: collision with root package name */
    private final b f8613f;

    /* renamed from: g, reason: collision with root package name */
    private final a f8614g;

    /* renamed from: h, reason: collision with root package name */
    private long f8615h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f8616j;

    /* renamed from: k, reason: collision with root package name */
    private long f8617k;

    /* renamed from: l, reason: collision with root package name */
    private long f8618l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8619m;

    /* renamed from: n, reason: collision with root package name */
    private long f8620n;

    /* renamed from: o, reason: collision with root package name */
    private long f8621o;

    /* renamed from: p, reason: collision with root package name */
    private long f8622p;

    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: b, reason: collision with root package name */
        private final DisplayManager f8624b;

        public a(DisplayManager displayManager) {
            this.f8624b = displayManager;
        }

        public final void a() {
            this.f8624b.registerDisplayListener(this, null);
        }

        public final void b() {
            this.f8624b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                f.this.c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public static final class b implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        private static final int f8625b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8626c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8627d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final b f8628e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f8629a = com.anythink.basead.exoplayer.b.f6382b;

        /* renamed from: f, reason: collision with root package name */
        private final Handler f8630f;

        /* renamed from: g, reason: collision with root package name */
        private final HandlerThread f8631g;

        /* renamed from: h, reason: collision with root package name */
        private Choreographer f8632h;
        private int i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f8631g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f8630f = handler;
            handler.sendEmptyMessage(0);
        }

        public static b a() {
            return f8628e;
        }

        private void d() {
            this.f8632h = Choreographer.getInstance();
        }

        private void e() {
            Choreographer choreographer = this.f8632h;
            if (choreographer != null) {
                int i = this.i + 1;
                this.i = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void f() {
            Choreographer choreographer = this.f8632h;
            if (choreographer != null) {
                int i = this.i - 1;
                this.i = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f8629a = com.anythink.basead.exoplayer.b.f6382b;
                }
            }
        }

        public final void b() {
            this.f8630f.sendEmptyMessage(1);
        }

        public final void c() {
            this.f8630f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j6) {
            if (this.f8632h != null) {
                this.f8629a = j6;
                this.f8632h.postFrameCallbackDelayed(this, 500L);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f8632h = Choreographer.getInstance();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f8632h;
                if (choreographer != null) {
                    int i6 = this.i + 1;
                    this.i = i6;
                    if (i6 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f8632h;
            if (choreographer2 != null) {
                int i9 = this.i - 1;
                this.i = i9;
                if (i9 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f8629a = com.anythink.basead.exoplayer.b.f6382b;
                }
            }
            return true;
        }
    }

    public f() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.f8612e.getDefaultDisplay() != null) {
                long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
                this.f8615h = refreshRate;
                this.i = (refreshRate * f8610c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (this.f8612e != null) {
            a aVar = this.f8614g;
            if (aVar != null) {
                aVar.b();
            }
            this.f8613f.c();
        }
    }

    public f(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f8612e = (WindowManager) context.getSystemService("window");
        } else {
            this.f8612e = null;
        }
        if (this.f8612e != null) {
            if (af.f8346a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.f8614g = aVar;
            this.f8613f = b.a();
        } else {
            this.f8614g = null;
            this.f8613f = null;
        }
        this.f8615h = com.anythink.basead.exoplayer.b.f6382b;
        this.i = com.anythink.basead.exoplayer.b.f6382b;
    }

    public final void a() {
        this.f8619m = false;
        if (this.f8612e != null) {
            this.f8613f.b();
            a aVar = this.f8614g;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    private boolean b(long j6, long j9) {
        return Math.abs((j9 - this.f8620n) - (j6 - this.f8621o)) > f8609b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j6, long j9) {
        long j10;
        long j11;
        b bVar;
        long j12;
        long j13;
        long j14 = 1000 * j6;
        if (this.f8619m) {
            if (j6 != this.f8616j) {
                this.f8622p++;
                this.f8617k = this.f8618l;
            }
            long j15 = this.f8622p;
            if (j15 >= 6) {
                j11 = this.f8617k + ((j14 - this.f8621o) / j15);
                if (b(j11, j9)) {
                    this.f8619m = false;
                } else {
                    j10 = (this.f8620n + j11) - this.f8621o;
                    if (!this.f8619m) {
                        this.f8621o = j14;
                        this.f8620n = j9;
                        this.f8622p = 0L;
                        this.f8619m = true;
                    }
                    this.f8616j = j6;
                    this.f8618l = j11;
                    bVar = this.f8613f;
                    if (bVar != null && this.f8615h != com.anythink.basead.exoplayer.b.f6382b) {
                        j12 = bVar.f8629a;
                        if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                            long j16 = this.f8615h;
                            long j17 = (((j10 - j12) / j16) * j16) + j12;
                            if (j10 <= j17) {
                                j13 = j17 - j16;
                            } else {
                                j13 = j17;
                                j17 = j16 + j17;
                            }
                            if (j17 - j10 >= j10 - j13) {
                                j17 = j13;
                            }
                            return j17 - this.i;
                        }
                    }
                    return j10;
                }
            } else if (b(j14, j9)) {
                this.f8619m = false;
            }
        }
        j10 = j9;
        j11 = j14;
        if (!this.f8619m) {
        }
        this.f8616j = j6;
        this.f8618l = j11;
        bVar = this.f8613f;
        if (bVar != null) {
            j12 = bVar.f8629a;
            if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
            }
        }
        return j10;
    }

    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    private static long a(long j6, long j9, long j10) {
        long j11;
        long j12 = (((j6 - j9) / j10) * j10) + j9;
        if (j6 <= j12) {
            j11 = j12 - j10;
        } else {
            j11 = j12;
            j12 = j10 + j12;
        }
        return j12 - j6 < j6 - j11 ? j12 : j11;
    }
}

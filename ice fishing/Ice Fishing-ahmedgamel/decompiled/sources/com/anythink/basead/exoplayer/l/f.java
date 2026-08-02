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
    private static final long f9394a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final long f9395b = 20000000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f9396c = 80;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9397d = 6;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f9398e;

    /* renamed from: f, reason: collision with root package name */
    private final b f9399f;

    /* renamed from: g, reason: collision with root package name */
    private final a f9400g;

    /* renamed from: h, reason: collision with root package name */
    private long f9401h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f9402j;

    /* renamed from: k, reason: collision with root package name */
    private long f9403k;

    /* renamed from: l, reason: collision with root package name */
    private long f9404l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9405m;

    /* renamed from: n, reason: collision with root package name */
    private long f9406n;

    /* renamed from: o, reason: collision with root package name */
    private long f9407o;

    /* renamed from: p, reason: collision with root package name */
    private long f9408p;

    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: b, reason: collision with root package name */
        private final DisplayManager f9410b;

        public a(DisplayManager displayManager) {
            this.f9410b = displayManager;
        }

        public final void a() {
            this.f9410b.registerDisplayListener(this, null);
        }

        public final void b() {
            this.f9410b.unregisterDisplayListener(this);
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
        private static final int f9411b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f9412c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f9413d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final b f9414e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f9415a = com.anythink.basead.exoplayer.b.f7168b;

        /* renamed from: f, reason: collision with root package name */
        private final Handler f9416f;

        /* renamed from: g, reason: collision with root package name */
        private final HandlerThread f9417g;

        /* renamed from: h, reason: collision with root package name */
        private Choreographer f9418h;
        private int i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f9417g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f9416f = handler;
            handler.sendEmptyMessage(0);
        }

        public static b a() {
            return f9414e;
        }

        private void d() {
            this.f9418h = Choreographer.getInstance();
        }

        private void e() {
            Choreographer choreographer = this.f9418h;
            if (choreographer != null) {
                int i = this.i + 1;
                this.i = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void f() {
            Choreographer choreographer = this.f9418h;
            if (choreographer != null) {
                int i = this.i - 1;
                this.i = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f9415a = com.anythink.basead.exoplayer.b.f7168b;
                }
            }
        }

        public final void b() {
            this.f9416f.sendEmptyMessage(1);
        }

        public final void c() {
            this.f9416f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j6) {
            if (this.f9418h != null) {
                this.f9415a = j6;
                this.f9418h.postFrameCallbackDelayed(this, 500L);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f9418h = Choreographer.getInstance();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f9418h;
                if (choreographer != null) {
                    int i4 = this.i + 1;
                    this.i = i4;
                    if (i4 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f9418h;
            if (choreographer2 != null) {
                int i6 = this.i - 1;
                this.i = i6;
                if (i6 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f9415a = com.anythink.basead.exoplayer.b.f7168b;
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
            if (this.f9398e.getDefaultDisplay() != null) {
                long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
                this.f9401h = refreshRate;
                this.i = (refreshRate * f9396c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (this.f9398e != null) {
            a aVar = this.f9400g;
            if (aVar != null) {
                aVar.b();
            }
            this.f9399f.c();
        }
    }

    public f(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f9398e = (WindowManager) context.getSystemService("window");
        } else {
            this.f9398e = null;
        }
        if (this.f9398e != null) {
            if (af.f9132a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.f9400g = aVar;
            this.f9399f = b.a();
        } else {
            this.f9400g = null;
            this.f9399f = null;
        }
        this.f9401h = com.anythink.basead.exoplayer.b.f7168b;
        this.i = com.anythink.basead.exoplayer.b.f7168b;
    }

    public final void a() {
        this.f9405m = false;
        if (this.f9398e != null) {
            this.f9399f.b();
            a aVar = this.f9400g;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    private boolean b(long j6, long j9) {
        return Math.abs((j9 - this.f9406n) - (j6 - this.f9407o)) > f9395b;
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
        if (this.f9405m) {
            if (j6 != this.f9402j) {
                this.f9408p++;
                this.f9403k = this.f9404l;
            }
            long j15 = this.f9408p;
            if (j15 >= 6) {
                j11 = this.f9403k + ((j14 - this.f9407o) / j15);
                if (b(j11, j9)) {
                    this.f9405m = false;
                } else {
                    j10 = (this.f9406n + j11) - this.f9407o;
                    if (!this.f9405m) {
                        this.f9407o = j14;
                        this.f9406n = j9;
                        this.f9408p = 0L;
                        this.f9405m = true;
                    }
                    this.f9402j = j6;
                    this.f9404l = j11;
                    bVar = this.f9399f;
                    if (bVar != null && this.f9401h != com.anythink.basead.exoplayer.b.f7168b) {
                        j12 = bVar.f9415a;
                        if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                            long j16 = this.f9401h;
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
                this.f9405m = false;
            }
        }
        j10 = j9;
        j11 = j14;
        if (!this.f9405m) {
        }
        this.f9402j = j6;
        this.f9404l = j11;
        bVar = this.f9399f;
        if (bVar != null) {
            j12 = bVar.f9415a;
            if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
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

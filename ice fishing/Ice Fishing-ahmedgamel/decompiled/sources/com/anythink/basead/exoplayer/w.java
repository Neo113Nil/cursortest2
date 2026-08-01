package com.anythink.basead.exoplayer;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.anythink.basead.exoplayer.h.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface w {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8763h = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8764j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8765k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8766l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8767m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8768n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8769o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8770p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f8771q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f8772r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f8773s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f8774t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f8775u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f8776v = 2;

    public static abstract class a implements c {
        @Deprecated
        private static void a() {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onLoadingChanged(boolean z3) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onPlaybackParametersChanged(v vVar) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onPlayerStateChanged(boolean z3, int i) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onSeekProcessed() {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onShuffleModeEnabledChanged(boolean z3) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onTimelineChanged(ae aeVar, Object obj, int i) {
        }

        @Override // com.anythink.basead.exoplayer.w.c
        public void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void onLoadingChanged(boolean z3);

        void onPlaybackParametersChanged(v vVar);

        void onPlayerError(com.anythink.basead.exoplayer.g gVar);

        void onPlayerStateChanged(boolean z3, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z3);

        void onTimelineChanged(ae aeVar, Object obj, int i);

        void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public interface g {
        int H();

        void I();

        void a(Surface surface);

        void a(SurfaceHolder surfaceHolder);

        void a(SurfaceView surfaceView);

        void a(TextureView textureView);

        void a(com.anythink.basead.exoplayer.l.g gVar);

        void b(Surface surface);

        void b(SurfaceHolder surfaceHolder);

        void b(SurfaceView surfaceView);

        void b(TextureView textureView);

        void b(com.anythink.basead.exoplayer.l.g gVar);

        void d(int i);
    }

    int A();

    long B();

    int C();

    af D();

    com.anythink.basead.exoplayer.i.g E();

    ae F();

    Object G();

    void a(int i6);

    void a(int i6, long j6);

    void a(long j6);

    void a(v vVar);

    void a(c cVar);

    void a(boolean z3);

    g b();

    void b(int i6);

    void b(c cVar);

    void b(boolean z3);

    int c(int i6);

    e c();

    void c(boolean z3);

    int d();

    com.anythink.basead.exoplayer.g e();

    boolean f();

    int g();

    boolean h();

    boolean i();

    void j();

    v k();

    Object l();

    void m();

    void n();

    int o();

    int p();

    int q();

    int r();

    long s();

    long t();

    long u();

    int v();

    boolean w();

    boolean x();

    boolean y();

    int z();
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.util.HashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC3921sg extends AbstractC3975tg implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f34752M;

    /* renamed from: A, reason: collision with root package name */
    public int f34753A;

    /* renamed from: B, reason: collision with root package name */
    public MediaPlayer f34754B;

    /* renamed from: C, reason: collision with root package name */
    public Uri f34755C;

    /* renamed from: D, reason: collision with root package name */
    public int f34756D;

    /* renamed from: E, reason: collision with root package name */
    public int f34757E;

    /* renamed from: F, reason: collision with root package name */
    public int f34758F;

    /* renamed from: G, reason: collision with root package name */
    public C2489Ag f34759G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f34760H;

    /* renamed from: I, reason: collision with root package name */
    public int f34761I;
    public C4137wg J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34762K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f34763L;

    /* renamed from: v, reason: collision with root package name */
    public final C2575Fh f34764v;

    /* renamed from: w, reason: collision with root package name */
    public final C2523Cg f34765w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f34766x;

    /* renamed from: y, reason: collision with root package name */
    public final C3230fo f34767y;

    /* renamed from: z, reason: collision with root package name */
    public int f34768z;

    static {
        HashMap hashMap = new HashMap();
        f34752M = hashMap;
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f15481e), "MEDIA_ERROR_IO");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f15484h), "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.a.f15187n), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.f21907s), "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.ah), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC3921sg(Context context, C2575Fh c2575Fh, boolean z6, boolean z9, C2523Cg c2523Cg, C3230fo c3230fo) {
        super(context);
        this.f34768z = 0;
        this.f34753A = 0;
        this.f34762K = false;
        this.f34763L = null;
        this.f34764v = c2575Fh;
        this.f34765w = c2523Cg;
        this.f34760H = z6;
        this.f34766x = z9;
        c2523Cg.a(this);
        this.f34767y = c3230fo;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        C3230fo c3230fo;
        w2.z.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f34755C == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            G3.e eVar = C4906k.f40186C.f40208u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f34754B = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f34754B.setOnCompletionListener(this);
            this.f34754B.setOnErrorListener(this);
            this.f34754B.setOnInfoListener(this);
            this.f34754B.setOnPreparedListener(this);
            this.f34754B.setOnVideoSizeChangedListener(this);
            this.f34758F = 0;
            if (this.f34760H) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qe)).booleanValue() && (c3230fo = this.f34767y) != null) {
                    S0.e a9 = c3230fo.a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "svp_ampv");
                    a9.N();
                }
                C2489Ag c2489Ag = new C2489Ag(getContext());
                this.f34759G = c2489Ag;
                int width = getWidth();
                int height = getHeight();
                c2489Ag.f24476F = width;
                c2489Ag.f24475E = height;
                c2489Ag.f24478H = surfaceTexture2;
                C2489Ag c2489Ag2 = this.f34759G;
                c2489Ag2.start();
                if (c2489Ag2.f24478H == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c2489Ag2.f24482M.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c2489Ag2.f24477G;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f34759G.b();
                    this.f34759G = null;
                }
            }
            this.f34754B.setDataSource(getContext(), this.f34755C);
            this.f34754B.setSurface(new Surface(surfaceTexture2));
            this.f34754B.setAudioStreamType(3);
            this.f34754B.setScreenOnWhilePlaying(true);
            this.f34754B.prepareAsync();
            G(1);
        } catch (IOException e9) {
            e = e9;
            x2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f34755C)), e);
            onError(this.f34754B, 1, 0);
        } catch (IllegalArgumentException e10) {
            e = e10;
            x2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f34755C)), e);
            onError(this.f34754B, 1, 0);
        } catch (IllegalStateException e11) {
            e = e11;
            x2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f34755C)), e);
            onError(this.f34754B, 1, 0);
        }
    }

    public final void E(boolean z6) {
        w2.z.k("AdMediaPlayerView release");
        C2489Ag c2489Ag = this.f34759G;
        if (c2489Ag != null) {
            c2489Ag.b();
            this.f34759G = null;
        }
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f34754B.release();
            this.f34754B = null;
            G(0);
            if (z6) {
                this.f34753A = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.f34754B == null || (i = this.f34768z) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        C2557Eg c2557Eg = this.f35108u;
        C2523Cg c2523Cg = this.f34765w;
        if (i == 3) {
            c2523Cg.d();
            c2557Eg.f25393d = true;
            c2557Eg.a();
        } else if (this.f34768z == 3) {
            c2523Cg.f24930m = false;
            c2557Eg.f25393d = false;
            c2557Eg.a();
        }
        this.f34768z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final String d() {
        return "MediaPlayer".concat(true != this.f34760H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void e(C4137wg c4137wg) {
        this.J = c4137wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void f(String str) {
        Uri parse = Uri.parse(str);
        X8 a9 = X8.a(parse);
        if (a9 == null || a9.f29276n != null) {
            if (a9 != null) {
                parse = Uri.parse(a9.f29276n);
            }
            this.f34755C = parse;
            this.f34761I = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void g() {
        w2.z.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f34754B.release();
            this.f34754B = null;
            G(0);
            this.f34753A = 0;
        }
        this.f34765w.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void h() {
        w2.z.k("AdMediaPlayerView play");
        if (F()) {
            this.f34754B.start();
            G(3);
            this.f35107n.f35983c = true;
            w2.D.f41627l.post(new RunnableC3814qg(this, 3));
        }
        this.f34753A = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void i() {
        w2.z.k("AdMediaPlayerView pause");
        if (F() && this.f34754B.isPlaying()) {
            this.f34754B.pause();
            G(4);
            w2.D.f41627l.post(new RunnableC3814qg(this, 4));
        }
        this.f34753A = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int j() {
        if (F()) {
            return this.f34754B.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int k() {
        if (F()) {
            return this.f34754B.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        w2.z.k(sb.toString());
        if (!F()) {
            this.f34761I = i;
        } else {
            this.f34754B.seekTo(i);
            this.f34761I = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Dg
    public final void m() {
        C2557Eg c2557Eg = this.f35108u;
        float f2 = c2557Eg.f25392c ? c2557Eg.f25394e ? 0.0f : c2557Eg.f25395f : 0.0f;
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = w2.z.f41712b;
            x2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void n(float f2, float f9) {
        C2489Ag c2489Ag = this.f34759G;
        if (c2489Ag != null) {
            c2489Ag.c(f2, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int o() {
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f34758F = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        w2.z.k("AdMediaPlayerView completion");
        G(5);
        this.f34753A = 5;
        w2.D.f41627l.post(new RunnableC3814qg(this, 0, false));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i4) {
        HashMap hashMap = f34752M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i4));
        String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i6 = w2.z.f41712b;
        x2.i.f(r9);
        G(-1);
        this.f34753A = -1;
        w2.D.f41627l.post(new RunnableC3888s0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i4) {
        HashMap hashMap = f34752M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i4));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        w2.z.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int i6;
        int defaultSize = View.getDefaultSize(this.f34756D, i);
        int defaultSize2 = View.getDefaultSize(this.f34757E, i4);
        if (this.f34756D > 0 && this.f34757E > 0 && this.f34759G == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int size2 = View.MeasureSpec.getSize(i4);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i9 = this.f34756D;
                    int i10 = i9 * size2;
                    int i11 = this.f34757E;
                    int i12 = size * i11;
                    if (i10 < i12) {
                        defaultSize = i10 / i11;
                        defaultSize2 = size2;
                    } else {
                        if (i10 > i12) {
                            defaultSize2 = i12 / i9;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i13 = (this.f34757E * size) / this.f34756D;
                if (mode2 != Integer.MIN_VALUE || i13 <= size2) {
                    defaultSize2 = i13;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i6 = (this.f34756D * size2) / this.f34757E;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i14 = this.f34756D;
                    int i15 = this.f34757E;
                    if (mode2 != Integer.MIN_VALUE || i15 <= size2) {
                        i6 = i14;
                        size2 = i15;
                    } else {
                        i6 = (size2 * i14) / i15;
                    }
                    if (mode == Integer.MIN_VALUE && i6 > size) {
                        defaultSize2 = (i15 * size) / i14;
                        defaultSize = size;
                    }
                }
                defaultSize = i6;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C2489Ag c2489Ag = this.f34759G;
        if (c2489Ag != null) {
            c2489Ag.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        w2.z.k("AdMediaPlayerView prepared");
        G(2);
        C2523Cg c2523Cg = this.f34765w;
        if (c2523Cg.i && !c2523Cg.f24927j) {
            AbstractC2991bG.j(c2523Cg.f24923e, c2523Cg.f24922d, "vfr2");
            c2523Cg.f24927j = true;
        }
        w2.D.f41627l.post(new RunnableC3996u0(this, mediaPlayer, 12, false));
        this.f34756D = mediaPlayer.getVideoWidth();
        this.f34757E = mediaPlayer.getVideoHeight();
        int i = this.f34761I;
        if (i != 0) {
            l(i);
        }
        if (this.f34766x && F() && this.f34754B.getCurrentPosition() > 0 && this.f34753A != 3) {
            w2.z.k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f34754B;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                x2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f34754B.start();
            int currentPosition = this.f34754B.getCurrentPosition();
            C4906k.f40186C.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (F() && this.f34754B.getCurrentPosition() == currentPosition) {
                C4906k.f40186C.f40198k.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f34754B.pause();
            m();
        }
        int i4 = this.f34756D;
        int i6 = this.f34757E;
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40 + String.valueOf(i6).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i4);
        sb.append(" x ");
        sb.append(i6);
        x2.i.e(sb.toString());
        if (this.f34753A == 3) {
            h();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        w2.z.k("AdMediaPlayerView surface created");
        D();
        w2.D.f41627l.post(new RunnableC3814qg(this, 1, false));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        w2.z.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null && this.f34761I == 0) {
            this.f34761I = mediaPlayer.getCurrentPosition();
        }
        C2489Ag c2489Ag = this.f34759G;
        if (c2489Ag != null) {
            c2489Ag.b();
        }
        w2.D.f41627l.post(new RunnableC3814qg(this, 2, false));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        w2.z.k("AdMediaPlayerView surface changed");
        int i6 = this.f34753A;
        boolean z6 = false;
        if (this.f34756D == i && this.f34757E == i4) {
            z6 = true;
        }
        if (this.f34754B != null && i6 == 3 && z6) {
            int i9 = this.f34761I;
            if (i9 != 0) {
                l(i9);
            }
            h();
        }
        C2489Ag c2489Ag = this.f34759G;
        if (c2489Ag != null) {
            c2489Ag.a(i, i4);
        }
        w2.D.f41627l.post(new RunnableC3867rg(this, i, i4, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f34765w.c(this);
        this.f35107n.a(surfaceTexture, this.J);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i4) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i4).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i4);
        w2.z.k(sb.toString());
        this.f34756D = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f34757E = videoHeight;
        if (this.f34756D == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        w2.z.k(sb.toString());
        w2.D.f41627l.post(new L.a(this, i, 7));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int p() {
        MediaPlayer mediaPlayer = this.f34754B;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC3921sg.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.x.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long v() {
        if (this.f34763L != null) {
            return (x() * this.f34758F) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long x() {
        if (this.f34763L != null) {
            return j() * this.f34763L.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int y() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        metrics = this.f34754B.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }
}

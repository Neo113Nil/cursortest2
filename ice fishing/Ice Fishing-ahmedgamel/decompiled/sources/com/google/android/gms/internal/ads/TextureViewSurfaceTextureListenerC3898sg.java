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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC3898sg extends AbstractC3952tg implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f33986M;

    /* renamed from: A, reason: collision with root package name */
    public int f33987A;

    /* renamed from: B, reason: collision with root package name */
    public MediaPlayer f33988B;

    /* renamed from: C, reason: collision with root package name */
    public Uri f33989C;

    /* renamed from: D, reason: collision with root package name */
    public int f33990D;

    /* renamed from: E, reason: collision with root package name */
    public int f33991E;

    /* renamed from: F, reason: collision with root package name */
    public int f33992F;

    /* renamed from: G, reason: collision with root package name */
    public C2469Ag f33993G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f33994H;

    /* renamed from: I, reason: collision with root package name */
    public int f33995I;
    public C4114wg J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f33996K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f33997L;

    /* renamed from: v, reason: collision with root package name */
    public final C2555Fh f33998v;

    /* renamed from: w, reason: collision with root package name */
    public final C2503Cg f33999w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f34000x;

    /* renamed from: y, reason: collision with root package name */
    public final C3153eo f34001y;

    /* renamed from: z, reason: collision with root package name */
    public int f34002z;

    static {
        HashMap hashMap = new HashMap();
        f33986M = hashMap;
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f14695e), "MEDIA_ERROR_IO");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f14698h), "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.a.f14401n), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.f21120s), "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.ah), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC3898sg(Context context, C2555Fh c2555Fh, boolean z3, boolean z6, C2503Cg c2503Cg, C3153eo c3153eo) {
        super(context);
        this.f34002z = 0;
        this.f33987A = 0;
        this.f33996K = false;
        this.f33997L = null;
        this.f33998v = c2555Fh;
        this.f33999w = c2503Cg;
        this.f33994H = z3;
        this.f34000x = z6;
        c2503Cg.a(this);
        this.f34001y = c3153eo;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        C3153eo c3153eo;
        u2.z.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f33989C == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            E3.e eVar = C4835j.f39733C.f39755u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f33988B = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f33988B.setOnCompletionListener(this);
            this.f33988B.setOnErrorListener(this);
            this.f33988B.setOnInfoListener(this);
            this.f33988B.setOnPreparedListener(this);
            this.f33988B.setOnVideoSizeChangedListener(this);
            this.f33992F = 0;
            if (this.f33994H) {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Qe)).booleanValue() && (c3153eo = this.f34001y) != null) {
                    S0.e a9 = c3153eo.a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "svp_ampv");
                    a9.y();
                }
                C2469Ag c2469Ag = new C2469Ag(getContext());
                this.f33993G = c2469Ag;
                int width = getWidth();
                int height = getHeight();
                c2469Ag.f23694F = width;
                c2469Ag.f23693E = height;
                c2469Ag.f23696H = surfaceTexture2;
                C2469Ag c2469Ag2 = this.f33993G;
                c2469Ag2.start();
                if (c2469Ag2.f23696H == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c2469Ag2.f23700M.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c2469Ag2.f23695G;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f33993G.b();
                    this.f33993G = null;
                }
            }
            this.f33988B.setDataSource(getContext(), this.f33989C);
            this.f33988B.setSurface(new Surface(surfaceTexture2));
            this.f33988B.setAudioStreamType(3);
            this.f33988B.setScreenOnWhilePlaying(true);
            this.f33988B.prepareAsync();
            G(1);
        } catch (IOException e9) {
            e = e9;
            v2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33989C)), e);
            onError(this.f33988B, 1, 0);
        } catch (IllegalArgumentException e10) {
            e = e10;
            v2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33989C)), e);
            onError(this.f33988B, 1, 0);
        } catch (IllegalStateException e11) {
            e = e11;
            v2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33989C)), e);
            onError(this.f33988B, 1, 0);
        }
    }

    public final void E(boolean z3) {
        u2.z.k("AdMediaPlayerView release");
        C2469Ag c2469Ag = this.f33993G;
        if (c2469Ag != null) {
            c2469Ag.b();
            this.f33993G = null;
        }
        MediaPlayer mediaPlayer = this.f33988B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f33988B.release();
            this.f33988B = null;
            G(0);
            if (z3) {
                this.f33987A = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.f33988B == null || (i = this.f34002z) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        C2537Eg c2537Eg = this.f34329u;
        C2503Cg c2503Cg = this.f33999w;
        if (i == 3) {
            c2503Cg.d();
            c2537Eg.f24640d = true;
            c2537Eg.a();
        } else if (this.f34002z == 3) {
            c2503Cg.f24195m = false;
            c2537Eg.f24640d = false;
            c2537Eg.a();
        }
        this.f34002z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final String d() {
        return "MediaPlayer".concat(true != this.f33994H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void e(C4114wg c4114wg) {
        this.J = c4114wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void f(String str) {
        Uri parse = Uri.parse(str);
        X8 a9 = X8.a(parse);
        if (a9 == null || a9.f28496n != null) {
            if (a9 != null) {
                parse = Uri.parse(a9.f28496n);
            }
            this.f33989C = parse;
            this.f33995I = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void g() {
        u2.z.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f33988B;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f33988B.release();
            this.f33988B = null;
            G(0);
            this.f33987A = 0;
        }
        this.f33999w.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void h() {
        u2.z.k("AdMediaPlayerView play");
        if (F()) {
            this.f33988B.start();
            G(3);
            this.f34328n.f35193c = true;
            u2.D.f41237l.post(new RunnableC3791qg(this, 3));
        }
        this.f33987A = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void i() {
        u2.z.k("AdMediaPlayerView pause");
        if (F() && this.f33988B.isPlaying()) {
            this.f33988B.pause();
            G(4);
            u2.D.f41237l.post(new RunnableC3791qg(this, 4));
        }
        this.f33987A = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int j() {
        if (F()) {
            return this.f33988B.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int k() {
        if (F()) {
            return this.f33988B.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        u2.z.k(sb.toString());
        if (!F()) {
            this.f33995I = i;
        } else {
            this.f33988B.seekTo(i);
            this.f33995I = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2520Dg
    public final void m() {
        C2537Eg c2537Eg = this.f34329u;
        float f3 = c2537Eg.f24639c ? c2537Eg.f24641e ? 0.0f : c2537Eg.f24642f : 0.0f;
        MediaPlayer mediaPlayer = this.f33988B;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f3, f3);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = u2.z.f41322b;
            v2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void n(float f3, float f9) {
        C2469Ag c2469Ag = this.f33993G;
        if (c2469Ag != null) {
            c2469Ag.c(f3, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int o() {
        MediaPlayer mediaPlayer = this.f33988B;
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
        this.f33992F = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        u2.z.k("AdMediaPlayerView completion");
        G(5);
        this.f33987A = 5;
        u2.D.f41237l.post(new RunnableC3791qg(this, 0, false));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i6) {
        HashMap hashMap = f33986M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i6));
        String o6 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i9 = u2.z.f41322b;
        v2.i.f(o6);
        G(-1);
        this.f33987A = -1;
        u2.D.f41237l.post(new RunnableC3865s0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i6) {
        HashMap hashMap = f33986M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i6));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        u2.z.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i6) {
        int i9;
        int defaultSize = View.getDefaultSize(this.f33990D, i);
        int defaultSize2 = View.getDefaultSize(this.f33991E, i6);
        if (this.f33990D > 0 && this.f33991E > 0 && this.f33993G == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i6);
            int size2 = View.MeasureSpec.getSize(i6);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i10 = this.f33990D;
                    int i11 = i10 * size2;
                    int i12 = this.f33991E;
                    int i13 = size * i12;
                    if (i11 < i13) {
                        defaultSize = i11 / i12;
                        defaultSize2 = size2;
                    } else {
                        if (i11 > i13) {
                            defaultSize2 = i13 / i10;
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
                int i14 = (this.f33991E * size) / this.f33990D;
                if (mode2 != Integer.MIN_VALUE || i14 <= size2) {
                    defaultSize2 = i14;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i9 = (this.f33990D * size2) / this.f33991E;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i15 = this.f33990D;
                    int i16 = this.f33991E;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        i9 = i15;
                        size2 = i16;
                    } else {
                        i9 = (size2 * i15) / i16;
                    }
                    if (mode == Integer.MIN_VALUE && i9 > size) {
                        defaultSize2 = (i16 * size) / i15;
                        defaultSize = size;
                    }
                }
                defaultSize = i9;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C2469Ag c2469Ag = this.f33993G;
        if (c2469Ag != null) {
            c2469Ag.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        u2.z.k("AdMediaPlayerView prepared");
        G(2);
        C2503Cg c2503Cg = this.f33999w;
        if (c2503Cg.i && !c2503Cg.f24192j) {
            AbstractC2968bG.j(c2503Cg.f24188e, c2503Cg.f24187d, "vfr2");
            c2503Cg.f24192j = true;
        }
        u2.D.f41237l.post(new RunnableC3973u0(this, mediaPlayer, 12, false));
        this.f33990D = mediaPlayer.getVideoWidth();
        this.f33991E = mediaPlayer.getVideoHeight();
        int i = this.f33995I;
        if (i != 0) {
            l(i);
        }
        if (this.f34000x && F() && this.f33988B.getCurrentPosition() > 0 && this.f33987A != 3) {
            u2.z.k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f33988B;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                v2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f33988B.start();
            int currentPosition = this.f33988B.getCurrentPosition();
            C4835j.f39733C.f39745k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (F() && this.f33988B.getCurrentPosition() == currentPosition) {
                C4835j.f39733C.f39745k.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f33988B.pause();
            m();
        }
        int i6 = this.f33990D;
        int i9 = this.f33991E;
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 40 + String.valueOf(i9).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i6);
        sb.append(" x ");
        sb.append(i9);
        v2.i.e(sb.toString());
        if (this.f33987A == 3) {
            h();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i6) {
        u2.z.k("AdMediaPlayerView surface created");
        D();
        u2.D.f41237l.post(new RunnableC3791qg(this, 1, false));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u2.z.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f33988B;
        if (mediaPlayer != null && this.f33995I == 0) {
            this.f33995I = mediaPlayer.getCurrentPosition();
        }
        C2469Ag c2469Ag = this.f33993G;
        if (c2469Ag != null) {
            c2469Ag.b();
        }
        u2.D.f41237l.post(new RunnableC3791qg(this, 2, false));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i6) {
        u2.z.k("AdMediaPlayerView surface changed");
        int i9 = this.f33987A;
        boolean z3 = false;
        if (this.f33990D == i && this.f33991E == i6) {
            z3 = true;
        }
        if (this.f33988B != null && i9 == 3 && z3) {
            int i10 = this.f33995I;
            if (i10 != 0) {
                l(i10);
            }
            h();
        }
        C2469Ag c2469Ag = this.f33993G;
        if (c2469Ag != null) {
            c2469Ag.a(i, i6);
        }
        u2.D.f41237l.post(new RunnableC3844rg(this, i, i6, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f33999w.c(this);
        this.f34328n.a(surfaceTexture, this.J);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i6) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i6).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i6);
        u2.z.k(sb.toString());
        this.f33990D = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f33991E = videoHeight;
        if (this.f33990D == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        u2.z.k(sb.toString());
        u2.D.f41237l.post(new L.a(this, i, 7));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int p() {
        MediaPlayer mediaPlayer = this.f33988B;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC3898sg.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.y.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long v() {
        if (this.f33997L != null) {
            return (x() * this.f33992F) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long x() {
        if (this.f33997L != null) {
            return j() * this.f33997L.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int y() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        metrics = this.f33988B.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }
}

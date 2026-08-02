package com.anythink.basead.ui;

import D.x;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.exoplayer.ad;
import com.anythink.basead.exoplayer.d;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i;
import com.anythink.basead.exoplayer.j.q;
import com.anythink.basead.exoplayer.l.g;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.core.common.a.n;
import com.anythink.core.common.a.o;
import com.anythink.core.common.d.t;
import com.google.android.gms.internal.ads.Wv;
import java.io.File;
import java.util.List;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class PlayerView extends BasePlayerView {
    public static final String TAG = "PlayerView";

    /* renamed from: A, reason: collision with root package name */
    private ad f10975A;

    /* renamed from: B, reason: collision with root package name */
    private s f10976B;

    /* renamed from: C, reason: collision with root package name */
    private TextureView f10977C;

    /* renamed from: D, reason: collision with root package name */
    private String f10978D;

    /* renamed from: E, reason: collision with root package name */
    private String f10979E;

    /* renamed from: F, reason: collision with root package name */
    private int f10980F;

    /* renamed from: G, reason: collision with root package name */
    private int f10981G;

    /* renamed from: H, reason: collision with root package name */
    private int f10982H;

    /* renamed from: I, reason: collision with root package name */
    private int f10983I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f10984K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10985L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f10986M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10987N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f10988O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f10989P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10990Q;

    /* renamed from: R, reason: collision with root package name */
    private Handler f10991R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10992S;

    /* renamed from: T, reason: collision with root package name */
    private Thread f10993T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10994U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f10995V;

    /* renamed from: W, reason: collision with root package name */
    private View f10996W;

    /* renamed from: a, reason: collision with root package name */
    int f10997a;
    private w.c aa;
    private g ab;
    private final long ac;
    private long ad;
    private boolean ae;

    /* renamed from: b, reason: collision with root package name */
    int f10998b;

    /* renamed from: c, reason: collision with root package name */
    int f10999c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11000d;

    /* renamed from: e, reason: collision with root package name */
    String f11001e;

    /* renamed from: f, reason: collision with root package name */
    String f11002f;

    /* renamed from: g, reason: collision with root package name */
    e f11003g;

    /* renamed from: h, reason: collision with root package name */
    Object f11004h;

    /* renamed from: com.anythink.basead.ui.PlayerView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (((BasePlayerView) PlayerView.this).f11257w != null) {
                ((BasePlayerView) PlayerView.this).f11257w.b(1);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$4, reason: invalid class name */
    public class AnonymousClass4 extends w.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            boolean z6;
            long j6;
            super.onPlayerError(gVar);
            String str = "Play error and ExoPlayer have not message.";
            if (gVar != null) {
                int i = gVar.f8055d;
                z6 = true;
                if (i != 0) {
                    if (i == 1) {
                        str = "Play error, because have a RendererException.";
                    } else if (i == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                    z6 = false;
                } else {
                    str = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    StringBuilder c9 = AbstractC5050e.c(str, ",eception:");
                    c9.append(gVar.getCause().getMessage());
                    str = c9.toString();
                }
            } else {
                z6 = false;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.f11000d && z6) {
                playerView.f11002f = str;
                String str2 = PlayerView.TAG;
                playerView.f11000d = false;
                PlayerView.M(playerView);
                return;
            }
            playerView.d();
            if (((BasePlayerView) PlayerView.this).f11257w != null) {
                try {
                    j6 = PlayerView.this.f10975A.t();
                } catch (Throwable unused) {
                    j6 = 0;
                }
                String str3 = j6 <= 0 ? com.anythink.basead.d.g.f6970p : com.anythink.basead.d.g.f6965k;
                String str4 = "videoUrl:" + PlayerView.this.f10979E + ",readyRate:" + PlayerView.this.f10999c + ",cdRate:" + PlayerView.this.f10998b + ",play process:" + j6;
                String h3 = TextUtils.isEmpty(PlayerView.this.f11002f) ? Wv.h(str4, ",localFileErrorMsg:", str) : x.p(AbstractC5050e.c(str4, ",localFileErrorMsg:"), PlayerView.this.f11002f, ",errorMsg:", str);
                if (PlayerView.this.f10989P) {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6940I.concat(String.valueOf(h3))));
                } else {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6947Q.concat(String.valueOf(h3))));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z6, int i) {
            super.onPlayerStateChanged(z6, i);
            String str = PlayerView.TAG;
            if (i == 2) {
                if (!PlayerView.this.f10990Q) {
                    PlayerView.this.f10990Q = true;
                    PlayerView.R(PlayerView.this);
                }
                PlayerView playerView = PlayerView.this;
                PlayerView.b(playerView, playerView.f10975A.s());
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                PlayerView.this.d();
                if (((BasePlayerView) PlayerView.this).f11254t) {
                    return;
                }
                PlayerView.Y(PlayerView.this);
                PlayerView playerView2 = PlayerView.this;
                playerView2.f10980F = playerView2.f10981G;
                if (((BasePlayerView) PlayerView.this).f11257w != null) {
                    ((BasePlayerView) PlayerView.this).f11257w.c();
                }
                PlayerView.this.a(BaseATView.a.f10555E);
                PlayerView.this.h();
                return;
            }
            if (!PlayerView.this.f10989P) {
                PlayerView.this.f10990Q = false;
                PlayerView playerView3 = PlayerView.this;
                playerView3.f10981G = (int) playerView3.f10975A.s();
                PlayerView.c(PlayerView.this, r3.f10981G);
                if (((BasePlayerView) PlayerView.this).f11257w != null) {
                    ((BasePlayerView) PlayerView.this).f11257w.b(PlayerView.this.f10981G);
                }
                PlayerView.this.f10982H = Math.round(r3.f10981G * 0.25f);
                PlayerView.this.f10983I = Math.round(r3.f10981G * 0.5f);
                PlayerView.this.J = Math.round(r3.f10981G * 0.75f);
                PlayerView.b(PlayerView.this, r3.f10981G);
                PlayerView.V(PlayerView.this);
            }
            if (PlayerView.this.f10980F > 0 && Math.abs(PlayerView.this.f10980F - PlayerView.this.f10975A.t()) > 500) {
                PlayerView.this.f10975A.a(PlayerView.this.f10980F);
            }
            if (PlayerView.this.isPlaying()) {
                PlayerView.this.c();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$5, reason: invalid class name */
    public class AnonymousClass5 implements g {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a(int i, int i4) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i, i4, playerView.f10977C);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10978D = "";
        this.f10979E = "";
        this.f10980F = -1;
        this.f10987N = false;
        this.f10988O = false;
        this.f10989P = false;
        this.f10990Q = false;
        this.f10998b = 0;
        this.f10999c = 0;
        this.f11000d = false;
        this.f11001e = "";
        this.f11002f = "";
        this.ac = f.f7973a;
        this.ad = 0L;
        this.f11004h = new Object();
        this.ae = true;
        setSaveEnabled(true);
        this.f10991R = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (((BasePlayerView) PlayerView.this).f11257w == null) {
                    return;
                }
                PlayerView.this.f10980F = message.what;
                if (!PlayerView.this.f10988O && !((BasePlayerView) PlayerView.this).f11254t) {
                    PlayerView.d(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f11257w != null) {
                        ((BasePlayerView) PlayerView.this).f11257w.a();
                    }
                    PlayerView.this.a(202);
                }
                if (((BasePlayerView) PlayerView.this).f11257w != null) {
                    ((BasePlayerView) PlayerView.this).f11257w.a(PlayerView.this.f10980F);
                }
                if (!PlayerView.this.f10984K && PlayerView.this.f10980F >= PlayerView.this.f10982H) {
                    PlayerView.l(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f11257w != null) {
                        ((BasePlayerView) PlayerView.this).f11257w.a(25);
                    }
                    PlayerView.this.a(BaseATView.a.f10552B);
                } else if (!PlayerView.this.f10985L && PlayerView.this.f10980F >= PlayerView.this.f10983I) {
                    PlayerView.q(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f11257w != null) {
                        ((BasePlayerView) PlayerView.this).f11257w.a(50);
                    }
                    PlayerView.this.a(BaseATView.a.f10553C);
                } else if (!PlayerView.this.f10986M && PlayerView.this.f10980F >= PlayerView.this.J) {
                    PlayerView.v(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f11257w != null) {
                        ((BasePlayerView) PlayerView.this).f11257w.a(75);
                    }
                    PlayerView.this.a(BaseATView.a.f10554D);
                }
                if (PlayerView.this.ae || !PlayerView.this.f10995V) {
                    return;
                }
                int i = PlayerView.this.f10980F;
                PlayerView playerView = PlayerView.this;
                if (i < playerView.f10997a || ((BasePlayerView) playerView).f11257w == null) {
                    return;
                }
                PlayerView.B(PlayerView.this);
                ((BasePlayerView) PlayerView.this).f11257w.f();
            }
        };
        setBackgroundColor(-16777216);
    }

    public static /* synthetic */ boolean B(PlayerView playerView) {
        playerView.f10995V = false;
        return false;
    }

    public static /* synthetic */ void M(PlayerView playerView) {
        BasePlayerView.a aVar = playerView.f11257w;
        if (aVar != null) {
            aVar.f();
        }
        playerView.f10975A.a(playerView.f10976B);
    }

    public static /* synthetic */ void R(PlayerView playerView) {
        View view = playerView.f10996W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static /* synthetic */ boolean V(PlayerView playerView) {
        playerView.f10989P = true;
        return true;
    }

    public static /* synthetic */ boolean Y(PlayerView playerView) {
        playerView.f11254t = true;
        return true;
    }

    public static /* synthetic */ boolean l(PlayerView playerView) {
        playerView.f10984K = true;
        return true;
    }

    public static /* synthetic */ boolean q(PlayerView playerView) {
        playerView.f10985L = true;
        return true;
    }

    public static /* synthetic */ boolean v(PlayerView playerView) {
        playerView.f10986M = true;
        return true;
    }

    public void autoFitVideoSize(int i, int i4, View view) {
        float max = Math.max(i / view.getMeasuredWidth(), i4 / view.getMeasuredHeight());
        int ceil = (int) Math.ceil(r4 / max);
        int ceil2 = (int) Math.ceil(r5 / max);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = ceil;
        layoutParams.height = ceil2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return Math.max(this.f10980F, 0);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        ad adVar = this.f10975A;
        return adVar != null ? adVar.s() : this.f10981G;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f10994U;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(com.anythink.core.common.h.w wVar, com.anythink.core.common.h.x xVar, boolean z6, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z6, list, eVar);
        this.f11003g = eVar;
        c(z6);
        initMuteStatus(z6);
        setVideoRateConfig(wVar.r().ac(), wVar.r().ad());
        load(wVar.E(), false);
    }

    public void initMuteStatus(boolean z6) {
        this.f10992S = z6;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f10992S;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        ad adVar = this.f10975A;
        return adVar != null && adVar.J();
    }

    public void load(String str, boolean z6) {
        this.f10979E = str;
        com.anythink.basead.b.f.a();
        this.f10978D = com.anythink.basead.b.f.a(4, str);
        if (!new File(this.f10978D).exists() && TextUtils.isEmpty(this.f10979E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6965k, com.anythink.basead.d.g.f6946P));
            return;
        }
        this.f10994U = true;
        if (this.f10977C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10977C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10977C, layoutParams);
        }
        if (this.f10975A == null) {
            this.f10975A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10975A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10975A.a(anonymousClass5);
            this.f10975A.a(this.f10992S ? 0.0f : 1.0f);
            this.f10975A.a(z6);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f11260z) {
            return;
        }
        release(5);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        try {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            if (parcelable2 == null) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            super.onRestoreInstanceState(parcelable2);
            this.f10980F = bundle.getInt("savePosition");
            this.f10984K = bundle.getBoolean("saveVideoPlay25");
            this.f10985L = bundle.getBoolean("saveVideoPlay50");
            this.f10986M = bundle.getBoolean("saveVideoPlay75");
            this.f10988O = bundle.getBoolean("saveIsVideoStart");
            this.f11254t = bundle.getBoolean("saveIsVideoPlayCompletion");
            this.f10992S = bundle.getBoolean("saveIsMute");
            this.f10995V = bundle.getBoolean("saveVideoNeedResumeByCdRate");
            ad adVar = this.f10975A;
            if (adVar != null) {
                adVar.a(this.f10992S ? 0.0f : 1.0f);
            }
            bundle.toString();
        } catch (Throwable unused) {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        try {
            Parcelable onSaveInstanceState = super.onSaveInstanceState();
            Bundle bundle = new Bundle();
            bundle.putParcelable("superState", onSaveInstanceState);
            bundle.putInt("savePosition", this.f10980F);
            bundle.putBoolean("saveVideoPlay25", this.f10984K);
            bundle.putBoolean("saveVideoPlay50", this.f10985L);
            bundle.putBoolean("saveVideoPlay75", this.f10986M);
            bundle.putBoolean("saveIsVideoStart", this.f10988O);
            bundle.putBoolean("saveIsVideoPlayCompletion", this.f11254t);
            bundle.putBoolean("saveIsMute", this.f10992S);
            bundle.putBoolean("saveVideoNeedResumeByCdRate", this.f10995V);
            bundle.toString();
            return bundle;
        } catch (Throwable unused) {
            return super.onSaveInstanceState();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (isPlaying()) {
            a(BaseATView.a.f10556F);
        }
        d();
        ad adVar = this.f10975A;
        if (adVar != null) {
            adVar.a(false);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void rePlayVideo() {
        if (this.f10975A != null) {
            this.f10980F = 0;
            this.f10988O = false;
            this.f11254t = false;
            synchronized (this.f11004h) {
                this.f11003g = null;
            }
            a(f(), true);
            start();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(final int i) {
        final long currentPosition = getCurrentPosition();
        final long videoLength = getVideoLength();
        d();
        h();
        if (!this.f11254t) {
            a(BaseATView.a.J);
        }
        ad adVar = this.f10975A;
        if (adVar != null) {
            if (adVar.J()) {
                this.f10975A.m();
            }
            w.c cVar = this.aa;
            if (cVar != null) {
                this.f10975A.b(cVar);
            }
            g gVar = this.ab;
            if (gVar != null) {
                this.f10975A.b(gVar);
            }
            this.f10975A.n();
            this.f10975A = null;
        }
        Handler handler = this.f10991R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f10989P = false;
        if (!this.ae) {
            com.anythink.core.common.res.b.c.a().d(this.f10979E);
        }
        com.anythink.core.common.h.w wVar = this.f11258x;
        if (wVar == null || !wVar.c()) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.6
                @Override // java.lang.Runnable
                public final void run() {
                    long j6;
                    long j9;
                    n a9;
                    if (((BasePlayerView) PlayerView.this).f11259y == null || ((BasePlayerView) PlayerView.this).f11258x == null) {
                        return;
                    }
                    if (((BasePlayerView) PlayerView.this).f11258x == null || (a9 = o.a().a(((BasePlayerView) PlayerView.this).f11258x.E())) == null) {
                        j6 = 0;
                        j9 = 0;
                    } else {
                        j6 = a9.e();
                        j9 = a9.d();
                    }
                    com.anythink.core.common.u.e.b(((BasePlayerView) PlayerView.this).f11259y, ((BasePlayerView) PlayerView.this).f11258x, i, currentPosition, j6, videoLength, j9);
                }
            }, 8);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f11257w = aVar;
    }

    public void setLoadingView(View view) {
        this.f10996W = view;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z6) {
        this.f10992S = z6;
        if (z6) {
            ad adVar = this.f10975A;
            if (adVar != null) {
                adVar.a(0.0f);
            }
            BasePlayerView.a aVar = this.f11257w;
            if (aVar != null) {
                aVar.d();
            }
        } else {
            ad adVar2 = this.f10975A;
            if (adVar2 != null) {
                adVar2.a(1.0f);
            }
            BasePlayerView.a aVar2 = this.f11257w;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
        c(z6);
        a(BaseATView.a.f10560K);
    }

    public void setVideoRateConfig(int i, int i4) {
        this.f10999c = i;
        this.f10998b = i4;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        View view = this.f10996W;
        if (view != null) {
            view.setVisibility(8);
        }
        if (!isPlaying()) {
            a(BaseATView.a.f10557G);
        }
        ad adVar = this.f10975A;
        if (adVar != null) {
            adVar.a(true);
        }
        c();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        ad adVar = this.f10975A;
        if (adVar != null) {
            adVar.m();
        }
        h();
    }

    public static /* synthetic */ boolean d(PlayerView playerView) {
        playerView.f10988O = true;
        return true;
    }

    private void g() {
        if (this.f10977C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10977C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10977C, layoutParams);
        }
    }

    private void i() {
        BasePlayerView.a aVar = this.f11257w;
        if (aVar != null) {
            aVar.f();
        }
        this.f10975A.a(this.f10976B);
    }

    private void j() {
        synchronized (this.f11004h) {
            this.f11003g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f10987N = false;
        this.f10993T = null;
        this.ad = 0L;
    }

    private boolean e() {
        if (!new File(this.f10978D).exists() && TextUtils.isEmpty(this.f10979E)) {
            return true;
        }
        this.f10994U = true;
        return false;
    }

    private String f() {
        if (new File(this.f10978D).exists()) {
            return this.f10978D;
        }
        return this.f10979E;
    }

    private void b() {
        View view = this.f10996W;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f10993T != null) {
            return;
        }
        this.f10987N = true;
        this.ad = 0L;
        Thread thread = new Thread(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3
            @Override // java.lang.Runnable
            public final void run() {
                while (PlayerView.this.f10987N) {
                    if (((BasePlayerView) PlayerView.this).f11254t || !PlayerView.this.isPlaying() || PlayerView.this.f10991R == null) {
                        if (PlayerView.this.ad == 0) {
                            PlayerView.this.ad = SystemClock.elapsedRealtime();
                        }
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (SystemClock.elapsedRealtime() - PlayerView.this.ad > f.f7973a && PlayerView.this.ad != 0) {
                            if (((BasePlayerView) PlayerView.this).f11257w != null) {
                                t.b().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PlayerView.this.b(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6965k, "Video player error!Buffer timeout"));
                                    }
                                });
                            }
                            PlayerView.this.d();
                        }
                    } else {
                        PlayerView.this.ad = 0L;
                        try {
                            PlayerView.this.f10991R.sendEmptyMessage((int) PlayerView.this.f10975A.t());
                        } catch (Throwable unused) {
                        }
                        try {
                            Thread.sleep(200L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        });
        this.f10993T = thread;
        thread.setName("anythink_type_player_progress");
        this.f10993T.start();
    }

    private void a() {
        View view = this.f10996W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void b(boolean z6) {
        if (this.f10975A == null) {
            this.f10975A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10975A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10975A.a(anonymousClass5);
            this.f10975A.a(this.f10992S ? 0.0f : 1.0f);
            this.f10975A.a(z6);
            a(f(), false);
        }
    }

    private void a(long j6) {
        BasePlayerView.a aVar;
        if (this.ae) {
            return;
        }
        int i = this.f10999c;
        if (i > 0 && i < 100) {
            if (this.f10998b > i) {
                this.f10998b = i / 2;
            }
            if (this.f10998b == 0) {
                this.f10997a = 0;
                this.f10995V = true;
            } else if (j6 > 0) {
                this.f10997a = Math.round(((r0 * 1.0f) / 100.0f) * j6) - 2000;
                this.f10995V = true;
            }
            if (this.f10997a > 0 || !this.f10995V || (aVar = this.f11257w) == null) {
                return;
            }
            this.f10995V = false;
            aVar.f();
            return;
        }
        this.f10995V = false;
    }

    private void c(boolean z6) {
        synchronized (this.f11004h) {
            try {
                e eVar = this.f11003g;
                if (eVar != null) {
                    eVar.a(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(PlayerView playerView, long j6) {
        synchronized (playerView.f11004h) {
            try {
                e eVar = playerView.f11003g;
                if (eVar != null) {
                    eVar.a(j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(long j6) {
        synchronized (this.f11004h) {
            try {
                e eVar = this.f11003g;
                if (eVar != null) {
                    eVar.a(j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void b(PlayerView playerView, long j6) {
        BasePlayerView.a aVar;
        if (playerView.ae) {
            return;
        }
        int i = playerView.f10999c;
        if (i > 0 && i < 100) {
            if (playerView.f10998b > i) {
                playerView.f10998b = i / 2;
            }
            if (playerView.f10998b == 0) {
                playerView.f10997a = 0;
                playerView.f10995V = true;
            } else if (j6 > 0) {
                playerView.f10997a = Math.round(((r0 * 1.0f) / 100.0f) * j6) - 2000;
                playerView.f10995V = true;
            }
            if (playerView.f10997a > 0 || !playerView.f10995V || (aVar = playerView.f11257w) == null) {
                return;
            }
            playerView.f10995V = false;
            aVar.f();
            return;
        }
        playerView.f10995V = false;
    }

    private void a(String str, boolean z6) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f10975A == null) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6965k, "Player show fail with some internal error"));
                    return;
                }
                this.f11000d = TextUtils.equals(str, this.f10978D);
                if (TextUtils.equals(str, this.f10979E) && this.f10999c > 0) {
                    if (z6) {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10999c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d() + ",isChaoDi:true,ChaoDiThrowableMsg:" + this.f11001e, t.b().r());
                    } else {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10999c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d(), t.b().r());
                    }
                }
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f10976B = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.ae = true;
                } else {
                    this.f10976B = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.ae = false;
                }
                this.f10975A.a(this.f10977C);
                this.f10975A.a(this.f10976B);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (TextUtils.equals(str, this.f10979E) || z6) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6965k, th.getMessage()));
                    return;
                } else {
                    this.f11001e = th.getMessage();
                    str = this.f10979E;
                    z6 = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.f11004h) {
            try {
                e eVar = this.f11003g;
                if (eVar != null) {
                    eVar.a(i, (View) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(boolean z6) {
        if (!new File(this.f10978D).exists() && TextUtils.isEmpty(this.f10979E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6965k, com.anythink.basead.d.g.f6946P));
            return;
        }
        this.f10994U = true;
        if (this.f10977C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10977C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10977C, layoutParams);
        }
        if (this.f10975A == null) {
            this.f10975A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10975A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10975A.a(anonymousClass5);
            this.f10975A.a(this.f10992S ? 0.0f : 1.0f);
            this.f10975A.a(z6);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }
}

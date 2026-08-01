package com.anythink.basead.ui;

import D.y;
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
import com.anythink.core.common.h.x;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.File;
import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class PlayerView extends BasePlayerView {
    public static final String TAG = "PlayerView";

    /* renamed from: A, reason: collision with root package name */
    private ad f10189A;

    /* renamed from: B, reason: collision with root package name */
    private s f10190B;

    /* renamed from: C, reason: collision with root package name */
    private TextureView f10191C;

    /* renamed from: D, reason: collision with root package name */
    private String f10192D;

    /* renamed from: E, reason: collision with root package name */
    private String f10193E;

    /* renamed from: F, reason: collision with root package name */
    private int f10194F;

    /* renamed from: G, reason: collision with root package name */
    private int f10195G;

    /* renamed from: H, reason: collision with root package name */
    private int f10196H;

    /* renamed from: I, reason: collision with root package name */
    private int f10197I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f10198K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10199L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f10200M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10201N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f10202O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f10203P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10204Q;

    /* renamed from: R, reason: collision with root package name */
    private Handler f10205R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10206S;

    /* renamed from: T, reason: collision with root package name */
    private Thread f10207T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10208U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f10209V;

    /* renamed from: W, reason: collision with root package name */
    private View f10210W;

    /* renamed from: a, reason: collision with root package name */
    int f10211a;
    private w.c aa;
    private g ab;
    private final long ac;
    private long ad;
    private boolean ae;

    /* renamed from: b, reason: collision with root package name */
    int f10212b;

    /* renamed from: c, reason: collision with root package name */
    int f10213c;

    /* renamed from: d, reason: collision with root package name */
    boolean f10214d;

    /* renamed from: e, reason: collision with root package name */
    String f10215e;

    /* renamed from: f, reason: collision with root package name */
    String f10216f;

    /* renamed from: g, reason: collision with root package name */
    e f10217g;

    /* renamed from: h, reason: collision with root package name */
    Object f10218h;

    /* renamed from: com.anythink.basead.ui.PlayerView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (((BasePlayerView) PlayerView.this).f10471w != null) {
                ((BasePlayerView) PlayerView.this).f10471w.b(1);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$4, reason: invalid class name */
    public class AnonymousClass4 extends w.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            boolean z3;
            long j6;
            super.onPlayerError(gVar);
            String str = "Play error and ExoPlayer have not message.";
            if (gVar != null) {
                int i = gVar.f7269d;
                z3 = true;
                if (i != 0) {
                    if (i == 1) {
                        str = "Play error, because have a RendererException.";
                    } else if (i == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                    z3 = false;
                } else {
                    str = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    StringBuilder c9 = AbstractC5049e.c(str, ",eception:");
                    c9.append(gVar.getCause().getMessage());
                    str = c9.toString();
                }
            } else {
                z3 = false;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.f10214d && z3) {
                playerView.f10216f = str;
                String str2 = PlayerView.TAG;
                playerView.f10214d = false;
                PlayerView.M(playerView);
                return;
            }
            playerView.d();
            if (((BasePlayerView) PlayerView.this).f10471w != null) {
                try {
                    j6 = PlayerView.this.f10189A.t();
                } catch (Throwable unused) {
                    j6 = 0;
                }
                String str3 = j6 <= 0 ? com.anythink.basead.d.g.f6184p : com.anythink.basead.d.g.f6179k;
                String str4 = "videoUrl:" + PlayerView.this.f10193E + ",readyRate:" + PlayerView.this.f10213c + ",cdRate:" + PlayerView.this.f10212b + ",play process:" + j6;
                String g4 = TextUtils.isEmpty(PlayerView.this.f10216f) ? AbstractC4404f.g(str4, ",localFileErrorMsg:", str) : y.s(AbstractC5049e.c(str4, ",localFileErrorMsg:"), PlayerView.this.f10216f, ",errorMsg:", str);
                if (PlayerView.this.f10203P) {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6154I.concat(String.valueOf(g4))));
                } else {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6161Q.concat(String.valueOf(g4))));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z3, int i) {
            super.onPlayerStateChanged(z3, i);
            String str = PlayerView.TAG;
            if (i == 2) {
                if (!PlayerView.this.f10204Q) {
                    PlayerView.this.f10204Q = true;
                    PlayerView.R(PlayerView.this);
                }
                PlayerView playerView = PlayerView.this;
                PlayerView.b(playerView, playerView.f10189A.s());
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                PlayerView.this.d();
                if (((BasePlayerView) PlayerView.this).f10468t) {
                    return;
                }
                PlayerView.Y(PlayerView.this);
                PlayerView playerView2 = PlayerView.this;
                playerView2.f10194F = playerView2.f10195G;
                if (((BasePlayerView) PlayerView.this).f10471w != null) {
                    ((BasePlayerView) PlayerView.this).f10471w.c();
                }
                PlayerView.this.a(BaseATView.a.f9769E);
                PlayerView.this.h();
                return;
            }
            if (!PlayerView.this.f10203P) {
                PlayerView.this.f10204Q = false;
                PlayerView playerView3 = PlayerView.this;
                playerView3.f10195G = (int) playerView3.f10189A.s();
                PlayerView.c(PlayerView.this, r3.f10195G);
                if (((BasePlayerView) PlayerView.this).f10471w != null) {
                    ((BasePlayerView) PlayerView.this).f10471w.b(PlayerView.this.f10195G);
                }
                PlayerView.this.f10196H = Math.round(r3.f10195G * 0.25f);
                PlayerView.this.f10197I = Math.round(r3.f10195G * 0.5f);
                PlayerView.this.J = Math.round(r3.f10195G * 0.75f);
                PlayerView.b(PlayerView.this, r3.f10195G);
                PlayerView.V(PlayerView.this);
            }
            if (PlayerView.this.f10194F > 0 && Math.abs(PlayerView.this.f10194F - PlayerView.this.f10189A.t()) > 500) {
                PlayerView.this.f10189A.a(PlayerView.this.f10194F);
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
        public final void a(int i, int i6) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i, i6, playerView.f10191C);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10192D = "";
        this.f10193E = "";
        this.f10194F = -1;
        this.f10201N = false;
        this.f10202O = false;
        this.f10203P = false;
        this.f10204Q = false;
        this.f10212b = 0;
        this.f10213c = 0;
        this.f10214d = false;
        this.f10215e = "";
        this.f10216f = "";
        this.ac = f.f7187a;
        this.ad = 0L;
        this.f10218h = new Object();
        this.ae = true;
        setSaveEnabled(true);
        this.f10205R = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (((BasePlayerView) PlayerView.this).f10471w == null) {
                    return;
                }
                PlayerView.this.f10194F = message.what;
                if (!PlayerView.this.f10202O && !((BasePlayerView) PlayerView.this).f10468t) {
                    PlayerView.d(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10471w != null) {
                        ((BasePlayerView) PlayerView.this).f10471w.a();
                    }
                    PlayerView.this.a(202);
                }
                if (((BasePlayerView) PlayerView.this).f10471w != null) {
                    ((BasePlayerView) PlayerView.this).f10471w.a(PlayerView.this.f10194F);
                }
                if (!PlayerView.this.f10198K && PlayerView.this.f10194F >= PlayerView.this.f10196H) {
                    PlayerView.l(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10471w != null) {
                        ((BasePlayerView) PlayerView.this).f10471w.a(25);
                    }
                    PlayerView.this.a(BaseATView.a.f9766B);
                } else if (!PlayerView.this.f10199L && PlayerView.this.f10194F >= PlayerView.this.f10197I) {
                    PlayerView.q(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10471w != null) {
                        ((BasePlayerView) PlayerView.this).f10471w.a(50);
                    }
                    PlayerView.this.a(BaseATView.a.f9767C);
                } else if (!PlayerView.this.f10200M && PlayerView.this.f10194F >= PlayerView.this.J) {
                    PlayerView.v(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10471w != null) {
                        ((BasePlayerView) PlayerView.this).f10471w.a(75);
                    }
                    PlayerView.this.a(BaseATView.a.f9768D);
                }
                if (PlayerView.this.ae || !PlayerView.this.f10209V) {
                    return;
                }
                int i = PlayerView.this.f10194F;
                PlayerView playerView = PlayerView.this;
                if (i < playerView.f10211a || ((BasePlayerView) playerView).f10471w == null) {
                    return;
                }
                PlayerView.B(PlayerView.this);
                ((BasePlayerView) PlayerView.this).f10471w.f();
            }
        };
        setBackgroundColor(-16777216);
    }

    public static /* synthetic */ boolean B(PlayerView playerView) {
        playerView.f10209V = false;
        return false;
    }

    public static /* synthetic */ void M(PlayerView playerView) {
        BasePlayerView.a aVar = playerView.f10471w;
        if (aVar != null) {
            aVar.f();
        }
        playerView.f10189A.a(playerView.f10190B);
    }

    public static /* synthetic */ void R(PlayerView playerView) {
        View view = playerView.f10210W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static /* synthetic */ boolean V(PlayerView playerView) {
        playerView.f10203P = true;
        return true;
    }

    public static /* synthetic */ boolean Y(PlayerView playerView) {
        playerView.f10468t = true;
        return true;
    }

    public static /* synthetic */ boolean l(PlayerView playerView) {
        playerView.f10198K = true;
        return true;
    }

    public static /* synthetic */ boolean q(PlayerView playerView) {
        playerView.f10199L = true;
        return true;
    }

    public static /* synthetic */ boolean v(PlayerView playerView) {
        playerView.f10200M = true;
        return true;
    }

    public void autoFitVideoSize(int i, int i6, View view) {
        float max = Math.max(i / view.getMeasuredWidth(), i6 / view.getMeasuredHeight());
        int ceil = (int) Math.ceil(r4 / max);
        int ceil2 = (int) Math.ceil(r5 / max);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = ceil;
        layoutParams.height = ceil2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return Math.max(this.f10194F, 0);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        ad adVar = this.f10189A;
        return adVar != null ? adVar.s() : this.f10195G;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f10208U;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(com.anythink.core.common.h.w wVar, x xVar, boolean z3, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z3, list, eVar);
        this.f10217g = eVar;
        c(z3);
        initMuteStatus(z3);
        setVideoRateConfig(wVar.r().ac(), wVar.r().ad());
        load(wVar.E(), false);
    }

    public void initMuteStatus(boolean z3) {
        this.f10206S = z3;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f10206S;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        ad adVar = this.f10189A;
        return adVar != null && adVar.J();
    }

    public void load(String str, boolean z3) {
        this.f10193E = str;
        com.anythink.basead.b.f.a();
        this.f10192D = com.anythink.basead.b.f.a(4, str);
        if (!new File(this.f10192D).exists() && TextUtils.isEmpty(this.f10193E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, com.anythink.basead.d.g.f6160P));
            return;
        }
        this.f10208U = true;
        if (this.f10191C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10191C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10191C, layoutParams);
        }
        if (this.f10189A == null) {
            this.f10189A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10189A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10189A.a(anonymousClass5);
            this.f10189A.a(this.f10206S ? 0.0f : 1.0f);
            this.f10189A.a(z3);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10474z) {
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
            this.f10194F = bundle.getInt("savePosition");
            this.f10198K = bundle.getBoolean("saveVideoPlay25");
            this.f10199L = bundle.getBoolean("saveVideoPlay50");
            this.f10200M = bundle.getBoolean("saveVideoPlay75");
            this.f10202O = bundle.getBoolean("saveIsVideoStart");
            this.f10468t = bundle.getBoolean("saveIsVideoPlayCompletion");
            this.f10206S = bundle.getBoolean("saveIsMute");
            this.f10209V = bundle.getBoolean("saveVideoNeedResumeByCdRate");
            ad adVar = this.f10189A;
            if (adVar != null) {
                adVar.a(this.f10206S ? 0.0f : 1.0f);
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
            bundle.putInt("savePosition", this.f10194F);
            bundle.putBoolean("saveVideoPlay25", this.f10198K);
            bundle.putBoolean("saveVideoPlay50", this.f10199L);
            bundle.putBoolean("saveVideoPlay75", this.f10200M);
            bundle.putBoolean("saveIsVideoStart", this.f10202O);
            bundle.putBoolean("saveIsVideoPlayCompletion", this.f10468t);
            bundle.putBoolean("saveIsMute", this.f10206S);
            bundle.putBoolean("saveVideoNeedResumeByCdRate", this.f10209V);
            bundle.toString();
            return bundle;
        } catch (Throwable unused) {
            return super.onSaveInstanceState();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (isPlaying()) {
            a(BaseATView.a.f9770F);
        }
        d();
        ad adVar = this.f10189A;
        if (adVar != null) {
            adVar.a(false);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void rePlayVideo() {
        if (this.f10189A != null) {
            this.f10194F = 0;
            this.f10202O = false;
            this.f10468t = false;
            synchronized (this.f10218h) {
                this.f10217g = null;
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
        if (!this.f10468t) {
            a(BaseATView.a.J);
        }
        ad adVar = this.f10189A;
        if (adVar != null) {
            if (adVar.J()) {
                this.f10189A.m();
            }
            w.c cVar = this.aa;
            if (cVar != null) {
                this.f10189A.b(cVar);
            }
            g gVar = this.ab;
            if (gVar != null) {
                this.f10189A.b(gVar);
            }
            this.f10189A.n();
            this.f10189A = null;
        }
        Handler handler = this.f10205R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f10203P = false;
        if (!this.ae) {
            com.anythink.core.common.res.b.c.a().d(this.f10193E);
        }
        com.anythink.core.common.h.w wVar = this.f10472x;
        if (wVar == null || !wVar.c()) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.6
                @Override // java.lang.Runnable
                public final void run() {
                    long j6;
                    long j9;
                    n a9;
                    if (((BasePlayerView) PlayerView.this).f10473y == null || ((BasePlayerView) PlayerView.this).f10472x == null) {
                        return;
                    }
                    if (((BasePlayerView) PlayerView.this).f10472x == null || (a9 = o.a().a(((BasePlayerView) PlayerView.this).f10472x.E())) == null) {
                        j6 = 0;
                        j9 = 0;
                    } else {
                        j6 = a9.e();
                        j9 = a9.d();
                    }
                    com.anythink.core.common.u.e.b(((BasePlayerView) PlayerView.this).f10473y, ((BasePlayerView) PlayerView.this).f10472x, i, currentPosition, j6, videoLength, j9);
                }
            }, 8);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f10471w = aVar;
    }

    public void setLoadingView(View view) {
        this.f10210W = view;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z3) {
        this.f10206S = z3;
        if (z3) {
            ad adVar = this.f10189A;
            if (adVar != null) {
                adVar.a(0.0f);
            }
            BasePlayerView.a aVar = this.f10471w;
            if (aVar != null) {
                aVar.d();
            }
        } else {
            ad adVar2 = this.f10189A;
            if (adVar2 != null) {
                adVar2.a(1.0f);
            }
            BasePlayerView.a aVar2 = this.f10471w;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
        c(z3);
        a(BaseATView.a.f9774K);
    }

    public void setVideoRateConfig(int i, int i6) {
        this.f10213c = i;
        this.f10212b = i6;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        View view = this.f10210W;
        if (view != null) {
            view.setVisibility(8);
        }
        if (!isPlaying()) {
            a(BaseATView.a.f9771G);
        }
        ad adVar = this.f10189A;
        if (adVar != null) {
            adVar.a(true);
        }
        c();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        ad adVar = this.f10189A;
        if (adVar != null) {
            adVar.m();
        }
        h();
    }

    public static /* synthetic */ boolean d(PlayerView playerView) {
        playerView.f10202O = true;
        return true;
    }

    private void g() {
        if (this.f10191C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10191C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10191C, layoutParams);
        }
    }

    private void i() {
        BasePlayerView.a aVar = this.f10471w;
        if (aVar != null) {
            aVar.f();
        }
        this.f10189A.a(this.f10190B);
    }

    private void j() {
        synchronized (this.f10218h) {
            this.f10217g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f10201N = false;
        this.f10207T = null;
        this.ad = 0L;
    }

    private boolean e() {
        if (!new File(this.f10192D).exists() && TextUtils.isEmpty(this.f10193E)) {
            return true;
        }
        this.f10208U = true;
        return false;
    }

    private String f() {
        if (new File(this.f10192D).exists()) {
            return this.f10192D;
        }
        return this.f10193E;
    }

    private void b() {
        View view = this.f10210W;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f10207T != null) {
            return;
        }
        this.f10201N = true;
        this.ad = 0L;
        Thread thread = new Thread(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3
            @Override // java.lang.Runnable
            public final void run() {
                while (PlayerView.this.f10201N) {
                    if (((BasePlayerView) PlayerView.this).f10468t || !PlayerView.this.isPlaying() || PlayerView.this.f10205R == null) {
                        if (PlayerView.this.ad == 0) {
                            PlayerView.this.ad = SystemClock.elapsedRealtime();
                        }
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (SystemClock.elapsedRealtime() - PlayerView.this.ad > f.f7187a && PlayerView.this.ad != 0) {
                            if (((BasePlayerView) PlayerView.this).f10471w != null) {
                                t.b().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PlayerView.this.b(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, "Video player error!Buffer timeout"));
                                    }
                                });
                            }
                            PlayerView.this.d();
                        }
                    } else {
                        PlayerView.this.ad = 0L;
                        try {
                            PlayerView.this.f10205R.sendEmptyMessage((int) PlayerView.this.f10189A.t());
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
        this.f10207T = thread;
        thread.setName("anythink_type_player_progress");
        this.f10207T.start();
    }

    private void a() {
        View view = this.f10210W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void b(boolean z3) {
        if (this.f10189A == null) {
            this.f10189A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10189A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10189A.a(anonymousClass5);
            this.f10189A.a(this.f10206S ? 0.0f : 1.0f);
            this.f10189A.a(z3);
            a(f(), false);
        }
    }

    private void a(long j6) {
        BasePlayerView.a aVar;
        if (this.ae) {
            return;
        }
        int i = this.f10213c;
        if (i > 0 && i < 100) {
            if (this.f10212b > i) {
                this.f10212b = i / 2;
            }
            if (this.f10212b == 0) {
                this.f10211a = 0;
                this.f10209V = true;
            } else if (j6 > 0) {
                this.f10211a = Math.round(((r0 * 1.0f) / 100.0f) * j6) - 2000;
                this.f10209V = true;
            }
            if (this.f10211a > 0 || !this.f10209V || (aVar = this.f10471w) == null) {
                return;
            }
            this.f10209V = false;
            aVar.f();
            return;
        }
        this.f10209V = false;
    }

    private void c(boolean z3) {
        synchronized (this.f10218h) {
            try {
                e eVar = this.f10217g;
                if (eVar != null) {
                    eVar.a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(PlayerView playerView, long j6) {
        synchronized (playerView.f10218h) {
            try {
                e eVar = playerView.f10217g;
                if (eVar != null) {
                    eVar.a(j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(long j6) {
        synchronized (this.f10218h) {
            try {
                e eVar = this.f10217g;
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
        int i = playerView.f10213c;
        if (i > 0 && i < 100) {
            if (playerView.f10212b > i) {
                playerView.f10212b = i / 2;
            }
            if (playerView.f10212b == 0) {
                playerView.f10211a = 0;
                playerView.f10209V = true;
            } else if (j6 > 0) {
                playerView.f10211a = Math.round(((r0 * 1.0f) / 100.0f) * j6) - 2000;
                playerView.f10209V = true;
            }
            if (playerView.f10211a > 0 || !playerView.f10209V || (aVar = playerView.f10471w) == null) {
                return;
            }
            playerView.f10209V = false;
            aVar.f();
            return;
        }
        playerView.f10209V = false;
    }

    private void a(String str, boolean z3) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f10189A == null) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, "Player show fail with some internal error"));
                    return;
                }
                this.f10214d = TextUtils.equals(str, this.f10192D);
                if (TextUtils.equals(str, this.f10193E) && this.f10213c > 0) {
                    if (z3) {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10213c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d() + ",isChaoDi:true,ChaoDiThrowableMsg:" + this.f10215e, t.b().r());
                    } else {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10213c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d(), t.b().r());
                    }
                }
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f10190B = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.ae = true;
                } else {
                    this.f10190B = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.ae = false;
                }
                this.f10189A.a(this.f10191C);
                this.f10189A.a(this.f10190B);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (TextUtils.equals(str, this.f10193E) || z3) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, th.getMessage()));
                    return;
                } else {
                    this.f10215e = th.getMessage();
                    str = this.f10193E;
                    z3 = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.f10218h) {
            try {
                e eVar = this.f10217g;
                if (eVar != null) {
                    eVar.a(i, (View) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(boolean z3) {
        if (!new File(this.f10192D).exists() && TextUtils.isEmpty(this.f10193E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6179k, com.anythink.basead.d.g.f6160P));
            return;
        }
        this.f10208U = true;
        if (this.f10191C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10191C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10191C, layoutParams);
        }
        if (this.f10189A == null) {
            this.f10189A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10189A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10189A.a(anonymousClass5);
            this.f10189A.a(this.f10206S ? 0.0f : 1.0f);
            this.f10189A.a(z3);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }
}

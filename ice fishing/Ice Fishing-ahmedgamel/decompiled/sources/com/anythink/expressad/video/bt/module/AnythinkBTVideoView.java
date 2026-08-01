package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerErrorConstant;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.b.c;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTVideoView extends BTBaseView {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f20985I = false;

    /* renamed from: P, reason: collision with root package name */
    private static final String f20986P = "2";

    /* renamed from: p, reason: collision with root package name */
    private static final String f20987p = "anythink_reward_videoview_item";

    /* renamed from: A, reason: collision with root package name */
    private int f20988A;

    /* renamed from: B, reason: collision with root package name */
    private a f20989B;

    /* renamed from: C, reason: collision with root package name */
    private int f20990C;

    /* renamed from: D, reason: collision with root package name */
    private int f20991D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20992E;

    /* renamed from: F, reason: collision with root package name */
    private int f20993F;

    /* renamed from: G, reason: collision with root package name */
    private int f20994G;

    /* renamed from: H, reason: collision with root package name */
    private String f20995H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f20996K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20997L;

    /* renamed from: M, reason: collision with root package name */
    private RelativeLayout f20998M;

    /* renamed from: N, reason: collision with root package name */
    private ProgressBar f20999N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21000O;

    /* renamed from: q, reason: collision with root package name */
    private PlayerView f21001q;

    /* renamed from: r, reason: collision with root package name */
    private SoundImageView f21002r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f21003s;

    /* renamed from: t, reason: collision with root package name */
    private View f21004t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f21005u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21006v;

    /* renamed from: w, reason: collision with root package name */
    private WebView f21007w;

    /* renamed from: x, reason: collision with root package name */
    private c f21008x;

    /* renamed from: y, reason: collision with root package name */
    private int f21009y;

    /* renamed from: z, reason: collision with root package name */
    private int f21010z;

    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkBTVideoView f21014a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21015b;

        /* renamed from: c, reason: collision with root package name */
        private String f21016c;

        /* renamed from: d, reason: collision with root package name */
        private String f21017d;

        /* renamed from: e, reason: collision with root package name */
        private int f21018e;

        /* renamed from: f, reason: collision with root package name */
        private int f21019f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21020g;

        /* renamed from: k, reason: collision with root package name */
        private int f21023k;

        /* renamed from: l, reason: collision with root package name */
        private int f21024l;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21021h = false;
        private boolean i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21022j = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f21025m = false;

        public a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f21014a = anythinkBTVideoView;
            this.f21015b = webView;
            this.f21016c = anythinkBTVideoView.f21049d;
            this.f21017d = anythinkBTVideoView.f21048c;
        }

        private int a() {
            return this.f21018e;
        }

        private static void b() {
        }

        private void c() {
            this.f21014a = null;
            this.f21015b = null;
            boolean unused = AnythinkBTVideoView.f20985I = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals("play buffering tiemout")) {
                    return;
                }
                if (this.f21015b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21043n);
                        jSONObject.put("id", this.f21016c);
                        jSONObject.put("data", new JSONObject());
                        h.a();
                        com.anythink.core.express.d.a.a(this.f21015b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(this.f21015b, e9.getMessage());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f21014a;
            d dVar = anythinkBTVideoView.f21047b;
            if (dVar == null) {
                anythinkBTVideoView.f21003s.setText("0");
            } else if (dVar.i() > 0) {
                this.f21014a.f21003s.setText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f19636g));
            } else {
                this.f21014a.f21003s.setText("0");
            }
            this.f21014a.f21001q.setClickable(false);
            WebView webView = this.f21015b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f21016c);
            }
            this.f21018e = this.f21019f;
            boolean unused = AnythinkBTVideoView.f20985I = true;
            this.f21014a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f21015b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21044o);
                    jSONObject.put("id", this.f21016c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f21016c);
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21015b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21015b, e9.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x025f A[Catch: Exception -> 0x0227, TRY_LEAVE, TryCatch #0 {Exception -> 0x0227, blocks: (B:45:0x01cf, B:47:0x01d5, B:53:0x01dd, B:55:0x01e1, B:57:0x01e5, B:59:0x01f1, B:62:0x01fc, B:63:0x0253, B:65:0x025f, B:69:0x0229), top: B:44:0x01cf }] */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPlayProgress(int i, int i6) {
            int i9;
            String str;
            c a9;
            int i10;
            String str2;
            super.onPlayProgress(i, i6);
            AnythinkBTVideoView anythinkBTVideoView = this.f21014a;
            if (anythinkBTVideoView.f21053h) {
                d dVar = anythinkBTVideoView.f21047b;
                if (dVar != null) {
                    i10 = dVar.i();
                    b.a().a(this.f21014a.f21047b.L() + "_1", i);
                } else {
                    i10 = 0;
                }
                if (i10 > i6 || i10 <= 0) {
                    i10 = i6;
                }
                int i11 = i10 <= 0 ? i6 - i : i10 - i;
                if (i11 <= 0) {
                    str2 = i10 <= 0 ? "0" : (String) this.f21014a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f19636g));
                } else if (i10 <= 0) {
                    str2 = String.valueOf(i11);
                } else {
                    str2 = i11 + ((String) this.f21014a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", k.f19636g)));
                }
                d dVar2 = this.f21014a.f21047b;
                if (dVar2 != null && dVar2.aJ() == 1) {
                    int min = Math.min(this.f21014a.f21047b.g(), i6);
                    if (min >= i10 || min < 0) {
                        int i12 = i10 - i;
                        if (this.f21014a.f21047b.x() == 287) {
                            if (i12 > 0) {
                                str2 = i12 + ((String) this.f21014a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f19636g)));
                            } else if (i12 == 0) {
                                this.f21014a.f21003s.setVisibility(4);
                            }
                        }
                    } else {
                        int i13 = min - i;
                        if (i13 > 0) {
                            str2 = i13 + ((String) this.f21014a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f19636g)));
                        } else if (this.f21014a.f21047b.x() == 287 && i13 == 0) {
                            this.f21014a.f21003s.setVisibility(4);
                        }
                    }
                }
                this.f21014a.f21003s.setText(str2);
            }
            this.f21019f = i6;
            this.f21018e = i;
            this.f21014a.f20999N.setMax(this.f21019f);
            this.f21014a.f20999N.setProgress(this.f21018e);
            if (this.f21015b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21043n);
                    jSONObject.put("id", this.f21016c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f21016c);
                    jSONObject2.put(g.a.f12949C, AnythinkBTVideoView.b(i, i6));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i6));
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21015b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21015b, e9.getMessage());
                }
            }
            try {
                int i14 = this.f21023k;
                if (i14 == 100 || this.f21025m || i14 == 0 || (i9 = this.f21024l) < 0 || i < (i6 * i9) / 100) {
                    return;
                }
                if (this.f21014a.f21047b.x() != 94 && this.f21014a.f21047b.x() != 287) {
                    str = this.f21014a.f21047b.bh() + this.f21014a.f21047b.T() + this.f21014a.f21047b.C();
                    a9 = e.a().a(this.f21017d, str);
                    if (a9 == null) {
                        a9.i();
                        this.f21025m = true;
                        return;
                    }
                    return;
                }
                str = this.f21014a.f21047b.aa() + this.f21014a.f21047b.bh() + this.f21014a.f21047b.T();
                a9 = e.a().a(this.f21017d, str);
                if (a9 == null) {
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f21020g) {
                this.f21014a.f20999N.setMax(i);
                WebView webView = this.f21015b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21016c);
                }
                this.f21020g = true;
            }
            boolean unused = AnythinkBTVideoView.f20985I = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f21014a.f21047b.x() == 94 || this.f21014a.f21047b.x() == 287) {
                str = this.f21014a.f21047b.aa() + this.f21014a.f21047b.bh() + this.f21014a.f21047b.T();
            } else {
                str = this.f21014a.f21047b.bh() + this.f21014a.f21047b.T() + this.f21014a.f21047b.C();
            }
            c a9 = e.a().a(this.f21017d, str);
            if (a9 != null) {
                a9.i();
                this.f21025m = true;
            }
        }

        public final void a(int i, int i6) {
            this.f21023k = i;
            this.f21024l = i6;
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.f21009y = 0;
        this.f21010z = 0;
        this.f20988A = 0;
        this.f20990C = 2;
        this.f20992E = false;
        this.f20993F = 2;
        this.f20994G = 1;
        this.J = false;
        this.f20996K = false;
        this.f20997L = false;
    }

    private int f() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).x();
    }

    public int getMute() {
        return this.f20990C;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout(f20987p);
        if (findLayout > 0) {
            this.f21051f.inflate(findLayout, this);
            this.f21053h = b();
            a();
        }
        f20985I = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f20997L) {
            com.anythink.expressad.video.bt.a.c.a();
            this.f20993F = com.anythink.expressad.video.bt.a.c.e(this.f21048c);
        }
        View view = this.f21004t;
        if (view != null) {
            view.setVisibility(this.f21010z == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f21002r;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f20988A == 0 ? 8 : 0);
        }
        TextView textView = this.f21003s;
        if (textView != null) {
            textView.setVisibility(this.f21009y == 0 ? 8 : 0);
            if (this.f21003s.getVisibility() == 0 && b.a().b()) {
                this.f21047b.l(this.f21048c);
                b.a().a(u1.h.g(new StringBuilder(), this.f21048c, "_1"), this.f21047b);
                b.a().a(u1.h.g(new StringBuilder(), this.f21048c, "_1"), this.f21005u);
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f21001q.release();
                this.f21001q = null;
            }
            SoundImageView soundImageView = this.f21002r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f21004t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f21007w != null) {
                this.f21007w = null;
            }
            if (this.f21000O != null) {
                this.f21000O = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onPause() {
        PlayerView playerView = this.f21001q;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f20996K = isPlayIng;
            this.f21001q.setIsBTVideoPlaying(isPlayIng);
            this.f21001q.onPause();
        }
    }

    public void onResume(com.anythink.expressad.video.a.a aVar) {
        PlayerView playerView = this.f21001q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f21001q.setIsCovered(false);
            if (this.f20996K) {
                this.f21001q.onResume();
            }
        }
        this.f21000O = aVar;
    }

    public void onStop() {
        PlayerView playerView = this.f21001q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f21007w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f21049d);
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void play() {
        a aVar;
        try {
            if (this.f20997L) {
                if (this.f20992E) {
                    this.f21001q.playVideo(0);
                    this.f20992E = false;
                } else {
                    this.f21001q.start(false);
                }
                WebView webView = this.f21007w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21049d);
                    return;
                }
                return;
            }
            if (this.f20993F == 1) {
                playMute();
            } else {
                playUnMute();
            }
            if (!this.f21001q.playVideo() && (aVar = this.f20989B) != null) {
                aVar.onPlayError("play video failed");
            }
            this.f20997L = true;
            WebView webView2 = this.f21007w;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.f21049d);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null && this.f21007w != null) {
                playerView.closeSound();
                this.f21002r.setSoundStatus(false);
                this.f20990C = 1;
                BTBaseView.a(this.f21007w, "onPlayerMute", this.f21049d);
                com.anythink.expressad.video.a.a aVar = this.f21000O;
                if (aVar != null) {
                    aVar.a(true);
                }
                return true;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null && this.f21007w != null) {
                playerView.openSound();
                this.f21002r.setSoundStatus(true);
                this.f20990C = 2;
                BTBaseView.a(this.f21007w, "onUnmute", this.f21049d);
                com.anythink.expressad.video.a.a aVar = this.f21000O;
                if (aVar != null) {
                    aVar.a(false);
                }
                return true;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return false;
    }

    public void preLoadData() {
        String str;
        if (this.f21047b.x() == 94 || this.f21047b.x() == 287) {
            str = this.f21047b.aa() + this.f21047b.bh() + this.f21047b.T();
        } else {
            str = this.f21047b.bh() + this.f21047b.T() + this.f21047b.C();
        }
        c a9 = e.a().a(this.f21048c, str);
        if (a9 != null) {
            this.f21008x = a9;
        }
        this.f20991D = e();
        String d2 = d();
        this.f20995H = d2;
        if (this.f21053h && !TextUtils.isEmpty(d2) && this.f21047b != null) {
            a aVar = new a(this, this.f21007w);
            this.f20989B = aVar;
            d dVar = this.f21047b;
            aVar.a(dVar != null ? dVar.aq() != -1 ? dVar.aq() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).v() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).v(), com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).x());
            this.f21001q.setDesk(false);
            this.f21001q.initBufferIngParam(this.f20991D);
            this.f21001q.initVFPData(this.f20995H, this.f21047b.T(), this.f21047b.aq(), this.f20989B);
            soundOperate(this.f20990C, -1, null);
        }
        f20985I = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null) {
                if (this.f20992E) {
                    playerView.playVideo(0);
                    this.f20992E = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.f21007w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f21049d);
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setCampaign(d dVar) {
        super.setCampaign(dVar);
        if (dVar == null || dVar.i() <= 0) {
            this.f21003s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_shape_progress", k.f19632c));
            this.f21003s.setWidth(v.b(t.b().g(), 30.0f));
            return;
        }
        this.f21003s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", k.f19632c));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, f.e(30.0f));
        int b9 = v.b(t.b().g(), 5.0f);
        layoutParams.setMargins(b9, 0, 0, 0);
        this.f21003s.setPadding(b9, 0, b9, 0);
        this.f21003s.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.f21004t.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f21003s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f21007w = webView;
    }

    public void setNotchPadding(int i, int i6, int i9, int i10) {
        if (i <= 0) {
            i = this.f20998M.getPaddingLeft();
        }
        if (i6 <= 0) {
            i6 = this.f20998M.getPaddingRight();
        }
        if (i9 <= 0) {
            i9 = this.f20998M.getPaddingTop();
        }
        if (i10 <= 0) {
            i10 = this.f20998M.getPaddingBottom();
        }
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10));
        this.f20998M.setPadding(i, i9, i6, i10);
    }

    public void setOrientation(int i) {
        this.f20994G = i;
    }

    public void setPlaybackParams(float f3) {
        PlayerView playerView = this.f21001q;
        if (playerView != null) {
            playerView.setPlaybackParams(f3);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f20999N;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i) {
        this.f21010z = i;
    }

    public void setShowMute(int i) {
        this.f20988A = i;
    }

    public void setShowTime(int i) {
        this.f21009y = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.f21002r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVolume(float f3, float f9) {
        PlayerView playerView = this.f21001q;
        if (playerView != null) {
            playerView.setVolume(f3, f9);
        }
    }

    public void soundOperate(int i, int i6, String str) {
        if (this.f21053h) {
            this.f20990C = i;
            if (i == 1) {
                this.f21002r.setSoundStatus(false);
                this.f21001q.closeSound();
            } else if (i == 2) {
                this.f21002r.setSoundStatus(true);
                this.f21001q.openSound();
            }
            if (i6 == 1) {
                this.f21002r.setVisibility(8);
            } else if (i6 == 2) {
                this.f21002r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f21001q;
            if (playerView != null) {
                playerView.pause();
                this.f21001q.stop();
                try {
                    this.f21001q.prepare();
                    this.f21001q.justSeekTo(0);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                WebView webView = this.f21007w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f21049d);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private boolean b() {
        try {
            this.f21001q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.f21002r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.f21003s = (TextView) findViewById(findID("anythink_tv_count"));
            this.f21004t = findViewById(findID("anythink_rl_playing_close"));
            this.f20998M = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.f20999N = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.f21001q.setIsBTVideo(true);
            this.f21005u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            this.f21006v = (ImageView) findViewById(findID("anythink_iv_link"));
            return isNotNULL(this.f21001q, this.f21002r, this.f21003s, this.f21004t);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void c() {
        String str;
        if (this.f21047b.x() == 94 || this.f21047b.x() == 287) {
            str = this.f21047b.aa() + this.f21047b.bh() + this.f21047b.T();
        } else {
            str = this.f21047b.bh() + this.f21047b.T() + this.f21047b.C();
        }
        c a9 = e.a().a(this.f21048c, str);
        if (a9 != null) {
            this.f21008x = a9;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f21047b.T();
            c cVar = this.f21008x;
            if (cVar != null && cVar.k() == 5) {
                String e9 = this.f21008x.e();
                if (!y.a(e9)) {
                    if (new File(e9).exists()) {
                        return e9;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            th.getMessage();
            return str;
        }
    }

    private static int e() {
        try {
            com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b9 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            if (b9 != null) {
                return (int) b9.g();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f21053h) {
            this.f21002r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTVideoView.this.f21001q.isSilent();
                    if (AnythinkBTVideoView.this.f21007w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21043n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21049d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.f20990C);
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21007w, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            int unused = AnythinkBTVideoView.this.f20990C;
                        } catch (Exception e9) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21007w, e9.getMessage());
                        }
                    }
                }
            });
            this.f21004t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21007w != null) {
                        BTBaseView.a(AnythinkBTVideoView.this.f21007w, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f21049d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21007w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21043n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21049d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21007w, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21007w, "onClicked", AnythinkBTVideoView.this.f21049d);
                        }
                    }
                }
            });
        }
    }

    private int a(d dVar) {
        if (dVar != null) {
            if (dVar.aq() != -1) {
                return dVar.aq();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21048c, false).v();
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21009y = 0;
        this.f21010z = 0;
        this.f20988A = 0;
        this.f20990C = 2;
        this.f20992E = false;
        this.f20993F = 2;
        this.f20994G = 1;
        this.J = false;
        this.f20996K = false;
        this.f20997L = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i6) {
        if (i6 != 0) {
            double d2 = i / i6;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d2)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i6);
    }
}

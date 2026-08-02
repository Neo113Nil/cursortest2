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
import com.google.android.gms.internal.ads.Wv;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTVideoView extends BTBaseView {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f21772I = false;

    /* renamed from: P, reason: collision with root package name */
    private static final String f21773P = "2";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21774p = "anythink_reward_videoview_item";

    /* renamed from: A, reason: collision with root package name */
    private int f21775A;

    /* renamed from: B, reason: collision with root package name */
    private a f21776B;

    /* renamed from: C, reason: collision with root package name */
    private int f21777C;

    /* renamed from: D, reason: collision with root package name */
    private int f21778D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21779E;

    /* renamed from: F, reason: collision with root package name */
    private int f21780F;

    /* renamed from: G, reason: collision with root package name */
    private int f21781G;

    /* renamed from: H, reason: collision with root package name */
    private String f21782H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21783K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21784L;

    /* renamed from: M, reason: collision with root package name */
    private RelativeLayout f21785M;

    /* renamed from: N, reason: collision with root package name */
    private ProgressBar f21786N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21787O;

    /* renamed from: q, reason: collision with root package name */
    private PlayerView f21788q;

    /* renamed from: r, reason: collision with root package name */
    private SoundImageView f21789r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f21790s;

    /* renamed from: t, reason: collision with root package name */
    private View f21791t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f21792u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21793v;

    /* renamed from: w, reason: collision with root package name */
    private WebView f21794w;

    /* renamed from: x, reason: collision with root package name */
    private c f21795x;

    /* renamed from: y, reason: collision with root package name */
    private int f21796y;

    /* renamed from: z, reason: collision with root package name */
    private int f21797z;

    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkBTVideoView f21801a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21802b;

        /* renamed from: c, reason: collision with root package name */
        private String f21803c;

        /* renamed from: d, reason: collision with root package name */
        private String f21804d;

        /* renamed from: e, reason: collision with root package name */
        private int f21805e;

        /* renamed from: f, reason: collision with root package name */
        private int f21806f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21807g;

        /* renamed from: k, reason: collision with root package name */
        private int f21810k;

        /* renamed from: l, reason: collision with root package name */
        private int f21811l;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21808h = false;
        private boolean i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21809j = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f21812m = false;

        public a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f21801a = anythinkBTVideoView;
            this.f21802b = webView;
            this.f21803c = anythinkBTVideoView.f21836d;
            this.f21804d = anythinkBTVideoView.f21835c;
        }

        private int a() {
            return this.f21805e;
        }

        private static void b() {
        }

        private void c() {
            this.f21801a = null;
            this.f21802b = null;
            boolean unused = AnythinkBTVideoView.f21772I = false;
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
                if (this.f21802b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21830n);
                        jSONObject.put("id", this.f21803c);
                        jSONObject.put("data", new JSONObject());
                        h.a();
                        com.anythink.core.express.d.a.a(this.f21802b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e9) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(this.f21802b, e9.getMessage());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f21801a;
            d dVar = anythinkBTVideoView.f21834b;
            if (dVar == null) {
                anythinkBTVideoView.f21790s.setText("0");
            } else if (dVar.i() > 0) {
                this.f21801a.f21790s.setText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f20423g));
            } else {
                this.f21801a.f21790s.setText("0");
            }
            this.f21801a.f21788q.setClickable(false);
            WebView webView = this.f21802b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f21803c);
            }
            this.f21805e = this.f21806f;
            boolean unused = AnythinkBTVideoView.f21772I = true;
            this.f21801a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f21802b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21831o);
                    jSONObject.put("id", this.f21803c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f21803c);
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21802b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21802b, e9.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x025f A[Catch: Exception -> 0x0227, TRY_LEAVE, TryCatch #0 {Exception -> 0x0227, blocks: (B:45:0x01cf, B:47:0x01d5, B:53:0x01dd, B:55:0x01e1, B:57:0x01e5, B:59:0x01f1, B:62:0x01fc, B:63:0x0253, B:65:0x025f, B:69:0x0229), top: B:44:0x01cf }] */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPlayProgress(int i, int i4) {
            int i6;
            String str;
            c a9;
            int i9;
            String str2;
            super.onPlayProgress(i, i4);
            AnythinkBTVideoView anythinkBTVideoView = this.f21801a;
            if (anythinkBTVideoView.f21840h) {
                d dVar = anythinkBTVideoView.f21834b;
                if (dVar != null) {
                    i9 = dVar.i();
                    b.a().a(this.f21801a.f21834b.L() + "_1", i);
                } else {
                    i9 = 0;
                }
                if (i9 > i4 || i9 <= 0) {
                    i9 = i4;
                }
                int i10 = i9 <= 0 ? i4 - i : i9 - i;
                if (i10 <= 0) {
                    str2 = i9 <= 0 ? "0" : (String) this.f21801a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f20423g));
                } else if (i9 <= 0) {
                    str2 = String.valueOf(i10);
                } else {
                    str2 = i10 + ((String) this.f21801a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", k.f20423g)));
                }
                d dVar2 = this.f21801a.f21834b;
                if (dVar2 != null && dVar2.aJ() == 1) {
                    int min = Math.min(this.f21801a.f21834b.g(), i4);
                    if (min >= i9 || min < 0) {
                        int i11 = i9 - i;
                        if (this.f21801a.f21834b.x() == 287) {
                            if (i11 > 0) {
                                str2 = i11 + ((String) this.f21801a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f20423g)));
                            } else if (i11 == 0) {
                                this.f21801a.f21790s.setVisibility(4);
                            }
                        }
                    } else {
                        int i12 = min - i;
                        if (i12 > 0) {
                            str2 = i12 + ((String) this.f21801a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f20423g)));
                        } else if (this.f21801a.f21834b.x() == 287 && i12 == 0) {
                            this.f21801a.f21790s.setVisibility(4);
                        }
                    }
                }
                this.f21801a.f21790s.setText(str2);
            }
            this.f21806f = i4;
            this.f21805e = i;
            this.f21801a.f21786N.setMax(this.f21806f);
            this.f21801a.f21786N.setProgress(this.f21805e);
            if (this.f21802b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21830n);
                    jSONObject.put("id", this.f21803c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f21803c);
                    jSONObject2.put(g.a.f13735C, AnythinkBTVideoView.b(i, i4));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i4));
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21802b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21802b, e9.getMessage());
                }
            }
            try {
                int i13 = this.f21810k;
                if (i13 == 100 || this.f21812m || i13 == 0 || (i6 = this.f21811l) < 0 || i < (i4 * i6) / 100) {
                    return;
                }
                if (this.f21801a.f21834b.x() != 94 && this.f21801a.f21834b.x() != 287) {
                    str = this.f21801a.f21834b.bh() + this.f21801a.f21834b.T() + this.f21801a.f21834b.C();
                    a9 = e.a().a(this.f21804d, str);
                    if (a9 == null) {
                        a9.i();
                        this.f21812m = true;
                        return;
                    }
                    return;
                }
                str = this.f21801a.f21834b.aa() + this.f21801a.f21834b.bh() + this.f21801a.f21834b.T();
                a9 = e.a().a(this.f21804d, str);
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
            if (!this.f21807g) {
                this.f21801a.f21786N.setMax(i);
                WebView webView = this.f21802b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21803c);
                }
                this.f21807g = true;
            }
            boolean unused = AnythinkBTVideoView.f21772I = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f21801a.f21834b.x() == 94 || this.f21801a.f21834b.x() == 287) {
                str = this.f21801a.f21834b.aa() + this.f21801a.f21834b.bh() + this.f21801a.f21834b.T();
            } else {
                str = this.f21801a.f21834b.bh() + this.f21801a.f21834b.T() + this.f21801a.f21834b.C();
            }
            c a9 = e.a().a(this.f21804d, str);
            if (a9 != null) {
                a9.i();
                this.f21812m = true;
            }
        }

        public final void a(int i, int i4) {
            this.f21810k = i;
            this.f21811l = i4;
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.f21796y = 0;
        this.f21797z = 0;
        this.f21775A = 0;
        this.f21777C = 2;
        this.f21779E = false;
        this.f21780F = 2;
        this.f21781G = 1;
        this.J = false;
        this.f21783K = false;
        this.f21784L = false;
    }

    private int f() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).x();
    }

    public int getMute() {
        return this.f21777C;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21774p);
        if (findLayout > 0) {
            this.f21838f.inflate(findLayout, this);
            this.f21840h = b();
            a();
        }
        f21772I = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f21784L) {
            com.anythink.expressad.video.bt.a.c.a();
            this.f21780F = com.anythink.expressad.video.bt.a.c.e(this.f21835c);
        }
        View view = this.f21791t;
        if (view != null) {
            view.setVisibility(this.f21797z == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f21789r;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f21775A == 0 ? 8 : 0);
        }
        TextView textView = this.f21790s;
        if (textView != null) {
            textView.setVisibility(this.f21796y == 0 ? 8 : 0);
            if (this.f21790s.getVisibility() == 0 && b.a().b()) {
                this.f21834b.l(this.f21835c);
                b.a().a(Wv.i(new StringBuilder(), this.f21835c, "_1"), this.f21834b);
                b.a().a(Wv.i(new StringBuilder(), this.f21835c, "_1"), this.f21792u);
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
            PlayerView playerView = this.f21788q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f21788q.release();
                this.f21788q = null;
            }
            SoundImageView soundImageView = this.f21789r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f21791t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f21794w != null) {
                this.f21794w = null;
            }
            if (this.f21787O != null) {
                this.f21787O = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onPause() {
        PlayerView playerView = this.f21788q;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f21783K = isPlayIng;
            this.f21788q.setIsBTVideoPlaying(isPlayIng);
            this.f21788q.onPause();
        }
    }

    public void onResume(com.anythink.expressad.video.a.a aVar) {
        PlayerView playerView = this.f21788q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f21788q.setIsCovered(false);
            if (this.f21783K) {
                this.f21788q.onResume();
            }
        }
        this.f21787O = aVar;
    }

    public void onStop() {
        PlayerView playerView = this.f21788q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f21788q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f21794w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f21836d);
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void play() {
        a aVar;
        try {
            if (this.f21784L) {
                if (this.f21779E) {
                    this.f21788q.playVideo(0);
                    this.f21779E = false;
                } else {
                    this.f21788q.start(false);
                }
                WebView webView = this.f21794w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21836d);
                    return;
                }
                return;
            }
            if (this.f21780F == 1) {
                playMute();
            } else {
                playUnMute();
            }
            if (!this.f21788q.playVideo() && (aVar = this.f21776B) != null) {
                aVar.onPlayError("play video failed");
            }
            this.f21784L = true;
            WebView webView2 = this.f21794w;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.f21836d);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f21788q;
            if (playerView != null && this.f21794w != null) {
                playerView.closeSound();
                this.f21789r.setSoundStatus(false);
                this.f21777C = 1;
                BTBaseView.a(this.f21794w, "onPlayerMute", this.f21836d);
                com.anythink.expressad.video.a.a aVar = this.f21787O;
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
            PlayerView playerView = this.f21788q;
            if (playerView != null && this.f21794w != null) {
                playerView.openSound();
                this.f21789r.setSoundStatus(true);
                this.f21777C = 2;
                BTBaseView.a(this.f21794w, "onUnmute", this.f21836d);
                com.anythink.expressad.video.a.a aVar = this.f21787O;
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
        if (this.f21834b.x() == 94 || this.f21834b.x() == 287) {
            str = this.f21834b.aa() + this.f21834b.bh() + this.f21834b.T();
        } else {
            str = this.f21834b.bh() + this.f21834b.T() + this.f21834b.C();
        }
        c a9 = e.a().a(this.f21835c, str);
        if (a9 != null) {
            this.f21795x = a9;
        }
        this.f21778D = e();
        String d9 = d();
        this.f21782H = d9;
        if (this.f21840h && !TextUtils.isEmpty(d9) && this.f21834b != null) {
            a aVar = new a(this, this.f21794w);
            this.f21776B = aVar;
            d dVar = this.f21834b;
            aVar.a(dVar != null ? dVar.aq() != -1 ? dVar.aq() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).v() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).v(), com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).x());
            this.f21788q.setDesk(false);
            this.f21788q.initBufferIngParam(this.f21778D);
            this.f21788q.initVFPData(this.f21782H, this.f21834b.T(), this.f21834b.aq(), this.f21776B);
            soundOperate(this.f21777C, -1, null);
        }
        f21772I = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f21788q;
            if (playerView != null) {
                if (this.f21779E) {
                    playerView.playVideo(0);
                    this.f21779E = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.f21794w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f21836d);
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
            this.f21790s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_shape_progress", k.f20419c));
            this.f21790s.setWidth(v.b(t.b().g(), 30.0f));
            return;
        }
        this.f21790s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", k.f20419c));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.IceFishing.LiveIceFishing.k.e(30.0f));
        int b9 = v.b(t.b().g(), 5.0f);
        layoutParams.setMargins(b9, 0, 0, 0);
        this.f21790s.setPadding(b9, 0, b9, 0);
        this.f21790s.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.f21791t.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f21790s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f21794w = webView;
    }

    public void setNotchPadding(int i, int i4, int i6, int i9) {
        if (i <= 0) {
            i = this.f21785M.getPaddingLeft();
        }
        if (i4 <= 0) {
            i4 = this.f21785M.getPaddingRight();
        }
        if (i6 <= 0) {
            i6 = this.f21785M.getPaddingTop();
        }
        if (i9 <= 0) {
            i9 = this.f21785M.getPaddingBottom();
        }
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i9));
        this.f21785M.setPadding(i, i6, i4, i9);
    }

    public void setOrientation(int i) {
        this.f21781G = i;
    }

    public void setPlaybackParams(float f2) {
        PlayerView playerView = this.f21788q;
        if (playerView != null) {
            playerView.setPlaybackParams(f2);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f21786N;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i) {
        this.f21797z = i;
    }

    public void setShowMute(int i) {
        this.f21775A = i;
    }

    public void setShowTime(int i) {
        this.f21796y = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.f21789r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVolume(float f2, float f9) {
        PlayerView playerView = this.f21788q;
        if (playerView != null) {
            playerView.setVolume(f2, f9);
        }
    }

    public void soundOperate(int i, int i4, String str) {
        if (this.f21840h) {
            this.f21777C = i;
            if (i == 1) {
                this.f21789r.setSoundStatus(false);
                this.f21788q.closeSound();
            } else if (i == 2) {
                this.f21789r.setSoundStatus(true);
                this.f21788q.openSound();
            }
            if (i4 == 1) {
                this.f21789r.setVisibility(8);
            } else if (i4 == 2) {
                this.f21789r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f21788q;
            if (playerView != null) {
                playerView.pause();
                this.f21788q.stop();
                try {
                    this.f21788q.prepare();
                    this.f21788q.justSeekTo(0);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                WebView webView = this.f21794w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f21836d);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private boolean b() {
        try {
            this.f21788q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.f21789r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.f21790s = (TextView) findViewById(findID("anythink_tv_count"));
            this.f21791t = findViewById(findID("anythink_rl_playing_close"));
            this.f21785M = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.f21786N = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.f21788q.setIsBTVideo(true);
            this.f21792u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            this.f21793v = (ImageView) findViewById(findID("anythink_iv_link"));
            return isNotNULL(this.f21788q, this.f21789r, this.f21790s, this.f21791t);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void c() {
        String str;
        if (this.f21834b.x() == 94 || this.f21834b.x() == 287) {
            str = this.f21834b.aa() + this.f21834b.bh() + this.f21834b.T();
        } else {
            str = this.f21834b.bh() + this.f21834b.T() + this.f21834b.C();
        }
        c a9 = e.a().a(this.f21835c, str);
        if (a9 != null) {
            this.f21795x = a9;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f21834b.T();
            c cVar = this.f21795x;
            if (cVar != null && cVar.k() == 5) {
                String e9 = this.f21795x.e();
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
        if (this.f21840h) {
            this.f21789r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTVideoView.this.f21788q.isSilent();
                    if (AnythinkBTVideoView.this.f21794w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21830n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21836d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.f21777C);
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21794w, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            int unused = AnythinkBTVideoView.this.f21777C;
                        } catch (Exception e9) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21794w, e9.getMessage());
                        }
                    }
                }
            });
            this.f21791t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21794w != null) {
                        BTBaseView.a(AnythinkBTVideoView.this.f21794w, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f21836d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21794w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21830n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21836d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21794w, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21794w, "onClicked", AnythinkBTVideoView.this.f21836d);
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
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21835c, false).v();
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21796y = 0;
        this.f21797z = 0;
        this.f21775A = 0;
        this.f21777C = 2;
        this.f21779E = false;
        this.f21780F = 2;
        this.f21781G = 1;
        this.J = false;
        this.f21783K = false;
        this.f21784L = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i4) {
        if (i4 != 0) {
            double d9 = i / i4;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d9)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i4);
    }
}

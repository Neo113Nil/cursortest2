package com.anythink.expressad.video.module;

import D.x;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView;
import com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.m;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.j;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView;
import com.anythink.expressad.widget.rewardpopview.c;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkVideoView extends AnythinkBaseView implements f, j {

    /* renamed from: A, reason: collision with root package name */
    private static int f22423A = 0;

    /* renamed from: B, reason: collision with root package name */
    private static int f22424B = 0;

    /* renamed from: C, reason: collision with root package name */
    private static int f22425C = 0;

    /* renamed from: D, reason: collision with root package name */
    private static int f22426D = 0;

    /* renamed from: E, reason: collision with root package name */
    private static final String f22427E = "2";
    public static final String TAG = "AnythinkVideoView";
    private static boolean aF = false;

    /* renamed from: u, reason: collision with root package name */
    private static final String f22428u = "anythink_reward_videoview_item";

    /* renamed from: v, reason: collision with root package name */
    private static final int f22429v = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final float f22430w = 1280.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final float f22431x = 720.0f;

    /* renamed from: y, reason: collision with root package name */
    private static final float f22432y = 0.1f;

    /* renamed from: z, reason: collision with root package name */
    private static int f22433z;

    /* renamed from: F, reason: collision with root package name */
    private PlayerView f22434F;

    /* renamed from: G, reason: collision with root package name */
    private SoundImageView f22435G;

    /* renamed from: H, reason: collision with root package name */
    private TextView f22436H;

    /* renamed from: I, reason: collision with root package name */
    private View f22437I;
    private RelativeLayout J;

    /* renamed from: K, reason: collision with root package name */
    private ImageView f22438K;

    /* renamed from: L, reason: collision with root package name */
    private ProgressBar f22439L;

    /* renamed from: M, reason: collision with root package name */
    private FeedBackButton f22440M;

    /* renamed from: N, reason: collision with root package name */
    private ImageView f22441N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f22442O;

    /* renamed from: P, reason: collision with root package name */
    private AnyThinkSegmentsProgressBar f22443P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.a f22444Q;

    /* renamed from: R, reason: collision with root package name */
    private int f22445R;

    /* renamed from: S, reason: collision with root package name */
    private FrameLayout f22446S;

    /* renamed from: T, reason: collision with root package name */
    private AnythinkClickCTAView f22447T;

    /* renamed from: U, reason: collision with root package name */
    private com.anythink.expressad.video.signal.factory.b f22448U;

    /* renamed from: V, reason: collision with root package name */
    private int f22449V;

    /* renamed from: W, reason: collision with root package name */
    private RelativeLayout f22450W;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private int aD;
    private boolean aE;
    private int aG;
    private String aH;
    private int aI;
    private int aJ;
    private int aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private AlphaAnimation aU;
    private AnythinkBaitClickView aV;
    private int aW;
    private int aX;
    private int aY;
    private int aZ;
    private boolean aa;
    private com.anythink.expressad.video.module.a.a ab;
    private int ac;
    private RelativeLayout ad;
    private CollapsibleWebView ae;
    private RelativeLayout af;
    private com.anythink.expressad.video.a.a ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private String ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private com.anythink.expressad.widget.a.a ap;
    private com.anythink.expressad.widget.a.b aq;
    private String ar;
    private double as;
    private double at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    private c ba;
    private ATAcquireRewardPopView bb;
    private boolean bc;
    private boolean bd;
    private int be;
    private b bf;
    private boolean bg;
    private Runnable bh;
    private Runnable bi;
    public List<d> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;

    /* renamed from: n, reason: collision with root package name */
    com.anythink.expressad.reward.player.c f22451n;
    public TextView tvFlag;

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$18, reason: invalid class name */
    public class AnonymousClass18 implements Runnable {
        public AnonymousClass18() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkVideoView.s(AnythinkVideoView.this);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.foundation.g.d.c {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(final Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    com.anythink.expressad.foundation.g.i.a.b().execute(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                final Bitmap a9 = h.a(bitmap);
                                AnythinkVideoView.this.f22438K.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.2.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnythinkVideoView.this.f22438K.setVisibility(0);
                                        AnythinkVideoView.this.f22438K.setImageBitmap(a9);
                                    }
                                });
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                    });
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f22482a;

        /* renamed from: b, reason: collision with root package name */
        public int f22483b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22484c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProgressData{curPlayPosition=");
            sb.append(this.f22482a);
            sb.append(", allDuration=");
            return x.n(sb, this.f22483b, '}');
        }
    }

    public static final class b extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkVideoView f22485a;

        /* renamed from: b, reason: collision with root package name */
        private int f22486b;

        /* renamed from: c, reason: collision with root package name */
        private int f22487c;

        /* renamed from: d, reason: collision with root package name */
        private int f22488d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f22489e;

        /* renamed from: j, reason: collision with root package name */
        private boolean f22493j;

        /* renamed from: k, reason: collision with root package name */
        private String f22494k;

        /* renamed from: l, reason: collision with root package name */
        private d f22495l;

        /* renamed from: m, reason: collision with root package name */
        private int f22496m;

        /* renamed from: n, reason: collision with root package name */
        private int f22497n;

        /* renamed from: f, reason: collision with root package name */
        private a f22490f = new a();

        /* renamed from: g, reason: collision with root package name */
        private boolean f22491g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f22492h = false;
        private boolean i = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f22498o = false;

        public b(AnythinkVideoView anythinkVideoView) {
            this.f22485a = anythinkVideoView;
        }

        private d d() {
            return this.f22495l;
        }

        private void e() {
            AnythinkVideoView anythinkVideoView = this.f22485a;
            if (anythinkVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) anythinkVideoView.f22436H.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = k.e(25.0f);
                this.f22485a.f22436H.setLayoutParams(layoutParams);
            }
            int e9 = k.e(5.0f);
            this.f22485a.f22436H.setPadding(e9, 0, e9, 0);
        }

        private static void f() {
        }

        public final void a(d dVar) {
            this.f22495l = dVar;
        }

        public final int b() {
            return this.f22488d;
        }

        public final void c() {
            this.f22485a = null;
            boolean unused = AnythinkVideoView.aF = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            com.anythink.expressad.video.module.a.a aVar;
            try {
                super.onBufferingEnd();
                AnythinkVideoView anythinkVideoView = this.f22485a;
                if (anythinkVideoView == null || (aVar = anythinkVideoView.f22232e) == null) {
                    return;
                }
                aVar.a(14, "");
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            com.anythink.expressad.video.module.a.a aVar;
            try {
                super.onBufferingStart(str);
                AnythinkVideoView anythinkVideoView = this.f22485a;
                if (anythinkVideoView == null || (aVar = anythinkVideoView.f22232e) == null) {
                    return;
                }
                aVar.a(13, "");
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            com.anythink.expressad.video.module.a.a aVar;
            AnythinkVideoView anythinkVideoView;
            super.onPlayCompleted();
            AnythinkVideoView.B(this.f22485a);
            if (this.f22495l != null) {
                this.f22485a.f22436H.setText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", com.anythink.expressad.foundation.h.k.f20423g));
                this.f22495l.p(100);
                if (this.f22495l.e() == 2) {
                    this.f22485a.f22437I.setVisibility(4);
                    if (this.f22485a.f22440M != null) {
                        this.f22485a.f22440M.setClickable(false);
                    }
                    if (this.f22485a.f22435G != null) {
                        this.f22485a.f22435G.setClickable(false);
                    }
                }
            } else {
                this.f22485a.f22436H.setText("0");
            }
            this.f22485a.f22434F.setClickable(false);
            String b9 = this.f22485a.b(true);
            d dVar = this.f22495l;
            if (dVar != null && dVar.k() == 5 && (anythinkVideoView = this.f22485a) != null && anythinkVideoView.f22444Q != null) {
                AnythinkVideoView anythinkVideoView2 = this.f22485a;
                if (anythinkVideoView2.mCampaignSize > anythinkVideoView2.mCurrPlayNum) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(com.anythink.expressad.foundation.g.g.a.b.ab, Integer.valueOf(this.f22485a.mCurrPlayNum));
                    int i = this.f22485a.mMuteSwitch;
                    if (i != 0) {
                        hashMap.put("mute", Integer.valueOf(i));
                    }
                    this.f22485a.f22444Q.a(hashMap);
                    return;
                }
            }
            AnythinkVideoView anythinkVideoView3 = this.f22485a;
            if (anythinkVideoView3 != null && (aVar = anythinkVideoView3.f22232e) != null) {
                aVar.a(121, "");
                this.f22485a.f22232e.a(11, b9);
            }
            int i4 = this.f22487c;
            this.f22486b = i4;
            this.f22485a.mCurrentPlayProgressTime = i4;
            boolean unused = AnythinkVideoView.aF = true;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            com.anythink.expressad.video.module.a.a aVar;
            super.onPlayError(str);
            AnythinkVideoView anythinkVideoView = this.f22485a;
            if (anythinkVideoView == null || (aVar = anythinkVideoView.f22232e) == null) {
                return;
            }
            aVar.a(12, str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i4) {
            String str;
            d dVar;
            com.anythink.expressad.video.module.a.a aVar;
            int i6;
            String str2;
            String str3;
            int i9;
            super.onPlayProgress(i, i4);
            if (this.f22485a.f22233f) {
                d dVar2 = this.f22495l;
                int i10 = 0;
                if (dVar2 != null) {
                    i6 = dVar2.i();
                    if (i6 <= 0) {
                        i6 = i4;
                    }
                    com.anythink.expressad.foundation.f.b.a().a(this.f22495l.L() + "_1", i);
                } else {
                    i6 = 0;
                }
                String str4 = "0";
                if (this.f22495l.j() && this.f22495l.k() == 5) {
                    try {
                        int i11 = this.f22485a.f22445R;
                        AnythinkVideoView anythinkVideoView = this.f22485a;
                        if (anythinkVideoView != null) {
                            String str5 = (String) anythinkVideoView.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", com.anythink.expressad.foundation.h.k.f20423g));
                            String str6 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", com.anythink.expressad.foundation.h.k.f20423g));
                            if (i6 >= 0) {
                                if (this.f22495l.aJ() == 1) {
                                    int min = Math.min(this.f22485a.al, i6);
                                    if (min >= i6 || min <= 0) {
                                        i9 = i6 - i;
                                        if (this.f22493j) {
                                            if (i9 <= 0) {
                                                this.f22485a.f22436H.setVisibility(4);
                                            } else {
                                                str6 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g));
                                            }
                                        }
                                    } else {
                                        i9 = min - i;
                                        if (i9 <= 0) {
                                            i9 = i6 - i;
                                            if (this.f22493j) {
                                                this.f22485a.f22436H.setVisibility(4);
                                            }
                                        } else {
                                            str6 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g));
                                        }
                                    }
                                } else {
                                    i9 = i6 - i;
                                }
                                if (i9 > 0) {
                                    str5 = i9 + str6;
                                }
                            } else {
                                i9 = i11 - i;
                                if (i9 <= 0) {
                                    if (i6 <= 0) {
                                        this.f22490f.f22482a = i;
                                        this.f22485a.f22436H.setText(str4);
                                        if (this.f22485a.f22439L != null && this.f22485a.f22439L.getVisibility() == 0) {
                                            this.f22485a.f22439L.setProgress(i);
                                        }
                                        if (i9 < this.f22485a.aZ && this.f22485a.bb != null && this.f22485a.aj) {
                                            this.f22485a.bb.onTimeLessThanReduce(i9);
                                        }
                                    }
                                } else if (i6 <= 0) {
                                    str5 = String.valueOf(i9);
                                } else {
                                    str5 = i9 + str6;
                                }
                            }
                            str4 = str5;
                            this.f22490f.f22482a = i;
                            this.f22485a.f22436H.setText(str4);
                            if (this.f22485a.f22439L != null) {
                                this.f22485a.f22439L.setProgress(i);
                            }
                            if (i9 < this.f22485a.aZ) {
                                this.f22485a.bb.onTimeLessThanReduce(i9);
                            }
                        }
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                } else {
                    AnythinkVideoView anythinkVideoView2 = this.f22485a;
                    if (anythinkVideoView2 != null) {
                        if (this.f22493j) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(i4 - i);
                            str3 = sb.toString();
                        } else {
                            if (i6 > i4) {
                                i6 = i4;
                            }
                            int i12 = i6 <= 0 ? i4 - i : i6 - i;
                            if (i12 > 0) {
                                if (i6 <= 0) {
                                    str2 = String.valueOf(i12);
                                } else {
                                    str2 = i12 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", com.anythink.expressad.foundation.h.k.f20423g)));
                                }
                                str4 = str2;
                                i10 = i12;
                            } else if (i6 > 0) {
                                str4 = (String) anythinkVideoView2.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", com.anythink.expressad.foundation.h.k.f20423g));
                            }
                            if (i10 < this.f22485a.aZ && this.f22485a.bb != null && this.f22485a.aj) {
                                this.f22485a.bb.onTimeLessThanReduce(i10);
                            }
                            str3 = str4;
                        }
                        d dVar3 = this.f22495l;
                        if (dVar3 != null && dVar3.aJ() == 1) {
                            int min2 = Math.min(this.f22485a.al, i4);
                            if (min2 >= i6 || min2 < 0) {
                                int i13 = i6 - i;
                                if (this.f22493j) {
                                    if (i13 > 0) {
                                        str3 = i13 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g)));
                                    } else if (i13 == 0) {
                                        this.f22485a.f22436H.setVisibility(4);
                                    }
                                }
                            } else {
                                int i14 = min2 - i;
                                if (i14 > 0) {
                                    str3 = i14 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g)));
                                } else if (this.f22493j && i14 == 0) {
                                    this.f22485a.f22436H.setVisibility(4);
                                }
                            }
                        }
                        this.f22485a.f22436H.setText(str3);
                        if (this.f22485a.f22439L != null && this.f22485a.f22439L.getVisibility() == 0) {
                            this.f22485a.f22439L.setProgress(i);
                        }
                    }
                    this.f22490f.f22482a = i;
                }
            }
            this.f22487c = i4;
            AnythinkVideoView anythinkVideoView3 = this.f22485a;
            anythinkVideoView3.mCurrentPlayProgressTime = i;
            a aVar2 = this.f22490f;
            aVar2.f22482a = i;
            aVar2.f22483b = i4;
            aVar2.f22484c = anythinkVideoView3.aR;
            this.f22486b = i;
            AnythinkVideoView anythinkVideoView4 = this.f22485a;
            if (anythinkVideoView4 != null && (aVar = anythinkVideoView4.f22232e) != null) {
                aVar.a(15, this.f22490f);
            }
            if (this.f22485a.aE && !this.f22485a.aL && this.f22485a.aI == com.anythink.expressad.foundation.g.a.cw) {
                this.f22485a.g();
            }
            try {
                AnythinkVideoView anythinkVideoView5 = this.f22485a;
                if (anythinkVideoView5 != null && anythinkVideoView5.f22443P != null) {
                    int i15 = (i * 100) / i4;
                    this.f22485a.f22443P.setProgress(i15, this.f22485a.mCurrPlayNum - 1);
                    this.f22495l.p(i15);
                }
                AnythinkVideoView anythinkVideoView6 = this.f22485a;
                if (anythinkVideoView6 != null) {
                    int i16 = anythinkVideoView6.ac != -5 ? this.f22485a.ac : this.f22485a.f22449V;
                    if (i16 != -1 && i == i16 && (dVar = this.f22485a.f22229b) != null && dVar.j()) {
                        this.f22485a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            int i17 = this.f22496m;
            if (i17 == 100 || this.f22498o || i17 == 0) {
                return;
            }
            if (this.f22497n > i17) {
                this.f22497n = i17 / 2;
            }
            int i18 = this.f22497n;
            if (i18 < 0 || i < (i4 * i18) / 100) {
                return;
            }
            if (this.f22495l.x() == 94 || this.f22495l.x() == 287) {
                str = this.f22495l.aa() + this.f22495l.bh() + this.f22495l.T();
            } else {
                str = this.f22495l.bh() + this.f22495l.T() + this.f22495l.C();
            }
            com.anythink.expressad.videocommon.b.c a9 = e.a().a(this.f22494k, str);
            if (a9 != null) {
                a9.i();
                this.f22498o = true;
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            com.anythink.expressad.video.module.a.a aVar;
            super.onPlayStarted(i);
            if (!this.f22489e) {
                AnythinkVideoView anythinkVideoView = this.f22485a;
                if (anythinkVideoView != null) {
                    AnythinkVideoView.t(anythinkVideoView);
                }
                AnythinkVideoView anythinkVideoView2 = this.f22485a;
                if (anythinkVideoView2 != null && (aVar = anythinkVideoView2.f22232e) != null) {
                    aVar.a(10, this.f22490f);
                }
                this.f22489e = true;
            }
            this.f22488d = i;
            d dVar = this.f22495l;
            if (dVar != null) {
                int i4 = dVar.i();
                if (i4 <= 0) {
                    i4 = i;
                }
                String str = "anythink_reward_shape_progress";
                if (this.f22495l.j()) {
                    AnythinkVideoView anythinkVideoView3 = this.f22485a;
                    if (anythinkVideoView3 != null && anythinkVideoView3.f22436H != null) {
                        if (this.f22495l.k() == 5) {
                            AnythinkVideoView anythinkVideoView4 = this.f22485a;
                            if (anythinkVideoView4.mCurrPlayNum > 1 && i4 <= 0) {
                                anythinkVideoView4.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", com.anythink.expressad.foundation.h.k.f20419c));
                                e();
                            }
                        }
                        if (i4 > 0) {
                            if (!this.f22493j || this.f22495l.k() == 5) {
                                e();
                            }
                            str = "anythink_reward_video_time_count_num_bg";
                        }
                        d dVar2 = this.f22495l;
                        if (dVar2 != null && dVar2.aJ() == 1 && this.f22493j) {
                            e();
                        }
                        this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), str, com.anythink.expressad.foundation.h.k.f20419c));
                    }
                } else if (i4 > 0) {
                    this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", com.anythink.expressad.foundation.h.k.f20419c));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, k.e(30.0f));
                    int e9 = k.e(5.0f);
                    layoutParams.addRule(1, com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(e9, 0, 0, 0);
                    this.f22485a.f22436H.setPadding(e9, 0, e9, 0);
                    this.f22485a.f22436H.setLayoutParams(layoutParams);
                } else {
                    this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_shape_progress", com.anythink.expressad.foundation.h.k.f20419c));
                }
            }
            if (this.f22485a.f22439L != null) {
                this.f22485a.f22439L.setMax(i);
            }
            d dVar3 = this.f22495l;
            if (dVar3 != null && dVar3.e() == 2) {
                this.f22485a.J.setVisibility(0);
            }
            if (this.f22485a.f22436H.getVisibility() == 0) {
                this.f22485a.s();
            }
            boolean unused = AnythinkVideoView.aF = false;
            if (this.f22485a != null && this.f22495l.j()) {
                if (this.f22485a.ac != -5) {
                    if (this.f22485a.ac == 0) {
                        this.f22485a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f22485a.f22449V == 0) {
                    this.f22485a.setCTALayoutVisibleOrGone();
                }
            }
            this.f22485a.showMoreOfferInPlayTemplate();
            this.f22485a.showBaitClickView();
            AnythinkVideoView.A(this.f22485a);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f22495l.x() == 94 || this.f22495l.x() == 287) {
                str = this.f22495l.aa() + this.f22495l.bh() + this.f22495l.T();
            } else {
                str = this.f22495l.bh() + this.f22495l.T() + this.f22495l.C();
            }
            com.anythink.expressad.videocommon.b.c a9 = e.a().a(this.f22494k, str);
            if (a9 != null) {
                a9.i();
                this.f22498o = true;
            }
        }

        private void b(int i) {
            AnythinkVideoView anythinkVideoView = this.f22485a;
            if (anythinkVideoView == null || anythinkVideoView.f22436H == null) {
                return;
            }
            String str = "anythink_reward_video_time_count_num_bg";
            if (this.f22495l.k() == 5) {
                AnythinkVideoView anythinkVideoView2 = this.f22485a;
                if (anythinkVideoView2.mCurrPlayNum > 1 && i <= 0) {
                    anythinkVideoView2.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", com.anythink.expressad.foundation.h.k.f20419c));
                    e();
                    return;
                }
            }
            if (i <= 0) {
                str = "anythink_reward_shape_progress";
            } else if (!this.f22493j || this.f22495l.k() == 5) {
                e();
            }
            d dVar = this.f22495l;
            if (dVar != null && dVar.aJ() == 1 && this.f22493j) {
                e();
            }
            this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), str, com.anythink.expressad.foundation.h.k.f20419c));
        }

        public final void a(boolean z6) {
            this.f22493j = z6;
        }

        public final void a(String str) {
            this.f22494k = str;
        }

        public final int a() {
            return this.f22486b;
        }

        public final void a(int i, int i4) {
            this.f22496m = i;
            this.f22497n = i4;
        }

        private void a(int i) {
            if (i > 0) {
                this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", com.anythink.expressad.foundation.h.k.f20419c));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, k.e(30.0f));
                int e9 = k.e(5.0f);
                layoutParams.addRule(1, com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(e9, 0, 0, 0);
                this.f22485a.f22436H.setPadding(e9, 0, e9, 0);
                this.f22485a.f22436H.setLayoutParams(layoutParams);
                return;
            }
            this.f22485a.f22436H.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_shape_progress", com.anythink.expressad.foundation.h.k.f20419c));
        }

        private void b(int i, int i4, int i6) {
            String str;
            AnythinkVideoView anythinkVideoView = this.f22485a;
            if (anythinkVideoView == null) {
                return;
            }
            if (!this.f22493j) {
                if (i > i4) {
                    i = i4;
                }
                int i9 = i <= 0 ? i4 - i6 : i - i6;
                if (i9 <= 0) {
                    str = i <= 0 ? "0" : (String) anythinkVideoView.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", com.anythink.expressad.foundation.h.k.f20423g));
                    i9 = 0;
                } else if (i <= 0) {
                    str = String.valueOf(i9);
                } else {
                    str = i9 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", com.anythink.expressad.foundation.h.k.f20423g)));
                }
                if (i9 < this.f22485a.aZ && this.f22485a.bb != null && this.f22485a.aj) {
                    this.f22485a.bb.onTimeLessThanReduce(i9);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i4 - i6);
                str = sb.toString();
            }
            d dVar = this.f22495l;
            if (dVar != null && dVar.aJ() == 1) {
                int min = Math.min(this.f22485a.al, i4);
                if (min >= i || min < 0) {
                    int i10 = i - i6;
                    if (this.f22493j) {
                        if (i10 > 0) {
                            str = i10 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g)));
                        } else if (i10 == 0) {
                            this.f22485a.f22436H.setVisibility(4);
                        }
                    }
                } else {
                    int i11 = min - i6;
                    if (i11 > 0) {
                        str = i11 + ((String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g)));
                    } else if (this.f22493j && i11 == 0) {
                        this.f22485a.f22436H.setVisibility(4);
                    }
                }
            }
            this.f22485a.f22436H.setText(str);
            if (this.f22485a.f22439L == null || this.f22485a.f22439L.getVisibility() != 0) {
                return;
            }
            this.f22485a.f22439L.setProgress(i6);
        }

        private void a(int i, int i4, int i6) {
            int i9;
            AnythinkVideoView anythinkVideoView = this.f22485a;
            if (anythinkVideoView == null) {
                return;
            }
            String str = (String) anythinkVideoView.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", com.anythink.expressad.foundation.h.k.f20423g));
            String str2 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", com.anythink.expressad.foundation.h.k.f20423g));
            if (i >= 0) {
                if (this.f22495l.aJ() == 1) {
                    int min = Math.min(this.f22485a.al, i);
                    if (min >= i || min <= 0) {
                        i9 = i - i6;
                        if (this.f22493j) {
                            if (i9 <= 0) {
                                this.f22485a.f22436H.setVisibility(4);
                            } else {
                                str2 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g));
                            }
                        }
                    } else {
                        i9 = min - i6;
                        if (i9 > 0) {
                            str2 = (String) this.f22485a.getContext().getResources().getText(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", com.anythink.expressad.foundation.h.k.f20423g));
                        } else {
                            i9 = i - i6;
                            if (this.f22493j) {
                                this.f22485a.f22436H.setVisibility(4);
                            }
                        }
                    }
                } else {
                    i9 = i - i6;
                }
                if (i9 > 0) {
                    str = i9 + str2;
                }
            } else {
                i9 = i4 - i6;
                if (i9 <= 0) {
                    if (i <= 0) {
                        str = "0";
                    }
                } else if (i <= 0) {
                    str = String.valueOf(i9);
                } else {
                    str = i9 + str2;
                }
            }
            this.f22490f.f22482a = i6;
            this.f22485a.f22436H.setText(str);
            if (this.f22485a.f22439L != null && this.f22485a.f22439L.getVisibility() == 0) {
                this.f22485a.f22439L.setProgress(i6);
            }
            if (i9 >= this.f22485a.aZ || this.f22485a.bb == null || !this.f22485a.aj) {
                return;
            }
            this.f22485a.bb.onTimeLessThanReduce(i9);
        }
    }

    public AnythinkVideoView(Context context) {
        super(context);
        this.mMuteSwitch = 0;
        this.f22445R = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.aa = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ar = "";
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aE = false;
        this.aG = 2;
        this.aL = false;
        this.aM = false;
        this.aN = false;
        this.aO = true;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        this.aS = false;
        this.aT = false;
        this.aW = 0;
        this.aX = 5;
        this.aY = 5;
        this.aZ = 5;
        this.bc = false;
        this.bd = false;
        this.be = 0;
        this.bf = new b(this);
        this.bg = false;
        this.bh = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.8
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.f22446S != null) {
                    AnythinkVideoView.this.f22446S.setVisibility(8);
                }
            }
        };
        this.bi = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.11
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.aX <= 0) {
                    AnythinkVideoView.this.showRewardPopView();
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.removeCallbacks(anythinkVideoView.bi);
                } else {
                    AnythinkVideoView.ad(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                    anythinkVideoView2.postDelayed(anythinkVideoView2.bi, 1000L);
                }
            }
        };
    }

    public static /* synthetic */ void A(AnythinkVideoView anythinkVideoView) {
        String e9;
        d dVar = anythinkVideoView.f22229b;
        if (dVar == null || !dVar.j() || anythinkVideoView.aa) {
            return;
        }
        if (!TextUtils.isEmpty(anythinkVideoView.f22229b.as())) {
            e9 = anythinkVideoView.f22229b.as();
        } else if (anythinkVideoView.f22229b.N() == null) {
            return;
        } else {
            e9 = anythinkVideoView.f22229b.N().e();
        }
        if (TextUtils.isEmpty(e9)) {
            return;
        }
        try {
            String a9 = z.a(e9, "guideShow");
            String a10 = z.a(e9, "guideDelay");
            String a11 = z.a(e9, "guideTime");
            String a12 = z.a(e9, "guideRewardTime");
            if (!TextUtils.isEmpty(a9)) {
                anythinkVideoView.aW = Integer.parseInt(a9);
            }
            if (!TextUtils.isEmpty(a10)) {
                int parseInt = Integer.parseInt(a10);
                anythinkVideoView.aX = parseInt;
                if (parseInt > 10 || parseInt < 3) {
                    anythinkVideoView.aX = 5;
                }
            }
            if (!TextUtils.isEmpty(a11)) {
                int parseInt2 = Integer.parseInt(a11);
                anythinkVideoView.aY = parseInt2;
                if (parseInt2 > 10 || parseInt2 < 3) {
                    anythinkVideoView.aY = 5;
                }
            }
            if (!TextUtils.isEmpty(a12)) {
                int parseInt3 = Integer.parseInt(a12);
                anythinkVideoView.aZ = parseInt3;
                if (parseInt3 > 10 || parseInt3 < 5) {
                    anythinkVideoView.aZ = 5;
                }
            }
            int i = anythinkVideoView.aW;
            if (i > 0 && i <= 2) {
                int y7 = anythinkVideoView.y();
                if (y7 == 0 || y7 > anythinkVideoView.aX) {
                    int i4 = y7 - anythinkVideoView.aX;
                    if (i4 >= 0 && anythinkVideoView.aZ > i4) {
                        anythinkVideoView.aZ = i4;
                    }
                    int z6 = anythinkVideoView.z();
                    if (anythinkVideoView.aZ >= z6) {
                        anythinkVideoView.aZ = z6 - anythinkVideoView.aX;
                    }
                    if (anythinkVideoView.aX >= z6) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(anythinkVideoView.f22229b.bj());
                    com.anythink.expressad.f.b.a();
                    t.b().p();
                    com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                    anythinkVideoView.ba = new c.a("", anythinkVideoView.ar, anythinkVideoView.aW, b9 != null ? b9.z() : "US").a(anythinkVideoView.aY).b(anythinkVideoView.aZ).a(anythinkVideoView.new AnonymousClass10()).a(arrayList).a();
                    anythinkVideoView.postDelayed(anythinkVideoView.bi, 1000L);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static /* synthetic */ boolean B(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aP = true;
        return true;
    }

    public static /* synthetic */ boolean R(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.bd = true;
        return true;
    }

    public static /* synthetic */ boolean Z(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aj = false;
        return false;
    }

    private void a(String str) {
        k.m().a(str, new AnonymousClass2());
    }

    public static /* synthetic */ int ad(AnythinkVideoView anythinkVideoView) {
        int i = anythinkVideoView.aX;
        anythinkVideoView.aX = i - 1;
        return i;
    }

    public static /* synthetic */ boolean g(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aS = true;
        return true;
    }

    public static /* synthetic */ boolean i(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.bc = true;
        return true;
    }

    public static /* synthetic */ boolean l(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.ah = false;
        return false;
    }

    public static /* synthetic */ boolean o(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aM = true;
        return true;
    }

    public static /* synthetic */ boolean p(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aR = true;
        return true;
    }

    private static void q() {
    }

    public static /* synthetic */ boolean r(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aN = true;
        return true;
    }

    public static /* synthetic */ boolean s(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.aB = true;
        return true;
    }

    public static /* synthetic */ boolean t(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f22442O = true;
        return true;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void alertWebViewShowed() {
        this.ah = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void closeVideoOperate(int i, int i4) {
        if (i == 1) {
            this.aS = true;
            if (getVisibility() == 0) {
                g();
            }
        }
        if (i4 == 1) {
            gonePlayingCloseView();
        } else if (i4 == 2) {
            if (this.aR && getVisibility() == 0) {
                return;
            }
            m();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
        this.au = true;
        showVideoLocation(0, 0, v.f(this.f22228a), v.e(this.f22228a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.al == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void dismissAllAlert() {
        com.anythink.expressad.widget.a.a aVar = this.ap;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.anythink.expressad.video.module.a.a aVar2 = this.f22232e;
        if (aVar2 != null) {
            aVar2.a(125, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewHeight() {
        return f22426D;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewLeft() {
        return f22424B;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewRadius() {
        return f22433z;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewTop() {
        return f22423A;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewWidth() {
        return f22425C;
    }

    public int getCloseAlert() {
        return this.an;
    }

    @Override // com.anythink.expressad.video.signal.j
    public String getCurrentProgress() {
        try {
            int a9 = this.bf.a();
            d dVar = this.f22229b;
            int bq = dVar != null ? dVar.bq() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.a.f13735C, a(a9, bq));
            jSONObject.put("time", a9);
            jSONObject.put("duration", String.valueOf(bq));
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return "{}";
        }
    }

    public int getMute() {
        return this.aG;
    }

    public String getUnitId() {
        return this.ar;
    }

    public int getVideoSkipTime() {
        return this.al;
    }

    public void gonePlayingCloseView() {
        if (this.f22233f && this.f22437I.getVisibility() != 8) {
            this.f22437I.setVisibility(8);
            this.ay = false;
        }
        if (this.bg || this.aB || this.az) {
            return;
        }
        this.bg = true;
        int i = this.al;
        if (i >= 0) {
            if (i == 0) {
                this.aB = true;
            } else {
                new Handler().postDelayed(new AnonymousClass18(), this.al * 1000);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void hideAlertView(int i) {
        if (this.ah) {
            this.ah = false;
            this.aL = true;
            setShowingAlertViewCover(false);
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false);
            if (i == 0) {
                k();
                if (this.aE) {
                    int i4 = this.aI;
                    if (i4 == com.anythink.expressad.foundation.g.a.cw || i4 == com.anythink.expressad.foundation.g.a.cv) {
                        this.aM = true;
                        com.anythink.expressad.video.module.a.a aVar = this.f22232e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        d dVar = this.f22229b;
                        if (dVar != null && dVar.N() != null && this.f22229b.N().b() == 5002010) {
                            m();
                            return;
                        } else {
                            this.aR = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.aN = true;
            boolean z6 = this.aE;
            if (z6 && this.aI == com.anythink.expressad.foundation.g.a.cw) {
                k();
                return;
            }
            if (z6 && this.aI == com.anythink.expressad.foundation.g.a.cv) {
                com.anythink.expressad.video.module.a.a aVar2 = this.f22232e;
                if (aVar2 != null) {
                    this.bc = true;
                    aVar2.a(2, b(this.aP));
                    return;
                }
                return;
            }
            com.anythink.expressad.video.module.a.a aVar3 = this.f22232e;
            if (aVar3 != null) {
                this.bc = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // com.anythink.expressad.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < v.e(this.f22228a.getApplicationContext());
    }

    public boolean isInstallDialogShowing() {
        return this.ai;
    }

    public boolean isMiniCardShowing() {
        return this.ax;
    }

    public boolean isRewardPopViewShowing() {
        return this.aj;
    }

    public boolean isShowingAlertView() {
        return this.ah;
    }

    public boolean isShowingTransparent() {
        return this.aC;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = indexOfChild + 1;
        boolean z6 = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.ax) {
                return false;
            }
            i++;
            z6 = true;
        }
        return z6;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.az = true;
            this.aB = false;
        } else if (i == 1) {
            this.aA = true;
        }
    }

    public void notifyVideoClose() {
        this.bc = true;
        this.f22232e.a(2, "");
    }

    public void onActivityPause() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.bb;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onActivityResume() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.bb;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onActivityStop() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.bb;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onBackPress() {
        boolean z6;
        if (this.ax || this.ah || this.aM) {
            return;
        }
        d dVar = this.f22229b;
        if (dVar != null && dVar.N() != null && this.f22229b.N().b() == 5002010 && (z6 = this.aP)) {
            com.anythink.expressad.video.module.a.a aVar = this.f22232e;
            if (aVar != null) {
                this.bc = true;
                aVar.a(2, b(z6));
                return;
            }
            return;
        }
        if (this.ay) {
            g();
            return;
        }
        boolean z9 = this.az;
        if (z9 && this.aA) {
            g();
        } else {
            if (z9 || !this.aB) {
                return;
            }
            g();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d dVar = this.f22229b;
        if ((dVar == null || !dVar.j()) && this.f22233f && this.au) {
            o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.bh != null) {
                getHandler().removeCallbacks(this.bh);
            }
            if (this.aW != 0) {
                removeCallbacks(this.bi);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        d dVar;
        this.f22448U = bVar;
        if (!this.f22233f) {
            com.anythink.expressad.video.module.a.a aVar = this.f22232e;
            if (aVar != null) {
                aVar.a(12, "AnyThinkVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.ak) && (dVar = this.f22229b) != null) {
            if (dVar != null && y.b(dVar.V())) {
                String[] split = this.f22229b.V().split("x");
                if (split.length == 2) {
                    if (v.b(split[0]) > 0.0d) {
                        this.as = v.b(split[0]);
                    }
                    if (v.b(split[1]) > 0.0d) {
                        this.at = v.b(split[1]);
                    }
                }
                if (this.as <= 0.0d) {
                    this.as = 1280.0d;
                }
                if (this.at <= 0.0d) {
                    this.at = 720.0d;
                }
            }
            com.anythink.expressad.reward.player.c cVar = this.f22451n;
            if (cVar != null) {
                cVar.c();
            }
            this.f22434F.setTempEventListener(this.f22451n);
            this.f22434F.initBufferIngParam(this.am);
            this.f22434F.initVFPData(this.ak, this.f22229b.T(), this.f22229b.aq(), this.bf);
            soundOperate(this.aG, -1, null);
        }
        aF = false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (this.f22233f) {
            if (i == 1) {
                ProgressBar progressBar2 = this.f22439L;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i != 2 || (progressBar = this.f22439L) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressOperate(int i, int i4) {
        PlayerView playerView;
        if (this.f22233f) {
            d dVar = this.f22229b;
            int bq = dVar != null ? dVar.bq() : 0;
            if (i > 0 && i <= bq && (playerView = this.f22434F) != null) {
                playerView.seekTo(i * 1000);
            }
            if (i4 == 1) {
                this.f22436H.setVisibility(8);
            } else if (i4 == 2) {
                this.f22436H.setVisibility(0);
            }
            if (this.f22436H.getVisibility() == 0) {
                s();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.f22434F;
            if (playerView != null && !this.aw) {
                playerView.release();
            }
            b bVar = this.bf;
            if (bVar != null) {
                bVar.c();
            }
            if (this.ab != null) {
                this.ab = null;
            }
            if (this.ag != null) {
                this.ag = null;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setBufferTimeout(int i) {
        this.am = i;
    }

    public void setCTALayoutVisibleOrGone() {
        d dVar = this.f22229b;
        if (dVar == null || this.f22446S == null) {
            return;
        }
        if (dVar.N() == null || this.f22229b.N().b() != 902) {
            int i = this.ac;
            if (i != -5) {
                if (i == -3) {
                    return;
                }
                if (this.f22447T == null) {
                    v();
                }
                if (this.ac == -1) {
                    if (this.f22446S.getVisibility() != 0) {
                        this.f22446S.setVisibility(0);
                        postDelayed(this.bh, m.ai);
                    } else {
                        this.f22446S.setVisibility(8);
                        getHandler().removeCallbacks(this.bh);
                    }
                }
                if (this.ac >= 0) {
                    this.f22446S.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f22449V < -1) {
                return;
            }
            if (this.f22447T == null) {
                v();
            }
            int i4 = this.f22449V;
            if (i4 >= 0) {
                this.f22446S.setVisibility(0);
                return;
            }
            if (i4 == -1) {
                if (this.f22446S.getVisibility() != 0) {
                    this.f22446S.setVisibility(0);
                    postDelayed(this.bh, m.ai);
                } else {
                    this.f22446S.setVisibility(8);
                    getHandler().removeCallbacks(this.bh);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(com.anythink.expressad.video.dynview.f.a aVar, List<d> list, int i, int i4) {
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar;
        this.f22444Q = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i;
        this.f22445R = i4;
        this.mCampOrderViewData = list;
        d dVar = this.f22229b;
        if (dVar == null) {
            return;
        }
        if (dVar.k() != 5) {
            d dVar2 = this.f22229b;
            if (dVar2 == null || dVar2.aK() != 1 || (anyThinkSegmentsProgressBar = this.f22443P) == null) {
                return;
            }
            anyThinkSegmentsProgressBar.init(1, 3);
            this.f22443P.setVisibility(0);
            return;
        }
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar2 = this.f22443P;
        if (anyThinkSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            anyThinkSegmentsProgressBar2.setVisibility(0);
            this.f22443P.init(this.mCampaignSize, 2);
            for (int i6 = 0; i6 < this.mCampOrderViewData.size(); i6++) {
                int aI = this.mCampOrderViewData.get(i6).aI();
                if (aI > 0) {
                    this.f22443P.setProgress(aI, i6);
                }
                if (this.mCampOrderViewData.get(i6).cC) {
                    this.aa = true;
                }
            }
            return;
        }
        d dVar3 = this.f22229b;
        if (dVar3 == null || dVar3.aK() != 1) {
            this.f22443P.setVisibility(8);
            return;
        }
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar3 = this.f22443P;
        if (anyThinkSegmentsProgressBar3 != null) {
            anyThinkSegmentsProgressBar3.init(1, 3);
            this.f22443P.setVisibility(0);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setCampaign(d dVar) {
        super.setCampaign(dVar);
        b bVar = this.bf;
        if (bVar != null) {
            bVar.a(dVar);
            this.bf.a(dVar != null ? dVar.aq() != -1 ? dVar.aq() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).v() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).v(), com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).x());
        }
    }

    public void setCloseAlert(int i) {
        this.an = i;
    }

    public void setContainerViewOnNotifyListener(com.anythink.expressad.video.module.a.a aVar) {
        this.ab = aVar;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setCover(boolean z6) {
        if (this.f22233f) {
            this.f22434F.setIsCovered(z6);
        }
    }

    public void setDialogRole(int i) {
        this.aO = i == 1;
    }

    public void setIVRewardEnable(int i, int i4, int i6) {
        this.aI = i;
        this.aJ = i4;
        this.aK = i6;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setInstallDialogState(boolean z6) {
        this.ai = z6;
        this.f22434F.setIsCovered(z6);
    }

    public void setIsIV(boolean z6) {
        this.aE = z6;
        b bVar = this.bf;
        if (bVar != null) {
            bVar.a(z6);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setMiniEndCardState(boolean z6) {
        this.ax = z6;
    }

    public void setNotchPadding(final int i, final int i4, final int i6, final int i9) {
        RelativeLayout relativeLayout;
        AnythinkVideoView anythinkVideoView;
        try {
            String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i9));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i10 = layoutParams.leftMargin;
            int i11 = layoutParams.rightMargin;
            int i12 = layoutParams.topMargin;
            int i13 = layoutParams.bottomMargin;
            this.be = i6;
            if (Math.max(Math.max(i10, i11), Math.max(i12, i13)) <= Math.max(Math.max(i, i4), Math.max(i6, i9)) && (relativeLayout = this.J) != null) {
                anythinkVideoView = this;
                try {
                    relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.19
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (AnythinkVideoView.this.J == null) {
                                return;
                            }
                            AnythinkVideoView.this.J.setVisibility(0);
                            d dVar = AnythinkVideoView.this.f22229b;
                            if (dVar != null && !dVar.j() && AnythinkVideoView.this.f22229b.e() != 2) {
                                AnythinkVideoView.this.J.setPadding(i, i6, i4, i9);
                                AnythinkVideoView.this.J.startAnimation(AnythinkVideoView.this.aU);
                            }
                            AnythinkVideoView.this.J.setVisibility(0);
                        }
                    }, 200L);
                } catch (Exception e9) {
                    e = e9;
                    e.getMessage();
                    return;
                }
            } else {
                anythinkVideoView = this;
            }
            if (anythinkVideoView.f22436H.getVisibility() == 0) {
                s();
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public void setPlayURL(String str) {
        this.ak = str;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setScaleFitXY(int i) {
        this.aD = i;
    }

    public void setShowingAlertViewCover(boolean z6) {
        ATAcquireRewardPopView aTAcquireRewardPopView;
        if (z6 && (aTAcquireRewardPopView = this.bb) != null && this.aj && this.ah) {
            aTAcquireRewardPopView.onPause();
        }
        this.f22434F.setIsCovered(z6);
    }

    public void setShowingTransparent(boolean z6) {
        this.aC = z6;
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.ag = aVar;
    }

    public void setSoundState(int i) {
        this.aG = i;
    }

    public void setTempEventListener(com.anythink.expressad.reward.player.c cVar) {
        this.f22451n = cVar;
    }

    public void setUnitId(String str) {
        this.ar = str;
        b bVar = this.bf;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public void setVideoLayout(d dVar) {
        if (dVar != null) {
            this.f22229b = dVar;
            this.i = dVar.j();
        }
        if (this.i) {
            new com.anythink.expressad.video.dynview.j.c();
            com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(this, dVar);
            com.anythink.expressad.video.dynview.b.a();
            com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass1(this, a9));
            return;
        }
        int findLayout = findLayout(f22428u);
        if (findLayout > 0) {
            this.f22230c.inflate(findLayout, this);
            f();
        }
        aF = false;
        d dVar2 = this.f22229b;
        if (dVar2 == null || dVar2.e() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals(com.anythink.expressad.video.dynview.a.a.f21883S)) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    public void setVideoSkipTime(int i) {
        this.al = i;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setVisible(int i) {
        setVisibility(i);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showAlertView() {
        d dVar;
        if (this.ax) {
            return;
        }
        if (this.aq == null) {
            this.aq = new com.anythink.expressad.widget.a.b() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.16
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    AnythinkVideoView.l(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.ah);
                    if (AnythinkVideoView.this.aE && (AnythinkVideoView.this.aI == com.anythink.expressad.foundation.g.a.cw || AnythinkVideoView.this.aI == com.anythink.expressad.foundation.g.a.cv)) {
                        AnythinkVideoView.o(AnythinkVideoView.this);
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f22232e;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        AnythinkVideoView.p(AnythinkVideoView.this);
                        AnythinkVideoView.this.gonePlayingCloseView();
                    }
                    AnythinkVideoView.this.k();
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    AnythinkVideoView.l(AnythinkVideoView.this);
                    AnythinkVideoView.r(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.ah);
                    if (AnythinkVideoView.this.aE && AnythinkVideoView.this.aI == com.anythink.expressad.foundation.g.a.cv) {
                        AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                        if (anythinkVideoView2.f22232e != null) {
                            AnythinkVideoView.i(anythinkVideoView2);
                            AnythinkVideoView anythinkVideoView3 = AnythinkVideoView.this;
                            anythinkVideoView3.f22232e.a(2, anythinkVideoView3.b(anythinkVideoView3.aP));
                            return;
                        }
                        return;
                    }
                    if (AnythinkVideoView.this.aE && AnythinkVideoView.this.aI == com.anythink.expressad.foundation.g.a.cw) {
                        AnythinkVideoView.this.k();
                        return;
                    }
                    AnythinkVideoView anythinkVideoView4 = AnythinkVideoView.this;
                    if (anythinkVideoView4.f22232e != null) {
                        AnythinkVideoView.i(anythinkVideoView4);
                        AnythinkVideoView.this.f22232e.a(2, "");
                    }
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a();
                }
            };
        }
        if (this.ap == null) {
            this.ap = new com.anythink.expressad.widget.a.a(getContext(), this.aq);
        }
        if (this.aE) {
            this.ap.a(this.aI, this.ar);
        } else {
            this.ap.b();
        }
        PlayerView playerView = this.f22434F;
        if (playerView != null) {
            if (playerView.isComplete() && ((dVar = this.f22229b) == null || dVar.N() == null || this.f22229b.N().b() != 5002010)) {
                return;
            }
            this.ap.show();
            this.aL = true;
            this.ah = true;
            setShowingAlertViewCover(true);
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false);
            this.aH = com.anythink.expressad.videocommon.e.d.J();
        }
    }

    public void showBaitClickView() {
        int parseInt;
        AnythinkBaitClickView anythinkBaitClickView;
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j() || this.f22229b.N() == null) {
            return;
        }
        String e9 = this.f22229b.N().e();
        if (TextUtils.isEmpty(e9)) {
            return;
        }
        try {
            String a9 = z.a(e9, "bait_click");
            if (TextUtils.isEmpty(a9) || (parseInt = Integer.parseInt(a9)) == 0 || (anythinkBaitClickView = this.aV) == null) {
                return;
            }
            anythinkBaitClickView.setVisibility(0);
            this.aV.init(parseInt);
            this.aV.startAnimation();
            this.aV.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkVideoView.b(AnythinkVideoView.this);
                }
            });
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.f22232e.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        d dVar = this.f22229b;
        if (dVar == null || this.f22450W == null || !dVar.j() || this.f22229b.N() == null) {
            return;
        }
        TextUtils.isEmpty(this.f22229b.N().e());
    }

    public void showRewardPopView() {
        c cVar;
        ATAcquireRewardPopView aTAcquireRewardPopView = this.bb;
        if (aTAcquireRewardPopView == null || (cVar = this.ba) == null) {
            return;
        }
        try {
            aTAcquireRewardPopView.init(cVar);
            this.bb.setVisibility(0);
            setCover(true);
            j();
            this.aj = true;
            d dVar = this.f22229b;
            if (dVar != null) {
                dVar.cC = true;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showVideoLocation(int i, int i4, int i6, int i9, int i10, int i11, int i12, int i13, int i14) {
        float f2;
        if (this.f22233f) {
            this.J.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.J.getVisibility() != 0) {
                this.J.setVisibility(0);
            }
            if (this.f22436H.getVisibility() == 0) {
                s();
            }
            int f9 = v.f(this.f22228a);
            int e9 = v.e(this.f22228a);
            if (i6 <= 0 || i9 <= 0 || f9 < i6 || e9 < i9 || this.au) {
                o();
                return;
            }
            f22423A = i11;
            f22424B = i12;
            f22425C = i13 + 4;
            f22426D = i14 + 4;
            float f10 = i6 / i9;
            try {
                f2 = (float) (this.as / this.at);
            } catch (Throwable th) {
                th.getMessage();
                f2 = 0.0f;
            }
            if (i10 > 0) {
                f22433z = i10;
                if (i10 > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(v.b(getContext(), i10));
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(1, 0);
                    setBackground(gradientDrawable);
                    this.f22434F.setBackground(gradientDrawable);
                    setClipToOutline(true);
                    this.f22434F.setClipToOutline(true);
                }
            }
            if (Math.abs(f10 - f2) > 0.1f && this.aD != 1) {
                o();
                videoOperate(1);
                return;
            }
            o();
            if (!this.aC) {
                setLayoutParam(i4, i, i6, i9);
                return;
            }
            setLayoutCenter(i6, i9);
            com.anythink.expressad.video.module.a.a aVar = this.f22232e;
            if (aVar != null) {
                if (aF) {
                    aVar.a(114, "");
                } else {
                    aVar.a(116, "");
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i4) {
        soundOperate(i, i4, "2");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void videoOperate(int i) {
        if (this.f22233f) {
            if (i == 1) {
                if (getVisibility() == 0 && isfront()) {
                    RelativeLayout relativeLayout = this.af;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.ah || com.anythink.expressad.foundation.f.b.f19836c || this.ax) {
                        return;
                    }
                    k();
                    return;
                }
                return;
            }
            if (i == 2) {
                if (getVisibility() == 0) {
                    j();
                    return;
                }
                return;
            }
            if (i == 3) {
                if (this.aw) {
                    return;
                }
                this.f22434F.stop();
                d dVar = this.f22229b;
                if (dVar == null || dVar.N() == null || this.f22229b.N().b() != 5002010) {
                    this.f22434F.release();
                    this.aw = true;
                    return;
                }
                return;
            }
            if (i == 5) {
                this.ai = true;
                if (this.aw) {
                    return;
                }
                j();
                return;
            }
            if (i == 4) {
                this.ai = false;
                if (this.aw || isMiniCardShowing()) {
                    return;
                }
                k();
                return;
            }
            if (i != 6 || this.aw) {
                return;
            }
            this.f22434F.release();
            this.aw = true;
        }
    }

    private void e() {
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j() || this.f22446S == null) {
            return;
        }
        if (this.f22447T == null) {
            v();
        }
        if (this.f22446S.getVisibility() != 0) {
            this.f22446S.setVisibility(0);
            postDelayed(this.bh, m.ai);
        } else {
            this.f22446S.setVisibility(8);
            getHandler().removeCallbacks(this.bh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f22233f = h();
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.aU = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x013a, code lost:
    
        if (r5 < r0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x013c, code lost:
    
        if (r0 == 0) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g() {
        int i;
        com.anythink.expressad.video.module.a.a aVar;
        boolean z6;
        try {
            d dVar = this.f22229b;
            if (dVar != null && dVar.N() != null && this.f22229b.N().b() == 5002010 && this.bc && !(z6 = this.aP)) {
                com.anythink.expressad.video.module.a.a aVar2 = this.f22232e;
                if (aVar2 != null) {
                    this.bc = true;
                    aVar2.a(2, b(z6));
                    return;
                }
                return;
            }
            if (this.aE && ((i = this.aI) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                if (this.aL) {
                    if (i != com.anythink.expressad.foundation.g.a.cw || (aVar = this.f22232e) == null) {
                        return;
                    }
                    this.bc = true;
                    aVar.a(2, b(this.aP));
                    return;
                }
                if (i == com.anythink.expressad.foundation.g.a.cw && this.aS) {
                    com.anythink.expressad.video.module.a.a aVar3 = this.f22232e;
                    if (aVar3 != null) {
                        this.bc = true;
                        aVar3.a(2, b(this.aP));
                        return;
                    }
                    return;
                }
                if (this.aO) {
                    int curPosition = this.f22434F.getCurPosition() / 1000;
                    int bq = (int) ((curPosition / (this.f22434F.getDuration() == 0 ? this.f22229b.bq() : this.f22434F.getDuration())) * 100.0f);
                    if (this.aI == com.anythink.expressad.foundation.g.a.cv) {
                        j();
                        int i4 = this.aJ;
                        if (i4 == com.anythink.expressad.foundation.g.a.cx && bq >= this.aK) {
                            com.anythink.expressad.video.module.a.a aVar4 = this.f22232e;
                            if (aVar4 != null) {
                                this.bc = true;
                                aVar4.a(2, b(this.aP));
                                return;
                            }
                            return;
                        }
                        if (i4 == com.anythink.expressad.foundation.g.a.cy && curPosition >= this.aK) {
                            com.anythink.expressad.video.module.a.a aVar5 = this.f22232e;
                            if (aVar5 != null) {
                                this.bc = true;
                                aVar5.a(2, b(this.aP));
                                return;
                            }
                            return;
                        }
                        com.anythink.expressad.video.module.a.a aVar6 = this.f22232e;
                        if (aVar6 != null) {
                            aVar6.a(8, "");
                        }
                    }
                    if (this.aI == com.anythink.expressad.foundation.g.a.cw) {
                        int i6 = this.aJ;
                        if (i6 == com.anythink.expressad.foundation.g.a.cx && bq >= this.aK) {
                            j();
                            com.anythink.expressad.video.module.a.a aVar7 = this.f22232e;
                            if (aVar7 != null) {
                                aVar7.a(8, "");
                                return;
                            }
                            return;
                        }
                        if (i6 != com.anythink.expressad.foundation.g.a.cy || curPosition < this.aK) {
                            return;
                        }
                        j();
                        com.anythink.expressad.video.module.a.a aVar8 = this.f22232e;
                        if (aVar8 != null) {
                            aVar8.a(8, "");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            d dVar2 = this.f22229b;
            if (dVar2 == null || dVar2.e() == 2) {
                com.anythink.expressad.video.module.a.a aVar9 = this.f22232e;
                if (aVar9 != null) {
                    this.bc = true;
                    aVar9.a(2, "");
                    return;
                }
                return;
            }
            int y7 = y();
            int curPosition2 = this.f22434F.getCurPosition() / 1000;
            if (this.f22229b.k() == 5 && this.mCurrPlayNum > 1) {
                if (y7 != 0 && y7 > 0 && curPosition2 < y7) {
                    if (this.an == 1 && !this.aC) {
                        j();
                        com.anythink.expressad.video.module.a.a aVar10 = this.f22232e;
                        if (aVar10 != null) {
                            aVar10.a(8, "");
                            return;
                        }
                        return;
                    }
                }
                com.anythink.expressad.video.module.a.a aVar11 = this.f22232e;
                if (aVar11 != null) {
                    this.bc = true;
                    aVar11.a(2, "");
                    return;
                }
                return;
            }
            if (y7 > 0) {
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private boolean h() {
        try {
            this.f22434F = (PlayerView) findViewById(filterFindViewId(this.aT, "anythink_vfpv"));
            this.f22435G = (SoundImageView) findViewById(filterFindViewId(this.aT, "anythink_sound_switch"));
            this.f22436H = (TextView) findViewById(filterFindViewId(this.aT, "anythink_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.aT, "anythink_rl_playing_close"));
            this.f22437I = findViewById;
            findViewById.setVisibility(4);
            this.J = (RelativeLayout) findViewById(filterFindViewId(this.aT, "anythink_top_control"));
            this.f22438K = (ImageView) findViewById(filterFindViewId(this.aT, "anythink_videoview_bg"));
            this.f22439L = (ProgressBar) findViewById(filterFindViewId(this.aT, "anythink_video_progress_bar"));
            this.f22440M = (FeedBackButton) findViewById(filterFindViewId(this.aT, "anythink_native_endcard_feed_btn"));
            this.f22441N = (ImageView) findViewById(filterFindViewId(this.aT, "anythink_iv_link"));
            this.ad = (RelativeLayout) findViewById(filterFindViewId(this.aT, "anythink_reward_scale_webview_layout"));
            this.af = (RelativeLayout) findViewById(filterFindViewId(this.aT, "anythink_reward_header_layout"));
            if (this.ad != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.ae = collapsibleWebView;
                this.ad.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            v.a(this.f22441N, this.f22229b, this.f22228a, false);
            this.f22443P = (AnyThinkSegmentsProgressBar) findViewById(filterFindViewId(this.aT, "anythink_reward_segment_progressbar"));
            this.f22446S = (FrameLayout) findViewById(filterFindViewId(this.aT, "anythink_reward_cta_layout"));
            this.aV = (AnythinkBaitClickView) findViewById(filterFindViewId(this.aT, "anythink_animation_click_view"));
            this.f22450W = (RelativeLayout) findViewById(filterFindViewId(this.aT, "anythink_reward_moreoffer_layout"));
            this.bb = (ATAcquireRewardPopView) findViewById(filterFindViewId(this.aT, "anythink_reward_popview"));
            try {
                String aH = this.f22229b.aH();
                if (TextUtils.isEmpty(aH)) {
                    aH = com.anythink.expressad.a.ae;
                }
                if (!TextUtils.isEmpty(aH)) {
                    com.anythink.expressad.foundation.g.d.b.a(this.f22228a).a(aH, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.17
                        @Override // com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                        }

                        @Override // com.anythink.expressad.foundation.g.d.c
                        public final void a(Bitmap bitmap, String str) {
                            int b9 = v.b(AnythinkVideoView.this.f22228a, 12.0f);
                            ImageView imageView = new ImageView(AnythinkVideoView.this.f22228a);
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            imageView.setImageBitmap(bitmap);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight())), b9);
                            layoutParams.addRule(11);
                            layoutParams.addRule(12);
                            layoutParams.bottomMargin = v.b(AnythinkVideoView.this.f22228a, 5.0f);
                            layoutParams.rightMargin = v.b(AnythinkVideoView.this.f22228a, 12.0f);
                            AnythinkVideoView.this.addView(imageView, layoutParams);
                        }
                    });
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f18405a) {
                    e9.getLocalizedMessage();
                }
            }
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.aT, "anythink_tv_flag"));
            return isNotNULL(this.f22434F, this.f22435G, this.f22436H, this.f22437I);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void i() {
        d dVar = this.f22229b;
        if (dVar == null || !y.b(dVar.V())) {
            return;
        }
        String[] split = this.f22229b.V().split("x");
        if (split.length == 2) {
            if (v.b(split[0]) > 0.0d) {
                this.as = v.b(split[0]);
            }
            if (v.b(split[1]) > 0.0d) {
                this.at = v.b(split[1]);
            }
        }
        if (this.as <= 0.0d) {
            this.as = 1280.0d;
        }
        if (this.at <= 0.0d) {
            this.at = 720.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z6;
        d dVar;
        try {
            if (this.f22434F != null) {
                d dVar2 = this.f22229b;
                if (dVar2 != null && !dVar2.cC) {
                    removeCallbacks(this.bi);
                }
                PlayerView playerView = this.f22434F;
                if (!this.ai && !this.ah && !this.aj) {
                    z6 = false;
                    playerView.setIsCovered(z6);
                    this.f22434F.onPause();
                    dVar = this.f22229b;
                    if (dVar != null || dVar.M() == null || this.f22229b.ay()) {
                        return;
                    }
                    this.f22229b.az();
                    Context g9 = t.b().g();
                    d dVar3 = this.f22229b;
                    com.anythink.expressad.b.a.a(g9, dVar3, this.ar, dVar3.M().m(), false);
                    return;
                }
                z6 = true;
                playerView.setIsCovered(z6);
                this.f22434F.onPause();
                dVar = this.f22229b;
                if (dVar != null) {
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        b bVar;
        RelativeLayout relativeLayout;
        try {
            d dVar = this.f22229b;
            if (dVar == null || dVar.N() == null || this.f22229b.N().b() != 5002010 || (relativeLayout = this.af) == null || relativeLayout.getVisibility() == 0) {
                if (this.av) {
                    ATAcquireRewardPopView aTAcquireRewardPopView = this.bb;
                    if (aTAcquireRewardPopView != null && this.aj) {
                        aTAcquireRewardPopView.onResume();
                    }
                    if (this.aj) {
                        return;
                    }
                    this.f22434F.setIsCovered(false);
                    l();
                    return;
                }
                boolean playVideo = this.f22434F.playVideo();
                d dVar2 = this.f22229b;
                if (dVar2 != null && dVar2.K() != 2 && !playVideo && (bVar = this.bf) != null) {
                    bVar.onPlayError("play video failed");
                }
                this.av = true;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void l() {
        if (this.aP) {
            if (!this.aQ) {
                this.f22434F.seekToEndFrame();
            }
            this.aQ = true;
        } else {
            this.f22434F.onResume();
        }
        d dVar = this.f22229b;
        if (dVar == null || dVar.cC) {
            return;
        }
        post(this.bi);
    }

    private void m() {
        if (!this.f22233f || this.f22437I.getVisibility() == 0) {
            return;
        }
        if (!this.i || this.f22442O) {
            this.f22437I.setVisibility(0);
        }
        this.ay = true;
    }

    private void n() {
        if (this.bg || this.aB || this.az) {
            return;
        }
        this.bg = true;
        int i = this.al;
        if (i >= 0) {
            if (i == 0) {
                this.aB = true;
            } else {
                new Handler().postDelayed(new AnonymousClass18(), this.al * 1000);
            }
        }
    }

    private void o() {
        d dVar = this.f22229b;
        if (dVar == null || dVar.e() == 2) {
            return;
        }
        p();
    }

    private void p() {
        int i;
        int i4;
        float f2 = v.f(this.f22228a);
        float e9 = v.e(this.f22228a);
        double d9 = this.as;
        if (d9 > 0.0d) {
            double d10 = this.at;
            if (d10 > 0.0d && f2 > 0.0f && e9 > 0.0f) {
                double d11 = d9 / d10;
                double a9 = v.a(Double.valueOf(d11));
                double a10 = v.a(Double.valueOf(f2 / e9));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22434F.getLayoutParams();
                if (a9 > a10) {
                    double d12 = (f2 * this.at) / this.as;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d12;
                    layoutParams.gravity = 17;
                } else if (a9 < a10) {
                    layoutParams.width = (int) (e9 * d11);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    d dVar = this.f22229b;
                    if (dVar != null && dVar.j()) {
                        if (this.f22229b.N() != null) {
                            i = this.f22229b.N().b();
                            i4 = this.f22229b.N().c();
                        } else {
                            int i6 = this.f22228a.getResources().getConfiguration().orientation;
                            i = com.anythink.expressad.video.dynview.a.a.f21908t;
                            i4 = 0;
                        }
                        if (i == 102 || i == 202) {
                            if (i4 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.at / (this.as / f2));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (e9 * d11);
                            }
                        }
                        if (i == 202 && !TextUtils.isEmpty(this.f22229b.bm())) {
                            a(this.f22229b.bm());
                        }
                        if (i == 302 || i == 802 || i == 5002010) {
                            double d13 = this.as;
                            double d14 = this.at;
                            if (d13 / d14 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d14 * f2) / d13);
                            } else {
                                int b9 = v.b(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.as * b9) / this.at);
                                layoutParams.height = b9;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                this.f22434F.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        r();
    }

    private void r() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f22233f) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22434F.getLayoutParams();
            int f2 = v.f(this.f22228a);
            layoutParams.width = -1;
            layoutParams.height = (f2 * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        d dVar = this.f22229b;
        if (dVar != null) {
            dVar.l(this.ar);
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.ar, "_1"), this.f22229b);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.f22229b.l(this.ar);
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.ar, "_1"), this.f22229b);
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.ar, "_1"), this.f22440M);
        } else {
            FeedBackButton feedBackButton = this.f22440M;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    private int t() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).x();
    }

    private void u() {
        CollapsibleWebView collapsibleWebView = this.ae;
        if (collapsibleWebView == null || this.f22229b == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.ae.loadUrl(this.f22229b.af());
        this.ae.setToolBarTitle(this.f22229b.bj());
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            b9 = com.anythink.expressad.f.b.c();
        }
        this.ae.setPageLoadTimtout((int) b9.q());
        this.ae.setPageLoadListener(new CollapsibleWebView.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
            private void d() {
                if (AnythinkVideoView.this.bd) {
                    return;
                }
                AnythinkVideoView.R(AnythinkVideoView.this);
                if (AnythinkVideoView.this.ad == null || AnythinkVideoView.this.ad.getVisibility() != 0) {
                    return;
                }
                AnythinkVideoView.this.ad.setVisibility(8);
            }

            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.a
            public final void a() {
                JSONObject jSONObject;
                if (AnythinkVideoView.this.bd) {
                    return;
                }
                AnythinkVideoView.R(AnythinkVideoView.this);
                if (AnythinkVideoView.this.ad != null && AnythinkVideoView.this.ad.getVisibility() != 0) {
                    AnythinkVideoView.this.ad.setVisibility(0);
                }
                Context context = AnythinkVideoView.this.getContext();
                AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                com.anythink.expressad.b.a.a(context, anythinkVideoView.f22229b, anythinkVideoView.getUnitId(), AnythinkVideoView.this.f22229b.aj(), true, false, com.anythink.expressad.b.b.a.f18945k);
                if (AnythinkVideoView.this.ab != null) {
                    JSONObject jSONObject2 = null;
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, AnythinkVideoView.this.a(0));
                        } catch (JSONException e9) {
                            e = e9;
                            jSONObject2 = jSONObject;
                            e.printStackTrace();
                            jSONObject = jSONObject2;
                            AnythinkVideoView.this.ab.a(com.anythink.expressad.video.module.a.a.f22519V, jSONObject);
                        }
                    } catch (JSONException e10) {
                        e = e10;
                    }
                    AnythinkVideoView.this.ab.a(com.anythink.expressad.video.module.a.a.f22519V, jSONObject);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.a
            public final void b() {
            }

            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.a
            public final void c() {
                d();
            }

            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.a
            public final void a(Map<String, String> map) {
                if (map != null) {
                    map.get("url");
                    map.get("description");
                }
                d();
            }
        });
        this.ae.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.4
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            }
        });
        this.ae.setCollapseListener(new CommonWebView.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.5
            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.a
            public final void a() {
                if (AnythinkVideoView.this.af != null) {
                    AnythinkVideoView.this.af.setVisibility(0);
                }
                if (AnythinkVideoView.this.ae != null) {
                    AnythinkVideoView.this.ae.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
                }
                AnythinkVideoView.this.k();
            }
        });
        this.ae.setExpandListener(new CommonWebView.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.6
            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.a
            public final void a() {
                if (AnythinkVideoView.this.af != null) {
                    AnythinkVideoView.this.af.setVisibility(8);
                }
                if (AnythinkVideoView.this.ae != null) {
                    AnythinkVideoView.this.ae.setCustomizedToolBarMarginWidthPixel(0, AnythinkVideoView.this.be, 0, 0);
                }
                AnythinkVideoView.this.j();
            }
        });
        this.ae.setExitsClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AnythinkVideoView.this.af != null) {
                    AnythinkVideoView.this.af.setVisibility(0);
                }
                if (AnythinkVideoView.this.ad != null) {
                    AnythinkVideoView.this.ad.setVisibility(8);
                }
                if (AnythinkVideoView.this.aP) {
                    return;
                }
                AnythinkVideoView.this.k();
            }
        });
    }

    private void v() {
        if (this.f22446S == null) {
            return;
        }
        if (this.f22447T == null) {
            AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(getContext());
            this.f22447T = anythinkClickCTAView;
            anythinkClickCTAView.setCampaign(this.f22229b);
            this.f22447T.setUnitId(this.ar);
            com.anythink.expressad.video.module.a.a aVar = this.ab;
            if (aVar != null) {
                this.f22447T.setNotifyListener(new i(aVar));
            }
            this.f22447T.preLoadData(this.f22448U);
        }
        this.f22446S.addView(this.f22447T);
    }

    private void w() {
        JSONObject jSONObject;
        JSONException e9;
        if (this.ab != null) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(0));
                } catch (JSONException e10) {
                    e9 = e10;
                    e9.printStackTrace();
                    this.ab.a(105, jSONObject);
                }
            } catch (JSONException e11) {
                jSONObject = null;
                e9 = e11;
            }
            this.ab.a(105, jSONObject);
        }
    }

    private void x() {
        String e9;
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j() || this.aa) {
            return;
        }
        if (!TextUtils.isEmpty(this.f22229b.as())) {
            e9 = this.f22229b.as();
        } else if (this.f22229b.N() == null) {
            return;
        } else {
            e9 = this.f22229b.N().e();
        }
        if (TextUtils.isEmpty(e9)) {
            return;
        }
        try {
            String a9 = z.a(e9, "guideShow");
            String a10 = z.a(e9, "guideDelay");
            String a11 = z.a(e9, "guideTime");
            String a12 = z.a(e9, "guideRewardTime");
            if (!TextUtils.isEmpty(a9)) {
                this.aW = Integer.parseInt(a9);
            }
            if (!TextUtils.isEmpty(a10)) {
                int parseInt = Integer.parseInt(a10);
                this.aX = parseInt;
                if (parseInt > 10 || parseInt < 3) {
                    this.aX = 5;
                }
            }
            if (!TextUtils.isEmpty(a11)) {
                int parseInt2 = Integer.parseInt(a11);
                this.aY = parseInt2;
                if (parseInt2 > 10 || parseInt2 < 3) {
                    this.aY = 5;
                }
            }
            if (!TextUtils.isEmpty(a12)) {
                int parseInt3 = Integer.parseInt(a12);
                this.aZ = parseInt3;
                if (parseInt3 > 10 || parseInt3 < 5) {
                    this.aZ = 5;
                }
            }
            int i = this.aW;
            if (i > 0 && i <= 2) {
                int y7 = y();
                if (y7 == 0 || y7 > this.aX) {
                    int i4 = y7 - this.aX;
                    if (i4 >= 0 && this.aZ > i4) {
                        this.aZ = i4;
                    }
                    int z6 = z();
                    if (this.aZ >= z6) {
                        this.aZ = z6 - this.aX;
                    }
                    if (this.aX >= z6) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f22229b.bj());
                    com.anythink.expressad.f.b.a();
                    t.b().p();
                    com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                    this.ba = new c.a("", this.ar, this.aW, b9 != null ? b9.z() : "US").a(this.aY).b(this.aZ).a(new AnonymousClass10()).a(arrayList).a();
                    postDelayed(this.bi, 1000L);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y() {
        int i = 0;
        try {
            int z6 = z();
            d dVar = this.f22229b;
            if (dVar != null) {
                i = dVar.i();
                if (this.f22229b.k() != 5 && i > z6) {
                    i = z6;
                }
                if (i > 0) {
                    return i;
                }
            }
            return z6;
        } catch (Throwable th) {
            th.getMessage();
            return i;
        }
    }

    private int z() {
        try {
            b bVar = this.bf;
            int b9 = bVar != null ? bVar.b() : 0;
            return b9 == 0 ? this.f22229b.bq() : b9;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f22233f) {
            if (!this.i) {
                this.f22434F.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.13
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (AnythinkVideoView.this.f22232e != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, AnythinkVideoView.this.f22434F.buildH5JsonObject(0));
                            } catch (Exception e9) {
                                e9.printStackTrace();
                            }
                            AnythinkVideoView.this.f22232e.a(1, jSONObject);
                        }
                    }
                });
            } else if (com.anythink.expressad.video.dynview.i.c.a(this.f22229b) == -1 || com.anythink.expressad.video.dynview.i.c.a(this.f22229b) == 100) {
                this.f22434F.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (AnythinkVideoView.this.f22232e != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, AnythinkVideoView.this.f22434F.buildH5JsonObject(0));
                            } catch (Exception e9) {
                                e9.printStackTrace();
                            }
                            AnythinkVideoView.this.f22232e.a(1, jSONObject);
                        }
                        AnythinkVideoView.this.setCTALayoutVisibleOrGone();
                    }
                });
            }
            SoundImageView soundImageView = this.f22435G;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.14
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Integer num = 2;
                        if (AnythinkVideoView.this.f22434F != null && AnythinkVideoView.this.f22434F.isSilent()) {
                            num = 1;
                        }
                        if (num.intValue() == 1) {
                            AnythinkVideoView.this.mMuteSwitch = 2;
                        } else {
                            AnythinkVideoView.this.mMuteSwitch = 1;
                        }
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f22232e;
                        if (aVar != null) {
                            aVar.a(5, num);
                        }
                        if (AnythinkVideoView.this.ag != null) {
                            AnythinkVideoView.this.ag.a(num.intValue() == 2);
                        }
                    }
                });
            }
            this.f22437I.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!AnythinkVideoView.this.aE) {
                        d dVar = AnythinkVideoView.this.f22229b;
                        if (dVar == null || dVar.N() == null || AnythinkVideoView.this.f22229b.N().b() != 5002010 || !AnythinkVideoView.this.aP) {
                            AnythinkVideoView.this.g();
                            return;
                        }
                        AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                        if (anythinkVideoView.f22232e != null) {
                            AnythinkVideoView.i(anythinkVideoView);
                            AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                            anythinkVideoView2.f22232e.a(2, anythinkVideoView2.b(anythinkVideoView2.aP));
                            return;
                        }
                        return;
                    }
                    AnythinkVideoView.g(AnythinkVideoView.this);
                    d dVar2 = AnythinkVideoView.this.f22229b;
                    if (dVar2 != null && dVar2.N() != null && AnythinkVideoView.this.f22229b.N().b() == 5002010 && AnythinkVideoView.this.aP) {
                        AnythinkVideoView anythinkVideoView3 = AnythinkVideoView.this;
                        if (anythinkVideoView3.f22232e != null) {
                            AnythinkVideoView.i(anythinkVideoView3);
                            AnythinkVideoView anythinkVideoView4 = AnythinkVideoView.this;
                            anythinkVideoView4.f22232e.a(2, anythinkVideoView4.b(anythinkVideoView4.aP));
                            return;
                        }
                        return;
                    }
                    if (AnythinkVideoView.this.aO) {
                        AnythinkVideoView.this.g();
                        return;
                    }
                    com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f22232e;
                    if (aVar != null) {
                        aVar.a(123, "");
                    }
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i4, String str) {
        com.anythink.expressad.video.module.a.a aVar;
        SoundImageView soundImageView;
        if (this.f22233f) {
            this.aG = i;
            if (i == 1) {
                SoundImageView soundImageView2 = this.f22435G;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.f22434F.closeSound();
            } else if (i == 2) {
                SoundImageView soundImageView3 = this.f22435G;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.f22434F.openSound();
            }
            d dVar = this.f22229b;
            if (dVar != null && dVar.j()) {
                SoundImageView soundImageView4 = this.f22435G;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i4 == 1) {
                SoundImageView soundImageView5 = this.f22435G;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i4 == 2 && (soundImageView = this.f22435G) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.f22232e) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i));
    }

    private void b() {
        d dVar = this.f22229b;
        if (dVar == null || dVar.e() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.f21883S)) {
            this.tvFlag.setText("广告");
        } else {
            this.tvFlag.setText("AD");
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$10, reason: invalid class name */
    public class AnonymousClass10 implements com.anythink.expressad.widget.rewardpopview.a {
        public AnonymousClass10() {
        }

        @Override // com.anythink.expressad.widget.rewardpopview.a
        public final void a(int i) {
            AnythinkVideoView.Z(AnythinkVideoView.this);
            AnythinkVideoView.this.setCover(false);
            int y7 = AnythinkVideoView.this.y() - i;
            AnythinkVideoView.this.f22229b.d(y7);
            AnythinkVideoView.this.k();
            com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.f22232e;
            if (aVar != null) {
                aVar.a(com.anythink.expressad.video.module.a.a.f22518U, Integer.valueOf(y7));
            }
        }

        @Override // com.anythink.expressad.widget.rewardpopview.a
        public final void b() {
            if (AnythinkVideoView.this.ab != null) {
                AnythinkVideoView.this.ab.a(105, "");
            }
        }

        @Override // com.anythink.expressad.widget.rewardpopview.a
        public final void a() {
            AnythinkVideoView.Z(AnythinkVideoView.this);
            AnythinkVideoView.this.setCover(false);
            AnythinkVideoView.this.k();
        }
    }

    private void b(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v.b(getContext(), i));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.f22434F.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.f22434F.setClipToOutline(true);
        }
    }

    private void a() {
        int findLayout = findLayout(f22428u);
        if (findLayout > 0) {
            this.f22230c.inflate(findLayout, this);
            f();
        }
        aF = false;
        d dVar = this.f22229b;
        if (dVar == null || dVar.e() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.f21883S)) {
            this.tvFlag.setText("广告");
        } else {
            this.tvFlag.setText("AD");
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$1, reason: invalid class name */
    public class AnonymousClass1 implements com.anythink.expressad.video.dynview.f.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f22452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.video.dynview.c f22453b;

        public AnonymousClass1(ViewGroup viewGroup, com.anythink.expressad.video.dynview.c cVar) {
            this.f22452a = viewGroup;
            this.f22453b = cVar;
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            if (this.f22452a != null && aVar.a() != null) {
                aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f22452a.addView(aVar.a());
            }
            if (aVar.b() != null) {
                Iterator<View> it = aVar.b().iterator();
                while (it.hasNext()) {
                    it.next().setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.1.1
                        @Override // com.anythink.expressad.widget.a
                        public final void a(View view) {
                            if (AnythinkVideoView.this.f22229b.N() == null || AnythinkVideoView.this.f22229b.N().b() != 902) {
                                AnythinkVideoView.b(AnythinkVideoView.this);
                            } else {
                                AnythinkVideoView.a(AnythinkVideoView.this);
                            }
                        }
                    });
                }
            }
            AnythinkVideoView.this.aT = aVar.c();
            AnythinkVideoView.this.f();
            boolean unused = AnythinkVideoView.aF = false;
            AnythinkVideoView.this.f22449V = this.f22453b.j();
            AnythinkVideoView.this.ac = this.f22453b.l();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            bVar.b();
        }
    }

    private boolean b(int i, int i4) {
        return i > 0 && i4 > 0 && v.f(this.f22228a) >= i && v.e(this.f22228a) >= i4;
    }

    private void a(ViewGroup viewGroup, d dVar) {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(viewGroup, dVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass1(viewGroup, a9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z6) {
        if (!this.aE) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.aL) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cz);
            }
            if (this.aN) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cB);
            }
            if (this.aM) {
                jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cA);
            }
            jSONObject.put("complete_info", z6 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(int i, int i4) {
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

    private int a(d dVar) {
        if (dVar != null) {
            if (dVar.aq() != -1) {
                return dVar.aq();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.ar, false).v();
    }

    public static /* synthetic */ void b(AnythinkVideoView anythinkVideoView) {
        JSONObject jSONObject;
        JSONException e9;
        if (anythinkVideoView.ab != null) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anythinkVideoView.a(0));
                } catch (JSONException e10) {
                    e9 = e10;
                    e9.printStackTrace();
                    anythinkVideoView.ab.a(105, jSONObject);
                }
            } catch (JSONException e11) {
                jSONObject = null;
                e9 = e11;
            }
            anythinkVideoView.ab.a(105, jSONObject);
        }
    }

    public static /* synthetic */ void a(AnythinkVideoView anythinkVideoView) {
        d dVar = anythinkVideoView.f22229b;
        if (dVar == null || !dVar.j() || anythinkVideoView.f22446S == null) {
            return;
        }
        if (anythinkVideoView.f22447T == null) {
            anythinkVideoView.v();
        }
        if (anythinkVideoView.f22446S.getVisibility() != 0) {
            anythinkVideoView.f22446S.setVisibility(0);
            anythinkVideoView.postDelayed(anythinkVideoView.bh, m.ai);
        } else {
            anythinkVideoView.f22446S.setVisibility(8);
            anythinkVideoView.getHandler().removeCallbacks(anythinkVideoView.bh);
        }
    }

    public AnythinkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMuteSwitch = 0;
        this.f22445R = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.aa = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ar = "";
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aE = false;
        this.aG = 2;
        this.aL = false;
        this.aM = false;
        this.aN = false;
        this.aO = true;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        this.aS = false;
        this.aT = false;
        this.aW = 0;
        this.aX = 5;
        this.aY = 5;
        this.aZ = 5;
        this.bc = false;
        this.bd = false;
        this.be = 0;
        this.bf = new b(this);
        this.bg = false;
        this.bh = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.8
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.f22446S != null) {
                    AnythinkVideoView.this.f22446S.setVisibility(8);
                }
            }
        };
        this.bi = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.11
            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.aX <= 0) {
                    AnythinkVideoView.this.showRewardPopView();
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.removeCallbacks(anythinkVideoView.bi);
                } else {
                    AnythinkVideoView.ad(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                    anythinkVideoView2.postDelayed(anythinkVideoView2.bi, 1000L);
                }
            }
        };
    }
}

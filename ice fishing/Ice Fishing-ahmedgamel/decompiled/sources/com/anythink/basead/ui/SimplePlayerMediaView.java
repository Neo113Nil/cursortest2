package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.a;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.component.a;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.q;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class SimplePlayerMediaView extends FrameLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.basead.ui.component.a f11094a;

    /* renamed from: b, reason: collision with root package name */
    protected WebProgressBarView f11095b;

    /* renamed from: c, reason: collision with root package name */
    long f11096c;

    /* renamed from: d, reason: collision with root package name */
    a.InterfaceC0050a f11097d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.v.a.c f11098e;

    /* renamed from: f, reason: collision with root package name */
    f.b f11099f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f11100g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f11101h;
    ImageView i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f11102j;

    /* renamed from: k, reason: collision with root package name */
    View f11103k;

    /* renamed from: l, reason: collision with root package name */
    View.OnClickListener f11104l;

    /* renamed from: m, reason: collision with root package name */
    boolean f11105m;

    /* renamed from: n, reason: collision with root package name */
    String f11106n;

    /* renamed from: o, reason: collision with root package name */
    boolean f11107o;

    /* renamed from: p, reason: collision with root package name */
    boolean f11108p;

    /* renamed from: q, reason: collision with root package name */
    int f11109q;

    /* renamed from: r, reason: collision with root package name */
    int f11110r;

    /* renamed from: s, reason: collision with root package name */
    private MuteImageView f11111s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f11112t;

    /* renamed from: u, reason: collision with root package name */
    private final String f11113u;

    /* renamed from: v, reason: collision with root package name */
    private final String f11114v;

    /* renamed from: w, reason: collision with root package name */
    private final String f11115w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11116x;

    /* renamed from: y, reason: collision with root package name */
    private e f11117y;

    public SimplePlayerMediaView(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.a
    public void destroyPlayerView(int i) {
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            aVar.f(i);
        }
    }

    @Override // com.anythink.basead.ui.a
    public long getVideoCurrentPosition() {
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            return aVar.i();
        }
        return 0L;
    }

    @Override // com.anythink.basead.ui.a
    public void initPlayerView(final w wVar, final x xVar, a.InterfaceC0056a interfaceC0056a, e eVar) {
        a();
        if (wVar != null && wVar.r() != null) {
            this.f11110r = wVar.r().bO();
        }
        this.f11099f = new f.b(this.f11110r);
        this.f11117y = eVar;
        this.f11095b = (WebProgressBarView) findViewById(q.a(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.f11100g = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_resume_img_id", "id"));
        this.i = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.f11102j = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        ImageView imageView = this.f11100g;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    simplePlayerMediaView.f11105m = false;
                    simplePlayerMediaView.f11100g.setVisibility(8);
                    com.anythink.basead.ui.component.a aVar = SimplePlayerMediaView.this.f11094a;
                    if (aVar != null) {
                        aVar.d();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_replay_img_id", "id"));
        this.f11101h = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.anythink.basead.ui.component.a aVar = SimplePlayerMediaView.this.f11094a;
                    if (aVar != null) {
                        aVar.n();
                        SimplePlayerMediaView.this.f11101h.setVisibility(8);
                    }
                }
            });
        }
        this.f11109q = xVar.f14954o.ab() <= 0 ? 100 : xVar.f14954o.ab();
        this.f11103k = findViewById(q.a(getContext(), "myoffer_player_view_fail_id", "id"));
        com.anythink.basead.ui.component.a aVar = new com.anythink.basead.ui.component.a(this, xVar, wVar);
        this.f11094a = aVar;
        aVar.o();
        this.f11094a.a(interfaceC0056a);
        this.f11094a.a(new BasePlayerView.a() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.3
            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(int i) {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void c() {
                WebProgressBarView webProgressBarView;
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.f11096c > 0 && (webProgressBarView = simplePlayerMediaView.f11095b) != null) {
                    if (webProgressBarView.getVisibility() != 0) {
                        SimplePlayerMediaView.this.f11095b.setVisibility(0);
                    }
                    SimplePlayerMediaView.this.f11095b.setProgress(100);
                }
                a.InterfaceC0050a interfaceC0050a = SimplePlayerMediaView.this.f11097d;
                if (interfaceC0050a != null) {
                    interfaceC0050a.onVideoAdComplete();
                }
                ImageView imageView3 = SimplePlayerMediaView.this.f11101h;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void d() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void e() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void f() {
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a() {
                ImageView imageView3 = SimplePlayerMediaView.this.i;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                ImageView imageView4 = SimplePlayerMediaView.this.f11102j;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                a.InterfaceC0050a interfaceC0050a = simplePlayerMediaView.f11097d;
                if (interfaceC0050a != null) {
                    interfaceC0050a.onVideoAdStartPlay(simplePlayerMediaView.f11096c);
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(int i) {
                SimplePlayerMediaView simplePlayerMediaView;
                View.OnClickListener onClickListener;
                com.anythink.basead.ui.component.a aVar2;
                if ((SimplePlayerMediaView.this.f11116x || xVar.f14954o.J() == 0) && (onClickListener = (simplePlayerMediaView = SimplePlayerMediaView.this).f11104l) != null) {
                    onClickListener.onClick(simplePlayerMediaView);
                } else {
                    if (!String.valueOf(xVar.f14949j).equals("0") || (aVar2 = SimplePlayerMediaView.this.f11094a) == null || aVar2.k() || !SimplePlayerMediaView.this.f11094a.j()) {
                        return;
                    }
                    SimplePlayerMediaView.this.b();
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(long j6) {
                com.anythink.basead.ui.component.a aVar2;
                WebProgressBarView webProgressBarView;
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.f11096c > 0 && (webProgressBarView = simplePlayerMediaView.f11095b) != null) {
                    if (webProgressBarView.getVisibility() != 0) {
                        SimplePlayerMediaView.this.f11095b.setVisibility(0);
                    }
                    SimplePlayerMediaView.this.f11095b.setProgress((int) ((j6 * 100.0d) / r0.f11096c));
                }
                SimplePlayerMediaView simplePlayerMediaView2 = SimplePlayerMediaView.this;
                a.InterfaceC0050a interfaceC0050a = simplePlayerMediaView2.f11097d;
                if (interfaceC0050a != null) {
                    interfaceC0050a.onProgressUpdate(j6, simplePlayerMediaView2.f11096c);
                }
                ImageView imageView3 = SimplePlayerMediaView.this.f11101h;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                View view = SimplePlayerMediaView.this.f11103k;
                if (view != null) {
                    view.setVisibility(8);
                }
                SimplePlayerMediaView simplePlayerMediaView3 = SimplePlayerMediaView.this;
                if (simplePlayerMediaView3.f11105m || (aVar2 = simplePlayerMediaView3.f11094a) == null || simplePlayerMediaView3.f11099f.a(simplePlayerMediaView3, aVar2.l(), 50, 0)) {
                    return;
                }
                SimplePlayerMediaView.this.f11094a.d(2);
                SimplePlayerMediaView.this.c();
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(long j6) {
                WebProgressBarView webProgressBarView;
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                simplePlayerMediaView.f11096c = j6;
                if (j6 <= 0 || (webProgressBarView = simplePlayerMediaView.f11095b) == null) {
                    return;
                }
                webProgressBarView.setVisibility(0);
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(com.anythink.basead.d.f fVar) {
                a.InterfaceC0050a interfaceC0050a = SimplePlayerMediaView.this.f11097d;
                if (interfaceC0050a != null) {
                    interfaceC0050a.onVideoError(fVar.a(), fVar.b());
                }
                SimplePlayerMediaView.this.f11105m = true;
                com.anythink.core.common.u.e.a(xVar, wVar, 2, fVar.c());
                if (SimplePlayerMediaView.this.f11094a.i() > 0) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    if (simplePlayerMediaView.f11101h != null) {
                        WebProgressBarView webProgressBarView = simplePlayerMediaView.f11095b;
                        if (webProgressBarView != null) {
                            webProgressBarView.setVisibility(8);
                        }
                        SimplePlayerMediaView.this.f11101h.setVisibility(0);
                        return;
                    }
                }
                View view = SimplePlayerMediaView.this.f11103k;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        });
        if (!TextUtils.isEmpty(wVar.B()) && this.i != null) {
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, wVar.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.4
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, wVar.B())) {
                        ImageView imageView3 = SimplePlayerMediaView.this.f11102j;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        SimplePlayerMediaView.this.i.setImageBitmap(bitmap);
                    }
                }
            });
        }
        setAutoPlay(this.f11106n);
        MuteImageView muteImageView = (MuteImageView) findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f11111s = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(this.f11107o);
            this.f11111s.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    if (simplePlayerMediaView.f11094a == null || simplePlayerMediaView.f11111s == null) {
                        return;
                    }
                    if (SimplePlayerMediaView.this.f11094a.f()) {
                        SimplePlayerMediaView.this.f11111s.setMute(false);
                        SimplePlayerMediaView.this.f11094a.c(false);
                    } else {
                        SimplePlayerMediaView.this.f11111s.setMute(true);
                        SimplePlayerMediaView.this.f11094a.c(true);
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null && !this.f11108p) {
            this.f11108p = true;
            aVar.a(this.f11107o, (List<Bitmap>) null, this.f11117y);
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.anythink.core.common.v.a.c cVar = this.f11098e;
        if (cVar != null) {
            cVar.b();
            this.f11098e = null;
        }
        this.f11112t.set(false);
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            aVar.d(4);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void pauseVideo() {
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            aVar.d(3);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void resumeVideo() {
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            if (this.f11105m || !this.f11099f.a(this, aVar.l(), 50, 0)) {
                c();
            } else {
                this.f11094a.d();
            }
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setATImproveClickViewController(com.anythink.basead.ui.improveclick.a aVar) {
        com.anythink.basead.ui.component.a aVar2 = this.f11094a;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setAutoPlay(String str) {
        boolean z6;
        z6 = true;
        this.f11106n = str;
        str.getClass();
        switch (str) {
            case "1":
                break;
            case "2":
                z6 = q.d(getContext());
                break;
            case "3":
            default:
                z6 = false;
                break;
        }
        if (z6) {
            return;
        }
        b();
    }

    @Override // com.anythink.basead.ui.a
    public void setIsMuted(boolean z6) {
        this.f11107o = z6;
        MuteImageView muteImageView = this.f11111s;
        if (muteImageView != null) {
            muteImageView.setMute(z6);
        }
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null) {
            aVar.c(z6);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setPlayerOnClickListener(View.OnClickListener onClickListener) {
        this.f11104l = onClickListener;
    }

    @Override // com.anythink.basead.ui.a
    public void setVideoListener(a.InterfaceC0050a interfaceC0050a) {
        this.f11097d = interfaceC0050a;
    }

    public void setmIsPureMode(boolean z6) {
        this.f11116x = z6;
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f11105m = true;
        com.anythink.basead.ui.component.a aVar = this.f11094a;
        if (aVar != null && aVar.j()) {
            this.f11094a.d(1);
        }
        ImageView imageView = this.f11100g;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f11098e == null) {
            int i = this.f11110r;
            getContext();
            this.f11098e = new com.anythink.core.common.v.a.c(i, this.f11109q);
        }
        if (this.f11105m || this.f11112t.get()) {
            return;
        }
        this.f11112t.set(true);
        this.f11098e.a(this, new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.6
            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final int getImpressionMinPercentageViewed() {
                return 50;
            }

            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final void recordImpression(View view) {
                com.anythink.basead.ui.component.a aVar;
                SimplePlayerMediaView.this.f11112t.set(false);
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.f11105m || (aVar = simplePlayerMediaView.f11094a) == null) {
                    return;
                }
                aVar.d();
            }
        });
    }

    private void d() {
        com.anythink.core.common.v.a.c cVar = this.f11098e;
        if (cVar != null) {
            cVar.b();
            this.f11098e = null;
        }
        this.f11112t.set(false);
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_simple_player_media_ad_view", "layout"), this);
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11105m = false;
        this.f11112t = new AtomicBoolean(false);
        this.f11113u = "1";
        this.f11114v = "2";
        this.f11115w = "3";
        this.f11106n = "1";
        this.f11107o = true;
        this.f11108p = false;
        this.f11109q = 0;
        this.f11116x = false;
        this.f11110r = 1;
    }
}

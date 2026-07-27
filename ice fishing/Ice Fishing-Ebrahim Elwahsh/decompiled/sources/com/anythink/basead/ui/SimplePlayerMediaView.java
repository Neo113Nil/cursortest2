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
    protected com.anythink.basead.ui.component.a f10465a;

    /* renamed from: b, reason: collision with root package name */
    protected WebProgressBarView f10466b;

    /* renamed from: c, reason: collision with root package name */
    long f10467c;

    /* renamed from: d, reason: collision with root package name */
    a.InterfaceC0049a f10468d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.v.a.c f10469e;

    /* renamed from: f, reason: collision with root package name */
    f.b f10470f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f10471g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f10472h;
    ImageView i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f10473j;

    /* renamed from: k, reason: collision with root package name */
    View f10474k;

    /* renamed from: l, reason: collision with root package name */
    View.OnClickListener f10475l;

    /* renamed from: m, reason: collision with root package name */
    boolean f10476m;

    /* renamed from: n, reason: collision with root package name */
    String f10477n;

    /* renamed from: o, reason: collision with root package name */
    boolean f10478o;

    /* renamed from: p, reason: collision with root package name */
    boolean f10479p;

    /* renamed from: q, reason: collision with root package name */
    int f10480q;

    /* renamed from: r, reason: collision with root package name */
    int f10481r;

    /* renamed from: s, reason: collision with root package name */
    private MuteImageView f10482s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f10483t;

    /* renamed from: u, reason: collision with root package name */
    private final String f10484u;

    /* renamed from: v, reason: collision with root package name */
    private final String f10485v;

    /* renamed from: w, reason: collision with root package name */
    private final String f10486w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10487x;

    /* renamed from: y, reason: collision with root package name */
    private e f10488y;

    public SimplePlayerMediaView(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.a
    public void destroyPlayerView(int i) {
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            aVar.f(i);
        }
    }

    @Override // com.anythink.basead.ui.a
    public long getVideoCurrentPosition() {
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            return aVar.i();
        }
        return 0L;
    }

    @Override // com.anythink.basead.ui.a
    public void initPlayerView(final w wVar, final x xVar, a.InterfaceC0055a interfaceC0055a, e eVar) {
        a();
        if (wVar != null && wVar.r() != null) {
            this.f10481r = wVar.r().bO();
        }
        this.f10470f = new f.b(this.f10481r);
        this.f10488y = eVar;
        this.f10466b = (WebProgressBarView) findViewById(q.a(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.f10471g = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_resume_img_id", "id"));
        this.i = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.f10473j = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        ImageView imageView = this.f10471g;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    simplePlayerMediaView.f10476m = false;
                    simplePlayerMediaView.f10471g.setVisibility(8);
                    com.anythink.basead.ui.component.a aVar = SimplePlayerMediaView.this.f10465a;
                    if (aVar != null) {
                        aVar.d();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(q.a(getContext(), "myoffer_player_view_replay_img_id", "id"));
        this.f10472h = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.anythink.basead.ui.component.a aVar = SimplePlayerMediaView.this.f10465a;
                    if (aVar != null) {
                        aVar.n();
                        SimplePlayerMediaView.this.f10472h.setVisibility(8);
                    }
                }
            });
        }
        this.f10480q = xVar.f14325o.ab() <= 0 ? 100 : xVar.f14325o.ab();
        this.f10474k = findViewById(q.a(getContext(), "myoffer_player_view_fail_id", "id"));
        com.anythink.basead.ui.component.a aVar = new com.anythink.basead.ui.component.a(this, xVar, wVar);
        this.f10465a = aVar;
        aVar.o();
        this.f10465a.a(interfaceC0055a);
        this.f10465a.a(new BasePlayerView.a() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.3
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
                if (simplePlayerMediaView.f10467c > 0 && (webProgressBarView = simplePlayerMediaView.f10466b) != null) {
                    if (webProgressBarView.getVisibility() != 0) {
                        SimplePlayerMediaView.this.f10466b.setVisibility(0);
                    }
                    SimplePlayerMediaView.this.f10466b.setProgress(100);
                }
                a.InterfaceC0049a interfaceC0049a = SimplePlayerMediaView.this.f10468d;
                if (interfaceC0049a != null) {
                    interfaceC0049a.onVideoAdComplete();
                }
                ImageView imageView3 = SimplePlayerMediaView.this.f10472h;
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
                ImageView imageView4 = SimplePlayerMediaView.this.f10473j;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                a.InterfaceC0049a interfaceC0049a = simplePlayerMediaView.f10468d;
                if (interfaceC0049a != null) {
                    interfaceC0049a.onVideoAdStartPlay(simplePlayerMediaView.f10467c);
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(int i) {
                SimplePlayerMediaView simplePlayerMediaView;
                View.OnClickListener onClickListener;
                com.anythink.basead.ui.component.a aVar2;
                if ((SimplePlayerMediaView.this.f10487x || xVar.f14325o.J() == 0) && (onClickListener = (simplePlayerMediaView = SimplePlayerMediaView.this).f10475l) != null) {
                    onClickListener.onClick(simplePlayerMediaView);
                } else {
                    if (!String.valueOf(xVar.f14320j).equals("0") || (aVar2 = SimplePlayerMediaView.this.f10465a) == null || aVar2.k() || !SimplePlayerMediaView.this.f10465a.j()) {
                        return;
                    }
                    SimplePlayerMediaView.this.b();
                }
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(long j9) {
                com.anythink.basead.ui.component.a aVar2;
                WebProgressBarView webProgressBarView;
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.f10467c > 0 && (webProgressBarView = simplePlayerMediaView.f10466b) != null) {
                    if (webProgressBarView.getVisibility() != 0) {
                        SimplePlayerMediaView.this.f10466b.setVisibility(0);
                    }
                    SimplePlayerMediaView.this.f10466b.setProgress((int) ((j9 * 100.0d) / r0.f10467c));
                }
                SimplePlayerMediaView simplePlayerMediaView2 = SimplePlayerMediaView.this;
                a.InterfaceC0049a interfaceC0049a = simplePlayerMediaView2.f10468d;
                if (interfaceC0049a != null) {
                    interfaceC0049a.onProgressUpdate(j9, simplePlayerMediaView2.f10467c);
                }
                ImageView imageView3 = SimplePlayerMediaView.this.f10472h;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                View view = SimplePlayerMediaView.this.f10474k;
                if (view != null) {
                    view.setVisibility(8);
                }
                SimplePlayerMediaView simplePlayerMediaView3 = SimplePlayerMediaView.this;
                if (simplePlayerMediaView3.f10476m || (aVar2 = simplePlayerMediaView3.f10465a) == null || simplePlayerMediaView3.f10470f.a(simplePlayerMediaView3, aVar2.l(), 50, 0)) {
                    return;
                }
                SimplePlayerMediaView.this.f10465a.d(2);
                SimplePlayerMediaView.this.c();
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void b(long j9) {
                WebProgressBarView webProgressBarView;
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                simplePlayerMediaView.f10467c = j9;
                if (j9 <= 0 || (webProgressBarView = simplePlayerMediaView.f10466b) == null) {
                    return;
                }
                webProgressBarView.setVisibility(0);
            }

            @Override // com.anythink.basead.ui.animplayerview.BasePlayerView.a
            public final void a(com.anythink.basead.d.f fVar) {
                a.InterfaceC0049a interfaceC0049a = SimplePlayerMediaView.this.f10468d;
                if (interfaceC0049a != null) {
                    interfaceC0049a.onVideoError(fVar.a(), fVar.b());
                }
                SimplePlayerMediaView.this.f10476m = true;
                com.anythink.core.common.u.e.a(xVar, wVar, 2, fVar.c());
                if (SimplePlayerMediaView.this.f10465a.i() > 0) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    if (simplePlayerMediaView.f10472h != null) {
                        WebProgressBarView webProgressBarView = simplePlayerMediaView.f10466b;
                        if (webProgressBarView != null) {
                            webProgressBarView.setVisibility(8);
                        }
                        SimplePlayerMediaView.this.f10472h.setVisibility(0);
                        return;
                    }
                }
                View view = SimplePlayerMediaView.this.f10474k;
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
                        ImageView imageView3 = SimplePlayerMediaView.this.f10473j;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        SimplePlayerMediaView.this.i.setImageBitmap(bitmap);
                    }
                }
            });
        }
        setAutoPlay(this.f10477n);
        MuteImageView muteImageView = (MuteImageView) findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f10482s = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(this.f10478o);
            this.f10482s.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                    if (simplePlayerMediaView.f10465a == null || simplePlayerMediaView.f10482s == null) {
                        return;
                    }
                    if (SimplePlayerMediaView.this.f10465a.f()) {
                        SimplePlayerMediaView.this.f10482s.setMute(false);
                        SimplePlayerMediaView.this.f10465a.c(false);
                    } else {
                        SimplePlayerMediaView.this.f10482s.setMute(true);
                        SimplePlayerMediaView.this.f10465a.c(true);
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null && !this.f10479p) {
            this.f10479p = true;
            aVar.a(this.f10478o, (List<Bitmap>) null, this.f10488y);
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.anythink.core.common.v.a.c cVar = this.f10469e;
        if (cVar != null) {
            cVar.b();
            this.f10469e = null;
        }
        this.f10483t.set(false);
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            aVar.d(4);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void pauseVideo() {
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            aVar.d(3);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void resumeVideo() {
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            if (this.f10476m || !this.f10470f.a(this, aVar.l(), 50, 0)) {
                c();
            } else {
                this.f10465a.d();
            }
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setATImproveClickViewController(com.anythink.basead.ui.improveclick.a aVar) {
        com.anythink.basead.ui.component.a aVar2 = this.f10465a;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setAutoPlay(String str) {
        boolean z8;
        z8 = true;
        this.f10477n = str;
        str.getClass();
        switch (str) {
            case "1":
                break;
            case "2":
                z8 = q.d(getContext());
                break;
            case "3":
            default:
                z8 = false;
                break;
        }
        if (z8) {
            return;
        }
        b();
    }

    @Override // com.anythink.basead.ui.a
    public void setIsMuted(boolean z8) {
        this.f10478o = z8;
        MuteImageView muteImageView = this.f10482s;
        if (muteImageView != null) {
            muteImageView.setMute(z8);
        }
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null) {
            aVar.c(z8);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setPlayerOnClickListener(View.OnClickListener onClickListener) {
        this.f10475l = onClickListener;
    }

    @Override // com.anythink.basead.ui.a
    public void setVideoListener(a.InterfaceC0049a interfaceC0049a) {
        this.f10468d = interfaceC0049a;
    }

    public void setmIsPureMode(boolean z8) {
        this.f10487x = z8;
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f10476m = true;
        com.anythink.basead.ui.component.a aVar = this.f10465a;
        if (aVar != null && aVar.j()) {
            this.f10465a.d(1);
        }
        ImageView imageView = this.f10471g;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f10469e == null) {
            int i = this.f10481r;
            getContext();
            this.f10469e = new com.anythink.core.common.v.a.c(i, this.f10480q);
        }
        if (this.f10476m || this.f10483t.get()) {
            return;
        }
        this.f10483t.set(true);
        this.f10469e.a(this, new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.ui.SimplePlayerMediaView.6
            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final int getImpressionMinPercentageViewed() {
                return 50;
            }

            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final void recordImpression(View view) {
                com.anythink.basead.ui.component.a aVar;
                SimplePlayerMediaView.this.f10483t.set(false);
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.f10476m || (aVar = simplePlayerMediaView.f10465a) == null) {
                    return;
                }
                aVar.d();
            }
        });
    }

    private void d() {
        com.anythink.core.common.v.a.c cVar = this.f10469e;
        if (cVar != null) {
            cVar.b();
            this.f10469e = null;
        }
        this.f10483t.set(false);
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_simple_player_media_ad_view", "layout"), this);
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10476m = false;
        this.f10483t = new AtomicBoolean(false);
        this.f10484u = "1";
        this.f10485v = "2";
        this.f10486w = "3";
        this.f10477n = "1";
        this.f10478o = true;
        this.f10479p = false;
        this.f10480q = 0;
        this.f10487x = false;
        this.f10481r = 1;
    }
}

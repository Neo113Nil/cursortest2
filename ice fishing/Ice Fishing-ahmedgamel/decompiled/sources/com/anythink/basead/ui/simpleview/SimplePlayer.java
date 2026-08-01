package com.anythink.basead.ui.simpleview;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.b.f;
import com.anythink.basead.exoplayer.ad;
import com.anythink.basead.exoplayer.d;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i;
import com.anythink.basead.exoplayer.i.c;
import com.anythink.basead.exoplayer.j.q;
import com.anythink.basead.exoplayer.l.g;
import com.anythink.basead.exoplayer.w;
import java.io.File;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class SimplePlayer extends RelativeLayout {
    public static final String TAG = "SimplePlayer";

    /* renamed from: a, reason: collision with root package name */
    w.a f11273a;

    /* renamed from: b, reason: collision with root package name */
    g f11274b;

    /* renamed from: c, reason: collision with root package name */
    boolean f11275c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11276d;

    /* renamed from: e, reason: collision with root package name */
    private ad f11277e;

    /* renamed from: f, reason: collision with root package name */
    private s f11278f;

    /* renamed from: g, reason: collision with root package name */
    private TextureView f11279g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11280h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f11281j;

    /* renamed from: k, reason: collision with root package name */
    private final long f11282k;

    /* renamed from: l, reason: collision with root package name */
    private a f11283l;

    /* renamed from: com.anythink.basead.ui.simpleview.SimplePlayer$2, reason: invalid class name */
    public class AnonymousClass2 extends w.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            String str;
            super.onPlayerError(gVar);
            boolean z3 = false;
            if (gVar != null) {
                int i = gVar.f7269d;
                if (i != 0) {
                    str = i != 1 ? i != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException.";
                } else {
                    str = "Play error, because have a SourceException.";
                    z3 = true;
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    AbstractC5049e.c(str, ",eception:").append(gVar.getCause().getMessage());
                }
            }
            if (SimplePlayer.this.f11280h && z3) {
                SimplePlayer.c(SimplePlayer.this);
                SimplePlayer.d(SimplePlayer.this);
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z3, int i) {
            super.onPlayerStateChanged(z3, i);
            String str = SimplePlayer.TAG;
            if (i != 3) {
                return;
            }
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.f11276d = true;
            if (simplePlayer.f11283l != null) {
                SimplePlayer.this.f11283l.a();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.simpleview.SimplePlayer$3, reason: invalid class name */
    public class AnonymousClass3 implements g {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a(int i, int i6) {
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.autoFitVideoSize(i, i6, simplePlayer.f11279g);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public SimplePlayer(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean c(SimplePlayer simplePlayer) {
        simplePlayer.f11280h = false;
        return false;
    }

    private void d() {
        this.f11277e.a(this.f11278f);
    }

    private void g() {
        ad adVar = this.f11277e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f11277e.m();
            }
            w.a aVar = this.f11273a;
            if (aVar != null) {
                this.f11277e.b(aVar);
            }
            g gVar = this.f11274b;
            if (gVar != null) {
                this.f11277e.b(gVar);
            }
            this.f11277e.n();
            this.f11277e = null;
        }
        this.f11283l = null;
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

    public void load(String str, boolean z3) {
        this.f11281j = str;
        f.a();
        this.i = f.a(3, str);
        this.f11276d = false;
        if (!new File(this.i).exists() && TextUtils.isEmpty(this.f11281j)) {
            e();
            return;
        }
        if (this.f11277e == null) {
            this.f11277e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f11273a = anonymousClass2;
            this.f11277e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f11274b = anonymousClass3;
            this.f11277e.a(anonymousClass3);
            this.f11277e.a(1.0f);
            this.f11277e.a(z3);
            a(new File(this.i).exists() ? this.i : this.f11281j, false);
        }
        postDelayed(new Runnable() { // from class: com.anythink.basead.ui.simpleview.SimplePlayer.1
            @Override // java.lang.Runnable
            public final void run() {
                SimplePlayer simplePlayer = SimplePlayer.this;
                if (simplePlayer.f11276d) {
                    return;
                }
                simplePlayer.e();
            }
        }, com.anythink.basead.exoplayer.f.f7187a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad adVar = this.f11277e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f11277e.m();
            }
            w.a aVar = this.f11273a;
            if (aVar != null) {
                this.f11277e.b(aVar);
            }
            g gVar = this.f11274b;
            if (gVar != null) {
                this.f11277e.b(gVar);
            }
            this.f11277e.n();
            this.f11277e = null;
        }
        this.f11283l = null;
    }

    public void setSimplePlayerViewListener(a aVar) {
        this.f11283l = aVar;
    }

    public void stopVideo() {
        ad adVar = this.f11277e;
        if (adVar == null || !adVar.J()) {
            return;
        }
        this.f11277e.m();
    }

    public SimplePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.f11280h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f11279g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11279g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11279g, layoutParams);
        }
    }

    private void b() {
        if (this.f11279g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11279g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11279g, layoutParams);
        }
    }

    private String c() {
        return new File(this.i).exists() ? this.i : this.f11281j;
    }

    public static /* synthetic */ void d(SimplePlayer simplePlayer) {
        simplePlayer.f11277e.a(simplePlayer.f11278f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a aVar = this.f11283l;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean f() {
        return !new File(this.i).exists() && TextUtils.isEmpty(this.f11281j);
    }

    public SimplePlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "";
        this.f11281j = "";
        this.f11282k = com.anythink.basead.exoplayer.f.f7187a;
        this.f11280h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f11279g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11279g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11279g, layoutParams);
        }
    }

    private void a(boolean z3) {
        String str;
        if (this.f11277e == null) {
            this.f11277e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f11273a = anonymousClass2;
            this.f11277e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f11274b = anonymousClass3;
            this.f11277e.a(anonymousClass3);
            this.f11277e.a(1.0f);
            this.f11277e.a(z3);
            if (new File(this.i).exists()) {
                str = this.i;
            } else {
                str = this.f11281j;
            }
            a(str, false);
        }
    }

    private void a(String str, boolean z3) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f11277e == null) {
                    e();
                    return;
                }
                this.f11280h = TextUtils.equals(str, this.i);
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f11278f = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.f11275c = true;
                } else {
                    this.f11278f = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.f11275c = false;
                }
                this.f11277e.a(this.f11279g);
                this.f11277e.a(this.f11278f);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (!TextUtils.equals(str, this.f11281j) && !z3) {
                    str = this.f11281j;
                    z3 = true;
                } else {
                    th.getMessage();
                    e();
                }
            }
        }
        th.getMessage();
        e();
    }
}

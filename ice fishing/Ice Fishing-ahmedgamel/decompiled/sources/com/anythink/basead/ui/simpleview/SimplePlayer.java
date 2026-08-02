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
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class SimplePlayer extends RelativeLayout {
    public static final String TAG = "SimplePlayer";

    /* renamed from: a, reason: collision with root package name */
    w.a f12059a;

    /* renamed from: b, reason: collision with root package name */
    g f12060b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12061c;

    /* renamed from: d, reason: collision with root package name */
    boolean f12062d;

    /* renamed from: e, reason: collision with root package name */
    private ad f12063e;

    /* renamed from: f, reason: collision with root package name */
    private s f12064f;

    /* renamed from: g, reason: collision with root package name */
    private TextureView f12065g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12066h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f12067j;

    /* renamed from: k, reason: collision with root package name */
    private final long f12068k;

    /* renamed from: l, reason: collision with root package name */
    private a f12069l;

    /* renamed from: com.anythink.basead.ui.simpleview.SimplePlayer$2, reason: invalid class name */
    public class AnonymousClass2 extends w.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            String str;
            super.onPlayerError(gVar);
            boolean z6 = false;
            if (gVar != null) {
                int i = gVar.f8055d;
                if (i != 0) {
                    str = i != 1 ? i != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException.";
                } else {
                    str = "Play error, because have a SourceException.";
                    z6 = true;
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    AbstractC5050e.c(str, ",eception:").append(gVar.getCause().getMessage());
                }
            }
            if (SimplePlayer.this.f12066h && z6) {
                SimplePlayer.c(SimplePlayer.this);
                SimplePlayer.d(SimplePlayer.this);
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z6, int i) {
            super.onPlayerStateChanged(z6, i);
            String str = SimplePlayer.TAG;
            if (i != 3) {
                return;
            }
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.f12062d = true;
            if (simplePlayer.f12069l != null) {
                SimplePlayer.this.f12069l.a();
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
        public final void a(int i, int i4) {
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.autoFitVideoSize(i, i4, simplePlayer.f12065g);
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
        simplePlayer.f12066h = false;
        return false;
    }

    private void d() {
        this.f12063e.a(this.f12064f);
    }

    private void g() {
        ad adVar = this.f12063e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f12063e.m();
            }
            w.a aVar = this.f12059a;
            if (aVar != null) {
                this.f12063e.b(aVar);
            }
            g gVar = this.f12060b;
            if (gVar != null) {
                this.f12063e.b(gVar);
            }
            this.f12063e.n();
            this.f12063e = null;
        }
        this.f12069l = null;
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

    public void load(String str, boolean z6) {
        this.f12067j = str;
        f.a();
        this.i = f.a(3, str);
        this.f12062d = false;
        if (!new File(this.i).exists() && TextUtils.isEmpty(this.f12067j)) {
            e();
            return;
        }
        if (this.f12063e == null) {
            this.f12063e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f12059a = anonymousClass2;
            this.f12063e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f12060b = anonymousClass3;
            this.f12063e.a(anonymousClass3);
            this.f12063e.a(1.0f);
            this.f12063e.a(z6);
            a(new File(this.i).exists() ? this.i : this.f12067j, false);
        }
        postDelayed(new Runnable() { // from class: com.anythink.basead.ui.simpleview.SimplePlayer.1
            @Override // java.lang.Runnable
            public final void run() {
                SimplePlayer simplePlayer = SimplePlayer.this;
                if (simplePlayer.f12062d) {
                    return;
                }
                simplePlayer.e();
            }
        }, com.anythink.basead.exoplayer.f.f7973a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad adVar = this.f12063e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f12063e.m();
            }
            w.a aVar = this.f12059a;
            if (aVar != null) {
                this.f12063e.b(aVar);
            }
            g gVar = this.f12060b;
            if (gVar != null) {
                this.f12063e.b(gVar);
            }
            this.f12063e.n();
            this.f12063e = null;
        }
        this.f12069l = null;
    }

    public void setSimplePlayerViewListener(a aVar) {
        this.f12069l = aVar;
    }

    public void stopVideo() {
        ad adVar = this.f12063e;
        if (adVar == null || !adVar.J()) {
            return;
        }
        this.f12063e.m();
    }

    public SimplePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.f12066h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f12065g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f12065g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f12065g, layoutParams);
        }
    }

    private void b() {
        if (this.f12065g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f12065g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f12065g, layoutParams);
        }
    }

    private String c() {
        return new File(this.i).exists() ? this.i : this.f12067j;
    }

    public static /* synthetic */ void d(SimplePlayer simplePlayer) {
        simplePlayer.f12063e.a(simplePlayer.f12064f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a aVar = this.f12069l;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean f() {
        return !new File(this.i).exists() && TextUtils.isEmpty(this.f12067j);
    }

    public SimplePlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "";
        this.f12067j = "";
        this.f12068k = com.anythink.basead.exoplayer.f.f7973a;
        this.f12066h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f12065g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f12065g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f12065g, layoutParams);
        }
    }

    private void a(boolean z6) {
        String str;
        if (this.f12063e == null) {
            this.f12063e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f12059a = anonymousClass2;
            this.f12063e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f12060b = anonymousClass3;
            this.f12063e.a(anonymousClass3);
            this.f12063e.a(1.0f);
            this.f12063e.a(z6);
            if (new File(this.i).exists()) {
                str = this.i;
            } else {
                str = this.f12067j;
            }
            a(str, false);
        }
    }

    private void a(String str, boolean z6) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f12063e == null) {
                    e();
                    return;
                }
                this.f12066h = TextUtils.equals(str, this.i);
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f12064f = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.f12061c = true;
                } else {
                    this.f12064f = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.f12061c = false;
                }
                this.f12063e.a(this.f12065g);
                this.f12063e.a(this.f12064f);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (!TextUtils.equals(str, this.f12067j) && !z6) {
                    str = this.f12067j;
                    z6 = true;
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

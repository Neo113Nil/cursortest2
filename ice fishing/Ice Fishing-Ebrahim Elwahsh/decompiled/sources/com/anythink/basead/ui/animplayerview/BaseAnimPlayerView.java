package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.v.h;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseAnimPlayerView extends BasePlayerView {

    /* renamed from: A, reason: collision with root package name */
    private boolean f10593A;

    /* renamed from: a, reason: collision with root package name */
    protected final String f10594a;

    /* renamed from: b, reason: collision with root package name */
    long f10595b;

    /* renamed from: c, reason: collision with root package name */
    long f10596c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Bitmap> f10597d;

    /* renamed from: e, reason: collision with root package name */
    protected String f10598e;

    /* renamed from: f, reason: collision with root package name */
    protected RecycleImageView f10599f;

    /* renamed from: g, reason: collision with root package name */
    protected WrapRoundImageView f10600g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10601h;

    /* renamed from: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            while (true) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView.f10623r) {
                    return;
                }
                if (baseAnimPlayerView.f10625t || (handler = baseAnimPlayerView.f10627v) == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    try {
                        handler.sendEmptyMessage(1);
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
    }

    public BaseAnimPlayerView(Context context) {
        super(context);
        this.f10594a = getClass().getSimpleName();
        this.f10595b = 0L;
        this.f10596c = 0L;
        this.f10598e = "";
        this.f10601h = false;
        this.f10593A = false;
        i();
    }

    public static /* synthetic */ boolean b(BaseAnimPlayerView baseAnimPlayerView) {
        baseAnimPlayerView.f10601h = false;
        return false;
    }

    private void i() {
        this.f10627v = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (baseAnimPlayerView.f10628w != null && baseAnimPlayerView.f10623r) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + baseAnimPlayerView.f10595b;
                    BaseAnimPlayerView baseAnimPlayerView2 = BaseAnimPlayerView.this;
                    baseAnimPlayerView.f10615j = elapsedRealtime - baseAnimPlayerView2.f10596c;
                    if (!baseAnimPlayerView2.f10624s && !baseAnimPlayerView2.f10625t) {
                        baseAnimPlayerView2.f10624s = true;
                        BasePlayerView.a aVar = baseAnimPlayerView2.f10628w;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView3 = BaseAnimPlayerView.this;
                    BasePlayerView.a aVar2 = baseAnimPlayerView3.f10628w;
                    if (aVar2 != null) {
                        aVar2.a(baseAnimPlayerView3.f10615j);
                    }
                    BaseAnimPlayerView baseAnimPlayerView4 = BaseAnimPlayerView.this;
                    if (!baseAnimPlayerView4.f10619n && baseAnimPlayerView4.f10615j >= baseAnimPlayerView4.f10616k) {
                        baseAnimPlayerView4.f10619n = true;
                        BasePlayerView.a aVar3 = baseAnimPlayerView4.f10628w;
                        if (aVar3 != null) {
                            aVar3.a(25);
                        }
                    } else if (!baseAnimPlayerView4.f10620o && baseAnimPlayerView4.f10615j >= baseAnimPlayerView4.f10617l) {
                        baseAnimPlayerView4.f10620o = true;
                        BasePlayerView.a aVar4 = baseAnimPlayerView4.f10628w;
                        if (aVar4 != null) {
                            aVar4.a(50);
                        }
                    } else if (!baseAnimPlayerView4.f10621p && baseAnimPlayerView4.f10615j >= baseAnimPlayerView4.f10618m) {
                        baseAnimPlayerView4.f10621p = true;
                        BasePlayerView.a aVar5 = baseAnimPlayerView4.f10628w;
                        if (aVar5 != null) {
                            aVar5.a(75);
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView5 = BaseAnimPlayerView.this;
                    if (baseAnimPlayerView5.f10625t || baseAnimPlayerView5.f10615j < baseAnimPlayerView5.i) {
                        return;
                    }
                    baseAnimPlayerView5.k();
                    BaseAnimPlayerView.b(BaseAnimPlayerView.this);
                    BaseAnimPlayerView baseAnimPlayerView6 = BaseAnimPlayerView.this;
                    baseAnimPlayerView6.f10625t = true;
                    BasePlayerView.a aVar6 = baseAnimPlayerView6.f10628w;
                    if (aVar6 != null) {
                        aVar6.c();
                    }
                    BaseAnimPlayerView.this.h();
                }
            }
        };
    }

    private void j() {
        if (this.f10626u != null) {
            return;
        }
        this.f10623r = true;
        Thread thread = new Thread(new AnonymousClass3());
        this.f10626u = thread;
        thread.setName("anythink_type_anim_player_progress");
        this.f10626u.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f10623r = false;
        this.f10626u = null;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public int e() {
        return 0;
    }

    public void f() {
        if (TextUtils.isEmpty(this.f10598e)) {
            a(g.a(g.f6337l, g.f6321T));
        }
    }

    public final void g() {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return this.f10615j;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        return this.i;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f10629x != null;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z8, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z8, list, eVar);
        this.f10597d = list;
        this.f10598e = wVar.B();
        long max = Math.max(this.f10630y.f14325o.ao(), e());
        this.i = max;
        this.f10616k = Math.round(max * 0.25f);
        this.f10617l = Math.round(this.i * 0.5f);
        this.f10618m = Math.round(this.i * 0.75f);
        BasePlayerView.a aVar = this.f10628w;
        if (aVar != null) {
            aVar.b(this.i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePlayerView.a aVar2 = BaseAnimPlayerView.this.f10628w;
                if (aVar2 != null) {
                    aVar2.b(1);
                }
            }
        });
        f();
        List<Bitmap> list2 = this.f10597d;
        (list2 == null ? "null" : Integer.valueOf(list2.size())).toString();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f10622q;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        return this.f10601h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release(5);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (this.f10601h) {
            this.f10595b = (SystemClock.elapsedRealtime() - this.f10596c) + this.f10595b;
        }
        this.f10601h = false;
        k();
        b();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(int i) {
        k();
        h();
        Handler handler = this.f10627v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        d();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f10628w = aVar;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z8) {
        this.f10622q = z8;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        if (this.f10593A) {
            return;
        }
        this.f10601h = !this.f10625t;
        this.f10596c = SystemClock.elapsedRealtime();
        if (this.f10626u == null) {
            this.f10623r = true;
            Thread thread = new Thread(new AnonymousClass3());
            this.f10626u = thread;
            thread.setName("anythink_type_anim_player_progress");
            this.f10626u.start();
        }
        if (this.f10601h) {
            a();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        this.f10601h = false;
        k();
        c();
        h();
    }

    public final void a(final int i, final int i4) {
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        this.f10599f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f10599f, -1, -1);
        this.f10600g = new WrapRoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f10600g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f10600g, layoutParams);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f10598e), i, i4, new b.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
                BaseAnimPlayerView.this.a(g.a(g.f6337l, g.f6321T));
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, BaseAnimPlayerView.this.f10598e)) {
                    BaseAnimPlayerView.this.f10600g.setBitmapAndResize(bitmap, i, i4);
                    h.a(BaseAnimPlayerView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4.1
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            BaseAnimPlayerView.this.f10599f.setImageBitmap(bitmap2);
                        }
                    });
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(100L);
                    BaseAnimPlayerView.this.f10600g.startAnimation(alphaAnimation);
                    BaseAnimPlayerView.this.f10599f.startAnimation(alphaAnimation);
                }
            }
        });
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10594a = getClass().getSimpleName();
        this.f10595b = 0L;
        this.f10596c = 0L;
        this.f10598e = "";
        this.f10601h = false;
        this.f10593A = false;
        i();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public final void a(f fVar) {
        this.f10593A = true;
        super.a(fVar);
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10594a = getClass().getSimpleName();
        this.f10595b = 0L;
        this.f10596c = 0L;
        this.f10598e = "";
        this.f10601h = false;
        this.f10593A = false;
        i();
    }
}

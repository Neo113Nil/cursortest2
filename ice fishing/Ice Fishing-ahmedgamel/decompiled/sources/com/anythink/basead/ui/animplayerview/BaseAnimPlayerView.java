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
    private boolean f11222A;

    /* renamed from: a, reason: collision with root package name */
    protected final String f11223a;

    /* renamed from: b, reason: collision with root package name */
    long f11224b;

    /* renamed from: c, reason: collision with root package name */
    long f11225c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Bitmap> f11226d;

    /* renamed from: e, reason: collision with root package name */
    protected String f11227e;

    /* renamed from: f, reason: collision with root package name */
    protected RecycleImageView f11228f;

    /* renamed from: g, reason: collision with root package name */
    protected WrapRoundImageView f11229g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11230h;

    /* renamed from: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            while (true) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView.f11252r) {
                    return;
                }
                if (baseAnimPlayerView.f11254t || (handler = baseAnimPlayerView.f11256v) == null) {
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
        this.f11223a = getClass().getSimpleName();
        this.f11224b = 0L;
        this.f11225c = 0L;
        this.f11227e = "";
        this.f11230h = false;
        this.f11222A = false;
        i();
    }

    public static /* synthetic */ boolean b(BaseAnimPlayerView baseAnimPlayerView) {
        baseAnimPlayerView.f11230h = false;
        return false;
    }

    private void i() {
        this.f11256v = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (baseAnimPlayerView.f11257w != null && baseAnimPlayerView.f11252r) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + baseAnimPlayerView.f11224b;
                    BaseAnimPlayerView baseAnimPlayerView2 = BaseAnimPlayerView.this;
                    baseAnimPlayerView.f11244j = elapsedRealtime - baseAnimPlayerView2.f11225c;
                    if (!baseAnimPlayerView2.f11253s && !baseAnimPlayerView2.f11254t) {
                        baseAnimPlayerView2.f11253s = true;
                        BasePlayerView.a aVar = baseAnimPlayerView2.f11257w;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView3 = BaseAnimPlayerView.this;
                    BasePlayerView.a aVar2 = baseAnimPlayerView3.f11257w;
                    if (aVar2 != null) {
                        aVar2.a(baseAnimPlayerView3.f11244j);
                    }
                    BaseAnimPlayerView baseAnimPlayerView4 = BaseAnimPlayerView.this;
                    if (!baseAnimPlayerView4.f11248n && baseAnimPlayerView4.f11244j >= baseAnimPlayerView4.f11245k) {
                        baseAnimPlayerView4.f11248n = true;
                        BasePlayerView.a aVar3 = baseAnimPlayerView4.f11257w;
                        if (aVar3 != null) {
                            aVar3.a(25);
                        }
                    } else if (!baseAnimPlayerView4.f11249o && baseAnimPlayerView4.f11244j >= baseAnimPlayerView4.f11246l) {
                        baseAnimPlayerView4.f11249o = true;
                        BasePlayerView.a aVar4 = baseAnimPlayerView4.f11257w;
                        if (aVar4 != null) {
                            aVar4.a(50);
                        }
                    } else if (!baseAnimPlayerView4.f11250p && baseAnimPlayerView4.f11244j >= baseAnimPlayerView4.f11247m) {
                        baseAnimPlayerView4.f11250p = true;
                        BasePlayerView.a aVar5 = baseAnimPlayerView4.f11257w;
                        if (aVar5 != null) {
                            aVar5.a(75);
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView5 = BaseAnimPlayerView.this;
                    if (baseAnimPlayerView5.f11254t || baseAnimPlayerView5.f11244j < baseAnimPlayerView5.i) {
                        return;
                    }
                    baseAnimPlayerView5.k();
                    BaseAnimPlayerView.b(BaseAnimPlayerView.this);
                    BaseAnimPlayerView baseAnimPlayerView6 = BaseAnimPlayerView.this;
                    baseAnimPlayerView6.f11254t = true;
                    BasePlayerView.a aVar6 = baseAnimPlayerView6.f11257w;
                    if (aVar6 != null) {
                        aVar6.c();
                    }
                    BaseAnimPlayerView.this.h();
                }
            }
        };
    }

    private void j() {
        if (this.f11255u != null) {
            return;
        }
        this.f11252r = true;
        Thread thread = new Thread(new AnonymousClass3());
        this.f11255u = thread;
        thread.setName("anythink_type_anim_player_progress");
        this.f11255u.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f11252r = false;
        this.f11255u = null;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public int e() {
        return 0;
    }

    public void f() {
        if (TextUtils.isEmpty(this.f11227e)) {
            a(g.a(g.f6966l, g.f6950T));
        }
    }

    public final void g() {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return this.f11244j;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        return this.i;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f11258x != null;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z6, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z6, list, eVar);
        this.f11226d = list;
        this.f11227e = wVar.B();
        long max = Math.max(this.f11259y.f14954o.ao(), e());
        this.i = max;
        this.f11245k = Math.round(max * 0.25f);
        this.f11246l = Math.round(this.i * 0.5f);
        this.f11247m = Math.round(this.i * 0.75f);
        BasePlayerView.a aVar = this.f11257w;
        if (aVar != null) {
            aVar.b(this.i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePlayerView.a aVar2 = BaseAnimPlayerView.this.f11257w;
                if (aVar2 != null) {
                    aVar2.b(1);
                }
            }
        });
        f();
        List<Bitmap> list2 = this.f11226d;
        (list2 == null ? "null" : Integer.valueOf(list2.size())).toString();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f11251q;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        return this.f11230h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release(5);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (this.f11230h) {
            this.f11224b = (SystemClock.elapsedRealtime() - this.f11225c) + this.f11224b;
        }
        this.f11230h = false;
        k();
        b();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(int i) {
        k();
        h();
        Handler handler = this.f11256v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        d();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f11257w = aVar;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z6) {
        this.f11251q = z6;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        if (this.f11222A) {
            return;
        }
        this.f11230h = !this.f11254t;
        this.f11225c = SystemClock.elapsedRealtime();
        if (this.f11255u == null) {
            this.f11252r = true;
            Thread thread = new Thread(new AnonymousClass3());
            this.f11255u = thread;
            thread.setName("anythink_type_anim_player_progress");
            this.f11255u.start();
        }
        if (this.f11230h) {
            a();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        this.f11230h = false;
        k();
        c();
        h();
    }

    public final void a(final int i, final int i4) {
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        this.f11228f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f11228f, -1, -1);
        this.f11229g = new WrapRoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f11229g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f11229g, layoutParams);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f11227e), i, i4, new b.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
                BaseAnimPlayerView.this.a(g.a(g.f6966l, g.f6950T));
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, BaseAnimPlayerView.this.f11227e)) {
                    BaseAnimPlayerView.this.f11229g.setBitmapAndResize(bitmap, i, i4);
                    h.a(BaseAnimPlayerView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4.1
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            BaseAnimPlayerView.this.f11228f.setImageBitmap(bitmap2);
                        }
                    });
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(100L);
                    BaseAnimPlayerView.this.f11229g.startAnimation(alphaAnimation);
                    BaseAnimPlayerView.this.f11228f.startAnimation(alphaAnimation);
                }
            }
        });
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11223a = getClass().getSimpleName();
        this.f11224b = 0L;
        this.f11225c = 0L;
        this.f11227e = "";
        this.f11230h = false;
        this.f11222A = false;
        i();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public final void a(f fVar) {
        this.f11222A = true;
        super.a(fVar);
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11223a = getClass().getSimpleName();
        this.f11224b = 0L;
        this.f11225c = 0L;
        this.f11227e = "";
        this.f11230h = false;
        this.f11222A = false;
        i();
    }
}

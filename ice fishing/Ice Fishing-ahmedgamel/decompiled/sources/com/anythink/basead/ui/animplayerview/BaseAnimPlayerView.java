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
    private boolean f10436A;

    /* renamed from: a, reason: collision with root package name */
    protected final String f10437a;

    /* renamed from: b, reason: collision with root package name */
    long f10438b;

    /* renamed from: c, reason: collision with root package name */
    long f10439c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Bitmap> f10440d;

    /* renamed from: e, reason: collision with root package name */
    protected String f10441e;

    /* renamed from: f, reason: collision with root package name */
    protected RecycleImageView f10442f;

    /* renamed from: g, reason: collision with root package name */
    protected WrapRoundImageView f10443g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10444h;

    /* renamed from: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            while (true) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView.f10466r) {
                    return;
                }
                if (baseAnimPlayerView.f10468t || (handler = baseAnimPlayerView.f10470v) == null) {
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
        this.f10437a = getClass().getSimpleName();
        this.f10438b = 0L;
        this.f10439c = 0L;
        this.f10441e = "";
        this.f10444h = false;
        this.f10436A = false;
        i();
    }

    public static /* synthetic */ boolean b(BaseAnimPlayerView baseAnimPlayerView) {
        baseAnimPlayerView.f10444h = false;
        return false;
    }

    private void i() {
        this.f10470v = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (baseAnimPlayerView.f10471w != null && baseAnimPlayerView.f10466r) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + baseAnimPlayerView.f10438b;
                    BaseAnimPlayerView baseAnimPlayerView2 = BaseAnimPlayerView.this;
                    baseAnimPlayerView.f10458j = elapsedRealtime - baseAnimPlayerView2.f10439c;
                    if (!baseAnimPlayerView2.f10467s && !baseAnimPlayerView2.f10468t) {
                        baseAnimPlayerView2.f10467s = true;
                        BasePlayerView.a aVar = baseAnimPlayerView2.f10471w;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView3 = BaseAnimPlayerView.this;
                    BasePlayerView.a aVar2 = baseAnimPlayerView3.f10471w;
                    if (aVar2 != null) {
                        aVar2.a(baseAnimPlayerView3.f10458j);
                    }
                    BaseAnimPlayerView baseAnimPlayerView4 = BaseAnimPlayerView.this;
                    if (!baseAnimPlayerView4.f10462n && baseAnimPlayerView4.f10458j >= baseAnimPlayerView4.f10459k) {
                        baseAnimPlayerView4.f10462n = true;
                        BasePlayerView.a aVar3 = baseAnimPlayerView4.f10471w;
                        if (aVar3 != null) {
                            aVar3.a(25);
                        }
                    } else if (!baseAnimPlayerView4.f10463o && baseAnimPlayerView4.f10458j >= baseAnimPlayerView4.f10460l) {
                        baseAnimPlayerView4.f10463o = true;
                        BasePlayerView.a aVar4 = baseAnimPlayerView4.f10471w;
                        if (aVar4 != null) {
                            aVar4.a(50);
                        }
                    } else if (!baseAnimPlayerView4.f10464p && baseAnimPlayerView4.f10458j >= baseAnimPlayerView4.f10461m) {
                        baseAnimPlayerView4.f10464p = true;
                        BasePlayerView.a aVar5 = baseAnimPlayerView4.f10471w;
                        if (aVar5 != null) {
                            aVar5.a(75);
                        }
                    }
                    BaseAnimPlayerView baseAnimPlayerView5 = BaseAnimPlayerView.this;
                    if (baseAnimPlayerView5.f10468t || baseAnimPlayerView5.f10458j < baseAnimPlayerView5.i) {
                        return;
                    }
                    baseAnimPlayerView5.k();
                    BaseAnimPlayerView.b(BaseAnimPlayerView.this);
                    BaseAnimPlayerView baseAnimPlayerView6 = BaseAnimPlayerView.this;
                    baseAnimPlayerView6.f10468t = true;
                    BasePlayerView.a aVar6 = baseAnimPlayerView6.f10471w;
                    if (aVar6 != null) {
                        aVar6.c();
                    }
                    BaseAnimPlayerView.this.h();
                }
            }
        };
    }

    private void j() {
        if (this.f10469u != null) {
            return;
        }
        this.f10466r = true;
        Thread thread = new Thread(new AnonymousClass3());
        this.f10469u = thread;
        thread.setName("anythink_type_anim_player_progress");
        this.f10469u.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f10466r = false;
        this.f10469u = null;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public int e() {
        return 0;
    }

    public void f() {
        if (TextUtils.isEmpty(this.f10441e)) {
            a(g.a(g.f6180l, g.f6164T));
        }
    }

    public final void g() {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return this.f10458j;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        return this.i;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f10472x != null;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z3, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z3, list, eVar);
        this.f10440d = list;
        this.f10441e = wVar.B();
        long max = Math.max(this.f10473y.f14168o.ao(), e());
        this.i = max;
        this.f10459k = Math.round(max * 0.25f);
        this.f10460l = Math.round(this.i * 0.5f);
        this.f10461m = Math.round(this.i * 0.75f);
        BasePlayerView.a aVar = this.f10471w;
        if (aVar != null) {
            aVar.b(this.i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePlayerView.a aVar2 = BaseAnimPlayerView.this.f10471w;
                if (aVar2 != null) {
                    aVar2.b(1);
                }
            }
        });
        f();
        List<Bitmap> list2 = this.f10440d;
        (list2 == null ? "null" : Integer.valueOf(list2.size())).toString();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f10465q;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        return this.f10444h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release(5);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (this.f10444h) {
            this.f10438b = (SystemClock.elapsedRealtime() - this.f10439c) + this.f10438b;
        }
        this.f10444h = false;
        k();
        b();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(int i) {
        k();
        h();
        Handler handler = this.f10470v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        d();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f10471w = aVar;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z3) {
        this.f10465q = z3;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        if (this.f10436A) {
            return;
        }
        this.f10444h = !this.f10468t;
        this.f10439c = SystemClock.elapsedRealtime();
        if (this.f10469u == null) {
            this.f10466r = true;
            Thread thread = new Thread(new AnonymousClass3());
            this.f10469u = thread;
            thread.setName("anythink_type_anim_player_progress");
            this.f10469u.start();
        }
        if (this.f10444h) {
            a();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        this.f10444h = false;
        k();
        c();
        h();
    }

    public final void a(final int i, final int i6) {
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        this.f10442f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f10442f, -1, -1);
        this.f10443g = new WrapRoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f10443g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f10443g, layoutParams);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f10441e), i, i6, new b.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
                BaseAnimPlayerView.this.a(g.a(g.f6180l, g.f6164T));
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, BaseAnimPlayerView.this.f10441e)) {
                    BaseAnimPlayerView.this.f10443g.setBitmapAndResize(bitmap, i, i6);
                    h.a(BaseAnimPlayerView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4.1
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            BaseAnimPlayerView.this.f10442f.setImageBitmap(bitmap2);
                        }
                    });
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(100L);
                    BaseAnimPlayerView.this.f10443g.startAnimation(alphaAnimation);
                    BaseAnimPlayerView.this.f10442f.startAnimation(alphaAnimation);
                }
            }
        });
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10437a = getClass().getSimpleName();
        this.f10438b = 0L;
        this.f10439c = 0L;
        this.f10441e = "";
        this.f10444h = false;
        this.f10436A = false;
        i();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public final void a(f fVar) {
        this.f10436A = true;
        super.a(fVar);
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10437a = getClass().getSimpleName();
        this.f10438b = 0L;
        this.f10439c = 0L;
        this.f10441e = "";
        this.f10444h = false;
        this.f10436A = false;
        i();
    }
}

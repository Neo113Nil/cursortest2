package com.yandex.plus.home.feature.webviews.internal.stories.list;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.app.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import defpackage.btf;
import defpackage.ern;
import defpackage.jhp;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.lcc;
import defpackage.pl3;
import defpackage.s9f;
import defpackage.t4c;
import defpackage.uqn;
import defpackage.v50;
import defpackage.wz0;
import defpackage.y20;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f extends FrameLayout implements com.yandex.plus.home.feature.webviews.internal.container.c, g {
    public static final /* synthetic */ s9f[] i;
    public final i a;
    public final u b;
    public final f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    static {
        yxm yxmVar = new yxm(f.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0);
        ern.a.getClass();
        i = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull Function1<? super j, p> function1, @NotNull i iVar, @NotNull u uVar) {
        super(context);
        context.getClass();
        function1.getClass();
        iVar.getClass();
        uVar.getClass();
        this.a = iVar;
        this.b = uVar;
        this.c = this;
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.passport.common.util.e(6, this));
        this.e = btf.b(new pl3(11, function1));
        final int i2 = 0;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.stories.list.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                f fVar = this.b;
                switch (i3) {
                    case 0:
                        s9f[] s9fVarArr = f.i;
                        return new c(fVar);
                    case 1:
                        s9f[] s9fVarArr2 = f.i;
                        return new e(fVar);
                    default:
                        return f.g(fVar);
                }
            }
        });
        final int i3 = 1;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.stories.list.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                f fVar = this.b;
                switch (i32) {
                    case 0:
                        s9f[] s9fVarArr = f.i;
                        return new c(fVar);
                    case 1:
                        s9f[] s9fVarArr2 = f.i;
                        return new e(fVar);
                    default:
                        return f.g(fVar);
                }
            }
        });
        final int i4 = 2;
        this.h = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.stories.list.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                f fVar = this.b;
                switch (i32) {
                    case 0:
                        s9f[] s9fVarArr = f.i;
                        return new c(fVar);
                    case 1:
                        s9f[] s9fVarArr2 = f.i;
                        return new e(fVar);
                    default:
                        return f.g(fVar);
                }
            }
        });
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "init()", null);
        r1.p(this, R.layout.plus_sdk_web_stories_container, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) jhp.f(new lcc(new wz0(8, getViewPager()), true, d.a));
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        getViewPager().b(getPageChangeCallback());
        getViewPager().setOffscreenPageLimit(3);
        getViewPager().setAdapter(getAdapter());
        getViewPager().setPageTransformer(new q(25));
    }

    public static Unit f(int i2, Function1 function1, f fVar, int i3) {
        if (i2 == i3) {
            function1.invoke(fVar.m(i2));
            fVar.getAdapter().f = null;
        }
        return Unit.a;
    }

    public static k g(f fVar) {
        return new k(fVar.getPageChangeListener(), fVar.getViewPagerItemsProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b getAdapter() {
        return (com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getCurrentStoriesView() {
        return m(getViewPager().getCurrentItem());
    }

    private final k getPageChangeCallback() {
        return (k) this.h.getValue();
    }

    private final c getPageChangeListener() {
        return (c) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewPager2 getViewPager() {
        return (ViewPager2) this.d.g(i[0]);
    }

    private final e getViewPagerItemsProvider() {
        return (e) this.g.getValue();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void a() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onPause()");
        p currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(false);
        }
        getAdapter().g = false;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.list.g
    public final void c(int i2, boolean z, b1 b1Var, z0 z0Var) {
        b1Var.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.b, "WebStories updatePageState position = " + i2 + ", isSelected = " + z + ", tapDirection = " + b1Var + ", navigationType = " + z0Var, null);
        n(i2, new y20(z, b1Var, z0Var, 9));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.list.g
    public final void d(int i2) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String i3 = k5r.i(i2, "WebStories selectPage position = ");
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, i3, null);
        final ViewPager2 viewPager = getViewPager();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        viewPager.getClass();
        final int abs = Math.abs(viewPager.getCurrentItem() - i2);
        int i4 = 0;
        int i5 = 1;
        final boolean z = viewPager.getCurrentItem() < i2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, viewPager.getWidth());
        final uqn uqnVar = new uqn();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.plus.home.feature.webviews.internal.utils.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float floatValue = ((Float) animatedValue).floatValue();
                uqn uqnVar2 = uqn.this;
                float f = (floatValue - uqnVar2.a) * abs;
                if (z) {
                    f *= -1;
                }
                t4c t4cVar = viewPager.n;
                if (t4cVar.b.m) {
                    float f2 = t4cVar.f - f;
                    t4cVar.f = f2;
                    int round = Math.round(f2 - t4cVar.g);
                    t4cVar.g += round;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z2 = t4cVar.a.getOrientation() == 0;
                    int i6 = z2 ? round : 0;
                    if (z2) {
                        round = 0;
                    }
                    float f3 = z2 ? t4cVar.f : 0.0f;
                    float f4 = z2 ? 0.0f : t4cVar.f;
                    t4cVar.c.scrollBy(i6, round);
                    MotionEvent obtain = MotionEvent.obtain(t4cVar.h, uptimeMillis, 2, f3, f4, 0);
                    t4cVar.d.addMovement(obtain);
                    obtain.recycle();
                }
                uqnVar2.a = floatValue;
            }
        });
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new com.yandex.plus.home.feature.webviews.internal.utils.b(viewPager, i5));
        ofFloat.addListener(new com.yandex.plus.home.feature.webviews.internal.utils.b(viewPager, i4));
        ofFloat.start();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.list.g
    public final void dismiss() {
        com.yandex.plus.core.analytics.logging.e.b(com.yandex.plus.core.analytics.logging.b.b, "WebStories dismiss");
        ((t) this.b).k();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final boolean e() {
        p currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            return currentStoriesView.e();
        }
        return false;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    @NotNull
    public View getView() {
        return this.c;
    }

    public final p m(int i2) {
        j jVar = (j) CollectionsKt.S(getAdapter().e, i2);
        if (jVar != null) {
            return (p) getViewPager().findViewWithTag(Integer.valueOf(jVar.hashCode()));
        }
        return null;
    }

    public final void n(int i2, Function1 function1) {
        p m = m(i2);
        if (m != null) {
            function1.invoke(m);
        } else {
            getAdapter().f = new v50(i2, function1, this, 23);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onAttachedToWindow()", null);
        i iVar = this.a;
        iVar.getClass();
        iVar.f(this);
        List list = iVar.g;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((j) it.next()).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        }
        com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b adapter = getAdapter();
        adapter.getClass();
        ArrayList arrayList = adapter.e;
        arrayList.clear();
        arrayList.addAll(list);
        adapter.g();
        getViewPager().e(i2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onDetachedFromWindow()");
        this.a.h();
        getViewPager().g(getPageChangeCallback());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onResume() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onResume()");
        getAdapter().g = true;
        p currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(true);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void r() {
        p currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(false);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void t() {
        p currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(true);
        }
    }
}

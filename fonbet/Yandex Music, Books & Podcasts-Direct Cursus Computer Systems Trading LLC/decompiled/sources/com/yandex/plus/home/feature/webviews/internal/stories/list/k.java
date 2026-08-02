package com.yandex.plus.home.feature.webviews.internal.stories.list;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import defpackage.dgu;
import defpackage.jyr;
import defpackage.qo1;
import defpackage.s9f;

/* loaded from: classes5.dex */
public final class k extends dgu {
    public final c a;
    public final e b;
    public int c;
    public float d;
    public a e;
    public boolean f;

    public k(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        this.a = cVar;
        this.b = eVar;
        this.c = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // defpackage.dgu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        p currentStoriesView;
        boolean z;
        int i2;
        com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b adapter;
        ViewPager2 viewPager;
        com.yandex.plus.home.feature.webviews.internal.stories.list.adapter.b adapter2;
        ViewPager2 viewPager2;
        p currentStoriesView2;
        ViewPager2 viewPager3;
        c cVar = this.a;
        boolean z2 = false;
        e eVar = this.b;
        if (i == 1) {
            currentStoriesView2 = cVar.a.getCurrentStoriesView();
            if (currentStoriesView2 != null) {
                currentStoriesView2.setIsFullyVisible(false);
            }
            viewPager3 = eVar.a.getViewPager();
            this.c = viewPager3.getCurrentItem();
            this.f = true;
        } else {
            this.f = false;
        }
        if (i == 0) {
            currentStoriesView = cVar.a.getCurrentStoriesView();
            if (currentStoriesView != null) {
                currentStoriesView.setIsFullyVisible(true);
            }
            if (this.c == 0) {
                viewPager2 = eVar.a.getViewPager();
                if (viewPager2.getCurrentItem() == 0) {
                    z = true;
                    i2 = this.c;
                    f fVar = eVar.a;
                    f fVar2 = eVar.a;
                    adapter = fVar.getAdapter();
                    if (i2 == adapter.e.size() - 1) {
                        viewPager = fVar2.getViewPager();
                        int currentItem = viewPager.getCurrentItem();
                        adapter2 = fVar2.getAdapter();
                        if (currentItem == adapter2.e.size() - 1) {
                            z2 = true;
                        }
                    }
                    if ((z && this.e == a.a) || (z2 && this.e == a.b)) {
                        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onDismiss()", null);
                        ((t) cVar.a.b).k();
                    }
                    this.e = null;
                    this.d = 0.0f;
                }
            }
            z = false;
            i2 = this.c;
            f fVar3 = eVar.a;
            f fVar22 = eVar.a;
            adapter = fVar3.getAdapter();
            if (i2 == adapter.e.size() - 1) {
            }
            if (z) {
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar2, "onDismiss()", null);
                ((t) cVar.a.b).k();
                this.e = null;
                this.d = 0.0f;
            }
            com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.b;
            jyr jyrVar22 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar22, "onDismiss()", null);
            ((t) cVar.a.b).k();
            this.e = null;
            this.d = 0.0f;
        }
    }

    @Override // defpackage.dgu
    public final void b(int i, float f, int i2) {
        if (i == this.c && this.f) {
            float f2 = i + f;
            float f3 = 0.5f + f2;
            float f4 = this.d;
            if (f3 > f4) {
                this.e = a.b;
            } else if (f3 < f4) {
                this.e = a.a;
            }
            if (f2 == 0.0f && f4 == 0.0f) {
                this.e = a.a;
            }
            this.d = f2;
        }
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        int i2 = this.c;
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == -1) {
            valueOf = null;
        }
        f fVar = this.a.a;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            com.yandex.plus.bdui.plus.webview.navigation.a aVar = new com.yandex.plus.bdui.plus.webview.navigation.a(28);
            s9f[] s9fVarArr = f.i;
            fVar.n(intValue, aVar);
        }
        qo1 qo1Var = new qo1(fVar, i, 9);
        s9f[] s9fVarArr2 = f.i;
        fVar.n(i, qo1Var);
        fVar.requestLayout();
    }
}

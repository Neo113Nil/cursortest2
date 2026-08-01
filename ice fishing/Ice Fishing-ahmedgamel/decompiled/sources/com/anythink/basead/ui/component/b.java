package com.anythink.basead.ui.component;

import android.view.View;
import com.anythink.basead.ui.CountDownView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    CountDownView f10701a;

    /* renamed from: b, reason: collision with root package name */
    WebProgressBarView f10702b;

    /* renamed from: c, reason: collision with root package name */
    int f10703c = 4;

    /* renamed from: d, reason: collision with root package name */
    private y f10704d;

    /* renamed from: e, reason: collision with root package name */
    private long f10705e;

    public b(y yVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.f10704d = yVar;
        this.f10701a = countDownView;
        this.f10702b = webProgressBarView;
    }

    private boolean c() {
        return this.f10704d.bk() == 2 || this.f10704d.bk() == 4;
    }

    public final void a(long j6) {
        this.f10705e = j6;
        CountDownView countDownView = this.f10701a;
        if (countDownView != null) {
            countDownView.setDuration(j6);
        }
    }

    public final void b(long j6) {
        CountDownView countDownView = this.f10701a;
        if (countDownView != null) {
            countDownView.refresh(j6);
        }
        WebProgressBarView webProgressBarView = this.f10702b;
        if (webProgressBarView != null) {
            long j9 = this.f10705e;
            if (j9 > 0) {
                webProgressBarView.setProgress((int) ((j6 * 100.0d) / j9));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public final void a() {
        CountDownView countDownView = this.f10701a;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.f10702b;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    private boolean b() {
        return this.f10704d.bk() == 1 || this.f10704d.bk() == 4;
    }

    public final void a(int i) {
        this.f10703c = i;
        if (this.f10704d.bk() != 1 && this.f10704d.bk() != 4) {
            a(this.f10701a, 8);
        } else {
            a(this.f10701a, i);
        }
        if (this.f10704d.bk() != 2 && this.f10704d.bk() != 4) {
            a(this.f10702b, 8);
        } else {
            a(this.f10702b, i);
        }
    }

    private static void a(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }
}

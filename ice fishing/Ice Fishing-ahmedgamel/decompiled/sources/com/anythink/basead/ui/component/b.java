package com.anythink.basead.ui.component;

import android.view.View;
import com.anythink.basead.ui.CountDownView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    CountDownView f11487a;

    /* renamed from: b, reason: collision with root package name */
    WebProgressBarView f11488b;

    /* renamed from: c, reason: collision with root package name */
    int f11489c = 4;

    /* renamed from: d, reason: collision with root package name */
    private y f11490d;

    /* renamed from: e, reason: collision with root package name */
    private long f11491e;

    public b(y yVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.f11490d = yVar;
        this.f11487a = countDownView;
        this.f11488b = webProgressBarView;
    }

    private boolean c() {
        return this.f11490d.bk() == 2 || this.f11490d.bk() == 4;
    }

    public final void a(long j6) {
        this.f11491e = j6;
        CountDownView countDownView = this.f11487a;
        if (countDownView != null) {
            countDownView.setDuration(j6);
        }
    }

    public final void b(long j6) {
        CountDownView countDownView = this.f11487a;
        if (countDownView != null) {
            countDownView.refresh(j6);
        }
        WebProgressBarView webProgressBarView = this.f11488b;
        if (webProgressBarView != null) {
            long j9 = this.f11491e;
            if (j9 > 0) {
                webProgressBarView.setProgress((int) ((j6 * 100.0d) / j9));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public final void a() {
        CountDownView countDownView = this.f11487a;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.f11488b;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    private boolean b() {
        return this.f11490d.bk() == 1 || this.f11490d.bk() == 4;
    }

    public final void a(int i) {
        this.f11489c = i;
        if (this.f11490d.bk() != 1 && this.f11490d.bk() != 4) {
            a(this.f11487a, 8);
        } else {
            a(this.f11487a, i);
        }
        if (this.f11490d.bk() != 2 && this.f11490d.bk() != 4) {
            a(this.f11488b, 8);
        } else {
            a(this.f11488b, i);
        }
    }

    private static void a(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }
}

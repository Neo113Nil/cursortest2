package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d;
import defpackage.b6e;
import defpackage.fmq;
import defpackage.hr2;
import defpackage.n20;
import defpackage.ps;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes4.dex */
public final class b implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public b(u6 u6Var, fmq fmqVar, d dVar, com.yandex.plus.bdui.plus.webview.navigation.a aVar) {
        this.b = fmqVar;
        this.c = dVar;
        this.d = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                animator.removeAllListeners();
                for (ValueAnimator valueAnimator : (ArrayList) obj3) {
                    valueAnimator.removeAllListeners();
                    valueAnimator.removeAllUpdateListeners();
                }
                ((ps) obj2).invoke();
                ((n20) obj).a = false;
                break;
            default:
                int i3 = GiftProgressView.n;
                fmq fmqVar = (fmq) obj3;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.c cVar = ((d) obj2).c;
                com.yandex.plus.bdui.plus.webview.navigation.a aVar = (com.yandex.plus.bdui.plus.webview.navigation.a) obj;
                fmqVar.getClass();
                if (cVar instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.a) {
                    i = ((com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.a) cVar).a.getAlpha();
                } else if (!(cVar instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.b)) {
                    b6e.s();
                    break;
                } else {
                    i = (((com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.b) cVar).a >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
                ofInt.setDuration(500L);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new hr2(26, aVar));
                ofInt.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(3, fmqVar));
                ofInt.start();
                fmqVar.d = ofInt;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    public b(ArrayList arrayList, ps psVar, n20 n20Var) {
        this.b = arrayList;
        this.c = psVar;
        this.d = n20Var;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}

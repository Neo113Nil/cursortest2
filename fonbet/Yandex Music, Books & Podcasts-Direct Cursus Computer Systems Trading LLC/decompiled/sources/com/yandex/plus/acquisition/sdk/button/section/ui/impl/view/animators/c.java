package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators;

import android.animation.ValueAnimator;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f;
import defpackage.j5;
import defpackage.t75;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class c extends j5 {
    public final ValueAnimator d;

    public c(f fVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.b bVar) {
        super((com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a) bVar);
        this.d = new ValueAnimator();
    }

    @Override // defpackage.j5
    public final Collection k() {
        return t75.c(this.d);
    }
}

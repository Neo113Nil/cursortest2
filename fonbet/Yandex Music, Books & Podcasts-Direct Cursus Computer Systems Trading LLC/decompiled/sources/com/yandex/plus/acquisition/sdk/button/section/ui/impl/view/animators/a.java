package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f;
import defpackage.j5;
import defpackage.u75;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class a extends j5 {
    public final ValueAnimator d;
    public final ValueAnimator e;
    public final ObjectAnimator f;
    public final ObjectAnimator g;
    public final ObjectAnimator h;

    public a(f fVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.b bVar, boolean z) {
        super((com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a) bVar);
        this.d = new ValueAnimator();
        this.e = new ValueAnimator();
        this.f = com.yandex.plus.pay.ui.core.b.j(fVar.getPurchaseButton().getPurchaseTextView());
        this.g = com.yandex.plus.pay.ui.core.b.j(fVar.getPurchaseButton().getReadMoreTextView());
        this.h = z ? com.yandex.plus.pay.ui.core.b.j(fVar.getLegalsTextView()) : null;
    }

    @Override // defpackage.j5
    public final Collection k() {
        List h = u75.h(this.e, this.d, this.f, this.g);
        ObjectAnimator objectAnimator = this.h;
        return objectAnimator != null ? CollectionsKt.h0(h, objectAnimator) : h;
    }
}

package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import defpackage.b6e;
import defpackage.la8;

/* loaded from: classes5.dex */
public final class d implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public d(com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f fVar, String str) {
        this.a = 2;
        this.b = bVar;
        this.c = fVar;
        this.d = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup modalViewWrapper;
        ViewGroup modalViewWrapper2;
        int height;
        ViewGroup modalViewWrapper3;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                f.b((f) this.c, (com.yandex.plus.home.repository.api.model.user.d) this.d, (com.yandex.plus.core.imageloader.b) this.b);
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.a((com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c) this.c, (com.yandex.plus.home.feature.panel.internalapi.model.e) this.d, (com.yandex.plus.core.imageloader.b) this.b);
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.core.imageloader.b bVar = (com.yandex.plus.core.imageloader.b) this.b;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f fVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f) this.c;
                com.yandex.plus.coil.b bVar2 = (com.yandex.plus.coil.b) bVar;
                la8 la8Var = (la8) bVar2.c.remove(fVar);
                if (la8Var != null) {
                    la8Var.a();
                }
                bVar2.b((String) this.d).j(fVar);
                break;
            default:
                com.yandex.plus.home.feature.webviews.internal.container.g gVar = (com.yandex.plus.home.feature.webviews.internal.container.g) this.d;
                view.removeOnLayoutChangeListener(this);
                ViewGroup.LayoutParams layoutParams = ((com.yandex.plus.home.feature.webviews.internal.container.c) this.c).getView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i9 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                modalViewWrapper = gVar.getModalViewWrapper();
                int paddingTop = modalViewWrapper.getPaddingTop() + i9;
                ModalViewBehavior modalViewBehavior = gVar.C;
                com.yandex.plus.home.feature.webviews.internalapi.container.c cVar = (com.yandex.plus.home.feature.webviews.internalapi.container.c) this.b;
                if (!(cVar instanceof com.yandex.plus.home.feature.webviews.internalapi.container.a)) {
                    if (!(cVar instanceof com.yandex.plus.home.feature.webviews.internalapi.container.b)) {
                        b6e.s();
                        break;
                    } else {
                        modalViewWrapper2 = gVar.getModalViewWrapper();
                        height = (int) ((((com.yandex.plus.home.feature.webviews.internalapi.container.b) cVar).a / 100.0f) * (modalViewWrapper2.getHeight() - paddingTop));
                    }
                } else {
                    Integer valueOf = Integer.valueOf(((com.yandex.plus.home.feature.webviews.internalapi.container.a) cVar).a);
                    modalViewWrapper3 = gVar.getModalViewWrapper();
                    modalViewWrapper3.getClass();
                    Context context = modalViewWrapper3.getContext();
                    context.getClass();
                    Resources resources = context.getResources();
                    resources.getClass();
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    displayMetrics.getClass();
                    height = com.yandex.plus.core.android.extensions.e.c(valueOf, displayMetrics).intValue();
                }
                modalViewBehavior.setMaxHeight(height + paddingTop);
                break;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}

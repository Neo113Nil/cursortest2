package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class b extends c {
    public static final /* synthetic */ s9f[] s = {new yxm(b.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), f1d.c(ern.a, b.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new yxm(b.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new yxm(b.class, "buttonView", "getButtonView()Landroid/widget/TextView;", 0), new yxm(b.class, "giftProgressView", "getGiftProgressView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/progress/GiftProgressView;", 0), new yxm(b.class, "badgeView", "getBadgeView()Landroid/widget/TextView;", 0), new yxm(b.class, "giftImageView", "getGiftImageView()Lcom/google/android/material/imageview/ShapeableImageView;", 0), new yxm(b.class, "confettiFirstLayerView", "getConfettiFirstLayerView()Lcom/google/android/material/imageview/ShapeableImageView;", 0), new yxm(b.class, "confettiSecondLayerView", "getConfettiSecondLayerView()Lcom/google/android/material/imageview/ShapeableImageView;", 0), new yxm(b.class, "separator", "getSeparator()Landroid/view/View;", 0)};
    public final boolean g;
    public final com.yandex.plus.home.feature.panel.internalapi.c h;
    public final f i;
    public final f j;
    public final f k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final f p;
    public final f q;
    public final f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup, com.yandex.plus.core.imageloader.b bVar, boolean z, com.yandex.plus.home.feature.panel.internalapi.c cVar, kotlinx.coroutines.a aVar) {
        super(viewGroup, bVar, z, aVar);
        viewGroup.getClass();
        bVar.getClass();
        cVar.getClass();
        aVar.getClass();
        this.g = z;
        this.h = cVar;
        this.i = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 2));
        this.j = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 3));
        this.k = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 4));
        this.l = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 5));
        this.m = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 6));
        this.n = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 7));
        this.o = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 8));
        this.p = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 9));
        this.q = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 10));
        this.r = new f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(viewGroup, 1));
    }

    public final TextView T() {
        return (TextView) this.n.g(s[5]);
    }
}

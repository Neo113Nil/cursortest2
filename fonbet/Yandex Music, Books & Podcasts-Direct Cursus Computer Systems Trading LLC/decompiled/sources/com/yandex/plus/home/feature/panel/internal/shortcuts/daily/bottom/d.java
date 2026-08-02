package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.y2x;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d extends com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c {
    public static final /* synthetic */ s9f[] o = {new yxm(d.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, d.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "dailyServicesView", "getDailyServicesView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/services/DailyServicesView;", 0), new yxm(d.class, "descriptionTextView", "getDescriptionTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "buttonTextView", "getButtonTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "leftConfettiImageView", "getLeftConfettiImageView()Lcom/google/android/material/imageview/ShapeableImageView;", 0), new yxm(d.class, "rightConfettiImageView", "getRightConfettiImageView()Lcom/google/android/material/imageview/ShapeableImageView;", 0)};
    public final f g;
    public final f h;
    public final f i;
    public final f j;
    public final f k;
    public final f l;
    public final f m;
    public final Drawable n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, com.yandex.plus.core.imageloader.b bVar, boolean z, kotlinx.coroutines.a aVar) {
        super(viewGroup, bVar, z, aVar);
        viewGroup.getClass();
        bVar.getClass();
        aVar.getClass();
        this.g = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 24));
        this.h = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 25));
        this.i = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 26));
        this.j = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 27));
        this.k = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 28));
        this.l = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(viewGroup, 29));
        this.m = new f(new c(viewGroup, 0));
        Context context = viewGroup.getContext();
        context.getClass();
        Drawable w = y2x.w(context, R.drawable.plus_sdk_ic_daily_services_placeholder);
        w.getClass();
        this.n = w;
    }
}

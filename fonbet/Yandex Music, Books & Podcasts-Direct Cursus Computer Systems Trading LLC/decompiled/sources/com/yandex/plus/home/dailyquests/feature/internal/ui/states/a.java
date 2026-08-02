package com.yandex.plus.home.dailyquests.feature.internal.ui.states;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a {
    public static final /* synthetic */ s9f[] f = {new yxm(a.class, "questImageView", "getQuestImageView()Landroid/widget/ImageView;", 0), f1d.c(ern.a, a.class, "completedImageView", "getCompletedImageView()Landroid/widget/ImageView;", 0), new yxm(a.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0)};
    public final View a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;

    public a(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.plus_sdk_view_completed_quest, (ViewGroup) null, false);
        inflate.getClass();
        this.a = inflate;
        this.b = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 7));
        this.c = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 8));
        this.d = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 9));
        this.e = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 10));
        wdu.q(inflate, new eb(7));
    }
}

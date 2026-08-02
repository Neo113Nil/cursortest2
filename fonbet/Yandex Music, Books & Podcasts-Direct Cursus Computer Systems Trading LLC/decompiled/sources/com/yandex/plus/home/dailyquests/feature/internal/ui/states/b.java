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
public final class b {
    public static final /* synthetic */ s9f[] k = {new yxm(b.class, "questImageView", "getQuestImageView()Landroid/widget/ImageView;", 0), f1d.c(ern.a, b.class, "toolbarChainLinearLayout", "getToolbarChainLinearLayout()Landroidx/appcompat/widget/LinearLayoutCompat;", 0), new yxm(b.class, "toolbarChainTextView", "getToolbarChainTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "toolbarRewardTextView", "getToolbarRewardTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "progressBar", "getProgressBar()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0), new yxm(b.class, "progressHintTextView", "getProgressHintTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "progressFallbackTextView", "getProgressFallbackTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "timeLeftTextView", "getTimeLeftTextView()Landroid/widget/TextView;", 0)};
    public final View a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;

    public b(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.plus_sdk_view_in_progress_quest, (ViewGroup) null, false);
        inflate.getClass();
        this.a = inflate;
        this.b = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 11));
        this.c = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 12));
        this.d = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 13));
        this.e = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 14));
        this.f = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 15));
        this.g = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 16));
        this.h = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 17));
        this.i = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 18));
        this.j = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 19));
        wdu.q(inflate, new eb(8));
    }
}

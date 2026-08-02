package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final class b extends FrameLayout {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, int i, Context context) {
        super(context);
        this.a = activity;
        this.b = i;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.setRequestedOrientation(this.b);
    }
}

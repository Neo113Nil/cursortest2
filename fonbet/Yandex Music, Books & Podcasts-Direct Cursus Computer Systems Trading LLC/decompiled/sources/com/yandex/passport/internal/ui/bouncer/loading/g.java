package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import defpackage.ldg;

/* loaded from: classes4.dex */
public final class g extends e {
    public final View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, v vVar, x xVar) {
        super(activity, vVar, xVar);
        activity.getClass();
        vVar.getClass();
        xVar.getClass();
        this.h = com.yandex.passport.common.ui.e.a(this, activity, vVar, xVar.x, 0.0f, true);
    }

    @Override // com.yandex.passport.internal.ui.bouncer.loading.e, com.yandex.passport.internal.ui.bouncer.loading.a
    public final View getProgress() {
        return this.h;
    }

    @Override // defpackage.b6
    public final void w(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.getClass();
        ldg.I(R.drawable.passport_background_main, linearLayout);
    }
}

package com.yandex.plus.home.common.utils;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes5.dex */
public final class h implements View.OnClickListener {
    public long a;
    public final /* synthetic */ View.OnClickListener b;

    public h(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - this.a) > 400) {
            this.a = elapsedRealtime;
            this.b.onClick(view);
        }
    }
}

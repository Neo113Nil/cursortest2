package com.yandex.passport.internal.ui.common.web;

import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.c28;

/* loaded from: classes4.dex */
public final class f {
    public final j a;

    public f(j jVar) {
        jVar.getClass();
        this.a = jVar;
        jVar.g.setOutlineProvider(new c28(5, this));
    }

    public final void a(int i) {
        j jVar = this.a;
        jVar.h.setVisibility(0);
        View findViewById = jVar.h.findViewById(R.id.text_error_message);
        findViewById.getClass();
        ((TextView) findViewById).setText(i);
        jVar.e.setVisibility(8);
        jVar.g.setVisibility(8);
    }
}

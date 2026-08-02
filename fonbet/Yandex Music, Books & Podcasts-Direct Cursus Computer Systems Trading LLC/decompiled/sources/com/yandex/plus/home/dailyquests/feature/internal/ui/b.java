package com.yandex.plus.home.dailyquests.feature.internal.ui;

import android.view.View;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import defpackage.rjf;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjf b;
    public final /* synthetic */ l c;

    public /* synthetic */ b(rjf rjfVar, l lVar, int i) {
        this.a = i;
        this.b = rjfVar;
        this.c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            default:
                this.b.f(this.c);
                break;
        }
    }
}

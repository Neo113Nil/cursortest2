package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.view.View;
import defpackage.ic;

/* loaded from: classes5.dex */
public final class d implements ic {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalViewBehavior b;

    public d(ModalViewBehavior modalViewBehavior, int i) {
        this.b = modalViewBehavior;
        this.a = i;
    }

    @Override // defpackage.ic
    public final boolean r(View view) {
        this.b.setState(this.a);
        return true;
    }
}

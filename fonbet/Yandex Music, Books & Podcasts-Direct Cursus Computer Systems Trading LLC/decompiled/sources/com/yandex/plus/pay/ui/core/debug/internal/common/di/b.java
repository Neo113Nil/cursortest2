package com.yandex.plus.pay.ui.core.debug.internal.common.di;

import com.yandex.plus.di.c;
import defpackage.btf;
import defpackage.cl4;
import defpackage.gao;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class b implements c {
    public final com.yandex.plus.pay.ui.core.debug.api.b a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final com.yandex.plus.pay.ui.common.api.a c;
    public final com.yandex.plus.core.dispatcher.b d;
    public final cl4 e = new cl4(new gao(1));
    public final jyr f = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(19, this));
    public final jyr g = btf.b(new com.yandex.plus.pay.internal.model.a(22));

    public b(com.yandex.plus.pay.ui.core.debug.api.b bVar) {
        this.a = bVar;
        this.b = bVar.a();
        this.c = bVar.c();
        this.d = bVar.e();
    }
}

package com.yandex.plus.plaquesdk.plaque.adapter;

import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.plaquesdk.plaque.api.models.display.p;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.fq2;
import defpackage.wdu;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class j {
    public boolean a;

    public final void a(x xVar) {
        p pVar = xVar.c().a.b;
        com.yandex.plus.plaquesdk.plaque.api.models.display.a aVar = xVar.c().a.a;
        r1.E(d(), xVar.q() != null ? new fq2(20, this, xVar) : null);
        d().addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.b(5, this, pVar));
        d().setPaddingRelative(com.yandex.plus.core.android.extensions.d.a(aVar.a, d()).intValue(), com.yandex.plus.core.android.extensions.d.a(aVar.b, d()).intValue(), com.yandex.plus.core.android.extensions.d.a(aVar.c, d()).intValue(), com.yandex.plus.core.android.extensions.d.a(aVar.d, d()).intValue());
        d().setImportantForAccessibility(xVar.getContentDescription().a);
        d().setContentDescription(xVar.getContentDescription().b);
        e(xVar);
        b(xVar);
    }

    public abstract void b(x xVar);

    public abstract Function1 c();

    public abstract View d();

    public void e(x xVar) {
        wdu.q(d(), new i(xVar, this));
    }
}

package com.yandex.passport.internal.flags.experiments;

import android.content.Intent;
import androidx.core.app.y0;
import defpackage.r1w;

/* loaded from: classes4.dex */
public final class FetchExperimentsService extends y0 {
    public static final /* synthetic */ int i = 0;

    @Override // androidx.core.app.y0
    public final void e(Intent intent) {
        com.yandex.passport.common.core.b bVar;
        intent.getClass();
        try {
            bVar = (com.yandex.passport.common.core.b) intent.getParcelableExtra("environment");
        } catch (Throwable th) {
            com.yandex.passport.internal.di.a.a().getEventReporter().k(th);
            bVar = null;
        }
        if (bVar == null) {
            bVar = com.yandex.passport.common.core.b.c;
        }
        com.yandex.passport.internal.ui.a.B(new r1w(bVar, null, 11));
    }
}

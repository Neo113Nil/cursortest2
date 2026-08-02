package ru.yandex.taxi.analytics.referrer;

import com.yandex.go.intentprocessor.k;
import com.yandex.go.preload.e;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.am.t;

/* loaded from: classes9.dex */
public final class a implements jy60 {
    public final tse a;
    public final b b;
    public final e c;
    public final k d;
    public final t e;

    public a(tse tseVar, b bVar, e eVar, k kVar, t tVar) {
        this.a = tseVar;
        this.b = bVar;
        this.c = eVar;
        this.d = kVar;
        this.e = tVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AdjustDeferredDeeplinkFallbackFCPListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        if (this.b.a.a("adjust_deferred_deeplink_handled", false)) {
            return;
        }
        tje.N(this.a, null, null, new AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1(this, null), 3);
    }
}

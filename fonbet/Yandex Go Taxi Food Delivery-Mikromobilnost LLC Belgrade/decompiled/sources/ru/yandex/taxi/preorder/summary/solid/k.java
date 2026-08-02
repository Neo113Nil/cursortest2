package ru.yandex.taxi.preorder.summary.solid;

import android.content.Intent;
import android.net.Uri;
import defpackage.cms;
import defpackage.egb1;
import defpackage.fpv0;
import defpackage.jl40;
import defpackage.jms;
import defpackage.jpv0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.o6t0;
import defpackage.tls;
import defpackage.vje;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements vje, jms {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        l lVar = this.a;
        lVar.getClass();
        Uri data = intent.getData();
        if (data != null && lVar.Eg()) {
            jpv0 b = lVar.v3.b();
            b.getClass();
            if (!(b instanceof fpv0)) {
                tls solidSummaryPresenter$getIntentUriHandler$1 = "requirement".equalsIgnoreCase(data.getAuthority()) ? new SolidSummaryPresenter$getIntentUriHandler$1(1, lVar.x0.get(), ru.yandex.taxi.summary.deeplink.requirement.a.class, "handleRequirementDeeplink", "handleRequirementDeeplink(Landroid/net/Uri;)V", 0) : "scheduleride".equalsIgnoreCase(data.getAuthority()) ? new SolidSummaryPresenter$getIntentUriHandler$2(1, lVar.y0.get(), ru.yandex.taxi.scheduleride.deeplink.b.class, "handleDeeplink", "handleDeeplink(Landroid/net/Uri;)V", 0) : "driver_instructions_on_summary".equalsIgnoreCase(data.getAuthority()) ? new o6t0(lVar, 0) : egb1.c(data) ? new SolidSummaryPresenter$getIntentUriHandler$4(1, lVar.p0.get(), ru.yandex.taxi.summary.deeplink.b.class, "handleRedirectDeeplink", "handleRedirectDeeplink(Landroid/net/Uri;Lru/yandex/taxi/tariffs/model/SelectionOrigin;)V", 0) : null;
                if (solidSummaryPresenter$getIntentUriHandler$1 != null) {
                    solidSummaryPresenter$getIntentUriHandler$1.invoke(data);
                    return new m5u(true, false);
                }
            }
        }
        return n5u.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vje) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, l.class, "processIntent", "processIntent(Landroid/content/Intent;)Lru/yandex/taxi/deeplinks/HandleIntentResult;", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

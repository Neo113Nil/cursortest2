package com.yandex.plus.home;

import com.yandex.plus.core.featureflags.u;
import com.yandex.plus.core.featureflags.v;
import com.yandex.plus.core.featureflags.w;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.z7o;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements w {
    public final /* synthetic */ t a;

    public /* synthetic */ l(t tVar) {
        this.a = tVar;
    }

    public u a() {
        Object c = ((com.yandex.plus.home.graphql.configuration.j) this.a.f.u.getValue()).c();
        r7o r7oVar = z7o.b;
        if (c instanceof t7o) {
            c = null;
        }
        com.yandex.plus.home.repository.api.model.configuration.a aVar = (com.yandex.plus.home.repository.api.model.configuration.a) c;
        if (aVar != null) {
            return new u(uah.e(new Pair("READY_MESSAGE_TIMEOUT_MILLIS_KEY", aVar.a), new Pair("ANIMATION_DURATION_MILLIS_KEY", aVar.b), new Pair("HOSTS_FOR_OPEN_IN_SYSTEM_KEY", aVar.c), new Pair("ALLOWED_HOSTS_KEY", aVar.d), new Pair("JS_BRIDGE_ALLOWED_HOSTS_KEY", aVar.e), new Pair("FORBIDDEN_HOSTS_KEY", aVar.f), new Pair("WEBVIEW_HIDE_THRESHOLD_KEY", aVar.g), new Pair("WEBVIEW_DOWNWARD_SCROLL_FRICTION_KEY", aVar.h), new Pair("IS_PANEL_DIAGNOSTIC_ENABLED_KEY", aVar.i)));
        }
        return null;
    }

    @Override // com.yandex.plus.core.featureflags.w, defpackage.zqr
    public v get() {
        Object f = this.a.f.a().f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) f;
        return new v(aVar != null ? aVar.d : null);
    }
}

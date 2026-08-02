package com.yandex.plus.home.feature.panel.internal;

import android.content.Context;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a {
    public com.yandex.plus.ui.core.theme.a a;
    public Context b;

    public final int a() {
        return com.yandex.plus.home.common.utils.a.b(this.b, R.attr.plus_sdk_panelDefaultBackgroundColor);
    }

    public final String b(y yVar) {
        yVar.getClass();
        return u.r(this.b, this.a) ? yVar.b : yVar.a;
    }

    public final k c(v vVar) {
        vVar.getClass();
        return u.r(this.b, this.a) ? vVar.b : vVar.a;
    }

    public final k d(v vVar) {
        vVar.getClass();
        com.yandex.plus.core.data.common.f fVar = new com.yandex.plus.core.data.common.f(com.yandex.plus.home.common.utils.a.b(this.b, R.attr.plus_sdk_panelDefaultTextColor));
        k kVar = u.r(this.b, this.a) ? vVar.b : vVar.a;
        return kVar == null ? fVar : kVar;
    }

    public final com.yandex.plus.core.theme.c e(v vVar) {
        vVar.getClass();
        k kVar = u.r(this.b, this.a) ? vVar.b : vVar.a;
        com.yandex.plus.core.theme.c aVar = kVar instanceof com.yandex.plus.core.data.common.f ? new com.yandex.plus.core.theme.a(((com.yandex.plus.core.data.common.f) kVar).b) : kVar instanceof j ? new com.yandex.plus.core.theme.b(com.yandex.plus.bdui.plus.analytics.b.D(((j) kVar).b)) : null;
        return aVar == null ? new com.yandex.plus.core.theme.a(com.yandex.plus.home.common.utils.a.b(this.b, R.attr.plus_sdk_panelDefaultTextColor)) : aVar;
    }
}

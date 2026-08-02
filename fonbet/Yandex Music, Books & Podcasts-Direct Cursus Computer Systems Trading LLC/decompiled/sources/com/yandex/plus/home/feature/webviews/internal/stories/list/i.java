package com.yandex.plus.home.feature.webviews.internal.stories.list;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import defpackage.bsh;
import defpackage.jyr;
import defpackage.rar;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class i extends bsh {
    public final List g;
    public int h;
    public rar i;
    public z0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, kotlinx.coroutines.a aVar) {
        super(new h(), aVar);
        aVar.getClass();
        this.g = list;
        this.h = -1;
        this.j = z0.b;
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "init() urlList=".concat(CollectionsKt.X(list, null, null, null, null, 63));
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, concat, null);
    }
}

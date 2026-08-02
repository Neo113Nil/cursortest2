package io.appmetrica.analytics.identifiers.impl;

import com.adjust.sdk.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class d {
    public final Map a;

    public d() {
        this(kotlin.collections.b.i(new Pair(Constants.REFERRER_API_GOOGLE, new h()), new Pair("huawei", new j()), new Pair("yandex", new q())));
    }

    public d(Map map) {
        this.a = map;
    }
}

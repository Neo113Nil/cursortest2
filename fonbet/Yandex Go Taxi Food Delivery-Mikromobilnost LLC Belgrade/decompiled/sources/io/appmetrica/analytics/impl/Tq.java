package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public abstract class Tq {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("id", "scope", Constants.KEY_DATA, ClidProvider.TIMESTAMP);
}

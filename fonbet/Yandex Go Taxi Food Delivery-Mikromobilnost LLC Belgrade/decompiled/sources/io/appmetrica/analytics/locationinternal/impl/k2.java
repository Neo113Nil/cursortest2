package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public interface k2 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("incremental_id", ClidProvider.TIMESTAMP, Constants.KEY_DATA);
}

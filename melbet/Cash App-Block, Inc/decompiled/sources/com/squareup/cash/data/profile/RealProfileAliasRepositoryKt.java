package com.squareup.cash.data.profile;

import com.bugsnag.android.EventStore$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.UiAlias;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public abstract class RealProfileAliasRepositoryKt {
    public static final List TYPE_ORDER = CollectionsKt__CollectionsKt.listOf((Object[]) new UiAlias.Type[]{UiAlias.Type.APP, UiAlias.Type.SMS, UiAlias.Type.EMAIL});
    public static final EventStore$$ExternalSyntheticLambda0 COMPARATOR = new EventStore$$ExternalSyntheticLambda0(4);
}

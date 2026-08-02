package com.squareup.cash.cdf.moneybot;

import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public abstract class MoneybotActionCardResult implements Event {
    public static final zzb Companion = new zzb(25);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
}

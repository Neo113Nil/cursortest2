package com.squareup.cash.amountslider;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.ui.text.Placeholder;
import androidx.room.Room;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes5.dex */
public abstract class TickerAdapter {
    public static final Map tickerContent = MapsKt__MapsKt.mapOf(new Pair("ticker up", new InlineTextContent(new Placeholder(7, Room.getSp(16), Room.getSp(16)), TickersAmountCaptionKt.lambda$1638561047)), new Pair("ticker down", new InlineTextContent(new Placeholder(7, Room.getSp(16), Room.getSp(16)), TickersAmountCaptionKt.f143lambda$726175400)), new Pair("Spacer", new InlineTextContent(new Placeholder(7, Room.getSp(4), Room.getSp(0)), TickersAmountCaptionKt.lambda$1204055449)));
}

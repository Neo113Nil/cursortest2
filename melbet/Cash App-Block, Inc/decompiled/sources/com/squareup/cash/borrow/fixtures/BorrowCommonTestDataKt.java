package com.squareup.cash.borrow.fixtures;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Timeline;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public abstract class BorrowCommonTestDataKt {
    public static final Color cashGreenColorProto = new Color(new Color.ModeVariant("#FF00D64B", null, null, null, null, 30, null), new Color.ModeVariant("#FF00B840", null, null, null, null, 30, null), 4);
    public static final Color dangerColorProto = new Color(new Color.ModeVariant("#FFD3040E", null, null, null, null, 30, null), new Color.ModeVariant("#FFF84752", null, null, null, null, 30, null), 4);
    public static final Timeline threeWeekTimeline;

    static {
        Timeline.Event event = new Timeline.Event(Timeline.Event.Icon.HIGHLIGHT, "Fri, Feb 7", "$13.12", null, null, null, null, null, null, "event1", null, null, null, null, null, null, 65016, null);
        Timeline.Event.Icon icon = Timeline.Event.Icon.NORMAL;
        threeWeekTimeline = new Timeline(CollectionsKt__CollectionsKt.listOf((Object[]) new Timeline.Event[]{event, new Timeline.Event(icon, "Fri, Feb 14", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon, "Fri, Feb 21", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null)}));
    }
}

package com.squareup.cash.arcade.bindings.timeline;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda11;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda7;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda8;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.Timeline;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class TimelineProtoBindingKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Timeline.Event.State.values().length];
            try {
                iArr[Timeline.Event.State.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timeline.Event.State.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Timeline.Event.State.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Timeline.Event.State.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Timeline.Event.State.BYPASSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Timeline.Event.Icon.values().length];
            try {
                iArr2[Timeline.Event.Icon.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Timeline.Event.Icon.HIGHLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Timeline.Event.Icon.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Timeline.Event.Icon.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Timeline.Event.Icon.SKIPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Timeline.Event.Icon.MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Timeline.Event.Icon.HIGHLIGHT_COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Timeline.Event.Icon.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Timeline.Event.Icon.CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Timeline.Event.Icon.REFUNDED.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Timeline(Timeline timeline, Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function13;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        TimelineState timelineState;
        TimelineState rememberTimelineState;
        TimelineItem.State state;
        String str;
        IntRange until;
        timeline.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2057384182);
        int i4 = (gapComposer.changedInstance(timeline) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 256 : 128;
            i3 = i4 | 3072;
            int i6 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                function13 = function12;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda5(24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function14 = (Function1) rememberedValue;
                Timeline.CollapseRule collapseRule = timeline.collapse_rule;
                if (collapseRule instanceof Timeline.CollapseRule.CollapseRanges) {
                    gapComposer.startReplaceGroup(1461254351);
                    List<Timeline.CollapseRanges.Range> list = ((Timeline.CollapseRule.CollapseRanges) collapseRule).getValue().ranges;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (Timeline.CollapseRanges.Range range : list) {
                        if (range.collapse_end_index == null) {
                            Integer num = range.collapse_start_index;
                            num.getClass();
                            until = new IntRange(num.intValue(), Integer.MAX_VALUE, 1);
                        } else {
                            Integer num2 = range.collapse_start_index;
                            num2.getClass();
                            int intValue = num2.intValue();
                            Integer num3 = range.collapse_end_index;
                            num3.getClass();
                            until = RangesKt___RangesKt.until(intValue, num3.intValue());
                        }
                        LocalizedString localizedString = range.label;
                        arrayList.add(new TimelineState.CollapseRange(localizedString != null ? localizedString.translated_value : null, until));
                    }
                    rememberTimelineState = LazyGridDslKt.rememberTimelineState(Tags.toPersistentList(arrayList), gapComposer, 0);
                    gapComposer.end(false);
                } else if (collapseRule instanceof Timeline.CollapseRule.CollapsedSize) {
                    gapComposer.startReplaceGroup(1461275175);
                    rememberTimelineState = LazyGridDslKt.rememberTimelineState(gapComposer, ((Timeline.CollapseRule.CollapsedSize) collapseRule).getValue());
                    gapComposer.end(false);
                } else {
                    if (collapseRule != null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1461251260, false);
                    }
                    gapComposer.startReplaceGroup(1461278253);
                    TimelineState rememberTimelineState2 = LazyGridDslKt.rememberTimelineState(null, gapComposer, 1);
                    gapComposer.end(false);
                    timelineState = rememberTimelineState2;
                    List<Timeline.Event> list2 = timeline.events;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (Timeline.Event event : list2) {
                        Timeline.Event.State state2 = event.state;
                        if (state2 != null) {
                            int i7 = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
                            if (i7 == 1) {
                                state = TimelineItem.State.NotStarted;
                            } else if (i7 == 2) {
                                state = TimelineItem.State.Incomplete;
                            } else if (i7 == 3) {
                                state = TimelineItem.State.Pending;
                            } else if (i7 == 4) {
                                state = TimelineItem.State.Done;
                            } else {
                                if (i7 != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                state = TimelineItem.State.Skipped;
                            }
                        } else {
                            Timeline.Event.Icon icon = event.icon;
                            if (icon != null) {
                                switch (WhenMappings.$EnumSwitchMapping$1[icon.ordinal()]) {
                                    case 1:
                                        state = TimelineItem.State.NotStarted;
                                        break;
                                    case 2:
                                        state = TimelineItem.State.Incomplete;
                                        break;
                                    case 3:
                                        state = TimelineItem.State.Incomplete;
                                        break;
                                    case 4:
                                        state = TimelineItem.State.Done;
                                        break;
                                    case 5:
                                        state = TimelineItem.State.Skipped;
                                        break;
                                    case 6:
                                        state = TimelineItem.State.Skipped;
                                        break;
                                    case 7:
                                        state = TimelineItem.State.Done;
                                        break;
                                    case 8:
                                        state = TimelineItem.State.Skipped;
                                        break;
                                    case 9:
                                        state = TimelineItem.State.Skipped;
                                        break;
                                    case 10:
                                        state = TimelineItem.State.Done;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                }
                            } else {
                                state = TimelineItem.State.NotStarted;
                            }
                        }
                        TimelineItem.State state3 = state;
                        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new ReceiptTimelineKt$$ExternalSyntheticLambda7(event, 1), true, -1030072762);
                        String str2 = event.detail_text;
                        ComposableLambdaImpl composableLambdaImpl2 = str2 != null ? new ComposableLambdaImpl(new ReceiptTimelineKt$$ExternalSyntheticLambda8(str2, event, i6), true, 808816549) : null;
                        LocalizedString localizedString2 = event.body_text;
                        if (localizedString2 != null) {
                            str = localizedString2.translated_value;
                            str.getClass();
                        } else {
                            str = event.inline_description_text;
                            if (str == null) {
                                str = null;
                            }
                        }
                        ComposableLambdaImpl composableLambdaImpl3 = str != null ? new ComposableLambdaImpl(new ReceiptTimelineKt$$ExternalSyntheticLambda9(str, event, i6), true, 1326614396) : null;
                        LocalizedString localizedString3 = event.descriptor_text;
                        arrayList2.add(new TimelineItem(state3, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, localizedString3 != null ? new ComposableLambdaImpl(new BulletinTileKt$$ExternalSyntheticLambda5(localizedString3, 1), true, 277287068) : null, ((Boolean) function14.invoke(event)).booleanValue() ? new ReceiptTimelineKt$$ExternalSyntheticLambda11(function1, event, 1) : null, 64));
                    }
                    LazyListLayoutInfoKt.Timeline(timelineState, Tags.toImmutableList(arrayList2), modifier4, gapComposer, i3 & 896, 0);
                    modifier3 = modifier4;
                    function13 = function14;
                }
                timelineState = rememberTimelineState;
                List<Timeline.Event> list22 = timeline.events;
                ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                while (r4.hasNext()) {
                }
                LazyListLayoutInfoKt.Timeline(timelineState, Tags.toImmutableList(arrayList22), modifier4, gapComposer, i3 & 896, 0);
                modifier3 = modifier4;
                function13 = function14;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(timeline, function1, modifier3, function13, i, i2, 5);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4 | 3072;
        int i62 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}

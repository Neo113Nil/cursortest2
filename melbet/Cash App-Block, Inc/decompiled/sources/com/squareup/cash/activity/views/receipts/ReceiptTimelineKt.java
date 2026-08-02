package com.squareup.cash.activity.views.receipts;

import androidx.biometric.KeyguardUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.AttributeRange;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.util.Strings;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes5.dex */
public abstract class ReceiptTimelineKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Timeline.Event.State.values().length];
            try {
                iArr[Timeline.Event.State.INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timeline.Event.State.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Timeline.Event.State.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Timeline.Event.State.BYPASSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Timeline.Event.State.NOT_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Timeline(final ReceiptSection.TimelineEntry timelineEntry, final Function1 function1, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        timelineEntry.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-759734304);
        int i2 = (gapComposer.changedInstance(timelineEntry) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Timeline timeline = timelineEntry.timeline;
            if (timeline == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(timelineEntry, function1, i, r4) { // from class: com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda2
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ReceiptSection.TimelineEntry f$0;
                        public final /* synthetic */ Function1 f$1;

                        {
                            this.$r8$classId = r4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    ReceiptTimelineKt.Timeline(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ReceiptTimelineKt.Timeline(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            TimelineState rememberTimelineState = rememberTimelineState(timeline, gapComposer);
            int i4 = (gapComposer.changedInstance(timelineEntry) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CombinedModifier$$ExternalSyntheticLambda0(23, function1, timelineEntry);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyListLayoutInfoKt.Timeline(rememberTimelineState, rememberTimelineItems(timeline, (Function1) rememberedValue, gapComposer), null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(timelineEntry, function1, i, i3) { // from class: com.squareup.cash.activity.views.receipts.ReceiptTimelineKt$$ExternalSyntheticLambda2
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ReceiptSection.TimelineEntry f$0;
                public final /* synthetic */ Function1 f$1;

                {
                    this.$r8$classId = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            ReceiptTimelineKt.Timeline(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ReceiptTimelineKt.Timeline(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0537 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0531  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineDetailsOverlayContent(Modifier modifier, ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier.Companion companion;
        ?? r0;
        Color m;
        long j;
        GapComposer gapComposer2;
        boolean z;
        boolean z2;
        SpanStyle spanStyle;
        SpanStyle spanStyle2;
        Color m2;
        AnnotatedString.Range range;
        Color m3;
        long j2;
        Color m4;
        long j3;
        eventDetailsOverlay.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-238634682);
        int i2 = i | (gapComposer3.changed(modifier) ? 4 : 2) | (gapComposer3.changedInstance(eventDetailsOverlay) ? 32 : 16);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer3).semantic.background.f1047app, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ReceiptSection.TimelineEntry.EventDetailsOverlay.Title title = eventDetailsOverlay.title;
            boolean z3 = title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z3) {
                gapComposer3.startReplaceGroup(-1256477771);
                Strings.getSizes(gapComposer3).getClass();
                companion = companion2;
                r0 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).header, (TextLineBalancing) null, ((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) title).getValue(), (Map) null, (Function1) null, false);
                gapComposer3.end(false);
            } else {
                companion = companion2;
                r0 = 0;
                gapComposer3.startReplaceGroup(-2118733568);
                gapComposer3.end(false);
            }
            String str = eventDetailsOverlay.subtitle_text;
            if (str == null) {
                gapComposer3.startReplaceGroup(-1256170438);
                gapComposer3.end(r0);
            } else {
                gapComposer3.startReplaceGroup(-1256170437);
                Strings.getSizes(gapComposer3).getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = Strings.getTypography(gapComposer3).bodyMedium;
                com.squareup.protos.cash.ui.Color color = eventDetailsOverlay.subtitle_text_color;
                if (color == null) {
                    gapComposer3.startReplaceGroup(644008130);
                    gapComposer3.end(r0);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -810509537, color, gapComposer3, (boolean) r0);
                }
                if (m == null) {
                    gapComposer3.startReplaceGroup(-810507653);
                    j = Strings.getColors(gapComposer3).semantic.text.subtle;
                    gapComposer3.end(r0);
                } else {
                    gapComposer3.startReplaceGroup(-810510753);
                    gapComposer3.end(r0);
                    j = m.value;
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer3.end(r0);
            }
            DBUtil.SpacerWithinSectionMedium(r0, 1, gapComposer3, null);
            String str2 = eventDetailsOverlay.body_text;
            if (str2 == null) {
                gapComposer3.startReplaceGroup(-1255774010);
                gapComposer3.end(r0);
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1255774009);
                Strings.getSizes(gapComposer3).getClass();
                KeyguardUtils.m14MarkdownTextnvClB8o(str2, null, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).bodyMedium, Strings.getColors(gapComposer3).semantic.text.subtle, null, null, 0, 0, null, 0, gapComposer3, 48, 2016);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(r0);
                gapComposer2 = gapComposer4;
            }
            gapComposer2.startReplaceGroup(-2118707162);
            List<ReceiptSection.TimelineEntry.UnorderedListItem> list = eventDetailsOverlay.list_items;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = r0; i3 < size; i3++) {
                ReceiptSection.TimelineEntry.UnorderedListItem unorderedListItem = list.get(i3);
                gapComposer2.startReplaceGroup(-2118704997);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                com.squareup.protos.cash.ui.Color color2 = unorderedListItem.label_color;
                if (color2 == null) {
                    gapComposer2.startReplaceGroup(-1458869723);
                    gapComposer2.end(r0);
                    m3 = null;
                } else {
                    m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1754055004, color2, gapComposer2, (boolean) r0);
                }
                if (m3 == null) {
                    gapComposer2.startReplaceGroup(1754056504);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, (boolean) r0);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(r0);
                    }
                    j2 = colors.semantic.text.subtle;
                    gapComposer2.end(r0);
                } else {
                    gapComposer2.startReplaceGroup(1754054489);
                    gapComposer2.end(r0);
                    j2 = m3.value;
                }
                builder.pushStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                String str3 = unorderedListItem.label;
                if (str3 != null) {
                    Worker.DefaultImpls.appendMarkdown$default(builder, str3, null, 6);
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer2.end(r0);
                gapComposer2.startReplaceGroup(-2118694661);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                com.squareup.protos.cash.ui.Color color3 = unorderedListItem.value_color;
                if (color3 == null) {
                    gapComposer2.startReplaceGroup(599736547);
                    gapComposer2.end(r0);
                    m4 = null;
                } else {
                    m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1959008990, color3, gapComposer2, (boolean) r0);
                }
                if (m4 == null) {
                    gapComposer2.startReplaceGroup(1959010490);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, (boolean) r0);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(r0);
                    }
                    j3 = colors2.semantic.text.subtle;
                    gapComposer2.end(r0);
                } else {
                    gapComposer2.startReplaceGroup(1959008475);
                    gapComposer2.end(r0);
                    j3 = m4.value;
                }
                builder2.pushStyle(new SpanStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                String str4 = unorderedListItem.value;
                if (str4 != null) {
                    Worker.DefaultImpls.appendMarkdown$default(builder2, str4, null, 6);
                }
                AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                gapComposer2.end(r0);
                arrayList.add(new ListUnorderedItem(annotatedString, (Icons) null, annotatedString2, (AnnotatedString) null));
            }
            gapComposer2.end(r0);
            AbstractPersistentList persistentList = Tags.toPersistentList(arrayList);
            if (persistentList.isEmpty()) {
                z = true;
                gapComposer2.startReplaceGroup(-1254529018);
                gapComposer2.end(r0);
            } else {
                gapComposer2.startReplaceGroup(-1254657017);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                z = true;
                ListUnorderedKt.ListUnordered(persistentList, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer2, 0, 60);
                gapComposer2.end(r0);
            }
            String str5 = eventDetailsOverlay.legal_text;
            if (str5 == null) {
                gapComposer2.startReplaceGroup(-1254464942);
                gapComposer2.end(r0);
                z2 = z;
            } else {
                gapComposer2.startReplaceGroup(-1254464941);
                gapComposer2.startReplaceGroup(-2118671778);
                List<AttributeRange> list2 = eventDetailsOverlay.legal_text_attribute_ranges;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = r0; i4 < size2; i4++) {
                    AttributeRange attributeRange = list2.get(i4);
                    AttributeRange.Attribute attribute = attributeRange.attribute;
                    if (attribute instanceof AttributeRange.Attribute.Bold) {
                        gapComposer2.startReplaceGroup(-266128051);
                        gapComposer2.end(r0);
                        spanStyle2 = new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531);
                    } else if (attribute instanceof AttributeRange.Attribute.ForegroundColor) {
                        gapComposer2.startReplaceGroup(-266124908);
                        com.squareup.protos.cash.ui.Color color4 = ((AttributeRange.Attribute.ForegroundColor) attribute).getValue().color;
                        if (color4 == null) {
                            gapComposer2.startReplaceGroup(340105969);
                            gapComposer2.end(r0);
                            m2 = null;
                        } else {
                            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -266123504, color4, gapComposer2, (boolean) r0);
                        }
                        spanStyle2 = new SpanStyle(m2 != null ? m2.value : Color.Unspecified, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
                        gapComposer2.end(r0);
                    } else if (attribute instanceof AttributeRange.Attribute.StrikeThrough) {
                        gapComposer2.startReplaceGroup(-266120644);
                        gapComposer2.end(r0);
                        spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439);
                    } else if (attribute instanceof AttributeRange.Attribute.Underline) {
                        gapComposer2.startReplaceGroup(-266117446);
                        gapComposer2.end(r0);
                        spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61439);
                    } else if (attribute instanceof AttributeRange.Attribute.Faded) {
                        gapComposer2.startReplaceGroup(-266114432);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, (boolean) r0);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(r0);
                        }
                        spanStyle2 = new SpanStyle(colors3.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
                        gapComposer2.end(r0);
                    } else {
                        gapComposer2.startReplaceGroup(340455959);
                        gapComposer2.end(r0);
                        spanStyle = null;
                        if (spanStyle == null) {
                            Integer num = attributeRange.begin_index_inclusive;
                            int intValue = num != null ? num.intValue() : r0;
                            Integer num2 = attributeRange.end_index_inclusive;
                            range = new AnnotatedString.Range(spanStyle, intValue, num2 != null ? num2.intValue() : r0);
                        } else {
                            range = null;
                        }
                        if (range == null) {
                            arrayList2.add(range);
                        }
                    }
                    spanStyle = spanStyle2;
                    if (spanStyle == null) {
                    }
                    if (range == null) {
                    }
                }
                gapComposer2.end(r0);
                AnnotatedString annotatedString3 = new AnnotatedString(str5, (List) arrayList2);
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer2).getClass();
                Strings.getSizes(gapComposer2).getClass();
                z2 = z;
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), annotatedString3, Strings.getTypography(gapComposer2).bodyXSmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer2.end(r0);
            }
            gapComposer2.end(z2);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(modifier, eventDetailsOverlay, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractPersistentList rememberTimelineItems(Timeline timeline, Function1 function1, Composer composer) {
        TimelineItem.State state;
        String str;
        ComposableLambdaImpl composableLambdaImpl;
        String str2;
        ComposableLambdaImpl composableLambdaImpl2;
        String str3;
        ComposableLambdaImpl composableLambdaImpl3;
        boolean changed;
        Object rememberedValue;
        timeline.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-385665062);
        List<Timeline.Event> list = timeline.events;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Timeline.Event event = list.get(i2);
            Timeline.Event.State state2 = event.state;
            int i3 = state2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    state = TimelineItem.State.Incomplete;
                } else if (i3 == 2) {
                    state = TimelineItem.State.Pending;
                } else if (i3 == 3) {
                    state = TimelineItem.State.Done;
                } else if (i3 == 4) {
                    state = TimelineItem.State.Skipped;
                } else if (i3 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TimelineItem.State state3 = state;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(879637374, new ReceiptTimelineKt$$ExternalSyntheticLambda7(event, 0), gapComposer);
                str = event.detail_text;
                if (str != null) {
                    gapComposer.startReplaceGroup(-1152332229);
                    gapComposer.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(-1152332228);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1723401855, new ReceiptTimelineKt$$ExternalSyntheticLambda8(str, event, 0), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl = rememberComposableLambda2;
                }
                LocalizedString localizedString = event.body_text;
                str2 = localizedString == null ? localizedString.translated_value : null;
                if (str2 != null) {
                    gapComposer.startReplaceGroup(-1152156707);
                    gapComposer.end(false);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer.startReplaceGroup(-1152156706);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1392214568, new ReceiptTimelineKt$$ExternalSyntheticLambda9(str2, event, i), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl2 = rememberComposableLambda3;
                }
                LocalizedString localizedString2 = event.descriptor_text;
                str3 = localizedString2 == null ? localizedString2.translated_value : null;
                if (str3 != null) {
                    gapComposer.startReplaceGroup(-1151979046);
                    gapComposer.end(false);
                    composableLambdaImpl3 = null;
                } else {
                    gapComposer.startReplaceGroup(-1151979045);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(868862397, new ToastKt$$ExternalSyntheticLambda1(str3, 9), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl3 = rememberComposableLambda4;
                }
                changed = gapComposer.changed(function1) | gapComposer.changedInstance(event);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ReceiptTimelineKt$$ExternalSyntheticLambda11(function1, event, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                arrayList.add(new TimelineItem(state3, rememberComposableLambda, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, (event.tap_action_url == null || event.id != null) ? (Function0) rememberedValue : null, 64));
            }
            state = TimelineItem.State.NotStarted;
            TimelineItem.State state32 = state;
            ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(879637374, new ReceiptTimelineKt$$ExternalSyntheticLambda7(event, 0), gapComposer);
            str = event.detail_text;
            if (str != null) {
            }
            LocalizedString localizedString3 = event.body_text;
            if (localizedString3 == null) {
            }
            if (str2 != null) {
            }
            LocalizedString localizedString22 = event.descriptor_text;
            if (localizedString22 == null) {
            }
            if (str3 != null) {
            }
            changed = gapComposer.changed(function1) | gapComposer.changedInstance(event);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new ReceiptTimelineKt$$ExternalSyntheticLambda11(function1, event, 0);
            gapComposer.updateRememberedValue(rememberedValue);
            arrayList.add(new TimelineItem(state32, rememberComposableLambda5, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, (event.tap_action_url == null || event.id != null) ? (Function0) rememberedValue : null, 64));
        }
        gapComposer.end(false);
        return Tags.toPersistentList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final TimelineState rememberTimelineState(Timeline timeline, Composer composer) {
        ?? listOf;
        timeline.getClass();
        Timeline.CollapseRule collapseRule = timeline.collapse_rule;
        if (collapseRule instanceof Timeline.CollapseRule.CollapseRanges) {
            List<Timeline.CollapseRanges.Range> list = ((Timeline.CollapseRule.CollapseRanges) collapseRule).getValue().ranges;
            listOf = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Timeline.CollapseRanges.Range range = list.get(i);
                Integer num = range.collapse_start_index;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = range.collapse_end_index;
                listOf.add(new TimelineState.CollapseRange(null, num2 == null ? new IntRange(intValue, Integer.MAX_VALUE, 1) : RangesKt___RangesKt.until(intValue, num2.intValue())));
            }
        } else {
            listOf = collapseRule instanceof Timeline.CollapseRule.CollapsedSize ? CollectionsKt__CollectionsJVMKt.listOf(new TimelineState.CollapseRange(null, new IntRange(((Timeline.CollapseRule.CollapsedSize) collapseRule).getValue(), Integer.MAX_VALUE, 1))) : EmptyList.INSTANCE;
        }
        return LazyGridDslKt.rememberTimelineState(Tags.toPersistentList((Iterable) listOf), composer, 0);
    }

    public static final void Timeline(Timeline timeline, Function1 function1, Composer composer, int i) {
        timeline.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1625410370);
        int i2 = (gapComposer.changedInstance(timeline) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TimelineState rememberTimelineState = rememberTimelineState(timeline, gapComposer);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyListLayoutInfoKt.Timeline(rememberTimelineState, rememberTimelineItems(timeline, (Function1) rememberedValue, gapComposer), null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(timeline, function1, i, 26);
        }
    }
}

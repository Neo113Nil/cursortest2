package com.squareup.cash.calendar.views;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.size.DimensionKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.protos.common.CurrencyCode;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class CalendarRowKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Function1 f$9;

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda2(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, Function1 function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i) {
        this.f$0 = textFieldSelectionManager;
        this.f$1 = legacyTextFieldState;
        this.f$6 = z;
        this.f$7 = z2;
        this.f$9 = function1;
        this.f$2 = textFieldValue;
        this.f$8 = offsetMapping;
        this.f$10 = density;
        this.f$3 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
    
        if (r6 != false) goto L27;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = true;
        Object obj3 = this.f$0;
        Object obj4 = this.f$10;
        Object obj5 = this.f$8;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CanvasCompatO.CalendarRow((Modifier) obj3, (List) obj7, (ScheduleCalendarDate) obj6, this.f$3, this.f$6, this.f$7, (CalendarDateItemStyle) obj5, this.f$9, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(12582913));
                return Unit.INSTANCE;
            case 1:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj3;
                final LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj7;
                final TextFieldValue textFieldValue = (TextFieldValue) obj6;
                final OffsetMapping offsetMapping = (OffsetMapping) obj5;
                final Density density = (Density) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    final Function1 function1 = this.f$9;
                    final int i2 = this.f$3;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            legacyTextFieldState2.textDelegate.layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                            ComponentRegistry.Builder builder = legacyTextFieldState2.textDelegate.paragraphIntrinsics;
                            if (builder != null) {
                                return BasicTextKt.ceilToIntPx(builder.getMaxIntrinsicWidth());
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("layoutIntrinsics must be called first");
                            return 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x01c6  */
                        /* JADX WARN: Removed duplicated region for block: B:44:0x01f1  */
                        /* JADX WARN: Removed duplicated region for block: B:47:0x01fc  */
                        /* JADX WARN: Removed duplicated region for block: B:49:0x01e9  */
                        /* JADX WARN: Type inference failed for: r14v1 */
                        /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.ui.layout.LayoutCoordinates] */
                        /* JADX WARN: Type inference failed for: r14v6 */
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                            long j2;
                            TextLayoutResult textLayoutResult;
                            LayoutDirection layoutDirection;
                            MeasureResult measureResult;
                            TextLayoutResult textLayoutResult2;
                            int i3;
                            CoreTextFieldKt$CoreTextField$8$1$1$2 coreTextFieldKt$CoreTextField$8$1$1$2;
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                TextLayoutResult textLayoutResult3 = layoutResult != null ? layoutResult.value : null;
                                TextDelegate textDelegate = legacyTextFieldState2.textDelegate;
                                LayoutDirection layoutDirection2 = measureScope.getLayoutDirection();
                                int i4 = textDelegate.overflow;
                                boolean z2 = textDelegate.softWrap;
                                int i5 = textDelegate.maxLines;
                                if (textLayoutResult3 != null) {
                                    MultiParagraph multiParagraph = textLayoutResult3.multiParagraph;
                                    TextLayoutInput textLayoutInput = textLayoutResult3.layoutInput;
                                    AnnotatedString annotatedString = textDelegate.text;
                                    TextStyle textStyle = textDelegate.style;
                                    List list2 = textDelegate.placeholders;
                                    measureResult = null;
                                    Density density2 = textDelegate.density;
                                    FontFamilyResolverImpl fontFamilyResolverImpl = textDelegate.fontFamilyResolver;
                                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                                    if (multiParagraph.intrinsics.getHasStaleResolvedFonts()) {
                                        j2 = j;
                                        layoutDirection = layoutDirection2;
                                    } else {
                                        AnnotatedString annotatedString2 = textLayoutInput.text;
                                        long j3 = textLayoutInput.constraints;
                                        if (Intrinsics.areEqual(annotatedString2, annotatedString) && textLayoutInput.style.hasSameLayoutAffectingAttributes(textStyle) && Intrinsics.areEqual(textLayoutInput.placeholders, list2) && textLayoutInput.maxLines == i5 && textLayoutInput.softWrap == z2 && textLayoutInput.overflow == i4 && Intrinsics.areEqual(textLayoutInput.density, density2)) {
                                            layoutDirection = layoutDirection2;
                                            if (textLayoutInput.layoutDirection == layoutDirection && Intrinsics.areEqual(textLayoutInput.fontFamilyResolver, fontFamilyResolverImpl) && Constraints.m1027getMinWidthimpl(j) == Constraints.m1027getMinWidthimpl(j3) && ((!z2 && i4 != 2) || (Constraints.m1025getMaxWidthimpl(j) == Constraints.m1025getMaxWidthimpl(j3) && Constraints.m1024getMaxHeightimpl(j) == Constraints.m1024getMaxHeightimpl(j3)))) {
                                                textLayoutResult = textLayoutResult4;
                                                textLayoutResult2 = new TextLayoutResult(new TextLayoutInput(textLayoutInput.text, textDelegate.style, textLayoutInput.placeholders, textLayoutInput.maxLines, textLayoutInput.softWrap, textLayoutInput.overflow, textLayoutInput.density, textLayoutInput.layoutDirection, textLayoutInput.fontFamilyResolver, j), multiParagraph, ConstraintsKt.m1030constrain4WqzIAM(j, (BasicTextKt.ceilToIntPx(multiParagraph.height) & BodyPartID.bodyIdMax) | (BasicTextKt.ceilToIntPx(multiParagraph.width) << 32)));
                                                long j4 = textLayoutResult2.size;
                                                Integer valueOf = Integer.valueOf((int) (j4 >> 32));
                                                Integer valueOf2 = Integer.valueOf((int) (j4 & BodyPartID.bodyIdMax));
                                                int intValue2 = valueOf.intValue();
                                                int intValue3 = valueOf2.intValue();
                                                if (Intrinsics.areEqual(textLayoutResult, textLayoutResult2)) {
                                                    legacyTextFieldState2.layoutResultState.setValue(new TextLayoutResultProxy(layoutResult != null ? layoutResult.decorationBoxCoordinates : measureResult, textLayoutResult2));
                                                    i3 = 0;
                                                    legacyTextFieldState2.isLayoutResultStale = false;
                                                    coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                                                    function1.invoke(textLayoutResult2);
                                                    KeyMappingKt.notifyFocusedRect(legacyTextFieldState2, textFieldValue, offsetMapping);
                                                } else {
                                                    i3 = 0;
                                                    coreTextFieldKt$CoreTextField$8$1$1$2 = this;
                                                }
                                                legacyTextFieldState2.minHeightForSingleLineField$delegate.setValue(new Dp(density.mo233toDpu2uoSUM(i2 != 1 ? BasicTextKt.ceilToIntPx(textLayoutResult2.multiParagraph.getLineBottom(i3)) : i3)));
                                                return measureScope.layout(intValue2, intValue3, MapsKt__MapsKt.mapOf(new Pair(AlignmentLineKt.FirstBaseline, Integer.valueOf(Math.round(textLayoutResult2.firstBaseline))), new Pair(AlignmentLineKt.LastBaseline, Integer.valueOf(Math.round(textLayoutResult2.lastBaseline)))), new BasicTextKt$$ExternalSyntheticLambda14(15));
                                            }
                                            j2 = j;
                                        } else {
                                            j2 = j;
                                            textLayoutResult = textLayoutResult4;
                                            layoutDirection = layoutDirection2;
                                        }
                                    }
                                    textLayoutResult = textLayoutResult4;
                                } else {
                                    j2 = j;
                                    textLayoutResult = textLayoutResult3;
                                    layoutDirection = layoutDirection2;
                                    measureResult = null;
                                }
                                textDelegate.layoutIntrinsics(layoutDirection);
                                int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j2);
                                int m1025getMaxWidthimpl = ((z2 || i4 == 2) && Constraints.m1021getHasBoundedWidthimpl(j2)) ? Constraints.m1025getMaxWidthimpl(j2) : Integer.MAX_VALUE;
                                int i6 = (z2 || i4 != 2) ? i5 : 1;
                                if (m1027getMinWidthimpl != m1025getMaxWidthimpl) {
                                    ComponentRegistry.Builder builder = textDelegate.paragraphIntrinsics;
                                    if (builder == null) {
                                        a$$ExternalSyntheticBUOutline0.m$1("layoutIntrinsics must be called first");
                                        return measureResult;
                                    }
                                    m1025getMaxWidthimpl = RangesKt___RangesKt.coerceIn(BasicTextKt.ceilToIntPx(builder.getMaxIntrinsicWidth()), m1027getMinWidthimpl, m1025getMaxWidthimpl);
                                }
                                ComponentRegistry.Builder builder2 = textDelegate.paragraphIntrinsics;
                                if (builder2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("layoutIntrinsics must be called first");
                                    return measureResult;
                                }
                                textLayoutResult2 = new TextLayoutResult(new TextLayoutInput(textDelegate.text, textDelegate.style, textDelegate.placeholders, textDelegate.maxLines, textDelegate.softWrap, textDelegate.overflow, textDelegate.density, layoutDirection, textDelegate.fontFamilyResolver, j2), new MultiParagraph(builder2, DimensionKt.m1465fitPrioritizingWidthZbe2FdA(0, m1025getMaxWidthimpl, 0, Constraints.m1024getMaxHeightimpl(j2)), i6, textDelegate.overflow), ConstraintsKt.m1030constrain4WqzIAM(j2, (BasicTextKt.ceilToIntPx(r25.width) << 32) | (BasicTextKt.ceilToIntPx(r25.height) & BodyPartID.bodyIdMax)));
                                long j42 = textLayoutResult2.size;
                                Integer valueOf3 = Integer.valueOf((int) (j42 >> 32));
                                Integer valueOf22 = Integer.valueOf((int) (j42 & BodyPartID.bodyIdMax));
                                int intValue22 = valueOf3.intValue();
                                int intValue32 = valueOf22.intValue();
                                if (Intrinsics.areEqual(textLayoutResult, textLayoutResult2)) {
                                }
                                legacyTextFieldState2.minHeightForSingleLineField$delegate.setValue(new Dp(density.mo233toDpu2uoSUM(i2 != 1 ? BasicTextKt.ceilToIntPx(textLayoutResult2.multiParagraph.getLineBottom(i3)) : i3)));
                                return measureScope.layout(intValue22, intValue32, MapsKt__MapsKt.mapOf(new Pair(AlignmentLineKt.FirstBaseline, Integer.valueOf(Math.round(textLayoutResult2.firstBaseline))), new Pair(AlignmentLineKt.LastBaseline, Integer.valueOf(Math.round(textLayoutResult2.lastBaseline)))), new BasicTextKt$$ExternalSyntheticLambda14(15));
                            } finally {
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            }
                        }
                    };
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.end(true);
                    HandleState handleState = legacyTextFieldState.getHandleState();
                    HandleState handleState2 = HandleState.None;
                    boolean z2 = this.f$6;
                    if (handleState != handleState2 && legacyTextFieldState.getLayoutCoordinates() != null) {
                        LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
                        layoutCoordinates.getClass();
                        if (layoutCoordinates.isAttached()) {
                        }
                    }
                    z = false;
                    KeyMappingKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, gapComposer, 0);
                    if (legacyTextFieldState.getHandleState() == HandleState.Cursor && !this.f$7 && z2) {
                        gapComposer.startReplaceGroup(-714666198);
                        KeyMappingKt.TextFieldCursorHandle(textFieldSelectionManager, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-714589318);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeAmountCustom((CurrencyCode) obj7, (String) obj6, this.f$6, (String) obj5, this.f$7, this.f$9, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda2(Modifier modifier, List list, ScheduleCalendarDate scheduleCalendarDate, int i, boolean z, boolean z2, CalendarDateItemStyle calendarDateItemStyle, Function1 function1, Function1 function12, int i2) {
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = scheduleCalendarDate;
        this.f$3 = i;
        this.f$6 = z;
        this.f$7 = z2;
        this.f$8 = calendarDateItemStyle;
        this.f$9 = function1;
        this.f$10 = function12;
    }

    public /* synthetic */ CalendarRowKt$$ExternalSyntheticLambda2(CurrencyCode currencyCode, String str, boolean z, String str2, boolean z2, Function1 function1, Function0 function0, Modifier modifier, int i) {
        this.f$1 = currencyCode;
        this.f$2 = str;
        this.f$6 = z;
        this.f$8 = str2;
        this.f$7 = z2;
        this.f$9 = function1;
        this.f$10 = function0;
        this.f$0 = modifier;
        this.f$3 = i;
    }
}

package androidx.compose.material3;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.bumptech.glide.provider.EncoderRegistry;
import com.squareup.cash.R;
import com.squareup.cash.db2.entities.SyncEntityQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$2$1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreDigit$1$1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class DatePickerKt {
    public static final PaddingValuesImpl DatePickerModeTogglePadding = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 12.0f, 3);
    public static final PaddingValuesImpl DatePickerTitlePadding = SpacerKt.m297PaddingValuesa9UjIt4$default(24.0f, 16.0f, 12.0f, RecyclerView.DECELERATION_RATE, 8);
    public static final PaddingValuesImpl DatePickerHeadlinePadding = SpacerKt.m297PaddingValuesa9UjIt4$default(24.0f, RecyclerView.DECELERATION_RATE, 12.0f, 12.0f, 2);
    public static final float YearsVerticalPadding = 16.0f;

    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m525DateEntryContainerau3_HiA(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, DatePickerColors datePickerColors, TextStyle textStyle, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Function2 function24;
        Function2 function25;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1539132883);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function24 = function22;
            i2 |= gapComposer2.changedInstance(function24) ? 256 : 128;
        } else {
            function24 = function22;
        }
        if ((i & 3072) == 0) {
            function25 = function23;
            i2 |= gapComposer2.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function23;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(datePickerColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(textStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(f) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 4793491) != 4793490)) {
            Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(modifier, DatePickerModalTokens.ContainerWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(19);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SemanticsModifierKt.semantics(m289sizeInqDBjuR0$default, false, (Function1) rememberedValue), datePickerColors.containerColor, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            m526DatePickerHeaderpc5RIQQ(function2, datePickerColors.titleContentColor, datePickerColors.headlineContentColor, f, Expect_jvmKt.rememberComposableLambda(-1658370654, new DatePickerKt$DatePicker$6(function24, function25, function2, datePickerColors, textStyle, 2), gapComposer2), gapComposer2, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            gapComposer = gapComposer2;
            Recorder$$ExternalSyntheticOutline2.m((i3 >> 21) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda3(modifier, function2, function22, function23, datePickerColors, textStyle, f, composableLambdaImpl, i);
        }
    }

    public static final void DatePicker(final DatePickerStateImpl datePickerStateImpl, Modifier modifier, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerColors datePickerColors, Function2 function2, Function2 function22, boolean z, FocusRequester focusRequester, Composer composer, int i) {
        Modifier modifier2;
        DatePickerFormatterImpl datePickerFormatterImpl2;
        final DatePickerColors datePickerColors2;
        Function2 function23;
        Function2 function24;
        boolean z2;
        GapComposer gapComposer;
        FocusRequester focusRequester2;
        Function2 rememberComposableLambda;
        FocusRequester focusRequester3;
        Function2 function25;
        DatePickerFormatterImpl datePickerFormatterImpl3;
        Modifier modifier3;
        boolean z3;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1105472031);
        int i2 = 2;
        int i3 = i | (gapComposer2.changed(datePickerStateImpl) ? 4 : 2) | 14378160;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer2.startDefaults();
            int i6 = i & 1;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i6 == 0 || gapComposer2.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                    rememberedValue = new DatePickerFormatterImpl();
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                DatePickerFormatterImpl datePickerFormatterImpl4 = (DatePickerFormatterImpl) rememberedValue;
                DatePickerDefaults datePickerDefaults2 = DatePickerDefaults.INSTANCE;
                datePickerColors2 = DatePickerDefaults.colors(gapComposer2);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1655706771, new Function2() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i4;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        DatePickerStateImpl datePickerStateImpl2 = datePickerStateImpl;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Number) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    DatePickerDefaults.INSTANCE.m523DatePickerTitleFNtVw6o(datePickerStateImpl2.m529getDisplayModejFl4v0(), 3120, datePickerColors2.titleContentColor, gapComposer3, SpacerKt.padding(companion, DatePickerKt.DatePickerTitlePadding));
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Number) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier padding = SpacerKt.padding(companion, DatePickerKt.DatePickerModeTogglePadding);
                                    int m529getDisplayModejFl4v0 = datePickerStateImpl2.m529getDisplayModejFl4v0();
                                    boolean changed = gapComposer4.changed(datePickerStateImpl2);
                                    Object rememberedValue2 = gapComposer4.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.Companion.Empty) {
                                        rememberedValue2 = new DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0(datePickerStateImpl2, 0);
                                        gapComposer4.updateRememberedValue(rememberedValue2);
                                    }
                                    DatePickerKt.m527DisplayModeToggleButtoniUJLfQg(padding, m529getDisplayModejFl4v0, (Function1) rememberedValue2, datePickerColors2, gapComposer4, 6);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1439279037, new TooltipKt$TooltipBox$3(i2, datePickerStateImpl, datePickerFormatterImpl4, datePickerColors2), gapComposer2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
                }
                focusRequester3 = (FocusRequester) rememberedValue2;
                function25 = rememberComposableLambda2;
                datePickerFormatterImpl3 = datePickerFormatterImpl4;
                modifier3 = Modifier.Companion.$$INSTANCE;
                z3 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
                datePickerFormatterImpl3 = datePickerFormatterImpl;
                datePickerColors2 = datePickerColors;
                rememberComposableLambda = function2;
                function25 = function22;
                z3 = z;
                focusRequester3 = focusRequester;
            }
            gapComposer2.endDefaults();
            boolean changed = gapComposer2.changed(datePickerStateImpl.locale);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = datePickerStateImpl.calendarModel;
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            CalendarModelImpl calendarModelImpl = (CalendarModelImpl) rememberedValue3;
            if (z3) {
                gapComposer2.startReplaceGroup(-690551113);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1483431603, new Function2() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i5;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        DatePickerStateImpl datePickerStateImpl2 = datePickerStateImpl;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Number) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    DatePickerDefaults.INSTANCE.m523DatePickerTitleFNtVw6o(datePickerStateImpl2.m529getDisplayModejFl4v0(), 3120, datePickerColors2.titleContentColor, gapComposer3, SpacerKt.padding(companion, DatePickerKt.DatePickerTitlePadding));
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Number) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier padding = SpacerKt.padding(companion, DatePickerKt.DatePickerModeTogglePadding);
                                    int m529getDisplayModejFl4v0 = datePickerStateImpl2.m529getDisplayModejFl4v0();
                                    boolean changed2 = gapComposer4.changed(datePickerStateImpl2);
                                    Object rememberedValue22 = gapComposer4.rememberedValue();
                                    if (changed2 || rememberedValue22 == Composer.Companion.Empty) {
                                        rememberedValue22 = new DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0(datePickerStateImpl2, 0);
                                        gapComposer4.updateRememberedValue(rememberedValue22);
                                    }
                                    DatePickerKt.m527DisplayModeToggleButtoniUJLfQg(padding, m529getDisplayModejFl4v0, (Function1) rememberedValue22, datePickerColors2, gapComposer4, 6);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-690163489);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            }
            DatePickerFormatterImpl datePickerFormatterImpl5 = datePickerFormatterImpl3;
            FocusRequester focusRequester4 = focusRequester3;
            Function2 function26 = function25;
            Function2 function27 = rememberComposableLambda;
            m525DateEntryContainerau3_HiA(modifier3, function27, function26, composableLambdaImpl, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.HeaderHeadlineFont, gapComposer2), DatePickerModalTokens.HeaderContainerHeight, Expect_jvmKt.rememberComposableLambda(-1346903698, new DatePickerKt$DatePicker$6(datePickerStateImpl, calendarModelImpl, datePickerFormatterImpl5, datePickerColors2, focusRequester4, 0), gapComposer2), gapComposer2, 14156214);
            function23 = function27;
            function24 = function26;
            z2 = z3;
            datePickerFormatterImpl2 = datePickerFormatterImpl5;
            modifier2 = modifier3;
            gapComposer = gapComposer2;
            focusRequester2 = focusRequester4;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            datePickerFormatterImpl2 = datePickerFormatterImpl;
            datePickerColors2 = datePickerColors;
            function23 = function2;
            function24 = function22;
            z2 = z;
            gapComposer = gapComposer2;
            focusRequester2 = focusRequester;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda0(datePickerStateImpl, modifier2, datePickerFormatterImpl2, datePickerColors2, function23, function24, z2, focusRequester2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0166, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12.rememberedValue(), java.lang.Integer.valueOf(r3)) == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DatePickerContent(Long l, final long j, Function1 function1, Function1 function12, final CalendarModelImpl calendarModelImpl, final IntRange intRange, DatePickerFormatterImpl datePickerFormatterImpl, final DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, final DatePickerColors datePickerColors, Composer composer, int i) {
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-434467002);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(l) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024) | (gapComposer.changedInstance(calendarModelImpl) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(intRange) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(datePickerFormatterImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(datePickerDefaults$AllDates$1) ? 8388608 : 4194304) | (gapComposer.changed(datePickerColors) ? 67108864 : 33554432);
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            final CalendarMonth month = calendarModelImpl.getMonth(j);
            int i4 = (((month.year - intRange.first) * 12) + month.month) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            final LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(i4, 2, gapComposer);
            Integer valueOf = Integer.valueOf(i4);
            boolean changed = gapComposer.changed(rememberLazyListState) | gapComposer.changed(i4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScoreSummaryKt$ScoreDigit$1$1(rememberLazyListState, i4, continuation, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            Object[] objArr = new Object[0];
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(12);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 48);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
            }
            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Locale locale = calendarModelImpl.locale;
            datePickerFormatterImpl.getClass();
            String formatWithSkeleton = Icons$Filled.formatWithSkeleton(j, "yMMMM", locale, datePickerFormatterImpl.formatterCache);
            if (formatWithSkeleton == null) {
                formatWithSkeleton = "-";
            }
            String str = formatWithSkeleton;
            boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(rememberLazyListState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                final int i5 = 0;
                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i5;
                        LazyListState lazyListState = rememberLazyListState;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        switch (i6) {
                            case 0:
                                JobKt.launch$default(coroutineScope2, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, null, 1), 3);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope2, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, null, 2), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function0 function0 = (Function0) rememberedValue4;
            boolean changedInstance2 = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(rememberLazyListState);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        LazyListState lazyListState = rememberLazyListState;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        switch (i6) {
                            case 0:
                                JobKt.launch$default(coroutineScope2, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, null, 1), 3);
                                break;
                            default:
                                JobKt.launch$default(coroutineScope2, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, null, 2), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Function0 function02 = (Function0) rememberedValue5;
            boolean changed2 = gapComposer.changed(mutableState);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new TooltipKt$$ExternalSyntheticLambda1(10, mutableState);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            int i6 = i2 & 234881024;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$1;
            MonthsNavigation(m300paddingVpY3zN4$default, canScrollForward, canScrollBackward, booleanValue, str, function0, function02, (Function0) rememberedValue6, datePickerColors, gapComposer, i6 | 6);
            gapComposer = gapComposer;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            WeekDays(datePickerColors, calendarModelImpl, gapComposer, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
            HorizontalMonthsList(rememberLazyListState, l, function1, function12, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, gapComposer, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i6);
            gapComposer.end(true);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
            SpringSpec value = MenuKt.value(motionSchemeKeyTokens, gapComposer);
            SpringSpec value2 = MenuKt.value(MotionSchemeKeyTokens.FastEffects, gapComposer);
            SpringSpec value3 = MenuKt.value(motionSchemeKeyTokens, gapComposer);
            AnimatedContentKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), ClipKt.clipToBounds(companion), EnterExitTransitionKt.expandVertically$default(value3, 14).plus(EnterExitTransitionKt.fadeIn(0.6f, value)), EnterExitTransitionKt.shrinkVertically$default(value3, null, 14).plus(EnterExitTransitionKt.fadeOut$default(value2, 2)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1193716082, new Function3() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    IntRange intRange2;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    String m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(composer2, R.string.m3c_date_picker_year_picker_pane_title);
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean changed3 = gapComposer2.changed(m568getString2EP1pXo);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (changed3 || rememberedValue7 == neverEqualPolicy2) {
                        rememberedValue7 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(m568getString2EP1pXo, 5);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier semantics = SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue7);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer2, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$15);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    PaddingValuesImpl paddingValuesImpl = DatePickerKt.DatePickerModeTogglePadding;
                    Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m280requiredHeight3ABfNKs(companion2, 336.0f - DividerDefaults.Thickness), 12.0f, RecyclerView.DECELERATION_RATE, 2);
                    MutableState mutableState2 = mutableState;
                    boolean changed4 = gapComposer2.changed(mutableState2);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    boolean changedInstance3 = changed4 | gapComposer2.changedInstance(coroutineScope2);
                    LazyListState lazyListState = rememberLazyListState;
                    boolean changed5 = changedInstance3 | gapComposer2.changed(lazyListState);
                    IntRange intRange3 = intRange;
                    boolean changedInstance4 = changed5 | gapComposer2.changedInstance(intRange3);
                    CalendarMonth calendarMonth = month;
                    boolean changed6 = changedInstance4 | gapComposer2.changed(calendarMonth);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changed6 || rememberedValue8 == neverEqualPolicy2) {
                        OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(coroutineScope2, mutableState2, lazyListState, intRange3, calendarMonth, 5);
                        intRange2 = intRange3;
                        gapComposer2.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                        rememberedValue8 = overlayKt$$ExternalSyntheticLambda3;
                    } else {
                        intRange2 = intRange3;
                    }
                    long j2 = j;
                    DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$12 = datePickerDefaults$AllDates$1;
                    CalendarModelImpl calendarModelImpl2 = calendarModelImpl;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    DatePickerKt.YearPicker(m300paddingVpY3zN4$default3, j2, (Function1) rememberedValue8, datePickerDefaults$AllDates$12, calendarModelImpl2, intRange2, datePickerColors2, gapComposer2, 6);
                    MenuKt.m536HorizontalDivider9IZ8Weo(RecyclerView.DECELERATION_RATE, 0, datePickerColors2.dividerColor, gapComposer2, null);
                    gapComposer2.end(true);
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Composer) gapComposer, 196656, 16);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ZipFilesKt$$ExternalSyntheticLambda2(l, j, function1, function12, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, i);
        }
    }

    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m526DatePickerHeaderpc5RIQQ(final Function2 function2, final long j, final long j2, final float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2020490761);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier then = SizeKt.fillMaxWidth(companion, 1.0f).then(function2 != null ? SizeKt.m276defaultMinSizeVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, f, 1) : companion);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer, 6);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (function2 != null) {
                gapComposer.startReplaceGroup(396894187);
                z = true;
                Icons$Filled.m567ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(DatePickerModalTokens.HeaderSupportingTextFont, gapComposer), Expect_jvmKt.rememberComposableLambda(1344395458, new DatePickerKt$DatePickerHeader$1$1(0, function2), gapComposer), gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(397163267);
                gapComposer.end(false);
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j2, ContentColorKt.LocalContentColor), composableLambdaImpl, gapComposer, ((i2 >> 12) & 112) | 8);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DatePickerKt.m526DatePickerHeaderpc5RIQQ(Function2.this, j, j2, f, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void Day(final String str, final boolean z, final Function0 function0, final boolean z2, final boolean z3, final boolean z4, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        long j;
        State rememberUpdatedState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-945355136);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changed(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= gapComposer.changed(datePickerColors) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z5 = (234881024 & i2) == 67108864;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str2, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.DateContainerShape, gapComposer);
            int i4 = i2 >> 6;
            if (z) {
                j = z3 ? datePickerColors.selectedDayContainerColor : datePickerColors.disabledSelectedDayContainerColor;
            } else {
                datePickerColors.getClass();
                j = Color.Transparent;
            }
            long j2 = j;
            if (z2) {
                gapComposer.startReplaceGroup(-1319856736);
                rememberUpdatedState = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j2, MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer), null, gapComposer, 0, 12);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1319630064);
                rememberUpdatedState = Updater.rememberUpdatedState(new Color(j2), gapComposer);
                gapComposer.end(false);
            }
            SurfaceKt.m555Surfaced85dljk(z, function0, semantics, z3, value, ((Color) rememberUpdatedState.getValue()).value, (!z4 || z) ? null : CanvasKt.m173BorderStrokecXLIe8U(datePickerColors.todayDateBorderColor, DatePickerModalTokens.DateTodayContainerOutlineWidth), Expect_jvmKt.rememberComposableLambda(1126347158, new Function2() { // from class: androidx.compose.material3.DatePickerKt$Day$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        float f = DatePickerModalTokens.DateContainerWidth;
                        float f2 = DatePickerModalTokens.DateContainerHeight;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        Modifier m282requiredSizeVpY3zN4 = SizeKt.m282requiredSizeVpY3zN4(companion2, f, f2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m282requiredSizeVpY3zN4);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                        }
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.Empty) {
                            rememberedValue2 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(22);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue2);
                        DatePickerColors datePickerColors2 = datePickerColors;
                        long j3 = datePickerColors2.disabledDayContentColor;
                        boolean z6 = z;
                        boolean z7 = z3;
                        if (z6 && z7) {
                            j3 = datePickerColors2.selectedDayContentColor;
                        } else if (z6 && !z7) {
                            j3 = datePickerColors2.disabledSelectedDayContentColor;
                        } else if (z4 && z7) {
                            j3 = datePickerColors2.todayContentColor;
                        } else if (z7) {
                            j3 = datePickerColors2.dayContentColor;
                        }
                        long j4 = j3;
                        gapComposer2.startReplaceGroup(-969417610);
                        State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j4, MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer2), null, gapComposer2, 0, 12);
                        gapComposer2.end(false);
                        TextKt.m561TextNvy7gAk(str, clearAndSetSemantics, ((Color) m153animateColorAsStateeuL9pac.getValue()).value, 0L, null, 0L, new TextAlign(3), 0L, 0, false, 0, 0, null, gapComposer2, 0, 0, 261112);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, i4 & 7294);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DatePickerKt.Day(str, z, function0, z2, z3, z4, str2, datePickerColors, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: DisplayModeToggleButton-iUJLfQg, reason: not valid java name */
    public static final void m527DisplayModeToggleButtoniUJLfQg(final Modifier modifier, final int i, final Function1 function1, DatePickerColors datePickerColors, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1461252485);
        int i3 = (gapComposer.changed(i) ? 32 : 16) | i2 | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(datePickerColors) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(datePickerColors.headlineContentColor, ContentColorKt.LocalContentColor), Expect_jvmKt.rememberComposableLambda(-1734512197, new Function2() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        int i4 = i;
                        Object obj3 = Composer.Companion.Empty;
                        Function1 function12 = function1;
                        if (i4 == 0) {
                            gapComposer2.startReplaceGroup(-101264927);
                            ImageVector imageVector = Icons$Filled._edit;
                            if (imageVector == null) {
                                ImageVector.Builder builder = new ImageVector.Builder("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                EmptyList emptyList = VectorKt.EmptyPath;
                                SolidColor solidColor = new SolidColor(Color.Black);
                                EncoderRegistry encoderRegistry = new EncoderRegistry(1);
                                encoderRegistry.moveTo(3.0f, 17.25f);
                                PathNode.VerticalTo verticalTo = new PathNode.VerticalTo(21.0f);
                                ArrayList arrayList = encoderRegistry.encoders;
                                arrayList.add(verticalTo);
                                encoderRegistry.horizontalLineToRelative(3.75f);
                                encoderRegistry.lineTo(17.81f, 9.94f);
                                encoderRegistry.lineToRelative(-3.75f, -3.75f);
                                encoderRegistry.lineTo(3.0f, 17.25f);
                                encoderRegistry.close();
                                encoderRegistry.moveTo(20.71f, 7.04f);
                                encoderRegistry.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, RecyclerView.DECELERATION_RATE, -1.41f);
                                encoderRegistry.lineToRelative(-2.34f, -2.34f);
                                encoderRegistry.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, RecyclerView.DECELERATION_RATE);
                                encoderRegistry.lineToRelative(-1.83f, 1.83f);
                                encoderRegistry.lineToRelative(3.75f, 3.75f);
                                encoderRegistry.lineToRelative(1.83f, -1.83f);
                                encoderRegistry.close();
                                ImageVector.Builder.m766addPathoIyEayM$default(builder, arrayList, solidColor);
                                imageVector = builder.build();
                                Icons$Filled._edit = imageVector;
                            }
                            String m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_switch_to_input_mode);
                            boolean changed = gapComposer2.changed(function12);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == obj3) {
                                rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function12, false, 1);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            DatePickerKt.IconButtonWithTooltip((Function0) rememberedValue, imageVector, m568getString2EP1pXo, modifier, false, gapComposer2, 0, 16);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-100967048);
                            ImageVector imageVector2 = Icons$Filled._dateRange;
                            if (imageVector2 == null) {
                                ImageVector.Builder builder2 = new ImageVector.Builder("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                EmptyList emptyList2 = VectorKt.EmptyPath;
                                SolidColor solidColor2 = new SolidColor(Color.Black);
                                EncoderRegistry encoderRegistry2 = new EncoderRegistry(1);
                                encoderRegistry2.moveTo(9.0f, 11.0f);
                                encoderRegistry2.lineTo(7.0f, 11.0f);
                                encoderRegistry2.verticalLineToRelative(2.0f);
                                encoderRegistry2.horizontalLineToRelative(2.0f);
                                encoderRegistry2.verticalLineToRelative(-2.0f);
                                encoderRegistry2.close();
                                encoderRegistry2.moveTo(13.0f, 11.0f);
                                encoderRegistry2.horizontalLineToRelative(-2.0f);
                                encoderRegistry2.verticalLineToRelative(2.0f);
                                encoderRegistry2.horizontalLineToRelative(2.0f);
                                encoderRegistry2.verticalLineToRelative(-2.0f);
                                encoderRegistry2.close();
                                encoderRegistry2.moveTo(17.0f, 11.0f);
                                encoderRegistry2.horizontalLineToRelative(-2.0f);
                                encoderRegistry2.verticalLineToRelative(2.0f);
                                encoderRegistry2.horizontalLineToRelative(2.0f);
                                encoderRegistry2.verticalLineToRelative(-2.0f);
                                encoderRegistry2.close();
                                encoderRegistry2.moveTo(19.0f, 4.0f);
                                encoderRegistry2.horizontalLineToRelative(-1.0f);
                                encoderRegistry2.lineTo(18.0f, 2.0f);
                                encoderRegistry2.horizontalLineToRelative(-2.0f);
                                encoderRegistry2.verticalLineToRelative(2.0f);
                                encoderRegistry2.lineTo(8.0f, 4.0f);
                                encoderRegistry2.lineTo(8.0f, 2.0f);
                                encoderRegistry2.lineTo(6.0f, 2.0f);
                                encoderRegistry2.verticalLineToRelative(2.0f);
                                encoderRegistry2.lineTo(5.0f, 4.0f);
                                encoderRegistry2.curveToRelative(-1.11f, RecyclerView.DECELERATION_RATE, -1.99f, 0.9f, -1.99f, 2.0f);
                                encoderRegistry2.lineTo(3.0f, 20.0f);
                                encoderRegistry2.curveToRelative(RecyclerView.DECELERATION_RATE, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                                encoderRegistry2.horizontalLineToRelative(14.0f);
                                encoderRegistry2.curveToRelative(1.1f, RecyclerView.DECELERATION_RATE, 2.0f, -0.9f, 2.0f, -2.0f);
                                encoderRegistry2.lineTo(21.0f, 6.0f);
                                encoderRegistry2.curveToRelative(RecyclerView.DECELERATION_RATE, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                encoderRegistry2.close();
                                encoderRegistry2.moveTo(19.0f, 20.0f);
                                encoderRegistry2.lineTo(5.0f, 20.0f);
                                encoderRegistry2.lineTo(5.0f, 9.0f);
                                encoderRegistry2.horizontalLineToRelative(14.0f);
                                encoderRegistry2.verticalLineToRelative(11.0f);
                                encoderRegistry2.close();
                                ImageVector.Builder.m766addPathoIyEayM$default(builder2, encoderRegistry2.encoders, solidColor2);
                                imageVector2 = builder2.build();
                                Icons$Filled._dateRange = imageVector2;
                            }
                            String m568getString2EP1pXo2 = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_switch_to_calendar_mode);
                            boolean changed2 = gapComposer2.changed(function12);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue2 == obj3) {
                                z = false;
                                rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function12, false, 2);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            } else {
                                z = false;
                            }
                            DatePickerKt.IconButtonWithTooltip((Function0) rememberedValue2, imageVector2, m568getString2EP1pXo2, modifier, false, gapComposer2, 0, 16);
                            gapComposer2.end(z);
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier, i, function1, datePickerColors, i2);
        }
    }

    public static final void HorizontalMonthsList(LazyListState lazyListState, final Long l, final Function1 function1, Function1 function12, final CalendarModelImpl calendarModelImpl, final IntRange intRange, final DatePickerFormatterImpl datePickerFormatterImpl, final DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, final DatePickerColors datePickerColors, Composer composer, int i) {
        Object flowExtKt$simpleScan$1;
        final LazyListState lazyListState2 = lazyListState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1994757941);
        int i2 = i | (gapComposer.changed(lazyListState2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(l) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024) | (gapComposer.changedInstance(calendarModelImpl) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(intRange) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(datePickerFormatterImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(datePickerDefaults$AllDates$1) ? 8388608 : 4194304) | (gapComposer.changed(datePickerColors) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
            final CalendarDate today = calendarModelImpl.getToday();
            boolean changed = gapComposer.changed(intRange);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = calendarModelImpl.getMonth(LocalDate.of(intRange.first, 1, 1));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) rememberedValue;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.DateLabelTextFont, gapComposer), Expect_jvmKt.rememberComposableLambda(1504086906, new Function2() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        Object obj3 = Composer.Companion.Empty;
                        if (rememberedValue2 == obj3) {
                            rememberedValue2 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(23);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2);
                        DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                        DecayAnimationSpecImpl exponentialDecay$default = AnimatableKt.exponentialDecay$default();
                        SpringSpec value = MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer2);
                        boolean changed2 = gapComposer2.changed(exponentialDecay$default);
                        LazyListState lazyListState3 = LazyListState.this;
                        boolean changed3 = changed2 | gapComposer2.changed(lazyListState3);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue3 == obj3) {
                            rememberedValue3 = new SnapFlingBehavior(new Recorder.AnonymousClass6(new Recorder.AnonymousClass1(15, lazyListState3, SnapPosition$Start.INSTANCE$1), 16), exponentialDecay$default, value);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue3;
                        boolean changedInstance = gapComposer2.changedInstance(intRange) | gapComposer2.changedInstance(calendarModelImpl) | gapComposer2.changed(calendarMonth) | gapComposer2.changed(function1);
                        Object obj4 = today;
                        boolean changed4 = changedInstance | gapComposer2.changed(obj4) | gapComposer2.changed(l) | gapComposer2.changedInstance(datePickerFormatterImpl) | gapComposer2.changed(datePickerDefaults$AllDates$1) | gapComposer2.changed(datePickerColors);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue4 == obj3) {
                            rememberedValue4 = new KeypadViewKt$$ExternalSyntheticLambda0(intRange, calendarModelImpl, calendarMonth, function1, obj4, l, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, 1);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        LazyDslKt.LazyRow(semantics, lazyListState3, null, null, null, snapFlingBehavior, false, null, (Function1) rememberedValue4, gapComposer2, 0, 444);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 48);
            boolean changedInstance = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | gapComposer.changedInstance(calendarModelImpl) | gapComposer.changedInstance(intRange);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                lazyListState2 = lazyListState;
                flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(lazyListState2, function12, calendarModelImpl, intRange, (Continuation) null, 15);
                gapComposer.updateRememberedValue(flowExtKt$simpleScan$1);
            } else {
                flowExtKt$simpleScan$1 = rememberedValue2;
                lazyListState2 = lazyListState;
            }
            Updater.LaunchedEffect(gapComposer, lazyListState2, (Function2) flowExtKt$simpleScan$1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda21(lazyListState2, l, function1, function12, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, i, 0);
        }
    }

    public static final void IconButtonWithTooltip(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Modifier modifier3;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-368059805);
        int i5 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(imageVector) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i8 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            if (i7 != 0) {
                z2 = true;
            }
            float f = TooltipDefaults.plainTooltipMaxWidth;
            PaddingValuesImpl paddingValuesImpl = TooltipKt.PlainTooltipContentPadding;
            int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(4.0f);
            boolean changed = gapComposer.changed(mo230roundToPx0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new TooltipPositionProviderImpl(mo230roundToPx0680j_4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TooltipPositionProviderImpl tooltipPositionProviderImpl = (TooltipPositionProviderImpl) rememberedValue;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-456272562, new DatePickerKt$IconButtonWithTooltip$1(str, i8), gapComposer);
            MutatorMutex mutatorMutex = BasicTooltipDefaults.GlobalMutatorMutex;
            boolean changed2 = gapComposer.changed(false) | gapComposer.changed(mutatorMutex);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = new TooltipStateImpl(mutatorMutex);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            boolean z4 = z2;
            TooltipKt.TooltipBox(tooltipPositionProviderImpl, rememberComposableLambda, (TooltipStateImpl) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-1124908186, new MenuKt$DropdownMenuItemContent$1$1(function0, modifier4, z4, imageVector, str), gapComposer), gapComposer, 100663344);
            modifier3 = modifier4;
            z3 = z4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(function0, imageVector, str, modifier3, z3, i, i2);
        }
    }

    public static final void Month(CalendarMonth calendarMonth, Function1 function1, long j, Long l, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors, Locale locale, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        int i3;
        int i4;
        GapComposer gapComposer2;
        Modifier.Companion companion;
        CalendarMonth calendarMonth2 = calendarMonth;
        Long l2 = l;
        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceEvenly;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-333300603);
        Applier applier = gapComposer3.applier;
        int i5 = i | (gapComposer3.changed(calendarMonth2) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | (gapComposer3.changed(j) ? 256 : 128) | (gapComposer3.changed(l2) ? 2048 : 1024) | (gapComposer3.changed(datePickerFormatterImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer3.changed(datePickerDefaults$AllDates$1) ? 8388608 : 4194304) | (gapComposer3.changed(datePickerColors) ? 67108864 : 33554432) | (gapComposer3.changedInstance(locale) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer3.shouldExecute(i5 & 1, (i5 & 306783379) != 306783378)) {
            gapComposer3.startReplaceGroup(606771165);
            gapComposer3.end(false);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier then = SizeKt.m280requiredHeight3ABfNKs(companion2, 288.0f).then(companion2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, Alignment.Companion.Start, gapComposer3, 6);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer3.startReplaceGroup(-680088486);
            int i6 = 0;
            int i7 = 0;
            int i8 = 6;
            while (i7 < i8) {
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterVertically, gapComposer3, 54);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer3);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                Arrangement$Center$1 arrangement$Center$12 = arrangement$Center$1;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer3.startReusableNode();
                int i9 = i6;
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer3, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                }
                Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer3.startReplaceGroup(1542622325);
                int i10 = i9;
                int i11 = 0;
                while (i11 < 7) {
                    int i12 = calendarMonth2.daysFromStartOfWeekToFirstOfMonth;
                    if (i10 < i12 || i10 >= i12 + calendarMonth2.numberOfDays) {
                        i2 = i11;
                        i3 = i10;
                        i4 = i7;
                        gapComposer2 = gapComposer3;
                        companion = companion2;
                        gapComposer2.startReplaceGroup(576825328);
                        Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(companion, DatePickerModalTokens.DateContainerWidth, DatePickerModalTokens.DateContainerHeight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize;
                        SpacerKt.Spacer(gapComposer2, SizeKt.m287sizeVpY3zN4(m289sizeInqDBjuR0$default, ((Dp) gapComposer2.consume(staticProvidableCompositionLocal)).value, ((Dp) gapComposer2.consume(staticProvidableCompositionLocal)).value));
                        gapComposer2.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(577914947);
                        int i13 = i10 - calendarMonth2.daysFromStartOfWeekToFirstOfMonth;
                        i3 = i10;
                        i4 = i7;
                        i2 = i11;
                        long j2 = (i13 * 86400000) + calendarMonth2.startUtcTimeMillis;
                        companion = companion2;
                        boolean z = j2 == j;
                        boolean z2 = l2 != null && j2 == l2.longValue();
                        gapComposer3.startReplaceGroup(578890300);
                        gapComposer3.end(false);
                        StringBuilder sb = new StringBuilder();
                        gapComposer3.startReplaceGroup(974838827);
                        gapComposer3.end(false);
                        if (z) {
                            gapComposer3.startReplaceGroup(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(Icons$Filled.m568getString2EP1pXo(gapComposer3, R.string.m3c_date_picker_today_description));
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(975029291);
                            gapComposer3.end(false);
                        }
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        String formatDate = datePickerFormatterImpl.formatDate(Long.valueOf(j2), locale, true);
                        if (formatDate == null) {
                            formatDate = "";
                        }
                        String localString$default = CalendarLocale_jvmKt.toLocalString$default(i13 + 1, locale);
                        boolean changed = ((i5 & 112) == 32) | gapComposer3.changed(j2);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new DatePickerKt$$ExternalSyntheticLambda25(0, j2, function1);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        Function0 function0 = (Function0) rememberedValue;
                        boolean changed2 = gapComposer3.changed(j2) | ((i5 & 29360128) == 8388608);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            datePickerDefaults$AllDates$1.getClass();
                            rememberedValue2 = Boolean.TRUE;
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
                        if (sb2 != null) {
                            formatDate = Recorder$$ExternalSyntheticOutline2.m(sb2, ", ", formatDate);
                        }
                        GapComposer gapComposer4 = gapComposer3;
                        Day(localString$default, z2, function0, z2, booleanValue, z, formatDate, datePickerColors, gapComposer4, ((i5 << 3) & 1879048192) | 48);
                        gapComposer2 = gapComposer4;
                        gapComposer2.end(false);
                    }
                    calendarMonth2 = calendarMonth;
                    i10 = i3 + 1;
                    i11 = i2 + 1;
                    companion2 = companion;
                    i7 = i4;
                    gapComposer3 = gapComposer2;
                    l2 = l;
                }
                GapComposer gapComposer5 = gapComposer3;
                i8 = 6;
                gapComposer5.end(false);
                gapComposer5.end(true);
                calendarMonth2 = calendarMonth;
                i7++;
                arrangement$Center$1 = arrangement$Center$12;
                i6 = i10;
                gapComposer3 = gapComposer5;
                l2 = l;
            }
            gapComposer = gapComposer3;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda26(calendarMonth, function1, j, l, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, locale, i);
        }
    }

    public static final void MonthsNavigation(Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final Function0 function0, final Function0 function02, final Function0 function03, final DatePickerColors datePickerColors, Composer composer, final int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-773929258);
        int i2 = i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(z2) ? 256 : 128) | (gapComposer.changed(z3) ? 2048 : 1024) | (gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function03) ? 8388608 : 4194304) | (gapComposer.changed(datePickerColors) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            modifier2 = modifier;
            Modifier m280requiredHeight3ABfNKs = SizeKt.m280requiredHeight3ABfNKs(SizeKt.fillMaxWidth(modifier2, 1.0f), 56.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(z3 ? SpacerKt.Start : SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 48);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m280requiredHeight3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            YearPickerMenuButton(((i2 >> 21) & 14) | 3072 | ((i2 >> 6) & 112), gapComposer, Expect_jvmKt.rememberComposableLambda(619076006, new ButtonKt$Button$2.AnonymousClass1(3, str, datePickerColors), gapComposer), null, function03, z3);
            if (z3) {
                gapComposer.startReplaceGroup(282432080);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(281624840);
                Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(datePickerColors.navigationContentColor, ContentColorKt.LocalContentColor), Expect_jvmKt.rememberComposableLambda(-128317193, new DatePickerKt$Year$2(function02, z2, function0, z), gapComposer), gapComposer, 56);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2(z, z2, z3, str, function0, function02, function03, datePickerColors, i) { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda20
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ Function0 f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ Function0 f$7;
                public final /* synthetic */ DatePickerColors f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(7);
                    DatePickerKt.MonthsNavigation(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: SwitchableDateEntryContent-KaiTk9E, reason: not valid java name */
    public static final void m528SwitchableDateEntryContentKaiTk9E(final Long l, final long j, final int i, final Function1 function1, final Function1 function12, final CalendarModelImpl calendarModelImpl, final IntRange intRange, final DatePickerFormatterImpl datePickerFormatterImpl, final DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2053685029);
        int i3 = i2 | (gapComposer.changed(l) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(calendarModelImpl) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(intRange) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(datePickerFormatterImpl) ? 8388608 : 4194304) | (gapComposer.changed(datePickerDefaults$AllDates$1) ? 67108864 : 33554432) | (gapComposer.changed(datePickerColors) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && ((gapComposer.changed(focusRequester) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = -((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(48.0f);
            SpringSpec value = MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer);
            SpringSpec value2 = MenuKt.value(MotionSchemeKeyTokens.FastEffects, gapComposer);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            SpringSpec value3 = MenuKt.value(motionSchemeKeyTokens, gapComposer);
            SpringSpec value4 = MenuKt.value(motionSchemeKeyTokens, gapComposer);
            DisplayMode displayMode = new DisplayMode(i);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
            boolean changedInstance = gapComposer.changedInstance(value3) | gapComposer.changedInstance(value) | gapComposer.changedInstance(value2) | gapComposer.changed(i4) | gapComposer.changedInstance(value4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DatePickerKt$$ExternalSyntheticLambda6(value3, value, value2, i4, value4, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AnimatedContentKt.AnimatedContent(displayMode, semantics, (Function1) rememberedValue2, null, "DatePickerDisplayModeAnimation", null, Expect_jvmKt.rememberComposableLambda(1838500091, new Function4() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i5 = ((DisplayMode) obj2).value;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    if (i5 == 0) {
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        gapComposer2.startReplaceGroup(1567031954);
                        DatePickerKt.DatePickerContent(l, j, function1, function12, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (i5 == 1) {
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        gapComposer3.startReplaceGroup(1567050592);
                        DateInputKt.DateInputContent(l, function1, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, focusRequester, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        GapComposer gapComposer4 = (GapComposer) composer2;
                        gapComposer4.startReplaceGroup(1334373351);
                        gapComposer4.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i3 >> 6) & 14) | 1597440, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(l, j, i, function1, function12, calendarModelImpl, intRange, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, focusRequester, i2) { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda7
                public final /* synthetic */ Long f$0;
                public final /* synthetic */ long f$1;
                public final /* synthetic */ FocusRequester f$10;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ Function1 f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ CalendarModelImpl f$5;
                public final /* synthetic */ IntRange f$6;
                public final /* synthetic */ DatePickerFormatterImpl f$7;
                public final /* synthetic */ DatePickerDefaults$AllDates$1 f$8;
                public final /* synthetic */ DatePickerColors f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    DatePickerKt.m528SwitchableDateEntryContentKaiTk9E(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void WeekDays(DatePickerColors datePickerColors, CalendarModelImpl calendarModelImpl, Composer composer, int i) {
        DatePickerColors datePickerColors2 = datePickerColors;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1849465391);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changed(datePickerColors2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(calendarModelImpl) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = calendarModelImpl.firstDayOfWeek;
            ArrayList arrayList = calendarModelImpl.weekdayNames;
            ArrayList arrayList2 = new ArrayList();
            int i4 = i3 - 1;
            int size = arrayList.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList2.add(arrayList.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList2.add(arrayList.get(i6));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.WeekdaysLabelTextFont, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m276defaultMinSizeVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 48.0f, 1), 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceEvenly, Alignment.Companion.CenterVertically, gapComposer, 54);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            BiasAlignment biasAlignment = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(24563235);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Pair pair = (Pair) arrayList2.get(i7);
                boolean changed = gapComposer.changed(pair);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CachedPageEventFlow$$ExternalSyntheticLambda0(pair, 5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), DatePickerModalTokens.DateContainerWidth, DatePickerModalTokens.DateContainerHeight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize;
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(m289sizeInqDBjuR0$default, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                }
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                GapComposer gapComposer2 = gapComposer;
                TextKt.m561TextNvy7gAk((String) pair.second, SizeKt.wrapContentSize$default(companion, biasAlignment, 3), datePickerColors2.weekdayContentColor, 0L, null, 0L, new TextAlign(3), 0L, 0, false, 0, 0, value, gapComposer2, 48, 0, 130040);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                i7++;
                z = false;
                z2 = true;
                biasAlignment = biasAlignment;
                arrayList2 = arrayList2;
                size2 = size2;
                companion = companion;
                datePickerColors2 = datePickerColors;
            }
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(datePickerColors, calendarModelImpl, i, 6);
        }
    }

    public static final void Year(String str, Modifier modifier, boolean z, boolean z2, Function0 function0, String str2, DatePickerColors datePickerColors, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Object obj;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1153850597);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(true) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(str2) ? 1048576 : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(datePickerColors) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                if (!z2 || z) {
                    i2 = i3;
                    obj = null;
                } else {
                    i2 = i3;
                    obj = CanvasKt.m173BorderStrokecXLIe8U(datePickerColors.todayDateBorderColor, DatePickerModalTokens.DateTodayContainerOutlineWidth);
                }
                gapComposer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
                i2 = i3;
            }
            BorderStroke borderStroke = (BorderStroke) obj;
            boolean z4 = (i2 & 3670016) == 1048576;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str2, 4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            modifier2 = modifier;
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue2);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.SelectionYearStateLayerShape, gapComposer);
            int i4 = i2 >> 6;
            int i5 = i4 & 14;
            if (z) {
                j = datePickerColors.selectedYearContainerColor;
            } else {
                datePickerColors.getClass();
                j = Color.Transparent;
            }
            SurfaceKt.m555Surfaced85dljk(z, function0, semantics, true, value, ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer), null, gapComposer, 0, 12).getValue()).value, borderStroke, Expect_jvmKt.rememberComposableLambda(-564400443, new DatePickerKt$Year$2(str, datePickerColors, z2, z), gapComposer), gapComposer, i5 | ((i2 >> 9) & 112) | (i4 & 7168));
            gapComposer = gapComposer;
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda30(str, modifier2, z, z2, function0, str2, datePickerColors, i);
        }
    }

    public static final void YearPicker(final Modifier modifier, final long j, final Function1 function1, final DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, final CalendarModelImpl calendarModelImpl, final IntRange intRange, final DatePickerColors datePickerColors, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1286899812);
        int i2 = i | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(datePickerDefaults$AllDates$1) ? 2048 : 1024) | (gapComposer.changedInstance(calendarModelImpl) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(intRange) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(datePickerColors) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.SelectionYearLabelTextFont, gapComposer), Expect_jvmKt.rememberComposableLambda(1301915789, new Function2() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Arrangement$SpacedAligned arrangement$SpacedAligned;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        CalendarModelImpl calendarModelImpl2 = CalendarModelImpl.this;
                        CalendarDate today = calendarModelImpl2.getToday();
                        int i3 = calendarModelImpl2.getMonth(LocalDate.of(today.year, today.month, 1)).year;
                        int i4 = calendarModelImpl2.getMonth(j).year;
                        IntRange intRange2 = intRange;
                        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (i4 - intRange2.first) - 3), 2, gapComposer2);
                        GridCells.Fixed fixed = new GridCells.Fixed(3);
                        DatePickerColors datePickerColors2 = datePickerColors;
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, datePickerColors2.containerColor, ColorKt.RectangleShape);
                        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceEvenly;
                        Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(DatePickerKt.YearsVerticalPadding, true, new Drop$$ExternalSyntheticBUOutline0(3));
                        boolean changedInstance = gapComposer2.changedInstance(calendarModelImpl2) | gapComposer2.changedInstance(intRange2) | gapComposer2.changed(i4) | gapComposer2.changed(i3) | gapComposer2.changed(function1) | gapComposer2.changed(datePickerDefaults$AllDates$1) | gapComposer2.changed(datePickerColors2);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            arrangement$SpacedAligned = arrangement$SpacedAligned2;
                            SyncEntityQueries$$ExternalSyntheticLambda3 syncEntityQueries$$ExternalSyntheticLambda3 = new SyncEntityQueries$$ExternalSyntheticLambda3(intRange, CalendarModelImpl.this, i4, i3, function1, datePickerDefaults$AllDates$1, datePickerColors);
                            gapComposer2.updateRememberedValue(syncEntityQueries$$ExternalSyntheticLambda3);
                            rememberedValue = syncEntityQueries$$ExternalSyntheticLambda3;
                        } else {
                            arrangement$SpacedAligned = arrangement$SpacedAligned2;
                        }
                        LazyGridDslKt.LazyVerticalGrid(fixed, m177backgroundbw27NRU, rememberLazyGridState, null, arrangement$SpacedAligned, arrangement$Center$1, null, false, null, (Function1) rememberedValue, gapComposer2, 1769472, 920);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda23(modifier, j, function1, datePickerDefaults$AllDates$1, calendarModelImpl, intRange, datePickerColors, i);
        }
    }

    public static final void YearPickerMenuButton(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-709923073);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MenuKt.TextButton(function0, companion, false, roundedCornerShape, ButtonDefaults.m518textButtonColorsro_MJ88(((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value, gapComposer), null, Expect_jvmKt.rememberComposableLambda(1899489890, new SliderKt$Slider$3(composableLambdaImpl, z), gapComposer), gapComposer, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            function02 = function0;
            modifier = companion;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda22(function02, z, modifier, composableLambdaImpl, i);
        }
    }
}

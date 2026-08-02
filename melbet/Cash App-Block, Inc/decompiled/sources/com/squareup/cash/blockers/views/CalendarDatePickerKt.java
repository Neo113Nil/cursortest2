package com.squareup.cash.blockers.views;

import android.content.res.Configuration;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.work.views.ScheduleCalendarKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import com.squareup.util.compose.StableHolder;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class CalendarDatePickerKt {
    public static final DateTimeFormatter accessibilityDateTimeFormatter;
    public static final ArrayList daysOfWeekSundayFirst;

    public abstract /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntriesList entries$0 = Tags.enumEntries(DayOfWeek.values());
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AnimationDirection.values().length];
            try {
                AnimationDirection animationDirection = AnimationDirection.FORWARD;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnimationDirection animationDirection2 = AnimationDirection.FORWARD;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CalendarBlockerViewModel.Loaded.ToolbarButton.values().length];
            try {
                CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton = CalendarBlockerViewModel.Loaded.ToolbarButton.Back;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton2 = CalendarBlockerViewModel.Loaded.ToolbarButton.Back;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(DayOfWeek.SUNDAY);
        daysOfWeekSundayFirst = CollectionsKt.plus((Iterable) CollectionsKt.take(EntriesMappings.entries$0, r1.getSize() - 1), (Collection) listOf);
        accessibilityDateTimeFormatter = DateTimeFormatter.ofPattern("LLLL d, yyyy");
    }

    public static final void CalendarDatePicker(String str, String str2, StableHolder stableHolder, StableHolder stableHolder2, StableHolder stableHolder3, StableHolder stableHolder4, boolean z, CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton, boolean z2, CalendarBlockerViewModel.Loaded.Toggle toggle, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Composer composer, int i) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1650627072);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(stableHolder) ? 256 : 128) | (gapComposer.changed(stableHolder2) ? 2048 : 1024) | (gapComposer.changed(stableHolder3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(stableHolder4) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(toolbarButton == null ? -1 : toolbarButton.ordinal()) ? 8388608 : 4194304) | (gapComposer.changed(z2) ? 67108864 : 33554432) | (gapComposer.changedInstance(toggle) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i2 & 1, ((306783379 & i2) == 306783378 && (((((gapComposer.changedInstance(function1) ? (char) 4 : (char) 2) | (gapComposer.changedInstance(function12) ? ' ' : (char) 16)) | (gapComposer.changedInstance(function0) ? (char) 256 : (char) 128)) | (gapComposer.changedInstance(function02) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1222669995, new CalendarDatePickerKt$$ExternalSyntheticLambda7(toolbarButton, function0, str, toggle, stableHolder4, stableHolder2, z, stableHolder3, stableHolder, function12, function1, function02, z2, str2), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalendarDatePickerKt$$ExternalSyntheticLambda7(str, str2, stableHolder, stableHolder2, stableHolder3, stableHolder4, z, toolbarButton, z2, toggle, function1, function12, function0, function02, i);
        }
    }

    public static final void CalendarDay(boolean z, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Function1 function1, boolean z2, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1084612691);
        int i2 = i | (gapComposer2.changed(z) ? 4 : 2) | (gapComposer2.changedInstance(localDate) ? 32 : 16) | (gapComposer2.changedInstance(localDate2) ? 256 : 128) | (gapComposer2.changedInstance(localDate3) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = localDate3.get(ChronoField.DAY_OF_MONTH);
            boolean z3 = localDate3.isBefore(localDate) || localDate3.isBefore(localDate2);
            boolean isEqual = localDate3.isEqual(localDate);
            gapComposer2.startReplaceGroup(1364277735);
            gapComposer2.startReplaceGroup(1364271248);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, companion, true);
            if (!z2 && isEqual) {
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                aspectRatio = aspectRatio.then(ImageKt.m178borderxT4_qwU(companion, 1.0f, colors.semantic.border.standard, RoundedCornerShapeKt.CircleShape));
            }
            gapComposer2.end(false);
            if (z2) {
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                aspectRatio = aspectRatio.then(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.text.standard, RoundedCornerShapeKt.CircleShape));
            }
            gapComposer2.end(false);
            Modifier clip = ClipKt.clip(aspectRatio, RoundedCornerShapeKt.CircleShape);
            boolean changedInstance = gapComposer2.changedInstance(localDate3) | gapComposer2.changed(z3) | ((458752 & i2) == 131072);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CalendarDatePickerKt$$ExternalSyntheticLambda21(0, localDate3, z3, z2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(clip, (Function1) rememberedValue);
            boolean z4 = (!z || z2 || z3) ? false : true;
            boolean changedInstance2 = ((i2 & 57344) == 16384) | gapComposer2.changedInstance(localDate3);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScheduleCalendarKt$$ExternalSyntheticLambda4(function1, localDate3, 1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clearAndSetSemantics, z4, null, null, (Function0) rememberedValue2, 14);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m183clickableoSLSa3U$default);
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
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center);
            String valueOf = String.valueOf(i3);
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodyMedium;
            if (z2) {
                gapComposer2.startReplaceGroup(1194042638);
                j = Strings.getColors(gapComposer2).semantic.text.inverse;
                gapComposer2.end(false);
            } else if (z3) {
                gapComposer2.startReplaceGroup(1194045199);
                j = Strings.getColors(gapComposer2).semantic.text.disabled;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1194047119);
                j = Strings.getColors(gapComposer2).semantic.text.standard;
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 1, 0, 3, 1572864, 0, 3760, j, (Composer) gapComposer2, align, textStyle, (TextLineBalancing) null, valueOf, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentViewKt$$ExternalSyntheticLambda24(z, localDate, localDate2, localDate3, function1, z2, i);
        }
    }

    public static final void CalendarMonth(YearMonth yearMonth, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1216713666);
        int i2 = (gapComposer.changedInstance(yearMonth) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4024, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, Boxes$$ExternalSyntheticOutline1.m(yearMonth.getYear(), yearMonth.getMonth().getDisplayName(java.time.format.TextStyle.FULL, ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0)), " "), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(yearMonth, i, 22);
        }
    }

    public static final YearMonth getYearMonth(LocalDate localDate) {
        YearMonth of = YearMonth.of(localDate.getYear(), localDate.getMonth());
        of.getClass();
        return of;
    }

    public static final void CalendarDatePicker(CalendarBlockerViewModel calendarBlockerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        CalendarBlockerViewModel calendarBlockerViewModel2;
        calendarBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1113298680);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(calendarBlockerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            boolean z = calendarBlockerViewModel instanceof CalendarBlockerViewModel.Loading;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeQueries$$ExternalSyntheticLambda5(calendarBlockerViewModel, 29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            calendarBlockerViewModel2 = calendarBlockerViewModel;
            Strings.LoadableFullScreenContent(calendarBlockerViewModel2, z, systemBarsPadding, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(2143940814, new SetPinViewKt$$ExternalSyntheticLambda4(17, function1), gapComposer), gapComposer, i4 | 196608, 16);
        } else {
            calendarBlockerViewModel2 = calendarBlockerViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(calendarBlockerViewModel2, function1, i, i3);
        }
    }
}

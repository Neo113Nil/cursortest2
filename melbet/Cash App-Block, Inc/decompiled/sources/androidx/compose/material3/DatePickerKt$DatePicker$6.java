package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.ui.CashInsetsListenerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class DatePickerKt$DatePicker$6 implements Function2 {
    public final /* synthetic */ Object $calendarModel;
    public final /* synthetic */ Object $colors;
    public final /* synthetic */ Object $dateFormatter;
    public final /* synthetic */ Object $focusRequester;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $state;

    public DatePickerKt$DatePicker$6(Shape shape, DatePickerColors datePickerColors, ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2) {
        this.$r8$classId = 1;
        this.$state = shape;
        this.$colors = datePickerColors;
        this.$calendarModel = composableLambdaImpl;
        this.$dateFormatter = function2;
        this.$focusRequester = composableLambdaImpl2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r1;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.$focusRequester;
        Object obj4 = this.$dateFormatter;
        Object obj5 = this.$colors;
        Object obj6 = this.$state;
        Object obj7 = this.$calendarModel;
        switch (i) {
            case 0:
                boolean z = false;
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj6;
                if ((intValue & 3) != 2) {
                    z = true;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, z)) {
                    Long selectedDateMillis = datePickerStateImpl.getSelectedDateMillis();
                    long j = ((CalendarMonth) datePickerStateImpl._displayedMonth.getValue()).startUtcTimeMillis;
                    int m529getDisplayModejFl4v0 = datePickerStateImpl.m529getDisplayModejFl4v0();
                    boolean changed = gapComposer.changed(datePickerStateImpl);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0(datePickerStateImpl, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    boolean changed2 = gapComposer.changed(datePickerStateImpl);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DatePickerKt$DatePicker$5$$ExternalSyntheticLambda0(datePickerStateImpl, 2);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DatePickerKt.m528SwitchableDateEntryContentKaiTk9E(selectedDateMillis, j, m529getDisplayModejFl4v0, function1, (Function1) rememberedValue2, (CalendarModelImpl) obj7, datePickerStateImpl.yearRange, (DatePickerFormatterImpl) obj4, (DatePickerDefaults$AllDates$1) datePickerStateImpl.selectableDates$delegate.getValue(), (DatePickerColors) obj5, (FocusRequester) obj3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                boolean z2 = false;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, z2)) {
                    SurfaceKt.m554SurfaceT9BRK9s(SizeKt.m279heightInVpY3zN4$default(SizeKt.m284requiredWidth3ABfNKs(companion, DatePickerModalTokens.ContainerWidth), RecyclerView.DECELERATION_RATE, DatePickerModalTokens.ContainerHeight, 1), (Shape) obj6, ((DatePickerColors) obj5).containerColor, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1782015378, new TooltipKt$TooltipBox$3((ComposableLambdaImpl) obj7, (Function2) obj4, (ComposableLambdaImpl) obj3), gapComposer2), gapComposer2, 12582918, 104);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Number) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Function2 function2 = (Function2) obj6;
                    Function2 function22 = (Function2) obj7;
                    Function2 function23 = (Function2) obj4;
                    DatePickerColors datePickerColors = (DatePickerColors) obj5;
                    TextStyle textStyle = (TextStyle) obj3;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Arrangement$Horizontal arrangement$Horizontal = (function2 == null || function22 == null) ? function2 != null ? SpacerKt.Start : SpacerKt.End : SpacerKt.SpaceBetween;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Horizontal, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth2);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer3, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (function2 != null) {
                        gapComposer3.startReplaceGroup(-516028300);
                        TextKt.ProvideTextStyle(textStyle, Expect_jvmKt.rememberComposableLambda(-738208900, new DatePickerKt$DatePickerHeader$1$1(1, function2), gapComposer3), gapComposer3, 48);
                        r1 = 0;
                        gapComposer3.end(false);
                    } else {
                        r1 = 0;
                        gapComposer3.startReplaceGroup(-515838022);
                        gapComposer3.end(false);
                    }
                    if (function22 == null) {
                        gapComposer3.startReplaceGroup(-515799087);
                    } else {
                        gapComposer3.startReplaceGroup(260455984);
                        function22.invoke(gapComposer3, Integer.valueOf((int) r1));
                    }
                    gapComposer3.end(r1);
                    gapComposer3.end(true);
                    if (function23 == null && function2 == null && function22 == null) {
                        gapComposer3.startReplaceGroup(-250277930);
                        gapComposer3.end(r1);
                    } else {
                        gapComposer3.startReplaceGroup(-250360576);
                        MenuKt.m536HorizontalDivider9IZ8Weo(RecyclerView.DECELERATION_RATE, 0, datePickerColors.dividerColor, gapComposer3, null);
                        gapComposer3.end(r1);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer4 = (Composer) obj;
                DialogNavigator dialogNavigator = (DialogNavigator) obj7;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer4 = (GapComposer) composer4;
                    if (gapComposer4.getSkipping()) {
                        gapComposer4.skipToGroupEnd();
                        return Unit.INSTANCE;
                    }
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                boolean changedInstance = gapComposer5.changedInstance(navBackStackEntry) | gapComposer5.changedInstance(dialogNavigator);
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                Object rememberedValue3 = gapComposer5.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new androidx.compose.material.MenuKt$$ExternalSyntheticLambda0(24, snapshotStateList, navBackStackEntry, dialogNavigator);
                    gapComposer5.updateRememberedValue(rememberedValue3);
                }
                Updater.DisposableEffect(navBackStackEntry, (Function1) rememberedValue3, gapComposer5);
                CashInsetsListenerKt.LocalOwnersProvider(navBackStackEntry, (SaveableStateHolder) obj4, Expect_jvmKt.rememberComposableLambda(-497631156, new ButtonKt$Button$2.AnonymousClass1(8, (DialogNavigator.Destination) obj3, navBackStackEntry), gapComposer5), gapComposer5, MLKEMEngine.KyberPolyBytes);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DatePickerKt$DatePicker$6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.$state = obj;
        this.$calendarModel = obj2;
        this.$dateFormatter = obj3;
        this.$colors = obj4;
        this.$focusRequester = obj5;
    }
}

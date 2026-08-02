package com.squareup.cash.blockers.views;

import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.StableHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class CalendarDatePickerKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CalendarBlockerViewModel.Loaded.ToolbarButton f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function1 f$10;
    public final /* synthetic */ Function0 f$11;
    public final /* synthetic */ boolean f$12;
    public final /* synthetic */ String f$13;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ CalendarBlockerViewModel.Loaded.Toggle f$3;
    public final /* synthetic */ StableHolder f$4;
    public final /* synthetic */ StableHolder f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ StableHolder f$7;
    public final /* synthetic */ StableHolder f$8;
    public final /* synthetic */ Function1 f$9;

    public /* synthetic */ CalendarDatePickerKt$$ExternalSyntheticLambda7(CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton, Function0 function0, String str, CalendarBlockerViewModel.Loaded.Toggle toggle, StableHolder stableHolder, StableHolder stableHolder2, boolean z, StableHolder stableHolder3, StableHolder stableHolder4, Function1 function1, Function1 function12, Function0 function02, boolean z2, String str2) {
        this.f$0 = toolbarButton;
        this.f$1 = function0;
        this.f$2 = str;
        this.f$3 = toggle;
        this.f$4 = stableHolder;
        this.f$5 = stableHolder2;
        this.f$6 = z;
        this.f$7 = stableHolder3;
        this.f$8 = stableHolder4;
        this.f$9 = function1;
        this.f$10 = function12;
        this.f$11 = function02;
        this.f$12 = z2;
        this.f$13 = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02e2  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        NavigationType navigationType;
        NeverEqualPolicy neverEqualPolicy;
        NeverEqualPolicy neverEqualPolicy2;
        StableHolder stableHolder;
        boolean changed;
        Object rememberedValue;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton = this.f$0;
                    int i = toolbarButton == null ? -1 : CalendarDatePickerKt.WhenMappings.$EnumSwitchMapping$1[toolbarButton.ordinal()];
                    if (i == -1) {
                        navigationType = NavigationType.NONE;
                    } else if (i == 1) {
                        navigationType = NavigationType.BACK;
                    } else {
                        if (i != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.CLOSE;
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, this.f$1, (Modifier) null, (Function3) null, gapComposer, 6, 108);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    Countries.PageHeader(this.f$2, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                    CalendarBlockerViewModel.Loaded.Toggle toggle = this.f$3;
                    NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                    if (toggle == null) {
                        gapComposer.startReplaceGroup(441088269);
                        gapComposer.end(false);
                        neverEqualPolicy = neverEqualPolicy3;
                    } else {
                        gapComposer.startReplaceGroup(441088270);
                        CellDefaultAccessory.Toggle toggle2 = new CellDefaultAccessory.Toggle(toggle.toggledOn);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-829658366, new CashtagViewKt$$ExternalSyntheticLambda10(toggle, 23), gapComposer);
                        Function1 function1 = this.f$10;
                        boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(toggle);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy3) {
                            rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(11, function1, toggle);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        neverEqualPolicy = neverEqualPolicy3;
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue2, false, false, null, null, 0L, toggle2, null, gapComposer, 6, 1530);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    float f = 16.0f;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceEvenly, Alignment.Companion.Top, gapComposer, 6);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    gapComposer.startReplaceGroup(-576713319);
                    Iterator it = CalendarDatePickerKt.daysOfWeekSundayFirst.iterator();
                    while (it.hasNext()) {
                        DayOfWeek dayOfWeek = (DayOfWeek) it.next();
                        Locale locale = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0);
                        String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT, locale);
                        displayName.getClass();
                        locale.getClass();
                        String upperCase = displayName.toUpperCase(locale);
                        upperCase.getClass();
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        androidx.compose.ui.text.TextStyle m994copyp1EtxEg$default = androidx.compose.ui.text.TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, 0L, Room.getSp(13), new FontWeight(590), null, Room.getSp(0), null, 0L, null, null, null, 0, Room.getSp(18), null, null, 0, 16646009);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        GapComposer gapComposer2 = gapComposer;
                        Room.m1165Text25TpFw(0, 1, 0, 3, 1572864, 0, 3760, colors.semantic.text.placeholder, (Composer) gapComposer2, (Modifier) layoutWeightElement, m994copyp1EtxEg$default, (TextLineBalancing) null, upperCase, (Map) null, (Function1) null, false);
                        f = f;
                        gapComposer = gapComposer2;
                    }
                    float f2 = f;
                    gapComposer.end(false);
                    gapComposer.end(true);
                    ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                    LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
                    Unit unit = Unit.INSTANCE;
                    StableHolder stableHolder2 = this.f$4;
                    boolean changed3 = gapComposer.changed(stableHolder2);
                    StableHolder stableHolder3 = this.f$5;
                    boolean changed4 = changed3 | gapComposer.changed(stableHolder3) | gapComposer.changed(rememberLazyGridState);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed4) {
                        neverEqualPolicy2 = neverEqualPolicy;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy;
                        if (rememberedValue3 != neverEqualPolicy2) {
                            stableHolder = stableHolder3;
                            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                            boolean z = this.f$6;
                            Modifier alpha = AlphaKt.alpha(layoutWeightElement2, z ? 1.0f : 0.5f);
                            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(f2, RecyclerView.DECELERATION_RATE, 2);
                            GridCells.Fixed fixed = new GridCells.Fixed(7);
                            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
                            boolean changed5 = gapComposer.changed(stableHolder);
                            StableHolder stableHolder4 = this.f$7;
                            boolean changed6 = changed5 | gapComposer.changed(stableHolder4) | gapComposer.changed(z);
                            StableHolder stableHolder5 = this.f$8;
                            boolean changed7 = changed6 | gapComposer.changed(stableHolder5) | gapComposer.changed(stableHolder2);
                            Function1 function12 = this.f$9;
                            changed = changed7 | gapComposer.changed(function12);
                            rememberedValue = gapComposer.rememberedValue();
                            if (!changed || rememberedValue == neverEqualPolicy2) {
                                SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda0 = new SessionQueries$$ExternalSyntheticLambda0(stableHolder, stableHolder4, z, stableHolder5, stableHolder2, function12);
                                gapComposer.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda0);
                                rememberedValue = sessionQueries$$ExternalSyntheticLambda0;
                            }
                            GapComposer gapComposer3 = gapComposer;
                            LazyGridDslKt.LazyVerticalGrid(fixed, alpha, rememberLazyGridState, m295PaddingValuesYgX7TsA$default, arrangement$Center$1, arrangement$Center$1, null, false, null, (Function1) rememberedValue, gapComposer3, 1772544, 912);
                            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1042112205, new CalendarDatePickerKt$$ExternalSyntheticLambda12(this.f$13, this.f$11, this.f$12, 0), gapComposer3), gapComposer3, 24576, 15);
                            gapComposer3.end(true);
                        }
                    }
                    FileBlockerView$6$2$2 fileBlockerView$6$2$2 = new FileBlockerView$6$2$2(stableHolder2, stableHolder3, rememberLazyGridState, null, 20);
                    stableHolder = stableHolder3;
                    gapComposer.updateRememberedValue(fileBlockerView$6$2$2);
                    rememberedValue3 = fileBlockerView$6$2$2;
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                    LayoutWeightElement layoutWeightElement22 = new LayoutWeightElement(1.0f, true);
                    boolean z2 = this.f$6;
                    Modifier alpha2 = AlphaKt.alpha(layoutWeightElement22, z2 ? 1.0f : 0.5f);
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default2 = SpacerKt.m295PaddingValuesYgX7TsA$default(f2, RecyclerView.DECELERATION_RATE, 2);
                    GridCells.Fixed fixed2 = new GridCells.Fixed(7);
                    Arrangement$Center$1 arrangement$Center$12 = SpacerKt.Center;
                    boolean changed52 = gapComposer.changed(stableHolder);
                    StableHolder stableHolder42 = this.f$7;
                    boolean changed62 = changed52 | gapComposer.changed(stableHolder42) | gapComposer.changed(z2);
                    StableHolder stableHolder52 = this.f$8;
                    boolean changed72 = changed62 | gapComposer.changed(stableHolder52) | gapComposer.changed(stableHolder2);
                    Function1 function122 = this.f$9;
                    changed = changed72 | gapComposer.changed(function122);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed) {
                    }
                    SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda02 = new SessionQueries$$ExternalSyntheticLambda0(stableHolder, stableHolder42, z2, stableHolder52, stableHolder2, function122);
                    gapComposer.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda02);
                    rememberedValue = sessionQueries$$ExternalSyntheticLambda02;
                    GapComposer gapComposer32 = gapComposer;
                    LazyGridDslKt.LazyVerticalGrid(fixed2, alpha2, rememberLazyGridState, m295PaddingValuesYgX7TsA$default2, arrangement$Center$12, arrangement$Center$12, null, false, null, (Function1) rememberedValue, gapComposer32, 1772544, 912);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1042112205, new CalendarDatePickerKt$$ExternalSyntheticLambda12(this.f$13, this.f$11, this.f$12, 0), gapComposer32), gapComposer32, 24576, 15);
                    gapComposer32.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                CalendarDatePickerKt.CalendarDatePicker(this.f$2, this.f$13, this.f$4, this.f$5, this.f$7, this.f$8, this.f$6, this.f$0, this.f$12, this.f$3, this.f$9, this.f$10, this.f$1, this.f$11, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CalendarDatePickerKt$$ExternalSyntheticLambda7(String str, String str2, StableHolder stableHolder, StableHolder stableHolder2, StableHolder stableHolder3, StableHolder stableHolder4, boolean z, CalendarBlockerViewModel.Loaded.ToolbarButton toolbarButton, boolean z2, CalendarBlockerViewModel.Loaded.Toggle toggle, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i) {
        this.f$2 = str;
        this.f$13 = str2;
        this.f$4 = stableHolder;
        this.f$5 = stableHolder2;
        this.f$7 = stableHolder3;
        this.f$8 = stableHolder4;
        this.f$6 = z;
        this.f$0 = toolbarButton;
        this.f$12 = z2;
        this.f$3 = toggle;
        this.f$9 = function1;
        this.f$10 = function12;
        this.f$1 = function0;
        this.f$11 = function02;
    }
}

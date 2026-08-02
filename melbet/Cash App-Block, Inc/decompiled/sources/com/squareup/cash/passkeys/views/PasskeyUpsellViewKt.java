package com.squareup.cash.passkeys.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PasskeyUpsellViewKt {

    /* renamed from: lambda$-1477876215, reason: not valid java name */
    public static final ComposableLambdaImpl f534lambda$1477876215 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(5), false, -1477876215);

    /* renamed from: lambda$-685321777, reason: not valid java name */
    public static final ComposableLambdaImpl f539lambda$685321777 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(20), false, -685321777);
    public static final ComposableLambdaImpl lambda$1507192016 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(21), false, 1507192016);
    public static final ComposableLambdaImpl lambda$1777372886 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(22), false, 1777372886);

    /* renamed from: lambda$-420339322, reason: not valid java name */
    public static final ComposableLambdaImpl f538lambda$420339322 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(23), false, -420339322);
    public static final ComposableLambdaImpl lambda$2051440711 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(24), false, 2051440711);

    /* renamed from: lambda$-297748275, reason: not valid java name */
    public static final ComposableLambdaImpl f537lambda$297748275 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(25), false, -297748275);
    public static final ComposableLambdaImpl lambda$1940421575 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(26), false, 1940421575);
    public static final ComposableLambdaImpl lambda$117234312 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(27), false, 117234312);
    public static final ComposableLambdaImpl lambda$2063012622 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(19), false, 2063012622);

    /* renamed from: lambda$-1700142586, reason: not valid java name */
    public static final ComposableLambdaImpl f535lambda$1700142586 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(6), false, -1700142586);

    /* renamed from: lambda$-767517435, reason: not valid java name */
    public static final ComposableLambdaImpl f540lambda$767517435 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(17), false, -767517435);

    /* renamed from: lambda$-947839080, reason: not valid java name */
    public static final ComposableLambdaImpl f541lambda$947839080 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(18), false, -947839080);

    /* renamed from: lambda$-1208828901, reason: not valid java name */
    public static final ComposableLambdaImpl f533lambda$1208828901 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(7), false, -1208828901);

    /* renamed from: lambda$-1835735210, reason: not valid java name */
    public static final ComposableLambdaImpl f536lambda$1835735210 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(8), false, -1835735210);

    public static final void EmptyContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1904490731);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f539lambda$685321777, lambda$1507192016, null, null, false, false, lambda$1777372886, null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f538lambda$420339322, lambda$2051440711, null, null, false, false, f537lambda$297748275, null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1940421575, lambda$117234312, null, null, false, false, lambda$2063012622, null, null, 0L, gapComposer, 12582966, 3964);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 29);
        }
    }

    public static final void ErrorContent(PasskeyManagementViewModel.Error error, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(975660276);
        int i2 = i | (gapComposer.changedInstance(error) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, error.title, (Map) null, (Function1) null, false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, error.body, (Map) null, (Function1) null, false);
            if (error.isRetrying) {
                gapComposer.startReplaceGroup(413272176);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(413361363);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(3, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, m302paddingqDBjuR0$default, null, false, false, null, f535lambda$1700142586, gapComposer, 1572912, 60);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0((Object) error, function1, (Object) modifier, i, 12);
        }
    }

    public static final void LoadedContent(List list, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1026071798);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-394355181);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel = (PasskeyManagementViewModel.PasskeyItemViewModel) it.next();
                boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(passkeyItemViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i2, function1, passkeyItemViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                PasskeyItemCell(passkeyItemViewModel, null, new CellDefaultAccessory.ButtonCompact(null, null, true, Expect_jvmKt.rememberComposableLambda(1351046050, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(Room.stringResource(gapComposer, R.string.passkeys_remove_button), 17), gapComposer), 3), (Function0) rememberedValue, Room.stringResource(gapComposer, R.string.passkeys_remove_button_click_label), gapComposer, 0, 2);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 5);
        }
    }

    public static final void PasskeyItemCell(final PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel, Modifier modifier, CellDefaultAccessory cellDefaultAccessory, Function0 function0, String str, Composer composer, int i, int i2) {
        CellDefaultAccessory cellDefaultAccessory2;
        int i3;
        Function0 function02;
        int i4;
        String str2;
        int i5;
        GapComposer gapComposer;
        CellDefaultAccessory cellDefaultAccessory3;
        Function0 function03;
        String str3;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-131591492);
        int i6 = i | (gapComposer2.changedInstance(passkeyItemViewModel) ? 4 : 2);
        int i7 = i6 | 48;
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i6 | 432;
            cellDefaultAccessory2 = cellDefaultAccessory;
        } else {
            cellDefaultAccessory2 = cellDefaultAccessory;
            i3 = i7 | (gapComposer2.changed(cellDefaultAccessory2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 = i3 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i3 | (gapComposer2.changedInstance(function02) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i4 | 24576;
            str2 = str;
        } else {
            str2 = str;
            i5 = i4 | (gapComposer2.changed(str2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        final int i11 = 0;
        final int i12 = 1;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            if (i8 != 0) {
                cellDefaultAccessory2 = CellDefaultAccessory.None.INSTANCE;
            }
            CellDefaultAccessory cellDefaultAccessory4 = cellDefaultAccessory2;
            Function0 function04 = i9 != 0 ? null : function02;
            String str4 = i10 != 0 ? null : str2;
            Icons icons = Icons.Passkey24;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.subtle;
            boolean z = (i5 & 7168) == 2048;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(27, function04);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i13 = i5 << 9;
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, Expect_jvmKt.rememberComposableLambda(-1083935455, new Function2() { // from class: com.squareup.cash.passkeys.views.PasskeyManagementViewKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i11;
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel2 = passkeyItemViewModel;
                    switch (i14) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, passkeyItemViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, passkeyItemViewModel2.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 0L, function04, str4, false, true, Expect_jvmKt.rememberComposableLambda(-928291723, new Function2() { // from class: com.squareup.cash.passkeys.views.PasskeyManagementViewKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i12;
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel2 = passkeyItemViewModel;
                    switch (i14) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, passkeyItemViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, passkeyItemViewModel2.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, cellDefaultAccessory4, 0L, null, gapComposer, (3670016 & i13) | 805309494 | (i13 & 29360128), (i5 & 896) | 6, 26912);
            modifier2 = companion;
            function03 = function04;
            str3 = str4;
            cellDefaultAccessory3 = cellDefaultAccessory4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            cellDefaultAccessory3 = cellDefaultAccessory2;
            function03 = function02;
            str3 = str2;
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(passkeyItemViewModel, modifier2, cellDefaultAccessory3, function03, str3, i, i2);
        }
    }

    public static final void PasskeyManagementFooter(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1626068660);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1399537842, new MusicViewKt$$ExternalSyntheticLambda7(23, function1), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda0(i, 28, function1);
        }
    }

    public static final void PasskeyManagementHeader(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-493290827);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String stringResource = Room.stringResource(gapComposer, R.string.passkeys_description);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 28);
        }
    }

    public static final void PasskeyManagementTitleBar(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1656975756);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.passkeys_title);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda0(i, 27, function1);
        }
    }

    public static final void PasskeyManagementView(final PasskeyManagementViewModel passkeyManagementViewModel, final Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z;
        passkeyManagementViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2119018144);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(passkeyManagementViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            PasskeyOperationSheetUiState passkeyOperationSheetUiState = null;
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i6 = 22;
            if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Error) {
                gapComposer.startReplaceGroup(193789661);
                companion = companion2;
                ScreenScaffoldKt.ScreenScaffoldGeneric(SizeKt.fillMaxSize(companion2, 1.0f), ImageKt.rememberScrollState(gapComposer), Expect_jvmKt.rememberComposableLambda(2045656697, new MusicViewKt$$ExternalSyntheticLambda7(21, function1), gapComposer), null, Expect_jvmKt.rememberComposableLambda(-1901265060, new Function3() { // from class: com.squareup.cash.passkeys.views.PasskeyManagementViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i4;
                        Function1 function12 = function1;
                        boolean z2 = false;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ScreenScaffoldContentScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    PasskeyManagementViewModel.Error error = (PasskeyManagementViewModel.Error) passkeyManagementViewModel;
                                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                    PasskeyUpsellViewKt.ErrorContent(error, function12, SpacerKt.padding(Modifier.Companion.$$INSTANCE, SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer2).navigationBars, gapComposer2)), gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ScrollingScaffoldContentScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    PasskeyUpsellViewKt.PasskeyManagementHeader(gapComposer3, 0);
                                    PasskeyManagementViewModel passkeyManagementViewModel2 = passkeyManagementViewModel;
                                    boolean z3 = passkeyManagementViewModel2 instanceof PasskeyManagementViewModel.Loading;
                                    Object rememberedValue = gapComposer3.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(25);
                                        gapComposer3.updateRememberedValue(rememberedValue);
                                    }
                                    Strings.LoadableFullScreenContent(passkeyManagementViewModel2, z3, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(897084577, new HeroCardViewKt$$ExternalSyntheticLambda1(function12, z2, 9), gapComposer3), gapComposer3, 199680, 20);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 24966, 8);
                gapComposer.end(false);
                z = true;
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(194200318);
                z = true;
                ScreenScaffoldKt.ScreenScaffoldColumn(SizeKt.fillMaxSize(companion, 1.0f), null, null, Expect_jvmKt.rememberComposableLambda(1422614434, new MusicViewKt$$ExternalSyntheticLambda7(i6, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-2142444525, new NfcNotAvailableKt$$ExternalSyntheticLambda0(26, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1816467596, new Function3() { // from class: com.squareup.cash.passkeys.views.PasskeyManagementViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i5;
                        Function1 function12 = function1;
                        boolean z2 = false;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ScreenScaffoldContentScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    PasskeyManagementViewModel.Error error = (PasskeyManagementViewModel.Error) passkeyManagementViewModel;
                                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                                    PasskeyUpsellViewKt.ErrorContent(error, function12, SpacerKt.padding(Modifier.Companion.$$INSTANCE, SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer2).navigationBars, gapComposer2)), gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ScrollingScaffoldContentScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    PasskeyUpsellViewKt.PasskeyManagementHeader(gapComposer3, 0);
                                    PasskeyManagementViewModel passkeyManagementViewModel2 = passkeyManagementViewModel;
                                    boolean z3 = passkeyManagementViewModel2 instanceof PasskeyManagementViewModel.Loading;
                                    Object rememberedValue = gapComposer3.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(25);
                                        gapComposer3.updateRememberedValue(rememberedValue);
                                    }
                                    Strings.LoadableFullScreenContent(passkeyManagementViewModel2, z3, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(897084577, new HeroCardViewKt$$ExternalSyntheticLambda1(function12, z2, 9), gapComposer3), gapComposer3, 199680, 20);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 224262, 6);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            PasskeyManagementViewModel.OperationState operationState = passkeyManagementViewModel.getOperationState();
            boolean z2 = operationState instanceof PasskeyManagementViewModel.OperationState.Remove;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            int i7 = R.string.passkeys_remove_confirmation_cancel;
            if (z2) {
                gapComposer.startReplaceGroup(1534671903);
                PasskeyManagementViewModel.OperationState.Remove remove = (PasskeyManagementViewModel.OperationState.Remove) operationState;
                if (remove instanceof PasskeyManagementViewModel.OperationState.Remove.InProgress) {
                    gapComposer.startReplaceGroup(244727294);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda2(23);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    PasskeyOperationSheetUiState inProgress = new PasskeyOperationSheetUiState.InProgress((Function0) rememberedValue);
                    gapComposer.end(false);
                    passkeyOperationSheetUiState = inProgress;
                } else if (remove instanceof PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) {
                    gapComposer.startReplaceGroup(-823383495);
                    int i8 = (i3 & 112) ^ 48;
                    boolean z3 = ((i8 <= 32 || !gapComposer.changed(function1)) && (i3 & 48) != 32) ? false : z;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z3 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda2(4, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    String stringResource = Room.stringResource(gapComposer, R.string.passkeys_remove_confirmation_title);
                    PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation awaitingConfirmation = (PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) remove;
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel = awaitingConfirmation.passkey;
                    String stringResource2 = Room.stringResource(gapComposer, R.string.passkeys_remove_confirmation_cancel);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean z4 = ((i8 <= 32 || !gapComposer.changed(function1)) && (i3 & 48) != 32) ? false : z;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z4 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new HelpSheetViewKt$$ExternalSyntheticLambda2(5, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    PasskeyOperationSheetButton passkeyOperationSheetButton = new PasskeyOperationSheetButton(stringResource2, buttonProminence, false, (Function0) rememberedValue3);
                    String stringResource3 = Room.stringResource(gapComposer, R.string.passkeys_remove_confirmation_remove);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean changedInstance = ((i8 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32) | gapComposer.changedInstance(remove);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(14, function1, awaitingConfirmation);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    passkeyOperationSheetUiState = new PasskeyOperationSheetUiState.Content(function0, stringResource, null, passkeyItemViewModel, CollectionsKt__CollectionsKt.listOf((Object[]) new PasskeyOperationSheetButton[]{passkeyOperationSheetButton, new PasskeyOperationSheetButton(stringResource3, buttonProminence2, true, (Function0) rememberedValue4)}));
                    gapComposer.end(false);
                } else if (remove instanceof PasskeyManagementViewModel.OperationState.Remove.Success) {
                    gapComposer.startReplaceGroup(-823354477);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new P2PListViewKt$$ExternalSyntheticLambda2(24);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    String stringResource4 = Room.stringResource(gapComposer, R.string.passkeys_remove_success_title);
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel2 = ((PasskeyManagementViewModel.OperationState.Remove.Success) remove).passkey;
                    String stringResource5 = Room.stringResource(gapComposer, R.string.passkeys_remove_success_manage_devices);
                    ButtonProminence buttonProminence3 = ButtonProminence.STANDARD;
                    int i9 = (i3 & 112) ^ 48;
                    boolean z5 = (i9 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new HelpSheetViewKt$$ExternalSyntheticLambda2(6, function1);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    PasskeyOperationSheetButton passkeyOperationSheetButton2 = new PasskeyOperationSheetButton(stringResource5, buttonProminence3, false, (Function0) rememberedValue6);
                    String stringResource6 = Room.stringResource(gapComposer, R.string.passkeys_remove_success_done);
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean z6 = (i9 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (z6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new HelpSheetViewKt$$ExternalSyntheticLambda2(7, function1);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    passkeyOperationSheetUiState = new PasskeyOperationSheetUiState.Content(function02, stringResource4, null, passkeyItemViewModel2, CollectionsKt__CollectionsKt.listOf((Object[]) new PasskeyOperationSheetButton[]{passkeyOperationSheetButton2, new PasskeyOperationSheetButton(stringResource6, buttonProminence4, false, (Function0) rememberedValue7)}));
                    gapComposer.end(false);
                } else {
                    if (!(remove instanceof PasskeyManagementViewModel.OperationState.Remove.Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -823388968, false);
                    }
                    gapComposer.startReplaceGroup(-823328553);
                    int i10 = (i3 & 112) ^ 48;
                    boolean z7 = (i10 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (z7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new HelpSheetViewKt$$ExternalSyntheticLambda2(8, function1);
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function03 = (Function0) rememberedValue8;
                    String stringResource7 = Room.stringResource(gapComposer, R.string.passkeys_remove_error_title);
                    String stringResource8 = Room.stringResource(gapComposer, R.string.passkeys_remove_error_body);
                    PasskeyManagementViewModel.OperationState.Remove.Error error = (PasskeyManagementViewModel.OperationState.Remove.Error) remove;
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel3 = error.passkey;
                    String stringResource9 = Room.stringResource(gapComposer, R.string.passkeys_remove_confirmation_cancel);
                    ButtonProminence buttonProminence5 = ButtonProminence.STANDARD;
                    boolean z8 = (i10 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue9 = gapComposer.rememberedValue();
                    if (z8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new HelpSheetViewKt$$ExternalSyntheticLambda2(9, function1);
                        gapComposer.updateRememberedValue(rememberedValue9);
                    }
                    PasskeyOperationSheetButton passkeyOperationSheetButton3 = new PasskeyOperationSheetButton(stringResource9, buttonProminence5, false, (Function0) rememberedValue9);
                    String stringResource10 = Room.stringResource(gapComposer, R.string.passkeys_remove_error_retry);
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    boolean changedInstance2 = ((i10 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32) | gapComposer.changedInstance(remove);
                    Object rememberedValue10 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(15, function1, error);
                        gapComposer.updateRememberedValue(rememberedValue10);
                    }
                    passkeyOperationSheetUiState = new PasskeyOperationSheetUiState.Content(function03, stringResource7, stringResource8, passkeyItemViewModel3, CollectionsKt__CollectionsKt.listOf((Object[]) new PasskeyOperationSheetButton[]{passkeyOperationSheetButton3, new PasskeyOperationSheetButton(stringResource10, buttonProminence6, true, (Function0) rememberedValue10)}));
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else if (operationState instanceof PasskeyManagementViewModel.OperationState.Create) {
                gapComposer.startReplaceGroup(1534675455);
                PasskeyManagementViewModel.OperationState.Create create = (PasskeyManagementViewModel.OperationState.Create) operationState;
                if (create instanceof PasskeyManagementViewModel.OperationState.Create.InProgress) {
                    gapComposer.startReplaceGroup(263840959);
                    boolean z9 = (((i3 & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue11 = gapComposer.rememberedValue();
                    if (z9 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new P2PListViewKt$$ExternalSyntheticLambda0(27, function1);
                        gapComposer.updateRememberedValue(rememberedValue11);
                    }
                    PasskeyOperationSheetUiState inProgress2 = new PasskeyOperationSheetUiState.InProgress((Function0) rememberedValue11);
                    gapComposer.end(false);
                    passkeyOperationSheetUiState = inProgress2;
                } else if (create instanceof PasskeyManagementViewModel.OperationState.Create.Error) {
                    gapComposer.startReplaceGroup(264025440);
                    int i11 = (i3 & 112) ^ 48;
                    boolean z10 = (i11 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue12 = gapComposer.rememberedValue();
                    if (z10 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new P2PListViewKt$$ExternalSyntheticLambda0(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue12);
                    }
                    Function0 function04 = (Function0) rememberedValue12;
                    PasskeyManagementViewModel.OperationState.Create.Error error2 = (PasskeyManagementViewModel.OperationState.Create.Error) create;
                    boolean z11 = error2.useDoneButton;
                    String str = error2.title;
                    String str2 = error2.body;
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (z11) {
                        i7 = R.string.passkeys_create_error_done;
                    }
                    String stringResource11 = Room.stringResource(gapComposer, i7);
                    ButtonProminence buttonProminence7 = z11 ? ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
                    boolean z12 = (i11 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue13 = gapComposer.rememberedValue();
                    if (z12 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new P2PListViewKt$$ExternalSyntheticLambda0(29, function1);
                        gapComposer.updateRememberedValue(rememberedValue13);
                    }
                    createListBuilder.add(new PasskeyOperationSheetButton(stringResource11, buttonProminence7, false, (Function0) rememberedValue13));
                    if (error2.isRetryable) {
                        gapComposer.startReplaceGroup(2119302145);
                        String stringResource12 = Room.stringResource(gapComposer, R.string.passkeys_create_error_retry);
                        ButtonProminence buttonProminence8 = ButtonProminence.PROMINENT;
                        boolean z13 = (i11 > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                        Object rememberedValue14 = gapComposer.rememberedValue();
                        if (z13 || rememberedValue14 == neverEqualPolicy) {
                            rememberedValue14 = new HelpSheetViewKt$$ExternalSyntheticLambda2(1, function1);
                            gapComposer.updateRememberedValue(rememberedValue14);
                        }
                        createListBuilder.add(new PasskeyOperationSheetButton(stringResource12, buttonProminence8, false, (Function0) rememberedValue14));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2119639456);
                        gapComposer.end(false);
                    }
                    passkeyOperationSheetUiState = new PasskeyOperationSheetUiState.Content(function04, str, str2, null, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                    gapComposer.end(false);
                } else {
                    if (!(create instanceof PasskeyManagementViewModel.OperationState.Create.Success)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 424152869, false);
                    }
                    gapComposer.startReplaceGroup(424203860);
                    Object rememberedValue15 = gapComposer.rememberedValue();
                    if (rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new P2PListViewKt$$ExternalSyntheticLambda2(22);
                        gapComposer.updateRememberedValue(rememberedValue15);
                    }
                    Function0 function05 = (Function0) rememberedValue15;
                    String stringResource13 = Room.stringResource(gapComposer, R.string.passkeys_create_success_title);
                    PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel4 = ((PasskeyManagementViewModel.OperationState.Create.Success) create).passkey;
                    String stringResource14 = Room.stringResource(gapComposer, R.string.passkeys_remove_success_done);
                    ButtonProminence buttonProminence9 = ButtonProminence.PROMINENT;
                    boolean z14 = (((i3 & 112) ^ 48) > 32 && gapComposer.changed(function1)) || (i3 & 48) == 32;
                    Object rememberedValue16 = gapComposer.rememberedValue();
                    if (z14 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new HelpSheetViewKt$$ExternalSyntheticLambda2(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue16);
                    }
                    PasskeyOperationSheetUiState content = new PasskeyOperationSheetUiState.Content(function05, stringResource13, null, passkeyItemViewModel4, CollectionsKt__CollectionsJVMKt.listOf(new PasskeyOperationSheetButton(stringResource14, buttonProminence9, false, (Function0) rememberedValue16)));
                    gapComposer.end(false);
                    passkeyOperationSheetUiState = content;
                }
                gapComposer.end(false);
            } else {
                if (operationState != null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1534670113, false);
                }
                gapComposer.startReplaceGroup(330381062);
                gapComposer.end(false);
            }
            PasskeyOperationSheetUiState passkeyOperationSheetUiState2 = passkeyOperationSheetUiState;
            if (passkeyOperationSheetUiState2 != null) {
                gapComposer.startReplaceGroup(195492956);
                PasskeyOperationSheet(passkeyOperationSheetUiState2, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(195554460);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(passkeyManagementViewModel, function1, modifier2, i, 7);
        }
    }

    public static final void PasskeyOperationSheet(PasskeyOperationSheetUiState passkeyOperationSheetUiState, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(516677700);
        int i2 = (gapComposer.changed(passkeyOperationSheetUiState) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SheetKt.Sheet(passkeyOperationSheetUiState.getOnDismissRequest(), null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(484923803, new PasskeyManagementViewKt$$ExternalSyntheticLambda10(passkeyOperationSheetUiState, i3), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasskeyManagementViewKt$$ExternalSyntheticLambda11(passkeyOperationSheetUiState, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final void PasskeyOperationSheetContent(PasskeyOperationSheetUiState passkeyOperationSheetUiState, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ?? r12;
        ComposableLambdaImpl composableLambdaImpl;
        int i3;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1200508414);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer3.changed(passkeyOperationSheetUiState) : gapComposer3.changedInstance(passkeyOperationSheetUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(paddingValues) ? 32 : 16;
        }
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
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
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (passkeyOperationSheetUiState instanceof PasskeyOperationSheetUiState.InProgress) {
                gapComposer3.startReplaceGroup(-2054042038);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 64.0f, 1);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                gapComposer3.end(true);
                gapComposer3.end(false);
                gapComposer = gapComposer3;
            } else {
                if (!(passkeyOperationSheetUiState instanceof PasskeyOperationSheetUiState.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 626475746, false);
                }
                gapComposer3.startReplaceGroup(-2053783901);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2034142458, new PasskeyManagementViewKt$$ExternalSyntheticLambda11(passkeyOperationSheetUiState), gapComposer3);
                PasskeyOperationSheetUiState.Content content = (PasskeyOperationSheetUiState.Content) passkeyOperationSheetUiState;
                String str = content.body;
                if (str == null) {
                    gapComposer3.startReplaceGroup(-2053693227);
                    r12 = 0;
                    gapComposer3.end(false);
                    composableLambdaImpl = null;
                } else {
                    r12 = 0;
                    gapComposer3.startReplaceGroup(-2053693226);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1035125438, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 21), gapComposer3);
                    gapComposer3.end(false);
                    composableLambdaImpl = rememberComposableLambda2;
                }
                GapComposer gapComposer4 = gapComposer3;
                Transformations.SheetHeader(rememberComposableLambda, (Modifier) null, (Function2) null, composableLambdaImpl, gapComposer4, 6, 6);
                PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel = content.passkey;
                if (passkeyItemViewModel != null) {
                    gapComposer4.startReplaceGroup(-2053586803);
                    DBUtil.SpacerWithinSectionSmall(r12, 1, gapComposer4, null);
                    PasskeyItemCell(passkeyItemViewModel, null, null, null, null, gapComposer4, 0, 30);
                    GapComposer gapComposer5 = gapComposer4;
                    gapComposer5.end(r12);
                    i3 = 1;
                    gapComposer2 = gapComposer5;
                } else {
                    gapComposer4.startReplaceGroup(-2053489959);
                    i3 = 1;
                    DBUtil.SpacerWithinSectionMedium(r12, 1, gapComposer4, null);
                    gapComposer4.end(r12);
                    gapComposer2 = gapComposer4;
                }
                GapComposer gapComposer6 = gapComposer2;
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-797365221, new PasskeyManagementViewKt$$ExternalSyntheticLambda10(passkeyOperationSheetUiState, i3), gapComposer2), gapComposer6, 24576, 15);
                gapComposer = gapComposer6;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(passkeyOperationSheetUiState, paddingValues, i, 18);
        }
    }

    public static final void PasskeyUpsellView(PasskeyUpsellViewModel passkeyUpsellViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        passkeyUpsellViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1354152822);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(passkeyUpsellViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ScreenScaffoldKt.ScreenScaffoldColumn(SizeKt.fillMaxSize(modifier, 1.0f), null, null, Expect_jvmKt.rememberComposableLambda(-347373080, new PasskeyUpsellViewKt$$ExternalSyntheticLambda0(passkeyUpsellViewModel, function1, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(1266477273, new PaycheckCirclesKt$$ExternalSyntheticLambda3(i5, passkeyUpsellViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1241994194, new P2PListViewKt$$ExternalSyntheticLambda12(passkeyUpsellViewModel, 23), gapComposer), gapComposer, 224262, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(passkeyUpsellViewModel, function1, modifier2, i, 8);
        }
    }
}

package com.squareup.cash.cashapplite.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapplite.presenters.ActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.KycAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.cashapplite.viewmodels.AddMoneyRowId;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileModel;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.viewmodels.PasskeySignatureBlockerViewModel;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class KycAppletTileKt {
    public static final ComposableLambdaImpl lambda$965951453 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(2), false, 965951453);

    /* renamed from: lambda$-1135631618, reason: not valid java name */
    public static final ComposableLambdaImpl f346lambda$1135631618 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(3), false, -1135631618);

    /* renamed from: lambda$-1889655684, reason: not valid java name */
    public static final ComposableLambdaImpl f347lambda$1889655684 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(4), false, -1889655684);

    /* renamed from: lambda$-313940691, reason: not valid java name */
    public static final ComposableLambdaImpl f349lambda$313940691 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(5), false, -313940691);
    public static final ComposableLambdaImpl lambda$883151380 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(8), false, 883151380);

    /* renamed from: lambda$-2117414401, reason: not valid java name */
    public static final ComposableLambdaImpl f348lambda$2117414401 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(28), false, -2117414401);

    public static final void AccountDetailRowItem(final LiteBalanceHomeViewModel.AccountDetailRow accountDetailRow, Function1 function1, Composer composer, int i) {
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1762523834);
        int i2 = (gapComposer.changedInstance(accountDetailRow) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 1;
        int i4 = 14;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = accountDetailRow.id.ordinal();
            if (ordinal == 0) {
                icons = Icons.BankLinked24;
            } else if (ordinal == 1) {
                icons = Icons.BankAccount24;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                icons = Icons.Wallet24;
            }
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1134963084, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i4), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2082130027, new Function2() { // from class: com.squareup.cash.cashapplite.views.LiteBalanceHomeViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    LiteBalanceHomeViewModel.AccountDetailRow accountDetailRow2 = accountDetailRow;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailRow2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int i5 = (gapComposer.changedInstance(accountDetailRow) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(24, (Object) accountDetailRow, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(-824802907, new Function2() { // from class: com.squareup.cash.cashapplite.views.LiteBalanceHomeViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i3;
                    LiteBalanceHomeViewModel.AccountDetailRow accountDetailRow2 = accountDetailRow;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailRow2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, gapComposer, 817889334, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(accountDetailRow, function1, i, 14);
        }
    }

    public static final void AccountDetails(LiteBalanceHomeViewModel liteBalanceHomeViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-530339899);
        int i2 = (gapComposer.changedInstance(liteBalanceHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            ViewfinderDefaults.SectionHeader(liteBalanceHomeViewModel.sectionTitle, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            gapComposer.startReplaceGroup(2084581492);
            Iterator it = liteBalanceHomeViewModel.rows.iterator();
            while (it.hasNext()) {
                AccountDetailRowItem((LiteBalanceHomeViewModel.AccountDetailRow) it.next(), function1, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LiteBalanceHomeViewKt$$ExternalSyntheticLambda4(liteBalanceHomeViewModel, function1, i);
        }
    }

    public static final void ActivityAppletTileUI(ActivityAppletTileViewModel activityAppletTileViewModel, Composer composer, int i) {
        InstalledAppletTileHeaderModel.Icon icon;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1057301813);
        int i2 = (gapComposer.changedInstance(activityAppletTileViewModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (Intrinsics.areEqual(activityAppletTileViewModel, ActivityAppletTileViewModel.NoActivity.INSTANCE)) {
            gapComposer.startReplaceGroup(-1211710152);
            gapComposer.end(false);
        } else {
            if (!(activityAppletTileViewModel instanceof ActivityAppletTileViewModel.Loading) && !(activityAppletTileViewModel instanceof ActivityAppletTileViewModel.Installed)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1840203604, false);
            }
            gapComposer.startReplaceGroup(-1211507319);
            String stringResource = Room.stringResource(gapComposer, R.string.lite_activity_applet_title);
            if (activityAppletTileViewModel.getShowChevron()) {
                gapComposer.startReplaceGroup(-1211274788);
                zzd zzdVar = Icons.Companion;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                icon = new InstalledAppletTileHeaderModel.Icon(colors.semantic.icon.standard, Room.stringResource(gapComposer, R.string.lite_activity_applet_show_more_content_description));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1210943801);
                gapComposer.end(false);
                icon = null;
            }
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(stringResource, null, icon, 4);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1580024242, new CheckDepositAmountKt$$ExternalSyntheticLambda8(activityAppletTileViewModel, 16), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(activityAppletTileViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(activityAppletTileViewModel, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.InstalledAppletTile(installedAppletTileHeaderModel, rememberComposableLambda, (Function0) rememberedValue, true, null, gapComposer, 3120, 16);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(activityAppletTileViewModel, i, 24);
        }
    }

    public static final void AddMoneyRowItem(AddMoneyRowId addMoneyRowId, Function1 function1, Composer composer, int i) {
        int i2;
        Icons icons;
        String stringResource;
        String stringResource2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(175504823);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(addMoneyRowId.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 21;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = addMoneyRowId.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(1489182961);
                icons = Icons.BankAccount24;
                stringResource = Room.stringResource(gapComposer, R.string.lite_add_money_use_clabe_title);
                stringResource2 = Room.stringResource(gapComposer, R.string.lite_add_money_use_clabe_subtitle);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1156415613, false);
                }
                gapComposer.startReplaceGroup(1489402100);
                icons = Icons.Qr24;
                stringResource = Room.stringResource(gapComposer, R.string.lite_add_money_deposit_usdc_title);
                stringResource2 = Room.stringResource(gapComposer, R.string.lite_add_money_deposit_usdc_subtitle);
                gapComposer.end(false);
            }
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1998135771, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 13), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2076126042, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(stringResource, 20), gapComposer);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(23, (Object) addMoneyRowId, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(1750899628, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(stringResource2, i3), gapComposer), null, push, 0L, gapComposer, 817889334, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(addMoneyRowId, function1, i, 21);
        }
    }

    public static final void BalanceHeader(LiteBalanceHomeViewModel liteBalanceHomeViewModel, ScreenScaffoldContentScope screenScaffoldContentScope, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-629168471);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(liteBalanceHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(screenScaffoldContentScope) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, ScreenScaffoldKt.markAsScaffoldTitle(companion, screenScaffoldContentScope, gapComposer2, (i2 & 112) | 6), Strings.getTypography(gapComposer2).labelSmall, (TextLineBalancing) null, liteBalanceHomeViewModel.title, (Map) null, (Function1) null, false);
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(null, Strings.getTypography(gapComposer2).numeralLarge, Strings.getColors(gapComposer2).semantic.text.standard, 0, new AnimatedAmountTextView.Amount(liteBalanceHomeViewModel.primaryBalanceText, liteBalanceHomeViewModel.rawBalance), null, false, 0L, gapComposer2, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            gapComposer = gapComposer2;
            String str = liteBalanceHomeViewModel.convertedBalanceText;
            if (str == null) {
                gapComposer.startReplaceGroup(333823154);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(333823155);
                VisibleKt.m3482AnimatedAmountTextJDMA8c0(null, Strings.getTypography(gapComposer).bodySmall, Strings.getColors(gapComposer).semantic.text.subtle, 0, new AnimatedAmountTextView.Amount(liteBalanceHomeViewModel.rawConvertedBalance, 1L, str), null, false, 0L, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(liteBalanceHomeViewModel, screenScaffoldContentScope, i, 22);
        }
    }

    public static final void CashInDetailRow(final CashInRowViewModel cashInRowViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-699085481);
        int i2 = (gapComposer.changedInstance(cashInRowViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (cashInRowViewModel.isCopyable) {
            gapComposer.startReplaceGroup(-159032860);
            String str = cashInRowViewModel.title;
            String str2 = cashInRowViewModel.value;
            int i4 = (gapComposer.changedInstance(cashInRowViewModel) ? 1 : 0) | ((i2 & 112) != 32 ? 0 : 1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda1(28, (Object) cashInRowViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CopyCodeKt.CopyCode(str, str2, str, null, null, (Function1) rememberedValue, gapComposer, 0, 120);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-158863383);
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-1095559707, new Function2() { // from class: com.squareup.cash.cashapplite.views.LiteCashInViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    CashInRowViewModel cashInRowViewModel2 = cashInRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cashInRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cashInRowViewModel2.value, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, null, false, false, Expect_jvmKt.rememberComposableLambda(62027499, new Function2() { // from class: com.squareup.cash.cashapplite.views.LiteCashInViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    CashInRowViewModel cashInRowViewModel2 = cashInRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cashInRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cashInRowViewModel2.value, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, 0L, null, null, gapComposer, 1572870, 1982);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(cashInRowViewModel, function1, i, 15);
        }
    }

    public static final void KycAppletTileUI(KycAppletTileModel kycAppletTileModel, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-141080282);
        int i2 = (gapComposer.changedInstance(kycAppletTileModel) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.InstalledAppletTile(null, Expect_jvmKt.rememberComposableLambda(941155276, new CheckDepositAmountKt$$ExternalSyntheticLambda8(kycAppletTileModel, 17), gapComposer), taxesAppletViewsModule$$ExternalSyntheticLambda12, false, null, gapComposer, ((i2 << 3) & 896) | 54, 24);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(kycAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 12);
        }
    }

    public static final void LiteAddMoneyContent(LiteAddMoneyViewModel liteAddMoneyViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(647180965);
        int i2 = (gapComposer.changedInstance(liteAddMoneyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.lite_add_money_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-1207230379);
            Iterator it = liteAddMoneyViewModel.rows.iterator();
            while (it.hasNext()) {
                AddMoneyRowItem((AddMoneyRowId) it.next(), function1, gapComposer, i2 & 112);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LiteAddMoneyViewKt$$ExternalSyntheticLambda2(liteAddMoneyViewModel, function1, modifier, i, 1);
        }
    }

    public static final void LiteAddMoneyView(LiteAddMoneyViewModel liteAddMoneyViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        liteAddMoneyViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-175621405);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(liteAddMoneyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SheetKt.Sheet((Function0) rememberedValue, SizeKt.fillMaxWidth(companion, 1.0f), null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1624899604, new CheckDepositAmountKt$$ExternalSyntheticLambda6(i2, (Object) liteAddMoneyViewModel, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LiteAddMoneyViewKt$$ExternalSyntheticLambda2(liteAddMoneyViewModel, function1, modifier2, i, 0);
        }
    }

    public static final void LiteBalanceHomeView(final LiteBalanceHomeViewModel liteBalanceHomeViewModel, final Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        liteBalanceHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1590206093);
        int i2 = (gapComposer.changedInstance(liteBalanceHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-1295838565, new Function3() { // from class: com.squareup.cash.cashapplite.views.LiteBalanceHomeViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    Function1 function12 = function1;
                    LiteBalanceHomeViewModel liteBalanceHomeViewModel2 = liteBalanceHomeViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = liteBalanceHomeViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(11, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                KycAppletTileKt.BalanceHeader(liteBalanceHomeViewModel2, scrollingScaffoldContentScope, gapComposer3, (intValue2 << 3) & 112);
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion2, 96.0f));
                                Strings.getSizes(gapComposer3).getClass();
                                DefaultSizes.spacing.getClass();
                                ModalKt.HorizontalDivider(0, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                KycAppletTileKt.AccountDetails(liteBalanceHomeViewModel2, function12, gapComposer3, 0);
                                Strings.getSizes(gapComposer3).getClass();
                                ModalKt.HorizontalDivider(0, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                SpacerKt.Spacer(gapComposer3, scrollingScaffoldContentScope.weight(1.0f, companion2, true));
                                String str2 = liteBalanceHomeViewModel2.disclaimer;
                                TextStyle textStyle = Strings.getTypography(gapComposer3).bodyXSmall;
                                long j = Strings.getColors(gapComposer3).semantic.text.subtle;
                                Strings.getSizes(gapComposer3).getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, Expect_jvmKt.rememberComposableLambda(-1668870543, new Function3() { // from class: com.squareup.cash.cashapplite.views.LiteBalanceHomeViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    Function1 function12 = function1;
                    LiteBalanceHomeViewModel liteBalanceHomeViewModel2 = liteBalanceHomeViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = liteBalanceHomeViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(11, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                KycAppletTileKt.BalanceHeader(liteBalanceHomeViewModel2, scrollingScaffoldContentScope, gapComposer3, (intValue2 << 3) & 112);
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion2, 96.0f));
                                Strings.getSizes(gapComposer3).getClass();
                                DefaultSizes.spacing.getClass();
                                ModalKt.HorizontalDivider(0, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                KycAppletTileKt.AccountDetails(liteBalanceHomeViewModel2, function12, gapComposer3, 0);
                                Strings.getSizes(gapComposer3).getClass();
                                ModalKt.HorizontalDivider(0, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                SpacerKt.Spacer(gapComposer3, scrollingScaffoldContentScope.weight(1.0f, companion2, true));
                                String str2 = liteBalanceHomeViewModel2.disclaimer;
                                TextStyle textStyle = Strings.getTypography(gapComposer3).bodyXSmall;
                                long j = Strings.getColors(gapComposer3).semantic.text.subtle;
                                Strings.getSizes(gapComposer3).getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 199680, 22);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 20, modifier2, liteBalanceHomeViewModel, function1);
        }
    }

    public static final void LiteCashInError(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1360430465);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ScreenScaffoldKt.ScreenScaffoldColumn(companion, null, null, Expect_jvmKt.rememberComposableLambda(-811401047, new BookletGridKt$$ExternalSyntheticLambda1(14, function1), gapComposer), null, f348lambda$2117414401, gapComposer, ((i2 >> 3) & 14) | 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(i, 10, function1);
        }
    }

    public static final void LiteCashInLoaded(LiteCashInViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(412075493);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ScreenScaffoldKt.ScreenScaffoldColumn(companion, null, null, Expect_jvmKt.rememberComposableLambda(1461885197, new BookletGridKt$$ExternalSyntheticLambda1(15, function1), gapComposer), null, Expect_jvmKt.rememberComposableLambda(-1612270493, new CheckDepositAmountKt$$ExternalSyntheticLambda6(17, (Object) loaded, (Object) function1), gapComposer), gapComposer, ((i2 >> 6) & 14) | 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(loaded, function1, i);
        }
    }

    public static final void LiteCashInLoading(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(476919501);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            int i4 = i2;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i4 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(i, 11, function1);
        }
    }

    public static final void LiteCashInView(LiteCashInViewModel liteCashInViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        liteCashInViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1707174666);
        int i2 = (gapComposer.changedInstance(liteCashInViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (liteCashInViewModel instanceof LiteCashInViewModel.Loading) {
                gapComposer.startReplaceGroup(-82647101);
                LiteCashInLoading(function1, gapComposer, (i3 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (liteCashInViewModel instanceof LiteCashInViewModel.Error) {
                gapComposer.startReplaceGroup(-82644095);
                LiteCashInError(function1, gapComposer, (i3 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                if (!(liteCashInViewModel instanceof LiteCashInViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -82648533, false);
                }
                gapComposer.startReplaceGroup(-82640911);
                LiteCashInLoaded((LiteCashInViewModel.Loaded) liteCashInViewModel, function1, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            }
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(liteCashInViewModel, function1, modifier2, i, 19);
        }
    }

    public static final void PasskeySignatureBlockerView(PasskeySignatureBlockerViewModel passkeySignatureBlockerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        passkeySignatureBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1450060906);
        int i2 = i | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 21, modifier2, passkeySignatureBlockerViewModel, function1);
        }
    }

    public static final void TitleRow(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-858054741);
        Applier applier = gapComposer.applier;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true), Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.kyc_applet_title), (Map) null, (Function1) null, false);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.kyc_applet_action_text), (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.SubtlePush16, Room.stringResource(gapComposer, R.string.kyc_applet_navigate_content_description), (Modifier) null, Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 6, 4);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RealAppConfigManager$$ExternalSyntheticLambda6(i, 9);
        }
    }

    public static Applet activityApplet(ActivityAppletTilePresenter$Factory$Impl activityAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.LITE_ACTIVITY, new StateFlowKt$stateFlowOf$1(AppletAvailabilityState.AVAILABLE), new CaptureCheckFaceKt$$ExternalSyntheticLambda6(8, activityAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static Applet liteKycApplet(KycAppletTilePresenter$Factory$Impl kycAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.KYC, new StateFlowKt$stateFlowOf$1(AppletAvailabilityState.AVAILABLE), new CaptureCheckFaceKt$$ExternalSyntheticLambda6(13, kycAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }
}

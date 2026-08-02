package com.squareup.cash.retro.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SelectPaymentPlanViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SectionDivider((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Password24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
                    String stringResource = Room.stringResource(gapComposer2, R.string.profile_taxes_password_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.profile_password_access_description);
                    TextStyle textStyle = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyMedium;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.SecurityLockOutline24, (String) null, (Modifier) null, 0L, gapComposer3, 54, 12);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String stringResource3 = Room.stringResource(gapComposer4, R.string.profile_authenticator_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(staticProvidableCompositionLocal2)).labelMedium, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                    String stringResource4 = Room.stringResource(gapComposer4, R.string.profile_authenticator_descriptions);
                    TextStyle textStyle2 = ((Typography) gapComposer4.consume(staticProvidableCompositionLocal2)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, stringResource4, (Map) null, (Function1) null, false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.ContactTrue24, (String) null, (Modifier) null, 0L, gapComposer5, 54, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    String stringResource5 = Room.stringResource(gapComposer6, R.string.profile_trusted_contacts_investing_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(staticProvidableCompositionLocal3)).labelMedium, (TextLineBalancing) null, stringResource5, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(staticProvidableCompositionLocal3)).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.profile_trusted_contacts_description), (Map) null, (Function1) null, false);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.International24, (String) null, (Modifier) null, 0L, gapComposer7, 54, 12);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.profile_cash_app_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                PromotionsTitleBarKt.PromotionHomeLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer10, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.profile_scan_qr_code_to_pay), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.profile_scan_code_instruction), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.profile_my_code), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.profile_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.profile_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.profile_my_code), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.profile_share), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.profile_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.profile_my_code), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.profile_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.profile_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.profile_my_code), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, (Modifier) null, 0L, gapComposer22, 54, 12);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    PaymentPlanSummaryKt.PaymentPlanSummaryBottomSheetContent(new PaymentPlanSummaryViewModel.BottomSheetData("How payments work", "Payments are made from your Cash App balance. If your balance is lower than the payment amount, we’ll charge your debit card ending in 1234 instead.", Constants.META_CLOSE), null, gapComposer23, 0, 2);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                SavingsApplet savingsApplet = (SavingsApplet) obj;
                ((SavingsRepositoryModel.SavingsBalanceState) obj2).getClass();
                return (savingsApplet == null || !savingsApplet.visible) ? AppletAvailabilityState.UNAVAILABLE : AppletAvailabilityState.AVAILABLE;
            case 26:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (!gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (!gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer26.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer26, -1762997026, gapComposer26, false);
                    } else {
                        gapComposer26.startReplaceGroup(-1762997739);
                        gapComposer26.end(false);
                    }
                    Strings.LoadableFullScreenContent(Unit.INSTANCE, true, ImageKt.m177backgroundbw27NRU(fillMaxSize, colors3.semantic.background.f1047app, ColorKt.RectangleShape), null, null, ButtonGroupKt.f649lambda$943036653, gapComposer26, 196662, 24);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer27 = (Composer) obj;
                int intValue27 = ((Integer) obj2).intValue();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (!gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(int i, int i2) {
        this.$r8$classId = i2;
    }
}

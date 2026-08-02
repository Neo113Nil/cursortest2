package com.squareup.cash.profile.views.security;

import androidx.biometric.AuthenticatorUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.Control;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PillControl;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$AuthenticatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$PasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.map.BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.franklin.ui.IdentityHubState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class WebSectionKt {
    public static final ComposableLambdaImpl lambda$1269194804 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(6), false, 1269194804);

    /* renamed from: lambda$-1401492744, reason: not valid java name */
    public static final ComposableLambdaImpl f618lambda$1401492744 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(7), false, -1401492744);
    public static final ComposableLambdaImpl lambda$1513689239 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(8), false, 1513689239);
    public static final ComposableLambdaImpl lambda$1824911953 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(9), false, 1824911953);
    public static final ComposableLambdaImpl lambda$952105439 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(0), false, 952105439);
    public static final ComposableLambdaImpl lambda$591645728 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(10), false, 591645728);
    public static final ComposableLambdaImpl lambda$1709538300 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(11), false, 1709538300);
    public static final ComposableLambdaImpl lambda$1881952381 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(12), false, 1881952381);

    /* renamed from: lambda$-1378530429, reason: not valid java name */
    public static final ComposableLambdaImpl f617lambda$1378530429 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(13), false, -1378530429);

    /* renamed from: lambda$-312081818, reason: not valid java name */
    public static final ComposableLambdaImpl f626lambda$312081818 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(14), false, -312081818);

    /* renamed from: lambda$-142830233, reason: not valid java name */
    public static final ComposableLambdaImpl f619lambda$142830233 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(15), false, -142830233);

    /* renamed from: lambda$-1973346644, reason: not valid java name */
    public static final ComposableLambdaImpl f623lambda$1973346644 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(16), false, -1973346644);

    /* renamed from: lambda$-707275859, reason: not valid java name */
    public static final ComposableLambdaImpl f629lambda$707275859 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(17), false, -707275859);

    /* renamed from: lambda$-1700785741, reason: not valid java name */
    public static final ComposableLambdaImpl f622lambda$1700785741 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(18), false, -1700785741);

    /* renamed from: lambda$-815759394, reason: not valid java name */
    public static final ComposableLambdaImpl f631lambda$815759394 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(19), false, -815759394);

    /* renamed from: lambda$-1300704643, reason: not valid java name */
    public static final ComposableLambdaImpl f616lambda$1300704643 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(20), false, -1300704643);
    public static final ComposableLambdaImpl lambda$84591159 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(21), false, 84591159);

    /* renamed from: lambda$-739706439, reason: not valid java name */
    public static final ComposableLambdaImpl f630lambda$739706439 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(22), false, -739706439);
    public static final ComposableLambdaImpl lambda$970944408 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(23), false, 970944408);

    /* renamed from: lambda$-1650052398, reason: not valid java name */
    public static final ComposableLambdaImpl f620lambda$1650052398 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(24), false, -1650052398);
    public static final ComposableLambdaImpl lambda$1111339050 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(25), false, 1111339050);
    public static final ComposableLambdaImpl lambda$993702281 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(26), false, 993702281);
    public static final ComposableLambdaImpl lambda$789840891 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(27), false, 789840891);

    /* renamed from: lambda$-867165350, reason: not valid java name */
    public static final ComposableLambdaImpl f632lambda$867165350 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(28), false, -867165350);
    public static final ComposableLambdaImpl lambda$2075699092 = new ComposableLambdaImpl(new ComposableSingletons$CashPinSectionKt$$ExternalSyntheticLambda0(29), false, 2075699092);

    /* renamed from: lambda$-306963134, reason: not valid java name */
    public static final ComposableLambdaImpl f625lambda$306963134 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(1), false, -306963134);

    /* renamed from: lambda$-420573629, reason: not valid java name */
    public static final ComposableLambdaImpl f627lambda$420573629 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(2), false, -420573629);
    public static final ComposableLambdaImpl lambda$1165642705 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(8), false, 1165642705);

    /* renamed from: lambda$-1682287367, reason: not valid java name */
    public static final ComposableLambdaImpl f621lambda$1682287367 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(3), false, -1682287367);
    public static final ComposableLambdaImpl lambda$807176634 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(4), false, 807176634);

    /* renamed from: lambda$-586984886, reason: not valid java name */
    public static final ComposableLambdaImpl f628lambda$586984886 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(5), false, -586984886);
    public static final ComposableLambdaImpl lambda$61242571 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(6), false, 61242571);

    /* renamed from: lambda$-2003835872, reason: not valid java name */
    public static final ComposableLambdaImpl f624lambda$2003835872 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(7), false, -2003835872);
    public static final ComposableLambdaImpl lambda$1723159201 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(8), false, 1723159201);

    public static final void AllowedAccountsSection(final ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1965823336);
        int i4 = i | (gapComposer.changedInstance(profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        final int i6 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(1527357342, new ButtonGroupKt$$ExternalSyntheticLambda11(profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, 6), gapComposer), 2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-110590509, new Function2() { // from class: com.squareup.cash.profile.views.security.AllowedAccountsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = r2;
                    ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2 = profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            r9 = (i3 & 112) == 32 ? 1 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r9 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1269194804, rememberComposableLambda, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(200632205, new Function2() { // from class: com.squareup.cash.profile.views.security.AllowedAccountsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2 = profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, label, 0L, gapComposer, 12582966, 3444);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, function1, modifier3, i, i2, 14);
        }
    }

    public static final void BlockedAccountsSection(ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long j;
        profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-341543588);
        int i4 = i | (gapComposer.changedInstance(profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            if (profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.numBlockedAccounts > 0) {
                gapComposer.startReplaceGroup(168448174);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(168449868);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.subtle;
                gapComposer.end(false);
            }
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1143330206, new PoolListSectionKt$$ExternalSyntheticLambda8(profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, j, 9), gapComposer), 2);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f618lambda$1401492744, lambda$1513689239, null, (Function0) rememberedValue, false, false, lambda$1824911953, null, label, 0L, gapComposer, 12582966, 3444);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, function1, modifier3, i, i2, 15);
        }
    }

    public static final void CashPinSection(ProfileSecurityViewModel.Ready.CashPinViewModel cashPinViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        cashPinViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2064438277);
        int i4 = i | (gapComposer.changedInstance(cashPinViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            String m = cashPinViewModel.hasPin ? re$$ExternalSyntheticOutline0.m(gapComposer, -1074599121, R.string.profile_cash_pin_change, gapComposer, false) : re$$ExternalSyntheticOutline0.m(gapComposer, -1074527697, R.string.profile_cash_pin_create, gapComposer, false);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$952105439, lambda$591645728, null, (Function0) rememberedValue, false, false, null, null, new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(1203125038, new SheetKt$$ExternalSyntheticLambda8(m, 24), gapComposer), 15), 0L, gapComposer, 54, 3572);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) cashPinViewModel, function1, modifier3, i, i2, 16);
        }
    }

    public static final void IdentificationSection(IdentityVerificationSectionViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2083993486);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = content.verificationStatus.ordinal();
            if (ordinal == 0) {
                i3 = R.string.profile_verify_identity_control_label_verify;
            } else if (ordinal == 1) {
                i3 = R.string.profile_verify_identity_control_label_continue;
            } else if (ordinal == 2) {
                i3 = R.string.profile_verify_identity_control_label_pending;
            } else if (ordinal == 3) {
                i3 = R.string.profile_verify_identity_control_label_unverified;
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.string.profile_verify_identity_control_label_verified;
            }
            String stringResource = Room.stringResource(gapComposer, i3);
            IdentityHubState.EntrypointStatus entrypointStatus = content.verificationStatus;
            if (entrypointStatus == IdentityHubState.EntrypointStatus.VERIFIED || entrypointStatus == IdentityHubState.EntrypointStatus.PENDING) {
                gapComposer.startReplaceGroup(498403551);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(498462141);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.standard;
                gapComposer.end(false);
            }
            Badge.Small small = content.shouldShowBadge ? Badge.Small.INSTANCE : null;
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1411469228, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(stringResource, j, 6), gapComposer), 2);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1709538300, lambda$1881952381, null, (Function0) rememberedValue, false, false, f617lambda$1378530429, small, label, 0L, gapComposer, 12582966, 3188);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(content, function1, i, 27);
        }
    }

    public static final void IdentityVerificationSection(IdentityVerificationSectionViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1239190286);
        int i4 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            IdentificationSection(content, function1, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) content, function1, modifier2, i, i2, 17);
        }
    }

    public static final void PersonalizedAdsSection(ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, Function1 function1, Function1 function12, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-473300308);
        int i4 = (gapComposer.changedInstance(profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(function12) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            if (profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel instanceof ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible) {
                gapComposer.startReplaceGroup(288405793);
                PersonalizedAdsSectionEligible((ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible) profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, function1, function12, modifier4, gapComposer, i3 & 8190);
                gapComposer.end(false);
            } else if (profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel instanceof ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Ineligible) {
                gapComposer.startReplaceGroup(288635844);
                PersonalizedAdsSectionIneligible((ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Ineligible) profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, modifier4, gapComposer, ((i3 >> 6) & 112) | (i3 & 14));
                gapComposer.end(false);
            } else {
                if (!profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.equals(ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.None.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 424943596, false);
                }
                gapComposer.startReplaceGroup(288760774);
                gapComposer.end(false);
            }
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, function1, function12, modifier3, i, i2, 22);
        }
    }

    public static final void PersonalizedAdsSectionEligible(ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible eligible, Function1 function1, Function1 function12, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1443067518);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(eligible) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            boolean z = eligible.isChecked;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f626lambda$312081818, f619lambda$142830233, null, null, false, false, Expect_jvmKt.rememberComposableLambda(872679277, new ErrorView$$ExternalSyntheticLambda0(26, (Object) eligible, (Object) function12), gapComposer2), null, new CellDefaultAccessory.Label(new CellDefaultAccessory.AccessoryConfig((Role) null, false, z, false), Expect_jvmKt.rememberComposableLambda(1773075007, new BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1(z, function1, 3), gapComposer2)), 0L, gapComposer2, 12586038, 3444);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(eligible, function1, function12, modifier, i, 8);
        }
    }

    public static final void PersonalizedAdsSectionIneligible(ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Ineligible ineligible, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1723948488);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changed(modifier) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f623lambda$1973346644, f629lambda$707275859, null, null, false, false, f622lambda$1700785741, null, null, 0L, gapComposer, 817892406, 3444);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(ineligible, modifier, i, 28);
        }
    }

    public static final void ProfilePrivacy(ProfilePrivacyViewModel profilePrivacyViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(666638315);
        int i2 = (gapComposer.changedInstance(profilePrivacyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1488842560, new ErrorView$$ExternalSyntheticLambda0(function1, profilePrivacyViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) profilePrivacyViewModel, function1, i, 24);
        }
    }

    public static final void ProfileSecurity(ProfileSecurityViewModel profileSecurityViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1281221683);
        int i2 = (gapComposer.changedInstance(profileSecurityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1369395390, new ErrorView$$ExternalSyntheticLambda0(function1, profileSecurityViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) profileSecurityViewModel, function1, i, 26);
        }
    }

    public static final void RequestsSection(ProfilePrivacyReadyViewModel$ProfileSecurityPolicy profilePrivacyReadyViewModel$ProfileSecurityPolicy, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        IncomingRequestPolicy incomingRequestPolicy;
        String m;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1261565506);
        int i4 = i | (gapComposer.changedInstance(profilePrivacyReadyViewModel$ProfileSecurityPolicy) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            if (profilePrivacyReadyViewModel$ProfileSecurityPolicy instanceof ProfilePrivacyReadyViewModel$ProfileSecurityPolicy.RenderedPolicy) {
                incomingRequestPolicy = ((ProfilePrivacyReadyViewModel$ProfileSecurityPolicy.RenderedPolicy) profilePrivacyReadyViewModel$ProfileSecurityPolicy).value;
            } else {
                if (!(profilePrivacyReadyViewModel$ProfileSecurityPolicy instanceof ProfilePrivacyReadyViewModel$ProfileSecurityPolicy.FailedToUpdatePolicy)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                incomingRequestPolicy = null;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            int i6 = incomingRequestPolicy == null ? -1 : RequestsSectionKt$WhenMappings.$EnumSwitchMapping$0[incomingRequestPolicy.ordinal()];
            if (i6 == 1) {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, 805793219, R.string.incoming_requests_allow_anyone, gapComposer, false);
            } else if (i6 == 2) {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, 805796874, R.string.incoming_requests_allow_contacts_only, gapComposer, false);
            } else if (i6 != 3) {
                gapComposer.startReplaceGroup(-789926895);
                gapComposer.end(false);
                m = null;
            } else {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, 805800227, R.string.incoming_requests_allow_no_one, gapComposer, false);
            }
            boolean z = incomingRequestPolicy != null;
            CellDefaultAccessory label = m != null ? new CellDefaultAccessory.Label(m, 2) : CellDefaultAccessory.Push.INSTANCE;
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f631lambda$815759394, f616lambda$1300704643, null, (Function0) rememberedValue, z, false, lambda$84591159, null, label, 0L, gapComposer, 12582966, 3412);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) profilePrivacyReadyViewModel$ProfileSecurityPolicy, function1, modifier3, i, i2, 18);
        }
    }

    public static final void SearchVisibilitySection(int i, int i2, Composer composer, Modifier modifier, Function1 function1) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(236718877);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (gapComposer.changed(modifier2) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean z = (i4 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f630lambda$739706439, lambda$970944408, null, (Function0) rememberedValue, false, false, f620lambda$1650052398, null, push, 0L, gapComposer, 817889334, 3444);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda3(function1, modifier3, i, i2, 4);
        }
    }

    public static final void SecurityLockSection(int i, Composer composer, Modifier modifier, ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Function1 function1) {
        Modifier modifier2;
        profilePasscodeSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1373042245);
        int i2 = (gapComposer.changedInstance(profilePasscodeSectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SecurityLockSectionView((i3 & 896) | (i3 & 112) | 6, gapComposer, companion, profilePasscodeSectionViewModel, function1);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockViewKt$$ExternalSyntheticLambda1(profilePasscodeSectionViewModel, function1, modifier2, i, 1);
        }
    }

    public static final void SecurityLockSectionView(int i, Composer composer, Modifier modifier, ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Function1 function1) {
        int i2;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1934787470);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(profilePasscodeSectionViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            gapComposer.startReplaceGroup(554992976);
            Control control = profilePasscodeSectionViewModel.securityLockControl;
            PillControl pillControl = control instanceof PillControl ? (PillControl) control : null;
            PillControl.Style style = pillControl != null ? pillControl.style : null;
            if ((style == null ? -1 : SecurityLockSectionKt$WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1) {
                gapComposer.startReplaceGroup(1913759852);
                String stringResource = Room.stringResource(gapComposer, R.string.profile_security_on);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource, new Color(colors.semantic.text.standard));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1913764125);
                String stringResource2 = Room.stringResource(gapComposer, R.string.profile_security_off);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource2, new Color(colors2.semantic.text.subtle));
                gapComposer.end(false);
            }
            gapComposer.end(false);
            String str = (String) pair.first;
            long j = ((Color) pair.second).value;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 7;
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1111339050, lambda$993702281, null, (Function0) rememberedValue, false, false, null, null, new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1434458433, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str, j, i3), gapComposer), 2), 0L, gapComposer, 54, 3572);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(i, 18, modifier, profilePasscodeSectionViewModel, function1);
        }
    }

    public static final void SyncContactsSection(boolean z, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-860647895);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(z);
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToggleableNode$$ExternalSyntheticLambda1(function1, z, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier modifier5 = modifier4;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$789840891, f632lambda$867165350, modifier5, (Function0) rememberedValue, false, false, lambda$2075699092, null, toggle, 0L, gapComposer, (i4 & 896) | 12582966, 3440);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(z, function1, modifier3, i, i2);
        }
    }

    public static final void TaxesAccessSection(ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel, ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Pair pair;
        int i4;
        NeverEqualPolicy neverEqualPolicy;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(192231875);
        int i5 = (gapComposer.changedInstance(profileSecurityReadyViewModel$PasswordViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(profileSecurityReadyViewModel$AuthenticatorViewModel) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            if (profileSecurityReadyViewModel$AuthenticatorViewModel.isAuthenticatorActive) {
                gapComposer.startReplaceGroup(533051294);
                String stringResource = Room.stringResource(gapComposer, R.string.profile_security_on);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource, new Color(colors.semantic.text.standard));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(533163359);
                String stringResource2 = Room.stringResource(gapComposer, R.string.profile_security_off);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource2, new Color(colors2.semantic.text.subtle));
                gapComposer.end(false);
            }
            String str = (String) pair.first;
            long j = ((Color) pair.second).value;
            Modifier modifier5 = modifier4;
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.profile_taxes_access_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.profile_taxes_access_description), gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = profileSecurityReadyViewModel$PasswordViewModel.showPasswordSection;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(533530213);
                boolean z2 = (i3 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(8, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                neverEqualPolicy = neverEqualPolicy2;
                i4 = 8;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f625lambda$306963134, f627lambda$420573629, null, (Function0) rememberedValue, false, false, null, null, new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1165642705, 15), 0L, gapComposer, 54, 3572);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                i4 = 8;
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer.startReplaceGroup(534272105);
                gapComposer.end(false);
            }
            if (profileSecurityReadyViewModel$AuthenticatorViewModel.showAuthenticatorSection) {
                gapComposer.startReplaceGroup(534359494);
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-5574193, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str, j, i4), gapComposer), 2);
                boolean changedInstance = gapComposer.changedInstance(profileSecurityReadyViewModel$AuthenticatorViewModel) | ((i3 & 896) == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda11(25, function1, profileSecurityReadyViewModel$AuthenticatorViewModel);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f621lambda$1682287367, lambda$807176634, null, (Function0) rememberedValue2, false, false, null, null, label, 0L, gapComposer2, 1572918, 3508);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(535137129);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(profileSecurityReadyViewModel$PasswordViewModel, profileSecurityReadyViewModel$AuthenticatorViewModel, function1, modifier3, i, i2, 23);
        }
    }

    public static final void TrustedContactsSection(TrustedContactSettingViewModel trustedContactSettingViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Pair pair;
        trustedContactSettingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-829887642);
        int i4 = i | (gapComposer.changedInstance(trustedContactSettingViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            AuthenticatorUtils authenticatorUtils = trustedContactSettingViewModel.actionRow;
            if (authenticatorUtils instanceof TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow) {
                gapComposer.startReplaceGroup(574300743);
                String stringResource = Room.stringResource(gapComposer, R.string.profile_trusted_contact_off);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource, new Color(colors.semantic.text.subtle));
                gapComposer.end(false);
            } else {
                if (!(authenticatorUtils instanceof TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 574298736, false);
                }
                gapComposer.startReplaceGroup(574305672);
                String stringResource2 = Room.stringResource(gapComposer, R.string.profile_trusted_contact_on);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource2, new Color(colors2.semantic.text.standard));
                gapComposer.end(false);
            }
            String str = (String) pair.first;
            long j = ((Color) pair.second).value;
            boolean changedInstance = gapComposer.changedInstance(trustedContactSettingViewModel) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(26, function1, trustedContactSettingViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(2097671765, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str, j, 9), gapComposer), 2);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f628lambda$586984886, lambda$61242571, null, (Function0) rememberedValue, false, false, null, null, label, 0L, gapComposer, 54, 3572);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) trustedContactSettingViewModel, function1, modifier3, i, i2, 19);
        }
    }

    public static final void WebSection(ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1528763076);
        int i2 = i | (gapComposer.changedInstance(profilePrivacyReadyViewModel$CashMeSettingViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            boolean z = !profilePrivacyReadyViewModel$CashMeSettingViewModel.isActivated;
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(profilePrivacyReadyViewModel$CashMeSettingViewModel.isChecked);
            boolean changedInstance = gapComposer.changedInstance(profilePrivacyReadyViewModel$CashMeSettingViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(27, function1, profilePrivacyReadyViewModel$CashMeSettingViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = companion;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f624lambda$2003835872, lambda$1723159201, null, (Function0) rememberedValue, z, false, Expect_jvmKt.rememberComposableLambda(-1684674137, new PdfPreviewViewKt$$ExternalSyntheticLambda2(profilePrivacyReadyViewModel$CashMeSettingViewModel, 26), gapComposer), null, toggle, 0L, gapComposer, 12582966, 3412);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) profilePrivacyReadyViewModel$CashMeSettingViewModel, function1, i, 27);
        }
    }
}

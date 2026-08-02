package com.squareup.cash.securityhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.securityhub.viewmodels.EducationCardId;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class RecoveryGuideViewKt {
    public static final RecoveryGuideViewModel HACKED_PREVIEW_MODEL;
    public static final List PREVIEW_PROTECT_YOURSELF_BOOKLETS;
    public static final RecoveryGuideViewModel SCAMMED_PREVIEW_MODEL;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EducationCardUiModel[]{new EducationCardUiModel(EducationCardId.BUILT_IN_PROTECTIONS, "Built-in protections", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.COMMON_SCAMS, "Common scams", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.SPOT_SCAMS, "How to spot scams", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.PREVENT_FRAUD, "Prevent fraud", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.SECURITY_FEATURES, "Security features", "fake:///trust-hub-placeholder.png")});
        PREVIEW_PROTECT_YOURSELF_BOOKLETS = listOf;
        RecoveryGuideSectionId recoveryGuideSectionId = RecoveryGuideSectionId.NEXT_STEPS;
        RecoveryGuideSectionViewModel recoveryGuideSectionViewModel = new RecoveryGuideSectionViewModel(recoveryGuideSectionId, "Your next steps", null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(RecoveryGuideRowId.TRY_TO_REVERSE_PAYMENT, "Try to reverse the payment", "Cancel the payment if you can. If not, try asking for a refund", false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.STOP_AND_DISCONNECT, "Stop and disconnect", "Immediately stop engaging with the scammer and block their number, email, or account", false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.PROTECT_YOUR_ACCOUNT, "Protect your account", "If you shared personal details with the scammer, lock down your account", true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.BEWARE_OF_FUTURE_SCAMS, "Beware of future scams", "Expect more attempts. Once you’re a target, scammers share contact lists", false)})));
        RecoveryGuideSectionId recoveryGuideSectionId2 = RecoveryGuideSectionId.REPORT;
        RecoveryGuideRowId recoveryGuideRowId = RecoveryGuideRowId.REPORT_TO_CASH_APP;
        RecoveryGuideRowViewModel recoveryGuideRowViewModel = new RecoveryGuideRowViewModel(recoveryGuideRowId, "Report to Cash App", "Let us know what happened", true);
        RecoveryGuideRowId recoveryGuideRowId2 = RecoveryGuideRowId.CONTACT_YOUR_BANK;
        RecoveryGuideRowViewModel recoveryGuideRowViewModel2 = new RecoveryGuideRowViewModel(recoveryGuideRowId2, "Contact your bank", "If unauthorized payments came from a linked card or bank, dispute them", false);
        RecoveryGuideRowId recoveryGuideRowId3 = RecoveryGuideRowId.REPORT_TO_LOCAL_POLICE;
        RecoveryGuideRowViewModel recoveryGuideRowViewModel3 = new RecoveryGuideRowViewModel(recoveryGuideRowId3, "Report to local police", "Especially for in-person scams, large losses, or if your identity was used", false);
        RecoveryGuideRowId recoveryGuideRowId4 = RecoveryGuideRowId.FILE_WITH_FTC;
        RecoveryGuideRowViewModel recoveryGuideRowViewModel4 = new RecoveryGuideRowViewModel(recoveryGuideRowId4, "File with the FTC", "reportfraud.ftc.gov", true);
        RecoveryGuideRowId recoveryGuideRowId5 = RecoveryGuideRowId.FILE_WITH_FBI;
        RecoveryGuideSectionViewModel recoveryGuideSectionViewModel2 = new RecoveryGuideSectionViewModel(recoveryGuideSectionId2, "Report the scam", "Screenshot the conversation, payment amount and dates, and the scammer’s details. Investigators and Cash App support need this to act.", new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{recoveryGuideRowViewModel, recoveryGuideRowViewModel2, recoveryGuideRowViewModel3, recoveryGuideRowViewModel4, new RecoveryGuideRowViewModel(recoveryGuideRowId5, "File with the FBI (IC3)", "ic3.gov", true)})));
        RecoveryGuideSectionId recoveryGuideSectionId3 = RecoveryGuideSectionId.PROTECT_YOURSELF;
        RecoveryGuideSectionViewModel recoveryGuideSectionViewModel3 = new RecoveryGuideSectionViewModel(recoveryGuideSectionId3, "Protect yourself going forward", null, new RecoveryGuideSectionViewModel.Content.Booklets(listOf));
        RecoveryGuideSectionId recoveryGuideSectionId4 = RecoveryGuideSectionId.GET_SUPPORT;
        RecoveryGuideRowId recoveryGuideRowId6 = RecoveryGuideRowId.REPORT_AN_ISSUE;
        SCAMMED_PREVIEW_MODEL = new RecoveryGuideViewModel("I’ve been scammed", "Take back control after being scammed", "Scams can affect anyone. If you think you’ve been scammed, follow the steps below and contact support immediately to report what happened.", CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideSectionViewModel[]{recoveryGuideSectionViewModel, recoveryGuideSectionViewModel2, recoveryGuideSectionViewModel3, new RecoveryGuideSectionViewModel(recoveryGuideSectionId4, "Get support", null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsJVMKt.listOf(new RecoveryGuideRowViewModel(recoveryGuideRowId6, "Report an issue", "Chat with support 24/7", true))))}));
        HACKED_PREVIEW_MODEL = new RecoveryGuideViewModel("I’ve been hacked", "Take back control after your account is hacked", "Many account hacks start outside Cash App with a leaked password, a phishing email, or an unlocked phone. Once someone has access, they can move your money.", CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideSectionViewModel[]{new RecoveryGuideSectionViewModel(recoveryGuideSectionId, "Your next steps", null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(RecoveryGuideRowId.SECURE_YOUR_EMAIL, "Secure your email", "Update the password and enable two-factor on the email linked to your Cash App account", false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.CHANGE_YOUR_PIN, "Change your PIN", "Update your PIN to something only you can guess", true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.SIGN_OUT_EVERYWHERE, "Sign out everywhere", "Force every device to re-authenticate before it can access your account", true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.ENABLE_PASSKEYS, "Enable passkeys", "Passkeys use biometrics for login, ensuring only you can access your account", true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.FREEZE_YOUR_CREDIT, "Freeze your credit", "Equifax, Experian, and TransUnion all have options to freeze your credit", false)}))), new RecoveryGuideSectionViewModel(recoveryGuideSectionId2, "Report the hack", "Screenshot the conversation, payment amount and dates, and the fraudster’s details. Investigators and Cash App support need this to act.", new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(recoveryGuideRowId, "Report to Cash App", "Let us know what happened", true), new RecoveryGuideRowViewModel(recoveryGuideRowId2, "Contact your bank", "If unauthorized payments came from a linked card or bank, dispute them", false), new RecoveryGuideRowViewModel(recoveryGuideRowId3, "Report to local police", "Especially for in-person scams, large losses, or if your identity was used", false), new RecoveryGuideRowViewModel(recoveryGuideRowId4, "File with the FTC", "reportfraud.ftc.gov", true), new RecoveryGuideRowViewModel(recoveryGuideRowId5, "File with the FBI (IC3)", "ic3.gov", true)}))), new RecoveryGuideSectionViewModel(recoveryGuideSectionId3, "Protect yourself going forward", null, new RecoveryGuideSectionViewModel.Content.Booklets(listOf)), new RecoveryGuideSectionViewModel(recoveryGuideSectionId4, "Get support", null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsJVMKt.listOf(new RecoveryGuideRowViewModel(recoveryGuideRowId6, "Report an issue", "Chat with support 24/7", true))))}));
    }

    public static final void BookletCarousel(List list, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(485554494);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier scroll$default = ImageKt.scroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), true, false);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(scroll$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1796070233);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EducationCardUiModel educationCardUiModel = (EducationCardUiModel) it.next();
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(educationCardUiModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ProtectionsSectionKt$$ExternalSyntheticLambda0(function1, educationCardUiModel, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EducationCardKt.EducationCard(educationCardUiModel, (Function0) rememberedValue, null, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function1, i, 7);
        }
    }

    public static final void RecoveryGuideRow(final RecoveryGuideRowViewModel recoveryGuideRowViewModel, Function1 function1, Composer composer, int i) {
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1292375830);
        int i2 = (gapComposer.changedInstance(recoveryGuideRowViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = recoveryGuideRowViewModel.isActionable;
            ComposableLambdaImpl composableLambdaImpl = null;
            CellDefaultAccessory.Push push = z ? CellDefaultAccessory.Push.INSTANCE : null;
            if (z) {
                gapComposer.startReplaceGroup(1081744021);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(recoveryGuideRowViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(19, function1, recoveryGuideRowViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1081773191);
                gapComposer.end(false);
                function0 = null;
            }
            String str = recoveryGuideRowViewModel.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(1081939134);
            } else {
                gapComposer.startReplaceGroup(1081939135);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1962248166, new InfoSectionKt$$ExternalSyntheticLambda7(str, 22), gapComposer);
            }
            gapComposer.end(false);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1622712068, new Function2() { // from class: com.squareup.cash.securityhub.views.RecoveryGuideViewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i5 = i3;
                    RecoveryGuideRowViewModel recoveryGuideRowViewModel2 = recoveryGuideRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                switch (recoveryGuideRowViewModel2.id.ordinal()) {
                                    case 0:
                                        icons = Icons.Refunded24;
                                        break;
                                    case 1:
                                        icons = Icons.Zero24;
                                        break;
                                    case 2:
                                        icons = Icons.SecurityAlertOutline24;
                                        break;
                                    case 3:
                                        icons = Icons.LockLocked24;
                                        break;
                                    case 4:
                                        icons = Icons.CommEmail24;
                                        break;
                                    case 5:
                                        icons = Icons.PasscodeFill24;
                                        break;
                                    case 6:
                                        icons = Icons.LogOut24;
                                        break;
                                    case 7:
                                        icons = Icons.Passkey24;
                                        break;
                                    case 8:
                                        icons = Icons.NoCreditCheck24;
                                        break;
                                    case 9:
                                        icons = Icons.CommSms24;
                                        break;
                                    case 10:
                                        icons = Icons.BankAccount24;
                                        break;
                                    case 11:
                                        icons = Icons.Document24;
                                        break;
                                    case 12:
                                        icons = Icons.LinkOut24;
                                        break;
                                    case 13:
                                        icons = Icons.LinkOut24;
                                        break;
                                    case 14:
                                        icons = Icons.CommSms24;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recoveryGuideRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(737976261, new Function2() { // from class: com.squareup.cash.securityhub.views.RecoveryGuideViewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i5 = i4;
                    RecoveryGuideRowViewModel recoveryGuideRowViewModel2 = recoveryGuideRowViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                switch (recoveryGuideRowViewModel2.id.ordinal()) {
                                    case 0:
                                        icons = Icons.Refunded24;
                                        break;
                                    case 1:
                                        icons = Icons.Zero24;
                                        break;
                                    case 2:
                                        icons = Icons.SecurityAlertOutline24;
                                        break;
                                    case 3:
                                        icons = Icons.LockLocked24;
                                        break;
                                    case 4:
                                        icons = Icons.CommEmail24;
                                        break;
                                    case 5:
                                        icons = Icons.PasscodeFill24;
                                        break;
                                    case 6:
                                        icons = Icons.LogOut24;
                                        break;
                                    case 7:
                                        icons = Icons.Passkey24;
                                        break;
                                    case 8:
                                        icons = Icons.NoCreditCheck24;
                                        break;
                                    case 9:
                                        icons = Icons.CommSms24;
                                        break;
                                    case 10:
                                        icons = Icons.BankAccount24;
                                        break;
                                    case 11:
                                        icons = Icons.Document24;
                                        break;
                                    case 12:
                                        icons = Icons.LinkOut24;
                                        break;
                                    case 13:
                                        icons = Icons.LinkOut24;
                                        break;
                                    case 14:
                                        icons = Icons.CommSms24;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recoveryGuideRowViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, function0, false, true, composableLambdaImpl, null, push, 0L, gapComposer, 1572918, 3380);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(recoveryGuideRowViewModel, function1, i, 20);
        }
    }

    public static final void RecoveryGuideSection(RecoveryGuideSectionViewModel recoveryGuideSectionViewModel, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1422266121);
        int i2 = i | (gapComposer.changedInstance(recoveryGuideSectionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = recoveryGuideSectionViewModel.title;
            RecoveryGuideSectionViewModel.Content content = recoveryGuideSectionViewModel.content;
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, recoveryGuideSectionViewModel.body, gapComposer, 0, 14);
            if (recoveryGuideSectionViewModel.body != null || (content instanceof RecoveryGuideSectionViewModel.Content.Booklets)) {
                gapComposer.startReplaceGroup(1121810202);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1121856795);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            if (content instanceof RecoveryGuideSectionViewModel.Content.Rows) {
                gapComposer.startReplaceGroup(1121978222);
                Iterator it = ((RecoveryGuideSectionViewModel.Content.Rows) content).rows.iterator();
                while (it.hasNext()) {
                    RecoveryGuideRow((RecoveryGuideRowViewModel) it.next(), function1, gapComposer, i2 & 112);
                }
                gapComposer.end(false);
            } else {
                if (!(content instanceof RecoveryGuideSectionViewModel.Content.Booklets)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1903472105, false);
                }
                gapComposer.startReplaceGroup(-1903467151);
                BookletCarousel(((RecoveryGuideSectionViewModel.Content.Booklets) content).booklets, function12, gapComposer, (i2 >> 3) & 112);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(recoveryGuideSectionViewModel, function1, function12, i, 7);
        }
    }

    public static final void RecoveryGuideView(RecoveryGuideViewModel recoveryGuideViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        recoveryGuideViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1274832862);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(recoveryGuideViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
            String str = recoveryGuideViewModel.navigationTitle;
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            boolean changedInstance = gapComposer2.changedInstance(recoveryGuideViewModel) | (i4 == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda3(3, recoveryGuideViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyColumn(navigationBarsPadding, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 510);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(recoveryGuideViewModel, function1, modifier2, i, 26);
        }
    }
}

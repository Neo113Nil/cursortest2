package androidx.compose.ui.text.font;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.squareup.cash.R;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoViewModel;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.SkippableStep;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class FontWeightKt {
    public static final void Divider(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-971728836);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            SpacerKt.Spacer(gapComposer, ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 1.0f), MooncakeTheme.getColors(gapComposer).hairline, ColorKt.RectangleShape));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RealAppConfigManager$$ExternalSyntheticLambda6(i, 7);
        }
    }

    public static final void RecurringPaymentInfoSheetContent(RecurringPaymentInfoViewModel.Content content, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1183824188);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            SheetBody(MLKEMEngine.KyberPolyBytes, gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 40.0f, 32.0f), content.title, content.body);
            Divider(gapComposer, 0);
            String stringResource = Room.stringResource(gapComposer, R.string.recurring_payments_info_sheet_close_button);
            boolean z = false;
            MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue, fillMaxWidth, null, null, style, null, false, 0, arrangement$Center$1, null, gapComposer, 805503360, 0, 3544);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(content, function1, i, 4);
        }
    }

    public static final void SheetBody(int i, Composer composer, Modifier modifier, String str, String str2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-265063091);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, i2 & 14, 0, 3826, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, ((i2 >> 3) & 14) | 48, 0, 3824, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean access$shouldSkip(PaymentConfigurationStep paymentConfigurationStep, PaymentRouterData paymentRouterData) {
        Long l;
        SkippableStep skippableStep = paymentConfigurationStep instanceof SkippableStep ? (SkippableStep) paymentConfigurationStep : null;
        if (skippableStep != null) {
            SkippableStep.SkipRequirement skipRequirement = skippableStep.getSkipRequirement();
            if (skipRequirement.equals(SkippableStep.SkipRequirement.RecipientIsCrypto.INSTANCE)) {
                RecipientViewModel recipientViewModel = paymentRouterData.recipient;
                if (recipientViewModel != null) {
                    Recipient.CryptoRecipientPayment cryptoRecipientPayment = recipientViewModel.recipient.invoice;
                    if ((cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Bitcoin) || (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Stablecoin) || (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Solana)) {
                        return true;
                    }
                }
            } else if (skipRequirement.equals(SkippableStep.SkipRequirement.AmountAlreadySet.INSTANCE)) {
                StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(paymentRouterData.recipient);
                Money money = stablecoinOptionOrNull != null ? stablecoinOptionOrNull.amount : null;
                if (money == null) {
                    Iterator it = paymentRouterData.stablecoinWithdrawalOptions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            money = null;
                            break;
                        }
                        Money money2 = ((StablecoinWithdrawalOption) it.next()).amount;
                        if (money2 != null) {
                            money = money2;
                            break;
                        }
                    }
                }
                if (((money == null || (l = money.amount) == null) ? 0L : l.longValue()) >= ((long) Moneys.displayDivisor(money != null ? money.currency_code : null))) {
                }
            } else if (!skipRequirement.equals(SkippableStep.SkipRequirement.StablecoinSelectionNotRequired.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            } else if (paymentRouterData.stablecoinWithdrawalOptions.size() == 1) {
            }
        }
        return false;
    }

    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f) {
        return new FontWeight(RangesKt___RangesKt.coerceIn(TransactorKt.lerp(fontWeight.weight, fontWeight2.weight, f), 1, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO));
    }
}

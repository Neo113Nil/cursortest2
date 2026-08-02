package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogViewModel;
import com.squareup.cash.blockers.actions.views.BlockerActionConfirmDialogView$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerParsingErrorFactory;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccount;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.ui.Avatar;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class zzaey {
    public static final void BlockerActionConfirmDialog(BlockerActionConfirmDialogViewModel blockerActionConfirmDialogViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-270103676);
        int i2 = (gapComposer.changedInstance(blockerActionConfirmDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(2040161045, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(blockerActionConfirmDialogViewModel.title, 24), gapComposer), Expect_jvmKt.rememberComposableLambda(1057167668, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(blockerActionConfirmDialogViewModel.message, 25), gapComposer), Expect_jvmKt.rememberComposableLambda(69903840, new TabContentViewKt$$ExternalSyntheticLambda11(blockerActionConfirmDialogViewModel.confirmButtonText, function1, 10), gapComposer), Expect_jvmKt.rememberComposableLambda(-913089537, new TabContentViewKt$$ExternalSyntheticLambda11(blockerActionConfirmDialogViewModel.cancelButtonText, function1, 11), gapComposer), (Function3) null, gapComposer, 28080, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BlockerActionConfirmDialogView$$ExternalSyntheticLambda0(blockerActionConfirmDialogViewModel, function1, i);
        }
    }

    public static final int access$calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child == null) {
            InlineClassHelperKt.throwIllegalStateException("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = (Integer) lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int i = child.get(alignmentLine);
            if (i != Integer.MIN_VALUE) {
                child.isShallowPlacing = true;
                lookaheadCapablePlaceable.isPlacingForAlignment = true;
                lookaheadCapablePlaceable.replace$ui();
                child.isShallowPlacing = false;
                lookaheadCapablePlaceable.isPlacingForAlignment = false;
                return i + ((int) (alignmentLine instanceof HorizontalAlignmentLine ? child.mo879getPositionnOccac() & BodyPartID.bodyIdMax : child.mo879getPositionnOccac() >> 32));
            }
        }
        return PKIFailureInfo.systemUnavail;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ValidatedAccountList toValidatedAccountList(TabToolbarPresenter tabToolbarPresenter, AccountListConfig accountListConfig) {
        String str;
        String str2;
        Avatar avatar;
        ValidatedAccount validatedAccount;
        accountListConfig.getClass();
        List<AccountListConfig.Account> list = accountListConfig.accounts;
        AccountPickerParsingErrorFactory accountPickerParsingErrorFactory = AccountPickerParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(accountListConfig, accountPickerParsingErrorFactory, tabToolbarPresenter);
            if (list.isEmpty()) {
                return new ValidatedAccountList(EmptyList.INSTANCE);
            }
            ClientScenario clientScenario = (ClientScenario) protoValidationScope.reportIfNullAndContinue("client_scenario", (String) null, accountListConfig.client_scenario);
            if (clientScenario != null) {
                ArrayList arrayList = new ArrayList();
                for (AccountListConfig.Account account : list) {
                    String str3 = (String) protoValidationScope.reportIfNullAndContinue("account.account_id", (String) null, account.account_id);
                    if (str3 != null && (str = (String) protoValidationScope.reportIfNullAndContinue("account.title", (String) null, account.title)) != null && (str2 = (String) protoValidationScope.reportIfNullAndContinue("account.subtitle", (String) null, account.subtitle)) != null && (avatar = (Avatar) protoValidationScope.reportIfNullAndContinue("account.avatar", (String) null, account.avatar)) != null) {
                        List list2 = account.aliases;
                        UiAlias uiAlias = account.preferred_alias;
                        Boolean bool = account.is_passkey_registered;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = account.is_business;
                        validatedAccount = new ValidatedAccount(str3, str, str2, avatar, list2, uiAlias, booleanValue, bool2 != null ? bool2.booleanValue() : false, clientScenario, account);
                        if (validatedAccount == null) {
                            arrayList.add(validatedAccount);
                        }
                    }
                    validatedAccount = null;
                    if (validatedAccount == null) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new ValidatedAccountList(arrayList);
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AccountListConfig.class), accountPickerParsingErrorFactory, null);
        }
    }
}

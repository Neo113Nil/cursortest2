package com.fillr.core.validator;

import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import nl.dionsegijn.konfetti.emitters.RenderSystem;

/* loaded from: classes8.dex */
public abstract class CreditcardTypeValidator {
    public static final void PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane pane, boolean z, Composer composer, int i) {
        pane.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1976805972);
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            PartnerAuthViewModel.Args args = new PartnerAuthViewModel.Args(z, pane);
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(18, daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, args);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(PartnerAuthViewModel.class), heroCardViewKt$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(PartnerAuthViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) StateFlowsComposeKt.collectAsState(partnerAuthViewModel.stateFlow, gapComposer).getValue();
            boolean changedInstance = gapComposer.changedInstance(partnerAuthViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                RenderSystem.AnonymousClass1 anonymousClass1 = new RenderSystem.AnonymousClass1(0, partnerAuthViewModel, PartnerAuthViewModel.class, "onLaunchAuthClick", "onLaunchAuthClick()V", 0, 2);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue = anonymousClass1;
            }
            KFunction kFunction = (KFunction) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(partnerAuthViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                RenderSystem.AnonymousClass1 anonymousClass12 = new RenderSystem.AnonymousClass1(0, partnerAuthViewModel, PartnerAuthViewModel.class, "onCancelClick", "onCancelClick()V", 0, 3);
                gapComposer.updateRememberedValue(anonymousClass12);
                rememberedValue2 = anonymousClass12;
            }
            KFunction kFunction2 = (KFunction) rememberedValue2;
            boolean changedInstance3 = gapComposer.changedInstance(partnerAuthViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                ScrollCapture$onScrollCaptureSearch$1 scrollCapture$onScrollCaptureSearch$1 = new ScrollCapture$onScrollCaptureSearch$1(1, partnerAuthViewModel, PartnerAuthViewModel.class, "onClickableTextClick", "onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 11);
                gapComposer.updateRememberedValue(scrollCapture$onScrollCaptureSearch$1);
                rememberedValue3 = scrollCapture$onScrollCaptureSearch$1;
            }
            Function1 function1 = (Function1) rememberedValue3;
            boolean changedInstance4 = gapComposer.changedInstance(partnerAuthViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, partnerAuthViewModel, PartnerAuthViewModel.class, "onWebAuthFlowFinished", "onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V", 0, 15);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue4 = textFieldUIKt$TextField$4$1;
            }
            KFunction kFunction3 = (KFunction) rememberedValue4;
            boolean changedInstance5 = gapComposer.changedInstance(partnerAuthViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new RenderSystem.AnonymousClass1(0, partnerAuthViewModel, PartnerAuthViewModel.class, "onViewEffectLaunched", "onViewEffectLaunched()V", 0, 4);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            ListItemKt.SharedPartnerAuth(sharedPartnerAuthState, (Function0) kFunction, (Function0) kFunction2, function1, (Function1) kFunction3, (Function0) ((KFunction) rememberedValue5), z, gapComposer, 1572864);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(pane, z, i, 13);
        }
    }

    public static final String getCreditcardType(String str) {
        if (str == null || str.length() <= 0 || !str.matches("^[0-9]+$")) {
            return null;
        }
        CardType cardType = CardType.UNKNOWN;
        if (!TextUtils.isEmpty(str)) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : CardType.intervalLookup.entrySet()) {
                String str2 = (String) ((Pair) entry.getKey()).first;
                String str3 = (String) ((Pair) entry.getKey()).second;
                int min = Math.min(str.length(), str2.length());
                int min2 = Math.min(str.length(), str3.length());
                if (Integer.parseInt(str.substring(0, min)) >= Integer.parseInt(str2.substring(0, min)) && Integer.parseInt(str.substring(0, min2)) <= Integer.parseInt(str3.substring(0, min2))) {
                    hashSet.add((CardType) entry.getValue());
                }
            }
            if (hashSet.size() > 1) {
                cardType = CardType.INSUFFICIENT_DIGITS;
            } else if (hashSet.size() == 1) {
                cardType = (CardType) hashSet.iterator().next();
            }
        }
        if (cardType != CardType.UNKNOWN && cardType != CardType.INSUFFICIENT_DIGITS) {
            return cardType.name;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Visa Electron", Pattern.compile("^(4026|417500|4405|4508|4844|4913|4917)\\d+$"));
        linkedHashMap.put("Visa", Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$"));
        linkedHashMap.put("MasterCard", Pattern.compile("^5[1-5][0-9]{14}$"));
        linkedHashMap.put("American Express", Pattern.compile("^3[47][0-9]{13}$"));
        linkedHashMap.put("Diners Club", Pattern.compile("^3(?:0[0-5]|[68][0-9])[0-9]{11}$"));
        linkedHashMap.put("Discover", Pattern.compile("^6(?:011|5[0-9]{2})[0-9]{12}$"));
        linkedHashMap.put("JCB", Pattern.compile("^(?:2131|1800|35\\d{3})\\d{11}$"));
        linkedHashMap.put("Dankort", Pattern.compile("^(5019)\\d+$"));
        linkedHashMap.put("Maestro", Pattern.compile("^(5018|5020|5038|5612|5893|6304|6759|6761|6762|6763|0604|6390)\\d+$"));
        linkedHashMap.put("Laser", Pattern.compile("^(6304|6706|6709|6771)[0-9]{12,15}$"));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((Pattern) entry2.getValue()).matcher(str).matches()) {
                return (String) entry2.getKey();
            }
        }
        return null;
    }

    public static final RecipientPaymentInfo getPaymentInfo(Recipient recipient) {
        recipient.getClass();
        return new RecipientPaymentInfo(recipient.creditCardFee, recipient.isBusiness);
    }
}

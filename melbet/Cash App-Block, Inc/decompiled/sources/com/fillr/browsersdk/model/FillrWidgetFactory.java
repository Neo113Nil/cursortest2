package com.fillr.browsersdk.model;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.common.base.Joiner;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessState;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes8.dex */
public abstract class FillrWidgetFactory {
    public static final void ManualEntrySuccessScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1741265075);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 6);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ManualEntrySuccessViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ManualEntrySuccessViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(manualEntrySuccessViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Async async = ((ManualEntrySuccessState) collectAsState.getValue()).completeSession;
            Async async2 = ((ManualEntrySuccessState) collectAsState.getValue()).payload;
            boolean changedInstance = gapComposer.changedInstance(manualEntrySuccessViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, manualEntrySuccessViewModel, ManualEntrySuccessViewModel.class, "onSubmit", "onSubmit()V", 0, 24);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            SuccessContentKt.SuccessContent(async, async2, (Function0) ((KFunction) rememberedValue2), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 25);
        }
    }

    public static FillrWidget getWidget(FillrWidget.WidgetType widgetType, Joiner joiner) {
        if (widgetType != null && widgetType.reqAuth && !joiner.isValid()) {
            a$$ExternalSyntheticBUOutline0.m$3("Please provide auth details");
            return null;
        }
        int ordinal = widgetType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
                popEncryptorV2_.encryptionKey = "Widget1.js";
                popEncryptorV2_.hmacKey = "https://cart-scraper.fillr.com/widget/cart-information-extraction/FillrCartScraperWidget.js.gz";
                popEncryptorV2_.setWidgetAuth(joiner);
                popEncryptorV2_.setType(FillrWidget.WidgetType.CART_SCRAPER);
                popEncryptorV2_.isInit = true;
                return new FillrWidget(popEncryptorV2_);
            }
            if (ordinal == 2) {
                PopEncryptorV2_ popEncryptorV2_2 = new PopEncryptorV2_();
                popEncryptorV2_2.encryptionKey = "FillrClassificationWidget.js";
                popEncryptorV2_2.hmacKey = "https://page-classifier.fillr.com/page-classifier/page-classifier-mobile.js.gz";
                popEncryptorV2_2.setWidgetAuth(joiner);
                popEncryptorV2_2.setType(FillrWidget.WidgetType.PAGE_CLASSIFIER);
                popEncryptorV2_2.isInit = true;
                return new FillrWidget(popEncryptorV2_2);
            }
            if (ordinal == 3) {
                PopEncryptorV2_ popEncryptorV2_3 = new PopEncryptorV2_();
                popEncryptorV2_3.encryptionKey = "FillrOrderConfirmationWidget.js";
                popEncryptorV2_3.hmacKey = "https://order-confirmation-scraper.fillr.com/order-confirmation-scraper/order-confirmation-scraper-mobile.js.gz";
                popEncryptorV2_3.setWidgetAuth(joiner);
                popEncryptorV2_3.setType(FillrWidget.WidgetType.ORDER_SCRAPER);
                popEncryptorV2_3.isInit = true;
                return new FillrWidget(popEncryptorV2_3);
            }
            if (ordinal == 4) {
                PopEncryptorV2_ popEncryptorV2_4 = new PopEncryptorV2_();
                popEncryptorV2_4.encryptionKey = "FillrProductPageScraperWidget.js";
                popEncryptorV2_4.hmacKey = "https://product-page-scraper.fillr.com/product-page-scraper/product-page-scraper-mobile.js.gz";
                popEncryptorV2_4.setWidgetAuth(joiner);
                popEncryptorV2_4.setType(FillrWidget.WidgetType.PRODUCT_PAGE_SCRAPER);
                popEncryptorV2_4.isInit = true;
                return new FillrWidget(popEncryptorV2_4);
            }
            if (ordinal != 5) {
                a$$ExternalSyntheticBUOutline0.m$3("Please provide widget type");
                return null;
            }
        }
        PopEncryptorV2_ popEncryptorV2_5 = new PopEncryptorV2_();
        popEncryptorV2_5.encryptionKey = "FillrWidget-Android.js";
        popEncryptorV2_5.hmacKey = "https://widget.fillr.com/widget/android/sdk/FillrWidget-Android.js.gz";
        popEncryptorV2_5.setWidgetAuth(joiner);
        popEncryptorV2_5.setType(FillrWidget.WidgetType.MOBILE);
        popEncryptorV2_5.isInit = true;
        return new FillrWidget(popEncryptorV2_5);
    }
}

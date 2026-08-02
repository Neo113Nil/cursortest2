package com.squareup.cash.shopping.views;

import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.shopping.web.ShoppingWebBridge$Factory$Impl;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter$Factory$Impl;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.preferences.PreferenceFlow$flow$1;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class ShoppingViewFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider imageLoader;
    public final InstanceFactory shoppingWebBridgeFactory;
    public final Provider webViewProvider;

    public /* synthetic */ ShoppingViewFactory$MetroFactory(DoubleCheck doubleCheck, Object obj, InstanceFactory instanceFactory, int i) {
        this.$r8$classId = i;
        this.imageLoader = doubleCheck;
        this.webViewProvider = (Provider) obj;
        this.shoppingWebBridgeFactory = instanceFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 20;
        InstanceFactory instanceFactory = this.shoppingWebBridgeFactory;
        Provider provider = this.webViewProvider;
        Provider provider2 = this.imageLoader;
        switch (i) {
            case 0:
                ShoppingWebBridge$Factory$Impl shoppingWebBridge$Factory$Impl = (ShoppingWebBridge$Factory$Impl) instanceFactory.value;
                RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                WebViewProvider webViewProvider = (WebViewProvider) provider.invoke();
                shoppingWebBridge$Factory$Impl.getClass();
                realImageLoader.getClass();
                webViewProvider.getClass();
                return new PaymentsViewFactory(shoppingWebBridge$Factory$Impl, realImageLoader, webViewProvider);
            case 1:
                CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) provider2.invoke();
                CardAppletTilePresenter$Factory$Impl cardAppletTilePresenter$Factory$Impl = (CardAppletTilePresenter$Factory$Impl) provider.invoke();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                cardAppletTileRepository.getClass();
                cardAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner.getClass();
                return new Applet(AppletId.CARD, ((RealCardAppletTileRepository) cardAppletTileRepository).availabilityState, new WorkViewFactory$$ExternalSyntheticLambda12(i2, cardAppletTilePresenter$Factory$Impl, lifecycleOwner));
            case 2:
                CardAppletTileRepository cardAppletTileRepository2 = (CardAppletTileRepository) provider2.invoke();
                CardAppletTilePresenter$Factory$Impl cardAppletTilePresenter$Factory$Impl2 = (CardAppletTilePresenter$Factory$Impl) provider.invoke();
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) instanceFactory.value;
                cardAppletTileRepository2.getClass();
                cardAppletTilePresenter$Factory$Impl2.getClass();
                lifecycleOwner2.getClass();
                return new Applet(AppletId.CARD, ((RealCardAppletTileRepository) cardAppletTileRepository2).availabilityState, new WorkViewFactory$$ExternalSyntheticLambda12(i2, cardAppletTilePresenter$Factory$Impl2, lifecycleOwner2));
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                CardAppletTileRepository cardAppletTileRepository3 = (CardAppletTileRepository) provider.invoke();
                coroutineScope.getClass();
                errorReporter.getClass();
                cardAppletTileRepository3.getClass();
                CardRegistry cardRegistry = new CardRegistry(coroutineScope, errorReporter);
                JobKt.launch$default(coroutineScope, null, null, new PreferenceFlow$flow$1(cardAppletTileRepository3, cardRegistry, null, 16), 3);
                return cardRegistry;
            default:
                RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider2.invoke();
                RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider.invoke();
                CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                realSelectedMerchantProvider.getClass();
                realMerchantRepository.getClass();
                coroutineScope2.getClass();
                return new RealSelectedMerchantDataProvider(realSelectedMerchantProvider, realMerchantRepository, coroutineScope2);
        }
    }

    public /* synthetic */ ShoppingViewFactory$MetroFactory(int i, Provider provider, DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
        this.$r8$classId = i;
        this.shoppingWebBridgeFactory = instanceFactory;
        this.imageLoader = provider;
        this.webViewProvider = doubleCheck;
    }
}

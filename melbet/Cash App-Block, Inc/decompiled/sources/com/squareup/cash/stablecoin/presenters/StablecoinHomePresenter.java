package com.squareup.cash.stablecoin.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$Factory$Impl;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.stablecoin.backend.real.RealStablecoinActivityRepo$Factory$Impl;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.stablecoin.presenters.widgets.RealStablecoinWelcomeWidgetPresenter;
import com.squareup.cash.stablecoin.presenters.widgets.RealStablecoinWelcomeWidgetPresenter$Factory$Impl;
import com.squareup.cash.stablecoin.presenters.widgets.factory.RealStablecoinHomeWidgetPresenterFactory$Factory$Impl;
import com.squareup.cash.stablecoin.presenters.widgets.state.RealStablecoinHomeWidgetStateManager;
import com.squareup.cash.stablecoin.presenters.widgets.state.RealStablecoinHomeWidgetStateManager$Factory$Impl;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeWidgets;
import com.squareup.cash.storage.RealSessionedLink;
import com.squareup.cash.taptopay.presenters.TapToPayErrorPresenter$MetroFactory;
import com.squareup.scannerview.TextSetter;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.MapFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import retrofit2.OkHttpCall;

/* loaded from: classes7.dex */
public final class StablecoinHomePresenter implements MoleculePresenter {
    public static final List supportedWidgets = CollectionsKt__CollectionsKt.listOf((Object[]) new StablecoinHomeWidgets[]{StablecoinHomeWidgets.WELCOME, StablecoinHomeWidgets.BALANCE, StablecoinHomeWidgets.DISCLOSURE});
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealStablecoinNullStateCarouselPresenter nullStatePresenter;
    public final TextSetter widgetPresenterFactory;

    public StablecoinHomePresenter(RealStablecoinNullStateCarouselPresenter realStablecoinNullStateCarouselPresenter, RealStablecoinHomeWidgetPresenterFactory$Factory$Impl realStablecoinHomeWidgetPresenterFactory$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.nullStatePresenter = realStablecoinNullStateCarouselPresenter;
        this.navigator = screenNavigator;
        OkHttpCall.AnonymousClass1 anonymousClass1 = realStablecoinHomeWidgetPresenterFactory$Factory$Impl.delegateFactory;
        Map map = (Map) ((MapFactory) anonymousClass1.val$callback).invoke();
        RealStablecoinHomeWidgetStateManager$Factory$Impl realStablecoinHomeWidgetStateManager$Factory$Impl = (RealStablecoinHomeWidgetStateManager$Factory$Impl) ((InstanceFactory) anonymousClass1.this$0).value;
        realStablecoinHomeWidgetStateManager$Factory$Impl.getClass();
        this.widgetPresenterFactory = new TextSetter(map, realStablecoinHomeWidgetStateManager$Factory$Impl, screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        RealStablecoinWelcomeWidgetPresenter realStablecoinWelcomeWidgetPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2039579054);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, null, this, 29));
        UiCallbackModel models = this.nullStatePresenter.models(gapComposer);
        List<StablecoinHomeWidgets> list = supportedWidgets;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (StablecoinHomeWidgets stablecoinHomeWidgets : list) {
            TextSetter textSetter = this.widgetPresenterFactory;
            textSetter.getClass();
            stablecoinHomeWidgets.getClass();
            gapComposer.startReplaceGroup(-439430250);
            RealStablecoinHomeWidgetStateManager$Factory$Impl realStablecoinHomeWidgetStateManager$Factory$Impl = (RealStablecoinHomeWidgetStateManager$Factory$Impl) textSetter.textSwitcher;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                coroutineScope.getClass();
                FileBlockerView.MetroFactory metroFactory = realStablecoinHomeWidgetStateManager$Factory$Impl.delegateFactory;
                RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) metroFactory.vibrator.invoke();
                RealStablecoinCapabilityHelper realStablecoinCapabilityHelper = (RealStablecoinCapabilityHelper) metroFactory.permissionManager.invoke();
                RealStablecoinActivityRepo$Factory$Impl realStablecoinActivityRepo$Factory$Impl = (RealStablecoinActivityRepo$Factory$Impl) metroFactory.activityEvents.value;
                realCryptoBalanceRepo.getClass();
                realStablecoinCapabilityHelper.getClass();
                realStablecoinActivityRepo$Factory$Impl.getClass();
                RealStablecoinHomeWidgetStateManager realStablecoinHomeWidgetStateManager = new RealStablecoinHomeWidgetStateManager(realCryptoBalanceRepo, realStablecoinCapabilityHelper, realStablecoinActivityRepo$Factory$Impl, coroutineScope);
                gapComposer.updateRememberedValue(realStablecoinHomeWidgetStateManager);
                rememberedValue2 = realStablecoinHomeWidgetStateManager;
            }
            RealStablecoinHomeWidgetStateManager realStablecoinHomeWidgetStateManager2 = (RealStablecoinHomeWidgetStateManager) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LinkedHashMap();
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Map map = (Map) rememberedValue3;
            Object obj = map.get(stablecoinHomeWidgets);
            if (obj == null) {
                Object obj2 = ((Map) textSetter.textView).get(stablecoinHomeWidgets);
                obj2.getClass();
                RealStablecoinWelcomeWidgetPresenter$Factory$Impl realStablecoinWelcomeWidgetPresenter$Factory$Impl = (RealStablecoinWelcomeWidgetPresenter$Factory$Impl) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) textSetter.scannerText;
                switch (realStablecoinWelcomeWidgetPresenter$Factory$Impl.$r8$classId) {
                    case 0:
                        realStablecoinHomeWidgetStateManager2.getClass();
                        AndroidStringManager androidStringManager = (AndroidStringManager) ((TapToPayErrorPresenter$MetroFactory) realStablecoinWelcomeWidgetPresenter$Factory$Impl.delegateFactory).analyticsHelper.invoke();
                        androidStringManager.getClass();
                        realStablecoinWelcomeWidgetPresenter = new RealStablecoinWelcomeWidgetPresenter(androidStringManager, realStablecoinHomeWidgetStateManager2, screenNavigator);
                        obj = realStablecoinWelcomeWidgetPresenter;
                        break;
                    case 1:
                        realStablecoinHomeWidgetStateManager2.getClass();
                        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((RealSessionedLink.MetroFactory) realStablecoinWelcomeWidgetPresenter$Factory$Impl.delegateFactory).sandboxer.invoke();
                        factory.getClass();
                        realStablecoinWelcomeWidgetPresenter = new RealStablecoinWelcomeWidgetPresenter(factory, realStablecoinHomeWidgetStateManager2, screenNavigator);
                        obj = realStablecoinWelcomeWidgetPresenter;
                        break;
                    default:
                        realStablecoinHomeWidgetStateManager2.getClass();
                        ProfileCropView.MetroFactory metroFactory2 = (ProfileCropView.MetroFactory) realStablecoinWelcomeWidgetPresenter$Factory$Impl.delegateFactory;
                        RealCryptoDisclosuresRepo$Factory$Impl realCryptoDisclosuresRepo$Factory$Impl = (RealCryptoDisclosuresRepo$Factory$Impl) metroFactory2.imageLoader.invoke();
                        IntentLauncher intentLauncher = (IntentLauncher) metroFactory2.cropResultManager.invoke();
                        realCryptoDisclosuresRepo$Factory$Impl.getClass();
                        intentLauncher.getClass();
                        obj = new RealStablecoinWelcomeWidgetPresenter(realCryptoDisclosuresRepo$Factory$Impl, intentLauncher, realStablecoinHomeWidgetStateManager2, screenNavigator);
                        break;
                }
                map.put(stablecoinHomeWidgets, obj);
            }
            UiCallbackModel models2 = ((RealStablecoinWelcomeWidgetPresenter) obj).models(gapComposer);
            gapComposer.end(false);
            arrayList.add(models2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((UiCallbackModel) next).model != null) {
                arrayList2.add(next);
            }
        }
        Object nullStateCarousel = models.model != null ? new StablecoinHomeViewModel.NullStateCarousel(models) : !arrayList2.isEmpty() ? new StablecoinHomeViewModel.AppletState(arrayList2) : StablecoinHomeViewModel.Loading.INSTANCE;
        gapComposer.end(false);
        return nullStateCarousel;
    }
}

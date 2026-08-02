package app.cash.local.presenters.brand.menu;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import app.cash.local.presenters.brand.LocalOpenTabFooterModelFactoryKt;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.Category;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.toasts.ToastData;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.R;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.profile.presenters.notifications.CategoryListPresenter$models$2$2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.moshi.ClassFactory;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal$Deal$AdjustedPrice;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDealAdjustedPrice;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuPresenter implements MoleculePresenter {
    public final BrandSpot brandSpot;
    public final BuyerIntentManager buyerIntentManager;
    public final CartBuilderManager cartManager;
    public final AndroidClock clock;
    public final RealLocalLauncher launcher;
    public final RealLocalBrandRepository localBrandRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LocalBrandLocationMenuScreen screen;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public LocalBrandLocationMenuPresenter(CartBuilderManager cartBuilderManager, RealLocalBrandRepository realLocalBrandRepository, LocalInstalledStore localInstalledStore, RealLocalBrandSyncer realLocalBrandSyncer, RealLocalLauncher realLocalLauncher, AndroidStringManager androidStringManager, AndroidClock androidClock, BuyerIntentManager buyerIntentManager, LocalBrandLocationMenuScreen localBrandLocationMenuScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandLocationMenuScreen.getClass();
        this.cartManager = cartBuilderManager;
        this.localBrandRepository = realLocalBrandRepository;
        this.store = localInstalledStore;
        this.syncer = realLocalBrandSyncer;
        this.launcher = realLocalLauncher;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.buyerIntentManager = buyerIntentManager;
        this.screen = localBrandLocationMenuScreen;
        this.navigator = screenNavigator;
        this.brandSpot = localBrandLocationMenuScreen.brandSpot;
    }

    /* renamed from: access$navigateToViewItem-hqlE7tU, reason: not valid java name */
    public static final void m1212access$navigateToViewItemhqlE7tU(LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter, MenuItem menuItem, String str, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
        BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationMenuPresenter.navigator;
        boolean isEmpty = menuItem.comboSlots.isEmpty();
        LocalBrandLocationMenuScreen localBrandLocationMenuScreen = localBrandLocationMenuPresenter.screen;
        screenNavigator.goTo(!isEmpty ? new LocalMenuComboDetailsScreen(localBrandLocationMenuScreen.brandSpot, menuItem.token, localBrandLocationMenuScreen.isProfileSheetInline, str, localClientCartMenuItemAddedContext, new LocalMenuComboDetailsScreen.Mode.Add(EmptyList.INSTANCE), localBrandLocationMenuScreen.syncTokens) : new LocalMenuItemDetailsScreen(localBrandLocationMenuScreen.brandSpot, menuItem.token, localBrandLocationMenuScreen.isProfileSheetInline, null, str, localClientCartMenuItemAddedContext, new LocalMenuItemDetailsScreen.Mode.Add(null, EmptyList.INSTANCE), null, localBrandLocationMenuScreen.syncTokens, 904));
    }

    public static final String models$lambda$23(MutableState mutableState) {
        MenuToken menuToken = (MenuToken) mutableState.getValue();
        if (menuToken != null) {
            return menuToken.value;
        }
        return null;
    }

    /* renamed from: firstAvailableMenuTokenOrNull-7E0CHp4, reason: not valid java name */
    public final String m1213firstAvailableMenuTokenOrNull7E0CHp4(LocationMenu locationMenu) {
        Object obj;
        Object obj2;
        List list = locationMenu.menus;
        String str = this.screen.selectedMenu;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((LocationMenu.Menu) obj2).token, str)) {
                    break;
                }
            }
            LocationMenu.Menu menu = (LocationMenu.Menu) obj2;
            String str2 = menu != null ? menu.token : null;
            MenuToken menuToken = str2 != null ? new MenuToken(str2) : null;
            String str3 = menuToken != null ? menuToken.value : null;
            if (str3 != null) {
                return str3;
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            MenuHours menuHours = ((LocationMenu.Menu) obj).hours;
            if (menuHours != null && menuHours.isAvailableNow()) {
                break;
            }
        }
        LocationMenu.Menu menu2 = (LocationMenu.Menu) obj;
        if (menu2 != null) {
            return menu2.token;
        }
        LocationMenu.Menu menu3 = (LocationMenu.Menu) CollectionsKt.firstOrNull(list);
        if (menu3 != null) {
            return menu3.token;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x056b, code lost:
    
        if (r1 == r0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0475, code lost:
    
        if (r3 == false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0685  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BrandSpotSyncTokens brandSpotSyncTokens;
        MutableState mutableState;
        BrandSpot brandSpot;
        Object obj;
        LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter;
        LocalBrandLocationMenuScreen localBrandLocationMenuScreen;
        MutableState mutableState2;
        MutableState mutableState3;
        Object obj2;
        List list;
        Object obj3;
        Object obj4;
        String str;
        AbstractPersistentList abstractPersistentList;
        State state;
        State state2;
        LocalBottomModalViewModel localBottomModalViewModel;
        Object obj5;
        LinkedHashMap linkedHashMap;
        List list2;
        Object obj6;
        ArrayList arrayList;
        List list3;
        Object obj7;
        MutableState mutableState4;
        boolean z;
        ArrayList arrayList2;
        Map map;
        MenuHours menuHours;
        MenuSelectorOption menuSelectorOption;
        Iterator it;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        AndroidStringManager androidStringManager;
        BrandSpot brandSpot2;
        Category category;
        LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem;
        MenuItem m1244menuItemOrNullGvMOdU0;
        LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData;
        String str2;
        MenuItemAvailability available;
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice;
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice;
        LocalMoney localMoney;
        app.cash.local.primitives.LocalMoney localMoney2;
        app.cash.local.primitives.LocalMoney localMoney3;
        LocalBottomModalViewModel.Title title;
        boolean z2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(339177580);
        final int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj8 = Composer.Companion.Empty;
        if (rememberedValue == obj8) {
            rememberedValue = new AvatarViewModel$$ExternalSyntheticLambda0(16);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj8) {
            rememberedValue2 = new AvatarViewModel$$ExternalSyntheticLambda0(17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj8) {
            rememberedValue3 = new AvatarViewModel$$ExternalSyntheticLambda0(18);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer, 48);
        BrandSpot brandSpot3 = this.brandSpot;
        boolean changed = gapComposer.changed(brandSpot3);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj8) {
            rememberedValue4 = LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(this.store, brandSpot3.brandToken);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) collectAsState.getValue();
        LocalBrandLocationMenuScreen localBrandLocationMenuScreen2 = this.screen;
        Continuation continuation = null;
        if (fulfillmentConfiguration != null) {
            BrandSpotSyncTokens brandSpotSyncTokens2 = localBrandLocationMenuScreen2.syncTokens;
            LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
            brandSpotSyncTokens = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens2, schedulingDetails != null ? schedulingDetails.scheduling_day_time_token : null, 6);
        } else {
            brandSpotSyncTokens = localBrandLocationMenuScreen2.syncTokens;
        }
        String str3 = localBrandLocationMenuScreen2.attributionKey.value;
        boolean changed2 = gapComposer.changed(mutableState8) | gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue5 == obj8) {
            rememberedValue5 = new StatusRunnable$$ExternalSyntheticLambda1(9, this, mutableState8);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        BrandSpotSyncTokens brandSpotSyncTokens3 = brandSpotSyncTokens;
        ClassFactory.SyncBrandSpotEffect(this.brandSpot, brandSpotSyncTokens3, str3, this.syncer, this.navigator, this.launcher, (Function0) rememberedValue5, gapComposer, 0, 0);
        RealLocalBrandRepository realLocalBrandRepository = this.localBrandRepository;
        MutableState rememberBrandSaveable = ClassFactory.rememberBrandSaveable(brandSpot3, realLocalBrandRepository, gapComposer);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj8) {
            rememberedValue6 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(rememberBrandSaveable, 5));
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        final State state3 = (State) rememberedValue6;
        boolean changed3 = gapComposer.changed((Location.LocationDetail) state3.getValue());
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue7 == obj8) {
            rememberedValue7 = Updater.derivedStateOf(new Function0(this) { // from class: app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter$$ExternalSyntheticLambda5
                public final /* synthetic */ LocalBrandLocationMenuPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z3;
                    int i3 = i2;
                    State state4 = state3;
                    LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter2 = this.f$0;
                    switch (i3) {
                        case 0:
                            Location.LocationDetail locationDetail = (Location.LocationDetail) state4.getValue();
                            if (locationDetail != null) {
                                AndroidClock androidClock = localBrandLocationMenuPresenter2.clock;
                                LocalFulfillmentType localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
                                localFulfillmentType.getClass();
                                z3 = LocationsKt.currentlyOpen(androidClock, locationDetail.openState(localFulfillmentType));
                            } else {
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                        default:
                            LocationMenu locationMenu = (LocationMenu) state4.getValue();
                            String m1213firstAvailableMenuTokenOrNull7E0CHp4 = locationMenu != null ? localBrandLocationMenuPresenter2.m1213firstAvailableMenuTokenOrNull7E0CHp4(locationMenu) : null;
                            return Updater.mutableStateOf$default(m1213firstAvailableMenuTokenOrNull7E0CHp4 != null ? new MenuToken(m1213firstAvailableMenuTokenOrNull7E0CHp4) : null);
                    }
                }
            });
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        State state4 = (State) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj8) {
            rememberedValue8 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state3, 6));
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        State state5 = (State) rememberedValue8;
        boolean changed4 = gapComposer.changed((Location.LocationDetail) state3.getValue());
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue9 == obj8) {
            rememberedValue9 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state3, 7));
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        final State state6 = (State) rememberedValue9;
        String str4 = localBrandLocationMenuScreen2.selectedMenu;
        Object[] objArr4 = {str4 != null ? new MenuToken(str4) : null};
        boolean changed5 = gapComposer.changed(state6) | gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        final int i3 = 1;
        if (changed5 || rememberedValue10 == obj8) {
            rememberedValue10 = new Function0(this) { // from class: app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter$$ExternalSyntheticLambda5
                public final /* synthetic */ LocalBrandLocationMenuPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z3;
                    int i32 = i3;
                    State state42 = state6;
                    LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter2 = this.f$0;
                    switch (i32) {
                        case 0:
                            Location.LocationDetail locationDetail = (Location.LocationDetail) state42.getValue();
                            if (locationDetail != null) {
                                AndroidClock androidClock = localBrandLocationMenuPresenter2.clock;
                                LocalFulfillmentType localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
                                localFulfillmentType.getClass();
                                z3 = LocationsKt.currentlyOpen(androidClock, locationDetail.openState(localFulfillmentType));
                            } else {
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                        default:
                            LocationMenu locationMenu = (LocationMenu) state42.getValue();
                            String m1213firstAvailableMenuTokenOrNull7E0CHp4 = locationMenu != null ? localBrandLocationMenuPresenter2.m1213firstAvailableMenuTokenOrNull7E0CHp4(locationMenu) : null;
                            return Updater.mutableStateOf$default(m1213firstAvailableMenuTokenOrNull7E0CHp4 != null ? new MenuToken(m1213firstAvailableMenuTokenOrNull7E0CHp4) : null);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue10, gapComposer, 0);
        if (models$lambda$23(mutableState11) == null) {
            gapComposer.startReplaceGroup(-1616804614);
            LocationMenu locationMenu = (LocationMenu) state6.getValue();
            if (locationMenu != null) {
                gapComposer.startReplaceGroup(-1106477359);
                localBrandLocationMenuScreen = localBrandLocationMenuScreen2;
                brandSpot = brandSpot3;
                obj = obj8;
                mutableState = mutableState8;
                mutableState2 = mutableState11;
                localBrandLocationMenuPresenter = this;
                Updater.LaunchedEffect(gapComposer, locationMenu, new zzmh(locationMenu, continuation, this, mutableState11, 3));
                z2 = false;
                gapComposer.end(false);
            } else {
                mutableState = mutableState8;
                brandSpot = brandSpot3;
                obj = obj8;
                localBrandLocationMenuPresenter = this;
                localBrandLocationMenuScreen = localBrandLocationMenuScreen2;
                mutableState2 = mutableState11;
                z2 = false;
                gapComposer.startReplaceGroup(-1106436997);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            mutableState = mutableState8;
            brandSpot = brandSpot3;
            obj = obj8;
            localBrandLocationMenuPresenter = this;
            localBrandLocationMenuScreen = localBrandLocationMenuScreen2;
            mutableState2 = mutableState11;
            gapComposer.startReplaceGroup(-1616685450);
            gapComposer.end(false);
        }
        boolean changed6 = gapComposer.changed(mutableState2);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue11 == obj) {
            rememberedValue11 = new HeroTagViewKt$$ExternalSyntheticLambda12(3, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Function2 function2 = (Function2) rememberedValue11;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed7 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changed7 || rememberedValue12 == obj) {
            rememberedValue12 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 4);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue12, gapComposer);
        boolean changed8 = gapComposer.changed((LocationMenu) state6.getValue());
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changed8 || rememberedValue13 == obj) {
            LocationMenu locationMenu2 = (LocationMenu) state6.getValue();
            if (locationMenu2 == null || (list = locationMenu2.menus) == null) {
                mutableState3 = mutableState2;
                obj2 = null;
            } else {
                List list4 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    LocationMenu.Menu menu = (LocationMenu.Menu) it2.next();
                    arrayList3.add(new MenuSelectorOption(menu.token, menu.name, menu.hours));
                    it2 = it2;
                    mutableState2 = mutableState2;
                }
                mutableState3 = mutableState2;
                obj2 = arrayList3;
            }
            if (obj2 == null) {
                obj2 = EmptyList.INSTANCE;
            }
            gapComposer.updateRememberedValue(obj2);
            obj3 = obj2;
        } else {
            mutableState3 = mutableState2;
            obj3 = rememberedValue13;
        }
        List list5 = (List) obj3;
        Object obj9 = (LocationMenu) state6.getValue();
        String models$lambda$23 = models$lambda$23(mutableState3);
        boolean changed9 = gapComposer.changed(obj9) | gapComposer.changed(models$lambda$23 != null ? new MenuToken(models$lambda$23) : null);
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changed9 || rememberedValue14 == obj) {
            Iterator it3 = list5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it3.next();
                String str5 = ((MenuSelectorOption) obj4).token;
                String models$lambda$232 = models$lambda$23(mutableState3);
                if (models$lambda$232 == null ? false : Intrinsics.areEqual(str5, models$lambda$232)) {
                    break;
                }
            }
            rememberedValue14 = (MenuSelectorOption) obj4;
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        MenuSelectorOption menuSelectorOption2 = (MenuSelectorOption) rememberedValue14;
        String str6 = brandSpotSyncTokens3.inStoreOrderingToken;
        BuyerIntentState rememberBuyerIntentCartState = BuyerIntentCartScopesKt.rememberBuyerIntentCartState(localBrandLocationMenuPresenter.buyerIntentManager, brandSpot, str6, gapComposer);
        LocationMenu locationMenu3 = (LocationMenu) state6.getValue();
        CartBuilderManager cartBuilderManager = localBrandLocationMenuPresenter.cartManager;
        BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect(cartBuilderManager, rememberBuyerIntentCartState, locationMenu3, gapComposer, 64);
        CartBuilder rememberBuyerIntentCartBuilder = BuyerIntentCartScopesKt.rememberBuyerIntentCartBuilder(cartBuilderManager, rememberBuyerIntentCartState, brandSpot, gapComposer);
        boolean changedInstance = gapComposer.changedInstance(localBrandLocationMenuPresenter);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue15 == obj) {
            str = null;
            rememberedValue15 = new BlockRunner$cancel$1(localBrandLocationMenuPresenter, (Continuation) null, 9);
            gapComposer.updateRememberedValue(rememberedValue15);
        } else {
            str = null;
        }
        Updater.LaunchedEffect(gapComposer, brandSpot, (Function2) rememberedValue15);
        boolean changed10 = gapComposer.changed(brandSpot);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changed10 || rememberedValue16 == obj) {
            rememberedValue16 = realLocalBrandRepository.buyerInfo(brandSpot);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        String str7 = str;
        BrandSpot brandSpot4 = brandSpot;
        LocalCart rememberActiveOpenTabCart = OpenTabStateKt.rememberActiveOpenTabCart(rememberBuyerIntentCartBuilder, (GetBuyerInfoResponse.BuyerInfo) Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer, 48, 2).getValue(), gapComposer);
        boolean changed11 = gapComposer.changed((LocalBrand) rememberBrandSaveable.getValue()) | gapComposer.changed((FulfillmentConfiguration) collectAsState.getValue()) | gapComposer.changed(str6);
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (changed11 || rememberedValue17 == obj) {
            LocalBrand localBrand = (LocalBrand) rememberBrandSaveable.getValue();
            rememberedValue17 = (FulfillmentConfiguration) collectAsState.getValue();
            if (rememberedValue17 != null) {
                Object obj10 = rememberedValue17 instanceof FulfillmentConfiguration.InStore ? rememberedValue17 : str7;
                if (obj10 != null) {
                    rememberedValue17 = obj10;
                    gapComposer.updateRememberedValue(rememberedValue17);
                }
            }
            Object inStoreFulfillmentConfiguration = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand, str6);
            if (inStoreFulfillmentConfiguration != null) {
                rememberedValue17 = inStoreFulfillmentConfiguration;
            }
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) rememberedValue17;
        boolean changed12 = gapComposer.changed(rememberActiveOpenTabCart) | gapComposer.changed(fulfillmentConfiguration2);
        Object rememberedValue18 = gapComposer.rememberedValue();
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (changed12 || rememberedValue18 == obj) {
            rememberedValue18 = LocalOpenTabFooterModelFactoryKt.openTabFooterModal(rememberActiveOpenTabCart, fulfillmentConfiguration2, androidStringManager2);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        LocalBottomModalViewModel localBottomModalViewModel2 = (LocalBottomModalViewModel) rememberedValue18;
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (rememberedValue19 == obj) {
            rememberedValue19 = Updater.mutableStateOf$default(str7);
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        MutableState mutableState12 = (MutableState) rememberedValue19;
        MutableState mutableState13 = mutableState9;
        MenuSelectorOption menuSelectorOption3 = menuSelectorOption2;
        MutableState mutableState14 = mutableState10;
        Object obj11 = obj;
        AndroidStringManager androidStringManager3 = androidStringManager2;
        Updater.LaunchedEffect(gapComposer, flow, new CategoryListPresenter$models$2$2(flow, null, this, rememberBuyerIntentCartBuilder, brandSpotSyncTokens3, state3, state6, state5, state4, collectAsState, mutableState12, mutableState13, mutableState14));
        RealCartBuilder realCartBuilder = (RealCartBuilder) rememberBuyerIntentCartBuilder;
        AbstractPersistentList entries = realCartBuilder.entries(gapComposer);
        ListIterator listIterator = entries.listIterator(0);
        int i4 = 0;
        while (listIterator.hasNext()) {
            i4 += ((CartEntryWithQuantity) listIterator.next()).getQuantity();
        }
        if (i4 <= 0 || ((LocationMenu) state6.getValue()) == null) {
            abstractPersistentList = entries;
            state = state3;
            state2 = state6;
            gapComposer.startReplaceGroup(-1609865512);
            gapComposer.end(false);
            localBottomModalViewModel = localBottomModalViewModel2;
        } else {
            gapComposer.startReplaceGroup(-1611214911);
            LocationMenu locationMenu4 = (LocationMenu) state6.getValue();
            locationMenu4.getClass();
            app.cash.local.primitives.LocalMoney calculateCost = realCartBuilder.calculateCost(locationMenu4, false, gapComposer);
            LocationMenu locationMenu5 = (LocationMenu) state6.getValue();
            if (locationMenu5 == null) {
                gapComposer.startReplaceGroup(-1611109636);
                gapComposer.end(false);
                localMoney2 = str7;
            } else {
                gapComposer.startReplaceGroup(-1611109635);
                app.cash.local.primitives.LocalMoney calculateCost2 = realCartBuilder.calculateCost(locationMenu5, true, gapComposer);
                gapComposer.end(false);
                localMoney2 = calculateCost2;
            }
            if (localMoney2 != 0) {
                boolean equals = localMoney2.equals(calculateCost);
                localMoney3 = localMoney2;
            }
            localMoney3 = str7;
            if (((Boolean) state5.getValue()).booleanValue() && ((Boolean) state4.getValue()).booleanValue()) {
                abstractPersistentList = entries;
                state = state3;
                title = str7;
            } else if (((Boolean) state5.getValue()).booleanValue()) {
                abstractPersistentList = entries;
                state = state3;
                title = new LocalBottomModalViewModel.Title(androidStringManager3.get(R.string.local_presenters_location_closed), str7, LocalBottomModalViewModel.Title.TitleTextStyle.Warning, 14);
            } else {
                abstractPersistentList = entries;
                state = state3;
                title = new LocalBottomModalViewModel.Title(androidStringManager3.get(R.string.local_presenters_location_not_accepting_orders), str7, LocalBottomModalViewModel.Title.TitleTextStyle.Warning, 14);
            }
            ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i4), "count");
            Resources resources = androidStringManager3.resources;
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.local_presenters_items)).format(m);
            format2.getClass();
            state2 = state6;
            LocalBottomModalViewModel localBottomModalViewModel3 = new LocalBottomModalViewModel(((Boolean) state5.getValue()).booleanValue() && ((Boolean) state4.getValue()).booleanValue(), title, new LocalBottomModalViewModel.Payload.ItemInfo(format2, LocalsKt.prettyPrint$default(calculateCost, false, null, 7), localMoney3 != 0 ? LocalsKt.prettyPrint$default(localMoney3, false, null, 7) : null, Long.valueOf(calculateCost.amount)), androidStringManager3.get(R.string.local_presenters_view_cart), false, 16);
            gapComposer.end(false);
            localBottomModalViewModel = localBottomModalViewModel3;
        }
        boolean changed13 = gapComposer.changed(i4);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (changed13) {
            obj5 = obj11;
        } else {
            obj5 = obj11;
        }
        rememberedValue20 = new LinkedHashMap();
        gapComposer.updateRememberedValue(rememberedValue20);
        Map map2 = (Map) rememberedValue20;
        LocationMenu locationMenu6 = (LocationMenu) state2.getValue();
        boolean changed14 = gapComposer.changed(locationMenu6 != null ? locationMenu6.categories : null);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (changed14 || rememberedValue21 == obj5) {
            LocationMenu locationMenu7 = (LocationMenu) state2.getValue();
            if (locationMenu7 == null || (list2 = locationMenu7.categories) == null) {
                linkedHashMap = null;
            } else {
                List list6 = list2;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj12 : list6) {
                    linkedHashMap.put(new MenuCategoryToken(((Category) obj12).token), obj12);
                }
            }
            if (linkedHashMap == null) {
                Object obj13 = EmptyMap.INSTANCE;
                obj13.getClass();
                rememberedValue21 = obj13;
            } else {
                rememberedValue21 = linkedHashMap;
            }
            gapComposer.updateRememberedValue(rememberedValue21);
        }
        Map map3 = (Map) rememberedValue21;
        Object obj14 = (LocationMenu) state2.getValue();
        String models$lambda$233 = models$lambda$23(mutableState3);
        boolean changed15 = gapComposer.changed(obj14) | gapComposer.changed(models$lambda$233 != null ? new MenuToken(models$lambda$233) : null);
        Object rememberedValue22 = gapComposer.rememberedValue();
        if (changed15 || rememberedValue22 == obj5) {
            if (((LocationMenu) state2.getValue()) != null) {
                LocationMenu locationMenu8 = (LocationMenu) state2.getValue();
                locationMenu8.getClass();
                if (!locationMenu8.menus.isEmpty()) {
                    LocationMenu locationMenu9 = (LocationMenu) state2.getValue();
                    if (locationMenu9 != null && (list3 = locationMenu9.menus) != null) {
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it4.next();
                            String str8 = ((LocationMenu.Menu) obj7).token;
                            String models$lambda$234 = models$lambda$23(mutableState3);
                            if (models$lambda$234 == null ? false : Intrinsics.areEqual(str8, models$lambda$234)) {
                                break;
                            }
                        }
                        LocationMenu.Menu menu2 = (LocationMenu.Menu) obj7;
                        if (menu2 != null) {
                            ArrayList arrayList4 = menu2.categoryTokens;
                            arrayList = new ArrayList();
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                Category category2 = (Category) map3.get(new MenuCategoryToken(((MenuCategoryToken) it5.next()).value));
                                if (category2 != null) {
                                    arrayList.add(category2);
                                }
                            }
                            if (arrayList != null) {
                                obj6 = EmptyList.INSTANCE;
                                rememberedValue22 = obj6;
                                gapComposer.updateRememberedValue(rememberedValue22);
                            } else {
                                rememberedValue22 = arrayList;
                                gapComposer.updateRememberedValue(rememberedValue22);
                            }
                        }
                    }
                    arrayList = null;
                    if (arrayList != null) {
                    }
                }
            }
            LocationMenu locationMenu10 = (LocationMenu) state2.getValue();
            obj6 = locationMenu10 != null ? locationMenu10.categories : null;
            if (obj6 == null) {
                obj6 = EmptyList.INSTANCE;
            }
            rememberedValue22 = obj6;
            gapComposer.updateRememberedValue(rememberedValue22);
        }
        List list7 = (List) rememberedValue22;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
        Iterator it6 = list7.iterator();
        int i5 = 0;
        while (it6.hasNext()) {
            Object next = it6.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Category category3 = (Category) next;
            String str9 = category3.token;
            String str10 = category3.name;
            MenuHours menuHours2 = category3.menuHours;
            MenuSelectorOption menuSelectorOption4 = menuSelectorOption3;
            boolean z3 = MenuHoursKt.isNullOrAvailableNow(menuSelectorOption4 != null ? menuSelectorOption4.hours : null) && !MenuHoursKt.isNullOrAvailableNow(category3.menuHours);
            LocalBrandLocationMenuViewModel.MenuCategory.Style style = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
            gapComposer.startReplaceGroup(-467517242);
            ArrayList arrayList6 = category3.items;
            Iterator it7 = it6;
            ArrayList arrayList7 = new ArrayList();
            Iterator it8 = arrayList6.iterator();
            int i7 = 0;
            while (it8.hasNext()) {
                Object next2 = it8.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                String str11 = str9;
                String str12 = ((MenuItemToken) next2).value;
                String str13 = str10;
                LocationMenu locationMenu11 = (LocationMenu) state2.getValue();
                if (locationMenu11 == null || (m1244menuItemOrNullGvMOdU0 = locationMenu11.m1244menuItemOrNullGvMOdU0(str12)) == null) {
                    map = map2;
                    menuHours = menuHours2;
                    menuSelectorOption = menuSelectorOption4;
                    it = it8;
                    mutableState5 = mutableState12;
                    mutableState6 = mutableState13;
                    mutableState7 = mutableState14;
                    androidStringManager = androidStringManager3;
                    brandSpot2 = brandSpot4;
                    category = category3;
                    menuItem = null;
                } else {
                    menuHours = menuHours2;
                    gapComposer.startReplaceGroup(-467510263);
                    MenuItemToken menuItemToken = new MenuItemToken(str12);
                    Object obj15 = map2.get(menuItemToken);
                    if (obj15 == null) {
                        menuSelectorOption = menuSelectorOption4;
                        LocationMenu locationMenu12 = (LocationMenu) state2.getValue();
                        locationMenu12.getClass();
                        ArrayList m1248modifierListsForMenuItemGvMOdU0 = locationMenu12.m1248modifierListsForMenuItemGvMOdU0(str12);
                        String str14 = category3.token;
                        LocationMenu locationMenu13 = (LocationMenu) state2.getValue();
                        locationMenu13.getClass();
                        Map map4 = locationMenu13.discountSummaries;
                        it = it8;
                        LocalMenuAvailability localMenuAvailability = m1244menuItemOrNullGvMOdU0.availability;
                        mutableState5 = mutableState12;
                        int ordinal = localMenuAvailability.ordinal();
                        if (ordinal == 0) {
                            Path$$ExternalSyntheticBUOutline0.m$1(localMenuAvailability, "Unexpected availability ");
                            return null;
                        }
                        mutableState6 = mutableState13;
                        if (ordinal == 1) {
                            String priceRangeAsString = LocalMenuItemsKt.priceRangeAsString(m1244menuItemOrNullGvMOdU0, m1248modifierListsForMenuItemGvMOdU0);
                            LocalMenuItemDeal localMenuItemDeal = m1244menuItemOrNullGvMOdU0.deal;
                            if (localMenuItemDeal == null || (localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal) == null || (localMenuItemDealAdjustedPrice = localMenuItemDeal$Deal$AdjustedPrice.value) == null || (localMoney = localMenuItemDealAdjustedPrice.original_price) == null) {
                                mutableState7 = mutableState14;
                                androidStringManager = androidStringManager3;
                                str2 = null;
                            } else {
                                mutableState7 = mutableState14;
                                androidStringManager = androidStringManager3;
                                str2 = LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney), false, null, 7);
                            }
                            available = new MenuItemAvailability.Available(priceRangeAsString, str2);
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            available = MenuItemAvailability.SoldOut.INSTANCE;
                            mutableState7 = mutableState14;
                            androidStringManager = androidStringManager3;
                        }
                        String discountText = LocalMenuItemsKt.discountText(m1244menuItemOrNullGvMOdU0, map4);
                        LocalImage localImage = m1244menuItemOrNullGvMOdU0.image;
                        String str15 = m1244menuItemOrNullGvMOdU0.name;
                        MenuHours menuHours3 = m1244menuItemOrNullGvMOdU0.menuHours;
                        String str16 = m1244menuItemOrNullGvMOdU0.token;
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it9 = abstractPersistentList.iterator();
                        while (it9.hasNext()) {
                            String str17 = discountText;
                            Object next3 = it9.next();
                            LocalImage localImage2 = localImage;
                            String str18 = str15;
                            if (Intrinsics.areEqual(((CartEntryWithQuantity) next3).getCartEntry().menuItemToken, m1244menuItemOrNullGvMOdU0.token)) {
                                arrayList8.add(next3);
                            }
                            discountText = str17;
                            str15 = str18;
                            localImage = localImage2;
                        }
                        String str19 = discountText;
                        LocalImage localImage3 = localImage;
                        String str20 = str15;
                        Iterator it10 = arrayList8.iterator();
                        int i9 = 0;
                        while (it10.hasNext()) {
                            i9 = ((CartEntryWithQuantity) it10.next()).getQuantity() + i9;
                        }
                        LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem2 = new LocalBrandLocationMenuViewModel.MenuCategory.MenuItem(localImage3, str20, available, str19, false, menuHours3, new CartItemCounterViewModel(str16, str14, i9, 0, Integer.valueOf(available instanceof MenuItemAvailability.SoldOut ? 0 : m1244menuItemOrNullGvMOdU0.maxOrderQuantity), new CartItemCounterViewModel.Mode.Compact(true), null, 72), m1244menuItemOrNullGvMOdU0.description);
                        map2.put(menuItemToken, menuItem2);
                        obj15 = menuItem2;
                    } else {
                        menuSelectorOption = menuSelectorOption4;
                        it = it8;
                        mutableState5 = mutableState12;
                        mutableState6 = mutableState13;
                        mutableState7 = mutableState14;
                        androidStringManager = androidStringManager3;
                    }
                    LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem3 = (LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) obj15;
                    gapComposer.end(false);
                    boolean z4 = m1244menuItemOrNullGvMOdU0.preorderingSummary != null;
                    CartItemCounterViewModel cartItemCounterViewModel = menuItem3.counterModel;
                    String str21 = category3.token;
                    brandSpot2 = brandSpot4;
                    String str22 = brandSpot2.brandToken;
                    Location.LocationDetail locationDetail = (Location.LocationDetail) state.getValue();
                    String str23 = locationDetail != null ? locationDetail.summary.token : null;
                    long j = i7;
                    String str24 = category3.token;
                    category = category3;
                    long j2 = i5;
                    if (m1244menuItemOrNullGvMOdU0.comboSlots.isEmpty()) {
                        map = map2;
                        menuItemAddedContextComboData = LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.NonComboItemContextData.INSTANCE;
                    } else {
                        map = map2;
                        menuItemAddedContextComboData = new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData("");
                    }
                    CartItemCounterViewModel m1292copys0nK_MQ$default = CartItemCounterViewModel.m1292copys0nK_MQ$default(cartItemCounterViewModel, str21, new LocalClientCartMenuItemAddedContext(str22, str23, menuItemAddedContextComboData, Long.valueOf(j), str24, Long.valueOf(j2), null, null, 192), 61);
                    LocalImage localImage4 = menuItem3.image;
                    String str25 = menuItem3.label;
                    MenuItemAvailability menuItemAvailability = menuItem3.availability;
                    String str26 = menuItem3.discountText;
                    MenuHours menuHours4 = menuItem3.menuHours;
                    String str27 = menuItem3.description;
                    str25.getClass();
                    menuItem = new LocalBrandLocationMenuViewModel.MenuCategory.MenuItem(localImage4, str25, menuItemAvailability, str26, z4, menuHours4, m1292copys0nK_MQ$default, str27);
                }
                if (menuItem != null) {
                    arrayList7.add(menuItem);
                }
                mutableState14 = mutableState7;
                brandSpot4 = brandSpot2;
                category3 = category;
                map2 = map;
                i7 = i8;
                it8 = it;
                mutableState12 = mutableState5;
                mutableState13 = mutableState6;
                menuSelectorOption4 = menuSelectorOption;
                androidStringManager3 = androidStringManager;
                str9 = str11;
                str10 = str13;
                menuHours2 = menuHours;
            }
            Map map5 = map2;
            String str28 = str9;
            String str29 = str10;
            MenuHours menuHours5 = menuHours2;
            MenuSelectorOption menuSelectorOption5 = menuSelectorOption4;
            MutableState mutableState15 = mutableState12;
            MutableState mutableState16 = mutableState13;
            MutableState mutableState17 = mutableState14;
            AndroidStringManager androidStringManager4 = androidStringManager3;
            BrandSpot brandSpot5 = brandSpot4;
            gapComposer.end(false);
            String str30 = (String) mutableState17.getValue();
            if (str30 == null || StringsKt.isBlank(str30)) {
                arrayList2 = arrayList7;
            } else {
                ArrayList arrayList9 = new ArrayList();
                Iterator it11 = arrayList7.iterator();
                while (it11.hasNext()) {
                    Object next4 = it11.next();
                    if (StringsKt.contains((CharSequence) ((LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) next4).label, (CharSequence) str30, true)) {
                        arrayList9.add(next4);
                    }
                }
                arrayList2 = arrayList9;
            }
            arrayList5.add(new LocalBrandLocationMenuViewModel.MenuCategory(str28, str29, menuHours5, z3, arrayList2));
            it6 = it7;
            i5 = i6;
            mutableState14 = mutableState17;
            brandSpot4 = brandSpot5;
            map2 = map5;
            mutableState12 = mutableState15;
            mutableState13 = mutableState16;
            menuSelectorOption3 = menuSelectorOption5;
            androidStringManager3 = androidStringManager4;
        }
        MutableState mutableState18 = mutableState12;
        MutableState mutableState19 = mutableState13;
        AndroidStringManager androidStringManager5 = androidStringManager3;
        MenuSelectorOption menuSelectorOption6 = menuSelectorOption3;
        ArrayList arrayList10 = new ArrayList();
        Iterator it12 = arrayList5.iterator();
        while (it12.hasNext()) {
            Object next5 = it12.next();
            if (!((LocalBrandLocationMenuViewModel.MenuCategory) next5).items.isEmpty()) {
                arrayList10.add(next5);
            }
        }
        if (((LocalBrand) rememberBrandSaveable.getValue()) != null || ((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState4 = mutableState19;
            z = false;
        } else {
            z = true;
            mutableState4 = mutableState19;
        }
        boolean isEmpty = arrayList10.isEmpty();
        Collection collection = arrayList10;
        if (isEmpty) {
            String str31 = androidStringManager5.get(R.string.local_presenters_no_results_found);
            EmptyList emptyList = EmptyList.INSTANCE;
            LocalBrandLocationMenuViewModel.MenuCategory.Style style2 = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
            collection = CollectionsKt__CollectionsJVMKt.listOf(new LocalBrandLocationMenuViewModel.MenuCategory("empty", str31, null, false, emptyList));
        }
        LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = new LocalBrandLocationMenuViewModel(z, list5, menuSelectorOption6, localBottomModalViewModel, (List) collection, localBrandLocationMenuScreen.selectedMenuCategory, ((Boolean) mutableState4.getValue()).booleanValue(), (ToastData) mutableState18.getValue());
        gapComposer.end(false);
        return localBrandLocationMenuViewModel;
    }
}

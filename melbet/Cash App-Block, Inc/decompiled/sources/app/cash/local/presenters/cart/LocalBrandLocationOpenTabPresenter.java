package app.cash.local.presenters.cart;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class LocalBrandLocationOpenTabPresenter implements MoleculePresenter {
    public final LocalCartCheckoutNavigator cartCheckoutNavigator;
    public final RealLocalBrandRepository localBrandRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final CartBuilder openCart;
    public final LocalOpenTabCartMapper openTabCartMapper;
    public final LocalBrandLocationOpenTabScreen screen;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public LocalBrandLocationOpenTabPresenter(AndroidStringManager androidStringManager, CartBuilderManager cartBuilderManager, RealLocalBrandRepository realLocalBrandRepository, RealLocalBrandSyncer realLocalBrandSyncer, LocalOpenTabCartMapper localOpenTabCartMapper, LocalCartCheckoutNavigator localCartCheckoutNavigator, LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandLocationOpenTabScreen.getClass();
        this.stringManager = androidStringManager;
        this.localBrandRepository = realLocalBrandRepository;
        this.syncer = realLocalBrandSyncer;
        this.openTabCartMapper = localOpenTabCartMapper;
        this.cartCheckoutNavigator = localCartCheckoutNavigator;
        this.screen = localBrandLocationOpenTabScreen;
        this.navigator = screenNavigator;
        this.openCart = ((RealCartBuilderManager) cartBuilderManager).getBuilder(localBrandLocationOpenTabScreen.brandSpot);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ac, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c9  */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        LocalCart localCart;
        String str;
        AndroidStringManager androidStringManager;
        Object failure;
        List<LocalCart.OpenTabInfo.Round> list;
        MenuItem menuItem;
        String str2;
        LocalCart localCart2;
        Iterator it;
        int i2;
        Iterator it2;
        LocalCartSummaryLineViewModel localCartSummaryLineViewModel;
        CartEntry cartEntry;
        String str3;
        String fallbackInformation;
        LocalMoney moneyOrNull;
        LocalMoney moneyOrNull2;
        LocalCartSummaryLineViewModel.Discount discount;
        List list2;
        Object failure2;
        Integer num;
        Object failure3;
        Object failure4;
        CartEntry cartEntry2;
        Integer num2;
        LocalCart.OpenTabInfo openTabInfo;
        boolean z;
        String str4;
        LocalCart.OpenTabInfo openTabInfo2;
        LocalCart.OpenTabInfo openTabInfo3;
        flow.getClass();
        ?? r8 = (GapComposer) composer;
        r8.startReplaceGroup(-1573699678);
        Object rememberedValue = r8.rememberedValue();
        RealLocalBrandRepository realLocalBrandRepository = this.localBrandRepository;
        LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen = this.screen;
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = realLocalBrandRepository.brand(localBrandLocationOpenTabScreen.brandSpot);
            r8.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, r8, 48, 2);
        Object rememberedValue2 = r8.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = realLocalBrandRepository.buyerInfo(localBrandLocationOpenTabScreen.brandSpot);
            r8.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, r8, 48, 2);
        Object rememberedValue3 = r8.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(collectAsState, 9));
            r8.updateRememberedValue(rememberedValue3);
        }
        State state = (State) rememberedValue3;
        LocalCart rememberActiveOpenTabCart = OpenTabStateKt.rememberActiveOpenTabCart(this.openCart, (GetBuyerInfoResponse.BuyerInfo) collectAsState2.getValue(), r8);
        boolean hasOpenTabRounds = OpenTabStateKt.getHasOpenTabRounds(rememberActiveOpenTabCart);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(rememberActiveOpenTabCart, r8);
        BrandSpot brandSpot = localBrandLocationOpenTabScreen.brandSpot;
        BrandSpotSyncTokens brandSpotSyncTokens = localBrandLocationOpenTabScreen.syncTokens;
        boolean changedInstance = r8.changedInstance(this);
        Object rememberedValue4 = r8.rememberedValue();
        int i3 = 0;
        Continuation continuation = null;
        if (changedInstance || rememberedValue4 == obj) {
            rememberedValue4 = new LocalBrandLocationOpenTabPresenter$models$1$1(this, continuation, i3);
            r8.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(brandSpot, brandSpotSyncTokens, (Function2) rememberedValue4, r8);
        BrandSpot brandSpot2 = localBrandLocationOpenTabScreen.brandSpot;
        boolean changedInstance2 = r8.changedInstance(this);
        Object rememberedValue5 = r8.rememberedValue();
        int i4 = 1;
        if (changedInstance2 || rememberedValue5 == obj) {
            rememberedValue5 = new LocalBrandLocationOpenTabPresenter$models$1$1(this, continuation, i4);
            r8.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect((Composer) r8, brandSpot2, (Function2) rememberedValue5);
        boolean changed = r8.changed((rememberActiveOpenTabCart == null || (openTabInfo3 = rememberActiveOpenTabCart.open_tab_info) == null) ? null : openTabInfo3.rounds) | r8.changed((LocationMenu) state.getValue());
        Object rememberedValue6 = r8.rememberedValue();
        if (changed || rememberedValue6 == obj) {
            List<LocalCart.OpenTabInfo.Round> list3 = (rememberActiveOpenTabCart == null || (openTabInfo = rememberActiveOpenTabCart.open_tab_info) == null) ? null : openTabInfo.rounds;
            LocationMenu locationMenu = (LocationMenu) state.getValue();
            LocalOpenTabCartMapper localOpenTabCartMapper = this.openTabCartMapper;
            AndroidStringManager androidStringManager2 = localOpenTabCartMapper.stringManager;
            if (list3 == null) {
                list3 = EmptyList.INSTANCE;
            }
            List<LocalCart.OpenTabInfo.Round> list4 = list3;
            List<LocalCart.OpenTabInfo.Round> list5 = list4;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
            Iterator it3 = list5.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    ?? r20 = continuation;
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r20;
                }
                LocalCart.OpenTabInfo.Round round = (LocalCart.OpenTabInfo.Round) next;
                Iterator it4 = round.lines.iterator();
                int i7 = 0;
                while (it4.hasNext()) {
                    LocalCart.Line.Selection selection = ((LocalCart.Line) it4.next()).selection;
                    i7 += (selection == null || (num2 = selection.quantity) == null) ? 1 : num2.intValue();
                }
                Object[] objArr = {localOpenTabCartMapper.itemCountSummary(i7)};
                Resources resources = androidStringManager2.resources;
                resources.getClass();
                MutableState mutableState2 = rememberUpdatedState;
                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_open_tab_round_title)).format(objArr);
                format2.getClass();
                Long l = round.created_at_millis;
                if (l != null) {
                    long longValue = l.longValue();
                    AndroidClock androidClock = localOpenTabCartMapper.clock;
                    ZoneId zoneId = androidClock.timeZone().toZoneId();
                    ZonedDateTime atZone = Instant.ofEpochMilli(longValue).atZone(zoneId);
                    str = atZone.format(Intrinsics.areEqual(atZone.toLocalDate(), Instant.ofEpochMilli(androidClock.millis()).atZone(zoneId).toLocalDate()) ? DateTimesKt.hourOnlyPattern : DateTimesKt.monthDayTimePattern);
                    str.getClass();
                } else {
                    str = null;
                }
                String str5 = round.status_label;
                if (str5 != null) {
                    if (StringsKt.isBlank(str5)) {
                        str5 = null;
                    }
                }
                str5 = androidStringManager2.get(R.string.local_presenters_open_tab_round_default_status_label);
                String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str5}), " · ", null, null, 0, null, null, 62);
                if (joinToString$default.length() <= 0) {
                    joinToString$default = null;
                }
                List<LocalCart.Line> list6 = round.lines;
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = list6.iterator();
                int i8 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    LocalOpenTabCartMapper localOpenTabCartMapper2 = localOpenTabCartMapper;
                    LocalCart.Line line = (LocalCart.Line) next2;
                    try {
                        Result.Companion companion = Result.Companion;
                        LocalCart.Line.Selection selection2 = line.selection;
                        failure = selection2 != null ? SelectionKt.toSelection(selection2) : null;
                        androidStringManager = androidStringManager2;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        androidStringManager = androidStringManager2;
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Selection selection3 = (Selection) failure;
                    if (selection3 != null) {
                        list = list4;
                        menuItem = locationMenu != null ? locationMenu.m1244menuItemOrNullGvMOdU0(selection3.menuItemToken) : null;
                    } else {
                        list = list4;
                        menuItem = null;
                    }
                    if (menuItem == null || (str2 = menuItem.name) == null) {
                        str2 = line.menu_item_name;
                        if (str2 == null || StringsKt.isBlank(str2)) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            localCart2 = rememberActiveOpenTabCart;
                            it = it5;
                            i2 = i9;
                            it2 = it3;
                            localCartSummaryLineViewModel = null;
                            if (localCartSummaryLineViewModel != null) {
                                arrayList2.add(localCartSummaryLineViewModel);
                            }
                            localOpenTabCartMapper = localOpenTabCartMapper2;
                            androidStringManager2 = androidStringManager;
                            list4 = list;
                            it5 = it;
                            i8 = i2;
                            it3 = it2;
                            rememberActiveOpenTabCart = localCart2;
                        }
                    }
                    String str6 = str2;
                    it = it5;
                    ArrayList plus = CollectionsKt.plus((Iterable) line.discount_texts, (Collection) CollectionsKt__CollectionsKt.listOfNotNull(line.discount_text));
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it6 = plus.iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = it6;
                        Object next3 = it7.next();
                        if (((String) next3).length() > 0) {
                            arrayList3.add(next3);
                        }
                        it6 = it7;
                    }
                    String joinToString$default2 = CollectionsKt.joinToString$default(arrayList3, ", ", null, null, 0, null, null, 62);
                    String str7 = joinToString$default2.length() > 0 ? joinToString$default2 : null;
                    if (selection3 != null) {
                        if (locationMenu == null) {
                            i2 = i9;
                            cartEntry2 = null;
                        } else {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                i2 = i9;
                                try {
                                    failure4 = CartBuilderKt.m1202toCartEntryxZOLh24(selection3, locationMenu, str7, null);
                                } catch (Throwable th2) {
                                    th = th2;
                                    Result.Companion companion4 = Result.Companion;
                                    failure4 = new Result.Failure(th);
                                    if (failure4 instanceof Result.Failure) {
                                    }
                                    cartEntry2 = (CartEntry) failure4;
                                    cartEntry = cartEntry2;
                                    if (cartEntry != null) {
                                    }
                                    str3 = str7;
                                    fallbackInformation = LocalOpenTabCartMapper.fallbackInformation(line, selection3, menuItem);
                                    String str8 = fallbackInformation;
                                    moneyOrNull = LocalOpenTabCartMapper.toMoneyOrNull(line.total_price);
                                    if (moneyOrNull == null) {
                                    }
                                    it2 = it3;
                                    String prettyPrint$default = LocalsKt.prettyPrint$default(moneyOrNull, false, null, 7);
                                    LocalMoney moneyOrNull3 = LocalOpenTabCartMapper.toMoneyOrNull(line.total_price_before_discounts);
                                    if (moneyOrNull3 == null) {
                                    }
                                    LocalCart.Line.Selection selection4 = line.selection;
                                    if (selection4 != null) {
                                    }
                                    moneyOrNull2 = LocalOpenTabCartMapper.toMoneyOrNull(line.discount_amount);
                                    if (moneyOrNull2 == null) {
                                    }
                                    if (cartEntry != null) {
                                    }
                                    list2 = EmptyList.INSTANCE;
                                    localCartSummaryLineViewModel = new LocalCartSummaryLineViewModel(i8, str6, str8, prettyPrint$default, r26, r27, discount, list2);
                                    if (localCartSummaryLineViewModel != null) {
                                    }
                                    localOpenTabCartMapper = localOpenTabCartMapper2;
                                    androidStringManager2 = androidStringManager;
                                    list4 = list;
                                    it5 = it;
                                    i8 = i2;
                                    it3 = it2;
                                    rememberActiveOpenTabCart = localCart2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = i9;
                            }
                            if (failure4 instanceof Result.Failure) {
                                failure4 = null;
                            }
                            cartEntry2 = (CartEntry) failure4;
                        }
                        cartEntry = cartEntry2;
                    } else {
                        i2 = i9;
                        cartEntry = null;
                    }
                    if (cartEntry != null || locationMenu == null || menuItem == null) {
                        str3 = str7;
                        fallbackInformation = LocalOpenTabCartMapper.fallbackInformation(line, selection3, menuItem);
                    } else {
                        try {
                            Result.Companion companion5 = Result.Companion;
                            str3 = str7;
                            failure3 = LineSelectionInformationRendererKt.buildSelectionInformationString(cartEntry, locationMenu, menuItem);
                        } catch (Throwable th4) {
                            Result.Companion companion6 = Result.Companion;
                            str3 = str7;
                            failure3 = new Result.Failure(th4);
                        }
                        if (failure3 instanceof Result.Failure) {
                            failure3 = null;
                        }
                        fallbackInformation = (String) failure3;
                        if (fallbackInformation == null) {
                            fallbackInformation = LocalOpenTabCartMapper.fallbackInformation(line, selection3, menuItem);
                        }
                    }
                    String str82 = fallbackInformation;
                    moneyOrNull = LocalOpenTabCartMapper.toMoneyOrNull(line.total_price);
                    if (moneyOrNull == null) {
                        moneyOrNull = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                    }
                    it2 = it3;
                    String prettyPrint$default2 = LocalsKt.prettyPrint$default(moneyOrNull, false, null, 7);
                    LocalMoney moneyOrNull32 = LocalOpenTabCartMapper.toMoneyOrNull(line.total_price_before_discounts);
                    String prettyPrint$default3 = moneyOrNull32 == null ? LocalsKt.prettyPrint$default(moneyOrNull32, false, null, 7) : null;
                    LocalCart.Line.Selection selection42 = line.selection;
                    int intValue = (selection42 != null || (num = selection42.quantity) == null) ? 1 : num.intValue();
                    moneyOrNull2 = LocalOpenTabCartMapper.toMoneyOrNull(line.discount_amount);
                    if (moneyOrNull2 == null) {
                        localCart2 = rememberActiveOpenTabCart;
                        discount = new LocalCartSummaryLineViewModel.Discount(str3 == null ? "" : str3, LocalsKt.prettyPrint$default(moneyOrNull2, false, "- ", 5));
                    } else {
                        localCart2 = rememberActiveOpenTabCart;
                        discount = null;
                    }
                    if (cartEntry != null || locationMenu == null || menuItem == null) {
                        list2 = EmptyList.INSTANCE;
                    } else {
                        List<CartEntry.ComboSlotSelection> list7 = cartEntry.comboSlotSelections;
                        list2 = new ArrayList();
                        for (CartEntry.ComboSlotSelection comboSlotSelection : list7) {
                            try {
                                Result.Companion companion7 = Result.Companion;
                                failure2 = ComboSlotViewModelBuilder.buildComboSlotViewModel(locationMenu, menuItem, comboSlotSelection, EmptyList.INSTANCE);
                            } catch (Throwable th5) {
                                Result.Companion companion8 = Result.Companion;
                                failure2 = new Result.Failure(th5);
                            }
                            if (failure2 instanceof Result.Failure) {
                                failure2 = null;
                            }
                            ComboSlotViewModel comboSlotViewModel = (ComboSlotViewModel) failure2;
                            if (comboSlotViewModel != null) {
                                list2.add(comboSlotViewModel);
                            }
                        }
                    }
                    localCartSummaryLineViewModel = new LocalCartSummaryLineViewModel(i8, str6, str82, prettyPrint$default2, prettyPrint$default3, intValue, discount, list2);
                    if (localCartSummaryLineViewModel != null) {
                    }
                    localOpenTabCartMapper = localOpenTabCartMapper2;
                    androidStringManager2 = androidStringManager;
                    list4 = list;
                    it5 = it;
                    i8 = i2;
                    it3 = it2;
                    rememberActiveOpenTabCart = localCart2;
                }
                LocalOpenTabCartMapper localOpenTabCartMapper3 = localOpenTabCartMapper;
                AndroidStringManager androidStringManager3 = androidStringManager2;
                List<LocalCart.OpenTabInfo.Round> list8 = list4;
                LocalCart localCart3 = rememberActiveOpenTabCart;
                Iterator it8 = it3;
                arrayList.add(new LocalBrandLocationOpenTabViewModel.Round(format2, joinToString$default, arrayList2, i5 == CollectionsKt__CollectionsKt.getLastIndex(list8)));
                i5 = i6;
                rememberUpdatedState = mutableState2;
                continuation = null;
                localOpenTabCartMapper = localOpenTabCartMapper3;
                androidStringManager2 = androidStringManager3;
                list4 = list8;
                it3 = it8;
                rememberActiveOpenTabCart = localCart3;
            }
            mutableState = rememberUpdatedState;
            localCart = rememberActiveOpenTabCart;
            r8.updateRememberedValue(arrayList);
            rememberedValue6 = arrayList;
        } else {
            mutableState = rememberUpdatedState;
            localCart = rememberActiveOpenTabCart;
        }
        List list9 = (List) rememberedValue6;
        Object rememberedValue7 = r8.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r8);
            r8.updateRememberedValue(rememberedValue7);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue7;
        Object rememberedValue8 = r8.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            r8.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState3 = (MutableState) rememberedValue8;
        Object rememberedValue9 = r8.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            r8.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState4 = (MutableState) rememberedValue9;
        Updater.LaunchedEffect((Composer) r8, flow, new EngineInterceptor$intercept$2(6, mutableState, flow, this, coroutineScope, mutableState3, mutableState4, (Continuation) null));
        AndroidStringManager androidStringManager4 = this.stringManager;
        String str9 = androidStringManager4.get(R.string.local_presenters_open_tab_screen_title);
        String str10 = androidStringManager4.get(R.string.local_presenters_open_tab_summary_title);
        List<LocalCart.OpenTabInfo.Round> list10 = (localCart == null || (openTabInfo2 = localCart.open_tab_info) == null) ? null : openTabInfo2.rounds;
        if (list10 == null) {
            list10 = EmptyList.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = list10.iterator();
        while (it9.hasNext()) {
            LocalMoney subtotalOrLineTotal = LocalOpenTabCartMapper.subtotalOrLineTotal((LocalCart.OpenTabInfo.Round) it9.next());
            if (subtotalOrLineTotal != null) {
                arrayList4.add(subtotalOrLineTotal);
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        if (arrayList4 != null) {
            z = false;
            str4 = LocalsKt.prettyPrint$default(LocalOpenTabCartMapper.sumLocalMoneyOrZero(arrayList4), false, null, 7);
        } else {
            z = false;
            str4 = null;
        }
        LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = new LocalBrandLocationOpenTabViewModel(str9, str10, str4, list9, (List) mutableState4.getValue(), hasOpenTabRounds, ((Boolean) mutableState3.getValue()).booleanValue());
        r8.end(z);
        return localBrandLocationOpenTabViewModel;
    }
}

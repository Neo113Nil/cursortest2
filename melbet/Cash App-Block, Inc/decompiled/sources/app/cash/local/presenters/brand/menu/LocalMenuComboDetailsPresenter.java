package app.cash.local.presenters.brand.menu;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
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
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.MenuState;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.DiscountToken;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuDiscountSummary;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.ModifierListConfig;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.MenuItemDetailsQuestion;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.paraphrase.FormattedResource;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.squareup.cash.R;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$28$8$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.tinygraph.EntityStoreModule;
import com.squareup.moshi.ClassFactory;
import com.squareup.moshi.JsonScope;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalDietaryPreference;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalIngredient;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import xyz.block.genie.templates.GenieNodeInclusionKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class LocalMenuComboDetailsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealLocalBrandRepository brandRepository;
    public final BuyerIntentManager buyerIntentManager;
    public final CartBuilderManager cartManager;
    public final LocalMenuComboDetailsViewModel loadingViewModel;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LocalMenuComboDetailsScreen screen;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public final class ComboTokenAndSectionIndex implements Parcelable {
        public static final Parcelable.Creator<ComboTokenAndSectionIndex> CREATOR = new Creator();
        public final int sectionIndex;
        public final String token;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComboTokenAndSectionIndex(((ComboSlotToken) parcel.readParcelable(ComboTokenAndSectionIndex.class.getClassLoader())).value, ((LocalMenuComboDetailsViewModel.SectionIndex) parcel.readParcelable(ComboTokenAndSectionIndex.class.getClassLoader())).value);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComboTokenAndSectionIndex[i];
            }
        }

        public ComboTokenAndSectionIndex(String str, int i) {
            str.getClass();
            this.token = str;
            this.sectionIndex = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComboTokenAndSectionIndex)) {
                return false;
            }
            ComboTokenAndSectionIndex comboTokenAndSectionIndex = (ComboTokenAndSectionIndex) obj;
            return Intrinsics.areEqual(this.token, comboTokenAndSectionIndex.token) && this.sectionIndex == comboTokenAndSectionIndex.sectionIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.sectionIndex) + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ComboTokenAndSectionIndex(token=", ComboSlotToken.m1233toStringimpl(this.token), ", sectionIndex=", LocalMenuComboDetailsViewModel.SectionIndex.m1294toStringimpl(this.sectionIndex), ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(new ComboSlotToken(this.token), i);
            parcel.writeParcelable(new LocalMenuComboDetailsViewModel.SectionIndex(this.sectionIndex), i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalMenuAvailability.values().length];
            try {
                Origin.Companion companion = LocalMenuAvailability.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Origin.Companion companion2 = LocalMenuAvailability.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Origin.Companion companion3 = LocalMenuAvailability.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalMenuComboDetailsPresenter(Analytics analytics, AndroidStringManager androidStringManager, CartBuilderManager cartBuilderManager, RealLocalBrandRepository realLocalBrandRepository, SessionManager sessionManager, LocalInstalledStore localInstalledStore, RealLocalBrandSyncer realLocalBrandSyncer, BuyerIntentManager buyerIntentManager, BetterNavigator.ScreenNavigator screenNavigator, LocalMenuComboDetailsScreen localMenuComboDetailsScreen) {
        localMenuComboDetailsScreen.getClass();
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.cartManager = cartBuilderManager;
        this.brandRepository = realLocalBrandRepository;
        this.sessionManager = sessionManager;
        this.store = localInstalledStore;
        this.syncer = realLocalBrandSyncer;
        this.buyerIntentManager = buyerIntentManager;
        this.navigator = screenNavigator;
        this.screen = localMenuComboDetailsScreen;
        MenuItemAvailability.Available available = new MenuItemAvailability.Available(null, null);
        EmptyList emptyList = EmptyList.INSTANCE;
        this.loadingViewModel = new LocalMenuComboDetailsViewModel(null, "", available, null, emptyList, null, null, null, emptyList, emptyList, emptyList, LocalBottomModalViewModel.Loading, null);
    }

    public static final void access$performDefaultSelections(LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, LocationMenu locationMenu, ArrayList arrayList, List list, MutableState mutableState, MutableState mutableState2) {
        Object obj;
        String str;
        if (((Map) mutableState.getValue()).isEmpty()) {
            List list2 = list;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            for (Object obj2 : list2) {
                linkedHashMap.put(new ComboSlotToken(((CartEntry.ComboSlotSelection) obj2).comboSlotToken), obj2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ComboSlot comboSlot = (ComboSlot) it.next();
                String str2 = comboSlot.token;
                ComboSlotToken comboSlotToken = new ComboSlotToken(str2);
                RealBadger2$$ExternalSyntheticLambda0 realBadger2$$ExternalSyntheticLambda0 = new RealBadger2$$ExternalSyntheticLambda0(12, comboSlot, linkedHashMap);
                LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) mutableState.getValue());
                mutableMap.put(comboSlotToken, realBadger2$$ExternalSyntheticLambda0.invoke(mutableMap.get(comboSlotToken)));
                mutableState.setValue(mutableMap);
                if (((Map) ((Map) mutableState.getValue()).get(new ComboSlotToken(str2))) == null || !(!r6.isEmpty())) {
                    String str3 = comboSlot.defaultVariationToken;
                    if (str3 != null) {
                        Iterator it2 = locationMenu.menuItems.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            ArrayList arrayList2 = ((MenuItem) obj).variations;
                            if (!arrayList2.isEmpty()) {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    if (Intrinsics.areEqual(((MenuItemVariation) it3.next()).token, str3)) {
                                        break;
                                    }
                                }
                            }
                        }
                        MenuItem menuItem = (MenuItem) obj;
                        if (menuItem != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            int i = comboSlot.numberOfSelections;
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                str = comboSlot.token;
                                if (i3 >= i) {
                                    break;
                                }
                                int i4 = i3;
                                String str4 = menuItem.token;
                                TreeSet treeSet = new TreeSet();
                                ArraysKt___ArraysKt.toCollection(new CartEntry.ModifierSelection[i2], treeSet);
                                CartEntry.ModifierFreeEntry[] modifierFreeEntryArr = new CartEntry.ModifierFreeEntry[i2];
                                TreeSet treeSet2 = new TreeSet();
                                ArraysKt___ArraysKt.toCollection(modifierFreeEntryArr, treeSet2);
                                CartEntry.ComboSlotSelection comboSlotSelection = new CartEntry.ComboSlotSelection(str, str4, str3, treeSet, treeSet2);
                                linkedHashMap2.put(new LocalMenuComboDetailsViewModel.SectionIndex(i4), comboSlotSelection);
                                ComboTokenAndSectionIndex comboTokenAndSectionIndex = new ComboTokenAndSectionIndex(str2, i4);
                                LinkedHashMap mutableMap2 = MapsKt__MapsKt.toMutableMap((Map) mutableState2.getValue());
                                mutableMap2.put(comboTokenAndSectionIndex, isMissingCustomizations(comboSlotSelection, locationMenu) ? LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.CustomizationRequired : LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.Validated);
                                mutableState2.setValue(mutableMap2);
                                i3 = i4 + 1;
                                i2 = 0;
                            }
                            ComboSlotToken comboSlotToken2 = new ComboSlotToken(str);
                            LinkedHashMap mutableMap3 = MapsKt__MapsKt.toMutableMap((Map) mutableState.getValue());
                            mutableMap3.put(comboSlotToken2, linkedHashMap2);
                            mutableState.setValue(mutableMap3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public static CartEntry createCartEntry(MenuItem menuItem, State state) {
        ?? r3;
        Set entrySet;
        List sortedWith;
        String str = menuItem.token;
        String str2 = ((MenuItemVariation) CollectionsKt.single((List) menuItem.variations)).token;
        ArrayList arrayList = menuItem.comboSlots;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map) state.getValue()).get(new ComboSlotToken(((ComboSlot) it.next()).token));
            if (map == null || (entrySet = map.entrySet()) == null || (sortedWith = CollectionsKt.sortedWith(entrySet, new LocalMenuComboDetailsPresenter$createCartEntry$lambda$0$$inlined$sortedBy$1())) == null) {
                r3 = 0;
            } else {
                List list = sortedWith;
                r3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r3.add((CartEntry.ComboSlotSelection) ((Map.Entry) it2.next()).getValue());
                }
            }
            if (r3 == 0) {
                r3 = EmptyList.INSTANCE;
            }
            CollectionsKt__MutableCollectionsKt.addAll((Iterable) r3, arrayList2);
        }
        return new CartEntry(str, str2, (SortedSet) null, (SortedSet) null, arrayList2, (String) null, 108);
    }

    public static boolean isMissingCustomizations(CartEntry.ComboSlotSelection comboSlotSelection, LocationMenu locationMenu) {
        Object obj;
        Integer num;
        Object obj2;
        String str = comboSlotSelection.menuItemToken;
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(str);
        if (m1244menuItemOrNullGvMOdU0 != null) {
            if (m1244menuItemOrNullGvMOdU0.variations.size() <= 1 || comboSlotSelection.variationToken != null) {
                ArrayList m1248modifierListsForMenuItemGvMOdU0 = locationMenu.m1248modifierListsForMenuItemGvMOdU0(str);
                ArrayList arrayList = m1244menuItemOrNullGvMOdU0.modifierListConfigs;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList.iterator();
                while (true) {
                    MenuItemModifierListToken menuItemModifierListToken = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String str2 = ((ModifierListConfig) next).token;
                    if (str2 != null) {
                        menuItemModifierListToken = new MenuItemModifierListToken(str2);
                    }
                    linkedHashMap.put(menuItemModifierListToken, next);
                }
                Iterator it2 = m1248modifierListsForMenuItemGvMOdU0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    MenuItemModifierList menuItemModifierList = (MenuItemModifierList) it2.next();
                    String str3 = menuItemModifierList.token;
                    MenuItemModifierList.InputType inputType = menuItemModifierList.inputType;
                    if (!(inputType instanceof MenuItemModifierList.InputType.SelectFromList)) {
                        if (!(inputType instanceof MenuItemModifierList.InputType.FreeTextEntry)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                        if (((MenuItemModifierList.InputType.FreeTextEntry) inputType).requireNonEmptyString) {
                            Iterator it3 = comboSlotSelection.freeTextEntries.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it3.next();
                                if (Intrinsics.areEqual(((CartEntry.ModifierFreeEntry) obj2).listToken, str3)) {
                                    break;
                                }
                            }
                            CartEntry.ModifierFreeEntry modifierFreeEntry = (CartEntry.ModifierFreeEntry) obj2;
                            String str4 = modifierFreeEntry != null ? modifierFreeEntry.input : null;
                            if (str4 == null || str4.length() == 0) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        ModifierListConfig modifierListConfig = (ModifierListConfig) linkedHashMap.get(new MenuItemModifierListToken(str3));
                        if (modifierListConfig != null) {
                            Integer num2 = modifierListConfig.minSelections;
                            if ((num2 != null ? num2.intValue() : 0) > 0) {
                                Iterator it4 = comboSlotSelection.modifierSelections.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it4.next();
                                    if (Intrinsics.areEqual(((CartEntry.ModifierSelection) obj).listToken, str3)) {
                                        break;
                                    }
                                }
                                CartEntry.ModifierSelection modifierSelection = (CartEntry.ModifierSelection) obj;
                                if (((modifierSelection == null || (num = modifierSelection.quantity) == null) ? 0 : num.intValue()) == 0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String prettyPrintOrBlank$default(LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, LocalMoney localMoney) {
        if (localMoney.amount == 0) {
            return null;
        }
        return LocalsKt.prettyPrint$default(localMoney, false, "", 5);
    }

    public static void validateSelection(LocationMenu locationMenu, ComboTokenAndSectionIndex comboTokenAndSectionIndex, State state, MutableState mutableState) {
        String str = comboTokenAndSectionIndex.token;
        int i = comboTokenAndSectionIndex.sectionIndex;
        Map map = (Map) ((Map) state.getValue()).get(new ComboSlotToken(str));
        if (map == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) mutableState.getValue());
        CartEntry.ComboSlotSelection comboSlotSelection = (CartEntry.ComboSlotSelection) map.get(new LocalMenuComboDetailsViewModel.SectionIndex(i));
        mutableMap.put(comboTokenAndSectionIndex, (comboSlotSelection == null || isMissingCustomizations(comboSlotSelection, locationMenu)) ? LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.MissingSelection : LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.Validated);
        mutableState.setValue(mutableMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x051a, code lost:
    
        if (r5 == null) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BrandSpotSyncTokens brandSpotSyncTokens;
        CartBuilder cartBuilder;
        MenuItem menuItem;
        Object localMenuComboDetailsPresenter$models$4$1;
        ArrayList arrayList;
        LocationMenu locationMenu;
        Object swipeToDismissKt$$ExternalSyntheticLambda3;
        LocalMenuComboDetailsScreen localMenuComboDetailsScreen;
        MutableState mutableState;
        ArrayList arrayList2;
        LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter2;
        MenuItemAvailability available;
        LocalBottomModalViewModel.Title title;
        AndroidStringManager androidStringManager;
        String str;
        int i2;
        String str2;
        FormattedResource formattedResource;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1777116480);
        LocalMenuComboDetailsScreen localMenuComboDetailsScreen2 = this.screen;
        BrandSpot brandSpot = localMenuComboDetailsScreen2.brandSpot;
        BrandSpotSyncTokens brandSpotSyncTokens2 = localMenuComboDetailsScreen2.syncTokens;
        String str3 = localMenuComboDetailsScreen2.menuCategoryToken;
        String str4 = localMenuComboDetailsScreen2.itemToken;
        Object obj = localMenuComboDetailsScreen2.mode;
        MutableState rememberBrandSaveable = ClassFactory.rememberBrandSaveable(brandSpot, this.brandRepository, gapComposer);
        boolean changed = gapComposer.changed((LocalBrand) rememberBrandSaveable.getValue());
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (changed || rememberedValue == obj2) {
            rememberedValue = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(14, rememberBrandSaveable));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        State state = (State) rememberedValue;
        boolean changed2 = gapComposer.changed(brandSpot.brandToken);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == obj2) {
            rememberedValue2 = LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(this.store, brandSpot.brandToken);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) collectAsState.getValue();
        Continuation continuation = null;
        if (fulfillmentConfiguration != null) {
            LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
            brandSpotSyncTokens = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens2, schedulingDetails != null ? schedulingDetails.scheduling_day_time_token : null, 6);
        } else {
            brandSpotSyncTokens = brandSpotSyncTokens2;
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
        boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj2) {
            rememberedValue4 = new GenieNodeInclusionKt$$ExternalSyntheticLambda0(coroutineScope, this);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Function2 function2 = (Function2) rememberedValue4;
        ProvidableCompositionLocal providableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changed3 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue5 == obj2) {
            rememberedValue5 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 5);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, gapComposer);
        BrandSpotSyncTokens brandSpotSyncTokens3 = brandSpotSyncTokens;
        BrandSpot brandSpot2 = localMenuComboDetailsScreen2.brandSpot;
        String str5 = localMenuComboDetailsScreen2.attributionKey.value;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == obj2) {
            rememberedValue6 = new Worker$$ExternalSyntheticLambda0(this, 18);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        ClassFactory.SyncBrandSpotEffect(brandSpot2, brandSpotSyncTokens3, str5, this.syncer, this.navigator, null, (Function0) rememberedValue6, gapComposer, 0, 32);
        State rememberMenuState = JsonScope.rememberMenuState((LocalBrand) rememberBrandSaveable.getValue(), gapComposer);
        boolean z = ((MenuState) rememberMenuState.getValue()) instanceof MenuState.Loading;
        LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel = this.loadingViewModel;
        if (z) {
            gapComposer.end(false);
            return localMenuComboDetailsViewModel;
        }
        MenuState menuState = (MenuState) rememberMenuState.getValue();
        menuState.getClass();
        LocationMenu locationMenu2 = ((MenuState.Loaded) menuState).menu;
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu2.m1244menuItemOrNullGvMOdU0(str4);
        if (m1244menuItemOrNullGvMOdU0 == null) {
            gapComposer.end(false);
            return localMenuComboDetailsViewModel;
        }
        LocalMenuAvailability localMenuAvailability = m1244menuItemOrNullGvMOdU0.availability;
        ArrayList arrayList3 = m1244menuItemOrNullGvMOdU0.comboSlots;
        BuyerIntentState rememberBuyerIntentCartState = BuyerIntentCartScopesKt.rememberBuyerIntentCartState(this.buyerIntentManager, brandSpot, brandSpotSyncTokens2.inStoreOrderingToken, gapComposer);
        CartBuilderManager cartBuilderManager = this.cartManager;
        BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect(cartBuilderManager, rememberBuyerIntentCartState, locationMenu2, gapComposer, 64);
        CartBuilder rememberBuyerIntentCartBuilder = BuyerIntentCartScopesKt.rememberBuyerIntentCartBuilder(cartBuilderManager, rememberBuyerIntentCartState, brandSpot, gapComposer);
        boolean changed4 = gapComposer.changed(rememberBuyerIntentCartBuilder) | gapComposer.changed(obj);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue7 == obj2) {
            if (obj instanceof LocalMenuComboDetailsScreen.Mode.Add) {
                rememberedValue7 = null;
            } else {
                if (!(obj instanceof LocalMenuComboDetailsScreen.Mode.Edit)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                rememberedValue7 = (CartEntryWithQuantity) CollectionsKt.getOrNull(((LocalMenuComboDetailsScreen.Mode.Edit) obj).itemIndexInCart, ((RealCartBuilder) rememberBuyerIntentCartBuilder).selections);
            }
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) rememberedValue7;
        Object[] objArr = {brandSpot, new MenuItemToken(str4), ((RealCartBuilder) rememberBuyerIntentCartBuilder).checkoutFlowToken};
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changedInstance(rememberBuyerIntentCartBuilder) | gapComposer.changedInstance(m1244menuItemOrNullGvMOdU0);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue8 == obj2) {
            Object animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(this, rememberBuyerIntentCartBuilder, m1244menuItemOrNullGvMOdU0, continuation, 12);
            cartBuilder = rememberBuyerIntentCartBuilder;
            menuItem = m1244menuItemOrNullGvMOdU0;
            gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
            rememberedValue8 = animatedImageDecoder$wrapDrawable$2;
        } else {
            menuItem = m1244menuItemOrNullGvMOdU0;
            cartBuilder = rememberBuyerIntentCartBuilder;
        }
        zztc.LaunchedEffectSaveable(objArr, (Function2) rememberedValue8, gapComposer, 0);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj2) {
            rememberedValue9 = Boxes$$ExternalSyntheticOutline1.m(cartEntryWithQuantity != null ? cartEntryWithQuantity.getQuantity() : 1, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue9;
        Object[] objArr2 = new Object[0];
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj2) {
            rememberedValue10 = new AvatarViewModel$$ExternalSyntheticLambda0(19);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue10, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj2) {
            rememberedValue11 = new AvatarViewModel$$ExternalSyntheticLambda0(20);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue11, gapComposer, 48);
        boolean changedInstance4 = gapComposer.changedInstance(this) | gapComposer.changedInstance(locationMenu2) | gapComposer.changedInstance(arrayList3) | gapComposer.changed(mutableState2) | gapComposer.changed(mutableState3) | gapComposer.changedInstance(cartEntryWithQuantity);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue12 == obj2) {
            arrayList = arrayList3;
            locationMenu = locationMenu2;
            localMenuComboDetailsPresenter$models$4$1 = new LocalMenuComboDetailsPresenter$models$4$1(this, locationMenu, arrayList, mutableState2, mutableState3, cartEntryWithQuantity, null);
            gapComposer.updateRememberedValue(localMenuComboDetailsPresenter$models$4$1);
        } else {
            localMenuComboDetailsPresenter$models$4$1 = rememberedValue12;
            locationMenu = locationMenu2;
            arrayList = arrayList3;
        }
        Updater.LaunchedEffect(gapComposer, localMenuComboDetailsScreen2, (Function2) localMenuComboDetailsPresenter$models$4$1);
        boolean changedInstance5 = gapComposer.changedInstance(this) | gapComposer.changedInstance(locationMenu) | gapComposer.changedInstance(arrayList) | gapComposer.changedInstance(menuItem) | gapComposer.changed(mutableState2) | gapComposer.changed(mutableState3);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue13 == obj2) {
            localMenuComboDetailsScreen = localMenuComboDetailsScreen2;
            mutableState = mutableState3;
            swipeToDismissKt$$ExternalSyntheticLambda3 = new SwipeToDismissKt$$ExternalSyntheticLambda3(this, locationMenu, arrayList, menuItem, mutableState2, mutableState, 1);
            arrayList2 = arrayList;
            mutableState2 = mutableState2;
            gapComposer.updateRememberedValue(swipeToDismissKt$$ExternalSyntheticLambda3);
        } else {
            localMenuComboDetailsScreen = localMenuComboDetailsScreen2;
            swipeToDismissKt$$ExternalSyntheticLambda3 = rememberedValue13;
            arrayList2 = arrayList;
            mutableState = mutableState3;
        }
        Function2 function22 = (Function2) swipeToDismissKt$$ExternalSyntheticLambda3;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changed5 = gapComposer.changed(function22) | gapComposer.changedInstance(answerDispatcher2);
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue14 == obj2) {
            rememberedValue14 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 6);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue14, gapComposer);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == obj2) {
            rememberedValue15 = Updater.derivedStateOf(new LocalMenuItemDetailsPresenter$$ExternalSyntheticLambda3(cartEntryWithQuantity, locationMenu));
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        State state2 = (State) rememberedValue15;
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (rememberedValue16 == obj2) {
            localMenuComboDetailsPresenter = this;
            MutableState mutableState4 = mutableState2;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            LocationMenu locationMenu3 = locationMenu;
            l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(localMenuComboDetailsPresenter, menuItem, mutableState4, locationMenu3, parcelableSnapshotMutableIntState);
            locationMenu = locationMenu3;
            mutableState2 = mutableState4;
            rememberedValue16 = Updater.derivedStateOf(l2__externalsyntheticlambda7);
            gapComposer.updateRememberedValue(rememberedValue16);
        } else {
            localMenuComboDetailsPresenter = this;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
        }
        State state3 = (State) rememberedValue16;
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (rememberedValue17 == obj2) {
            rememberedValue17 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(10, localMenuComboDetailsPresenter, state3));
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        State state4 = (State) rememberedValue17;
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (rememberedValue18 == obj2) {
            rememberedValue18 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        MutableState mutableState5 = (MutableState) rememberedValue18;
        MutableState mutableState6 = mutableState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState;
        LocationMenu locationMenu4 = locationMenu;
        MenuItem menuItem2 = menuItem;
        LocalMenuComboDetailsScreen localMenuComboDetailsScreen3 = localMenuComboDetailsScreen;
        MutableState mutableState7 = mutableState2;
        PaymentConfigurationPresenter$models$28$8$1 paymentConfigurationPresenter$models$28$8$1 = new PaymentConfigurationPresenter$models$28$8$1(flow, (Continuation) null, localMenuComboDetailsPresenter, cartBuilder, locationMenu4, cartEntryWithQuantity, arrayList2, menuItem2, mutableState7, mutableState6, parcelableSnapshotMutableIntState3, state, collectAsState, state3, state2, mutableState5);
        ArrayList arrayList4 = arrayList2;
        Updater.LaunchedEffect(gapComposer, flow, paymentConfigurationPresenter$models$28$8$1);
        boolean changed6 = gapComposer.changed(locationMenu4) | gapComposer.changed(menuItem2) | gapComposer.changed(str3 != null ? new MenuCategoryToken(str3) : null);
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue19 == obj2) {
            MenuHours menuHours = menuItem2.menuHours;
            if (menuHours != null) {
                Object obj3 = (menuHours.isAvailableNow() || menuHours.nextAvailableFormatted != null) ? menuHours : null;
                if (obj3 != null) {
                    rememberedValue19 = obj3;
                    gapComposer.updateRememberedValue(rememberedValue19);
                }
            }
            rememberedValue19 = locationMenu4.m1242findMenuHours7xgaAFE(str3);
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        MenuHours menuHours2 = (MenuHours) rememberedValue19;
        boolean changed7 = gapComposer.changed(locationMenu4) | gapComposer.changed(menuItem2);
        Object rememberedValue20 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue20;
        if (changed7 || rememberedValue20 == obj2) {
            ArrayList arrayList5 = menuItem2.discountTokens;
            ArrayList arrayList6 = new ArrayList();
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                MenuDiscountSummary menuDiscountSummary = (MenuDiscountSummary) locationMenu4.discountSummaries.get(new DiscountToken(((DiscountToken) it.next()).value));
                if (menuDiscountSummary != null) {
                    arrayList6.add(menuDiscountSummary);
                }
            }
            gapComposer.updateRememberedValue(arrayList6);
            obj4 = arrayList6;
        }
        List list = (List) obj4;
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (rememberedValue21 == obj2) {
            localMenuComboDetailsPresenter2 = this;
            rememberedValue21 = Updater.derivedStateOf(new ta$$ExternalSyntheticLambda1(arrayList4, this, locationMenu4, mutableState7, mutableState6, 3));
            gapComposer.updateRememberedValue(rememberedValue21);
        } else {
            localMenuComboDetailsPresenter2 = this;
        }
        State state5 = (State) rememberedValue21;
        LocalImage localImage = menuItem2.image;
        String str6 = menuItem2.name;
        int ordinal = localMenuAvailability.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            title = null;
            available = new MenuItemAvailability.Available(LocalMenuItemsKt.priceRangeAsString(menuItem2, EmptyList.INSTANCE), null);
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            available = MenuItemAvailability.SoldOut.INSTANCE;
            title = null;
        }
        MenuItemAvailability menuItemAvailability = available;
        Integer num = menuItem2.totalCalories;
        MenuItemPreorderingSummary menuItemPreorderingSummary = menuItem2.preorderingSummary;
        String str7 = menuItem2.description;
        String str8 = (str7 == null || str7.length() <= 0) ? title : str7;
        List list2 = menuItem2.dietaryPreferences;
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            androidStringManager = localMenuComboDetailsPresenter2.stringManager;
            if (!hasNext) {
                break;
            }
            String asString = EntityStoreModule.asString((LocalDietaryPreference) it2.next(), androidStringManager);
            if (asString != null) {
                arrayList7.add(asString);
            }
        }
        List list3 = menuItem2.ingredients;
        ArrayList arrayList8 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            String asString2 = EntityStoreModule.asString((LocalIngredient) it3.next(), androidStringManager);
            if (asString2 != null) {
                arrayList8.add(asString2);
            }
        }
        List list4 = (List) state5.getValue();
        String str9 = (String) state4.getValue();
        int intValue = parcelableSnapshotMutableIntState3.getIntValue();
        boolean z2 = menuHours2 == null || menuHours2.isAvailableNow();
        if (z2) {
            str = str9;
        } else {
            String str10 = menuHours2.nextAvailableFormatted;
            if (str10 == null) {
                str10 = androidStringManager.get(R.string.local_presenters_item_not_available);
            }
            str = str9;
            title = new LocalBottomModalViewModel.Title(str10, androidStringManager.get(R.string.local_presenters_schedule_for_later), LocalBottomModalViewModel.Title.TitleTextStyle.Prominent, 2);
        }
        LocalBottomModalViewModel.Title title2 = title;
        LocalBottomModalViewModel.Payload.ItemCounter itemCounter = new LocalBottomModalViewModel.Payload.ItemCounter(new CartItemCounterViewModel(null, null, intValue, 1, Integer.valueOf(z2 ? menuItem2.maxOrderQuantity : 0), CartItemCounterViewModel.Mode.Dynamic.INSTANCE, localMenuComboDetailsScreen3.analyticsContext, 2));
        if (str != null) {
            if (obj instanceof LocalMenuComboDetailsScreen.Mode.Add) {
                formattedResource = new FormattedResource(R.string.local_presenters_variations_add_with_amount, new Object[]{str});
            } else {
                if (!(obj instanceof LocalMenuComboDetailsScreen.Mode.Edit)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                formattedResource = new FormattedResource(R.string.local_presenters_variations_save_with_amount, new Object[]{str});
            }
            str2 = Countries.getString(androidStringManager.resources, formattedResource);
        }
        if (obj instanceof LocalMenuComboDetailsScreen.Mode.Add) {
            i2 = R.string.local_presenters_variations_add;
        } else {
            if (!(obj instanceof LocalMenuComboDetailsScreen.Mode.Edit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i2 = R.string.local_presenters_variations_save;
        }
        str2 = androidStringManager.get(i2);
        LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel2 = new LocalMenuComboDetailsViewModel(localImage, str6, menuItemAvailability, num, list, menuItemPreorderingSummary, menuHours2, str8, arrayList7, arrayList8, list4, new LocalBottomModalViewModel(localMenuAvailability != LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_SOLD_OUT && z2, title2, itemCounter, str2, false, 16), (ToastData) mutableState5.getValue());
        gapComposer.end(false);
        return localMenuComboDetailsViewModel2;
    }

    /* renamed from: performSelection-r5FUkSU, reason: not valid java name */
    public final void m1214performSelectionr5FUkSU(LocationMenu locationMenu, ComboSlot comboSlot, int i, String str, String str2, String str3, SortedSet sortedSet, SortedSet sortedSet2, MutableState mutableState, MutableState mutableState2, boolean z) {
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(str2);
        if (m1244menuItemOrNullGvMOdU0 == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = m1244menuItemOrNullGvMOdU0.variations.size() > 1 && str3 == null;
        if (!m1244menuItemOrNullGvMOdU0.modifierListConfigs.isEmpty() && sortedSet.isEmpty() && sortedSet2.isEmpty()) {
            z2 = true;
        }
        if (!z && (z3 || z2)) {
            this.navigator.askQuestion(new MenuItemDetailsQuestion(), new LocalMenuComboDetailsPresenter$$ExternalSyntheticLambda11(this, str2, str, comboSlot, i, new LocalMenuItemDetailsScreen.Mode.Add(str3, EmptyList.INSTANCE)));
            return;
        }
        ComboSlotToken comboSlotToken = new ComboSlotToken(comboSlot.token);
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) mutableState.getValue());
        Map map = (Map) mutableMap.get(comboSlotToken);
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        linkedHashMap.put(new LocalMenuComboDetailsViewModel.SectionIndex(i), new CartEntry.ComboSlotSelection(comboSlot.token, str2, str3, sortedSet, sortedSet2));
        mutableMap.put(comboSlotToken, linkedHashMap);
        mutableState.setValue(mutableMap);
        validateSelection(locationMenu, new ComboTokenAndSectionIndex(comboSlot.token, i), mutableState, mutableState2);
    }
}

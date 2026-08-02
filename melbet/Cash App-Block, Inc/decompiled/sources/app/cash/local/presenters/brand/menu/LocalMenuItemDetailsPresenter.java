package app.cash.local.presenters.brand.menu;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.work.Worker$$ExternalSyntheticLambda0;
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
import app.cash.local.primitives.ComboSlotPriceAdjustment;
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
import app.cash.local.primitives.Modifier;
import app.cash.local.primitives.ModifierListConfig;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.tinygraph.EntityStoreModule;
import com.squareup.moshi.ClassFactory;
import com.squareup.moshi.JsonScope;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LocalMenuItemDetailsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealLocalBrandRepository brandRepository;
    public final BuyerIntentManager buyerIntentManager;
    public final CartBuilderManager cartManager;
    public final LocalMenuItemDetailsViewModel loadingViewModel;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LocalMenuItemDetailsScreen screen;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public final class TokenWithQuantity {
        public final int quantity;
        public final String token;

        public TokenWithQuantity(String str, int i) {
            str.getClass();
            this.token = str;
            this.quantity = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenWithQuantity)) {
                return false;
            }
            TokenWithQuantity tokenWithQuantity = (TokenWithQuantity) obj;
            return Intrinsics.areEqual(this.token, tokenWithQuantity.token) && this.quantity == tokenWithQuantity.quantity;
        }

        public final int hashCode() {
            return Integer.hashCode(this.quantity) + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m("TokenWithQuantity(token=", this.quantity, this.token, ", quantity=", ")");
        }
    }

    public LocalMenuItemDetailsPresenter(Analytics analytics, AndroidStringManager androidStringManager, CartBuilderManager cartBuilderManager, RealLocalBrandRepository realLocalBrandRepository, SessionManager sessionManager, LocalInstalledStore localInstalledStore, RealLocalBrandSyncer realLocalBrandSyncer, BuyerIntentManager buyerIntentManager, BetterNavigator.ScreenNavigator screenNavigator, LocalMenuItemDetailsScreen localMenuItemDetailsScreen) {
        localMenuItemDetailsScreen.getClass();
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.cartManager = cartBuilderManager;
        this.brandRepository = realLocalBrandRepository;
        this.sessionManager = sessionManager;
        this.store = localInstalledStore;
        this.syncer = realLocalBrandSyncer;
        this.buyerIntentManager = buyerIntentManager;
        this.navigator = screenNavigator;
        this.screen = localMenuItemDetailsScreen;
        MenuItemAvailability.Available available = new MenuItemAvailability.Available(null, null);
        EmptyList emptyList = EmptyList.INSTANCE;
        this.loadingViewModel = new LocalMenuItemDetailsViewModel(null, null, "", available, null, emptyList, null, null, null, emptyList, emptyList, emptyList, LocalBottomModalViewModel.Loading, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a8, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$performSelection(LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, List list, MenuItem menuItem, SnapshotStateMap snapshotStateMap, String str, Integer num, CartEntry cartEntry) {
        ModifierListConfig modifierListConfig;
        String str2;
        Integer num2;
        ?? r9;
        Integer num3;
        SortedSet sortedSet;
        Object obj;
        ArrayList arrayList = menuItem.variations;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MenuItemVariation) it.next()).token);
        }
        boolean contains = arrayList2.contains(str);
        boolean z = false;
        Object obj2 = null;
        if (contains) {
            modifierListConfig = new ModifierListConfig(null, 1, 1, false);
            str2 = "ユニーク";
        } else {
            ArrayList<ModifierListConfig> arrayList3 = menuItem.modifierListConfigs;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            for (ModifierListConfig modifierListConfig2 : arrayList3) {
                boolean z2 = z;
                Object obj3 = obj2;
                for (Object obj4 : list) {
                    String str3 = ((MenuItemModifierList) obj4).token;
                    String str4 = modifierListConfig2.token;
                    if (str4 == null ? false : Intrinsics.areEqual(str3, str4)) {
                        if (z2) {
                            a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                            return;
                        } else {
                            z2 = true;
                            obj3 = obj4;
                        }
                    }
                }
                if (!z2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    return;
                } else {
                    arrayList4.add(new Pair(modifierListConfig2, obj3));
                    z = false;
                    obj2 = null;
                }
            }
            Iterator it2 = arrayList4.iterator();
            Pair pair = null;
            boolean z3 = false;
            while (it2.hasNext()) {
                ?? next = it2.next();
                MenuItemModifierList.InputType inputType = ((MenuItemModifierList) ((Pair) next).second).inputType;
                MenuItemModifierList.InputType.SelectFromList selectFromList = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
                if (selectFromList != null) {
                    ArrayList arrayList5 = selectFromList.modifiers;
                    if (arrayList5.isEmpty()) {
                        continue;
                    } else {
                        Iterator it3 = arrayList5.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.areEqual(((Modifier) it3.next()).token, str)) {
                                if (z3) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                                    return;
                                } else {
                                    z3 = true;
                                    pair = next;
                                }
                            }
                        }
                    }
                }
            }
            if (!z3) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return;
            } else {
                Pair pair2 = pair;
                modifierListConfig = (ModifierListConfig) pair2.first;
                str2 = ((MenuItemModifierList) pair2.second).token;
            }
        }
        MenuItemModifierListToken menuItemModifierListToken = new MenuItemModifierListToken(str2);
        Object obj5 = snapshotStateMap.get(menuItemModifierListToken);
        if (obj5 == null) {
            obj5 = EmptySet.INSTANCE;
            snapshotStateMap.put(menuItemModifierListToken, obj5);
        }
        Set set = (Set) obj5;
        Set set2 = set;
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        Iterator it4 = set2.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((TokenWithQuantity) it4.next()).token);
        }
        Set set3 = CollectionsKt.toSet(arrayList6);
        if (num == null) {
            if (cartEntry != null && (sortedSet = cartEntry.modifierSelections) != null) {
                Iterator it5 = sortedSet.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj = it5.next();
                        if (Intrinsics.areEqual(((CartEntry.ModifierSelection) obj).selectionToken, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                CartEntry.ModifierSelection modifierSelection = (CartEntry.ModifierSelection) obj;
                if (modifierSelection != null) {
                    num2 = modifierSelection.quantity;
                }
            }
            num2 = null;
        } else {
            num2 = num;
        }
        TokenWithQuantity tokenWithQuantity = new TokenWithQuantity(str, num2 != null ? num2.intValue() : 1);
        Integer num4 = modifierListConfig.minSelections;
        if (num4 != null && num4.intValue() == 1 && (num3 = modifierListConfig.maxSelections) != null && num3.intValue() == 1) {
            if (set3.contains(str)) {
                return;
            }
            snapshotStateMap.put(new MenuItemModifierListToken(str2), SetsKt__SetsJVMKt.setOf(tokenWithQuantity));
            return;
        }
        if (!set3.contains(str)) {
            snapshotStateMap.put(new MenuItemModifierListToken(str2), SetsKt___SetsKt.plus(set, tokenWithQuantity));
            return;
        }
        MenuItemModifierListToken menuItemModifierListToken2 = new MenuItemModifierListToken(str2);
        Set set4 = (Set) snapshotStateMap.get(new MenuItemModifierListToken(str2));
        if (set4 != null) {
            r9 = new ArrayList();
            for (Object obj6 : set4) {
                if (!Intrinsics.areEqual(((TokenWithQuantity) obj6).token, str)) {
                    r9.add(obj6);
                }
            }
        } else {
            r9 = 0;
        }
        if (r9 == 0) {
            r9 = EmptyList.INSTANCE;
        }
        snapshotStateMap.put(menuItemModifierListToken2, CollectionsKt.toSet((Iterable) r9));
    }

    public static final Set access$updateQuantity(LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, Set set, String str, Function1 function1) {
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            if (Intrinsics.areEqual(((TokenWithQuantity) next).token, str)) {
                break;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList(set);
        if (i > -1) {
            TokenWithQuantity tokenWithQuantity = (TokenWithQuantity) arrayList.get(i);
            int intValue = ((Number) function1.invoke(Integer.valueOf(tokenWithQuantity.quantity))).intValue();
            String str2 = tokenWithQuantity.token;
            str2.getClass();
            arrayList.set(i, new TokenWithQuantity(str2, intValue));
        } else {
            arrayList.add(new TokenWithQuantity(str, ((Number) function1.invoke(null)).intValue()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.collections.EmptyList] */
    public static CartEntry createCartEntry(MenuItem menuItem, Map map, Map map2) {
        String str;
        ?? arrayList;
        String str2 = menuItem.token;
        ArrayList arrayList2 = menuItem.variations;
        if (arrayList2.size() == 1) {
            str = ((MenuItemVariation) arrayList2.get(0)).token;
        } else {
            Object obj = map.get(new MenuItemModifierListToken("ユニーク"));
            obj.getClass();
            str = ((TokenWithQuantity) CollectionsKt.single((Iterable) obj)).token;
            str.getClass();
        }
        String str3 = str;
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str4 = ((MenuItemModifierListToken) entry.getKey()).value;
            Set set = (Set) entry.getValue();
            if (Intrinsics.areEqual(str4, "ユニーク")) {
                arrayList = EmptyList.INSTANCE;
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : set) {
                    if (((TokenWithQuantity) obj2).quantity > 0) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    TokenWithQuantity tokenWithQuantity = (TokenWithQuantity) it.next();
                    String str5 = tokenWithQuantity.token;
                    int i = tokenWithQuantity.quantity;
                    str5.getClass();
                    arrayList.add(new CartEntry.ModifierSelection(Integer.valueOf(i), str4, str5));
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll((Iterable) arrayList, arrayList3);
        }
        SortedSet sortedSet = CollectionsKt___CollectionsJvmKt.toSortedSet(arrayList3);
        ArrayList arrayList5 = new ArrayList(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            arrayList5.add(new CartEntry.ModifierFreeEntry(((MenuItemModifierListToken) entry2.getKey()).value, ((FreeTextInput) entry2.getValue()).value));
        }
        return new CartEntry(str2, str3, sortedSet, CollectionsKt___CollectionsJvmKt.toSortedSet(arrayList5), (ArrayList) null, (String) null, 112);
    }

    public static String prettyPrintOrBlank$1(LocalMoney localMoney, String str) {
        if (localMoney.amount == 0) {
            return null;
        }
        return LocalsKt.prettyPrint$default(localMoney, false, str, 5);
    }

    /* renamed from: validateFreeTextEntries-N9MCIc4, reason: not valid java name */
    public static void m1215validateFreeTextEntriesN9MCIc4(List list, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            MenuItemModifierList menuItemModifierList = (MenuItemModifierList) it.next();
            MenuItemModifierList.InputType inputType = menuItemModifierList.inputType;
            String str3 = menuItemModifierList.token;
            if ((inputType instanceof MenuItemModifierList.InputType.FreeTextEntry) && (str == null || Intrinsics.areEqual(str3, str))) {
                MenuItemModifierListToken menuItemModifierListToken = new MenuItemModifierListToken(str3);
                MenuItemModifierList.InputType inputType2 = menuItemModifierList.inputType;
                inputType2.getClass();
                pair = new Pair(menuItemModifierListToken, (MenuItemModifierList.InputType.FreeTextEntry) inputType2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            String str4 = ((MenuItemModifierListToken) pair2.first).value;
            MenuItemModifierList.InputType.FreeTextEntry freeTextEntry = (MenuItemModifierList.InputType.FreeTextEntry) pair2.second;
            FreeTextInput freeTextInput = (FreeTextInput) snapshotStateMap.get(new MenuItemModifierListToken(str4));
            boolean z = freeTextEntry.requireNonEmptyString;
            int i = freeTextEntry.maxLength;
            if (z) {
                String str5 = freeTextInput != null ? freeTextInput.value : null;
                if (str5 == null || StringsKt.isBlank(str5)) {
                    snapshotStateMap2.put(new MenuItemModifierListToken(str4), Boolean.FALSE);
                }
            }
            if (((freeTextInput == null || (str2 = freeTextInput.value) == null) ? 0 : str2.length()) > i) {
                snapshotStateMap2.put(new MenuItemModifierListToken(str4), Boolean.FALSE);
                Object obj = snapshotStateMap.get(new MenuItemModifierListToken(str4));
                obj.getClass();
                ((FreeTextInput) obj).error = new InputError.TextTooLong(i);
            } else {
                snapshotStateMap2.put(new MenuItemModifierListToken(str4), Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void validateSelections(List list, MenuItem menuItem, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, String str) {
        boolean z;
        int i;
        Object obj;
        if (str != null) {
            ArrayList arrayList = menuItem.variations;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MenuItemVariation) it.next()).token);
            }
            if (arrayList2.contains(str)) {
                z = true;
                if (menuItem.variations.size() > 1 && (str == null || z)) {
                    MenuItemModifierListToken menuItemModifierListToken = new MenuItemModifierListToken("ユニーク");
                    Set set = (Set) snapshotStateMap.get(new MenuItemModifierListToken("ユニーク"));
                    snapshotStateMap2.put(menuItemModifierListToken, Boolean.valueOf(set == null && set.size() == 1));
                }
                if (z) {
                    String str2 = null;
                    if (str != null) {
                        Iterator it2 = list.iterator();
                        loop1: while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            MenuItemModifierList.InputType inputType = ((MenuItemModifierList) obj).inputType;
                            MenuItemModifierList.InputType.SelectFromList selectFromList = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
                            if (selectFromList != null) {
                                ArrayList arrayList3 = selectFromList.modifiers;
                                if (!arrayList3.isEmpty()) {
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        if (Intrinsics.areEqual(((Modifier) it3.next()).token, str)) {
                                            break loop1;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        MenuItemModifierList menuItemModifierList = (MenuItemModifierList) obj;
                        if (menuItemModifierList != null) {
                            str2 = menuItemModifierList.token;
                        }
                    }
                    for (ModifierListConfig modifierListConfig : menuItem.modifierListConfigs) {
                        Integer num = modifierListConfig.minSelections;
                        Integer num2 = modifierListConfig.maxSelections;
                        String str3 = modifierListConfig.token;
                        if (num != null && num2 != null) {
                            if (str2 != null) {
                                if (str3 == null ? false : str3.equals(str2)) {
                                }
                            }
                            Integer num3 = modifierListConfig.minSelections;
                            num3.getClass();
                            int intValue = num3.intValue();
                            IntRange intRange = new IntRange(intValue, num2.intValue(), 1);
                            str3.getClass();
                            MenuItemModifierListToken menuItemModifierListToken2 = new MenuItemModifierListToken(str3);
                            Set set2 = (Set) snapshotStateMap.get(new MenuItemModifierListToken(str3));
                            if (set2 != null) {
                                Iterator it4 = set2.iterator();
                                i = 0;
                                while (it4.hasNext()) {
                                    i += ((TokenWithQuantity) it4.next()).quantity;
                                }
                            } else {
                                i = 0;
                            }
                            snapshotStateMap2.put(menuItemModifierListToken2, Boolean.valueOf(intValue <= i && i <= intRange.last));
                        }
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (menuItem.variations.size() > 1) {
            MenuItemModifierListToken menuItemModifierListToken3 = new MenuItemModifierListToken("ユニーク");
            Set set3 = (Set) snapshotStateMap.get(new MenuItemModifierListToken("ユニーク"));
            snapshotStateMap2.put(menuItemModifierListToken3, Boolean.valueOf(set3 == null && set3.size() == 1));
        }
        if (z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x07fd, code lost:
    
        if ((r27 != null ? r27.size() : 0) < r36.intValue()) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a44, code lost:
    
        if (r1 == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0884, code lost:
    
        if (r1 == null) goto L348;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x070b  */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BrandSpotSyncTokens brandSpotSyncTokens;
        CartEntryWithQuantity cartEntryWithQuantity;
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen;
        LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData;
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen2;
        CartBuilder cartBuilder;
        LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData2;
        Object gLSceneScope$FrameRenderer$5$1$1$1$1;
        List list;
        LocationMenu locationMenu;
        String str;
        SnapshotStateMap snapshotStateMap;
        SnapshotStateMap snapshotStateMap2;
        CartEntryWithQuantity cartEntryWithQuantity2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen3;
        SnapshotStateMap snapshotStateMap3;
        LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter;
        List list2;
        LocalMenuAvailability localMenuAvailability;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        MenuItemAvailability.SoldOut soldOut;
        LocalMenuAvailability localMenuAvailability2;
        MenuItemAvailability menuItemAvailability;
        boolean z;
        String str2;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        LocalImage localImage;
        LocalBottomModalViewModel.Title title;
        int i2;
        String str3;
        FormattedResource formattedResource;
        SnapshotStateMap snapshotStateMap4;
        Map map;
        int i3;
        int i4;
        String str4;
        String str5;
        Set set;
        String str6;
        int i5;
        String str7;
        Iterator it;
        TokenWithQuantity tokenWithQuantity;
        MenuItemAvailability available;
        Integer num;
        String str8;
        boolean z3;
        TokenWithQuantity tokenWithQuantity2;
        String format2;
        int i6;
        boolean z4;
        Set set2;
        Iterator it2;
        MenuItemAvailability available2;
        Object obj;
        LocalMoney localMoney;
        String str9;
        boolean z5;
        LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter2 = this;
        flow.getClass();
        ?? r6 = (GapComposer) composer;
        r6.startReplaceGroup(-1695120437);
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen4 = localMenuItemDetailsPresenter2.screen;
        BrandSpot brandSpot = localMenuItemDetailsScreen4.brandSpot;
        String str10 = localMenuItemDetailsScreen4.menuCategoryToken;
        LocalMenuItemDetailsScreen.ComboData comboData = localMenuItemDetailsScreen4.comboData;
        BrandSpotSyncTokens brandSpotSyncTokens2 = localMenuItemDetailsScreen4.syncTokens;
        LocalMenuItemDetailsScreen.Mode mode = localMenuItemDetailsScreen4.mode;
        String str11 = localMenuItemDetailsScreen4.itemToken;
        MutableState rememberBrandSaveable = ClassFactory.rememberBrandSaveable(brandSpot, localMenuItemDetailsPresenter2.brandRepository, r6);
        BrandSpot brandSpot2 = localMenuItemDetailsScreen4.brandSpot;
        boolean changed = r6.changed(brandSpot2.brandToken);
        Object rememberedValue = r6.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (changed || rememberedValue == obj2) {
            rememberedValue = LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(localMenuItemDetailsPresenter2.store, brandSpot2.brandToken);
            r6.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, r6, 48, 2);
        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) collectAsState.getValue();
        if (fulfillmentConfiguration != null) {
            LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
            brandSpotSyncTokens = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens2, schedulingDetails != null ? schedulingDetails.scheduling_day_time_token : null, 6);
        } else {
            brandSpotSyncTokens = brandSpotSyncTokens2;
        }
        BrandSpot brandSpot3 = localMenuItemDetailsScreen4.brandSpot;
        String str12 = localMenuItemDetailsScreen4.attributionKey.value;
        boolean changedInstance = r6.changedInstance(localMenuItemDetailsPresenter2);
        Object rememberedValue2 = r6.rememberedValue();
        if (changedInstance || rememberedValue2 == obj2) {
            rememberedValue2 = new Worker$$ExternalSyntheticLambda0(localMenuItemDetailsPresenter2, 19);
            r6.updateRememberedValue(rememberedValue2);
        }
        ClassFactory.SyncBrandSpotEffect(brandSpot3, brandSpotSyncTokens, str12, localMenuItemDetailsPresenter2.syncer, localMenuItemDetailsPresenter2.navigator, null, (Function0) rememberedValue2, r6, 0, 32);
        Object rememberedValue3 = r6.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r6);
            r6.updateRememberedValue(rememberedValue3);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
        boolean changedInstance2 = r6.changedInstance(coroutineScope) | r6.changedInstance(localMenuItemDetailsPresenter2);
        Object rememberedValue4 = r6.rememberedValue();
        int i7 = 1;
        if (changedInstance2 || rememberedValue4 == obj2) {
            rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda9(i7, coroutineScope, localMenuItemDetailsPresenter2);
            r6.updateRememberedValue(rememberedValue4);
        }
        Function2 function2 = (Function2) rememberedValue4;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed2 = r6.changed(function2) | r6.changedInstance(answerDispatcher);
        Object rememberedValue5 = r6.rememberedValue();
        if (changed2 || rememberedValue5 == obj2) {
            rememberedValue5 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 7);
            r6.updateRememberedValue(rememberedValue5);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, (Composer) r6);
        boolean changed3 = r6.changed((LocalBrand) rememberBrandSaveable.getValue());
        Object rememberedValue6 = r6.rememberedValue();
        if (changed3 || rememberedValue6 == obj2) {
            rememberedValue6 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(15, rememberBrandSaveable));
            r6.updateRememberedValue(rememberedValue6);
        }
        State state = (State) rememberedValue6;
        State rememberMenuState = JsonScope.rememberMenuState((LocalBrand) rememberBrandSaveable.getValue(), r6);
        boolean z6 = ((MenuState) rememberMenuState.getValue()) instanceof MenuState.Loading;
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = localMenuItemDetailsPresenter2.loadingViewModel;
        if (z6) {
            r6.end(false);
            return localMenuItemDetailsViewModel;
        }
        MenuState menuState = (MenuState) rememberMenuState.getValue();
        menuState.getClass();
        LocationMenu locationMenu2 = ((MenuState.Loaded) menuState).menu;
        str11.getClass();
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu2.m1244menuItemOrNullGvMOdU0(str11);
        Pair pair = m1244menuItemOrNullGvMOdU0 == null ? null : new Pair(m1244menuItemOrNullGvMOdU0, locationMenu2.m1248modifierListsForMenuItemGvMOdU0(m1244menuItemOrNullGvMOdU0.token));
        if (pair == null) {
            r6.end(false);
            return localMenuItemDetailsViewModel;
        }
        MenuItem menuItem = (MenuItem) pair.first;
        List list3 = (List) pair.second;
        BuyerIntentState rememberBuyerIntentCartState = BuyerIntentCartScopesKt.rememberBuyerIntentCartState(localMenuItemDetailsPresenter2.buyerIntentManager, brandSpot2, brandSpotSyncTokens2.inStoreOrderingToken, r6);
        CartBuilderManager cartBuilderManager = localMenuItemDetailsPresenter2.cartManager;
        BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect(cartBuilderManager, rememberBuyerIntentCartState, locationMenu2, r6, 64);
        CartBuilder rememberBuyerIntentCartBuilder = BuyerIntentCartScopesKt.rememberBuyerIntentCartBuilder(cartBuilderManager, rememberBuyerIntentCartState, brandSpot2, r6);
        boolean changed4 = r6.changed(rememberBuyerIntentCartBuilder) | r6.changed(mode);
        Object rememberedValue7 = r6.rememberedValue();
        if (changed4 || rememberedValue7 == obj2) {
            if ((mode instanceof LocalMenuItemDetailsScreen.Mode.Add) || (mode instanceof LocalMenuItemDetailsScreen.Mode.Update)) {
                cartEntryWithQuantity = null;
            } else {
                if (!(mode instanceof LocalMenuItemDetailsScreen.Mode.EditFromCart)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                cartEntryWithQuantity = (CartEntryWithQuantity) CollectionsKt.getOrNull(((LocalMenuItemDetailsScreen.Mode.EditFromCart) mode).itemIndexInCart, ((RealCartBuilder) rememberBuyerIntentCartBuilder).selections);
            }
            r6.updateRememberedValue(cartEntryWithQuantity);
            rememberedValue7 = cartEntryWithQuantity;
        }
        CartEntryWithQuantity cartEntryWithQuantity3 = (CartEntryWithQuantity) rememberedValue7;
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = localMenuItemDetailsScreen4.analyticsContext;
        if (localClientCartMenuItemAddedContext != null) {
            localMenuItemDetailsScreen = localMenuItemDetailsScreen4;
            menuItemAddedContextComboData = localClientCartMenuItemAddedContext.comboData;
        } else {
            localMenuItemDetailsScreen = localMenuItemDetailsScreen4;
            menuItemAddedContextComboData = null;
        }
        Object[] objArr = {brandSpot2, new MenuItemToken(str11), ((RealCartBuilder) rememberBuyerIntentCartBuilder).checkoutFlowToken, menuItemAddedContextComboData};
        boolean changedInstance3 = r6.changedInstance(localMenuItemDetailsPresenter2) | r6.changedInstance(rememberBuyerIntentCartBuilder) | r6.changedInstance(menuItemAddedContextComboData) | r6.changedInstance(menuItem);
        Object rememberedValue8 = r6.rememberedValue();
        if (changedInstance3 || rememberedValue8 == obj2) {
            localMenuItemDetailsScreen2 = localMenuItemDetailsScreen;
            zzmh zzmhVar = new zzmh(localMenuItemDetailsPresenter2, rememberBuyerIntentCartBuilder, menuItemAddedContextComboData, menuItem, null, 4);
            cartBuilder = rememberBuyerIntentCartBuilder;
            menuItemAddedContextComboData2 = menuItemAddedContextComboData;
            localMenuItemDetailsPresenter2 = localMenuItemDetailsPresenter2;
            r6.updateRememberedValue(zzmhVar);
            rememberedValue8 = zzmhVar;
        } else {
            cartBuilder = rememberBuyerIntentCartBuilder;
            localMenuItemDetailsScreen2 = localMenuItemDetailsScreen;
            menuItemAddedContextComboData2 = menuItemAddedContextComboData;
        }
        zztc.LaunchedEffectSaveable(objArr, (Function2) rememberedValue8, r6, 0);
        Object rememberedValue9 = r6.rememberedValue();
        if (rememberedValue9 == obj2) {
            rememberedValue9 = Boxes$$ExternalSyntheticOutline1.m(cartEntryWithQuantity3 != null ? cartEntryWithQuantity3.getQuantity() : 1, (GapComposer) r6);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue9;
        Object rememberedValue10 = r6.rememberedValue();
        if (rememberedValue10 == obj2) {
            rememberedValue10 = new SnapshotStateMap();
            r6.updateRememberedValue(rememberedValue10);
        }
        SnapshotStateMap snapshotStateMap5 = (SnapshotStateMap) rememberedValue10;
        Object rememberedValue11 = r6.rememberedValue();
        Object obj3 = rememberedValue11;
        if (rememberedValue11 == obj2) {
            SnapshotStateMap snapshotStateMap6 = new SnapshotStateMap();
            if (menuItem.variations.size() == 1) {
                snapshotStateMap6.put(new MenuItemModifierListToken("ユニーク"), SetsKt__SetsJVMKt.setOf(new TokenWithQuantity(((MenuItemVariation) CollectionsKt.single((List) menuItem.variations)).token, 1)));
            }
            r6.updateRememberedValue(snapshotStateMap6);
            obj3 = snapshotStateMap6;
        }
        SnapshotStateMap snapshotStateMap7 = (SnapshotStateMap) obj3;
        Object rememberedValue12 = r6.rememberedValue();
        if (rememberedValue12 == obj2) {
            rememberedValue12 = new SnapshotStateMap();
            r6.updateRememberedValue(rememberedValue12);
        }
        SnapshotStateMap snapshotStateMap8 = (SnapshotStateMap) rememberedValue12;
        boolean changedInstance4 = r6.changedInstance(list3) | r6.changedInstance(localMenuItemDetailsPresenter2) | r6.changedInstance(cartEntryWithQuantity3) | r6.changedInstance(menuItem);
        Object rememberedValue13 = r6.rememberedValue();
        if (changedInstance4 || rememberedValue13 == obj2) {
            list = list3;
            locationMenu = locationMenu2;
            str = "ユニーク";
            gLSceneScope$FrameRenderer$5$1$1$1$1 = new GLSceneScope$FrameRenderer$5$1$1$1$1(list, localMenuItemDetailsPresenter2, cartEntryWithQuantity3, menuItem, snapshotStateMap7, snapshotStateMap5, snapshotStateMap8, null);
            snapshotStateMap = snapshotStateMap5;
            snapshotStateMap2 = snapshotStateMap8;
            cartEntryWithQuantity2 = cartEntryWithQuantity3;
            r6.updateRememberedValue(gLSceneScope$FrameRenderer$5$1$1$1$1);
        } else {
            snapshotStateMap2 = snapshotStateMap8;
            gLSceneScope$FrameRenderer$5$1$1$1$1 = rememberedValue13;
            locationMenu = locationMenu2;
            cartEntryWithQuantity2 = cartEntryWithQuantity3;
            str = "ユニーク";
            list = list3;
            snapshotStateMap = snapshotStateMap5;
        }
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen5 = localMenuItemDetailsScreen2;
        Updater.LaunchedEffect((Composer) r6, localMenuItemDetailsScreen5, (Function2) gLSceneScope$FrameRenderer$5$1$1$1$1);
        Object rememberedValue14 = r6.rememberedValue();
        if (rememberedValue14 == obj2) {
            rememberedValue14 = Updater.derivedStateOf(new LocalMenuItemDetailsPresenter$$ExternalSyntheticLambda3(locationMenu, cartEntryWithQuantity2));
            r6.updateRememberedValue(rememberedValue14);
        }
        State state2 = (State) rememberedValue14;
        Object rememberedValue15 = r6.rememberedValue();
        if (rememberedValue15 == obj2) {
            List list4 = list;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
            localMenuItemDetailsScreen3 = localMenuItemDetailsScreen5;
            SnapshotStateMap snapshotStateMap9 = snapshotStateMap2;
            localMenuItemDetailsPresenter = this;
            ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(snapshotStateMap7, localMenuItemDetailsPresenter, menuItem, snapshotStateMap9, list4, parcelableSnapshotMutableIntState);
            snapshotStateMap7 = snapshotStateMap7;
            list = list4;
            menuItem = menuItem;
            snapshotStateMap3 = snapshotStateMap9;
            rememberedValue15 = Updater.derivedStateOf(ta__externalsyntheticlambda1);
            r6.updateRememberedValue(rememberedValue15);
        } else {
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
            localMenuItemDetailsScreen3 = localMenuItemDetailsScreen5;
            snapshotStateMap3 = snapshotStateMap2;
            localMenuItemDetailsPresenter = this;
        }
        State state3 = (State) rememberedValue15;
        Object rememberedValue16 = r6.rememberedValue();
        if (rememberedValue16 == obj2) {
            rememberedValue16 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(localMenuItemDetailsPresenter, state3));
            r6.updateRememberedValue(rememberedValue16);
        }
        State state4 = (State) rememberedValue16;
        Object rememberedValue17 = r6.rememberedValue();
        if (rememberedValue17 == obj2) {
            rememberedValue17 = Updater.mutableStateOf$default(null);
            r6.updateRememberedValue(rememberedValue17);
        }
        MutableState mutableState = (MutableState) rememberedValue17;
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen6 = localMenuItemDetailsScreen3;
        String str13 = str;
        LocalMenuItemDetailsScreen.ComboData comboData2 = comboData;
        SnapshotStateMap snapshotStateMap10 = snapshotStateMap3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState;
        LocationMenu locationMenu3 = locationMenu;
        SnapshotStateMap snapshotStateMap11 = snapshotStateMap7;
        MenuItem menuItem2 = menuItem;
        List list5 = list;
        FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 fidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 = new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, this, list5, menuItem2, snapshotStateMap11, cartEntryWithQuantity2, snapshotStateMap, snapshotStateMap10, cartBuilder, locationMenu3, menuItemAddedContextComboData2, parcelableSnapshotMutableIntState4, state, collectAsState, state3, state2, mutableState);
        SnapshotStateMap snapshotStateMap12 = snapshotStateMap10;
        Map map2 = snapshotStateMap11;
        Updater.LaunchedEffect((Composer) r6, flow, fidesmoProvisioningPresenter$models$$inlined$CollectEffect$1);
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        ArrayList arrayList3 = menuItem2.variations;
        LocalMenuAvailability localMenuAvailability3 = menuItem2.availability;
        int size = arrayList3.size();
        LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Radio radio = LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Radio.INSTANCE;
        String str14 = "";
        MenuItemAvailability.SoldOut soldOut2 = MenuItemAvailability.SoldOut.INSTANCE;
        AndroidStringManager androidStringManager = this.stringManager;
        if (size > 1) {
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((MenuItemVariation) it3.next()).price);
            }
            boolean z7 = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList4)).size() > 1;
            Set set3 = (Set) map2.get(new MenuItemModifierListToken(str13));
            if (set3 != null) {
                Set set4 = set3;
                z4 = z7;
                localMenuAvailability = localMenuAvailability3;
                soldOut = soldOut2;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10));
                Iterator it4 = set4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((TokenWithQuantity) it4.next()).token);
                }
                set2 = CollectionsKt.toSet(arrayList5);
            } else {
                localMenuAvailability = localMenuAvailability3;
                z4 = z7;
                soldOut = soldOut2;
                set2 = null;
            }
            String str15 = androidStringManager.get(R.string.local_presenters_variations_title);
            Resources resources = androidStringManager.resources;
            resources.getClass();
            list2 = list5;
            String format3 = new MessageFormat(resources.getString(R.string.local_presenters_variations_exactly)).format(new Object[]{1});
            format3.getClass();
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                MenuItemVariation menuItemVariation = (MenuItemVariation) it5.next();
                int ordinal = menuItemVariation.availability.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    LocalMenuItemDetailsScreen.ComboData comboData3 = comboData2;
                    if (comboData3 != null) {
                        Iterator it6 = comboData3.priceAdjustments.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                it2 = it5;
                                obj = null;
                                break;
                            }
                            obj = it6.next();
                            it2 = it5;
                            Iterator it7 = it6;
                            if (Intrinsics.areEqual(((ComboSlotPriceAdjustment) obj).variationToken, menuItemVariation.token)) {
                                break;
                            }
                            it5 = it2;
                            it6 = it7;
                        }
                        ComboSlotPriceAdjustment comboSlotPriceAdjustment = (ComboSlotPriceAdjustment) obj;
                        comboData2 = comboData3;
                        available2 = new MenuItemAvailability.Available((comboSlotPriceAdjustment == null || (localMoney = comboSlotPriceAdjustment.priceAdjustment) == null) ? null : prettyPrintOrBlank$1(localMoney, ""), null);
                    } else {
                        it2 = it5;
                        comboData2 = comboData3;
                        available2 = new MenuItemAvailability.Available(z4 ? prettyPrintOrBlank$1(menuItemVariation.price, "") : null, null);
                    }
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    it2 = it5;
                    available2 = soldOut;
                }
                String str16 = menuItemVariation.token;
                String str17 = menuItemVariation.name;
                if (set2 != null) {
                    str9 = str16;
                    if (set2.contains(str16)) {
                        z5 = true;
                        arrayList6.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option(str17, str9, available2, z5, radio, !(available2 instanceof MenuItemAvailability.SoldOut)));
                        it5 = it2;
                    }
                } else {
                    str9 = str16;
                }
                z5 = false;
                arrayList6.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option(str17, str9, available2, z5, radio, !(available2 instanceof MenuItemAvailability.SoldOut)));
                it5 = it2;
            }
            createListBuilder.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList("ユニーク", str15, format3, arrayList6, true, Intrinsics.areEqual(snapshotStateMap.get(new MenuItemModifierListToken(str13)), Boolean.FALSE)));
        } else {
            list2 = list5;
            localMenuAvailability = localMenuAvailability3;
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
            soldOut = soldOut2;
        }
        Iterator it8 = menuItem2.modifierListConfigs.iterator();
        while (it8.hasNext()) {
            ModifierListConfig modifierListConfig = (ModifierListConfig) it8.next();
            MenuItemModifierList menuItemModifierList = null;
            boolean z8 = false;
            for (?? r13 : list2) {
                String str18 = ((MenuItemModifierList) r13).token;
                Iterator it9 = it8;
                String str19 = modifierListConfig.token;
                if (!(str19 == null ? false : Intrinsics.areEqual(str18, str19))) {
                    it8 = it9;
                } else {
                    if (z8) {
                        a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                        return null;
                    }
                    menuItemModifierList = r13;
                    it8 = it9;
                    z8 = true;
                }
            }
            Iterator it10 = it8;
            if (!z8) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return null;
            }
            MenuItemModifierList menuItemModifierList2 = menuItemModifierList;
            MenuItemModifierList.InputType inputType = menuItemModifierList2.inputType;
            String str20 = menuItemModifierList2.token;
            if (inputType instanceof MenuItemModifierList.InputType.FreeTextEntry) {
                FreeTextInput freeTextInput = (FreeTextInput) snapshotStateMap12.get(new MenuItemModifierListToken(str20));
                String str21 = menuItemModifierList2.token;
                String str22 = menuItemModifierList2.name;
                MenuItemModifierList.InputType.FreeTextEntry freeTextEntry = (MenuItemModifierList.InputType.FreeTextEntry) inputType;
                int i8 = freeTextEntry.maxLength;
                boolean z9 = freeTextEntry.requireNonEmptyString;
                boolean areEqual = Intrinsics.areEqual(snapshotStateMap.get(new MenuItemModifierListToken(str21)), Boolean.FALSE);
                InputError.TextTooLong textTooLong = freeTextInput != null ? freeTextInput.error : null;
                String str23 = freeTextInput != null ? freeTextInput.value : null;
                createListBuilder.add(new LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry(str21, str22, i8, textTooLong, z9, areEqual, str23 == null ? str14 : str23));
            } else {
                if (!(inputType instanceof MenuItemModifierList.InputType.SelectFromList)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ArrayList arrayList7 = ((MenuItemModifierList.InputType.SelectFromList) inputType).modifiers;
                if (!arrayList7.isEmpty()) {
                    String str24 = modifierListConfig.token;
                    boolean z10 = modifierListConfig.allowQuantities;
                    Integer num2 = modifierListConfig.minSelections;
                    snapshotStateMap4 = snapshotStateMap12;
                    Integer num3 = modifierListConfig.maxSelections;
                    Set set5 = (Set) map2.get(str24 != null ? new MenuItemModifierListToken(str24) : null);
                    if (z10) {
                        int intValue = num3 != null ? num3.intValue() : 0;
                        if (set5 != null) {
                            Iterator it11 = set5.iterator();
                            i6 = 0;
                            while (it11.hasNext()) {
                                i6 += ((TokenWithQuantity) it11.next()).quantity;
                                map2 = map2;
                            }
                        } else {
                            i6 = 0;
                        }
                        map = map2;
                        i3 = intValue - i6;
                    } else {
                        map = map2;
                        i3 = 0;
                    }
                    String str25 = modifierListConfig.token;
                    str25.getClass();
                    String str26 = menuItemModifierList2.name;
                    Resources resources2 = androidStringManager.resources;
                    if (num2 == null || num3 == null) {
                        i4 = i3;
                        str4 = str25;
                        str5 = str26;
                        set = set5;
                        str6 = str14;
                        i5 = 0;
                    } else {
                        i4 = i3;
                        str4 = str25;
                        str5 = str26;
                        set = set5;
                        IntRange intRange = new IntRange(num2.intValue(), num3.intValue(), 1);
                        str6 = str14;
                        i5 = 0;
                        if (!intRange.equals(new IntRange(0, arrayList7.size(), 1))) {
                            if (intRange.equals(new IntRange(0, 1, 1)) || num2.equals(num3)) {
                                resources2.getClass();
                                String format4 = new MessageFormat(resources2.getString(R.string.local_presenters_variations_exactly)).format(new Object[]{num2});
                                format4.getClass();
                                str7 = format4;
                            } else {
                                if (num2.intValue() == 0) {
                                    resources2.getClass();
                                    format2 = new MessageFormat(resources2.getString(R.string.local_presenters_variations_upper)).format(new Object[]{num3});
                                    format2.getClass();
                                } else if (num3.intValue() == arrayList7.size()) {
                                    resources2.getClass();
                                    format2 = new MessageFormat(resources2.getString(R.string.local_presenters_variations_lower)).format(new Object[]{num2});
                                    format2.getClass();
                                } else {
                                    resources2.getClass();
                                    format2 = new MessageFormat(resources2.getString(R.string.local_presenters_variations_range)).format(new Object[]{num2, num3});
                                    format2.getClass();
                                }
                                str7 = format2;
                            }
                            ?? r45 = (num2 == null ? num2.intValue() : i5) <= 0 ? 1 : i5;
                            boolean areEqual2 = Intrinsics.areEqual(snapshotStateMap.get(new MenuItemModifierListToken(str20)), Boolean.FALSE);
                            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                            it = arrayList7.iterator();
                            while (it.hasNext()) {
                                Modifier modifier = (Modifier) it.next();
                                int i9 = (num2 != null && num2.intValue() == 1 && num3 != null && num3.intValue() == 1) ? 1 : i5;
                                int i10 = (i9 == 0 && z10) ? 1 : i5;
                                if (set != null) {
                                    Iterator it12 = set.iterator();
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            tokenWithQuantity2 = 0;
                                            break;
                                        }
                                        tokenWithQuantity2 = it12.next();
                                        if (Intrinsics.areEqual(((TokenWithQuantity) tokenWithQuantity2).token, modifier.token)) {
                                            break;
                                        }
                                    }
                                    tokenWithQuantity = tokenWithQuantity2;
                                } else {
                                    tokenWithQuantity = null;
                                }
                                int i11 = tokenWithQuantity != null ? tokenWithQuantity.quantity : i10 != 0 ? i5 : 1;
                                int ordinal2 = modifier.availability.ordinal();
                                Iterator it13 = it;
                                if (ordinal2 == 0 || ordinal2 == 1) {
                                    LocalMoney localMoney2 = modifier.price;
                                    if (localMoney2 != null) {
                                        num = num3;
                                        str8 = prettyPrintOrBlank$1(LocalMoneysKt.times(localMoney2, i11), "+ ");
                                    } else {
                                        num = num3;
                                        str8 = null;
                                    }
                                    available = new MenuItemAvailability.Available(str8, null);
                                } else {
                                    if (ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    num = num3;
                                    available = soldOut;
                                }
                                LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.CheckBox checkBox = LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.CheckBox.INSTANCE;
                                LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type quantity = i9 != 0 ? radio : i10 != 0 ? new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Quantity(i11, i4 + i11) : checkBox;
                                if (!(available instanceof MenuItemAvailability.SoldOut)) {
                                    if (tokenWithQuantity == null && quantity.equals(checkBox) && num != null) {
                                    }
                                    z3 = true;
                                    arrayList8.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option(modifier.name, modifier.token, available, tokenWithQuantity == null, quantity, z3));
                                    it = it13;
                                    num3 = num;
                                    i5 = 0;
                                }
                                z3 = false;
                                arrayList8.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option(modifier.name, modifier.token, available, tokenWithQuantity == null, quantity, z3));
                                it = it13;
                                num3 = num;
                                i5 = 0;
                            }
                            createListBuilder.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList(str4, str5, str7, arrayList8, r45, areEqual2));
                            it8 = it10;
                            snapshotStateMap12 = snapshotStateMap4;
                            str14 = str6;
                            map2 = map;
                        }
                    }
                    str7 = null;
                    if ((num2 == null ? num2.intValue() : i5) <= 0) {
                    }
                    boolean areEqual22 = Intrinsics.areEqual(snapshotStateMap.get(new MenuItemModifierListToken(str20)), Boolean.FALSE);
                    ArrayList arrayList82 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                    it = arrayList7.iterator();
                    while (it.hasNext()) {
                    }
                    createListBuilder.add(new LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList(str4, str5, str7, arrayList82, r45, areEqual22));
                    it8 = it10;
                    snapshotStateMap12 = snapshotStateMap4;
                    str14 = str6;
                    map2 = map;
                }
            }
            map = map2;
            snapshotStateMap4 = snapshotStateMap12;
            str6 = str14;
            it8 = it10;
            snapshotStateMap12 = snapshotStateMap4;
            str14 = str6;
            map2 = map;
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        boolean changed5 = r6.changed(locationMenu3) | r6.changed(menuItem2) | r6.changed(str10 != null ? new MenuCategoryToken(str10) : null);
        Object rememberedValue18 = r6.rememberedValue();
        if (changed5 || rememberedValue18 == obj2) {
            MenuHours menuHours = menuItem2.menuHours;
            if (menuHours != null) {
                if (!menuHours.isAvailableNow() && menuHours.nextAvailableFormatted == null) {
                    menuHours = null;
                }
            }
            menuHours = locationMenu3.m1242findMenuHours7xgaAFE(str10);
            rememberedValue18 = menuHours;
            r6.updateRememberedValue(rememberedValue18);
        }
        MenuHours menuHours2 = (MenuHours) rememberedValue18;
        boolean changed6 = r6.changed(locationMenu3) | r6.changed(menuItem2);
        Object rememberedValue19 = r6.rememberedValue();
        Object obj4 = rememberedValue19;
        if (changed6 || rememberedValue19 == obj2) {
            ArrayList arrayList9 = menuItem2.discountTokens;
            ArrayList arrayList10 = new ArrayList();
            Iterator it14 = arrayList9.iterator();
            while (it14.hasNext()) {
                MenuDiscountSummary menuDiscountSummary = (MenuDiscountSummary) locationMenu3.discountSummaries.get(new DiscountToken(((DiscountToken) it14.next()).value));
                if (menuDiscountSummary != null) {
                    arrayList10.add(menuDiscountSummary);
                }
            }
            r6.updateRememberedValue(arrayList10);
            obj4 = arrayList10;
        }
        List list6 = (List) obj4;
        boolean z11 = comboData2 != null;
        LocalImage localImage2 = menuItem2.image;
        String str27 = comboData2 != null ? comboData2.comboName : null;
        boolean z12 = z11;
        String str28 = menuItem2.name;
        if (z12) {
            localMenuAvailability2 = localMenuAvailability;
            menuItemAvailability = null;
            z = true;
        } else {
            int ordinal3 = localMenuAvailability.ordinal();
            if (ordinal3 == 0) {
                Path$$ExternalSyntheticBUOutline0.m$1(localMenuAvailability, "Unexpected availability ");
                return null;
            }
            if (ordinal3 == 1) {
                z = true;
                menuItemAvailability = new MenuItemAvailability.Available(LocalMenuItemsKt.priceRangeAsString(menuItem2, list2), null);
            } else {
                if (ordinal3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                z = true;
                menuItemAvailability = soldOut;
            }
            localMenuAvailability2 = localMenuAvailability;
        }
        String str29 = menuItem2.description;
        String str30 = (str29 == null || str29.length() <= 0) ? null : str29;
        Integer num4 = menuItem2.totalCalories;
        if (z12) {
            list6 = EmptyList.INSTANCE;
        }
        List list7 = list6;
        MenuItemPreorderingSummary menuItemPreorderingSummary = menuItem2.preorderingSummary;
        List list8 = menuItem2.dietaryPreferences;
        ArrayList arrayList11 = new ArrayList();
        Iterator it15 = list8.iterator();
        while (it15.hasNext()) {
            ListBuilder listBuilder = build;
            String asString = EntityStoreModule.asString((LocalDietaryPreference) it15.next(), androidStringManager);
            if (asString != null) {
                arrayList11.add(asString);
            }
            build = listBuilder;
        }
        ListBuilder listBuilder2 = build;
        List list9 = menuItem2.ingredients;
        ArrayList arrayList12 = new ArrayList();
        Iterator it16 = list9.iterator();
        while (it16.hasNext()) {
            Iterator it17 = it16;
            String asString2 = EntityStoreModule.asString((LocalIngredient) it16.next(), androidStringManager);
            if (asString2 != null) {
                arrayList12.add(asString2);
            }
            it16 = it17;
        }
        String str31 = (String) state4.getValue();
        if (z12) {
            str31 = null;
        }
        int intValue2 = parcelableSnapshotMutableIntState2.getIntValue();
        boolean z13 = (menuHours2 == null || menuHours2.isAvailableNow()) ? z : false;
        if (z13) {
            str2 = str31;
            z2 = z13;
            arrayList = arrayList12;
            arrayList2 = arrayList11;
            localImage = localImage2;
            title = null;
        } else {
            str2 = str31;
            z2 = z13;
            String str32 = menuHours2.nextAvailableFormatted;
            if (str32 == null) {
                str32 = androidStringManager.get(R.string.local_presenters_item_not_available);
            }
            arrayList = arrayList12;
            arrayList2 = arrayList11;
            localImage = localImage2;
            title = new LocalBottomModalViewModel.Title(str32, androidStringManager.get(R.string.local_presenters_schedule_for_later), LocalBottomModalViewModel.Title.TitleTextStyle.Prominent, 2);
        }
        boolean z14 = localMenuItemDetailsScreen6.showQuantityStepper;
        LocalMenuItemDetailsScreen.Mode mode2 = localMenuItemDetailsScreen6.mode;
        LocalBottomModalViewModel.Payload itemCounter = z14 ? new LocalBottomModalViewModel.Payload.ItemCounter(new CartItemCounterViewModel(null, null, intValue2, 1, Integer.valueOf(z2 ? menuItem2.maxOrderQuantity : 0), CartItemCounterViewModel.Mode.Dynamic.INSTANCE, localMenuItemDetailsScreen6.analyticsContext, 2)) : LocalBottomModalViewModel.Payload.NoPayload.INSTANCE;
        if (str2 != null) {
            if (mode2 instanceof LocalMenuItemDetailsScreen.Mode.Add) {
                formattedResource = new FormattedResource(R.string.local_presenters_variations_add_with_amount, new Object[]{str2});
            } else {
                if (!(mode2 instanceof LocalMenuItemDetailsScreen.Mode.Update) && !(mode2 instanceof LocalMenuItemDetailsScreen.Mode.EditFromCart)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                formattedResource = new FormattedResource(R.string.local_presenters_variations_save_with_amount, new Object[]{str2});
            }
            str3 = Countries.getString(androidStringManager.resources, formattedResource);
        }
        if (mode2 instanceof LocalMenuItemDetailsScreen.Mode.Add) {
            i2 = R.string.local_presenters_variations_add;
        } else {
            if (!(mode2 instanceof LocalMenuItemDetailsScreen.Mode.Update) && !(mode2 instanceof LocalMenuItemDetailsScreen.Mode.EditFromCart)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i2 = R.string.local_presenters_variations_save;
        }
        str3 = androidStringManager.get(i2);
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel2 = new LocalMenuItemDetailsViewModel(localImage, str27, str28, menuItemAvailability, num4, list7, menuItemPreorderingSummary, menuHours2, str30, arrayList2, arrayList, listBuilder2, new LocalBottomModalViewModel((localMenuAvailability2 == LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_SOLD_OUT || !z2) ? false : z, title, itemCounter, str3, false, 16), (ToastData) mutableState.getValue());
        r6.end(false);
        return localMenuItemDetailsViewModel2;
    }
}

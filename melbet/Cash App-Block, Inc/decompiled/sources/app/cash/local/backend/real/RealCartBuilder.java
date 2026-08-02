package app.cash.local.backend.real;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.CartEntryWithQuantityKt;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.localclient.LocalClientCartMenuItemAdded;
import com.squareup.cash.cdf.localclient.ReorderableSelectionSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealCartBuilder implements CartBuilder {
    public final Analytics analytics;
    public final BrandSpot brandSpot;
    public final SnapshotStateList buyerIntentErrorsState;
    public String checkoutFlowToken;
    public final SnapshotStateList discountCodes;
    public final ParcelableSnapshotMutableState includesPreorderItemsState;
    public LocationMenu lastKnownMenu;
    public final ParcelableSnapshotMutableState openTabCartOverrideState;
    public final SnapshotStateList selections;
    public final ParcelableSnapshotMutableState serverSubtotalBeforeDiscountsState;
    public final ParcelableSnapshotMutableState serverSubtotalState;
    public final SessionManager sessionManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.values().length];
            try {
                LocalClientCartMenuItemAddedContext.ReorderableSelectionSource reorderableSelectionSource = LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.LOCAL_HOME;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LocalClientCartMenuItemAddedContext.ReorderableSelectionSource reorderableSelectionSource2 = LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.LOCAL_HOME;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealCartBuilder(Analytics analytics, SessionManager sessionManager, BrandSpot brandSpot, AvatarViewModel$$ExternalSyntheticLambda0 avatarViewModel$$ExternalSyntheticLambda0) {
        brandSpot.getClass();
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.brandSpot = brandSpot;
        this.checkoutFlowToken = (String) avatarViewModel$$ExternalSyntheticLambda0.invoke();
        this.openTabCartOverrideState = Updater.mutableStateOf$default(null);
        this.buyerIntentErrorsState = new SnapshotStateList();
        this.serverSubtotalState = Updater.mutableStateOf$default(null);
        this.serverSubtotalBeforeDiscountsState = Updater.mutableStateOf$default(null);
        this.discountCodes = new SnapshotStateList();
        this.includesPreorderItemsState = Updater.mutableStateOf$default(Boolean.FALSE);
        this.selections = new SnapshotStateList();
    }

    public static String discountText(LocalCart.Line line) {
        ArrayList plus = CollectionsKt.plus((Iterable) line.discount_texts, (Collection) CollectionsKt__CollectionsKt.listOfNotNull(line.discount_text));
        ArrayList arrayList = new ArrayList();
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62);
        if (joinToString$default.length() > 0) {
            return joinToString$default;
        }
        return null;
    }

    public static boolean matchesComboSlots(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList zip = CollectionsKt.zip(list, list2);
        if (zip.isEmpty()) {
            return true;
        }
        Iterator it = zip.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            LocalCart.Line.Selection.ComboSlot comboSlot = (LocalCart.Line.Selection.ComboSlot) pair.first;
            LocalCart.Line.Selection.ComboSlot comboSlot2 = (LocalCart.Line.Selection.ComboSlot) pair.second;
            if (!Intrinsics.areEqual(comboSlot.menu_item_combo_slot_token, comboSlot2.menu_item_combo_slot_token) || !Intrinsics.areEqual(comboSlot.menu_item_token, comboSlot2.menu_item_token) || !Intrinsics.areEqual(comboSlot.menu_item_variation_token, comboSlot2.menu_item_variation_token) || !matchesModifiers(comboSlot.modifiers, comboSlot2.modifiers) || !matchesTextModifiers(comboSlot.text_modifiers, comboSlot2.text_modifiers)) {
                return false;
            }
        }
        return true;
    }

    public static boolean matchesModifiers(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList zip = CollectionsKt.zip(list, list2);
        if (zip.isEmpty()) {
            return true;
        }
        Iterator it = zip.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            LocalCart.Line.Selection.Modifier modifier = (LocalCart.Line.Selection.Modifier) pair.first;
            LocalCart.Line.Selection.Modifier modifier2 = (LocalCart.Line.Selection.Modifier) pair.second;
            if (!Intrinsics.areEqual(modifier.menu_item_modifier_token, modifier2.menu_item_modifier_token) || !Intrinsics.areEqual(modifier.quantity, modifier2.quantity)) {
                return false;
            }
        }
        return true;
    }

    public static boolean matchesTextModifiers(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList zip = CollectionsKt.zip(list, list2);
        if (zip.isEmpty()) {
            return true;
        }
        Iterator it = zip.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            LocalCart.Line.Selection.TextModifier textModifier = (LocalCart.Line.Selection.TextModifier) pair.first;
            LocalCart.Line.Selection.TextModifier textModifier2 = (LocalCart.Line.Selection.TextModifier) pair.second;
            if (!Intrinsics.areEqual(textModifier.menu_item_menu_modifier_token, textModifier2.menu_item_menu_modifier_token) || !Intrinsics.areEqual(textModifier.inputted_text, textModifier2.inputted_text)) {
                return false;
            }
        }
        return true;
    }

    public static SortedSet toModifierFreeEntriesOrNull(List list) {
        List<LocalCart.Line.Selection.TextModifier> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (LocalCart.Line.Selection.TextModifier textModifier : list2) {
            String str = textModifier.menu_item_menu_modifier_token;
            if (str == null) {
                return null;
            }
            String str2 = textModifier.inputted_text;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new CartEntry.ModifierFreeEntry(str, str2));
        }
        return CollectionsKt___CollectionsJvmKt.toSortedSet(arrayList);
    }

    public static Selection toSelectionOrNull(LocalCart.Line.Selection selection) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = SelectionKt.toSelection(selection);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Selection selection2 = (Selection) failure;
        if (selection2 != null && selection2.quantity > 0) {
            return selection2;
        }
        return null;
    }

    public final CartEntryWithQuantity.ClientCartEntryWithQuantity add(CartEntry cartEntry, int i, LocationMenu locationMenu, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
        ReorderableSelectionSource reorderableSelectionSource;
        String str;
        MenuItem m1244menuItemOrNullGvMOdU0;
        String str2;
        String str3;
        cartEntry.getClass();
        if (locationMenu != null) {
            this.lastKnownMenu = locationMenu;
        }
        clearServerDerivedState();
        SnapshotStateList snapshotStateList = this.selections;
        ListIterator listIterator = snapshotStateList.listIterator();
        int i2 = 0;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry(), cartEntry)) {
                break;
            }
            i2++;
        }
        CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) CollectionsKt.getOrNull(i2, snapshotStateList);
        CartEntryWithQuantity.ClientCartEntryWithQuantity coerceToClientCartEntry = cartEntryWithQuantity != null ? CartEntryWithQuantityKt.coerceToClientCartEntry(cartEntryWithQuantity, cartEntryWithQuantity.getQuantity() + i) : new CartEntryWithQuantity.ClientCartEntryWithQuantity(cartEntry, i, localClientCartMenuItemAddedContext);
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext2 = coerceToClientCartEntry.analyticsContext;
        if (i2 != -1) {
            snapshotStateList.set(i2, coerceToClientCartEntry);
        } else {
            snapshotStateList.add(coerceToClientCartEntry);
        }
        LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.comboData : null;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
        if (activeAccountTokenOrNull == null) {
            activeAccountTokenOrNull = "Not logged";
        }
        String str4 = activeAccountTokenOrNull;
        String str5 = (localClientCartMenuItemAddedContext2 == null || (str3 = localClientCartMenuItemAddedContext2.brandToken) == null) ? null : str3;
        String str6 = (localClientCartMenuItemAddedContext2 == null || (str2 = localClientCartMenuItemAddedContext2.locationToken) == null) ? null : str2;
        String str7 = cartEntry.menuItemToken;
        Long l = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.menuItemIndex : null;
        String str8 = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.menuItemCategoryToken : null;
        Long l2 = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.menuItemCategoryIndex : null;
        String str9 = cartEntry.variationToken;
        String str10 = str9 == null ? null : str9;
        String joinToString$default = CollectionsKt.joinToString$default(cartEntry.modifierSelections, ",", null, null, 0, null, new Data$$ExternalSyntheticLambda0(10), 30);
        long j = i;
        long j2 = 0;
        if (locationMenu != null) {
            ListIterator listIterator2 = snapshotStateList.listIterator();
            while (true) {
                StateListIterator stateListIterator2 = (StateListIterator) listIterator2;
                if (!stateListIterator2.hasNext()) {
                    break;
                }
                j2 = (CartBuilderKt.getCostInMenu(((CartEntryWithQuantity) stateListIterator2.next()).getCartEntry(), locationMenu).amount * r4.getQuantity()) + j2;
                coerceToClientCartEntry = coerceToClientCartEntry;
                j = j;
            }
        }
        CartEntryWithQuantity.ClientCartEntryWithQuantity clientCartEntryWithQuantity = coerceToClientCartEntry;
        long j3 = j;
        String str11 = this.checkoutFlowToken;
        Long l3 = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.reorderableSelectionIndex : null;
        LocalClientCartMenuItemAddedContext.ReorderableSelectionSource reorderableSelectionSource2 = localClientCartMenuItemAddedContext2 != null ? localClientCartMenuItemAddedContext2.reorderableSelectionSource : null;
        int i3 = reorderableSelectionSource2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[reorderableSelectionSource2.ordinal()];
        if (i3 == -1) {
            reorderableSelectionSource = null;
        } else if (i3 == 1) {
            reorderableSelectionSource = ReorderableSelectionSource.LOCAL_HOME;
        } else {
            if (i3 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            reorderableSelectionSource = ReorderableSelectionSource.BRAND_PROFILE;
        }
        boolean z = menuItemAddedContextComboData instanceof LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData;
        LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData comboItemContextData = z ? (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData) menuItemAddedContextComboData : null;
        String str12 = comboItemContextData != null ? comboItemContextData.slotSelectionTokens : null;
        if (locationMenu == null || (m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(cartEntry.menuItemToken)) == null) {
            str = null;
        } else {
            String joinToString$default2 = CollectionsKt.joinToString$default(m1244menuItemOrNullGvMOdU0.discountTokens, ",", null, null, 0, null, RealCartBuilder$add$4.INSTANCE, 30);
            if (joinToString$default2.length() == 0) {
                joinToString$default2 = null;
            }
            str = joinToString$default2;
        }
        this.analytics.track(new LocalClientCartMenuItemAdded(str5, str4, str6, str7, l, str8, l2, l3, reorderableSelectionSource, str10, joinToString$default, Long.valueOf(j3), Long.valueOf(j2), str11, Boolean.valueOf(z), str12, str), null);
        return clientCartEntryWithQuantity;
    }

    public final void applyOffer(DiscountCode discountCode) {
        clearServerDerivedState();
        SnapshotStateList snapshotStateList = this.discountCodes;
        snapshotStateList.clear();
        snapshotStateList.add(discountCode);
        if (discountCode instanceof DiscountCode.Entered) {
            return;
        }
        boolean z = discountCode instanceof DiscountCode.MarketingOffer;
        SnapshotStateList snapshotStateList2 = this.selections;
        if (z) {
            ArrayList arrayList = ((DiscountCode.MarketingOffer) discountCode).entries;
            if (arrayList.isEmpty()) {
                return;
            }
            snapshotStateList2.addAll(arrayList);
            return;
        }
        if (!(discountCode instanceof DiscountCode.BannerOffer)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ArrayList arrayList2 = ((DiscountCode.BannerOffer) discountCode).entries;
        if (arrayList2.isEmpty()) {
            return;
        }
        snapshotStateList2.addAll(arrayList2);
    }

    public final LocalMoney calculateCost(LocationMenu locationMenu, boolean z, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1612670375);
        LocalMoney serverTotal = serverTotal(z);
        if (serverTotal != null) {
            gapComposer.end(false);
            return serverTotal;
        }
        ListIterator listIterator = this.selections.listIterator();
        LocalMoney localMoney = null;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                break;
            }
            LocalMoney cost = CartBuilderKt.getCost((CartEntryWithQuantity) stateListIterator.next(), locationMenu, z);
            if (localMoney == null) {
                localMoney = LocalMoneysKt.zero(cost.currencyCode);
            }
            localMoney = LocalMoneysKt.plus(localMoney, cost);
        }
        if (localMoney == null) {
            localMoney = LocalMoneysKt.zero(LocalCurrencyCode.USD);
        }
        gapComposer.end(false);
        return localMoney;
    }

    public final LocalMoney calculateCostNow(LocationMenu locationMenu, boolean z) {
        locationMenu.getClass();
        LocalMoney serverTotal = serverTotal(z);
        if (serverTotal != null) {
            return serverTotal;
        }
        ListIterator listIterator = this.selections.listIterator();
        LocalMoney localMoney = null;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                break;
            }
            LocalMoney cost = CartBuilderKt.getCost((CartEntryWithQuantity) stateListIterator.next(), locationMenu, z);
            if (localMoney == null) {
                localMoney = LocalMoneysKt.zero(cost.currencyCode);
            }
            localMoney = LocalMoneysKt.plus(localMoney, cost);
        }
        return localMoney == null ? LocalMoneysKt.zero(LocalCurrencyCode.USD) : localMoney;
    }

    public final void clearAll() {
        clearServerDerivedState();
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        generateToken.getClass();
        this.checkoutFlowToken = generateToken;
        this.selections.clear();
        this.discountCodes.clear();
        this.includesPreorderItemsState.setValue(Boolean.FALSE);
        this.openTabCartOverrideState.setValue(null);
    }

    /* renamed from: clearRemovedOffer-LW58JdM, reason: not valid java name */
    public final void m1204clearRemovedOfferLW58JdM(String str) {
        String str2;
        SnapshotStateList snapshotStateList = this.selections;
        if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
            ListIterator listIterator = snapshotStateList.listIterator();
            do {
                StateListIterator stateListIterator = (StateListIterator) listIterator;
                if (stateListIterator.hasNext()) {
                    str2 = ((CartEntryWithQuantity) stateListIterator.next()).getCartEntry().offerToken;
                }
            } while (!(str2 == null ? false : str2.equals(str)));
            return;
        }
        this.discountCodes.clear();
    }

    public final void clearServerDerivedState() {
        this.serverSubtotalState.setValue(null);
        this.serverSubtotalBeforeDiscountsState.setValue(null);
        this.buyerIntentErrorsState.clear();
    }

    public final AbstractPersistentList entries(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1500804977);
        SnapshotStateList snapshotStateList = this.selections;
        snapshotStateList.getClass();
        AbstractPersistentList abstractPersistentList = SnapshotId_jvmKt.getReadable(snapshotStateList).list;
        gapComposer.end(false);
        return abstractPersistentList;
    }

    public final CartEntryWithQuantity remove(CartEntry cartEntry) {
        CartEntryWithQuantity serverCartEntryWithQuantity;
        String str;
        cartEntry.getClass();
        clearServerDerivedState();
        SnapshotStateList snapshotStateList = this.selections;
        ListIterator listIterator = snapshotStateList.listIterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry(), cartEntry)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) snapshotStateList.get(i2);
        if (cartEntryWithQuantity instanceof CartEntryWithQuantity.ClientCartEntryWithQuantity) {
            serverCartEntryWithQuantity = CartEntryWithQuantity.ClientCartEntryWithQuantity.copy$default((CartEntryWithQuantity.ClientCartEntryWithQuantity) cartEntryWithQuantity, Math.max(0, r14.quantity - 1));
        } else {
            if (!(cartEntryWithQuantity instanceof CartEntryWithQuantity.ServerCartEntryWithQuantity)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CartEntryWithQuantity.ServerCartEntryWithQuantity serverCartEntryWithQuantity2 = (CartEntryWithQuantity.ServerCartEntryWithQuantity) cartEntryWithQuantity;
            CartEntry cartEntry2 = serverCartEntryWithQuantity2.cartEntry;
            serverCartEntryWithQuantity = cartEntry2.offerToken != null ? new CartEntryWithQuantity.ServerCartEntryWithQuantity(CartEntry.m1230copyFx2XuU$default(cartEntry2, null, 31), 0, serverCartEntryWithQuantity2.analyticsContext, LocalMoneysKt.zero(serverCartEntryWithQuantity2.totalPrice.currencyCode), null) : CartEntryWithQuantityKt.coerceToClientCartEntry(cartEntryWithQuantity, Math.max(0, serverCartEntryWithQuantity2.quantity - 1));
        }
        snapshotStateList.set(i2, serverCartEntryWithQuantity);
        if (serverCartEntryWithQuantity.getQuantity() == 0 && (str = cartEntryWithQuantity.getCartEntry().offerToken) != null) {
            m1204clearRemovedOfferLW58JdM(str);
        }
        ListIterator listIterator2 = snapshotStateList.listIterator();
        while (true) {
            StateListIterator stateListIterator2 = (StateListIterator) listIterator2;
            if (!stateListIterator2.hasNext()) {
                break;
            }
            i += ((CartEntryWithQuantity) stateListIterator2.next()).getQuantity();
        }
        if (i == 0) {
            BlockersData.Flow.INSTANCE.getClass();
            String generateToken = BlockersData.Flow.Companion.generateToken();
            generateToken.getClass();
            this.checkoutFlowToken = generateToken;
            this.includesPreorderItemsState.setValue(Boolean.FALSE);
        }
        return serverCartEntryWithQuantity;
    }

    public final LocalMoney serverTotal(boolean z) {
        LocalMoney localMoney;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.serverSubtotalState;
        return (!z || (localMoney = (LocalMoney) this.serverSubtotalBeforeDiscountsState.getValue()) == null) ? (LocalMoney) parcelableSnapshotMutableState.getValue() : localMoney;
    }

    public final void setBuyerIntentErrors(List list) {
        list.getClass();
        SnapshotStateList snapshotStateList = this.buyerIntentErrorsState;
        snapshotStateList.getClass();
        if (Intrinsics.areEqual(SnapshotId_jvmKt.getReadable(snapshotStateList).list, list)) {
            return;
        }
        snapshotStateList.clear();
        snapshotStateList.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CartEntryWithQuantity toCartEntryWithQuantity(LocalCart.Line line, CartEntryWithQuantity cartEntryWithQuantity) {
        Selection selectionOrNull;
        CartEntry cartEntry;
        String str;
        String str2;
        CartEntry failure;
        CartEntry cartEntry2;
        LocalCart.Line.Selection selection = line.selection;
        if (selection != null && (selectionOrNull = toSelectionOrNull(selection)) != null) {
            if (cartEntryWithQuantity == null || (cartEntry2 = cartEntryWithQuantity.getCartEntry()) == null) {
                String discountText = discountText(line);
                if (selectionOrNull.modifiers.isEmpty()) {
                    String str3 = selectionOrNull.menuItemToken;
                    String str4 = selectionOrNull.menuItemVariationToken;
                    SortedSet modifierFreeEntriesOrNull = toModifierFreeEntriesOrNull(selectionOrNull.textModifiers);
                    if (modifierFreeEntriesOrNull != null) {
                        List<LocalCart.Line.Selection.ComboSlot> list = selectionOrNull.comboSlots;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (LocalCart.Line.Selection.ComboSlot comboSlot : list) {
                            if (comboSlot.modifiers.isEmpty() && (str = comboSlot.menu_item_combo_slot_token) != null && (str2 = comboSlot.menu_item_token) != null) {
                                String str5 = comboSlot.menu_item_variation_token;
                                String str6 = str5 != null ? str5 : null;
                                SortedSet modifierFreeEntriesOrNull2 = toModifierFreeEntriesOrNull(comboSlot.text_modifiers);
                                if (modifierFreeEntriesOrNull2 != null) {
                                    TreeSet treeSet = new TreeSet();
                                    ArraysKt___ArraysKt.toCollection(new CartEntry.ModifierSelection[0], treeSet);
                                    arrayList.add(new CartEntry.ComboSlotSelection(str, str2, str6, treeSet, modifierFreeEntriesOrNull2));
                                }
                            }
                        }
                        cartEntry = new CartEntry(str3, str4, (SortedSet) null, modifierFreeEntriesOrNull, arrayList, discountText, 68);
                        if (cartEntry == null) {
                            String discountText2 = discountText(line);
                            LocationMenu locationMenu = this.lastKnownMenu;
                            if (locationMenu == null) {
                                cartEntry = null;
                            } else {
                                try {
                                    Result.Companion companion = Result.Companion;
                                    failure = CartBuilderKt.m1202toCartEntryxZOLh24(selectionOrNull, locationMenu, discountText2, null);
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    failure = new Result.Failure(th);
                                }
                                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                                if (m4120exceptionOrNullimpl != null) {
                                    Timber.Forest.e("Dropping server cart line that could not be rebuilt from the menu", new Object[0], m4120exceptionOrNullimpl);
                                }
                                if (failure instanceof Result.Failure) {
                                    failure = null;
                                }
                                cartEntry = failure;
                            }
                        }
                    }
                }
                cartEntry = null;
                if (cartEntry == null) {
                }
            } else {
                cartEntry = CartEntry.m1230copyFx2XuU$default(cartEntry2, discountText(line), 95);
            }
            CartEntry cartEntry3 = cartEntry;
            com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = line.total_price;
            LocalMoney money = localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null;
            int i = selectionOrNull.quantity;
            if (money == null) {
                return new CartEntryWithQuantity.ClientCartEntryWithQuantity(cartEntry3, i, cartEntryWithQuantity != null ? cartEntryWithQuantity.getAnalyticsContext() : null);
            }
            LocalClientCartMenuItemAddedContext analyticsContext = cartEntryWithQuantity != null ? cartEntryWithQuantity.getAnalyticsContext() : null;
            com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = line.total_price_before_discounts;
            return new CartEntryWithQuantity.ServerCartEntryWithQuantity(cartEntry3, i, analyticsContext, money, localMoney2 != null ? LocalMoneyKt.toMoney(localMoney2) : null);
        }
        return null;
    }

    public final CartEntryWithQuantity.ClientCartEntryWithQuantity update(CartEntry cartEntry, CartEntry cartEntry2, int i, LocationMenu locationMenu) {
        this.lastKnownMenu = locationMenu;
        clearServerDerivedState();
        SnapshotStateList snapshotStateList = this.selections;
        ListIterator listIterator = snapshotStateList.listIterator();
        int i2 = 0;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry(), cartEntry)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        CartEntryWithQuantity.ClientCartEntryWithQuantity clientCartEntryWithQuantity = new CartEntryWithQuantity.ClientCartEntryWithQuantity(cartEntry2, i, null);
        snapshotStateList.set(i2, clientCartEntryWithQuantity);
        return clientCartEntryWithQuantity;
    }
}

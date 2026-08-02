package app.cash.local.presenters.brand.menu;

import androidx.compose.runtime.MutableState;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.ModifierToken;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalMenuComboDetailsPresenter$models$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CartEntryWithQuantity $editCartEntry;
    public final /* synthetic */ LocationMenu $menu;
    public final /* synthetic */ MutableState $slotSelections;
    public final /* synthetic */ MutableState $slotValidationStatuses;
    public final /* synthetic */ ArrayList $slots;
    public final /* synthetic */ LocalMenuComboDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuComboDetailsPresenter$models$4$1(LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, LocationMenu locationMenu, ArrayList arrayList, MutableState mutableState, MutableState mutableState2, CartEntryWithQuantity cartEntryWithQuantity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localMenuComboDetailsPresenter;
        this.$menu = locationMenu;
        this.$slots = arrayList;
        this.$slotSelections = mutableState;
        this.$slotValidationStatuses = mutableState2;
        this.$editCartEntry = cartEntryWithQuantity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalMenuComboDetailsPresenter$models$4$1(this.this$0, this.$menu, this.$slots, this.$slotSelections, this.$slotValidationStatuses, this.$editCartEntry, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalMenuComboDetailsPresenter$models$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CartEntry cartEntry;
        CartEntry.ModifierFreeEntry modifierFreeEntry;
        CartEntry.ModifierSelection modifierSelection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = this.this$0;
        LocalMenuComboDetailsScreen.Mode mode = localMenuComboDetailsPresenter.screen.mode;
        boolean z = mode instanceof LocalMenuComboDetailsScreen.Mode.Add;
        ArrayList arrayList = this.$slots;
        LocationMenu locationMenu = this.$menu;
        if (z) {
            Lazy lazy = locationMenu.modifierTokenToListToken$delegate;
            List list = ((LocalMenuComboDetailsScreen.Mode.Add) mode).slotSelections;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LocalCart.Line.Selection.ComboSlot comboSlot = (LocalCart.Line.Selection.ComboSlot) it.next();
                String str = comboSlot.menu_item_combo_slot_token;
                str.getClass();
                String str2 = comboSlot.menu_item_token;
                str2.getClass();
                String str3 = comboSlot.menu_item_variation_token;
                String str4 = str3 != null ? str3 : null;
                List<LocalCart.Line.Selection.Modifier> list2 = comboSlot.modifiers;
                ArrayList arrayList3 = new ArrayList();
                for (LocalCart.Line.Selection.Modifier modifier : list2) {
                    String str5 = modifier.menu_item_modifier_token;
                    str5.getClass();
                    Iterator it2 = it;
                    MenuItemModifierListToken menuItemModifierListToken = (MenuItemModifierListToken) ((Map) lazy.getValue()).get(new ModifierToken(str5));
                    String str6 = menuItemModifierListToken != null ? menuItemModifierListToken.value : null;
                    MenuItemModifierList m1246modifierListOrNullCUrkqkQ = str6 == null ? null : locationMenu.m1246modifierListOrNullCUrkqkQ(str6);
                    if (m1246modifierListOrNullCUrkqkQ == null) {
                        modifierSelection = null;
                    } else {
                        String str7 = m1246modifierListOrNullCUrkqkQ.token;
                        Integer num = modifier.quantity;
                        num.getClass();
                        modifierSelection = new CartEntry.ModifierSelection(num, str7, str5);
                    }
                    if (modifierSelection != null) {
                        arrayList3.add(modifierSelection);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                SortedSet sortedSet = CollectionsKt___CollectionsJvmKt.toSortedSet(arrayList3);
                List<LocalCart.Line.Selection.TextModifier> list3 = comboSlot.text_modifiers;
                ArrayList arrayList4 = new ArrayList();
                for (LocalCart.Line.Selection.TextModifier textModifier : list3) {
                    String str8 = textModifier.menu_item_menu_modifier_token;
                    str8.getClass();
                    MenuItemModifierListToken menuItemModifierListToken2 = (MenuItemModifierListToken) ((Map) lazy.getValue()).get(new ModifierToken(str8));
                    String str9 = menuItemModifierListToken2 != null ? menuItemModifierListToken2.value : null;
                    MenuItemModifierList m1246modifierListOrNullCUrkqkQ2 = str9 == null ? null : locationMenu.m1246modifierListOrNullCUrkqkQ(str9);
                    if (m1246modifierListOrNullCUrkqkQ2 == null) {
                        modifierFreeEntry = null;
                    } else {
                        String str10 = m1246modifierListOrNullCUrkqkQ2.token;
                        String str11 = textModifier.inputted_text;
                        if (str11 == null) {
                            str11 = "";
                        }
                        modifierFreeEntry = new CartEntry.ModifierFreeEntry(str10, str11);
                    }
                    if (modifierFreeEntry != null) {
                        arrayList4.add(modifierFreeEntry);
                    }
                }
                arrayList2.add(new CartEntry.ComboSlotSelection(str, str2, str4, sortedSet, CollectionsKt___CollectionsJvmKt.toSortedSet(arrayList4)));
                it = it3;
            }
            LocalMenuComboDetailsPresenter.access$performDefaultSelections(localMenuComboDetailsPresenter, locationMenu, arrayList, arrayList2, this.$slotSelections, this.$slotValidationStatuses);
        } else {
            if (!(mode instanceof LocalMenuComboDetailsScreen.Mode.Edit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CartEntryWithQuantity cartEntryWithQuantity = this.$editCartEntry;
            List list4 = (cartEntryWithQuantity == null || (cartEntry = cartEntryWithQuantity.getCartEntry()) == null) ? null : cartEntry.comboSlotSelections;
            if (list4 == null) {
                list4 = EmptyList.INSTANCE;
            }
            LocalMenuComboDetailsPresenter.access$performDefaultSelections(localMenuComboDetailsPresenter, locationMenu, arrayList, list4, this.$slotSelections, this.$slotValidationStatuses);
        }
        return Unit.INSTANCE;
    }
}

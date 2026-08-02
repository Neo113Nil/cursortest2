package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalCart;

/* loaded from: classes3.dex */
public abstract class SelectionKt {
    public static final LocalCart.Line.Selection toProtoSelection(Selection selection) {
        selection.getClass();
        String str = selection.menuItemToken;
        Integer valueOf = Integer.valueOf(selection.quantity);
        String str2 = selection.menuItemVariationToken;
        if (str2 == null) {
            str2 = null;
        }
        return new LocalCart.Line.Selection(str, valueOf, str2, selection.modifiers, selection.textModifiers, selection.comboSlots, null, 64, null);
    }

    public static final Selection toSelection(LocalCart.Line.Selection selection) {
        selection.getClass();
        String str = selection.menu_item_token;
        str.getClass();
        Integer num = selection.quantity;
        num.getClass();
        int intValue = num.intValue();
        String str2 = selection.menu_item_variation_token;
        if (str2 == null) {
            str2 = null;
        }
        return new Selection(str, intValue, str2, selection.modifiers, selection.text_modifiers, selection.combo_slots);
    }
}

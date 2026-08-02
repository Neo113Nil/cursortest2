package app.cash.local.presenters.brand.menu;

import app.cash.local.backend.CartBuilderKt;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.LocationMenu;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMenuItemDetailsPresenter$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ LocationMenu f$0;
    public final /* synthetic */ CartEntryWithQuantity f$1;

    public /* synthetic */ LocalMenuItemDetailsPresenter$$ExternalSyntheticLambda3(CartEntryWithQuantity cartEntryWithQuantity, LocationMenu locationMenu) {
        this.f$1 = cartEntryWithQuantity;
        this.f$0 = locationMenu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CartEntry cartEntry;
        CartEntry cartEntry2;
        int i = this.$r8$classId;
        LocationMenu locationMenu = this.f$0;
        CartEntryWithQuantity cartEntryWithQuantity = this.f$1;
        switch (i) {
            case 0:
                if (cartEntryWithQuantity == null || (cartEntry = cartEntryWithQuantity.getCartEntry()) == null) {
                    return null;
                }
                return CartBuilderKt.getCostInMenu(cartEntry, locationMenu);
            default:
                if (cartEntryWithQuantity == null || (cartEntry2 = cartEntryWithQuantity.getCartEntry()) == null) {
                    return null;
                }
                return CartBuilderKt.getCostInMenu(cartEntry2, locationMenu);
        }
    }

    public /* synthetic */ LocalMenuItemDetailsPresenter$$ExternalSyntheticLambda3(LocationMenu locationMenu, CartEntryWithQuantity cartEntryWithQuantity) {
        this.f$0 = locationMenu;
        this.f$1 = cartEntryWithQuantity;
    }
}

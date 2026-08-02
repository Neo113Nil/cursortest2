package app.cash.local.presenters.internal;

import app.cash.local.primitives.MenuItemModifierList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LocalMenuItemsKt$priceRange$$inlined$filterIsInstance$1 implements Function1 {
    public static final LocalMenuItemsKt$priceRange$$inlined$filterIsInstance$1 INSTANCE = new LocalMenuItemsKt$priceRange$$inlined$filterIsInstance$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof MenuItemModifierList.InputType.SelectFromList);
    }
}

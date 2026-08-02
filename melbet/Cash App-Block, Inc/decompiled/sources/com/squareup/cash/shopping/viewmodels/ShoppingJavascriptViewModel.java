package com.squareup.cash.shopping.viewmodels;

import androidx.glance.appwidget.IgnoreResultKt;

/* loaded from: classes7.dex */
public final class ShoppingJavascriptViewModel {
    public final IgnoreResultKt injectJavascriptViewModel;
    public final PaykitInfoToastState paykitInfoToastState;

    public ShoppingJavascriptViewModel(IgnoreResultKt ignoreResultKt, PaykitInfoToastState paykitInfoToastState) {
        this.injectJavascriptViewModel = ignoreResultKt;
        this.paykitInfoToastState = paykitInfoToastState;
    }

    public static ShoppingJavascriptViewModel copy$default(ShoppingJavascriptViewModel shoppingJavascriptViewModel, IgnoreResultKt ignoreResultKt, PaykitInfoToastState paykitInfoToastState, int i) {
        if ((i & 1) != 0) {
            ignoreResultKt = shoppingJavascriptViewModel.injectJavascriptViewModel;
        }
        if ((i & 2) != 0) {
            paykitInfoToastState = shoppingJavascriptViewModel.paykitInfoToastState;
        }
        shoppingJavascriptViewModel.getClass();
        return new ShoppingJavascriptViewModel(ignoreResultKt, paykitInfoToastState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingJavascriptViewModel)) {
            return false;
        }
        ShoppingJavascriptViewModel shoppingJavascriptViewModel = (ShoppingJavascriptViewModel) obj;
        return this.injectJavascriptViewModel.equals(shoppingJavascriptViewModel.injectJavascriptViewModel) && this.paykitInfoToastState == shoppingJavascriptViewModel.paykitInfoToastState;
    }

    public final int hashCode() {
        return this.paykitInfoToastState.hashCode() + (this.injectJavascriptViewModel.hashCode() * 31);
    }

    public final String toString() {
        return "ShoppingJavascriptViewModel(injectJavascriptViewModel=" + this.injectJavascriptViewModel + ", paykitInfoToastState=" + this.paykitInfoToastState + ")";
    }
}

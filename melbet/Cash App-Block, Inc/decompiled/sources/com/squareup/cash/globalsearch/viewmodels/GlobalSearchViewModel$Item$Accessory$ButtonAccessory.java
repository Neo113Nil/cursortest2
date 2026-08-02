package com.squareup.cash.globalsearch.viewmodels;

import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;

/* loaded from: classes6.dex */
public final class GlobalSearchViewModel$Item$Accessory$ButtonAccessory {
    public final GlobalSearchViewModel.Button button;

    public GlobalSearchViewModel$Item$Accessory$ButtonAccessory(GlobalSearchViewModel.Button button) {
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlobalSearchViewModel$Item$Accessory$ButtonAccessory) && this.button.equals(((GlobalSearchViewModel$Item$Accessory$ButtonAccessory) obj).button);
    }

    public final int hashCode() {
        return this.button.hashCode();
    }

    public final String toString() {
        return "ButtonAccessory(button=" + this.button + ")";
    }
}

package app.cash.local.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class TipOption {
    public final String label;
    public final boolean selected;

    public TipOption(String str, boolean z) {
        this.label = str;
        this.selected = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipOption)) {
            return false;
        }
        TipOption tipOption = (TipOption) obj;
        return this.label.equals(tipOption.label) && this.selected == tipOption.selected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.selected) + (this.label.hashCode() * 961);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("TipOption(label=", this.label, ", subLabel=null, selected=", ")", this.selected);
    }
}

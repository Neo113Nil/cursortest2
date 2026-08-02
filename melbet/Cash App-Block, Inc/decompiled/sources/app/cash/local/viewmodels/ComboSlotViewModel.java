package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboSlotViewModel {
    public final List errors;
    public final String subtitle;
    public final String title;
    public final String trailing;

    public ComboSlotViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.trailing = str3;
        this.errors = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSlotViewModel)) {
            return false;
        }
        ComboSlotViewModel comboSlotViewModel = (ComboSlotViewModel) obj;
        return Intrinsics.areEqual(this.title, comboSlotViewModel.title) && Intrinsics.areEqual(this.subtitle, comboSlotViewModel.subtitle) && Intrinsics.areEqual(this.trailing, comboSlotViewModel.trailing) && Intrinsics.areEqual(this.errors, comboSlotViewModel.errors);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trailing;
        return this.errors.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlotViewModel(title=", this.title, ", subtitle=", this.subtitle, ", trailing=");
        m.append(this.trailing);
        m.append(", errors=");
        m.append(this.errors);
        m.append(")");
        return m.toString();
    }
}

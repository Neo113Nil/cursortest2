package app.cash.local.viewmodels.internal;

import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuSelectorOption {
    public final MenuHours hours;
    public final String name;
    public final String token;

    public MenuSelectorOption(String str, String str2, MenuHours menuHours) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.hours = menuHours;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuSelectorOption)) {
            return false;
        }
        MenuSelectorOption menuSelectorOption = (MenuSelectorOption) obj;
        return Intrinsics.areEqual(this.token, menuSelectorOption.token) && Intrinsics.areEqual(this.name, menuSelectorOption.name) && Intrinsics.areEqual(this.hours, menuSelectorOption.hours);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        MenuHours menuHours = this.hours;
        return m + (menuHours == null ? 0 : menuHours.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuSelectorOption(token=", MenuToken.m1269toStringimpl(this.token), ", name=", this.name, ", hours=");
        m.append(this.hours);
        m.append(")");
        return m.toString();
    }
}

package app.cash.local.presenters.cart;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.LocalMoney;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LineSelectionInformationRenderer$ModifierInformation {
    public final String name;
    public final LocalMoney price;
    public final Integer quantity;

    public LineSelectionInformationRenderer$ModifierInformation(String str, Integer num, LocalMoney localMoney) {
        str.getClass();
        this.name = str;
        this.quantity = num;
        this.price = localMoney;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionInformationRenderer$ModifierInformation)) {
            return false;
        }
        LineSelectionInformationRenderer$ModifierInformation lineSelectionInformationRenderer$ModifierInformation = (LineSelectionInformationRenderer$ModifierInformation) obj;
        return Intrinsics.areEqual(this.name, lineSelectionInformationRenderer$ModifierInformation.name) && Intrinsics.areEqual(this.quantity, lineSelectionInformationRenderer$ModifierInformation.quantity) && Intrinsics.areEqual(this.price, lineSelectionInformationRenderer$ModifierInformation.price);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.quantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        LocalMoney localMoney = this.price;
        return hashCode2 + (localMoney != null ? localMoney.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.quantity, "ModifierInformation(name=", this.name, ", quantity=", ", price=");
        m.append(this.price);
        m.append(")");
        return m.toString();
    }
}

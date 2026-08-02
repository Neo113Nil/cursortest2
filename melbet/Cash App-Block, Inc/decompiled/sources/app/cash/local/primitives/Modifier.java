package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Modifier implements Parcelable {
    public static final Parcelable.Creator<Modifier> CREATOR = new MenuItem.Creator(11);
    public final LocalMenuAvailability availability;
    public final String name;
    public final ArrayList nestedModifierLists;
    public final LocalMoney price;
    public final boolean selectedByDefault;
    public final String token;

    public Modifier(String str, String str2, LocalMoney localMoney, boolean z, LocalMenuAvailability localMenuAvailability, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        localMenuAvailability.getClass();
        this.token = str;
        this.name = str2;
        this.price = localMoney;
        this.selectedByDefault = z;
        this.availability = localMenuAvailability;
        this.nestedModifierLists = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Modifier)) {
            return false;
        }
        Modifier modifier = (Modifier) obj;
        return Intrinsics.areEqual(this.token, modifier.token) && Intrinsics.areEqual(this.name, modifier.name) && Intrinsics.areEqual(this.price, modifier.price) && this.selectedByDefault == modifier.selectedByDefault && this.availability == modifier.availability && this.nestedModifierLists.equals(modifier.nestedModifierLists);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        LocalMoney localMoney = this.price;
        return this.nestedModifierLists.hashCode() + ((this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (localMoney == null ? 0 : localMoney.hashCode())) * 31, 31, this.selectedByDefault)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Modifier(token=", ModifierToken.m1277toStringimpl(this.token), ", name=", this.name, ", price=");
        m.append(this.price);
        m.append(", selectedByDefault=");
        m.append(this.selectedByDefault);
        m.append(", availability=");
        m.append(this.availability);
        m.append(", nestedModifierLists=");
        m.append(this.nestedModifierLists);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        LocalMoney localMoney = this.price;
        if (localMoney == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localMoney.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.selectedByDefault ? 1 : 0);
        parcel.writeString(this.availability.name());
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.nestedModifierLists, parcel);
        while (m.hasNext()) {
            ((NestedModifierList) m.next()).writeToParcel(parcel, i);
        }
    }
}

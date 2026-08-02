package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationToken;
import app.cash.passcode.screens.EndAppLock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalSchedulingDayTimePickerScreen implements LocalScreen {
    public static final Parcelable.Creator<LocalSchedulingDayTimePickerScreen> CREATOR = new EndAppLock.Creator(8);
    public final BrandSpot brandSpot;
    public final String buyerToken;
    public final String checkoutFlowToken;
    public final FulfillmentConfiguration fulfillmentConfiguration;
    public final ArrayList itemTokens;
    public final String locationToken;
    public final AskedQuestion question;

    public LocalSchedulingDayTimePickerScreen(BrandSpot brandSpot, String str, String str2, String str3, ArrayList arrayList, FulfillmentConfiguration fulfillmentConfiguration, AskedQuestion askedQuestion) {
        brandSpot.getClass();
        str.getClass();
        fulfillmentConfiguration.getClass();
        askedQuestion.getClass();
        this.brandSpot = brandSpot;
        this.locationToken = str;
        this.buyerToken = str2;
        this.checkoutFlowToken = str3;
        this.itemTokens = arrayList;
        this.fulfillmentConfiguration = fulfillmentConfiguration;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalSchedulingDayTimePickerScreen)) {
            return false;
        }
        LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen = (LocalSchedulingDayTimePickerScreen) obj;
        return Intrinsics.areEqual(this.brandSpot, localSchedulingDayTimePickerScreen.brandSpot) && LocationToken.m1250equalsimpl0(this.locationToken, localSchedulingDayTimePickerScreen.locationToken) && Intrinsics.areEqual(this.buyerToken, localSchedulingDayTimePickerScreen.buyerToken) && Intrinsics.areEqual(this.checkoutFlowToken, localSchedulingDayTimePickerScreen.checkoutFlowToken) && this.itemTokens.equals(localSchedulingDayTimePickerScreen.itemTokens) && Intrinsics.areEqual(this.fulfillmentConfiguration, localSchedulingDayTimePickerScreen.fulfillmentConfiguration) && Intrinsics.areEqual(this.question, localSchedulingDayTimePickerScreen.question);
    }

    public final int hashCode() {
        int m1251hashCodeimpl = (LocationToken.m1251hashCodeimpl(this.locationToken) + (this.brandSpot.hashCode() * 31)) * 31;
        String str = this.buyerToken;
        int hashCode = (m1251hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.checkoutFlowToken;
        return this.question.hashCode() + ((this.fulfillmentConfiguration.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.itemTokens, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        String m1252toStringimpl = LocationToken.m1252toStringimpl(this.locationToken);
        StringBuilder sb = new StringBuilder("LocalSchedulingDayTimePickerScreen(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", locationToken=");
        sb.append(m1252toStringimpl);
        sb.append(", buyerToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.buyerToken, ", checkoutFlowToken=", this.checkoutFlowToken, ", itemTokens=");
        sb.append(this.itemTokens);
        sb.append(", fulfillmentConfiguration=");
        sb.append(this.fulfillmentConfiguration);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(LocationToken.m1249boximpl(this.locationToken), i);
        parcel.writeString(this.buyerToken);
        parcel.writeString(this.checkoutFlowToken);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.itemTokens, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.fulfillmentConfiguration, i);
        parcel.writeParcelable(this.question, i);
    }
}

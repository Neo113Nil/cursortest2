package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.DiscountMode;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.order.RowIdentifier;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.Offer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public final class Line implements Parcelable {
    public static final Parcelable.Creator<Line> CREATOR = new Creator(0);
    public final LocalMoney discountAmount;
    public final String discountText;
    public final String menuItemName;
    public final String menuItemVariationName;
    public final Selection selection;
    public final LocalMoney totalPrice;
    public final LocalMoney totalPriceBeforeDiscounts;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    Selection createFromParcel = Selection.CREATOR.createFromParcel(parcel);
                    LocalMoney createFromParcel2 = parcel.readInt() == 0 ? null : LocalMoney.CREATOR.createFromParcel(parcel);
                    Parcelable.Creator<LocalMoney> creator = LocalMoney.CREATOR;
                    return new Line(createFromParcel, createFromParcel2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(ComputedOrderSummary.Row.CREATOR, parcel, arrayList, i, 1);
                    }
                    RowIdentifier createFromParcel3 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    String str = createFromParcel3 != null ? createFromParcel3.value : null;
                    RowIdentifier createFromParcel4 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    String str2 = createFromParcel4 != null ? createFromParcel4.value : null;
                    RowIdentifier createFromParcel5 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    String str3 = createFromParcel5 != null ? createFromParcel5.value : null;
                    RowIdentifier createFromParcel6 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    String str4 = createFromParcel6 != null ? createFromParcel6.value : null;
                    RowIdentifier createFromParcel7 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    String str5 = createFromParcel7 != null ? createFromParcel7.value : null;
                    RowIdentifier createFromParcel8 = parcel.readInt() == 0 ? null : RowIdentifier.CREATOR.createFromParcel(parcel);
                    return new ComputedOrderSummary(arrayList, str, str2, str3, str4, str5, createFromParcel8 != null ? createFromParcel8.value : null);
                case 2:
                    parcel.getClass();
                    return new ComputedOrderSummary.DisplayRow(parcel.readString(), parcel.readString(), ComputedOrderSummary.DisplayRow.Visibility.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    return new ComputedOrderSummary.Row(RowIdentifier.CREATOR.createFromParcel(parcel).value, LocalMoney.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ComputedOrderSummary.DisplayRow.CREATOR.createFromParcel(parcel) : null);
                case 4:
                    parcel.getClass();
                    return new DeliveryQuote(BrandToken.CREATOR.createFromParcel(parcel).value, Location.LocationSummary.CREATOR.createFromParcel(parcel), Fulfillment.CREATOR.createFromParcel(parcel), LocalMoney.CREATOR.createFromParcel(parcel), (GetDeliveryQuoteResponse.DeliveryQuote) parcel.readParcelable(DeliveryQuote.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return DiscountMode.Disabled.INSTANCE;
                case 6:
                    parcel.getClass();
                    return new DiscountMode.Enabled(parcel.readInt() != 0, parcel.readString());
                case 7:
                    return new DiscountToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 8:
                    return new EditorialToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 9:
                    parcel.getClass();
                    return new EstimatedCompletionDuration(parcel.readLong(), parcel.readInt() != 0 ? new Duration(parcel.readLong()) : null, (LocalText) parcel.readParcelable(EstimatedCompletionDuration.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new EstimatedCompletionTime((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return FulfillmentConfiguration.Unspecified.INSTANCE;
                case 12:
                    return new GiftCardAccountNumber(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 13:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(LocalErrorResponse.class, parcel, arrayList2, i, 1);
                    }
                    return new LocalErrorResponse(arrayList2);
                case 14:
                    parcel.getClass();
                    return new LocalMoney(parcel.readLong(), LocalCurrencyCode.valueOf(parcel.readString()));
                case 15:
                    parcel.getClass();
                    return new Location.LargeOrderLimits.QuantityOrderLimit(parcel.readInt());
                case 16:
                    parcel.getClass();
                    return new Location.LargeOrderLimits.SubtotalOrderLimit(LocalMoney.CREATOR.createFromParcel(parcel));
                case 17:
                    parcel.getClass();
                    return new Location.LocationDetail(Location.LocationSummary.CREATOR.createFromParcel(parcel), LocalCurrencyCode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LocationMenu.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Actions.CREATOR.createFromParcel(parcel) : null, (LocalLocationLinks) parcel.readParcelable(Location.LocationDetail.class.getClassLoader()), (LocalLoyaltyAccount) parcel.readParcelable(Location.LocationDetail.class.getClassLoader()), (LocalLoyaltyProgram) parcel.readParcelable(Location.LocationDetail.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return Location.OpenState.Closed.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new Location.OpenState.Hours((LocalOpenHours) parcel.readParcelable(Location.OpenState.Hours.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return Location.OpenState.Open24Hours.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return Location.OpenState.Unspecified.INSTANCE;
                case 22:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Category.CREATOR, parcel, arrayList3, i2, 1);
                    }
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                    for (int i3 = 0; i3 != readInt4; i3++) {
                        linkedHashMap.put(ComboCategoryToken.CREATOR.createFromParcel(parcel), ComboCategory.CREATOR.createFromParcel(parcel));
                    }
                    Instant instant = (Instant) parcel.readSerializable();
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt5);
                    int i4 = 0;
                    while (i4 != readInt5) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(LocationMenu.Menu.CREATOR, parcel, arrayList4, i4, 1);
                    }
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt6);
                    int i5 = 0;
                    while (i5 != readInt6) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItem.CREATOR, parcel, arrayList5, i5, 1);
                    }
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt7);
                    int i6 = 0;
                    while (i6 != readInt7) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemModifierList.CREATOR, parcel, arrayList6, i6, 1);
                    }
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt8);
                    int i7 = 0;
                    while (i7 != readInt8) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemToken.CREATOR, parcel, arrayList7, i7, 1);
                    }
                    int readInt9 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt9);
                    while (i != readInt9) {
                        linkedHashMap2.put(DiscountToken.CREATOR.createFromParcel(parcel), MenuDiscountSummary.CREATOR.createFromParcel(parcel));
                        i++;
                    }
                    return new LocationMenu(readString, arrayList3, linkedHashMap, instant, arrayList4, arrayList5, arrayList6, arrayList7, linkedHashMap2);
                case 23:
                    parcel.getClass();
                    String str6 = MenuToken.CREATOR.createFromParcel(parcel).value;
                    String readString2 = parcel.readString();
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt10);
                    while (i != readInt10) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(MenuCategoryToken.CREATOR, parcel, arrayList8, i, 1);
                    }
                    return new LocationMenu.Menu(parcel.readInt() != 0 ? MenuHours.CREATOR.createFromParcel(parcel) : null, str6, readString2, arrayList8);
                case 24:
                    return new LocationToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 25:
                    parcel.getClass();
                    return new MarketingMessageData.Badge(parcel.readInt() != 0, parcel.readString());
                case 26:
                    LocalImage localImage = (LocalImage) NavAction$$ExternalSyntheticOutline0.m(parcel, MarketingMessageOfferDetails.class);
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String str7 = OfferToken.CREATOR.createFromParcel(parcel).value;
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    Instant instant2 = (Instant) parcel.readSerializable();
                    String readString8 = parcel.readString();
                    int readInt11 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt11);
                    while (i != readInt11) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(MarketingMessageOfferDetails.class, parcel, arrayList9, i, 1);
                    }
                    return new MarketingMessageOfferDetails(localImage, readString3, readString4, str7, readString5, readString6, readString7, instant2, readString8, arrayList9, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Offer.OfferStatus.valueOf(parcel.readString()) : null);
                case 27:
                    return new MenuCategoryToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 28:
                    parcel.getClass();
                    return new MenuDiscountSummary(DiscountToken.CREATOR.createFromParcel(parcel).value, parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new MenuHours(MenuHours.State.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Line[i];
                case 1:
                    return new ComputedOrderSummary[i];
                case 2:
                    return new ComputedOrderSummary.DisplayRow[i];
                case 3:
                    return new ComputedOrderSummary.Row[i];
                case 4:
                    return new DeliveryQuote[i];
                case 5:
                    return new DiscountMode.Disabled[i];
                case 6:
                    return new DiscountMode.Enabled[i];
                case 7:
                    return new DiscountToken[i];
                case 8:
                    return new EditorialToken[i];
                case 9:
                    return new EstimatedCompletionDuration[i];
                case 10:
                    return new EstimatedCompletionTime[i];
                case 11:
                    return new FulfillmentConfiguration.Unspecified[i];
                case 12:
                    return new GiftCardAccountNumber[i];
                case 13:
                    return new LocalErrorResponse[i];
                case 14:
                    return new LocalMoney[i];
                case 15:
                    return new Location.LargeOrderLimits.QuantityOrderLimit[i];
                case 16:
                    return new Location.LargeOrderLimits.SubtotalOrderLimit[i];
                case 17:
                    return new Location.LocationDetail[i];
                case 18:
                    return new Location.OpenState.Closed[i];
                case 19:
                    return new Location.OpenState.Hours[i];
                case 20:
                    return new Location.OpenState.Open24Hours[i];
                case 21:
                    return new Location.OpenState.Unspecified[i];
                case 22:
                    return new LocationMenu[i];
                case 23:
                    return new LocationMenu.Menu[i];
                case 24:
                    return new LocationToken[i];
                case 25:
                    return new MarketingMessageData.Badge[i];
                case 26:
                    return new MarketingMessageOfferDetails[i];
                case 27:
                    return new MenuCategoryToken[i];
                case 28:
                    return new MenuDiscountSummary[i];
                default:
                    return new MenuHours[i];
            }
        }
    }

    public Line(Selection selection, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, String str, String str2, String str3) {
        selection.getClass();
        localMoney2.getClass();
        this.selection = selection;
        this.totalPriceBeforeDiscounts = localMoney;
        this.totalPrice = localMoney2;
        this.discountAmount = localMoney3;
        this.discountText = str;
        this.menuItemName = str2;
        this.menuItemVariationName = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Line)) {
            return false;
        }
        Line line = (Line) obj;
        return Intrinsics.areEqual(this.selection, line.selection) && Intrinsics.areEqual(this.totalPriceBeforeDiscounts, line.totalPriceBeforeDiscounts) && Intrinsics.areEqual(this.totalPrice, line.totalPrice) && Intrinsics.areEqual(this.discountAmount, line.discountAmount) && Intrinsics.areEqual(this.discountText, line.discountText) && Intrinsics.areEqual(this.menuItemName, line.menuItemName) && Intrinsics.areEqual(this.menuItemVariationName, line.menuItemVariationName);
    }

    public final int hashCode() {
        int hashCode = this.selection.hashCode() * 31;
        LocalMoney localMoney = this.totalPriceBeforeDiscounts;
        int hashCode2 = (this.totalPrice.hashCode() + ((hashCode + (localMoney == null ? 0 : localMoney.hashCode())) * 31)) * 31;
        LocalMoney localMoney2 = this.discountAmount;
        int hashCode3 = (hashCode2 + (localMoney2 == null ? 0 : localMoney2.hashCode())) * 31;
        String str = this.discountText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.menuItemName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.menuItemVariationName;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(selection=");
        sb.append(this.selection);
        sb.append(", totalPriceBeforeDiscounts=");
        sb.append(this.totalPriceBeforeDiscounts);
        sb.append(", totalPrice=");
        sb.append(this.totalPrice);
        sb.append(", discountAmount=");
        sb.append(this.discountAmount);
        sb.append(", discountText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.discountText, ", menuItemName=", this.menuItemName, ", menuItemVariationName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.menuItemVariationName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.selection.writeToParcel(parcel, i);
        LocalMoney localMoney = this.totalPriceBeforeDiscounts;
        if (localMoney == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localMoney.writeToParcel(parcel, i);
        }
        this.totalPrice.writeToParcel(parcel, i);
        LocalMoney localMoney2 = this.discountAmount;
        if (localMoney2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localMoney2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.discountText);
        parcel.writeString(this.menuItemName);
        parcel.writeString(this.menuItemVariationName);
    }
}

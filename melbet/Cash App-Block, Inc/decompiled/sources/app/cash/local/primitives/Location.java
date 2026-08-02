package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Line;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalPhone;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class Location implements BaseLocationProperties, Parcelable {

    public interface LargeOrderLimits extends Parcelable {

        public final class QuantityOrderLimit implements LargeOrderLimits {
            public static final Parcelable.Creator<QuantityOrderLimit> CREATOR = new Line.Creator(15);
            public final int maxQuantity;

            public QuantityOrderLimit(int i) {
                this.maxQuantity = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QuantityOrderLimit) && this.maxQuantity == ((QuantityOrderLimit) obj).maxQuantity;
            }

            public final int hashCode() {
                return Integer.hashCode(this.maxQuantity);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxQuantity, "QuantityOrderLimit(maxQuantity=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.maxQuantity);
            }
        }

        public final class SubtotalOrderLimit implements LargeOrderLimits {
            public static final Parcelable.Creator<SubtotalOrderLimit> CREATOR = new Line.Creator(16);
            public final LocalMoney maxValue;

            public SubtotalOrderLimit(LocalMoney localMoney) {
                localMoney.getClass();
                this.maxValue = localMoney;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SubtotalOrderLimit) && Intrinsics.areEqual(this.maxValue, ((SubtotalOrderLimit) obj).maxValue);
            }

            public final int hashCode() {
                return this.maxValue.hashCode();
            }

            public final String toString() {
                return "SubtotalOrderLimit(maxValue=" + this.maxValue + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.maxValue.writeToParcel(parcel, i);
            }
        }
    }

    public final class LocationDetail extends Location {
        public static final Parcelable.Creator<LocationDetail> CREATOR = new Line.Creator(17);
        public final Actions actions;
        public final LocalCurrencyCode currencyCode;
        public final LocalLocationLinks links;
        public final LocalLoyaltyAccount loyaltyAccount;
        public final LocalLoyaltyProgram loyaltyProgram;
        public final LocationMenu menu;
        public final LocationSummary summary;

        public LocationDetail(LocationSummary locationSummary, LocalCurrencyCode localCurrencyCode, LocationMenu locationMenu, Actions actions, LocalLocationLinks localLocationLinks, LocalLoyaltyAccount localLoyaltyAccount, LocalLoyaltyProgram localLoyaltyProgram) {
            locationSummary.getClass();
            localCurrencyCode.getClass();
            localLocationLinks.getClass();
            this.summary = locationSummary;
            this.currencyCode = localCurrencyCode;
            this.menu = locationMenu;
            this.actions = actions;
            this.links = localLocationLinks;
            this.loyaltyAccount = localLoyaltyAccount;
            this.loyaltyProgram = localLoyaltyProgram;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationDetail)) {
                return false;
            }
            LocationDetail locationDetail = (LocationDetail) obj;
            return Intrinsics.areEqual(this.summary, locationDetail.summary) && this.currencyCode == locationDetail.currencyCode && Intrinsics.areEqual(this.menu, locationDetail.menu) && Intrinsics.areEqual(this.actions, locationDetail.actions) && Intrinsics.areEqual(this.links, locationDetail.links) && Intrinsics.areEqual(this.loyaltyAccount, locationDetail.loyaltyAccount) && Intrinsics.areEqual(this.loyaltyProgram, locationDetail.loyaltyProgram);
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final LocalAddress getAddress() {
            return this.summary.address;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final List getAvailableFulfillmentTypes() {
            return this.summary.availableFulfillmentTypes;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final String getName() {
            return this.summary.name;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final Map getOpenStates() {
            return this.summary.openStates;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final OrderingMode getOrderingMode() {
            return this.summary.orderingMode;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        /* renamed from: getToken-QsI1X5w */
        public final String mo1225getTokenQsI1X5w() {
            return this.summary.token;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final ZoneId getZoneId() {
            return this.summary.zoneId;
        }

        public final int hashCode() {
            int hashCode = (this.currencyCode.hashCode() + (this.summary.hashCode() * 31)) * 31;
            LocationMenu locationMenu = this.menu;
            int hashCode2 = (hashCode + (locationMenu == null ? 0 : locationMenu.hashCode())) * 31;
            Actions actions = this.actions;
            int hashCode3 = (this.links.hashCode() + ((hashCode2 + (actions == null ? 0 : actions.hashCode())) * 31)) * 31;
            LocalLoyaltyAccount localLoyaltyAccount = this.loyaltyAccount;
            int hashCode4 = (hashCode3 + (localLoyaltyAccount == null ? 0 : localLoyaltyAccount.hashCode())) * 31;
            LocalLoyaltyProgram localLoyaltyProgram = this.loyaltyProgram;
            return hashCode4 + (localLoyaltyProgram != null ? localLoyaltyProgram.hashCode() : 0);
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final OpenState openState(LocalFulfillmentType localFulfillmentType) {
            localFulfillmentType.getClass();
            return this.summary.openState(localFulfillmentType);
        }

        public final String toString() {
            return "LocationDetail(summary=" + this.summary + ", currencyCode=" + this.currencyCode + ", menu=" + this.menu + ", actions=" + this.actions + ", links=" + this.links + ", loyaltyAccount=" + this.loyaltyAccount + ", loyaltyProgram=" + this.loyaltyProgram + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.summary.writeToParcel(parcel, i);
            parcel.writeString(this.currencyCode.name());
            LocationMenu locationMenu = this.menu;
            if (locationMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                locationMenu.writeToParcel(parcel, i);
            }
            Actions actions = this.actions;
            if (actions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                actions.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.links, i);
            parcel.writeParcelable(this.loyaltyAccount, i);
            parcel.writeParcelable(this.loyaltyProgram, i);
        }
    }

    public final class LocationSummary extends Location {
        public static final Parcelable.Creator<LocationSummary> CREATOR = new Creator();
        public final LocalAddress address;
        public final List availableFulfillmentTypes;
        public final boolean deliveryFulfillmentSchedulingEnabled;
        public final Map freeFulfillmentLabels;
        public final Map freeFulfillmentThresholds;
        public final String fulfillmentInstructions;
        public final LocalFulfillment.InStoreDetails inStoreDetails;
        public final Map largeOrderLimits;
        public final String name;
        public final Map openStates;
        public final OrderingMode orderingMode;
        public final LocalPhone phone;
        public final boolean pickupFulfillmentSchedulingEnabled;
        public final String token;
        public final ZoneId zoneId;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z;
                Parcel parcel2 = parcel;
                parcel2.getClass();
                String str = LocationToken.CREATOR.createFromParcel(parcel2).value;
                String readString = parcel2.readString();
                Class<LocationSummary> cls = LocationSummary.class;
                LocalAddress localAddress = (LocalAddress) parcel2.readParcelable(cls.getClassLoader());
                LocalPhone localPhone = (LocalPhone) parcel2.readParcelable(cls.getClassLoader());
                ZoneId zoneId = (ZoneId) parcel2.readSerializable();
                int readInt = parcel2.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(LocalFulfillmentType.valueOf(parcel2.readString()), parcel2.readParcelable(cls.getClassLoader()));
                }
                String readString2 = parcel2.readString();
                int readInt2 = parcel2.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(LocalFulfillmentType.valueOf(parcel2.readString()));
                }
                if (parcel2.readInt() != 0) {
                    arrayList = arrayList2;
                    z = true;
                } else {
                    arrayList = arrayList2;
                    z = false;
                }
                boolean z2 = parcel2.readInt() != 0;
                OrderingMode orderingMode = (OrderingMode) parcel2.readParcelable(cls.getClassLoader());
                int readInt3 = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    Class<LocationSummary> cls2 = cls;
                    linkedHashMap2.put(LocalFulfillmentType.valueOf(parcel2.readString()), parcel2.readParcelable(cls2.getClassLoader()));
                    i3++;
                    readString2 = readString2;
                    cls = cls2;
                }
                String str2 = readString2;
                LocalFulfillment.InStoreDetails inStoreDetails = (LocalFulfillment.InStoreDetails) parcel2.readParcelable(cls.getClassLoader());
                int readInt4 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    linkedHashMap3.put(LocalFulfillmentType.valueOf(parcel2.readString()), LocalMoney.CREATOR.createFromParcel(parcel2));
                    i4++;
                    readInt4 = readInt4;
                    inStoreDetails = inStoreDetails;
                }
                LocalFulfillment.InStoreDetails inStoreDetails2 = inStoreDetails;
                int readInt5 = parcel2.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    linkedHashMap4.put(LocalFulfillmentType.valueOf(parcel2.readString()), parcel.readString());
                    i5++;
                    readInt5 = readInt5;
                    parcel2 = parcel;
                }
                return new LocationSummary(str, readString, localAddress, localPhone, zoneId, linkedHashMap, str2, arrayList, z, z2, orderingMode, linkedHashMap2, inStoreDetails2, linkedHashMap3, linkedHashMap4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationSummary[i];
            }
        }

        public LocationSummary(String str, String str2, LocalAddress localAddress, LocalPhone localPhone, ZoneId zoneId, Map map, String str3, List list, boolean z, boolean z2, OrderingMode orderingMode, Map map2, LocalFulfillment.InStoreDetails inStoreDetails, Map map3, Map map4) {
            str.getClass();
            str2.getClass();
            map.getClass();
            list.getClass();
            orderingMode.getClass();
            map2.getClass();
            this.token = str;
            this.name = str2;
            this.address = localAddress;
            this.phone = localPhone;
            this.zoneId = zoneId;
            this.openStates = map;
            this.fulfillmentInstructions = str3;
            this.availableFulfillmentTypes = list;
            this.pickupFulfillmentSchedulingEnabled = z;
            this.deliveryFulfillmentSchedulingEnabled = z2;
            this.orderingMode = orderingMode;
            this.largeOrderLimits = map2;
            this.inStoreDetails = inStoreDetails;
            this.freeFulfillmentThresholds = map3;
            this.freeFulfillmentLabels = map4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationSummary)) {
                return false;
            }
            LocationSummary locationSummary = (LocationSummary) obj;
            return Intrinsics.areEqual(this.token, locationSummary.token) && Intrinsics.areEqual(this.name, locationSummary.name) && Intrinsics.areEqual(this.address, locationSummary.address) && Intrinsics.areEqual(this.phone, locationSummary.phone) && Intrinsics.areEqual(this.zoneId, locationSummary.zoneId) && Intrinsics.areEqual(this.openStates, locationSummary.openStates) && Intrinsics.areEqual(this.fulfillmentInstructions, locationSummary.fulfillmentInstructions) && Intrinsics.areEqual(this.availableFulfillmentTypes, locationSummary.availableFulfillmentTypes) && this.pickupFulfillmentSchedulingEnabled == locationSummary.pickupFulfillmentSchedulingEnabled && this.deliveryFulfillmentSchedulingEnabled == locationSummary.deliveryFulfillmentSchedulingEnabled && Intrinsics.areEqual(this.orderingMode, locationSummary.orderingMode) && Intrinsics.areEqual(this.largeOrderLimits, locationSummary.largeOrderLimits) && Intrinsics.areEqual(this.inStoreDetails, locationSummary.inStoreDetails) && this.freeFulfillmentThresholds.equals(locationSummary.freeFulfillmentThresholds) && this.freeFulfillmentLabels.equals(locationSummary.freeFulfillmentLabels);
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final LocalAddress getAddress() {
            return this.address;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final List getAvailableFulfillmentTypes() {
            return this.availableFulfillmentTypes;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final String getName() {
            return this.name;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final Map getOpenStates() {
            return this.openStates;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final OrderingMode getOrderingMode() {
            return this.orderingMode;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        /* renamed from: getToken-QsI1X5w */
        public final String mo1225getTokenQsI1X5w() {
            return this.token;
        }

        @Override // app.cash.local.primitives.BaseLocationProperties
        public final ZoneId getZoneId() {
            return this.zoneId;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
            LocalAddress localAddress = this.address;
            int hashCode = (m + (localAddress == null ? 0 : localAddress.hashCode())) * 31;
            LocalPhone localPhone = this.phone;
            int hashCode2 = (hashCode + (localPhone == null ? 0 : localPhone.hashCode())) * 31;
            ZoneId zoneId = this.zoneId;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode2 + (zoneId == null ? 0 : zoneId.hashCode())) * 31, this.openStates, 31);
            String str = this.fulfillmentInstructions;
            int m3 = CameraState$Type$EnumUnboxingLocalUtility.m((this.orderingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.availableFulfillmentTypes), 31, this.pickupFulfillmentSchedulingEnabled), 31, this.deliveryFulfillmentSchedulingEnabled)) * 31, this.largeOrderLimits, 31);
            LocalFulfillment.InStoreDetails inStoreDetails = this.inStoreDetails;
            return this.freeFulfillmentLabels.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((m3 + (inStoreDetails != null ? inStoreDetails.hashCode() : 0)) * 31, this.freeFulfillmentThresholds, 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationSummary(token=", LocationToken.m1252toStringimpl(this.token), ", name=", this.name, ", address=");
            m.append(this.address);
            m.append(", phone=");
            m.append(this.phone);
            m.append(", zoneId=");
            m.append(this.zoneId);
            m.append(", openStates=");
            m.append(this.openStates);
            m.append(", fulfillmentInstructions=");
            NavAction$$ExternalSyntheticOutline0.m(this.fulfillmentInstructions, ", availableFulfillmentTypes=", ", pickupFulfillmentSchedulingEnabled=", m, this.availableFulfillmentTypes);
            re$$ExternalSyntheticOutline0.m(m, this.pickupFulfillmentSchedulingEnabled, ", deliveryFulfillmentSchedulingEnabled=", this.deliveryFulfillmentSchedulingEnabled, ", orderingMode=");
            m.append(this.orderingMode);
            m.append(", largeOrderLimits=");
            m.append(this.largeOrderLimits);
            m.append(", inStoreDetails=");
            m.append(this.inStoreDetails);
            m.append(", freeFulfillmentThresholds=");
            m.append(this.freeFulfillmentThresholds);
            m.append(", freeFulfillmentLabels=");
            return re$$ExternalSyntheticOutline0.m(")", m, this.freeFulfillmentLabels);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.address, i);
            parcel.writeParcelable(this.phone, i);
            parcel.writeSerializable(this.zoneId);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.openStates, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString(((LocalFulfillmentType) entry.getKey()).name());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
            parcel.writeString(this.fulfillmentInstructions);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.availableFulfillmentTypes, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((LocalFulfillmentType) m2.next()).name());
            }
            parcel.writeInt(this.pickupFulfillmentSchedulingEnabled ? 1 : 0);
            parcel.writeInt(this.deliveryFulfillmentSchedulingEnabled ? 1 : 0);
            parcel.writeParcelable(this.orderingMode, i);
            Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.largeOrderLimits, parcel);
            while (m3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m3.next();
                parcel.writeString(((LocalFulfillmentType) entry2.getKey()).name());
                parcel.writeParcelable((Parcelable) entry2.getValue(), i);
            }
            parcel.writeParcelable(this.inStoreDetails, i);
            Iterator m4 = NavAction$$ExternalSyntheticOutline0.m(this.freeFulfillmentThresholds, parcel);
            while (m4.hasNext()) {
                Map.Entry entry3 = (Map.Entry) m4.next();
                parcel.writeString(((LocalFulfillmentType) entry3.getKey()).name());
                ((LocalMoney) entry3.getValue()).writeToParcel(parcel, i);
            }
            Iterator m5 = NavAction$$ExternalSyntheticOutline0.m(this.freeFulfillmentLabels, parcel);
            while (m5.hasNext()) {
                Map.Entry entry4 = (Map.Entry) m5.next();
                parcel.writeString(((LocalFulfillmentType) entry4.getKey()).name());
                parcel.writeString((String) entry4.getValue());
            }
        }
    }

    public interface OpenState extends Parcelable {

        public final class Closed implements OpenState {
            public static final Closed INSTANCE = new Closed();
            public static final Parcelable.Creator<Closed> CREATOR = new Line.Creator(18);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Closed);
            }

            public final int hashCode() {
                return -665904261;
            }

            public final String toString() {
                return "Closed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Hours implements OpenState {
            public static final Parcelable.Creator<Hours> CREATOR = new Line.Creator(19);
            public final LocalOpenHours openHours;

            public Hours(LocalOpenHours localOpenHours) {
                localOpenHours.getClass();
                this.openHours = localOpenHours;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Hours) && Intrinsics.areEqual(this.openHours, ((Hours) obj).openHours);
            }

            public final int hashCode() {
                return this.openHours.hashCode();
            }

            public final String toString() {
                return "Hours(openHours=" + this.openHours + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.openHours, i);
            }
        }

        public final class Open24Hours implements OpenState {
            public static final Open24Hours INSTANCE = new Open24Hours();
            public static final Parcelable.Creator<Open24Hours> CREATOR = new Line.Creator(20);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Open24Hours);
            }

            public final int hashCode() {
                return 134099892;
            }

            public final String toString() {
                return "Open24Hours";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Unspecified implements OpenState {
            public static final Unspecified INSTANCE = new Unspecified();
            public static final Parcelable.Creator<Unspecified> CREATOR = new Line.Creator(21);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unspecified);
            }

            public final int hashCode() {
                return 1680229000;
            }

            public final String toString() {
                return "Unspecified";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }
}

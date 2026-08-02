package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.OrderingMode;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.primitives.order.RowIdentifier;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalDietaryPreference;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalIngredient;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuItem implements Parcelable {
    public static final Parcelable.Creator<MenuItem> CREATOR = new Creator(0);
    public final LocalMenuAvailability availability;
    public final ArrayList comboSlots;
    public final LocalMenuItemDeal deal;
    public final String description;
    public final List dietaryPreferences;
    public final ArrayList discountTokens;
    public final LocalImage image;
    public final List ingredients;
    public final boolean isCombo;
    public final int maxOrderQuantity;
    public final MenuHours menuHours;
    public final ArrayList modifierListConfigs;
    public final String name;
    public final MenuItemPreorderingSummary preorderingSummary;
    public final String token;
    public final Integer totalCalories;
    public final ArrayList variations;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            int i = 0;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    int i3 = 0;
                    parcel.getClass();
                    String str = MenuItemToken.CREATOR.createFromParcel(parcel).value;
                    String readString = parcel.readString();
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i4 = 0; i4 != readInt; i4++) {
                        arrayList.add(LocalDietaryPreference.valueOf(parcel.readString()));
                    }
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    for (int i5 = 0; i5 != readInt2; i5++) {
                        arrayList2.add(LocalIngredient.valueOf(parcel.readString()));
                    }
                    LocalImage localImage = (LocalImage) parcel.readParcelable(MenuItem.class.getClassLoader());
                    LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) parcel.readParcelable(MenuItem.class.getClassLoader());
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt4);
                    int i6 = 0;
                    while (i6 != readInt4) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemVariation.CREATOR, parcel, arrayList3, i6, 1);
                    }
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt5);
                    int i7 = 0;
                    while (i7 != readInt5) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(ModifierListConfig.CREATOR, parcel, arrayList4, i7, 1);
                    }
                    LocalMenuAvailability valueOf2 = LocalMenuAvailability.valueOf(parcel.readString());
                    MenuHours createFromParcel = parcel.readInt() == 0 ? null : MenuHours.CREATOR.createFromParcel(parcel);
                    boolean z2 = parcel.readInt() != 0;
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt6);
                    int i8 = 0;
                    while (i8 != readInt6) {
                        i8 = CameraState$Type$EnumUnboxingLocalUtility.m(ComboSlot.CREATOR, parcel, arrayList5, i8, 1);
                    }
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt7);
                    while (i3 != readInt7) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(DiscountToken.CREATOR, parcel, arrayList6, i3, 1);
                    }
                    return new MenuItem(str, readString, valueOf, readString2, arrayList, arrayList2, localImage, localMenuItemDeal, readInt3, arrayList3, arrayList4, valueOf2, createFromParcel, z2, arrayList5, arrayList6, parcel.readInt() == 0 ? null : MenuItemPreorderingSummary.CREATOR.createFromParcel(parcel));
                case 1:
                    parcel.getClass();
                    return new MenuItemModifierList(MenuItemModifierListToken.CREATOR.createFromParcel(parcel).value, parcel.readString(), (MenuItemModifierList.InputType) parcel.readParcelable(MenuItemModifierList.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new MenuItemModifierList.InputType.FreeTextEntry(parcel.readInt(), parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt8);
                    while (i != readInt8) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Modifier.CREATOR, parcel, arrayList7, i, 1);
                    }
                    return new MenuItemModifierList.InputType.SelectFromList(arrayList7);
                case 4:
                    return new MenuItemModifierListToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 5:
                    parcel.getClass();
                    return new MenuItemPreorderingSummary(parcel.readString(), parcel.readString());
                case 6:
                    return new MenuItemToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 7:
                    parcel.getClass();
                    return new MenuItemVariation(MenuItemVariationToken.CREATOR.createFromParcel(parcel).value, parcel.readString(), LocalMoney.CREATOR.createFromParcel(parcel), (LocalMenuItemDeal) parcel.readParcelable(MenuItemVariation.class.getClassLoader()), LocalMenuAvailability.valueOf(parcel.readString()));
                case 8:
                    return new MenuItemVariationToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 9:
                    return new MenuToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 10:
                    return new MessageToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 11:
                    parcel.getClass();
                    String str2 = ModifierToken.CREATOR.createFromParcel(parcel).value;
                    String readString3 = parcel.readString();
                    LocalMoney createFromParcel2 = parcel.readInt() == 0 ? null : LocalMoney.CREATOR.createFromParcel(parcel);
                    boolean z3 = parcel.readInt() != 0;
                    LocalMenuAvailability valueOf3 = LocalMenuAvailability.valueOf(parcel.readString());
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt9);
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = CameraState$Type$EnumUnboxingLocalUtility.m(NestedModifierList.CREATOR, parcel, arrayList8, i9, 1);
                    }
                    return new Modifier(str2, readString3, createFromParcel2, z3, valueOf3, arrayList8);
                case 12:
                    parcel.getClass();
                    MenuItemModifierListToken createFromParcel3 = parcel.readInt() == 0 ? null : MenuItemModifierListToken.CREATOR.createFromParcel(parcel);
                    return new ModifierListConfig(createFromParcel3 != null ? createFromParcel3.value : null, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
                case 13:
                    return new ModifierToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 14:
                    parcel.getClass();
                    String str3 = MenuItemModifierListToken.CREATOR.createFromParcel(parcel).value;
                    String readString4 = parcel.readString();
                    int readInt10 = parcel.readInt();
                    Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    boolean z4 = parcel.readInt() != 0;
                    int readInt11 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt11);
                    int i10 = 0;
                    while (i10 != readInt11) {
                        i10 = CameraState$Type$EnumUnboxingLocalUtility.m(Modifier.CREATOR, parcel, arrayList9, i10, 1);
                    }
                    return new NestedModifierList(str3, readString4, readInt10, valueOf4, z4, arrayList9, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                case 15:
                    return new OfferToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 16:
                    parcel.getClass();
                    int readInt12 = parcel.readInt();
                    boolean z5 = true;
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = false;
                    } else {
                        z5 = false;
                        z = false;
                    }
                    return new OrderStatus(readInt12, createStringArrayList, readString5, z5, parcel.readString(), parcel.readInt() == 0 ? z : true);
                case 17:
                    return new OrderToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return OrderingMode.Available.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new OrderingMode.Unavailable(parcel.readString(), parcel.readInt() != 0);
                case 20:
                    return new PaymentMethodToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 21:
                    return new RewardToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 22:
                    parcel.getClass();
                    String str4 = MenuItemToken.CREATOR.createFromParcel(parcel).value;
                    int readInt13 = parcel.readInt();
                    MenuItemVariationToken createFromParcel4 = parcel.readInt() == 0 ? null : MenuItemVariationToken.CREATOR.createFromParcel(parcel);
                    String str5 = createFromParcel4 != null ? createFromParcel4.value : null;
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt14);
                    int i11 = 0;
                    while (i11 != readInt14) {
                        i11 = CameraState$Type$EnumUnboxingLocalUtility.m(Selection.class, parcel, arrayList10, i11, 1);
                    }
                    int readInt15 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(readInt15);
                    int i12 = 0;
                    while (i12 != readInt15) {
                        i12 = CameraState$Type$EnumUnboxingLocalUtility.m(Selection.class, parcel, arrayList11, i12, 1);
                    }
                    int readInt16 = parcel.readInt();
                    ArrayList arrayList12 = new ArrayList(readInt16);
                    while (i2 != readInt16) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Selection.class, parcel, arrayList12, i2, 1);
                    }
                    return new Selection(str4, readInt13, str5, arrayList10, arrayList11, arrayList12);
                case 23:
                    return new ShortlinkKey(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 24:
                    parcel.getClass();
                    return new SummaryLine(parcel.readString(), LocalMoney.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                case 25:
                    parcel.getClass();
                    BrandToken createFromParcel5 = parcel.readInt() == 0 ? null : BrandToken.CREATOR.createFromParcel(parcel);
                    String str6 = createFromParcel5 != null ? createFromParcel5.value : null;
                    LocationToken createFromParcel6 = parcel.readInt() == 0 ? null : LocationToken.CREATOR.createFromParcel(parcel);
                    return new LocalClientCartMenuItemAddedContext(str6, createFromParcel6 != null ? createFromParcel6.value : null, (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) parcel.readParcelable(LocalClientCartMenuItemAddedContext.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.valueOf(parcel.readString()) : null);
                case 26:
                    parcel.getClass();
                    return new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData(parcel.readString());
                case 27:
                    parcel.getClass();
                    return new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData(MenuItemToken.CREATOR.createFromParcel(parcel).value, ComboSlotToken.CREATOR.createFromParcel(parcel).value, parcel.readInt());
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.NonComboItemContextData.INSTANCE;
                default:
                    return new RowIdentifier(NavAction$$ExternalSyntheticOutline0.m(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new MenuItem[i];
                case 1:
                    return new MenuItemModifierList[i];
                case 2:
                    return new MenuItemModifierList.InputType.FreeTextEntry[i];
                case 3:
                    return new MenuItemModifierList.InputType.SelectFromList[i];
                case 4:
                    return new MenuItemModifierListToken[i];
                case 5:
                    return new MenuItemPreorderingSummary[i];
                case 6:
                    return new MenuItemToken[i];
                case 7:
                    return new MenuItemVariation[i];
                case 8:
                    return new MenuItemVariationToken[i];
                case 9:
                    return new MenuToken[i];
                case 10:
                    return new MessageToken[i];
                case 11:
                    return new Modifier[i];
                case 12:
                    return new ModifierListConfig[i];
                case 13:
                    return new ModifierToken[i];
                case 14:
                    return new NestedModifierList[i];
                case 15:
                    return new OfferToken[i];
                case 16:
                    return new OrderStatus[i];
                case 17:
                    return new OrderToken[i];
                case 18:
                    return new OrderingMode.Available[i];
                case 19:
                    return new OrderingMode.Unavailable[i];
                case 20:
                    return new PaymentMethodToken[i];
                case 21:
                    return new RewardToken[i];
                case 22:
                    return new Selection[i];
                case 23:
                    return new ShortlinkKey[i];
                case 24:
                    return new SummaryLine[i];
                case 25:
                    return new LocalClientCartMenuItemAddedContext[i];
                case 26:
                    return new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData[i];
                case 27:
                    return new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData[i];
                case 28:
                    return new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.NonComboItemContextData[i];
                default:
                    return new RowIdentifier[i];
            }
        }
    }

    public MenuItem(String str, String str2, Integer num, String str3, List list, List list2, LocalImage localImage, LocalMenuItemDeal localMenuItemDeal, int i, ArrayList arrayList, ArrayList arrayList2, LocalMenuAvailability localMenuAvailability, MenuHours menuHours, boolean z, ArrayList arrayList3, ArrayList arrayList4, MenuItemPreorderingSummary menuItemPreorderingSummary) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        localMenuAvailability.getClass();
        this.token = str;
        this.name = str2;
        this.totalCalories = num;
        this.description = str3;
        this.dietaryPreferences = list;
        this.ingredients = list2;
        this.image = localImage;
        this.deal = localMenuItemDeal;
        this.maxOrderQuantity = i;
        this.variations = arrayList;
        this.modifierListConfigs = arrayList2;
        this.availability = localMenuAvailability;
        this.menuHours = menuHours;
        this.isCombo = z;
        this.comboSlots = arrayList3;
        this.discountTokens = arrayList4;
        this.preorderingSummary = menuItemPreorderingSummary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Intrinsics.areEqual(this.token, menuItem.token) && Intrinsics.areEqual(this.name, menuItem.name) && Intrinsics.areEqual(this.totalCalories, menuItem.totalCalories) && Intrinsics.areEqual(this.description, menuItem.description) && Intrinsics.areEqual(this.dietaryPreferences, menuItem.dietaryPreferences) && Intrinsics.areEqual(this.ingredients, menuItem.ingredients) && Intrinsics.areEqual(this.image, menuItem.image) && Intrinsics.areEqual(this.deal, menuItem.deal) && this.maxOrderQuantity == menuItem.maxOrderQuantity && this.variations.equals(menuItem.variations) && this.modifierListConfigs.equals(menuItem.modifierListConfigs) && this.availability == menuItem.availability && Intrinsics.areEqual(this.menuHours, menuItem.menuHours) && this.isCombo == menuItem.isCombo && this.comboSlots.equals(menuItem.comboSlots) && this.discountTokens.equals(menuItem.discountTokens) && Intrinsics.areEqual(this.preorderingSummary, menuItem.preorderingSummary);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        Integer num = this.totalCalories;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.dietaryPreferences), 31, this.ingredients);
        LocalImage localImage = this.image;
        int hashCode2 = (m2 + (localImage == null ? 0 : localImage.hashCode())) * 31;
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        int hashCode3 = (this.availability.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.modifierListConfigs, CameraState$Type$EnumUnboxingLocalUtility.m(this.variations, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxOrderQuantity, (hashCode2 + (localMenuItemDeal == null ? 0 : localMenuItemDeal.hashCode())) * 31, 31), 31), 31)) * 31;
        MenuHours menuHours = this.menuHours;
        int m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.discountTokens, CameraState$Type$EnumUnboxingLocalUtility.m(this.comboSlots, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (menuHours == null ? 0 : menuHours.hashCode())) * 31, 31, this.isCombo), 31), 31);
        MenuItemPreorderingSummary menuItemPreorderingSummary = this.preorderingSummary;
        return m3 + (menuItemPreorderingSummary != null ? menuItemPreorderingSummary.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItem(token=", MenuItemToken.m1264toStringimpl(this.token), ", name=", this.name, ", totalCalories=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.totalCalories, ", description=", this.description, ", dietaryPreferences=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.dietaryPreferences, ", ingredients=", this.ingredients, ", image=");
        m.append(this.image);
        m.append(", deal=");
        m.append(this.deal);
        m.append(", maxOrderQuantity=");
        m.append(this.maxOrderQuantity);
        m.append(", variations=");
        m.append(this.variations);
        m.append(", modifierListConfigs=");
        m.append(this.modifierListConfigs);
        m.append(", availability=");
        m.append(this.availability);
        m.append(", menuHours=");
        m.append(this.menuHours);
        m.append(", isCombo=");
        m.append(this.isCombo);
        m.append(", comboSlots=");
        m.append(this.comboSlots);
        m.append(", discountTokens=");
        m.append(this.discountTokens);
        m.append(", preorderingSummary=");
        m.append(this.preorderingSummary);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        Integer num = this.totalCalories;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.description);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.dietaryPreferences, parcel);
        while (m.hasNext()) {
            parcel.writeString(((LocalDietaryPreference) m.next()).name());
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.ingredients, parcel);
        while (m2.hasNext()) {
            parcel.writeString(((LocalIngredient) m2.next()).name());
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.deal, i);
        parcel.writeInt(this.maxOrderQuantity);
        Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.variations, parcel);
        while (m3.hasNext()) {
            ((MenuItemVariation) m3.next()).writeToParcel(parcel, i);
        }
        Iterator m4 = NavAction$$ExternalSyntheticOutline0.m(this.modifierListConfigs, parcel);
        while (m4.hasNext()) {
            ((ModifierListConfig) m4.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.availability.name());
        MenuHours menuHours = this.menuHours;
        if (menuHours == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            menuHours.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCombo ? 1 : 0);
        Iterator m5 = NavAction$$ExternalSyntheticOutline0.m(this.comboSlots, parcel);
        while (m5.hasNext()) {
            ((ComboSlot) m5.next()).writeToParcel(parcel, i);
        }
        Iterator m6 = NavAction$$ExternalSyntheticOutline0.m(this.discountTokens, parcel);
        while (m6.hasNext()) {
            parcel.writeString(((DiscountToken) m6.next()).value);
        }
        MenuItemPreorderingSummary menuItemPreorderingSummary = this.preorderingSummary;
        if (menuItemPreorderingSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            menuItemPreorderingSummary.writeToParcel(parcel, i);
        }
    }
}

package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.wallet.RefreshState;
import app.cash.local.primitives.CartEntry;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.local.client.v1.CardBrandType;
import com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Cart implements Parcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new Creator(0);
    public final BrandSpot brandSpot;
    public final DynamicChargesBreakdown chargesBreakdown;
    public final boolean hasOpenTabRounds;
    public final List lines;
    public final LocalMoney linesSubtotal;
    public final CartPaymentSummary paymentSummary;
    public final LocalMoney serverCalculatedTotal;
    public final List summaryLines;
    public final String token;
    public final LocalMoney total;
    public final String version;

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
                    String str = CartToken.CREATOR.createFromParcel(parcel).value;
                    String readString = parcel.readString();
                    BrandSpot createFromParcel = BrandSpot.CREATOR.createFromParcel(parcel);
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Line.CREATOR, parcel, arrayList, i2, 1);
                    }
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(SummaryLine.CREATOR, parcel, arrayList2, i3, 1);
                    }
                    Parcelable.Creator<LocalMoney> creator = LocalMoney.CREATOR;
                    return new Cart(str, readString, createFromParcel, arrayList, arrayList2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), (DynamicChargesBreakdown) parcel.readParcelable(Cart.class.getClassLoader()), parcel.readInt() != 0 ? CartPaymentSummary.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return HistoryScreens.InvestingPendingTransactionsScreen.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return HistoryScreens.InvestingRoundUpsFailedConfirmationScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return HistoryScreens.InvestingRoundUpsSkippedConfirmationScreen.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new HistoryScreens.PaymentPasscodeDialog(parcel.readInt() != 0 ? InstrumentType.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (InstrumentSelection) parcel.readParcelable(HistoryScreens.PaymentPasscodeDialog.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new HistoryScreens.PaymentPasscodeDialog.Result(HistoryScreens.PaymentPasscodeDialog.Result.Status.valueOf(parcel.readString()), (ScenarioPlan) parcel.readParcelable(HistoryScreens.PaymentPasscodeDialog.Result.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new HistoryScreens.PaymentReceipt((ActivityItemKey) parcel.readParcelable(HistoryScreens.PaymentReceipt.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new HistoryScreens.RefundPayment(parcel.readString(), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new HistoryScreens.ReportAbuse(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(HistoryScreens.ReportAbuse.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Screen) parcel.readParcelable(HistoryScreens.ReportAbuse.class.getClassLoader()), parcel.readInt() != 0);
                case 9:
                    parcel.getClass();
                    return new HistoryScreens.ReportAbuseDialogScreen(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(HistoryScreens.ReportAbuseDialogScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Screen) parcel.readParcelable(HistoryScreens.ReportAbuseDialogScreen.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    SelectPaymentInstrumentType valueOf = SelectPaymentInstrumentType.valueOf(parcel.readString());
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(HistoryScreens.SelectPaymentInstrument.class, parcel, arrayList3, i4, 1);
                    }
                    Money money = (Money) parcel.readParcelable(HistoryScreens.SelectPaymentInstrument.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    boolean z2 = parcel.readInt() != 0;
                    long readLong = parcel.readLong();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    for (int i5 = 0; i5 != readInt4; i5++) {
                        arrayList4.add(CashInstrumentType.valueOf(parcel.readString()));
                    }
                    return new HistoryScreens.SelectPaymentInstrument(valueOf, createStringArrayList, arrayList3, money, z, z2, readLong, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Role.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? HistoryScreens.SelectPaymentInstrument.NextScreen.valueOf(parcel.readString()) : null);
                case 11:
                    parcel.getClass();
                    return new HistoryScreens.SkipPayment(parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new RefreshState(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                case 13:
                    DiscountMode discountMode = (DiscountMode) NavAction$$ExternalSyntheticOutline0.m(parcel, Actions.class);
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt5);
                    int i6 = 0;
                    while (i6 != readInt5) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(Actions.class, parcel, arrayList5, i6, 1);
                    }
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt6);
                    int i7 = 0;
                    while (i7 != readInt6) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(Actions.class, parcel, arrayList6, i7, 1);
                    }
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt7);
                    while (i != readInt7) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Actions.class, parcel, arrayList7, i, 1);
                    }
                    return new Actions(discountMode, arrayList5, arrayList6, arrayList7);
                case 14:
                    parcel.getClass();
                    return new AttributionKey(parcel.readString());
                case 15:
                    parcel.getClass();
                    String str2 = BrandToken.CREATOR.createFromParcel(parcel).value;
                    LocationToken createFromParcel2 = parcel.readInt() == 0 ? null : LocationToken.CREATOR.createFromParcel(parcel);
                    return new BrandSpot(str2, createFromParcel2 != null ? createFromParcel2.value : null);
                case 16:
                    parcel.getClass();
                    return new BrandSpotSyncTokens(parcel.readString(), parcel.readString(), parcel.readString());
                case 17:
                    return new BrandToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 18:
                    parcel.getClass();
                    String str3 = ComboSlotToken.CREATOR.createFromParcel(parcel).value;
                    String str4 = MenuItemToken.CREATOR.createFromParcel(parcel).value;
                    MenuItemVariationToken createFromParcel3 = parcel.readInt() == 0 ? null : MenuItemVariationToken.CREATOR.createFromParcel(parcel);
                    String str5 = createFromParcel3 != null ? createFromParcel3.value : null;
                    int readInt8 = parcel.readInt();
                    TreeSet treeSet = new TreeSet();
                    for (int i8 = 0; i8 != readInt8; i8++) {
                        treeSet.add(CartEntry.ModifierSelection.CREATOR.createFromParcel(parcel));
                    }
                    int readInt9 = parcel.readInt();
                    TreeSet treeSet2 = new TreeSet();
                    while (i != readInt9) {
                        treeSet2.add(CartEntry.ModifierFreeEntry.CREATOR.createFromParcel(parcel));
                        i++;
                    }
                    return new CartEntry.ComboSlotSelection(str3, str4, str5, treeSet, treeSet2);
                case 19:
                    parcel.getClass();
                    String str6 = MenuItemToken.CREATOR.createFromParcel(parcel).value;
                    MenuItemVariationToken createFromParcel4 = parcel.readInt() == 0 ? null : MenuItemVariationToken.CREATOR.createFromParcel(parcel);
                    String str7 = createFromParcel4 != null ? createFromParcel4.value : null;
                    int readInt10 = parcel.readInt();
                    TreeSet treeSet3 = new TreeSet();
                    for (int i9 = 0; i9 != readInt10; i9++) {
                        treeSet3.add(CartEntry.ModifierSelection.CREATOR.createFromParcel(parcel));
                    }
                    int readInt11 = parcel.readInt();
                    TreeSet treeSet4 = new TreeSet();
                    for (int i10 = 0; i10 != readInt11; i10++) {
                        treeSet4.add(CartEntry.ModifierFreeEntry.CREATOR.createFromParcel(parcel));
                    }
                    int readInt12 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt12);
                    while (i != readInt12) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(CartEntry.ComboSlotSelection.CREATOR, parcel, arrayList8, i, 1);
                    }
                    String readString2 = parcel.readString();
                    OfferToken createFromParcel5 = parcel.readInt() == 0 ? null : OfferToken.CREATOR.createFromParcel(parcel);
                    return new CartEntry(str6, str7, treeSet3, treeSet4, arrayList8, readString2, createFromParcel5 != null ? createFromParcel5.value : null);
                case 20:
                    parcel.getClass();
                    return new CartEntry.ModifierFreeEntry(MenuItemModifierListToken.CREATOR.createFromParcel(parcel).value, parcel.readString());
                case 21:
                    parcel.getClass();
                    return new CartEntry.ModifierSelection(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, MenuItemModifierListToken.CREATOR.createFromParcel(parcel).value, ModifierToken.CREATOR.createFromParcel(parcel).value);
                case 22:
                    parcel.getClass();
                    return new CartPaymentSummary(CardBrandType.valueOf(parcel.readString()), parcel.readString());
                case 23:
                    return new CartToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 24:
                    parcel.getClass();
                    String str8 = MenuCategoryToken.CREATOR.createFromParcel(parcel).value;
                    String readString3 = parcel.readString();
                    LocalImage localImage = (LocalImage) parcel.readParcelable(Category.class.getClassLoader());
                    int readInt13 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt13);
                    while (i != readInt13) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemToken.CREATOR, parcel, arrayList9, i, 1);
                    }
                    return new Category(str8, readString3, localImage, arrayList9, parcel.readInt() != 0 ? MenuHours.CREATOR.createFromParcel(parcel) : null);
                case 25:
                    parcel.getClass();
                    String str9 = ComboCategoryToken.CREATOR.createFromParcel(parcel).value;
                    String readString4 = parcel.readString();
                    LocalImage localImage2 = (LocalImage) parcel.readParcelable(ComboCategory.class.getClassLoader());
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt14);
                    while (i != readInt14) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemToken.CREATOR, parcel, arrayList10, i, 1);
                    }
                    return new ComboCategory(str9, readString4, localImage2, arrayList10);
                case 26:
                    return new ComboCategoryToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
                case 27:
                    parcel.getClass();
                    String str10 = ComboSlotToken.CREATOR.createFromParcel(parcel).value;
                    String readString5 = parcel.readString();
                    ComboCategoryToken createFromParcel6 = parcel.readInt() == 0 ? null : ComboCategoryToken.CREATOR.createFromParcel(parcel);
                    String str11 = createFromParcel6 != null ? createFromParcel6.value : null;
                    int readInt15 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(readInt15);
                    int i11 = 0;
                    while (i11 != readInt15) {
                        i11 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemToken.CREATOR, parcel, arrayList11, i11, 1);
                    }
                    int readInt16 = parcel.readInt();
                    ArrayList arrayList12 = new ArrayList(readInt16);
                    int i12 = 0;
                    while (i12 != readInt16) {
                        i12 = CameraState$Type$EnumUnboxingLocalUtility.m(MenuItemVariationToken.CREATOR, parcel, arrayList12, i12, 1);
                    }
                    MenuItemVariationToken createFromParcel7 = parcel.readInt() == 0 ? null : MenuItemVariationToken.CREATOR.createFromParcel(parcel);
                    String str12 = createFromParcel7 != null ? createFromParcel7.value : null;
                    int readInt17 = parcel.readInt();
                    int readInt18 = parcel.readInt();
                    ArrayList arrayList13 = new ArrayList(readInt18);
                    while (i != readInt18) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(ComboSlotPriceAdjustment.CREATOR, parcel, arrayList13, i, 1);
                    }
                    return new ComboSlot(str10, readString5, str11, arrayList11, arrayList12, str12, readInt17, arrayList13);
                case 28:
                    parcel.getClass();
                    return new ComboSlotPriceAdjustment(LocalMoney.CREATOR.createFromParcel(parcel), MenuItemVariationToken.CREATOR.createFromParcel(parcel).value);
                default:
                    return new ComboSlotToken(NavAction$$ExternalSyntheticOutline0.m(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Cart[i];
                case 1:
                    return new HistoryScreens.InvestingPendingTransactionsScreen[i];
                case 2:
                    return new HistoryScreens.InvestingRoundUpsFailedConfirmationScreen[i];
                case 3:
                    return new HistoryScreens.InvestingRoundUpsSkippedConfirmationScreen[i];
                case 4:
                    return new HistoryScreens.PaymentPasscodeDialog[i];
                case 5:
                    return new HistoryScreens.PaymentPasscodeDialog.Result[i];
                case 6:
                    return new HistoryScreens.PaymentReceipt[i];
                case 7:
                    return new HistoryScreens.RefundPayment[i];
                case 8:
                    return new HistoryScreens.ReportAbuse[i];
                case 9:
                    return new HistoryScreens.ReportAbuseDialogScreen[i];
                case 10:
                    return new HistoryScreens.SelectPaymentInstrument[i];
                case 11:
                    return new HistoryScreens.SkipPayment[i];
                case 12:
                    return new RefreshState[i];
                case 13:
                    return new Actions[i];
                case 14:
                    return new AttributionKey[i];
                case 15:
                    return new BrandSpot[i];
                case 16:
                    return new BrandSpotSyncTokens[i];
                case 17:
                    return new BrandToken[i];
                case 18:
                    return new CartEntry.ComboSlotSelection[i];
                case 19:
                    return new CartEntry[i];
                case 20:
                    return new CartEntry.ModifierFreeEntry[i];
                case 21:
                    return new CartEntry.ModifierSelection[i];
                case 22:
                    return new CartPaymentSummary[i];
                case 23:
                    return new CartToken[i];
                case 24:
                    return new Category[i];
                case 25:
                    return new ComboCategory[i];
                case 26:
                    return new ComboCategoryToken[i];
                case 27:
                    return new ComboSlot[i];
                case 28:
                    return new ComboSlotPriceAdjustment[i];
                default:
                    return new ComboSlotToken[i];
            }
        }
    }

    public Cart(String str, String str2, BrandSpot brandSpot, List list, List list2, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, DynamicChargesBreakdown dynamicChargesBreakdown, CartPaymentSummary cartPaymentSummary, boolean z) {
        str.getClass();
        brandSpot.getClass();
        localMoney.getClass();
        localMoney2.getClass();
        localMoney3.getClass();
        this.token = str;
        this.version = str2;
        this.brandSpot = brandSpot;
        this.lines = list;
        this.summaryLines = list2;
        this.linesSubtotal = localMoney;
        this.total = localMoney2;
        this.serverCalculatedTotal = localMoney3;
        this.chargesBreakdown = dynamicChargesBreakdown;
        this.paymentSummary = cartPaymentSummary;
        this.hasOpenTabRounds = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return Intrinsics.areEqual(this.token, cart.token) && Intrinsics.areEqual(this.version, cart.version) && Intrinsics.areEqual(this.brandSpot, cart.brandSpot) && this.lines.equals(cart.lines) && this.summaryLines.equals(cart.summaryLines) && Intrinsics.areEqual(this.linesSubtotal, cart.linesSubtotal) && Intrinsics.areEqual(this.total, cart.total) && Intrinsics.areEqual(this.serverCalculatedTotal, cart.serverCalculatedTotal) && Intrinsics.areEqual(this.chargesBreakdown, cart.chargesBreakdown) && Intrinsics.areEqual(this.paymentSummary, cart.paymentSummary) && this.hasOpenTabRounds == cart.hasOpenTabRounds;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (this.serverCalculatedTotal.hashCode() + ((this.total.hashCode() + ((this.linesSubtotal.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.brandSpot.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.lines), 31, this.summaryLines)) * 31)) * 31)) * 31;
        DynamicChargesBreakdown dynamicChargesBreakdown = this.chargesBreakdown;
        int hashCode3 = (hashCode2 + (dynamicChargesBreakdown == null ? 0 : dynamicChargesBreakdown.hashCode())) * 31;
        CartPaymentSummary cartPaymentSummary = this.paymentSummary;
        return Boolean.hashCode(this.hasOpenTabRounds) + ((hashCode3 + (cartPaymentSummary != null ? cartPaymentSummary.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cart(token=", CartToken.m1231toStringimpl(this.token), ", version=", this.version, ", brandSpot=");
        m.append(this.brandSpot);
        m.append(", lines=");
        m.append(this.lines);
        m.append(", summaryLines=");
        m.append(this.summaryLines);
        m.append(", linesSubtotal=");
        m.append(this.linesSubtotal);
        m.append(", total=");
        m.append(this.total);
        m.append(", serverCalculatedTotal=");
        m.append(this.serverCalculatedTotal);
        m.append(", chargesBreakdown=");
        m.append(this.chargesBreakdown);
        m.append(", paymentSummary=");
        m.append(this.paymentSummary);
        m.append(", hasOpenTabRounds=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasOpenTabRounds, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.version);
        this.brandSpot.writeToParcel(parcel, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.lines, parcel);
        while (m.hasNext()) {
            ((Line) m.next()).writeToParcel(parcel, i);
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.summaryLines, parcel);
        while (m2.hasNext()) {
            ((SummaryLine) m2.next()).writeToParcel(parcel, i);
        }
        this.linesSubtotal.writeToParcel(parcel, i);
        this.total.writeToParcel(parcel, i);
        this.serverCalculatedTotal.writeToParcel(parcel, i);
        parcel.writeParcelable(this.chargesBreakdown, i);
        CartPaymentSummary cartPaymentSummary = this.paymentSummary;
        if (cartPaymentSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cartPaymentSummary.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasOpenTabRounds ? 1 : 0);
    }
}

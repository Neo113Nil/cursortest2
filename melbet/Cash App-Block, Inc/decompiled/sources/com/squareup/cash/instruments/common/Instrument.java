package com.squareup.cash.instruments.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen$Result$Close;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen$Result$Retry;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerAnswer;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.cash.instruments.screens.TransferOptionPickerQuestion;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Instrument implements Parcelable {
    public static final Parcelable.Creator<Instrument> CREATOR = new Creator(0);
    public final String accessoryIconId;
    public final String accessoryText;
    public final String bankName;
    public final InstrumentType cardBrand;
    public final String cardImageUrl;
    public final CashInstrumentType cashInstrumentType;
    public final boolean defaultForInstrumentType;
    public final String detailIconUrl;
    public final String displayName;
    public final String displayNameCompact;
    public final String iconUrl;
    public final String loggingSource;
    public final Boolean pendingVerification;
    public final String selectionIconUrl;
    public final String suffix;
    public final String token;
    public final Long version;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Long l;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    String readString = parcel.readString();
                    CashInstrumentType valueOf2 = CashInstrumentType.valueOf(parcel.readString());
                    InstrumentType valueOf3 = parcel.readInt() == 0 ? null : InstrumentType.valueOf(parcel.readString());
                    String readString2 = parcel.readString();
                    InstrumentType instrumentType = valueOf3;
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                        l = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                        l = null;
                    }
                    String readString8 = parcel.readString();
                    Boolean bool = valueOf;
                    String readString9 = parcel.readString();
                    Long l2 = l;
                    String readString10 = parcel.readString();
                    boolean z = parcel.readInt() != 0;
                    Long l3 = l2;
                    String readString11 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        l3 = Long.valueOf(parcel.readLong());
                    }
                    return new Instrument(readString, valueOf2, instrumentType, readString2, readString3, readString4, readString5, readString6, readString7, bool, readString8, readString9, readString10, z, readString11, l3, parcel.readString());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return ScenarioPlanErrorScreen$Result$Close.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return ScenarioPlanErrorScreen$Result$Retry.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new BalanceSnapshot(parcel.readString(), (Money) parcel.readParcelable(BalanceSnapshot.class.getClassLoader()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                case 4:
                    parcel.getClass();
                    return new InstrumentSelectionLoadingScreen((BlockersData) parcel.readParcelable(InstrumentSelectionLoadingScreen.class.getClassLoader()), (InstrumentSelectionLoadingScreen.InstrumentSelectionParams) parcel.readParcelable(InstrumentSelectionLoadingScreen.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney((Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 6:
                    parcel.getClass();
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy((Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy.class.getClassLoader()), parcel.readString(), (Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy.class.getClassLoader()), (Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy.class.getClassLoader()), parcel.readString(), (Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 7:
                    parcel.getClass();
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw((Money) parcel.readParcelable(InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? DepositPreference.valueOf(parcel.readString()) : null);
                case 8:
                    Money money = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, InstrumentSelectionScreen.class);
                    AskedQuestion askedQuestion = (AskedQuestion) parcel.readParcelable(InstrumentSelectionScreen.class.getClassLoader());
                    String readString12 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionScreen.class, parcel, arrayList, i, 1);
                    }
                    return new InstrumentSelectionScreen(money, askedQuestion, readString12, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), SelectPaymentInstrumentType.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return TransferOptionPickerAnswer.Dismissed.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new TransferOptionPickerAnswer.LinkTapped(TransferOptions.valueOf(parcel.readString()));
                case 11:
                    parcel.getClass();
                    return new TransferOptionPickerAnswer.Selected(TransferOptionPickerSelectedOption.CREATOR.createFromParcel(parcel));
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return TransferOptionPickerDisplayIcon.CashBalance.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new TransferOptionPickerDisplayIcon.Instrument((Instrument) parcel.readParcelable(TransferOptionPickerDisplayIcon.Instrument.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new TransferOptionPickerDisplayIcon.Savings(parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return TransferOptionPickerQuestion.INSTANCE;
                case 16:
                    Money money2 = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, TransferOptionPickerScreen.class);
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList2.add(TransferOptions.valueOf(parcel.readString()));
                    }
                    return new TransferOptionPickerScreen(money2, arrayList2, (AskedQuestion) parcel.readParcelable(TransferOptionPickerScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? TransferOptionPickerSelection.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, (Screen) parcel.readParcelable(TransferOptionPickerScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new TransferOptionPickerSelectedOption(TransferOptionPickerSelection.CREATOR.createFromParcel(parcel), parcel.readString(), (TransferOptionPickerDisplayIcon) parcel.readParcelable(TransferOptionPickerSelectedOption.class.getClassLoader()), parcel.readString(), (Money) parcel.readParcelable(TransferOptionPickerSelectedOption.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new TransferOptionPickerSelection(TransferOptions.valueOf(parcel.readString()), parcel.readString());
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return WhichInstrument.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new InstrumentAvatarViewModel(parcel.readInt() != 0 ? InstrumentAvatarViewModel.Image.CREATOR.createFromParcel(parcel) : null, (InstrumentAvatarViewModel.FallbackIcon) parcel.readParcelable(InstrumentAvatarViewModel.class.getClassLoader()), parcel.readInt() != 0);
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentAvatarViewModel.FallbackIcon.Add.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentAvatarViewModel.FallbackIcon.AppIcon.INSTANCE;
                case 23:
                    parcel.getClass();
                    return new InstrumentAvatarViewModel.FallbackIcon.Balance(parcel.readInt() != 0 ? CurrencyCode.valueOf(parcel.readString()) : null);
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentAvatarViewModel.FallbackIcon.Bank.INSTANCE;
                case 25:
                    parcel.getClass();
                    return new InstrumentAvatarViewModel.FallbackIcon.Card(parcel.readInt() != 0 ? InstrumentType.valueOf(parcel.readString()) : null);
                case 26:
                    parcel.getClass();
                    return new InstrumentAvatarViewModel.FallbackIcon.EmojiIcon(parcel.readString());
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new InstrumentAvatarViewModel.Image(parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new InstrumentSelectionRowViewModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : InstrumentAvatarViewModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (InstrumentSelection) parcel.readParcelable(InstrumentSelectionRowViewModel.class.getClassLoader()), parcel.readInt() != 0 ? CashInstrumentType.valueOf(parcel.readString()) : null);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Instrument[i];
                case 1:
                    return new ScenarioPlanErrorScreen$Result$Close[i];
                case 2:
                    return new ScenarioPlanErrorScreen$Result$Retry[i];
                case 3:
                    return new BalanceSnapshot[i];
                case 4:
                    return new InstrumentSelectionLoadingScreen[i];
                case 5:
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney[i];
                case 6:
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy[i];
                case 7:
                    return new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw[i];
                case 8:
                    return new InstrumentSelectionScreen[i];
                case 9:
                    return new TransferOptionPickerAnswer.Dismissed[i];
                case 10:
                    return new TransferOptionPickerAnswer.LinkTapped[i];
                case 11:
                    return new TransferOptionPickerAnswer.Selected[i];
                case 12:
                    return new TransferOptionPickerDisplayIcon.CashBalance[i];
                case 13:
                    return new TransferOptionPickerDisplayIcon.Instrument[i];
                case 14:
                    return new TransferOptionPickerDisplayIcon.Savings[i];
                case 15:
                    return new TransferOptionPickerQuestion[i];
                case 16:
                    return new TransferOptionPickerScreen[i];
                case 17:
                    return new TransferOptionPickerSelectedOption[i];
                case 18:
                    return new TransferOptionPickerSelection[i];
                case 19:
                    return new WhichInstrument[i];
                case 20:
                    return new InstrumentAvatarViewModel[i];
                case 21:
                    return new InstrumentAvatarViewModel.FallbackIcon.Add[i];
                case 22:
                    return new InstrumentAvatarViewModel.FallbackIcon.AppIcon[i];
                case 23:
                    return new InstrumentAvatarViewModel.FallbackIcon.Balance[i];
                case 24:
                    return new InstrumentAvatarViewModel.FallbackIcon.Bank[i];
                case 25:
                    return new InstrumentAvatarViewModel.FallbackIcon.Card[i];
                case 26:
                    return new InstrumentAvatarViewModel.FallbackIcon.EmojiIcon[i];
                case 27:
                    return new InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon[i];
                case 28:
                    return new InstrumentAvatarViewModel.Image[i];
                default:
                    return new InstrumentSelectionRowViewModel[i];
            }
        }
    }

    public /* synthetic */ Instrument(String str, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, boolean z, String str11, Long l, int i) {
        this(str, cashInstrumentType, instrumentType, str2, str3, str4, str5, str6, str7, bool, str8, str9, str10, z, (i & 16384) != 0 ? null : str11, l, (String) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instrument)) {
            return false;
        }
        Instrument instrument = (Instrument) obj;
        return Intrinsics.areEqual(this.token, instrument.token) && this.cashInstrumentType == instrument.cashInstrumentType && this.cardBrand == instrument.cardBrand && Intrinsics.areEqual(this.suffix, instrument.suffix) && Intrinsics.areEqual(this.bankName, instrument.bankName) && Intrinsics.areEqual(this.iconUrl, instrument.iconUrl) && Intrinsics.areEqual(this.detailIconUrl, instrument.detailIconUrl) && Intrinsics.areEqual(this.displayName, instrument.displayName) && Intrinsics.areEqual(this.displayNameCompact, instrument.displayNameCompact) && Intrinsics.areEqual(this.pendingVerification, instrument.pendingVerification) && Intrinsics.areEqual(this.selectionIconUrl, instrument.selectionIconUrl) && Intrinsics.areEqual(this.accessoryText, instrument.accessoryText) && Intrinsics.areEqual(this.accessoryIconId, instrument.accessoryIconId) && this.defaultForInstrumentType == instrument.defaultForInstrumentType && Intrinsics.areEqual(this.cardImageUrl, instrument.cardImageUrl) && Intrinsics.areEqual(this.version, instrument.version) && Intrinsics.areEqual(this.loggingSource, instrument.loggingSource);
    }

    public final InstrumentType getCardBrand() {
        return this.cardBrand;
    }

    public final CashInstrumentType getCashInstrumentType() {
        return this.cashInstrumentType;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final int hashCode() {
        int hashCode = (this.cashInstrumentType.hashCode() + (this.token.hashCode() * 31)) * 31;
        InstrumentType instrumentType = this.cardBrand;
        int hashCode2 = (hashCode + (instrumentType == null ? 0 : instrumentType.hashCode())) * 31;
        String str = this.suffix;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detailIconUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayNameCompact;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.pendingVerification;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.selectionIconUrl;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessoryText;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.accessoryIconId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.defaultForInstrumentType);
        String str10 = this.cardImageUrl;
        int hashCode12 = (m + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l = this.version;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        String str11 = this.loggingSource;
        return hashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Instrument(token=");
        sb.append(this.token);
        sb.append(", cashInstrumentType=");
        sb.append(this.cashInstrumentType);
        sb.append(", cardBrand=");
        sb.append(this.cardBrand);
        sb.append(", suffix=");
        sb.append(this.suffix);
        sb.append(", bankName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.bankName, ", iconUrl=", this.iconUrl, ", detailIconUrl=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.detailIconUrl, ", displayName=", this.displayName, ", displayNameCompact=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.displayNameCompact, ", pendingVerification=", this.pendingVerification, ", selectionIconUrl=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.selectionIconUrl, ", accessoryText=", this.accessoryText, ", accessoryIconId=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.accessoryIconId, ", defaultForInstrumentType=", this.defaultForInstrumentType, ", cardImageUrl=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.version, this.cardImageUrl, ", version=", ", loggingSource=", sb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.loggingSource, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.cashInstrumentType.name());
        InstrumentType instrumentType = this.cardBrand;
        if (instrumentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(instrumentType.name());
        }
        parcel.writeString(this.suffix);
        parcel.writeString(this.bankName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.detailIconUrl);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayNameCompact);
        Boolean bool = this.pendingVerification;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeString(this.selectionIconUrl);
        parcel.writeString(this.accessoryText);
        parcel.writeString(this.accessoryIconId);
        parcel.writeInt(this.defaultForInstrumentType ? 1 : 0);
        parcel.writeString(this.cardImageUrl);
        Long l = this.version;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.loggingSource);
    }

    public Instrument(String str, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, boolean z, String str11, Long l, String str12) {
        str.getClass();
        cashInstrumentType.getClass();
        this.token = str;
        this.cashInstrumentType = cashInstrumentType;
        this.cardBrand = instrumentType;
        this.suffix = str2;
        this.bankName = str3;
        this.iconUrl = str4;
        this.detailIconUrl = str5;
        this.displayName = str6;
        this.displayNameCompact = str7;
        this.pendingVerification = bool;
        this.selectionIconUrl = str8;
        this.accessoryText = str9;
        this.accessoryIconId = str10;
        this.defaultForInstrumentType = z;
        this.cardImageUrl = str11;
        this.version = l;
        this.loggingSource = str12;
    }
}

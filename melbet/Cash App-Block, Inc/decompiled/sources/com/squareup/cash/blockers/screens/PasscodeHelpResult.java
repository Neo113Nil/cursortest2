package com.squareup.cash.blockers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.BusinessDetailsBackConfirmResult$Negative;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import java.util.ArrayList;
import okio.ByteString;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PasscodeHelpResult implements Parcelable {
    public static final /* synthetic */ PasscodeHelpResult[] $VALUES;
    public static final Parcelable.Creator<PasscodeHelpResult> CREATOR;
    public static final PasscodeHelpResult Forgot;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return PasscodeHelpResult.valueOf(parcel.readString());
                case 1:
                    parcel.getClass();
                    return new BlockersScreens.WelcomeScreen((BlockersData) parcel.readParcelable(BlockersScreens.WelcomeScreen.class.getClassLoader()));
                case 2:
                    BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, InstrumentSelectionBlockerScreen.class);
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionBlockerScreen.InstrumentSection.CREATOR, parcel, arrayList2, i, 1);
                    }
                    return new InstrumentSelectionBlockerScreen(blockersData, arrayList2, parcel.readString());
                case 3:
                    parcel.getClass();
                    return new InstrumentSelectionBlockerScreen.IconData(parcel.readString(), parcel.readInt() != 0 ? InstrumentSelectionBlockerScreen.IconData.ArcadeIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                case 4:
                    parcel.getClass();
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Link(CashInstrumentType.valueOf(parcel.readString()));
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionBlockerScreen.InstrumentAction.None.INSTANCE;
                case 6:
                    parcel.getClass();
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Replace(CashInstrumentType.valueOf(parcel.readString()), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Select(CashInstrumentType.valueOf(parcel.readString()), parcel.readString());
                case 8:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionBlockerScreen.InstrumentOption.CREATOR, parcel, arrayList3, i, 1);
                    }
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet(readString, readString2, arrayList3);
                case 9:
                    Redacted redacted = (Redacted) NavAction$$ExternalSyntheticOutline0.m(parcel, InstrumentSelectionBlockerScreen.InstrumentSection.class);
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionBlockerScreen.InstrumentOption.CREATOR, parcel, arrayList4, i, 1);
                    }
                    return new InstrumentSelectionBlockerScreen.InstrumentSection(redacted, arrayList4);
                case 10:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt4);
                    int i2 = 0;
                    while (i2 != readInt4) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionData.class, parcel, arrayList5, i2, 1);
                    }
                    InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption = (InstrumentSelectionData.InstrumentOption.PreselectableOption) parcel.readParcelable(InstrumentSelectionData.class.getClassLoader());
                    InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction = (InstrumentSelectionData.PreselectedOptionAction) parcel.readParcelable(InstrumentSelectionData.class.getClassLoader());
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt5 = parcel.readInt();
                        arrayList = new ArrayList(readInt5);
                        int i3 = 0;
                        while (i3 != readInt5) {
                            i3 = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionData.class, parcel, arrayList, i3, 1);
                        }
                    }
                    return new InstrumentSelectionData(readString3, readString4, arrayList5, preselectableOption, preselectedOptionAction, readString5, arrayList, (InstrumentSelectionData.InstrumentOption.PreselectableOption) parcel.readParcelable(InstrumentSelectionData.class.getClassLoader()), (InstrumentSelectionData.PreselectedOptionAction) parcel.readParcelable(InstrumentSelectionData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, InstrumentSelectionData.SubmissionEndpoint.valueOf(parcel.readString()));
                case 11:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.Disabled(parcel.readInt(), InstrumentSelectionData.InstrumentOption.Data.CREATOR.createFromParcel(parcel), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Disabled.class.getClassLoader()), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Disabled.class.getClassLoader()), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Disabled.class.getClassLoader()), (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Disabled.class.getClassLoader()), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog((Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.class.getClassLoader()), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.class.getClassLoader()), parcel.readString(), (BlockerAction) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.class.getClassLoader()), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.Enabled.SelectOption(parcel.readInt(), (ByteString) parcel.readSerializable(), InstrumentSelectionData.InstrumentOption.Data.CREATOR.createFromParcel(parcel), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.SelectOption.class.getClassLoader()), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.SelectOption.class.getClassLoader()), (Redacted) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.SelectOption.class.getClassLoader()), (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail) parcel.readParcelable(InstrumentSelectionData.InstrumentOption.Enabled.SelectOption.class.getClassLoader()), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption(parcel.readInt(), (ByteString) parcel.readSerializable(), InstrumentSelectionData.InstrumentOption.Data.CREATOR.createFromParcel(parcel), InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.CREATOR.createFromParcel(parcel));
                case 15:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.Enabled.SubmitOption(parcel.readInt(), (ByteString) parcel.readSerializable(), InstrumentSelectionData.InstrumentOption.Data.CREATOR.createFromParcel(parcel));
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.InstrumentOption.IconStyle.AppIcon.INSTANCE;
                case 17:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.Balance(CurrencyCode.valueOf(parcel.readString()));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.InstrumentOption.IconStyle.Bank.INSTANCE;
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.InstrumentOption.IconStyle.Card.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon(parcel.readString());
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.InstrumentOption.IconStyle.GooglePayIcon.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.InstrumentOption.IconStyle.NewLink.INSTANCE;
                case 23:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog(parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt6);
                    while (i != readInt6) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow.CREATOR, parcel, arrayList6, i, 1);
                    }
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList(arrayList6);
                case 25:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog.CREATOR.createFromParcel(parcel) : null);
                case 26:
                    parcel.getClass();
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText(parcel.readString(), parcel.readInt() != 0 ? InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog.CREATOR.createFromParcel(parcel) : null);
                case 27:
                    parcel.getClass();
                    return new InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction((InstrumentSelectionData.InstrumentOption.PreselectableOption) parcel.readParcelable(InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction.class.getClassLoader()), InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog.CREATOR.createFromParcel(parcel));
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return BusinessDetailsBackConfirmResult$Negative.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PasscodeHelpResult[i];
                case 1:
                    return new BlockersScreens.WelcomeScreen[i];
                case 2:
                    return new InstrumentSelectionBlockerScreen[i];
                case 3:
                    return new InstrumentSelectionBlockerScreen.IconData[i];
                case 4:
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Link[i];
                case 5:
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.None[i];
                case 6:
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Replace[i];
                case 7:
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.Select[i];
                case 8:
                    return new InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet[i];
                case 9:
                    return new InstrumentSelectionBlockerScreen.InstrumentSection[i];
                case 10:
                    return new InstrumentSelectionData[i];
                case 11:
                    return new InstrumentSelectionData.InstrumentOption.Disabled[i];
                case 12:
                    return new InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog[i];
                case 13:
                    return new InstrumentSelectionData.InstrumentOption.Enabled.SelectOption[i];
                case 14:
                    return new InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption[i];
                case 15:
                    return new InstrumentSelectionData.InstrumentOption.Enabled.SubmitOption[i];
                case 16:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.AppIcon[i];
                case 17:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.Balance[i];
                case 18:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.Bank[i];
                case 19:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.Card[i];
                case 20:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon[i];
                case 21:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.GooglePayIcon[i];
                case 22:
                    return new InstrumentSelectionData.InstrumentOption.IconStyle.NewLink[i];
                case 23:
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog[i];
                case 24:
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList[i];
                case 25:
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow[i];
                case 26:
                    return new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText[i];
                case 27:
                    return new InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction[i];
                case 28:
                    return new InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction[i];
                default:
                    return new BusinessDetailsBackConfirmResult$Negative[i];
            }
        }
    }

    static {
        PasscodeHelpResult passcodeHelpResult = new PasscodeHelpResult("Forgot", 0);
        Forgot = passcodeHelpResult;
        $VALUES = new PasscodeHelpResult[]{passcodeHelpResult};
        CREATOR = new Creator(0);
    }

    public static PasscodeHelpResult valueOf(String str) {
        return (PasscodeHelpResult) Enum.valueOf(PasscodeHelpResult.class, str);
    }

    public static PasscodeHelpResult[] values() {
        return (PasscodeHelpResult[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}

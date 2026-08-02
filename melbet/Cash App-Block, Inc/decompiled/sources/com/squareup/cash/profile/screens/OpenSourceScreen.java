package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.results.CropSuccessResult;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OpenSourceScreen extends ProfileScreens {
    public static final OpenSourceScreen INSTANCE = new OpenSourceScreen();
    public static final Parcelable.Creator<OpenSourceScreen> CREATOR = new Creator(0);

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return OpenSourceScreen.INSTANCE;
                case 1:
                    parcel.getClass();
                    DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason = null;
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    boolean z = true;
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        errorReason = DeviceManagerDeviceRemovalFailedScreen.ErrorReason.valueOf(parcel.readString());
                    }
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    return new DeviceManagerDeviceRemovalFailedFullScreen(createStringArrayList, readInt, errorReason, z, parcel.readInt());
                case 2:
                    parcel.getClass();
                    return new DeviceManagerDeviceRemovalSuccessBottomSheetScreen((Redacted) parcel.readParcelable(DeviceManagerDeviceRemovalSuccessBottomSheetScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new DeviceManagerDeviceRemovalSuccessFullScreen((Redacted) parcel.readParcelable(DeviceManagerDeviceRemovalSuccessFullScreen.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new DeviceManagerListScreen(parcel.createStringArrayList(), parcel.readInt());
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return CropSuccessResult.INSTANCE;
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return ActivePasswordDialog.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new ArcadeAutofillSettingsScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Phone) parcel.readParcelable(ArcadeAutofillSettingsScreen.class.getClassLoader()), (GlobalAddress) parcel.readParcelable(ArcadeAutofillSettingsScreen.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return CashtagRequiredScreen.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new DocumentDownloaderScreen.AccountStatementDownloaderScreen(parcel.readInt() != 0 ? DocumentDownloaderScreen.DocumentData.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new DocumentDownloaderScreen.DefaultDownloaderScreen(DocumentDownloaderScreen.DocumentData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new DocumentDownloaderScreen.DocumentData(parcel.readString(), parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new DocumentsDownloadOptionsScreen(parcel.readString(), StatementType.valueOf(parcel.readString()), (DocumentsScreen) parcel.readParcelable(DocumentsDownloadOptionsScreen.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentScreenPayOverTimeDocuments.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE;
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenCardFeesDocuments.INSTANCE;
                case 17:
                    parcel.getClass();
                    return new DocumentsScreen.DocumentsScreenCategory(parcel.readString());
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenLegalDocument.INSTANCE;
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenMultiSavingsAccount.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new DocumentsScreen.DocumentsScreenMultiStatementAccount(parcel.readInt() != 0);
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new DocumentsScreen.DocumentsScreenStatements(parcel.readString(), com.squareup.protos.cash.registrar.api.StatementType.valueOf(parcel.readString()), (Redacted) parcel.readParcelable(DocumentsScreen.DocumentsScreenStatements.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new DocumentsScreen.DocumentsScreenStockMonthlyForMonth(parcel.readInt());
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentsScreen.DocumentsScreenWages.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new GenericConfirmDialog(parcel.readString(), parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return InvestingContactScreen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new OpenSourceScreen[i];
                case 1:
                    return new DeviceManagerDeviceRemovalFailedFullScreen[i];
                case 2:
                    return new DeviceManagerDeviceRemovalSuccessBottomSheetScreen[i];
                case 3:
                    return new DeviceManagerDeviceRemovalSuccessFullScreen[i];
                case 4:
                    return new DeviceManagerListScreen[i];
                case 5:
                    return new CropSuccessResult[i];
                case 6:
                    return new ActivePasswordDialog[i];
                case 7:
                    return new ArcadeAutofillSettingsScreen[i];
                case 8:
                    return new CashtagRequiredScreen[i];
                case 9:
                    return new DocumentDownloaderScreen.AccountStatementDownloaderScreen[i];
                case 10:
                    return new DocumentDownloaderScreen.DefaultDownloaderScreen[i];
                case 11:
                    return new DocumentDownloaderScreen.DocumentData[i];
                case 12:
                    return new DocumentsDownloadOptionsScreen[i];
                case 13:
                    return new DocumentsScreen.DocumentScreenPayOverTimeDocuments[i];
                case 14:
                    return new DocumentsScreen.DocumentsScreenAfterpayStatements[i];
                case 15:
                    return new DocumentsScreen.DocumentsScreenBitcoinTaxDocument[i];
                case 16:
                    return new DocumentsScreen.DocumentsScreenCardFeesDocuments[i];
                case 17:
                    return new DocumentsScreen.DocumentsScreenCategory[i];
                case 18:
                    return new DocumentsScreen.DocumentsScreenLegalDocument[i];
                case 19:
                    return new DocumentsScreen.DocumentsScreenMultiSavingsAccount[i];
                case 20:
                    return new DocumentsScreen.DocumentsScreenMultiStatementAccount[i];
                case 21:
                    return new DocumentsScreen.DocumentsScreenSavingsTaxDocuments[i];
                case 22:
                    return new DocumentsScreen.DocumentsScreenStatements[i];
                case 23:
                    return new DocumentsScreen.DocumentsScreenStockDocumentTypeSelection[i];
                case 24:
                    return new DocumentsScreen.DocumentsScreenStockMonthlyForMonth[i];
                case 25:
                    return new DocumentsScreen.DocumentsScreenStockMonthlyForYear[i];
                case 26:
                    return new DocumentsScreen.DocumentsScreenStockTaxDocument[i];
                case 27:
                    return new DocumentsScreen.DocumentsScreenWages[i];
                case 28:
                    return new GenericConfirmDialog[i];
                default:
                    return new InvestingContactScreen[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

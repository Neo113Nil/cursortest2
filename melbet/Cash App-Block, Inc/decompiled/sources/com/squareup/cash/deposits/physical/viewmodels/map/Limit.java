package com.squareup.cash.deposits.physical.viewmodels.map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.deposits.physical.viewmodels.result.ExitResult;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormCompletionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupOrigin;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormCompletionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetailsTransitionFactory$AnimationData;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Limit implements Parcelable {
    public static final Parcelable.Creator<Limit> CREATOR = new Creator(0);
    public final String key;
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            PromotionDetails.Identifier identifier;
            boolean z2;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Limit(parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new Benefit(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return ExitResult.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return PaycheckDepositAllocation.All.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new PaycheckDepositAllocation.CurrencyAmount((Money) parcel.readParcelable(PaycheckDepositAllocation.CurrencyAmount.class.getClassLoader()), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new PaycheckDepositAllocation.Percentage(parcel.readInt());
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositEditCompanyNameScreen.CompanyNameQuestion.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new DirectDepositEditCompanyNameScreen(parcel.readString(), (Redacted) parcel.readParcelable(DirectDepositEditCompanyNameScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(DirectDepositEditCompanyNameScreen.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new DirectDepositEditFullNameScreen(parcel.readString(), (Redacted) parcel.readParcelable(DirectDepositEditFullNameScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(DirectDepositEditFullNameScreen.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositEditFullNameScreen.FullNameQuestion.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new DirectDepositEditPaycheckAllocationScreen(parcel.readString(), (AskedQuestion) parcel.readParcelable(DirectDepositEditPaycheckAllocationScreen.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion((PaycheckDepositAllocation) parcel.readParcelable(DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    return new DirectDepositEditPaycheckCurrencyAllocationScreen(parcel.readString(), (AskedQuestion) parcel.readParcelable(DirectDepositEditPaycheckCurrencyAllocationScreen.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    return new DirectDepositEditPaycheckPercentageScreen(parcel.readString(), (AskedQuestion) parcel.readParcelable(DirectDepositEditPaycheckPercentageScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new DirectDepositManualFormCompletionScreen(parcel.readString(), DirectDepositManualFormSubmissionScreen.FormDetails.CREATOR.createFromParcel(parcel));
                case 15:
                    parcel.getClass();
                    return new DirectDepositManualFormDetailsScreen((Redacted) parcel.readParcelable(DirectDepositManualFormDetailsScreen.class.getClassLoader()), parcel.readString());
                case 16:
                    boolean z3 = false;
                    parcel.getClass();
                    Redacted redacted = (Redacted) parcel.readParcelable(DirectDepositManualFormSubmissionScreen.FormDetails.class.getClassLoader());
                    Redacted redacted2 = (Redacted) parcel.readParcelable(DirectDepositManualFormSubmissionScreen.FormDetails.class.getClassLoader());
                    PaycheckDepositAllocation paycheckDepositAllocation = (PaycheckDepositAllocation) parcel.readParcelable(DirectDepositManualFormSubmissionScreen.FormDetails.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    return new DirectDepositManualFormSubmissionScreen.FormDetails(redacted, redacted2, paycheckDepositAllocation, z3);
                case 17:
                    parcel.getClass();
                    return new DirectDepositSetupScreen((Screen) parcel.readParcelable(DirectDepositSetupScreen.class.getClassLoader()), DirectDepositSetupOrigin.valueOf(parcel.readString()), (ColorModel) parcel.readParcelable(DirectDepositSetupScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new DirectDepositUpdateManualFormCompletionScreen(parcel.readString(), DirectDepositManualFormSubmissionScreen.FormDetails.CREATOR.createFromParcel(parcel));
                case 19:
                    parcel.getClass();
                    return new DirectDepositUpdateManualFormScreen(parcel.readString());
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositManualFormCompletionViewModel.Error.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositManualFormCompletionViewModel.Loading.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositManualFormCompletionViewModel.Success.INSTANCE;
                case 23:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z4 = true;
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z4 = false;
                    }
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    return new DirectDepositUpdateManualFormDetailsViewModel.Content(readString, readString2, readString3, z4, z);
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositUpdateManualFormDetailsViewModel.Error.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return DirectDepositUpdateManualFormDetailsViewModel.Loading.INSTANCE;
                case 26:
                    parcel.getClass();
                    PromotionDetails.Identifier identifier2 = (PromotionDetails.Identifier) parcel.readParcelable(PromotionDetails.class.getClassLoader());
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                        identifier = identifier2;
                    } else {
                        identifier = identifier2;
                        z2 = false;
                    }
                    return new PromotionDetails(identifier, readString4, z2, parcel.readInt() == 0 ? null : PromotionDetailsTransitionFactory$AnimationData.CREATOR.createFromParcel(parcel), (Screen) parcel.readParcelable(PromotionDetails.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new PromotionDetails.Identifier.DetailsToken(parcel.readString());
                case 28:
                    parcel.getClass();
                    return new PromotionDetails.Identifier.TemplateToken(parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new PromotionDetails.Identifier.TreehousePath(parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Limit[i];
                case 1:
                    return new Benefit[i];
                case 2:
                    return new ExitResult[i];
                case 3:
                    return new PaycheckDepositAllocation.All[i];
                case 4:
                    return new PaycheckDepositAllocation.CurrencyAmount[i];
                case 5:
                    return new PaycheckDepositAllocation.Percentage[i];
                case 6:
                    return new DirectDepositEditCompanyNameScreen.CompanyNameQuestion[i];
                case 7:
                    return new DirectDepositEditCompanyNameScreen[i];
                case 8:
                    return new DirectDepositEditFullNameScreen[i];
                case 9:
                    return new DirectDepositEditFullNameScreen.FullNameQuestion[i];
                case 10:
                    return new DirectDepositEditPaycheckAllocationScreen[i];
                case 11:
                    return new DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion[i];
                case 12:
                    return new DirectDepositEditPaycheckCurrencyAllocationScreen[i];
                case 13:
                    return new DirectDepositEditPaycheckPercentageScreen[i];
                case 14:
                    return new DirectDepositManualFormCompletionScreen[i];
                case 15:
                    return new DirectDepositManualFormDetailsScreen[i];
                case 16:
                    return new DirectDepositManualFormSubmissionScreen.FormDetails[i];
                case 17:
                    return new DirectDepositSetupScreen[i];
                case 18:
                    return new DirectDepositUpdateManualFormCompletionScreen[i];
                case 19:
                    return new DirectDepositUpdateManualFormScreen[i];
                case 20:
                    return new DirectDepositManualFormCompletionViewModel.Error[i];
                case 21:
                    return new DirectDepositManualFormCompletionViewModel.Loading[i];
                case 22:
                    return new DirectDepositManualFormCompletionViewModel.Success[i];
                case 23:
                    return new DirectDepositUpdateManualFormDetailsViewModel.Content[i];
                case 24:
                    return new DirectDepositUpdateManualFormDetailsViewModel.Error[i];
                case 25:
                    return new DirectDepositUpdateManualFormDetailsViewModel.Loading[i];
                case 26:
                    return new PromotionDetails[i];
                case 27:
                    return new PromotionDetails.Identifier.DetailsToken[i];
                case 28:
                    return new PromotionDetails.Identifier.TemplateToken[i];
                default:
                    return new PromotionDetails.Identifier.TreehousePath[i];
            }
        }
    }

    public Limit(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Limit)) {
            return false;
        }
        Limit limit = (Limit) obj;
        return Intrinsics.areEqual(this.key, limit.key) && Intrinsics.areEqual(this.value, limit.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Limit(key=", this.key, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}

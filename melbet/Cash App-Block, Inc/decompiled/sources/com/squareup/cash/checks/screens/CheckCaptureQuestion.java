package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureExitConfirmationScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.card.onboarding.screens.StampQuestion;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteActivityScreen;
import com.squareup.cash.cashapplite.screens.LiteAddMoneyScreen;
import com.squareup.cash.cashapplite.screens.LiteBalanceHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.screens.LiteCashOutScreen;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import com.squareup.cash.cashapppay.settings.screens.CashAppPaySettingsScreen;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.screens.UnlinkResultScreen;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Negative;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Positive;
import com.squareup.cash.checks.screens.CheckCaptureAnswer;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.franklin.api.PasskeySignatureBlocker;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CheckCaptureQuestion implements Question {
    public static final CheckCaptureQuestion INSTANCE = new CheckCaptureQuestion();
    public static final Parcelable.Creator<CheckCaptureQuestion> CREATOR = new Creator(0);

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckCaptureQuestion.INSTANCE;
                case 1:
                    BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, CardStyleScreen.class);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    float readFloat = parcel.readFloat();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(CardStyleScreen.class, parcel, arrayList, i, 1);
                    }
                    return new CardStyleScreen(blockersData, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readFloat, arrayList, (Redacted) parcel.readParcelable(CardStyleScreen.class.getClassLoader()), parcel.createStringArrayList());
                case 2:
                    parcel.getClass();
                    return new DisclosureExitConfirmationScreen((BlockersData) parcel.readParcelable(DisclosureExitConfirmationScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 3:
                    BlockersData blockersData2 = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, DisclosureScreen.class);
                    Redacted redacted = (Redacted) parcel.readParcelable(DisclosureScreen.class.getClassLoader());
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(DisclosureScreen.class, parcel, arrayList2, i3, 1);
                    }
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i2 != readInt3) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(DisclosureScreen.class, parcel, arrayList3, i2, 1);
                    }
                    return new DisclosureScreen(blockersData2, redacted, arrayList2, readString9, readString10, readString11, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new PatternSignatureStamps(parcel.createStringArrayList());
                case 5:
                    parcel.getClass();
                    return new PatternSignatureStampsV2(parcel.createStringArrayList(), (AskedQuestion) parcel.readParcelable(PatternSignatureStampsV2.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new PaymentDeviceCustomizationScreen((BlockersData) parcel.readParcelable(PaymentDeviceCustomizationScreen.class.getClassLoader()), (PaymentDeviceCustomizationBlocker) parcel.readParcelable(PaymentDeviceCustomizationScreen.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    return new StampQuestion(parcel.createStringArrayList());
                case 8:
                    parcel.getClass();
                    return new TagOrderConfirmationScreen((BlockersData) parcel.readParcelable(TagOrderConfirmationScreen.class.getClassLoader()), (TagConfirmationBlocker) parcel.readParcelable(TagOrderConfirmationScreen.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new CardActivityListScreen(parcel.readString());
                case 10:
                    parcel.getClass();
                    return new SpendingInsightDetailScreen(parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return SpendingInsightsHomeScreen.INSTANCE;
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return LiteActivityScreen.INSTANCE;
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return LiteAddMoneyScreen.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return LiteBalanceHomeScreen.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return LiteCashInScreen.INSTANCE;
                case 16:
                    parcel.getClass();
                    return new LiteCashOutScreen((Money) parcel.readParcelable(LiteCashOutScreen.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new PasskeySignatureBlockerScreen((BlockersData) parcel.readParcelable(PasskeySignatureBlockerScreen.class.getClassLoader()), (PasskeySignatureBlocker) parcel.readParcelable(PasskeySignatureBlockerScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return CashAppPaySettingsScreen.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new ConfirmRemoveLinkedBusinessDialogScreen(parcel.readString(), parcel.readString(), SyncBusinessGrant.ActionType.valueOf(parcel.readString()));
                case 20:
                    parcel.getClass();
                    return new LinkedBusinessDetailsSheet(parcel.readString(), (Image) parcel.readParcelable(LinkedBusinessDetailsSheet.class.getClassLoader()), parcel.readString(), SyncBusinessGrant.ActionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SyncBusinessGrant.RenderingBehavior.valueOf(parcel.readString()));
                case 21:
                    parcel.getClass();
                    return new UnlinkResultScreen(parcel.readInt() != 0, SyncBusinessGrant.ActionType.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return RemoveLinkedBusinessResult$Negative.INSTANCE;
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return RemoveLinkedBusinessResult$Positive.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new CaptureCheckFaceScreen(CheckFace.valueOf(parcel.readString()), (AskedQuestion) parcel.readParcelable(CaptureCheckFaceScreen.class.getClassLoader()), parcel.readString(), (BlockersData) parcel.readParcelable(CaptureCheckFaceScreen.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return CheckCaptureAnswer.Canceled.INSTANCE;
                case 26:
                    parcel.getClass();
                    return new CheckCaptureAnswer.Failure(CheckFace.valueOf(parcel.readString()), parcel.createStringArrayList());
                case 27:
                    parcel.getClass();
                    return new CheckCaptureAnswer.Success(CheckFace.valueOf(parcel.readString()), (ByteString) parcel.readSerializable());
                case 28:
                    parcel.getClass();
                    return new CheckDepositAmountScreen((BlockersData) parcel.readParcelable(CheckDepositAmountScreen.class.getClassLoader()), (CheckDepositBlocker) parcel.readParcelable(CheckDepositAmountScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new ConfirmBackOfCheckScreen((BlockersData) parcel.readParcelable(ConfirmBackOfCheckScreen.class.getClassLoader()), (CheckDepositBlocker) parcel.readParcelable(ConfirmBackOfCheckScreen.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new CheckCaptureQuestion[i];
                case 1:
                    return new CardStyleScreen[i];
                case 2:
                    return new DisclosureExitConfirmationScreen[i];
                case 3:
                    return new DisclosureScreen[i];
                case 4:
                    return new PatternSignatureStamps[i];
                case 5:
                    return new PatternSignatureStampsV2[i];
                case 6:
                    return new PaymentDeviceCustomizationScreen[i];
                case 7:
                    return new StampQuestion[i];
                case 8:
                    return new TagOrderConfirmationScreen[i];
                case 9:
                    return new CardActivityListScreen[i];
                case 10:
                    return new SpendingInsightDetailScreen[i];
                case 11:
                    return new SpendingInsightsHomeScreen[i];
                case 12:
                    return new LiteActivityScreen[i];
                case 13:
                    return new LiteAddMoneyScreen[i];
                case 14:
                    return new LiteBalanceHomeScreen[i];
                case 15:
                    return new LiteCashInScreen[i];
                case 16:
                    return new LiteCashOutScreen[i];
                case 17:
                    return new PasskeySignatureBlockerScreen[i];
                case 18:
                    return new CashAppPaySettingsScreen[i];
                case 19:
                    return new ConfirmRemoveLinkedBusinessDialogScreen[i];
                case 20:
                    return new LinkedBusinessDetailsSheet[i];
                case 21:
                    return new UnlinkResultScreen[i];
                case 22:
                    return new RemoveLinkedBusinessResult$Negative[i];
                case 23:
                    return new RemoveLinkedBusinessResult$Positive[i];
                case 24:
                    return new CaptureCheckFaceScreen[i];
                case 25:
                    return new CheckCaptureAnswer.Canceled[i];
                case 26:
                    return new CheckCaptureAnswer.Failure[i];
                case 27:
                    return new CheckCaptureAnswer.Success[i];
                case 28:
                    return new CheckDepositAmountScreen[i];
                default:
                    return new ConfirmBackOfCheckScreen[i];
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

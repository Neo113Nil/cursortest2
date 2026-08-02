package com.squareup.cash.earnings.screens;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetailsTransitionFactory$AnimationData;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.earningstracker.screens.EarningsTimeframeSelectorSheetScreen;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.screens.NetEarningsInfoSheetScreen;
import com.squareup.cash.earningstracker.screens.TimeframeSelectorSheetResult;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AddPayerCustomersScreen implements Screen {
    public static final Parcelable.Creator<AddPayerCustomersScreen> CREATOR = new Creator(0);
    public final Entrypoint entrypoint;
    public final Screen exitScreen;
    public final String taggedCustomerToken;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ControlType controlType;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new AddPayerCustomersScreen(Entrypoint.valueOf(parcel.readString()), (Screen) parcel.readParcelable(AddPayerCustomersScreen.class.getClassLoader()), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new PromotionDetailsTransitionFactory$AnimationData(parcel.readString(), (Rect) parcel.readParcelable(PromotionDetailsTransitionFactory$AnimationData.class.getClassLoader()), parcel.readDouble());
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.BitcoinDestination.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.CashBalanceDestination.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new AllocationDestination.InvestingDestination(parcel.readString(), parcel.readInt() != 0 ? AllocationDestination.InvestingDestination.UiSpecification.CREATOR.createFromParcel(parcel) : null);
                case 5:
                    parcel.getClass();
                    return new AllocationDestination.InvestingDestination.UiSpecification((Image) parcel.readParcelable(AllocationDestination.InvestingDestination.UiSpecification.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination((AllocationDestination.SavingsDestination.Identifier) parcel.readParcelable(AllocationDestination.SavingsDestination.class.getClassLoader()), parcel.readInt() != 0 ? AllocationDestination.SavingsDestination.UiSpecification.CREATOR.createFromParcel(parcel) : null);
                case 7:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination.Identifier.GoalToken(parcel.readString());
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return AllocationDestination.SavingsDestination.Identifier.None.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination.Identifier.WholeSavings(parcel.readString());
                case 10:
                    parcel.getClass();
                    return new AllocationDestination.SavingsDestination.UiSpecification(parcel.readString(), parcel.readString());
                case 11:
                    int i = 0;
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(EarningsAllocationDistribution.DestinationAndShare.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new EarningsAllocationDistribution(arrayList);
                case 12:
                    parcel.getClass();
                    return new EarningsAllocationDistribution.DestinationAndShare((AllocationDestination) parcel.readParcelable(EarningsAllocationDistribution.DestinationAndShare.class.getClassLoader()), parcel.readLong());
                case 13:
                    parcel.getClass();
                    return new PayerTaggingPromptSheet(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Character.valueOf((char) parcel.readInt()) : null, (Color) parcel.readParcelable(PayerTaggingPromptSheet.class.getClassLoader()), parcel.readString(), (Money) parcel.readParcelable(PayerTaggingPromptSheet.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new EarningsActivityListScreen(parcel.readString());
                case 15:
                    parcel.getClass();
                    return new EarningsHomeScreen(EarningsHomeScreen.Origin.CREATOR.createFromParcel(parcel));
                case 16:
                    parcel.getClass();
                    return EarningsHomeScreen.Origin.valueOf(parcel.readString());
                case 17:
                    parcel.getClass();
                    return new EarningsStreamDetailScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 18:
                    parcel.getClass();
                    return new EarningsTimeframeSelectorSheetScreen(Timeframe.valueOf(parcel.readString()));
                case 19:
                    parcel.getClass();
                    return new EarningsTrackerScreen(EarningsTrackerEntrypoint.valueOf(parcel.readString()), (DateFilter) parcel.readParcelable(EarningsTrackerScreen.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return NetEarningsInfoSheetScreen.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new TimeframeSelectorSheetResult(Timeframe.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    return new EducationStoryScreen(readString, arrayList2, parcel.readInt(), (Screen) parcel.readParcelable(EducationStoryScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(EducationStoryScreen.class.getClassLoader()));
                case 23:
                    int i3 = 0;
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(EducationStoryScreen.CREATOR, parcel, arrayList3, i3, 1);
                    }
                    return new EducationStoryViewPagerScreen(arrayList3, parcel.readInt(), (ColorModel) parcel.readParcelable(EducationStoryViewPagerScreen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    ControlType valueOf = ControlType.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        z = true;
                        controlType = valueOf;
                    } else {
                        controlType = valueOf;
                        z = false;
                    }
                    return new ControlDisablingConfirmationScreen(readString2, readString3, readString4, readString5, controlType, z, (Money) parcel.readParcelable(ControlDisablingConfirmationScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(ControlDisablingConfirmationScreen.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE;
                case 26:
                    parcel.getClass();
                    return new ControlErrorScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 27:
                    parcel.getClass();
                    return new DependentActivityScreen(DependentActivityScreen.ActivityType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
                case 28:
                    parcel.getClass();
                    return new DependentControlScreen.ApprovedContactsControl(ControlType.valueOf(parcel.readString()), parcel.readString());
                default:
                    parcel.getClass();
                    return new DependentControlScreen.ManagedAccount(ControlType.valueOf(parcel.readString()), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new AddPayerCustomersScreen[i];
                case 1:
                    return new PromotionDetailsTransitionFactory$AnimationData[i];
                case 2:
                    return new AllocationDestination.BitcoinDestination[i];
                case 3:
                    return new AllocationDestination.CashBalanceDestination[i];
                case 4:
                    return new AllocationDestination.InvestingDestination[i];
                case 5:
                    return new AllocationDestination.InvestingDestination.UiSpecification[i];
                case 6:
                    return new AllocationDestination.SavingsDestination[i];
                case 7:
                    return new AllocationDestination.SavingsDestination.Identifier.GoalToken[i];
                case 8:
                    return new AllocationDestination.SavingsDestination.Identifier.None[i];
                case 9:
                    return new AllocationDestination.SavingsDestination.Identifier.WholeSavings[i];
                case 10:
                    return new AllocationDestination.SavingsDestination.UiSpecification[i];
                case 11:
                    return new EarningsAllocationDistribution[i];
                case 12:
                    return new EarningsAllocationDistribution.DestinationAndShare[i];
                case 13:
                    return new PayerTaggingPromptSheet[i];
                case 14:
                    return new EarningsActivityListScreen[i];
                case 15:
                    return new EarningsHomeScreen[i];
                case 16:
                    return new EarningsHomeScreen.Origin[i];
                case 17:
                    return new EarningsStreamDetailScreen[i];
                case 18:
                    return new EarningsTimeframeSelectorSheetScreen[i];
                case 19:
                    return new EarningsTrackerScreen[i];
                case 20:
                    return new NetEarningsInfoSheetScreen[i];
                case 21:
                    return new TimeframeSelectorSheetResult[i];
                case 22:
                    return new EducationStoryScreen[i];
                case 23:
                    return new EducationStoryViewPagerScreen[i];
                case 24:
                    return new ControlDisablingConfirmationScreen[i];
                case 25:
                    return new ControlDisablingConfirmationScreen.DisablingConfirmationQuestion[i];
                case 26:
                    return new ControlErrorScreen[i];
                case 27:
                    return new DependentActivityScreen[i];
                case 28:
                    return new DependentControlScreen.ApprovedContactsControl[i];
                default:
                    return new DependentControlScreen.ManagedAccount[i];
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Entrypoint {
        public static final /* synthetic */ Entrypoint[] $VALUES;
        public static final Entrypoint MANAGE;
        public static final Entrypoint POST_KYB;
        public static final Entrypoint RECEIPT;
        public static final Entrypoint REQUEST_FLOW;

        static {
            Entrypoint entrypoint = new Entrypoint("MANAGE", 0);
            MANAGE = entrypoint;
            Entrypoint entrypoint2 = new Entrypoint("POST_KYB", 1);
            POST_KYB = entrypoint2;
            Entrypoint entrypoint3 = new Entrypoint("RECEIPT", 2);
            RECEIPT = entrypoint3;
            Entrypoint entrypoint4 = new Entrypoint("REQUEST_FLOW", 3);
            REQUEST_FLOW = entrypoint4;
            $VALUES = new Entrypoint[]{entrypoint, entrypoint2, entrypoint3, entrypoint4};
        }

        public static Entrypoint valueOf(String str) {
            return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
        }

        public static Entrypoint[] values() {
            return (Entrypoint[]) $VALUES.clone();
        }
    }

    public AddPayerCustomersScreen(Entrypoint entrypoint, Screen screen, String str) {
        entrypoint.getClass();
        this.entrypoint = entrypoint;
        this.exitScreen = screen;
        this.taggedCustomerToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPayerCustomersScreen)) {
            return false;
        }
        AddPayerCustomersScreen addPayerCustomersScreen = (AddPayerCustomersScreen) obj;
        return this.entrypoint == addPayerCustomersScreen.entrypoint && Intrinsics.areEqual(this.exitScreen, addPayerCustomersScreen.exitScreen) && Intrinsics.areEqual(this.taggedCustomerToken, addPayerCustomersScreen.taggedCustomerToken);
    }

    public final int hashCode() {
        int hashCode = this.entrypoint.hashCode() * 31;
        Screen screen = this.exitScreen;
        int hashCode2 = (hashCode + (screen == null ? 0 : screen.hashCode())) * 31;
        String str = this.taggedCustomerToken;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddPayerCustomersScreen(entrypoint=");
        sb.append(this.entrypoint);
        sb.append(", exitScreen=");
        sb.append(this.exitScreen);
        sb.append(", taggedCustomerToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.taggedCustomerToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.entrypoint.name());
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeString(this.taggedCustomerToken);
    }
}

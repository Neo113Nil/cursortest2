package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCashBalanceViewModel {
    public final Activity activity;
    public final String balanceText;
    public final String buttonText;
    public final CardManagementSheetModel cardManagementSheetModel;
    public final String header;
    public final GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks;

    public final class Activity {
        public final boolean canManageCards;
        public final boolean hasMore;
        public final String header;
        public final ArrayList rows;

        public final class Row {
            public final LocalText amount;
            public final String clientRoute;
            public final String description;
            public final String expiresAt;
            public final LocalImage image;
            public final LocalColor imageBackground;
            public final String label;
            public final String transactedAt;

            public Row(LocalImage localImage, String str, String str2, String str3, String str4, LocalText localText, LocalColor localColor, String str5) {
                str.getClass();
                this.image = localImage;
                this.label = str;
                this.description = str2;
                this.transactedAt = str3;
                this.expiresAt = str4;
                this.amount = localText;
                this.imageBackground = localColor;
                this.clientRoute = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(this.image, row.image) && Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.description, row.description) && Intrinsics.areEqual(this.transactedAt, row.transactedAt) && Intrinsics.areEqual(this.expiresAt, row.expiresAt) && Intrinsics.areEqual(this.amount, row.amount) && Intrinsics.areEqual(this.imageBackground, row.imageBackground) && Intrinsics.areEqual(this.clientRoute, row.clientRoute);
            }

            public final int hashCode() {
                LocalImage localImage = this.image;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.label);
                String str = this.description;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.transactedAt;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.expiresAt;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                LocalText localText = this.amount;
                int hashCode4 = (hashCode3 + (localText == null ? 0 : localText.hashCode())) * 31;
                LocalColor localColor = this.imageBackground;
                int hashCode5 = (hashCode4 + (localColor == null ? 0 : localColor.hashCode())) * 31;
                String str4 = this.clientRoute;
                return hashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Row(image=");
                sb.append(this.image);
                sb.append(", label=");
                sb.append(this.label);
                sb.append(", description=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.description, ", transactedAt=", this.transactedAt, ", expiresAt=");
                sb.append(this.expiresAt);
                sb.append(", amount=");
                sb.append(this.amount);
                sb.append(", imageBackground=");
                sb.append(this.imageBackground);
                sb.append(", clientRoute=");
                sb.append(this.clientRoute);
                sb.append(")");
                return sb.toString();
            }
        }

        public Activity(String str, ArrayList arrayList, boolean z, boolean z2) {
            this.header = str;
            this.rows = arrayList;
            this.canManageCards = z;
            this.hasMore = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.header.equals(activity.header) && this.rows.equals(activity.rows) && this.canManageCards == activity.canManageCards && this.hasMore == activity.hasMore;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasMore) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, this.header.hashCode() * 31, 31), 31, this.canManageCards);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, "Activity(header=", this.header, ", rows=", ", canManageCards="), this.canManageCards, ", hasMore=", this.hasMore, ")");
        }
    }

    public LocalCashBalanceViewModel(String str, String str2, String str3, GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks, Activity activity, CardManagementSheetModel cardManagementSheetModel) {
        this.balanceText = str;
        this.header = str2;
        this.buttonText = str3;
        this.howItWorks = howItWorks;
        this.activity = activity;
        this.cardManagementSheetModel = cardManagementSheetModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCashBalanceViewModel)) {
            return false;
        }
        LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) obj;
        return Intrinsics.areEqual(this.balanceText, localCashBalanceViewModel.balanceText) && Intrinsics.areEqual(this.header, localCashBalanceViewModel.header) && Intrinsics.areEqual(this.buttonText, localCashBalanceViewModel.buttonText) && Intrinsics.areEqual(this.howItWorks, localCashBalanceViewModel.howItWorks) && Intrinsics.areEqual(this.activity, localCashBalanceViewModel.activity) && Intrinsics.areEqual(this.cardManagementSheetModel, localCashBalanceViewModel.cardManagementSheetModel);
    }

    public final int hashCode() {
        String str = this.balanceText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.header;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = this.howItWorks;
        int hashCode4 = (hashCode3 + (howItWorks == null ? 0 : howItWorks.hashCode())) * 31;
        Activity activity = this.activity;
        int hashCode5 = (hashCode4 + (activity == null ? 0 : activity.hashCode())) * 31;
        CardManagementSheetModel cardManagementSheetModel = this.cardManagementSheetModel;
        return hashCode5 + (cardManagementSheetModel != null ? cardManagementSheetModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalCashBalanceViewModel(balanceText=", this.balanceText, ", header=", this.header, ", buttonText=");
        m.append(this.buttonText);
        m.append(", howItWorks=");
        m.append(this.howItWorks);
        m.append(", activity=");
        m.append(this.activity);
        m.append(", cardManagementSheetModel=");
        m.append(this.cardManagementSheetModel);
        m.append(")");
        return m.toString();
    }
}

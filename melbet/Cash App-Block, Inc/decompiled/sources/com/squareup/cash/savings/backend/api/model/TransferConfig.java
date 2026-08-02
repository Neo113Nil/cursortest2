package com.squareup.cash.savings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.common.Money;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public interface TransferConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class AlternativeButtonBehavior {
        public static final /* synthetic */ AlternativeButtonBehavior[] $VALUES;
        public static final AlternativeButtonBehavior NONE;
        public static final AlternativeButtonBehavior SHAKE;

        static {
            AlternativeButtonBehavior alternativeButtonBehavior = new AlternativeButtonBehavior("NONE", 0);
            NONE = alternativeButtonBehavior;
            AlternativeButtonBehavior alternativeButtonBehavior2 = new AlternativeButtonBehavior("SHAKE", 1);
            SHAKE = alternativeButtonBehavior2;
            $VALUES = new AlternativeButtonBehavior[]{alternativeButtonBehavior, alternativeButtonBehavior2};
        }

        public static AlternativeButtonBehavior valueOf(String str) {
            return (AlternativeButtonBehavior) Enum.valueOf(AlternativeButtonBehavior.class, str);
        }

        public static AlternativeButtonBehavior[] values() {
            return (AlternativeButtonBehavior[]) $VALUES.clone();
        }
    }

    public final class ClientRouteTemplate implements Parcelable {
        public static final Parcelable.Creator<ClientRouteTemplate> CREATOR = new Recipient.Creator(24);
        public final long argumentCount;
        public final String formatString;
        public final String zeroArgVerbatimString;

        public ClientRouteTemplate(long j, String str, String str2) {
            str.getClass();
            this.formatString = str;
            this.argumentCount = j;
            this.zeroArgVerbatimString = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientRouteTemplate)) {
                return false;
            }
            ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
            return Intrinsics.areEqual(this.formatString, clientRouteTemplate.formatString) && this.argumentCount == clientRouteTemplate.argumentCount && Intrinsics.areEqual(this.zeroArgVerbatimString, clientRouteTemplate.zeroArgVerbatimString);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.formatString.hashCode() * 31, 31, this.argumentCount);
            String str = this.zeroArgVerbatimString;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("ClientRouteTemplate(formatString=", this.formatString, ", argumentCount=", this.argumentCount), ", zeroArgVerbatimString=", this.zeroArgVerbatimString, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.formatString);
            parcel.writeLong(this.argumentCount);
            parcel.writeString(this.zeroArgVerbatimString);
        }
    }

    /* loaded from: classes7.dex */
    public final class TransferInConfig implements TransferConfig, Parcelable {
        public static final Parcelable.Creator<TransferInConfig> CREATOR = new Recipient.Creator(25);
        public final CdfEvent cdfEvent;
        public final ClientRouteTemplate clientRouteTemplate;
        public final Money initiallySelectedAmount;
        public final Money maximumAmount;
        public final Money minimumAmount;
        public final List quickAmounts;

        public TransferInConfig(List list, Money money, Money money2, Money money3, CdfEvent cdfEvent, ClientRouteTemplate clientRouteTemplate) {
            list.getClass();
            money2.getClass();
            money3.getClass();
            this.quickAmounts = list;
            this.initiallySelectedAmount = money;
            this.minimumAmount = money2;
            this.maximumAmount = money3;
            this.cdfEvent = cdfEvent;
            this.clientRouteTemplate = clientRouteTemplate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransferInConfig)) {
                return false;
            }
            TransferInConfig transferInConfig = (TransferInConfig) obj;
            return Intrinsics.areEqual(this.quickAmounts, transferInConfig.quickAmounts) && Intrinsics.areEqual(this.initiallySelectedAmount, transferInConfig.initiallySelectedAmount) && Intrinsics.areEqual(this.minimumAmount, transferInConfig.minimumAmount) && Intrinsics.areEqual(this.maximumAmount, transferInConfig.maximumAmount) && Intrinsics.areEqual(this.cdfEvent, transferInConfig.cdfEvent) && Intrinsics.areEqual(this.clientRouteTemplate, transferInConfig.clientRouteTemplate);
        }

        @Override // com.squareup.cash.savings.backend.api.model.TransferConfig
        public final ClientRouteTemplate getClientRouteTemplate() {
            return this.clientRouteTemplate;
        }

        public final int hashCode() {
            int hashCode = this.quickAmounts.hashCode() * 31;
            Money money = this.initiallySelectedAmount;
            int m = NavAction$$ExternalSyntheticOutline0.m(this.maximumAmount, NavAction$$ExternalSyntheticOutline0.m(this.minimumAmount, (hashCode + (money == null ? 0 : money.hashCode())) * 31, 31), 31);
            CdfEvent cdfEvent = this.cdfEvent;
            int hashCode2 = (m + (cdfEvent == null ? 0 : cdfEvent.hashCode())) * 31;
            ClientRouteTemplate clientRouteTemplate = this.clientRouteTemplate;
            return hashCode2 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0);
        }

        public final String toString() {
            return "TransferInConfig(quickAmounts=" + this.quickAmounts + ", initiallySelectedAmount=" + this.initiallySelectedAmount + ", minimumAmount=" + this.minimumAmount + ", maximumAmount=" + this.maximumAmount + ", cdfEvent=" + this.cdfEvent + ", clientRouteTemplate=" + this.clientRouteTemplate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.quickAmounts, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.initiallySelectedAmount, i);
            parcel.writeParcelable(this.minimumAmount, i);
            parcel.writeParcelable(this.maximumAmount, i);
            parcel.writeParcelable(this.cdfEvent, i);
            ClientRouteTemplate clientRouteTemplate = this.clientRouteTemplate;
            if (clientRouteTemplate == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clientRouteTemplate.writeToParcel(parcel, i);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class TransferOutConfig implements TransferConfig, Parcelable {
        public static final Parcelable.Creator<TransferOutConfig> CREATOR = new Recipient.Creator(26);
        public final CdfEvent cdfEvent;
        public final ClientRouteTemplate clientRouteTemplate;
        public final Money minimumAmount;
        public final AlternativeButtonBehavior zeroBalanceBehavior;

        public TransferOutConfig(Money money, CdfEvent cdfEvent, ClientRouteTemplate clientRouteTemplate, AlternativeButtonBehavior alternativeButtonBehavior) {
            money.getClass();
            alternativeButtonBehavior.getClass();
            this.minimumAmount = money;
            this.cdfEvent = cdfEvent;
            this.clientRouteTemplate = clientRouteTemplate;
            this.zeroBalanceBehavior = alternativeButtonBehavior;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransferOutConfig)) {
                return false;
            }
            TransferOutConfig transferOutConfig = (TransferOutConfig) obj;
            return Intrinsics.areEqual(this.minimumAmount, transferOutConfig.minimumAmount) && Intrinsics.areEqual(this.cdfEvent, transferOutConfig.cdfEvent) && Intrinsics.areEqual(this.clientRouteTemplate, transferOutConfig.clientRouteTemplate) && this.zeroBalanceBehavior == transferOutConfig.zeroBalanceBehavior;
        }

        @Override // com.squareup.cash.savings.backend.api.model.TransferConfig
        public final ClientRouteTemplate getClientRouteTemplate() {
            return this.clientRouteTemplate;
        }

        public final int hashCode() {
            int hashCode = this.minimumAmount.hashCode() * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            int hashCode2 = (hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode())) * 31;
            ClientRouteTemplate clientRouteTemplate = this.clientRouteTemplate;
            return this.zeroBalanceBehavior.hashCode() + ((hashCode2 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "TransferOutConfig(minimumAmount=" + this.minimumAmount + ", cdfEvent=" + this.cdfEvent + ", clientRouteTemplate=" + this.clientRouteTemplate + ", zeroBalanceBehavior=" + this.zeroBalanceBehavior + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minimumAmount, i);
            parcel.writeParcelable(this.cdfEvent, i);
            ClientRouteTemplate clientRouteTemplate = this.clientRouteTemplate;
            if (clientRouteTemplate == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clientRouteTemplate.writeToParcel(parcel, i);
            }
            parcel.writeString(this.zeroBalanceBehavior.name());
        }
    }

    ClientRouteTemplate getClientRouteTemplate();
}

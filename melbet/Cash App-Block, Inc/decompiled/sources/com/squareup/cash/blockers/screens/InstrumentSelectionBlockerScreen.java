package com.squareup.cash.blockers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentSelectionBlockerScreen implements BlockersScreens {
    public static final Parcelable.Creator<InstrumentSelectionBlockerScreen> CREATOR = new PasscodeHelpResult.Creator(2);
    public final BlockersData blockersData;
    public final String ctaButtonLabel;
    public final List instrumentSection;

    /* loaded from: classes4.dex */
    public final class IconData implements Parcelable {
        public static final Parcelable.Creator<IconData> CREATOR = new PasscodeHelpResult.Creator(3);
        public final ArcadeIcon arcadeIcon;
        public final String cardImageUrl;
        public final String iconUrl;

        public final class ArcadeIcon implements Parcelable {
            public static final Parcelable.Creator<ArcadeIcon> CREATOR = new Creator();
            public final String arcadeId;
            public final InstrumentSelectionBlockerV3.IconBackgroundColor backgroundColor;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new ArcadeIcon(parcel.readString(), parcel.readInt() == 0 ? null : InstrumentSelectionBlockerV3.IconBackgroundColor.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ArcadeIcon[i];
                }
            }

            public ArcadeIcon(String str, InstrumentSelectionBlockerV3.IconBackgroundColor iconBackgroundColor) {
                str.getClass();
                this.arcadeId = str;
                this.backgroundColor = iconBackgroundColor;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ArcadeIcon)) {
                    return false;
                }
                ArcadeIcon arcadeIcon = (ArcadeIcon) obj;
                return Intrinsics.areEqual(this.arcadeId, arcadeIcon.arcadeId) && this.backgroundColor == arcadeIcon.backgroundColor;
            }

            public final int hashCode() {
                int hashCode = this.arcadeId.hashCode() * 31;
                InstrumentSelectionBlockerV3.IconBackgroundColor iconBackgroundColor = this.backgroundColor;
                return hashCode + (iconBackgroundColor == null ? 0 : iconBackgroundColor.hashCode());
            }

            public final String toString() {
                return "ArcadeIcon(arcadeId=" + this.arcadeId + ", backgroundColor=" + this.backgroundColor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.arcadeId);
                InstrumentSelectionBlockerV3.IconBackgroundColor iconBackgroundColor = this.backgroundColor;
                if (iconBackgroundColor == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(iconBackgroundColor.name());
                }
            }
        }

        public IconData(String str, ArcadeIcon arcadeIcon, String str2) {
            this.iconUrl = str;
            this.arcadeIcon = arcadeIcon;
            this.cardImageUrl = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconData)) {
                return false;
            }
            IconData iconData = (IconData) obj;
            return Intrinsics.areEqual(this.iconUrl, iconData.iconUrl) && Intrinsics.areEqual(this.arcadeIcon, iconData.arcadeIcon) && Intrinsics.areEqual(this.cardImageUrl, iconData.cardImageUrl);
        }

        public final int hashCode() {
            String str = this.iconUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ArcadeIcon arcadeIcon = this.arcadeIcon;
            int hashCode2 = (hashCode + (arcadeIcon == null ? 0 : arcadeIcon.hashCode())) * 31;
            String str2 = this.cardImageUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconData(iconUrl=");
            sb.append(this.iconUrl);
            sb.append(", arcadeIcon=");
            sb.append(this.arcadeIcon);
            sb.append(", cardImageUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cardImageUrl, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.iconUrl);
            ArcadeIcon arcadeIcon = this.arcadeIcon;
            if (arcadeIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                arcadeIcon.writeToParcel(parcel, i);
            }
            parcel.writeString(this.cardImageUrl);
        }
    }

    /* loaded from: classes4.dex */
    public interface InstrumentAction extends Parcelable {

        public final class Link implements InstrumentAction, Parcelable {
            public static final Parcelable.Creator<Link> CREATOR = new PasscodeHelpResult.Creator(4);
            public final CashInstrumentType instrumentType;

            public Link(CashInstrumentType cashInstrumentType) {
                cashInstrumentType.getClass();
                this.instrumentType = cashInstrumentType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Link) && this.instrumentType == ((Link) obj).instrumentType;
            }

            public final int hashCode() {
                return this.instrumentType.hashCode();
            }

            public final String toString() {
                return "Link(instrumentType=" + this.instrumentType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.instrumentType.name());
            }
        }

        public final class None implements InstrumentAction {
            public static final None INSTANCE = new None();
            public static final Parcelable.Creator<None> CREATOR = new PasscodeHelpResult.Creator(5);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return 5044614;
            }

            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Replace implements InstrumentAction, Parcelable {
            public static final Parcelable.Creator<Replace> CREATOR = new PasscodeHelpResult.Creator(6);
            public final String instrumentToken;
            public final CashInstrumentType instrumentType;

            public Replace(CashInstrumentType cashInstrumentType, String str) {
                str.getClass();
                cashInstrumentType.getClass();
                this.instrumentToken = str;
                this.instrumentType = cashInstrumentType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Replace)) {
                    return false;
                }
                Replace replace = (Replace) obj;
                return Intrinsics.areEqual(this.instrumentToken, replace.instrumentToken) && this.instrumentType == replace.instrumentType;
            }

            public final int hashCode() {
                return this.instrumentType.hashCode() + (this.instrumentToken.hashCode() * 31);
            }

            public final String toString() {
                return "Replace(instrumentToken=" + this.instrumentToken + ", instrumentType=" + this.instrumentType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.instrumentToken);
                parcel.writeString(this.instrumentType.name());
            }
        }

        public final class Select implements InstrumentAction, Parcelable {
            public static final Parcelable.Creator<Select> CREATOR = new PasscodeHelpResult.Creator(7);
            public final String instrumentToken;
            public final CashInstrumentType instrumentType;

            public Select(CashInstrumentType cashInstrumentType, String str) {
                str.getClass();
                cashInstrumentType.getClass();
                this.instrumentToken = str;
                this.instrumentType = cashInstrumentType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Select)) {
                    return false;
                }
                Select select = (Select) obj;
                return Intrinsics.areEqual(this.instrumentToken, select.instrumentToken) && this.instrumentType == select.instrumentType;
            }

            public final int hashCode() {
                return this.instrumentType.hashCode() + (this.instrumentToken.hashCode() * 31);
            }

            public final String toString() {
                return "Select(instrumentToken=" + this.instrumentToken + ", instrumentType=" + this.instrumentType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.instrumentToken);
                parcel.writeString(this.instrumentType.name());
            }
        }

        public final class ShowSheet implements InstrumentAction, Parcelable {
            public static final Parcelable.Creator<ShowSheet> CREATOR = new PasscodeHelpResult.Creator(8);
            public final String description;
            public final ArrayList options;
            public final String title;

            public ShowSheet(String str, String str2, ArrayList arrayList) {
                str.getClass();
                this.title = str;
                this.description = str2;
                this.options = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSheet)) {
                    return false;
                }
                ShowSheet showSheet = (ShowSheet) obj;
                return Intrinsics.areEqual(this.title, showSheet.title) && Intrinsics.areEqual(this.description, showSheet.description) && this.options.equals(showSheet.options);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.description;
                return this.options.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowSheet(title=", this.title, ", description=", this.description, ", options="), this.options);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.options, parcel);
                while (m.hasNext()) {
                    ((InstrumentOption) m.next()).writeToParcel(parcel, i);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class InstrumentOption implements Parcelable {
        public static final Parcelable.Creator<InstrumentOption> CREATOR = new Creator();
        public final InstrumentAction action;
        public final IconData iconData;
        public final Redacted infoMessage;
        public final CashInstrumentType instrumentType;
        public final boolean selected;
        public final String subtitle;
        public final InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel tertiaryLabel;
        public final String title;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InstrumentOption(parcel.readString(), parcel.readString(), (InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel) parcel.readParcelable(InstrumentOption.class.getClassLoader()), (InstrumentAction) parcel.readParcelable(InstrumentOption.class.getClassLoader()), IconData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Redacted) parcel.readParcelable(InstrumentOption.class.getClassLoader()), parcel.readInt() == 0 ? null : CashInstrumentType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstrumentOption[i];
            }
        }

        public InstrumentOption(String str, String str2, InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel instrumentLabel, InstrumentAction instrumentAction, IconData iconData, boolean z, Redacted redacted, CashInstrumentType cashInstrumentType) {
            str.getClass();
            instrumentAction.getClass();
            iconData.getClass();
            this.title = str;
            this.subtitle = str2;
            this.tertiaryLabel = instrumentLabel;
            this.action = instrumentAction;
            this.iconData = iconData;
            this.selected = z;
            this.infoMessage = redacted;
            this.instrumentType = cashInstrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentOption)) {
                return false;
            }
            InstrumentOption instrumentOption = (InstrumentOption) obj;
            return Intrinsics.areEqual(this.title, instrumentOption.title) && Intrinsics.areEqual(this.subtitle, instrumentOption.subtitle) && Intrinsics.areEqual(this.tertiaryLabel, instrumentOption.tertiaryLabel) && Intrinsics.areEqual(this.action, instrumentOption.action) && Intrinsics.areEqual(this.iconData, instrumentOption.iconData) && this.selected == instrumentOption.selected && Intrinsics.areEqual(this.infoMessage, instrumentOption.infoMessage) && this.instrumentType == instrumentOption.instrumentType;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel instrumentLabel = this.tertiaryLabel;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.iconData.hashCode() + ((this.action.hashCode() + ((hashCode2 + (instrumentLabel == null ? 0 : instrumentLabel.hashCode())) * 31)) * 31)) * 31, 31, this.selected);
            Redacted redacted = this.infoMessage;
            int hashCode3 = (m + (redacted == null ? 0 : redacted.hashCode())) * 31;
            CashInstrumentType cashInstrumentType = this.instrumentType;
            return hashCode3 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentOption(title=", this.title, ", subtitle=", this.subtitle, ", tertiaryLabel=");
            m.append(this.tertiaryLabel);
            m.append(", action=");
            m.append(this.action);
            m.append(", iconData=");
            m.append(this.iconData);
            m.append(", selected=");
            m.append(this.selected);
            m.append(", infoMessage=");
            m.append(this.infoMessage);
            m.append(", instrumentType=");
            m.append(this.instrumentType);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.tertiaryLabel, i);
            parcel.writeParcelable(this.action, i);
            this.iconData.writeToParcel(parcel, i);
            parcel.writeInt(this.selected ? 1 : 0);
            parcel.writeParcelable(this.infoMessage, i);
            CashInstrumentType cashInstrumentType = this.instrumentType;
            if (cashInstrumentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cashInstrumentType.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class InstrumentSection implements Parcelable {
        public static final Parcelable.Creator<InstrumentSection> CREATOR = new PasscodeHelpResult.Creator(9);
        public final ArrayList instrumentOptions;
        public final Redacted title;

        public InstrumentSection(Redacted redacted, ArrayList arrayList) {
            redacted.getClass();
            this.title = redacted;
            this.instrumentOptions = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentSection)) {
                return false;
            }
            InstrumentSection instrumentSection = (InstrumentSection) obj;
            return Intrinsics.areEqual(this.title, instrumentSection.title) && this.instrumentOptions.equals(instrumentSection.instrumentOptions);
        }

        public final int hashCode() {
            return this.instrumentOptions.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "InstrumentSection(title=" + this.title + ", instrumentOptions=" + this.instrumentOptions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.title, i);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.instrumentOptions, parcel);
            while (m.hasNext()) {
                ((InstrumentOption) m.next()).writeToParcel(parcel, i);
            }
        }
    }

    public InstrumentSelectionBlockerScreen(BlockersData blockersData, List list, String str) {
        blockersData.getClass();
        list.getClass();
        str.getClass();
        this.blockersData = blockersData;
        this.instrumentSection = list;
        this.ctaButtonLabel = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionBlockerScreen)) {
            return false;
        }
        InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen = (InstrumentSelectionBlockerScreen) obj;
        return Intrinsics.areEqual(this.blockersData, instrumentSelectionBlockerScreen.blockersData) && Intrinsics.areEqual(this.instrumentSection, instrumentSelectionBlockerScreen.instrumentSection) && Intrinsics.areEqual(this.ctaButtonLabel, instrumentSelectionBlockerScreen.ctaButtonLabel);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.ctaButtonLabel.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.blockersData.hashCode() * 31, 31, this.instrumentSection);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentSelectionBlockerScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", instrumentSection=");
        sb.append(this.instrumentSection);
        sb.append(", ctaButtonLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ctaButtonLabel, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.instrumentSection, parcel);
        while (m.hasNext()) {
            ((InstrumentSection) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.ctaButtonLabel);
    }
}

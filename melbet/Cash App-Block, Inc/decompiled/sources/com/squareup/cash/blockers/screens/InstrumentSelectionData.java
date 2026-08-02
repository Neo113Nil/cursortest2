package com.squareup.cash.blockers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes4.dex */
public final class InstrumentSelectionData implements Parcelable {
    public static final Parcelable.Creator<InstrumentSelectionData> CREATOR = new PasscodeHelpResult.Creator(10);
    public final String headerText;
    public final InstrumentOption.PreselectableOption initialSecondarySelectedOption;
    public final InstrumentOption.PreselectableOption initialSelectedOption;
    public final String listDismissButtonText;
    public final String listHeaderTitle;
    public final ArrayList options;
    public final PreselectedOptionAction preselectedOptionAction;
    public final PreselectedOptionAction preselectedSecondaryOptionAction;
    public final String secondaryListHeaderTitle;
    public final List secondaryOptions;
    public final String selectedInstrumentLabel;
    public final SubmissionEndpoint submissionEndpoint;
    public final String submitButtonText;
    public final boolean useSecondaryOptionDetails;

    public interface InstrumentOption extends Parcelable {

        public final class Data implements Parcelable {
            public static final Parcelable.Creator<Data> CREATOR = new Creator();
            public final Image avatar;
            public final IconStyle iconStyle;
            public final String listPillText;
            public final Redacted listSubtitlePrimary;
            public final Redacted listSubtitleSuffix;
            public final Redacted listTitle;
            public final InstrumentSelectionBlocker.OptionStyle optionStyle;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Data((Image) parcel.readParcelable(Data.class.getClassLoader()), (IconStyle) parcel.readParcelable(Data.class.getClassLoader()), InstrumentSelectionBlocker.OptionStyle.valueOf(parcel.readString()), (Redacted) parcel.readParcelable(Data.class.getClassLoader()), (Redacted) parcel.readParcelable(Data.class.getClassLoader()), (Redacted) parcel.readParcelable(Data.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Data[i];
                }
            }

            public Data(Image image, IconStyle iconStyle, InstrumentSelectionBlocker.OptionStyle optionStyle, Redacted redacted, Redacted redacted2, Redacted redacted3, String str) {
                iconStyle.getClass();
                optionStyle.getClass();
                redacted.getClass();
                this.avatar = image;
                this.iconStyle = iconStyle;
                this.optionStyle = optionStyle;
                this.listTitle = redacted;
                this.listSubtitlePrimary = redacted2;
                this.listSubtitleSuffix = redacted3;
                this.listPillText = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.avatar, data.avatar) && Intrinsics.areEqual(this.iconStyle, data.iconStyle) && this.optionStyle == data.optionStyle && Intrinsics.areEqual(this.listTitle, data.listTitle) && Intrinsics.areEqual(this.listSubtitlePrimary, data.listSubtitlePrimary) && Intrinsics.areEqual(this.listSubtitleSuffix, data.listSubtitleSuffix) && Intrinsics.areEqual(this.listPillText, data.listPillText);
            }

            public final int hashCode() {
                Image image = this.avatar;
                int m = re$$ExternalSyntheticOutline0.m(this.listTitle, (this.optionStyle.hashCode() + ((this.iconStyle.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31)) * 31, 31);
                Redacted redacted = this.listSubtitlePrimary;
                int hashCode = (m + (redacted == null ? 0 : redacted.hashCode())) * 31;
                Redacted redacted2 = this.listSubtitleSuffix;
                int hashCode2 = (hashCode + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
                String str = this.listPillText;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(avatar=");
                sb.append(this.avatar);
                sb.append(", iconStyle=");
                sb.append(this.iconStyle);
                sb.append(", optionStyle=");
                sb.append(this.optionStyle);
                sb.append(", listTitle=");
                sb.append(this.listTitle);
                sb.append(", listSubtitlePrimary=");
                sb.append(this.listSubtitlePrimary);
                sb.append(", listSubtitleSuffix=");
                sb.append(this.listSubtitleSuffix);
                sb.append(", listPillText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.listPillText, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.avatar, i);
                parcel.writeParcelable(this.iconStyle, i);
                parcel.writeString(this.optionStyle.name());
                parcel.writeParcelable(this.listTitle, i);
                parcel.writeParcelable(this.listSubtitlePrimary, i);
                parcel.writeParcelable(this.listSubtitleSuffix, i);
                parcel.writeString(this.listPillText);
            }
        }

        public final class Disabled implements InstrumentOption, PreselectableOption {
            public static final Parcelable.Creator<Disabled> CREATOR = new PasscodeHelpResult.Creator(11);
            public final Data data;
            public final PreselectableOption.Detail detail;
            public final String headerText;
            public final int id;
            public final Redacted subtitlePrimary;
            public final Redacted subtitleSuffix;
            public final Redacted title;

            public Disabled(int i, Data data, Redacted redacted, Redacted redacted2, Redacted redacted3, PreselectableOption.Detail detail, String str) {
                data.getClass();
                this.id = i;
                this.data = data;
                this.title = redacted;
                this.subtitlePrimary = redacted2;
                this.subtitleSuffix = redacted3;
                this.detail = detail;
                this.headerText = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Disabled)) {
                    return false;
                }
                Disabled disabled = (Disabled) obj;
                return this.id == disabled.id && Intrinsics.areEqual(this.data, disabled.data) && Intrinsics.areEqual(this.title, disabled.title) && Intrinsics.areEqual(this.subtitlePrimary, disabled.subtitlePrimary) && Intrinsics.areEqual(this.subtitleSuffix, disabled.subtitleSuffix) && Intrinsics.areEqual(this.detail, disabled.detail) && Intrinsics.areEqual(this.headerText, disabled.headerText);
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
            public final PreselectableOption.Detail getDetail() {
                return this.detail;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
            public final String getHeaderText() {
                return this.headerText;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
            public final int getId() {
                return this.id;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
            public final Redacted getSubtitlePrimary() {
                return this.subtitlePrimary;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
            public final Redacted getSubtitleSuffix() {
                return this.subtitleSuffix;
            }

            @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
            public final Redacted getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int hashCode = (this.data.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
                Redacted redacted = this.title;
                int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
                Redacted redacted2 = this.subtitlePrimary;
                int hashCode3 = (hashCode2 + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
                Redacted redacted3 = this.subtitleSuffix;
                int hashCode4 = (hashCode3 + (redacted3 == null ? 0 : redacted3.hashCode())) * 31;
                PreselectableOption.Detail detail = this.detail;
                int hashCode5 = (hashCode4 + (detail == null ? 0 : detail.hashCode())) * 31;
                String str = this.headerText;
                return hashCode5 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Disabled(id=");
                sb.append(this.id);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitlePrimary=");
                sb.append(this.subtitlePrimary);
                sb.append(", subtitleSuffix=");
                sb.append(this.subtitleSuffix);
                sb.append(", detail=");
                sb.append(this.detail);
                sb.append(", headerText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.headerText, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.id);
                this.data.writeToParcel(parcel, i);
                parcel.writeParcelable(this.title, i);
                parcel.writeParcelable(this.subtitlePrimary, i);
                parcel.writeParcelable(this.subtitleSuffix, i);
                parcel.writeParcelable(this.detail, i);
                parcel.writeString(this.headerText);
            }
        }

        /* loaded from: classes6.dex */
        public interface Enabled extends InstrumentOption {

            /* loaded from: classes4.dex */
            public final class OptionDialog implements Parcelable {
                public static final Parcelable.Creator<OptionDialog> CREATOR = new PasscodeHelpResult.Creator(12);
                public final BlockerAction blockerAction;
                public final Redacted body;
                public final String dismissButtonText;
                public final String submitButtonText;
                public final Redacted title;

                public OptionDialog(Redacted redacted, Redacted redacted2, String str, BlockerAction blockerAction, String str2) {
                    redacted.getClass();
                    blockerAction.getClass();
                    str2.getClass();
                    this.title = redacted;
                    this.body = redacted2;
                    this.submitButtonText = str;
                    this.blockerAction = blockerAction;
                    this.dismissButtonText = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OptionDialog)) {
                        return false;
                    }
                    OptionDialog optionDialog = (OptionDialog) obj;
                    return Intrinsics.areEqual(this.title, optionDialog.title) && Intrinsics.areEqual(this.body, optionDialog.body) && Intrinsics.areEqual(this.submitButtonText, optionDialog.submitButtonText) && Intrinsics.areEqual(this.blockerAction, optionDialog.blockerAction) && Intrinsics.areEqual(this.dismissButtonText, optionDialog.dismissButtonText);
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    Redacted redacted = this.body;
                    int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
                    String str = this.submitButtonText;
                    return this.dismissButtonText.hashCode() + ((this.blockerAction.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OptionDialog(title=");
                    sb.append(this.title);
                    sb.append(", body=");
                    sb.append(this.body);
                    sb.append(", submitButtonText=");
                    sb.append(this.submitButtonText);
                    sb.append(", blockerAction=");
                    sb.append(this.blockerAction);
                    sb.append(", dismissButtonText=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dismissButtonText, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.title, i);
                    parcel.writeParcelable(this.body, i);
                    parcel.writeString(this.submitButtonText);
                    parcel.writeParcelable(this.blockerAction, i);
                    parcel.writeString(this.dismissButtonText);
                }
            }

            /* loaded from: classes4.dex */
            public final class SelectOption implements Enabled, PreselectableOption {
                public static final Parcelable.Creator<SelectOption> CREATOR = new PasscodeHelpResult.Creator(13);
                public final Data data;
                public final PreselectableOption.Detail detail;
                public final ByteString encodedSelectedOption;
                public final String headerText;
                public final int id;
                public final Redacted subtitlePrimary;
                public final Redacted subtitleSuffix;
                public final Redacted title;

                public SelectOption(int i, ByteString byteString, Data data, Redacted redacted, Redacted redacted2, Redacted redacted3, PreselectableOption.Detail detail, String str) {
                    byteString.getClass();
                    data.getClass();
                    redacted.getClass();
                    this.id = i;
                    this.encodedSelectedOption = byteString;
                    this.data = data;
                    this.title = redacted;
                    this.subtitlePrimary = redacted2;
                    this.subtitleSuffix = redacted3;
                    this.detail = detail;
                    this.headerText = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SelectOption)) {
                        return false;
                    }
                    SelectOption selectOption = (SelectOption) obj;
                    return this.id == selectOption.id && Intrinsics.areEqual(this.encodedSelectedOption, selectOption.encodedSelectedOption) && Intrinsics.areEqual(this.data, selectOption.data) && Intrinsics.areEqual(this.title, selectOption.title) && Intrinsics.areEqual(this.subtitlePrimary, selectOption.subtitlePrimary) && Intrinsics.areEqual(this.subtitleSuffix, selectOption.subtitleSuffix) && Intrinsics.areEqual(this.detail, selectOption.detail) && Intrinsics.areEqual(this.headerText, selectOption.headerText);
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final Data getData() {
                    return this.data;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
                public final PreselectableOption.Detail getDetail() {
                    return this.detail;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.Enabled
                public final ByteString getEncodedSelectedOption() {
                    return this.encodedSelectedOption;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
                public final String getHeaderText() {
                    return this.headerText;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final int getId() {
                    return this.id;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
                public final Redacted getSubtitlePrimary() {
                    return this.subtitlePrimary;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
                public final Redacted getSubtitleSuffix() {
                    return this.subtitleSuffix;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.PreselectableOption
                public final Redacted getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int m = re$$ExternalSyntheticOutline0.m(this.title, (this.data.hashCode() + ((this.encodedSelectedOption.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31);
                    Redacted redacted = this.subtitlePrimary;
                    int hashCode = (m + (redacted == null ? 0 : redacted.hashCode())) * 31;
                    Redacted redacted2 = this.subtitleSuffix;
                    int hashCode2 = (hashCode + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
                    PreselectableOption.Detail detail = this.detail;
                    int hashCode3 = (hashCode2 + (detail == null ? 0 : detail.hashCode())) * 31;
                    String str = this.headerText;
                    return hashCode3 + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    return "SelectOption(id=" + this.id + ", encodedSelectedOption=" + this.encodedSelectedOption + ", data=" + this.data + ", title=" + this.title + ", subtitlePrimary=" + this.subtitlePrimary + ", subtitleSuffix=" + this.subtitleSuffix + ", detail=" + this.detail + ", headerText=" + this.headerText + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.id);
                    parcel.writeSerializable(this.encodedSelectedOption);
                    this.data.writeToParcel(parcel, i);
                    parcel.writeParcelable(this.title, i);
                    parcel.writeParcelable(this.subtitlePrimary, i);
                    parcel.writeParcelable(this.subtitleSuffix, i);
                    parcel.writeParcelable(this.detail, i);
                    parcel.writeString(this.headerText);
                }
            }

            /* loaded from: classes4.dex */
            public final class ShowDialogOption implements Enabled {
                public static final Parcelable.Creator<ShowDialogOption> CREATOR = new PasscodeHelpResult.Creator(14);
                public final Data data;
                public final OptionDialog dialog;
                public final ByteString encodedSelectedOption;
                public final int id;

                public ShowDialogOption(int i, ByteString byteString, Data data, OptionDialog optionDialog) {
                    byteString.getClass();
                    data.getClass();
                    optionDialog.getClass();
                    this.id = i;
                    this.encodedSelectedOption = byteString;
                    this.data = data;
                    this.dialog = optionDialog;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ShowDialogOption)) {
                        return false;
                    }
                    ShowDialogOption showDialogOption = (ShowDialogOption) obj;
                    return this.id == showDialogOption.id && Intrinsics.areEqual(this.encodedSelectedOption, showDialogOption.encodedSelectedOption) && Intrinsics.areEqual(this.data, showDialogOption.data) && Intrinsics.areEqual(this.dialog, showDialogOption.dialog);
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final Data getData() {
                    return this.data;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.Enabled
                public final ByteString getEncodedSelectedOption() {
                    return this.encodedSelectedOption;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final int getId() {
                    return this.id;
                }

                public final int hashCode() {
                    return this.dialog.hashCode() + ((this.data.hashCode() + ((this.encodedSelectedOption.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31);
                }

                public final String toString() {
                    return "ShowDialogOption(id=" + this.id + ", encodedSelectedOption=" + this.encodedSelectedOption + ", data=" + this.data + ", dialog=" + this.dialog + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.id);
                    parcel.writeSerializable(this.encodedSelectedOption);
                    this.data.writeToParcel(parcel, i);
                    this.dialog.writeToParcel(parcel, i);
                }
            }

            /* loaded from: classes4.dex */
            public final class SubmitOption implements Enabled {
                public static final Parcelable.Creator<SubmitOption> CREATOR = new PasscodeHelpResult.Creator(15);
                public final Data data;
                public final ByteString encodedSelectedOption;
                public final int id;

                public SubmitOption(int i, ByteString byteString, Data data) {
                    byteString.getClass();
                    data.getClass();
                    this.id = i;
                    this.encodedSelectedOption = byteString;
                    this.data = data;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SubmitOption)) {
                        return false;
                    }
                    SubmitOption submitOption = (SubmitOption) obj;
                    return this.id == submitOption.id && Intrinsics.areEqual(this.encodedSelectedOption, submitOption.encodedSelectedOption) && Intrinsics.areEqual(this.data, submitOption.data);
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final Data getData() {
                    return this.data;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption.Enabled
                public final ByteString getEncodedSelectedOption() {
                    return this.encodedSelectedOption;
                }

                @Override // com.squareup.cash.blockers.screens.InstrumentSelectionData.InstrumentOption
                public final int getId() {
                    return this.id;
                }

                public final int hashCode() {
                    return this.data.hashCode() + ((this.encodedSelectedOption.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
                }

                public final String toString() {
                    return "SubmitOption(id=" + this.id + ", encodedSelectedOption=" + this.encodedSelectedOption + ", data=" + this.data + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.id);
                    parcel.writeSerializable(this.encodedSelectedOption);
                    this.data.writeToParcel(parcel, i);
                }
            }

            ByteString getEncodedSelectedOption();
        }

        public interface IconStyle extends Parcelable {

            public final class AppIcon implements IconStyle {
                public static final AppIcon INSTANCE = new AppIcon();
                public static final Parcelable.Creator<AppIcon> CREATOR = new PasscodeHelpResult.Creator(16);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof AppIcon);
                }

                public final int hashCode() {
                    return -43001893;
                }

                public final String toString() {
                    return "AppIcon";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Balance implements IconStyle {
                public static final Parcelable.Creator<Balance> CREATOR = new PasscodeHelpResult.Creator(17);
                public final CurrencyCode currencyCode;

                public Balance(CurrencyCode currencyCode) {
                    currencyCode.getClass();
                    this.currencyCode = currencyCode;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Balance) && this.currencyCode == ((Balance) obj).currencyCode;
                }

                public final int hashCode() {
                    return this.currencyCode.hashCode();
                }

                public final String toString() {
                    return "Balance(currencyCode=" + this.currencyCode + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.currencyCode.name());
                }
            }

            public final class Bank implements IconStyle {
                public static final Bank INSTANCE = new Bank();
                public static final Parcelable.Creator<Bank> CREATOR = new PasscodeHelpResult.Creator(18);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Bank);
                }

                public final int hashCode() {
                    return 1676422203;
                }

                public final String toString() {
                    return "Bank";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class Card implements IconStyle {
                public static final Card INSTANCE = new Card();
                public static final Parcelable.Creator<Card> CREATOR = new PasscodeHelpResult.Creator(19);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Card);
                }

                public final int hashCode() {
                    return 1676452111;
                }

                public final String toString() {
                    return "Card";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class EmojiIcon implements IconStyle {
                public static final Parcelable.Creator<EmojiIcon> CREATOR = new PasscodeHelpResult.Creator(20);
                public final String iconId;

                public EmojiIcon(String str) {
                    str.getClass();
                    this.iconId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof EmojiIcon) && Intrinsics.areEqual(this.iconId, ((EmojiIcon) obj).iconId);
                }

                public final int hashCode() {
                    return this.iconId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmojiIcon(iconId=", this.iconId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.iconId);
                }
            }

            public final class GooglePayIcon implements IconStyle {
                public static final GooglePayIcon INSTANCE = new GooglePayIcon();
                public static final Parcelable.Creator<GooglePayIcon> CREATOR = new PasscodeHelpResult.Creator(21);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof GooglePayIcon);
                }

                public final int hashCode() {
                    return -957256279;
                }

                public final String toString() {
                    return "GooglePayIcon";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class NewLink implements IconStyle {
                public static final NewLink INSTANCE = new NewLink();
                public static final Parcelable.Creator<NewLink> CREATOR = new PasscodeHelpResult.Creator(22);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof NewLink);
                }

                public final int hashCode() {
                    return -1698716837;
                }

                public final String toString() {
                    return "NewLink";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }
        }

        /* loaded from: classes6.dex */
        public interface PreselectableOption extends InstrumentOption {

            /* loaded from: classes4.dex */
            public interface Detail extends Parcelable {

                public final class DetailInfoDialog implements Parcelable {
                    public static final Parcelable.Creator<DetailInfoDialog> CREATOR = new PasscodeHelpResult.Creator(23);
                    public final String buttonText;
                    public final String title;

                    public DetailInfoDialog(String str, String str2) {
                        str.getClass();
                        str2.getClass();
                        this.title = str;
                        this.buttonText = str2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof DetailInfoDialog)) {
                            return false;
                        }
                        DetailInfoDialog detailInfoDialog = (DetailInfoDialog) obj;
                        return Intrinsics.areEqual(this.title, detailInfoDialog.title) && Intrinsics.areEqual(this.buttonText, detailInfoDialog.buttonText);
                    }

                    public final int hashCode() {
                        return this.buttonText.hashCode() + (this.title.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("DetailInfoDialog(title=", this.title, ", buttonText=", this.buttonText, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.title);
                        parcel.writeString(this.buttonText);
                    }
                }

                public final class DetailList implements Detail {
                    public static final Parcelable.Creator<DetailList> CREATOR = new PasscodeHelpResult.Creator(24);
                    public final ArrayList detailRows;

                    public final class DetailRow implements Parcelable {
                        public static final Parcelable.Creator<DetailRow> CREATOR = new PasscodeHelpResult.Creator(25);
                        public final DetailInfoDialog dialog;
                        public final String label;
                        public final String value;

                        public DetailRow(String str, String str2, DetailInfoDialog detailInfoDialog) {
                            str.getClass();
                            str2.getClass();
                            this.label = str;
                            this.value = str2;
                            this.dialog = detailInfoDialog;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof DetailRow)) {
                                return false;
                            }
                            DetailRow detailRow = (DetailRow) obj;
                            return Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && Intrinsics.areEqual(this.dialog, detailRow.dialog);
                        }

                        public final int hashCode() {
                            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value);
                            DetailInfoDialog detailInfoDialog = this.dialog;
                            return m + (detailInfoDialog == null ? 0 : detailInfoDialog.hashCode());
                        }

                        public final String toString() {
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailRow(label=", this.label, ", value=", this.value, ", dialog=");
                            m.append(this.dialog);
                            m.append(")");
                            return m.toString();
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel parcel, int i) {
                            parcel.getClass();
                            parcel.writeString(this.label);
                            parcel.writeString(this.value);
                            DetailInfoDialog detailInfoDialog = this.dialog;
                            if (detailInfoDialog == null) {
                                parcel.writeInt(0);
                            } else {
                                parcel.writeInt(1);
                                detailInfoDialog.writeToParcel(parcel, i);
                            }
                        }
                    }

                    public DetailList(ArrayList arrayList) {
                        this.detailRows = arrayList;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof DetailList) && this.detailRows.equals(((DetailList) obj).detailRows);
                    }

                    public final int hashCode() {
                        return this.detailRows.hashCode();
                    }

                    public final String toString() {
                        return Request$Priority$EnumUnboxingLocalUtility.m("DetailList(detailRows=", ")", this.detailRows);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.detailRows, parcel);
                        while (m.hasNext()) {
                            ((DetailRow) m.next()).writeToParcel(parcel, i);
                        }
                    }
                }

                public final class DetailText implements Detail {
                    public static final Parcelable.Creator<DetailText> CREATOR = new PasscodeHelpResult.Creator(26);
                    public final DetailInfoDialog dialog;
                    public final String text;

                    public DetailText(String str, DetailInfoDialog detailInfoDialog) {
                        this.text = str;
                        this.dialog = detailInfoDialog;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof DetailText)) {
                            return false;
                        }
                        DetailText detailText = (DetailText) obj;
                        return Intrinsics.areEqual(this.text, detailText.text) && Intrinsics.areEqual(this.dialog, detailText.dialog);
                    }

                    public final int hashCode() {
                        String str = this.text;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        DetailInfoDialog detailInfoDialog = this.dialog;
                        return hashCode + (detailInfoDialog != null ? detailInfoDialog.hashCode() : 0);
                    }

                    public final String toString() {
                        return "DetailText(text=" + this.text + ", dialog=" + this.dialog + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.text);
                        DetailInfoDialog detailInfoDialog = this.dialog;
                        if (detailInfoDialog == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            detailInfoDialog.writeToParcel(parcel, i);
                        }
                    }
                }
            }

            Detail getDetail();

            String getHeaderText();

            Redacted getSubtitlePrimary();

            Redacted getSubtitleSuffix();

            Redacted getTitle();
        }

        Data getData();

        int getId();
    }

    public interface PreselectedOptionAction extends Parcelable {

        public final class PreselectedShowDialogAction implements PreselectedOptionAction {
            public static final Parcelable.Creator<PreselectedShowDialogAction> CREATOR = new PasscodeHelpResult.Creator(27);
            public final InstrumentOption.Enabled.OptionDialog dialog;
            public final InstrumentOption.PreselectableOption option;

            public PreselectedShowDialogAction(InstrumentOption.PreselectableOption preselectableOption, InstrumentOption.Enabled.OptionDialog optionDialog) {
                preselectableOption.getClass();
                optionDialog.getClass();
                this.option = preselectableOption;
                this.dialog = optionDialog;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PreselectedShowDialogAction)) {
                    return false;
                }
                PreselectedShowDialogAction preselectedShowDialogAction = (PreselectedShowDialogAction) obj;
                return Intrinsics.areEqual(this.option, preselectedShowDialogAction.option) && Intrinsics.areEqual(this.dialog, preselectedShowDialogAction.dialog);
            }

            public final int hashCode() {
                return this.dialog.hashCode() + (this.option.hashCode() * 31);
            }

            public final String toString() {
                return "PreselectedShowDialogAction(option=" + this.option + ", dialog=" + this.dialog + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.option, i);
                this.dialog.writeToParcel(parcel, i);
            }
        }

        public final class PreselectedShowOptionsAction implements PreselectedOptionAction {
            public static final PreselectedShowOptionsAction INSTANCE = new PreselectedShowOptionsAction();
            public static final Parcelable.Creator<PreselectedShowOptionsAction> CREATOR = new PasscodeHelpResult.Creator(28);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PreselectedShowOptionsAction);
            }

            public final int hashCode() {
                return -881952153;
            }

            public final String toString() {
                return "PreselectedShowOptionsAction";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SubmissionEndpoint {
        public static final /* synthetic */ SubmissionEndpoint[] $VALUES;
        public static final SubmissionEndpoint V2;

        static {
            SubmissionEndpoint submissionEndpoint = new SubmissionEndpoint("V2", 0);
            V2 = submissionEndpoint;
            $VALUES = new SubmissionEndpoint[]{submissionEndpoint};
        }

        public static SubmissionEndpoint valueOf(String str) {
            return (SubmissionEndpoint) Enum.valueOf(SubmissionEndpoint.class, str);
        }

        public static SubmissionEndpoint[] values() {
            return (SubmissionEndpoint[]) $VALUES.clone();
        }
    }

    public InstrumentSelectionData(String str, String str2, ArrayList arrayList, InstrumentOption.PreselectableOption preselectableOption, PreselectedOptionAction preselectedOptionAction, String str3, ArrayList arrayList2, InstrumentOption.PreselectableOption preselectableOption2, PreselectedOptionAction preselectedOptionAction2, String str4, String str5, String str6, boolean z, SubmissionEndpoint submissionEndpoint) {
        str.getClass();
        str2.getClass();
        preselectableOption.getClass();
        preselectedOptionAction.getClass();
        str6.getClass();
        submissionEndpoint.getClass();
        this.headerText = str;
        this.submitButtonText = str2;
        this.options = arrayList;
        this.initialSelectedOption = preselectableOption;
        this.preselectedOptionAction = preselectedOptionAction;
        this.selectedInstrumentLabel = str3;
        this.secondaryOptions = arrayList2;
        this.initialSecondarySelectedOption = preselectableOption2;
        this.preselectedSecondaryOptionAction = preselectedOptionAction2;
        this.listHeaderTitle = str4;
        this.secondaryListHeaderTitle = str5;
        this.listDismissButtonText = str6;
        this.useSecondaryOptionDetails = z;
        this.submissionEndpoint = submissionEndpoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionData)) {
            return false;
        }
        InstrumentSelectionData instrumentSelectionData = (InstrumentSelectionData) obj;
        return Intrinsics.areEqual(this.headerText, instrumentSelectionData.headerText) && Intrinsics.areEqual(this.submitButtonText, instrumentSelectionData.submitButtonText) && this.options.equals(instrumentSelectionData.options) && Intrinsics.areEqual(this.initialSelectedOption, instrumentSelectionData.initialSelectedOption) && Intrinsics.areEqual(this.preselectedOptionAction, instrumentSelectionData.preselectedOptionAction) && Intrinsics.areEqual(this.selectedInstrumentLabel, instrumentSelectionData.selectedInstrumentLabel) && Intrinsics.areEqual(this.secondaryOptions, instrumentSelectionData.secondaryOptions) && Intrinsics.areEqual(this.initialSecondarySelectedOption, instrumentSelectionData.initialSecondarySelectedOption) && Intrinsics.areEqual(this.preselectedSecondaryOptionAction, instrumentSelectionData.preselectedSecondaryOptionAction) && Intrinsics.areEqual(this.listHeaderTitle, instrumentSelectionData.listHeaderTitle) && Intrinsics.areEqual(this.secondaryListHeaderTitle, instrumentSelectionData.secondaryListHeaderTitle) && Intrinsics.areEqual(this.listDismissButtonText, instrumentSelectionData.listDismissButtonText) && this.useSecondaryOptionDetails == instrumentSelectionData.useSecondaryOptionDetails && this.submissionEndpoint == instrumentSelectionData.submissionEndpoint;
    }

    public final int hashCode() {
        int hashCode = (this.preselectedOptionAction.hashCode() + ((this.initialSelectedOption.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.options, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerText.hashCode() * 31, 31, this.submitButtonText), 31)) * 31)) * 31;
        String str = this.selectedInstrumentLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.secondaryOptions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        InstrumentOption.PreselectableOption preselectableOption = this.initialSecondarySelectedOption;
        int hashCode4 = (hashCode3 + (preselectableOption == null ? 0 : preselectableOption.hashCode())) * 31;
        PreselectedOptionAction preselectedOptionAction = this.preselectedSecondaryOptionAction;
        int hashCode5 = (hashCode4 + (preselectedOptionAction == null ? 0 : preselectedOptionAction.hashCode())) * 31;
        String str2 = this.listHeaderTitle;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryListHeaderTitle;
        return this.submissionEndpoint.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.listDismissButtonText), 31, this.useSecondaryOptionDetails);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentSelectionData(headerText=", this.headerText, ", submitButtonText=", this.submitButtonText, ", options=");
        m.append(this.options);
        m.append(", initialSelectedOption=");
        m.append(this.initialSelectedOption);
        m.append(", preselectedOptionAction=");
        m.append(this.preselectedOptionAction);
        m.append(", selectedInstrumentLabel=");
        m.append(this.selectedInstrumentLabel);
        m.append(", secondaryOptions=");
        m.append(this.secondaryOptions);
        m.append(", initialSecondarySelectedOption=");
        m.append(this.initialSecondarySelectedOption);
        m.append(", preselectedSecondaryOptionAction=");
        m.append(this.preselectedSecondaryOptionAction);
        m.append(", listHeaderTitle=");
        m.append(this.listHeaderTitle);
        m.append(", secondaryListHeaderTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.secondaryListHeaderTitle, ", listDismissButtonText=", this.listDismissButtonText, ", useSecondaryOptionDetails=");
        m.append(this.useSecondaryOptionDetails);
        m.append(", submissionEndpoint=");
        m.append(this.submissionEndpoint);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.headerText);
        parcel.writeString(this.submitButtonText);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.options, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.initialSelectedOption, i);
        parcel.writeParcelable(this.preselectedOptionAction, i);
        parcel.writeString(this.selectedInstrumentLabel);
        List list = this.secondaryOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
        }
        parcel.writeParcelable(this.initialSecondarySelectedOption, i);
        parcel.writeParcelable(this.preselectedSecondaryOptionAction, i);
        parcel.writeString(this.listHeaderTitle);
        parcel.writeString(this.secondaryListHeaderTitle);
        parcel.writeString(this.listDismissButtonText);
        parcel.writeInt(this.useSecondaryOptionDetails ? 1 : 0);
        parcel.writeString(this.submissionEndpoint.name());
    }
}

package com.squareup.cash.globalsearch.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchViewModel {
    public final ErrorToast errorToast;
    public final boolean isLoading;
    public final InputFieldText query;
    public final List sections;

    public final class ActivitySection implements Section, HasSectionTrailer {
        public final ArrayList items;
        public final String key;
        public final Function1 onEvent;
        public final String title;
        public final SectionTrailer trailer;

        public ActivitySection(String str, String str2, ArrayList arrayList, SectionTrailer sectionTrailer, Function1 function1) {
            str.getClass();
            str2.getClass();
            function1.getClass();
            this.title = str;
            this.key = str2;
            this.items = arrayList;
            this.trailer = sectionTrailer;
            this.onEvent = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(this.title, activitySection.title) && Intrinsics.areEqual(this.key, activitySection.key) && this.items.equals(activitySection.items) && Intrinsics.areEqual(this.trailer, activitySection.trailer) && Intrinsics.areEqual(this.onEvent, activitySection.onEvent);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return this.key;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return this.onEvent;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return this.title;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.HasSectionTrailer
        public final SectionTrailer getTrailer() {
            return this.trailer;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.key), 31);
            SectionTrailer sectionTrailer = this.trailer;
            return this.onEvent.hashCode() + ((m + (sectionTrailer == null ? 0 : sectionTrailer.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivitySection(title=", this.title, ", key=", this.key, ", items=");
            m.append(this.items);
            m.append(", trailer=");
            m.append(this.trailer);
            m.append(", onEvent=");
            m.append(this.onEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class Avatar {
        public final ColorModel.Accented backgroundColor;
        public final String monogram;
        public final Image photo;

        public Avatar(String str, Image image, ColorModel.Accented accented) {
            this.monogram = str;
            this.photo = image;
            this.backgroundColor = accented;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) obj;
            return this.monogram.equals(avatar.monogram) && Intrinsics.areEqual(this.photo, avatar.photo) && this.backgroundColor.equals(avatar.backgroundColor);
        }

        public final int hashCode() {
            int hashCode = this.monogram.hashCode() * 31;
            Image image = this.photo;
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor.color, (hashCode + (image == null ? 0 : image.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "Avatar(monogram=" + this.monogram + ", photo=" + this.photo + ", backgroundColor=" + this.backgroundColor + ", accessibilityText=null)";
        }
    }

    public final class Button {
        public final String actionUrl;
        public final String text;

        public Button(String str, String str2) {
            str.getClass();
            this.text = str;
            this.actionUrl = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.text, button.text) && this.actionUrl.equals(button.actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Button(text=", this.text, ", actionUrl=", this.actionUrl, ")");
        }
    }

    public final class ErrorToast {
        public final String body;
        public final String title;

        public ErrorToast(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorToast)) {
                return false;
            }
            ErrorToast errorToast = (ErrorToast) obj;
            return Intrinsics.areEqual(this.title, errorToast.title) && Intrinsics.areEqual(this.body, errorToast.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ErrorToast(title=", this.title, ", body=", this.body, ")");
        }
    }

    public interface HasSectionTrailer {
        SectionTrailer getTrailer();
    }

    public final class Item {
        public final GlobalSearchViewModel$Item$Accessory$ButtonAccessory accessory;
        public final String actionUrl;
        public final Avatar avatar;
        public final String entityId;
        public final String entityType;
        public final String key;
        public final String metadataJson;
        public final String subtitle;
        public final String title;
        public final Icons titleIcon;

        public Item(String str, Avatar avatar, String str2, String str3, String str4, String str5, String str6, GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory, Icons icons, String str7) {
            this.metadataJson = str;
            this.avatar = avatar;
            this.title = str2;
            this.subtitle = str3;
            this.actionUrl = str4;
            this.entityId = str5;
            this.entityType = str6;
            this.accessory = globalSearchViewModel$Item$Accessory$ButtonAccessory;
            this.titleIcon = icons;
            this.key = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.metadataJson, item.metadataJson) && Intrinsics.areEqual(this.avatar, item.avatar) && this.title.equals(item.title) && Intrinsics.areEqual(this.subtitle, item.subtitle) && Intrinsics.areEqual(this.actionUrl, item.actionUrl) && Intrinsics.areEqual(this.entityId, item.entityId) && Intrinsics.areEqual(this.entityType, item.entityType) && Intrinsics.areEqual(this.accessory, item.accessory) && this.titleIcon == item.titleIcon && this.key.equals(item.key);
        }

        public final int hashCode() {
            String str = this.metadataJson;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Avatar avatar = this.avatar;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (avatar == null ? 0 : avatar.hashCode())) * 31, 31, this.title);
            String str2 = this.subtitle;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.actionUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.entityId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.entityType;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory = this.accessory;
            int hashCode6 = (hashCode5 + (globalSearchViewModel$Item$Accessory$ButtonAccessory == null ? 0 : globalSearchViewModel$Item$Accessory$ButtonAccessory.button.hashCode())) * 31;
            Icons icons = this.titleIcon;
            return this.key.hashCode() + ((hashCode6 + (icons != null ? icons.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(metadataJson=");
            sb.append(this.metadataJson);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", actionUrl=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.actionUrl, ", entityId=", this.entityId, ", entityType=");
            sb.append(this.entityType);
            sb.append(", accessory=");
            sb.append(this.accessory);
            sb.append(", titleIcon=");
            sb.append(this.titleIcon);
            sb.append(", key=");
            sb.append(this.key);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Modal {
        public final String buttonText;
        public final String mainText;

        public Modal(String str, String str2) {
            this.mainText = str;
            this.buttonText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Modal)) {
                return false;
            }
            Modal modal = (Modal) obj;
            return this.mainText.equals(modal.mainText) && Intrinsics.areEqual(this.buttonText, modal.buttonText);
        }

        public final int hashCode() {
            int hashCode = this.mainText.hashCode() * 31;
            String str = this.buttonText;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Modal(mainText=", this.mainText, ", buttonText=", this.buttonText, ")");
        }
    }

    public final class NoResults implements Section {
        public static final NoResults INSTANCE = new NoResults();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoResults);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return "no results";
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return GlobalSearchViewModel$NoResults$onEvent$1.INSTANCE;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return null;
        }

        public final int hashCode() {
            return -1272231150;
        }

        public final String toString() {
            return "NoResults";
        }
    }

    public final class QabSection implements Section {
        public final ContactHeaderViewModel model;
        public final Function1 onEvent;

        public QabSection(ContactHeaderViewModel contactHeaderViewModel, Function1 function1) {
            function1.getClass();
            this.model = contactHeaderViewModel;
            this.onEvent = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QabSection)) {
                return false;
            }
            QabSection qabSection = (QabSection) obj;
            return this.model.equals(qabSection.model) && Intrinsics.areEqual(this.onEvent, qabSection.onEvent);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return "qab";
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return this.onEvent;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return null;
        }

        public final int hashCode() {
            return this.onEvent.hashCode() + (this.model.hashCode() * 31);
        }

        public final String toString() {
            return "QabSection(model=" + this.model + ", onEvent=" + this.onEvent + ")";
        }
    }

    public final class RowSection implements Section, HasSectionTrailer {
        public final ArrayList items;
        public final String key;
        public final Function1 onEvent;
        public final String title;
        public final SectionTrailer trailer;

        public RowSection(String str, String str2, ArrayList arrayList, SectionTrailer sectionTrailer, Function1 function1) {
            str2.getClass();
            function1.getClass();
            this.title = str;
            this.key = str2;
            this.items = arrayList;
            this.trailer = sectionTrailer;
            this.onEvent = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowSection)) {
                return false;
            }
            RowSection rowSection = (RowSection) obj;
            return Intrinsics.areEqual(this.title, rowSection.title) && Intrinsics.areEqual(this.key, rowSection.key) && this.items.equals(rowSection.items) && Intrinsics.areEqual(this.trailer, rowSection.trailer) && Intrinsics.areEqual(this.onEvent, rowSection.onEvent);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return this.key;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return this.onEvent;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return this.title;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.HasSectionTrailer
        public final SectionTrailer getTrailer() {
            return this.trailer;
        }

        public final int hashCode() {
            String str = this.title;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.key), 961);
            SectionTrailer sectionTrailer = this.trailer;
            return this.onEvent.hashCode() + ((m + (sectionTrailer != null ? sectionTrailer.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RowSection(title=", this.title, ", key=", this.key, ", items=");
            m.append(this.items);
            m.append(", pagination=null, trailer=");
            m.append(this.trailer);
            m.append(", onEvent=");
            m.append(this.onEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class SearchError implements Section {
        public static final SearchError INSTANCE = new SearchError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchError);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return "search error";
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return GlobalSearchViewModel$NoResults$onEvent$1.INSTANCE$1;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return null;
        }

        public final int hashCode() {
            return 1138131485;
        }

        public final String toString() {
            return "SearchError";
        }
    }

    public final class SearchPrompt implements Section {
        public final String text;

        public SearchPrompt(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchPrompt) && Intrinsics.areEqual(this.text, ((SearchPrompt) obj).text);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getKey() {
            return "search prompt";
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final Function1 getOnEvent() {
            return GlobalSearchViewModel$NoResults$onEvent$1.INSTANCE$2;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel.Section
        public final String getTitle() {
            return null;
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchPrompt(text=", this.text, ")");
        }
    }

    public interface Section {
        String getKey();

        Function1 getOnEvent();

        String getTitle();
    }

    public interface SectionTrailer {

        public final class LoadMoreButton implements SectionTrailer {
            public static final LoadMoreButton INSTANCE = new LoadMoreButton();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadMoreButton);
            }

            public final int hashCode() {
                return -107235446;
            }

            public final String toString() {
                return "LoadMoreButton";
            }
        }

        public final class LoadingSpinner implements SectionTrailer {
            public static final LoadingSpinner INSTANCE = new LoadingSpinner();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingSpinner);
            }

            public final int hashCode() {
                return 1012240474;
            }

            public final String toString() {
                return "LoadingSpinner";
            }
        }

        public final class WarningModal implements SectionTrailer {
            public final Modal modal;

            public WarningModal(Modal modal) {
                modal.getClass();
                this.modal = modal;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WarningModal) && Intrinsics.areEqual(this.modal, ((WarningModal) obj).modal);
            }

            public final int hashCode() {
                return this.modal.hashCode();
            }

            public final String toString() {
                return "WarningModal(modal=" + this.modal + ")";
            }
        }
    }

    public GlobalSearchViewModel(List list, boolean z, InputFieldText inputFieldText, ErrorToast errorToast) {
        this.sections = list;
        this.isLoading = z;
        this.query = inputFieldText;
        this.errorToast = errorToast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchViewModel)) {
            return false;
        }
        GlobalSearchViewModel globalSearchViewModel = (GlobalSearchViewModel) obj;
        return this.sections.equals(globalSearchViewModel.sections) && this.isLoading == globalSearchViewModel.isLoading && this.query.equals(globalSearchViewModel.query) && Intrinsics.areEqual(this.errorToast, globalSearchViewModel.errorToast);
    }

    public final int hashCode() {
        int hashCode = (this.query.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sections.hashCode() * 31, 31, this.isLoading)) * 31;
        ErrorToast errorToast = this.errorToast;
        return hashCode + (errorToast == null ? 0 : errorToast.hashCode());
    }

    public final String toString() {
        return "GlobalSearchViewModel(sections=" + this.sections + ", isLoading=" + this.isLoading + ", query=" + this.query + ", errorToast=" + this.errorToast + ")";
    }
}

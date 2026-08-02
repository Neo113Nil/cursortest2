package com.squareup.cash.phoneplans;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface WirelessProviderListViewModel {

    public final class Content implements WirelessProviderListViewModel {
        public final String buttonText;
        public final String emptyStateText;
        public final List filteredProviders;
        public final boolean hasHelpButton;
        public final boolean isButtonEnabled;
        public final String searchHintText;
        public final String searchText;
        public final String selectedProviderId;
        public final String title;
        public final ToolbarButton toolbarButton;

        public Content(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, boolean z, ToolbarButton toolbarButton, boolean z2) {
            arrayList.getClass();
            str6.getClass();
            this.title = str;
            this.searchHintText = str2;
            this.emptyStateText = str3;
            this.buttonText = str4;
            this.filteredProviders = arrayList;
            this.selectedProviderId = str5;
            this.searchText = str6;
            this.isButtonEnabled = z;
            this.toolbarButton = toolbarButton;
            this.hasHelpButton = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.searchHintText.equals(content.searchHintText) && this.emptyStateText.equals(content.emptyStateText) && this.buttonText.equals(content.buttonText) && Intrinsics.areEqual(this.filteredProviders, content.filteredProviders) && Intrinsics.areEqual(this.selectedProviderId, content.selectedProviderId) && Intrinsics.areEqual(this.searchText, content.searchText) && this.isButtonEnabled == content.isButtonEnabled && this.toolbarButton == content.toolbarButton && this.hasHelpButton == content.hasHelpButton;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.searchHintText), 31, this.emptyStateText), 31, this.buttonText), 31, this.filteredProviders);
            String str = this.selectedProviderId;
            return Boolean.hashCode(this.hasHelpButton) + ((this.toolbarButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.searchText), 31, this.isButtonEnabled)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", searchHintText=", this.searchHintText, ", emptyStateText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.emptyStateText, ", buttonText=", this.buttonText, ", filteredProviders=");
            Recorder$$ExternalSyntheticOutline2.m(", selectedProviderId=", this.selectedProviderId, ", searchText=", m, this.filteredProviders);
            NavAction$$ExternalSyntheticOutline0.m(m, this.searchText, ", isButtonEnabled=", this.isButtonEnabled, ", toolbarButton=");
            m.append(this.toolbarButton);
            m.append(", hasHelpButton=");
            m.append(this.hasHelpButton);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements WirelessProviderListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1673086693;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class ProviderItem {
        public final String id;
        public final Image logo;
        public final String name;

        public ProviderItem(Image image, String str, String str2) {
            this.id = str;
            this.name = str2;
            this.logo = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderItem)) {
                return false;
            }
            ProviderItem providerItem = (ProviderItem) obj;
            return this.id.equals(providerItem.id) && this.name.equals(providerItem.name) && Intrinsics.areEqual(this.logo, providerItem.logo);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
            Image image = this.logo;
            return m + (image == null ? 0 : image.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProviderItem(id=", this.id, ", name=", this.name, ", logo=");
            m.append(this.logo);
            m.append(")");
            return m.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ToolbarButton {
        public static final /* synthetic */ ToolbarButton[] $VALUES;
        public static final ToolbarButton Back;
        public static final ToolbarButton Close;

        static {
            ToolbarButton toolbarButton = new ToolbarButton(Constants.META_BACK_BUTTON, 0);
            Back = toolbarButton;
            ToolbarButton toolbarButton2 = new ToolbarButton(Constants.META_CLOSE, 1);
            Close = toolbarButton2;
            $VALUES = new ToolbarButton[]{toolbarButton, toolbarButton2};
        }

        public static ToolbarButton valueOf(String str) {
            return (ToolbarButton) Enum.valueOf(ToolbarButton.class, str);
        }

        public static ToolbarButton[] values() {
            return (ToolbarButton[]) $VALUES.clone();
        }
    }
}

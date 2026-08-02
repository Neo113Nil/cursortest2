package com.squareup.cash.offers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersHomeViewModelV2 {

    public final class Loaded implements OffersHomeViewModelV2 {
        public final HeaderSection headerSection;
        public final List offersSections;

        public final class HeaderSection {
            public final String amount;
            public final String subtitle;
            public final String title;

            public HeaderSection(String str, String str2, String str3) {
                str.getClass();
                this.title = str;
                this.amount = str2;
                this.subtitle = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeaderSection)) {
                    return false;
                }
                HeaderSection headerSection = (HeaderSection) obj;
                return Intrinsics.areEqual(this.title, headerSection.title) && Intrinsics.areEqual(this.amount, headerSection.amount) && Intrinsics.areEqual(this.subtitle, headerSection.subtitle);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.amount;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.subtitle;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeaderSection(title=", this.title, ", amount=", this.amount, ", subtitle="), this.subtitle, ")");
            }
        }

        public final class OfferItem {
            public final StackedAvatarViewModel.Single avatar;
            public final AvatarBadgeViewModel badge;
            public final OffersHomeViewEventV2 event;
            public final ItemStatus status;
            public final String subtitle;
            public final String title;
            public final String token;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class ItemStatus {
                public static final /* synthetic */ ItemStatus[] $VALUES;
                public static final ItemStatus LOADING;
                public static final ItemStatus LOCKED;
                public static final ItemStatus SELECTABLE;
                public static final ItemStatus SELECTED;

                static {
                    ItemStatus itemStatus = new ItemStatus("SELECTABLE", 0);
                    SELECTABLE = itemStatus;
                    ItemStatus itemStatus2 = new ItemStatus("LOCKED", 1);
                    LOCKED = itemStatus2;
                    ItemStatus itemStatus3 = new ItemStatus("LOADING", 2);
                    LOADING = itemStatus3;
                    ItemStatus itemStatus4 = new ItemStatus("SELECTED", 3);
                    SELECTED = itemStatus4;
                    $VALUES = new ItemStatus[]{itemStatus, itemStatus2, itemStatus3, itemStatus4};
                }

                public static ItemStatus valueOf(String str) {
                    return (ItemStatus) Enum.valueOf(ItemStatus.class, str);
                }

                public static ItemStatus[] values() {
                    return (ItemStatus[]) $VALUES.clone();
                }
            }

            public OfferItem(String str, String str2, String str3, StackedAvatarViewModel.Single single, AvatarBadgeViewModel.IconToken iconToken, ItemStatus itemStatus, OffersHomeViewEventV2 offersHomeViewEventV2) {
                str2.getClass();
                this.token = str;
                this.title = str2;
                this.subtitle = str3;
                this.avatar = single;
                this.badge = iconToken;
                this.status = itemStatus;
                this.event = offersHomeViewEventV2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferItem)) {
                    return false;
                }
                OfferItem offerItem = (OfferItem) obj;
                return this.token.equals(offerItem.token) && Intrinsics.areEqual(this.title, offerItem.title) && Intrinsics.areEqual(this.subtitle, offerItem.subtitle) && this.avatar.equals(offerItem.avatar) && Intrinsics.areEqual(this.badge, offerItem.badge) && this.status == offerItem.status && Intrinsics.areEqual(this.event, offerItem.event);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                int hashCode = (this.avatar.avatar.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                AvatarBadgeViewModel avatarBadgeViewModel = this.badge;
                int hashCode2 = (this.status.hashCode() + ((hashCode + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31)) * 31;
                OffersHomeViewEventV2 offersHomeViewEventV2 = this.event;
                return hashCode2 + (offersHomeViewEventV2 != null ? offersHomeViewEventV2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfferItem(token=", this.token, ", title=", this.title, ", subtitle=");
                m.append(this.subtitle);
                m.append(", avatar=");
                m.append(this.avatar);
                m.append(", badge=");
                m.append(this.badge);
                m.append(", status=");
                m.append(this.status);
                m.append(", event=");
                m.append(this.event);
                m.append(")");
                return m.toString();
            }
        }

        public final class OffersSection {
            public final SectionHeader header;
            public final List items;
            public final String sectionId;
            public final List tileItems;

            public final class SectionHeader {
                public final TextButton button;
                public final String subtitle;
                public final String title;

                public final class TextButton {
                    public final OffersHomeViewEventV2.UrlClicked event;
                    public final String text;

                    public TextButton(String str, OffersHomeViewEventV2.UrlClicked urlClicked) {
                        str.getClass();
                        this.text = str;
                        this.event = urlClicked;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TextButton)) {
                            return false;
                        }
                        TextButton textButton = (TextButton) obj;
                        return Intrinsics.areEqual(this.text, textButton.text) && this.event.equals(textButton.event);
                    }

                    public final int hashCode() {
                        return this.event.hashCode() + (this.text.hashCode() * 31);
                    }

                    public final String toString() {
                        return "TextButton(text=" + this.text + ", event=" + this.event + ")";
                    }
                }

                public SectionHeader(String str, String str2, TextButton textButton) {
                    str.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.button = textButton;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SectionHeader)) {
                        return false;
                    }
                    SectionHeader sectionHeader = (SectionHeader) obj;
                    return Intrinsics.areEqual(this.title, sectionHeader.title) && Intrinsics.areEqual(this.subtitle, sectionHeader.subtitle) && Intrinsics.areEqual(this.button, sectionHeader.button);
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    TextButton textButton = this.button;
                    return hashCode2 + (textButton != null ? textButton.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionHeader(title=", this.title, ", subtitle=", this.subtitle, ", button=");
                    m.append(this.button);
                    m.append(")");
                    return m.toString();
                }
            }

            public OffersSection(String str, SectionHeader sectionHeader, List list, List list2) {
                list.getClass();
                list2.getClass();
                this.sectionId = str;
                this.header = sectionHeader;
                this.tileItems = list;
                this.items = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OffersSection)) {
                    return false;
                }
                OffersSection offersSection = (OffersSection) obj;
                return this.sectionId.equals(offersSection.sectionId) && this.header.equals(offersSection.header) && Intrinsics.areEqual(this.tileItems, offersSection.tileItems) && Intrinsics.areEqual(this.items, offersSection.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.header.hashCode() + (this.sectionId.hashCode() * 31)) * 31, 31, this.tileItems);
            }

            public final String toString() {
                return "OffersSection(sectionId=" + this.sectionId + ", header=" + this.header + ", tileItems=" + this.tileItems + ", items=" + this.items + ")";
            }
        }

        public Loaded(HeaderSection headerSection, List list) {
            this.headerSection = headerSection;
            this.offersSections = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.headerSection.equals(loaded.headerSection) && this.offersSections.equals(loaded.offersSections);
        }

        public final int hashCode() {
            return this.offersSections.hashCode() + (this.headerSection.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(headerSection=" + this.headerSection + ", offersSections=" + this.offersSections + ")";
        }
    }

    public final class Loading implements OffersHomeViewModelV2 {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 814003358;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

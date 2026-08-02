package com.squareup.cash.prepurchasecashcard.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PrepurchaseCardFAQViewModel {
    public final FAQSectionData faqSectionData;
    public final OverviewData overviewData;

    public final class FAQSectionData {
        public final String disclosureMarkdownText;
        public final ArrayList items;
        public final String title;

        public abstract class FAQItem {

            public final class ExpandableItem extends FAQItem {
                public final String answer;
                public final String question;

                public ExpandableItem(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.question = str;
                    this.answer = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ExpandableItem)) {
                        return false;
                    }
                    ExpandableItem expandableItem = (ExpandableItem) obj;
                    return Intrinsics.areEqual(this.question, expandableItem.question) && Intrinsics.areEqual(this.answer, expandableItem.answer);
                }

                public final int hashCode() {
                    return this.answer.hashCode() + (this.question.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("ExpandableItem(question=", this.question, ", answer=", this.answer, ")");
                }
            }

            public final class Header extends FAQItem {
                public final String title;

                public Header(String str) {
                    this.title = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Header) && this.title.equals(((Header) obj).title);
                }

                public final int hashCode() {
                    return this.title.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(title=", this.title, ")");
                }
            }
        }

        public FAQSectionData(String str, String str2, ArrayList arrayList) {
            this.title = str;
            this.items = arrayList;
            this.disclosureMarkdownText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FAQSectionData)) {
                return false;
            }
            FAQSectionData fAQSectionData = (FAQSectionData) obj;
            return Intrinsics.areEqual(this.title, fAQSectionData.title) && this.items.equals(fAQSectionData.items) && Intrinsics.areEqual(this.disclosureMarkdownText, fAQSectionData.disclosureMarkdownText);
        }

        public final int hashCode() {
            String str = this.title;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.disclosureMarkdownText;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.items, "FAQSectionData(title=", this.title, ", items=", ", disclosureMarkdownText="), this.disclosureMarkdownText, ")");
        }
    }

    public final class OverviewData {
        public final BlockerAction buttonBlockerAction;
        public final Image headerImage;
        public final ArrayList listItems;
        public final String title;

        public final class OverviewListItem {
            public final String subtitle;
            public final String title;

            public OverviewListItem(String str, String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverviewListItem)) {
                    return false;
                }
                OverviewListItem overviewListItem = (OverviewListItem) obj;
                return this.title.equals(overviewListItem.title) && Intrinsics.areEqual(this.subtitle, overviewListItem.subtitle);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("OverviewListItem(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        public OverviewData(Image image, String str, ArrayList arrayList, BlockerAction blockerAction) {
            this.headerImage = image;
            this.title = str;
            this.listItems = arrayList;
            this.buttonBlockerAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverviewData)) {
                return false;
            }
            OverviewData overviewData = (OverviewData) obj;
            return Intrinsics.areEqual(this.headerImage, overviewData.headerImage) && this.title.equals(overviewData.title) && this.listItems.equals(overviewData.listItems) && Intrinsics.areEqual(this.buttonBlockerAction, overviewData.buttonBlockerAction);
        }

        public final int hashCode() {
            Image image = this.headerImage;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.listItems, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title), 31);
            BlockerAction blockerAction = this.buttonBlockerAction;
            return m + (blockerAction != null ? blockerAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.headerImage, "OverviewData(headerImage=", ", title=", this.title, ", listItems=");
            m.append(this.listItems);
            m.append(", buttonBlockerAction=");
            m.append(this.buttonBlockerAction);
            m.append(")");
            return m.toString();
        }
    }

    public PrepurchaseCardFAQViewModel(OverviewData overviewData, FAQSectionData fAQSectionData) {
        this.overviewData = overviewData;
        this.faqSectionData = fAQSectionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardFAQViewModel)) {
            return false;
        }
        PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel = (PrepurchaseCardFAQViewModel) obj;
        return this.overviewData.equals(prepurchaseCardFAQViewModel.overviewData) && this.faqSectionData.equals(prepurchaseCardFAQViewModel.faqSectionData);
    }

    public final int hashCode() {
        return this.faqSectionData.hashCode() + (this.overviewData.hashCode() * 31);
    }

    public final String toString() {
        return "PrepurchaseCardFAQViewModel(overviewData=" + this.overviewData + ", faqSectionData=" + this.faqSectionData + ")";
    }
}

package com.squareup.cash.merchant.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantBlockingViewModel {
    public final Loadable content;
    public final String header;

    public final class HelpButton {
        public final String accessibilityText;
        public final MerchantBlockingViewEvent.RouterClicked action;

        public HelpButton(MerchantBlockingViewEvent.RouterClicked routerClicked, String str) {
            this.action = routerClicked;
            this.accessibilityText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpButton)) {
                return false;
            }
            HelpButton helpButton = (HelpButton) obj;
            return this.action.equals(helpButton.action) && this.accessibilityText.equals(helpButton.accessibilityText);
        }

        public final int hashCode() {
            return this.accessibilityText.hashCode() + (this.action.hashCode() * 31);
        }

        public final String toString() {
            return "HelpButton(action=" + this.action + ", accessibilityText=" + this.accessibilityText + ")";
        }
    }

    public final class MerchantBlockingContentViewModel {
        public final HelpButton helpItem;
        public final MerchantBlockingSectionViewModel section;

        public MerchantBlockingContentViewModel(HelpButton helpButton, MerchantBlockingSectionViewModel merchantBlockingSectionViewModel) {
            this.helpItem = helpButton;
            this.section = merchantBlockingSectionViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchantBlockingContentViewModel)) {
                return false;
            }
            MerchantBlockingContentViewModel merchantBlockingContentViewModel = (MerchantBlockingContentViewModel) obj;
            return this.helpItem.equals(merchantBlockingContentViewModel.helpItem) && this.section.equals(merchantBlockingContentViewModel.section);
        }

        public final int hashCode() {
            return this.section.hashCode() + (this.helpItem.hashCode() * 31);
        }

        public final String toString() {
            return "MerchantBlockingContentViewModel(helpItem=" + this.helpItem + ", section=" + this.section + ")";
        }
    }

    public interface MerchantBlockingSectionViewModel {

        public final class SectionEmpty implements MerchantBlockingSectionViewModel {
            public static final SectionEmpty INSTANCE = new SectionEmpty();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SectionEmpty);
            }

            public final int hashCode() {
                return 180458088;
            }

            public final String toString() {
                return "SectionEmpty";
            }
        }

        public final class SectionList implements MerchantBlockingSectionViewModel {
            public final ArrayList list;

            public interface SectionLoaded {

                public final class Button {
                    public final MerchantBlockingViewEvent.RouterClicked action;
                    public final Color color;
                    public final String label;

                    public Button(String str, Color color, MerchantBlockingViewEvent.RouterClicked routerClicked) {
                        this.label = str;
                        this.color = color;
                        this.action = routerClicked;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Button)) {
                            return false;
                        }
                        Button button = (Button) obj;
                        return this.label.equals(button.label) && Intrinsics.areEqual(this.color, button.color) && this.action.equals(button.action);
                    }

                    public final int hashCode() {
                        int hashCode = this.label.hashCode() * 31;
                        Color color = this.color;
                        return this.action.hashCode() + ((hashCode + (color == null ? 0 : color.hashCode())) * 31);
                    }

                    public final String toString() {
                        return "Button(label=" + this.label + ", color=" + this.color + ", action=" + this.action + ")";
                    }
                }

                public final class SectionRow implements SectionLoaded {
                    public final StackedAvatarViewModel.Single avatar;
                    public final Button button;
                    public final MerchantBlockingViewEvent.RouterClicked rowAction;
                    public final String title;

                    public SectionRow(StackedAvatarViewModel.Single single, String str, MerchantBlockingViewEvent.RouterClicked routerClicked, Button button) {
                        str.getClass();
                        this.avatar = single;
                        this.title = str;
                        this.rowAction = routerClicked;
                        this.button = button;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SectionRow)) {
                            return false;
                        }
                        SectionRow sectionRow = (SectionRow) obj;
                        return this.avatar.equals(sectionRow.avatar) && Intrinsics.areEqual(this.title, sectionRow.title) && this.rowAction.equals(sectionRow.rowAction) && this.button.equals(sectionRow.button);
                    }

                    public final int hashCode() {
                        return this.button.hashCode() + ((this.rowAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.avatar.hashCode() * 31, 31, this.title)) * 31);
                    }

                    public final String toString() {
                        return "SectionRow(avatar=" + this.avatar + ", title=" + this.title + ", rowAction=" + this.rowAction + ", button=" + this.button + ")";
                    }
                }

                public final class SectionTitle implements SectionLoaded {
                    public final String title;

                    public SectionTitle(String str) {
                        this.title = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof SectionTitle) && this.title.equals(((SectionTitle) obj).title);
                    }

                    public final int hashCode() {
                        return this.title.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionTitle(title=", this.title, ")");
                    }
                }
            }

            public SectionList(ArrayList arrayList) {
                this.list = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SectionList) && this.list.equals(((SectionList) obj).list);
            }

            public final int hashCode() {
                return this.list.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("SectionList(list=", ")", this.list);
            }
        }
    }

    public MerchantBlockingViewModel(String str, Loadable loadable) {
        str.getClass();
        this.header = str;
        this.content = loadable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantBlockingViewModel)) {
            return false;
        }
        MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) obj;
        return Intrinsics.areEqual(this.header, merchantBlockingViewModel.header) && this.content.equals(merchantBlockingViewModel.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return "MerchantBlockingViewModel(header=" + this.header + ", content=" + this.content + ")";
    }
}

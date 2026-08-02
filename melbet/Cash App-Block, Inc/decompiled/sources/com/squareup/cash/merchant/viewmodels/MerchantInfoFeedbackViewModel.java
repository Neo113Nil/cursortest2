package com.squareup.cash.merchant.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantInfoFeedbackViewModel {
    public final Loadable content;

    public interface MerchantInfoFeedbackContentViewModel {

        public final class Confirmation implements MerchantInfoFeedbackContentViewModel {
            public final String buttonText;
            public final String description;
            public final String header;

            public Confirmation(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.header = str;
                this.description = str2;
                this.buttonText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Confirmation)) {
                    return false;
                }
                Confirmation confirmation = (Confirmation) obj;
                return Intrinsics.areEqual(this.header, confirmation.header) && Intrinsics.areEqual(this.description, confirmation.description) && Intrinsics.areEqual(this.buttonText, confirmation.buttonText);
            }

            public final int hashCode() {
                return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.description);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Confirmation(header=", this.header, ", description=", this.description, ", buttonText="), this.buttonText, ")");
            }
        }

        public final class Selection implements MerchantInfoFeedbackContentViewModel {
            public final boolean buttonEnabled;
            public final String buttonText;
            public final String description;
            public final String header;
            public final ListBuilder section;

            public final class MerchantInfoRow {
                public final Category category;
                public final String description;
                public final MerchantInfoIcon icon;
                public final boolean selected;
                public final String title;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Category {
                    public static final /* synthetic */ Category[] $VALUES;
                    public static final Category LOCATION;
                    public static final Category LOGO;
                    public static final Category NAME;

                    static {
                        Category category = new Category("NAME", 0);
                        NAME = category;
                        Category category2 = new Category("LOGO", 1);
                        LOGO = category2;
                        Category category3 = new Category("LOCATION", 2);
                        LOCATION = category3;
                        $VALUES = new Category[]{category, category2, category3};
                    }

                    public static Category valueOf(String str) {
                        return (Category) Enum.valueOf(Category.class, str);
                    }

                    public static Category[] values() {
                        return (Category[]) $VALUES.clone();
                    }
                }

                public interface MerchantInfoIcon {

                    public final class Local implements MerchantInfoIcon {
                        public final Icon icon;

                        public Local(Icon icon) {
                            this.icon = icon;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Local) && this.icon.equals(((Local) obj).icon);
                        }

                        public final int hashCode() {
                            return this.icon.hashCode();
                        }

                        public final String toString() {
                            return "Local(icon=" + this.icon + ")";
                        }
                    }

                    public final class Remote implements MerchantInfoIcon {
                        public final StackedAvatarViewModel.Single avatar;

                        public Remote(StackedAvatarViewModel.Single single) {
                            this.avatar = single;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Remote) && this.avatar.equals(((Remote) obj).avatar);
                        }

                        public final int hashCode() {
                            return this.avatar.avatar.hashCode();
                        }

                        public final String toString() {
                            return "Remote(avatar=" + this.avatar + ")";
                        }
                    }
                }

                public MerchantInfoRow(Category category, MerchantInfoIcon merchantInfoIcon, String str, String str2, boolean z) {
                    str.getClass();
                    this.category = category;
                    this.icon = merchantInfoIcon;
                    this.title = str;
                    this.description = str2;
                    this.selected = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MerchantInfoRow)) {
                        return false;
                    }
                    MerchantInfoRow merchantInfoRow = (MerchantInfoRow) obj;
                    return this.category == merchantInfoRow.category && this.icon.equals(merchantInfoRow.icon) && Intrinsics.areEqual(this.title, merchantInfoRow.title) && Intrinsics.areEqual(this.description, merchantInfoRow.description) && this.selected == merchantInfoRow.selected;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (this.category.hashCode() * 31)) * 31, 31, this.title);
                    String str = this.description;
                    return Boolean.hashCode(this.selected) + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("MerchantInfoRow(category=");
                    sb.append(this.category);
                    sb.append(", icon=");
                    sb.append(this.icon);
                    sb.append(", title=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", description=", this.description, ", selected=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selected, ")");
                }
            }

            public Selection(String str, String str2, ListBuilder listBuilder, String str3, boolean z) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.header = str;
                this.description = str2;
                this.section = listBuilder;
                this.buttonText = str3;
                this.buttonEnabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Selection)) {
                    return false;
                }
                Selection selection = (Selection) obj;
                return Intrinsics.areEqual(this.header, selection.header) && Intrinsics.areEqual(this.description, selection.description) && this.section.equals(selection.section) && Intrinsics.areEqual(this.buttonText, selection.buttonText) && this.buttonEnabled == selection.buttonEnabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.buttonEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.section.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.description)) * 31, 31, this.buttonText);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selection(header=", this.header, ", description=", this.description, ", section=");
                m.append(this.section);
                m.append(", buttonText=");
                m.append(this.buttonText);
                m.append(", buttonEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.buttonEnabled, ")");
            }
        }
    }

    public MerchantInfoFeedbackViewModel(Loadable loadable) {
        this.content = loadable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MerchantInfoFeedbackViewModel) && this.content.equals(((MerchantInfoFeedbackViewModel) obj).content);
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    public final String toString() {
        return "MerchantInfoFeedbackViewModel(content=" + this.content + ")";
    }
}

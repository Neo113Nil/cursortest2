package com.squareup.cash.growtools.viewmodels.manager;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GrowToolsManagerViewModel {

    /* loaded from: classes5.dex */
    public final class Loading implements GrowToolsManagerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1745312165;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Loaded implements GrowToolsManagerViewModel {
        public final UiCallbackModel activityEmbeddedViewModel;
        public final List detailRows;
        public final Dialog dialog;
        public final Header header;
        public final TotalStats totalStats;

        /* loaded from: classes9.dex */
        public final class DetailRow {
            public final String label;
            public final String subLabel;
            public final String value;

            public DetailRow(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.label = str;
                this.value = str2;
                this.subLabel = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DetailRow)) {
                    return false;
                }
                DetailRow detailRow = (DetailRow) obj;
                return Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && Intrinsics.areEqual(this.subLabel, detailRow.subLabel);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value);
                String str = this.subLabel;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailRow(label=", this.label, ", value=", this.value, ", subLabel="), this.subLabel, ")");
            }
        }

        public final class Header {
            public final boolean isAvatarClickable;
            public final boolean isInteractive;
            public final boolean isToggleOn;
            public final Target target;
            public final String title;
            public final String toggleText;

            public final class Target {
                public final String actionButtonText;
                public final GrowToolsAvatar avatar;
                public final Icons badge;
                public final String description;
                public final String name;

                public interface GrowToolsAvatar {

                    /* loaded from: classes5.dex */
                    public final class DefaultAvatar implements GrowToolsAvatar {
                        public final StackedAvatarViewModel.Avatar avatar;

                        public DefaultAvatar(StackedAvatarViewModel.Avatar avatar) {
                            this.avatar = avatar;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof DefaultAvatar) && this.avatar.equals(((DefaultAvatar) obj).avatar);
                        }

                        public final int hashCode() {
                            return this.avatar.hashCode();
                        }

                        public final String toString() {
                            return "DefaultAvatar(avatar=" + this.avatar + ")";
                        }
                    }

                    /* loaded from: classes9.dex */
                    public final class EmojiAvatar implements GrowToolsAvatar {
                        public final String iconId;

                        public EmojiAvatar(String str) {
                            str.getClass();
                            this.iconId = str;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof EmojiAvatar) && Intrinsics.areEqual(this.iconId, ((EmojiAvatar) obj).iconId);
                        }

                        public final int hashCode() {
                            return this.iconId.hashCode();
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmojiAvatar(iconId=", this.iconId, ")");
                        }
                    }
                }

                public Target(String str, String str2, GrowToolsAvatar growToolsAvatar, Icons icons, String str3) {
                    str.getClass();
                    str2.getClass();
                    growToolsAvatar.getClass();
                    this.name = str;
                    this.description = str2;
                    this.avatar = growToolsAvatar;
                    this.badge = icons;
                    this.actionButtonText = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Target)) {
                        return false;
                    }
                    Target target = (Target) obj;
                    return Intrinsics.areEqual(this.name, target.name) && Intrinsics.areEqual(this.description, target.description) && Intrinsics.areEqual(this.avatar, target.avatar) && this.badge == target.badge && Intrinsics.areEqual(this.actionButtonText, target.actionButtonText);
                }

                public final int hashCode() {
                    int hashCode = (this.badge.hashCode() + ((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.description)) * 31)) * 31;
                    String str = this.actionButtonText;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Target(name=", this.name, ", description=", this.description, ", avatar=");
                    m.append(this.avatar);
                    m.append(", badge=");
                    m.append(this.badge);
                    m.append(", actionButtonText=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.actionButtonText, ")");
                }
            }

            public Header(String str, String str2, boolean z, boolean z2, Target target, boolean z3) {
                str.getClass();
                str2.getClass();
                target.getClass();
                this.title = str;
                this.toggleText = str2;
                this.isToggleOn = z;
                this.isInteractive = z2;
                this.target = target;
                this.isAvatarClickable = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.toggleText, header.toggleText) && this.isToggleOn == header.isToggleOn && this.isInteractive == header.isInteractive && Intrinsics.areEqual(this.target, header.target) && this.isAvatarClickable == header.isAvatarClickable;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isAvatarClickable) + ((this.target.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.toggleText), 31, this.isToggleOn), 31, this.isInteractive)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(title=", this.title, ", toggleText=", this.toggleText, ", isToggleOn=");
                re$$ExternalSyntheticOutline0.m(m, this.isToggleOn, ", isInteractive=", this.isInteractive, ", target=");
                m.append(this.target);
                m.append(", isAvatarClickable=");
                m.append(this.isAvatarClickable);
                m.append(")");
                return m.toString();
            }
        }

        /* loaded from: classes9.dex */
        public final class TotalStats {
            public final String amount;
            public final String amountLabel;
            public final String count;
            public final String countLabel;
            public final String title;

            public TotalStats(String str, String str2, String str3, String str4, String str5) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                this.title = str;
                this.countLabel = str2;
                this.count = str3;
                this.amountLabel = str4;
                this.amount = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TotalStats)) {
                    return false;
                }
                TotalStats totalStats = (TotalStats) obj;
                return Intrinsics.areEqual(this.title, totalStats.title) && Intrinsics.areEqual(this.countLabel, totalStats.countLabel) && Intrinsics.areEqual(this.count, totalStats.count) && Intrinsics.areEqual(this.amountLabel, totalStats.amountLabel) && Intrinsics.areEqual(this.amount, totalStats.amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.countLabel), 31, this.count), 31, this.amountLabel);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TotalStats(title=", this.title, ", countLabel=", this.countLabel, ", count=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.count, ", amountLabel=", this.amountLabel, ", amount=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.amount, ")");
            }
        }

        public Loaded(Header header, TotalStats totalStats, UiCallbackModel uiCallbackModel, Dialog dialog, List list) {
            header.getClass();
            uiCallbackModel.getClass();
            list.getClass();
            this.header = header;
            this.totalStats = totalStats;
            this.activityEmbeddedViewModel = uiCallbackModel;
            this.dialog = dialog;
            this.detailRows = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.totalStats, loaded.totalStats) && Intrinsics.areEqual(this.activityEmbeddedViewModel, loaded.activityEmbeddedViewModel) && Intrinsics.areEqual(this.dialog, loaded.dialog) && Intrinsics.areEqual(this.detailRows, loaded.detailRows);
        }

        public final int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            TotalStats totalStats = this.totalStats;
            int hashCode2 = (this.activityEmbeddedViewModel.hashCode() + ((hashCode + (totalStats == null ? 0 : totalStats.hashCode())) * 31)) * 31;
            Dialog dialog = this.dialog;
            return this.detailRows.hashCode() + ((hashCode2 + (dialog != null ? dialog.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(header=");
            sb.append(this.header);
            sb.append(", totalStats=");
            sb.append(this.totalStats);
            sb.append(", activityEmbeddedViewModel=");
            sb.append(this.activityEmbeddedViewModel);
            sb.append(", dialog=");
            sb.append(this.dialog);
            sb.append(", detailRows=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.detailRows, ")");
        }

        public final class Dialog {
            public final String body;
            public final boolean isError;
            public final String primaryButton;
            public final String secondaryButton;
            public final String title;

            public Dialog(String str, String str2, String str3, String str4, boolean z) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.body = str2;
                this.primaryButton = str3;
                this.secondaryButton = str4;
                this.isError = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) obj;
                return Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.body, dialog.body) && Intrinsics.areEqual(this.primaryButton, dialog.primaryButton) && Intrinsics.areEqual(this.secondaryButton, dialog.secondaryButton) && this.isError == dialog.isError;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.primaryButton);
                String str = this.secondaryButton;
                return Boolean.hashCode(this.isError) + ((m + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Dialog(title=", this.title, ", body=", this.body, ", primaryButton=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.primaryButton, ", secondaryButton=", this.secondaryButton, ", isError=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isError, ")");
            }

            public /* synthetic */ Dialog(String str, String str2, String str3) {
                this(str, str2, str3, null, true);
            }
        }

        public Loaded(Header header, TotalStats totalStats, UiCallbackModel uiCallbackModel, Dialog dialog) {
            this(header, totalStats, uiCallbackModel, dialog, EmptyList.INSTANCE);
        }
    }
}

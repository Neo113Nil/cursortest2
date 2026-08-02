package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface SavingsTransferOptionSelectionViewModel {

    public final class Content implements SavingsTransferOptionSelectionViewModel {
        public final boolean showBackButton;
        public final String subtitle;
        public final String title;
        public final ArrayList transferOptions;

        public final class TransferOption {
            public final String body;
            public final Icon icon;
            public final String id;
            public final boolean isEnabled;
            public final String label;

            public final class AvatarIcon implements Icon {
                public final UiAvatar uiAvatar;

                public AvatarIcon(UiAvatar uiAvatar) {
                    this.uiAvatar = uiAvatar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AvatarIcon) && this.uiAvatar.equals(((AvatarIcon) obj).uiAvatar);
                }

                public final int hashCode() {
                    return this.uiAvatar.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.uiAvatar, "AvatarIcon(uiAvatar=", ")");
                }
            }

            public final class GoalIcon implements Icon {
                public final String iconId;
                public final Float progress;

                public GoalIcon(Float f, String str) {
                    this.iconId = str;
                    this.progress = f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof GoalIcon)) {
                        return false;
                    }
                    GoalIcon goalIcon = (GoalIcon) obj;
                    return this.iconId.equals(goalIcon.iconId) && Intrinsics.areEqual((Object) this.progress, (Object) goalIcon.progress);
                }

                public final int hashCode() {
                    int hashCode = this.iconId.hashCode() * 31;
                    Float f = this.progress;
                    return hashCode + (f == null ? 0 : f.hashCode());
                }

                public final String toString() {
                    return "GoalIcon(iconId=" + this.iconId + ", progress=" + this.progress + ")";
                }
            }

            public interface Icon {
            }

            public TransferOption(String str, Icon icon, String str2, String str3, boolean z) {
                str2.getClass();
                str3.getClass();
                this.id = str;
                this.icon = icon;
                this.label = str2;
                this.body = str3;
                this.isEnabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransferOption)) {
                    return false;
                }
                TransferOption transferOption = (TransferOption) obj;
                return this.id.equals(transferOption.id) && this.icon.equals(transferOption.icon) && Intrinsics.areEqual(this.label, transferOption.label) && Intrinsics.areEqual(this.body, transferOption.body) && this.isEnabled == transferOption.isEnabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.label), 31, this.body);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TransferOption(id=");
                sb.append(this.id);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", label=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.label, ", body=", this.body, ", isEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isEnabled, ")");
            }
        }

        public Content(String str, String str2, ArrayList arrayList, boolean z) {
            this.showBackButton = z;
            this.title = str;
            this.subtitle = str2;
            this.transferOptions = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.showBackButton == content.showBackButton && this.title.equals(content.title) && Intrinsics.areEqual(this.subtitle, content.subtitle) && this.transferOptions.equals(content.transferOptions);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showBackButton) * 31, 31, this.title);
            String str = this.subtitle;
            return this.transferOptions.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Content(showBackButton=", ", title=", this.title, ", subtitle=", this.showBackButton);
            m.append(this.subtitle);
            m.append(", transferOptions=");
            m.append(this.transferOptions);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements SavingsTransferOptionSelectionViewModel {
        public final AnimationDirection animationDirection;

        public Loading(AnimationDirection animationDirection) {
            this.animationDirection = animationDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.animationDirection == ((Loading) obj).animationDirection;
        }

        public final int hashCode() {
            return this.animationDirection.hashCode();
        }

        public final String toString() {
            return "Loading(animationDirection=" + this.animationDirection + ")";
        }
    }
}

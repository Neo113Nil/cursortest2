package com.squareup.cash.moneybot.viewmodels.staticpicker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotStaticPickerViewModel {
    public final String cta;
    public final ArrayList options;
    public final String title;

    public interface Icon {

        public final class Avatar implements Icon {
            public final UiAvatar avatar;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.avatar = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
            }

            public final int hashCode() {
                return this.avatar.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
            }
        }

        public final class SavingsGoalIcon implements Icon {
            public final com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon;

            public SavingsGoalIcon(com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon) {
                savingsGoalIcon.getClass();
                this.savingsGoalIcon = savingsGoalIcon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsGoalIcon) && Intrinsics.areEqual(this.savingsGoalIcon, ((SavingsGoalIcon) obj).savingsGoalIcon);
            }

            public final int hashCode() {
                return this.savingsGoalIcon.hashCode();
            }

            public final String toString() {
                return "SavingsGoalIcon(savingsGoalIcon=" + this.savingsGoalIcon + ")";
            }
        }
    }

    public final class Option {
        public final boolean enabled;
        public final Icon icon;
        public final String label;
        public final boolean selected;
        public final String subtitle;
        public final String value;

        public Option(String str, String str2, boolean z, String str3, boolean z2, Icon icon) {
            str.getClass();
            str2.getClass();
            this.value = str;
            this.label = str2;
            this.selected = z;
            this.subtitle = str3;
            this.enabled = z2;
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.areEqual(this.value, option.value) && Intrinsics.areEqual(this.label, option.label) && this.selected == option.selected && Intrinsics.areEqual(this.subtitle, option.subtitle) && this.enabled == option.enabled && Intrinsics.areEqual(this.icon, option.icon);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.label), 31, this.selected);
            String str = this.subtitle;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.enabled);
            Icon icon = this.icon;
            return m2 + (icon != null ? icon.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(value=", this.value, ", label=", this.label, ", selected=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.selected, ", subtitle=", this.subtitle, ", enabled=");
            m.append(this.enabled);
            m.append(", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }
    }

    public MoneybotStaticPickerViewModel(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.cta = str2;
        this.options = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotStaticPickerViewModel)) {
            return false;
        }
        MoneybotStaticPickerViewModel moneybotStaticPickerViewModel = (MoneybotStaticPickerViewModel) obj;
        return Intrinsics.areEqual(this.title, moneybotStaticPickerViewModel.title) && Intrinsics.areEqual(this.cta, moneybotStaticPickerViewModel.cta) && this.options.equals(moneybotStaticPickerViewModel.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.cta);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotStaticPickerViewModel(title=", this.title, ", cta=", this.cta, ", options="), this.options);
    }
}

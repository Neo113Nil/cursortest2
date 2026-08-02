package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ProfileUpsellViewModel {
    public final List upsells;

    public final class ProfileUpsellRow {
        public final Icon icon;
        public final String subtitle;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final String f1041type;
        public final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon ACTION_REQUIRED;
            public static final Icon FAILURE;
            public static final Icon SECURITY_CHECK_OUTLINE;
            public static final Icon UNKNOWN;
            public static final Icon VERIFICATION_ALERT;
            public static final Icon VERIFYING;

            static {
                Icon icon = new Icon("VERIFYING", 0);
                VERIFYING = icon;
                Icon icon2 = new Icon("VERIFICATION_ALERT", 1);
                VERIFICATION_ALERT = icon2;
                Icon icon3 = new Icon("ACTION_REQUIRED", 2);
                ACTION_REQUIRED = icon3;
                Icon icon4 = new Icon("FAILURE", 3);
                FAILURE = icon4;
                Icon icon5 = new Icon("SECURITY_CHECK_OUTLINE", 4);
                SECURITY_CHECK_OUTLINE = icon5;
                Icon icon6 = new Icon("UNKNOWN", 5);
                UNKNOWN = icon6;
                $VALUES = new Icon[]{icon, icon2, icon3, icon4, icon5, icon6};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public ProfileUpsellRow(String str, String str2, Icon icon, String str3, String str4) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.subtitle = str2;
            this.icon = icon;
            this.url = str3;
            this.f1041type = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileUpsellRow)) {
                return false;
            }
            ProfileUpsellRow profileUpsellRow = (ProfileUpsellRow) obj;
            return Intrinsics.areEqual(this.title, profileUpsellRow.title) && Intrinsics.areEqual(this.subtitle, profileUpsellRow.subtitle) && this.icon == profileUpsellRow.icon && Intrinsics.areEqual(this.url, profileUpsellRow.url) && Intrinsics.areEqual(this.f1041type, profileUpsellRow.f1041type);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.url);
            String str = this.f1041type;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileUpsellRow(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
            m.append(this.icon);
            m.append(", url=");
            m.append(this.url);
            m.append(", type=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.f1041type, ")");
        }
    }

    public ProfileUpsellViewModel(List list) {
        list.getClass();
        this.upsells = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileUpsellViewModel) && Intrinsics.areEqual(this.upsells, ((ProfileUpsellViewModel) obj).upsells);
    }

    public final int hashCode() {
        return this.upsells.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ProfileUpsellViewModel(upsells=", ")", this.upsells);
    }
}

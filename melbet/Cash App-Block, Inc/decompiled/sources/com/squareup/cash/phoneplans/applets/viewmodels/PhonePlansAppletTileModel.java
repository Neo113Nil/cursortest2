package com.squareup.cash.phoneplans.applets.viewmodels;

import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PhonePlansAppletTileModel {

    public final class Installed implements PhonePlansAppletTileModel {
        public final String content;
        public final String detail;
        public final Status status;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status Active;
            public static final Status AttentionNeeded;
            public static final Status Cancelled;
            public static final Status Overdue;
            public static final Status Pending;
            public static final Status Provisioned;
            public static final Status Suspended;
            public static final Status Transferring;

            static {
                Status status = new Status("Pending", 0);
                Pending = status;
                Status status2 = new Status("Transferring", 1);
                Transferring = status2;
                Status status3 = new Status("AttentionNeeded", 2);
                AttentionNeeded = status3;
                Status status4 = new Status("Provisioned", 3);
                Provisioned = status4;
                Status status5 = new Status("Active", 4);
                Active = status5;
                Status status6 = new Status("Overdue", 5);
                Overdue = status6;
                Status status7 = new Status("Cancelled", 6);
                Cancelled = status7;
                Status status8 = new Status("Suspended", 7);
                Suspended = status8;
                $VALUES = new Status[]{status, status2, status3, status4, status5, status6, status7, status8};
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Installed(Status status, String str, String str2, String str3) {
            this.status = status;
            this.title = str;
            this.content = str2;
            this.detail = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return this.status == installed.status && this.title.equals(installed.title) && this.content.equals(installed.content) && Intrinsics.areEqual(this.detail, installed.detail);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.status.hashCode() * 31, 31, this.title), 31, this.content);
            String str = this.detail;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Installed(status=");
            sb.append(this.status);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", content=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.content, ", detail=", this.detail, ")");
        }
    }

    public final class Loading implements PhonePlansAppletTileModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 640503945;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Uninstalled implements PhonePlansAppletTileModel {
        public final PromotedAppletTileViewModel.Loaded promotedModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, PromotedAppletTileViewModel.Loaded loaded) {
            this.title = str;
            this.subtitle = str2;
            this.promotedModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return this.title.equals(uninstalled.title) && this.subtitle.equals(uninstalled.subtitle) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedModel;
            return m + (loaded == null ? 0 : loaded.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }
}

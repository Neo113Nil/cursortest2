package com.squareup.cash.banking.sections;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.unicorn.BankingTab;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface NavigationAction {

    public final class ShowDialog implements NavigationAction {
        public final BankingTab.Dialog dialog;
        public final String optionId;

        public ShowDialog(BankingTab.Dialog dialog, String str) {
            dialog.getClass();
            str.getClass();
            this.dialog = dialog;
            this.optionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowDialog)) {
                return false;
            }
            ShowDialog showDialog = (ShowDialog) obj;
            return Intrinsics.areEqual(this.dialog, showDialog.dialog) && Intrinsics.areEqual(this.optionId, showDialog.optionId);
        }

        @Override // com.squareup.cash.banking.sections.NavigationAction
        public final String getOptionId() {
            return this.optionId;
        }

        public final int hashCode() {
            return this.optionId.hashCode() + (this.dialog.hashCode() * 31);
        }

        public final String toString() {
            return "ShowDialog(dialog=" + this.dialog + ", optionId=" + this.optionId + ")";
        }
    }

    public final class ShowUrl implements NavigationAction {
        public final String optionId;
        public final String url;

        public ShowUrl(String str, String str2) {
            str2.getClass();
            this.url = str;
            this.optionId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowUrl)) {
                return false;
            }
            ShowUrl showUrl = (ShowUrl) obj;
            return Intrinsics.areEqual(this.url, showUrl.url) && Intrinsics.areEqual(this.optionId, showUrl.optionId);
        }

        @Override // com.squareup.cash.banking.sections.NavigationAction
        public final String getOptionId() {
            return this.optionId;
        }

        public final int hashCode() {
            String str = this.url;
            return this.optionId.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ShowUrl(url=", this.url, ", optionId=", this.optionId, ")");
        }
    }

    String getOptionId();
}

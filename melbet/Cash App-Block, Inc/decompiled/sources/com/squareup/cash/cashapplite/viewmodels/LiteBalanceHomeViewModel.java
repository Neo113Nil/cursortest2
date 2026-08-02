package com.squareup.cash.cashapplite.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LiteBalanceHomeViewModel {
    public final String convertedBalanceText;
    public final String disclaimer;
    public final String primaryBalanceText;
    public final long rawBalance;
    public final long rawConvertedBalance;
    public final List rows;
    public final String sectionTitle;
    public final String title;

    public final class AccountDetailRow {
        public final RowId id;
        public final String subtitle;
        public final String title;

        public AccountDetailRow(RowId rowId, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = rowId;
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountDetailRow)) {
                return false;
            }
            AccountDetailRow accountDetailRow = (AccountDetailRow) obj;
            return this.id == accountDetailRow.id && Intrinsics.areEqual(this.title, accountDetailRow.title) && Intrinsics.areEqual(this.subtitle, accountDetailRow.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountDetailRow(id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class RowId {
        public static final /* synthetic */ RowId[] $VALUES;
        public static final RowId CLABE;
        public static final RowId DIGITAL_WALLET;
        public static final RowId US_ROUTING_AND_ACCOUNT;

        static {
            RowId rowId = new RowId("US_ROUTING_AND_ACCOUNT", 0);
            US_ROUTING_AND_ACCOUNT = rowId;
            RowId rowId2 = new RowId("CLABE", 1);
            CLABE = rowId2;
            RowId rowId3 = new RowId("DIGITAL_WALLET", 2);
            DIGITAL_WALLET = rowId3;
            $VALUES = new RowId[]{rowId, rowId2, rowId3};
        }

        public static RowId valueOf(String str) {
            return (RowId) Enum.valueOf(RowId.class, str);
        }

        public static RowId[] values() {
            return (RowId[]) $VALUES.clone();
        }
    }

    public LiteBalanceHomeViewModel(String str, long j, String str2, long j2, String str3, String str4, String str5, List list) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        this.primaryBalanceText = str;
        this.rawBalance = j;
        this.convertedBalanceText = str2;
        this.rawConvertedBalance = j2;
        this.title = str3;
        this.sectionTitle = str4;
        this.disclaimer = str5;
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteBalanceHomeViewModel)) {
            return false;
        }
        LiteBalanceHomeViewModel liteBalanceHomeViewModel = (LiteBalanceHomeViewModel) obj;
        return Intrinsics.areEqual(this.primaryBalanceText, liteBalanceHomeViewModel.primaryBalanceText) && this.rawBalance == liteBalanceHomeViewModel.rawBalance && Intrinsics.areEqual(this.convertedBalanceText, liteBalanceHomeViewModel.convertedBalanceText) && this.rawConvertedBalance == liteBalanceHomeViewModel.rawConvertedBalance && Intrinsics.areEqual(this.title, liteBalanceHomeViewModel.title) && Intrinsics.areEqual(this.sectionTitle, liteBalanceHomeViewModel.sectionTitle) && Intrinsics.areEqual(this.disclaimer, liteBalanceHomeViewModel.disclaimer) && Intrinsics.areEqual(this.rows, liteBalanceHomeViewModel.rows);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.primaryBalanceText.hashCode() * 31, 31, this.rawBalance);
        String str = this.convertedBalanceText;
        return this.rows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.rawConvertedBalance), 31, this.title), 31, this.sectionTitle), 31, this.disclaimer);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("LiteBalanceHomeViewModel(primaryBalanceText=", this.primaryBalanceText, ", rawBalance=", this.rawBalance);
        m.append(", convertedBalanceText=");
        m.append(this.convertedBalanceText);
        m.append(", rawConvertedBalance=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.rawConvertedBalance, ", title=", this.title, m);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sectionTitle=", this.sectionTitle, ", disclaimer=", this.disclaimer);
        m.append(", rows=");
        m.append(this.rows);
        m.append(")");
        return m.toString();
    }
}

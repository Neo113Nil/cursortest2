package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PControlListViewModel {
    public final boolean isEditable;
    public final AllowlistRowActionType rowActionType;
    public final String rowValue;
    public final String subtitle;
    public final boolean subtleRowValue;
    public final String title;

    public interface AllowlistRowActionType {

        public final class Add implements AllowlistRowActionType {
            public static final Add INSTANCE = new Add();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Add);
            }

            public final int hashCode() {
                return -551066185;
            }

            public final String toString() {
                return "Add";
            }
        }

        public final class Blocked implements AllowlistRowActionType {
            public static final Blocked INSTANCE = new Blocked();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Blocked);
            }

            public final int hashCode() {
                return -799648766;
            }

            public final String toString() {
                return "Blocked";
            }
        }

        public final class Limit implements AllowlistRowActionType {
            public static final Limit INSTANCE = new Limit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Limit);
            }

            public final int hashCode() {
                return -1283306671;
            }

            public final String toString() {
                return "Limit";
            }
        }
    }

    public P2PControlListViewModel(AllowlistRowActionType allowlistRowActionType, String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        str3.getClass();
        this.rowActionType = allowlistRowActionType;
        this.title = str;
        this.subtitle = str2;
        this.rowValue = str3;
        this.subtleRowValue = z;
        this.isEditable = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PControlListViewModel)) {
            return false;
        }
        P2PControlListViewModel p2PControlListViewModel = (P2PControlListViewModel) obj;
        return Intrinsics.areEqual(this.rowActionType, p2PControlListViewModel.rowActionType) && Intrinsics.areEqual(this.title, p2PControlListViewModel.title) && Intrinsics.areEqual(this.subtitle, p2PControlListViewModel.subtitle) && Intrinsics.areEqual(this.rowValue, p2PControlListViewModel.rowValue) && this.subtleRowValue == p2PControlListViewModel.subtleRowValue && this.isEditable == p2PControlListViewModel.isEditable;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rowActionType.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return Boolean.hashCode(this.isEditable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.rowValue), 31, this.subtleRowValue);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("P2PControlListViewModel(rowActionType=");
        sb.append(this.rowActionType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", rowValue=", this.rowValue, ", subtleRowValue=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.subtleRowValue, ", isEditable=", this.isEditable, ")");
    }
}

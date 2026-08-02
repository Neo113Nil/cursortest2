package com.squareup.cash.bugreporting.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class DiagnosticAttachments implements Parcelable {
    public static final Parcelable.Creator<DiagnosticAttachments> CREATOR = new BorrowLimitHub.Creator(6);
    public final boolean debugPreferencesAvailable;
    public final boolean includeAll;
    public final boolean includeBackStack;
    public final boolean includeDatabase;
    public final boolean includeDebugPreferences;
    public final boolean includeLogs;
    public final boolean includePreferences;
    public final boolean includeSamEligibility;
    public final boolean includeViewHierarchy;
    public final boolean logsAvailable;

    public DiagnosticAttachments(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.includeAll = z;
        this.includeViewHierarchy = z2;
        this.includeBackStack = z3;
        this.includeLogs = z4;
        this.includeDatabase = z5;
        this.includePreferences = z6;
        this.includeDebugPreferences = z7;
        this.includeSamEligibility = z8;
        this.logsAvailable = z9;
        this.debugPreferencesAvailable = z10;
    }

    public static DiagnosticAttachments copy$default(DiagnosticAttachments diagnosticAttachments, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        if ((i & 1) != 0) {
            z = diagnosticAttachments.includeAll;
        }
        boolean z9 = z;
        if ((i & 2) != 0) {
            z2 = diagnosticAttachments.includeViewHierarchy;
        }
        boolean z10 = z2;
        boolean z11 = (i & 4) != 0 ? diagnosticAttachments.includeBackStack : z3;
        boolean z12 = (i & 8) != 0 ? diagnosticAttachments.includeLogs : z4;
        boolean z13 = (i & 16) != 0 ? diagnosticAttachments.includeDatabase : z5;
        boolean z14 = (i & 32) != 0 ? diagnosticAttachments.includePreferences : z6;
        boolean z15 = (i & 64) != 0 ? diagnosticAttachments.includeDebugPreferences : z7;
        boolean z16 = (i & 128) != 0 ? diagnosticAttachments.includeSamEligibility : z8;
        boolean z17 = diagnosticAttachments.logsAvailable;
        boolean z18 = diagnosticAttachments.debugPreferencesAvailable;
        diagnosticAttachments.getClass();
        return new DiagnosticAttachments(z9, z10, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticAttachments)) {
            return false;
        }
        DiagnosticAttachments diagnosticAttachments = (DiagnosticAttachments) obj;
        return this.includeAll == diagnosticAttachments.includeAll && this.includeViewHierarchy == diagnosticAttachments.includeViewHierarchy && this.includeBackStack == diagnosticAttachments.includeBackStack && this.includeLogs == diagnosticAttachments.includeLogs && this.includeDatabase == diagnosticAttachments.includeDatabase && this.includePreferences == diagnosticAttachments.includePreferences && this.includeDebugPreferences == diagnosticAttachments.includeDebugPreferences && this.includeSamEligibility == diagnosticAttachments.includeSamEligibility && this.logsAvailable == diagnosticAttachments.logsAvailable && this.debugPreferencesAvailable == diagnosticAttachments.debugPreferencesAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.debugPreferencesAvailable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.includeAll) * 31, 31, this.includeViewHierarchy), 31, this.includeBackStack), 31, this.includeLogs), 31, this.includeDatabase), 31, this.includePreferences), 31, this.includeDebugPreferences), 31, this.includeSamEligibility), 31, this.logsAvailable);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("DiagnosticAttachments(includeAll=", ", includeViewHierarchy=", ", includeBackStack=", this.includeAll, this.includeViewHierarchy);
        re$$ExternalSyntheticOutline0.m(m, this.includeBackStack, ", includeLogs=", this.includeLogs, ", includeDatabase=");
        re$$ExternalSyntheticOutline0.m(m, this.includeDatabase, ", includePreferences=", this.includePreferences, ", includeDebugPreferences=");
        re$$ExternalSyntheticOutline0.m(m, this.includeDebugPreferences, ", includeSamEligibility=", this.includeSamEligibility, ", logsAvailable=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.logsAvailable, ", debugPreferencesAvailable=", this.debugPreferencesAvailable, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.includeAll ? 1 : 0);
        parcel.writeInt(this.includeViewHierarchy ? 1 : 0);
        parcel.writeInt(this.includeBackStack ? 1 : 0);
        parcel.writeInt(this.includeLogs ? 1 : 0);
        parcel.writeInt(this.includeDatabase ? 1 : 0);
        parcel.writeInt(this.includePreferences ? 1 : 0);
        parcel.writeInt(this.includeDebugPreferences ? 1 : 0);
        parcel.writeInt(this.includeSamEligibility ? 1 : 0);
        parcel.writeInt(this.logsAvailable ? 1 : 0);
        parcel.writeInt(this.debugPreferencesAvailable ? 1 : 0);
    }
}

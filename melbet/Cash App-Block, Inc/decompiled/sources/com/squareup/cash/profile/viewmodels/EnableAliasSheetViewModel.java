package com.squareup.cash.profile.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EnableAliasSheetViewModel {
    public final String body;
    public final List emailAliases;
    public final boolean isUpdateLoading;
    public final List phoneAliases;
    public final String title;

    public EnableAliasSheetViewModel(String str, String str2, List list, List list2, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.title = str;
        this.body = str2;
        this.phoneAliases = list;
        this.emailAliases = list2;
        this.isUpdateLoading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnableAliasSheetViewModel)) {
            return false;
        }
        EnableAliasSheetViewModel enableAliasSheetViewModel = (EnableAliasSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, enableAliasSheetViewModel.title) && Intrinsics.areEqual(this.body, enableAliasSheetViewModel.body) && Intrinsics.areEqual(this.phoneAliases, enableAliasSheetViewModel.phoneAliases) && Intrinsics.areEqual(this.emailAliases, enableAliasSheetViewModel.emailAliases) && this.isUpdateLoading == enableAliasSheetViewModel.isUpdateLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isUpdateLoading) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.phoneAliases), 31, this.emailAliases);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EnableAliasSheetViewModel(title=", this.title, ", body=", this.body, ", phoneAliases=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.phoneAliases, ", emailAliases=", this.emailAliases, ", isUpdateLoading=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isUpdateLoading, ")");
    }
}

package com.squareup.cash.profile.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactMethodDetailsViewModel {
    public final List aliases;
    public final String body;
    public final ArrayList checkedAliases;
    public final boolean isLoading;
    public final boolean isPhoneAliasType;
    public final String title;

    public ContactMethodDetailsViewModel(String str, String str2, List list, ArrayList arrayList, boolean z, boolean z2) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.title = str;
        this.body = str2;
        this.aliases = list;
        this.checkedAliases = arrayList;
        this.isPhoneAliasType = z;
        this.isLoading = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactMethodDetailsViewModel)) {
            return false;
        }
        ContactMethodDetailsViewModel contactMethodDetailsViewModel = (ContactMethodDetailsViewModel) obj;
        return Intrinsics.areEqual(this.title, contactMethodDetailsViewModel.title) && Intrinsics.areEqual(this.body, contactMethodDetailsViewModel.body) && Intrinsics.areEqual(this.aliases, contactMethodDetailsViewModel.aliases) && this.checkedAliases.equals(contactMethodDetailsViewModel.checkedAliases) && this.isPhoneAliasType == contactMethodDetailsViewModel.isPhoneAliasType && this.isLoading == contactMethodDetailsViewModel.isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.checkedAliases, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.aliases), 31), 31, this.isPhoneAliasType);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactMethodDetailsViewModel(title=", this.title, ", body=", this.body, ", aliases=");
        m.append(this.aliases);
        m.append(", checkedAliases=");
        m.append(this.checkedAliases);
        m.append(", isPhoneAliasType=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isPhoneAliasType, ", isLoading=", this.isLoading, ")");
    }
}

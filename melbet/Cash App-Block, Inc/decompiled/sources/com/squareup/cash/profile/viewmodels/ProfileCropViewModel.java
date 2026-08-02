package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileCropViewModel {
    public final String photoUri;

    public ProfileCropViewModel(String str) {
        str.getClass();
        this.photoUri = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileCropViewModel) && Intrinsics.areEqual(this.photoUri, ((ProfileCropViewModel) obj).photoUri);
    }

    public final int hashCode() {
        return this.photoUri.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileCropViewModel(photoUri=", this.photoUri, ")");
    }
}

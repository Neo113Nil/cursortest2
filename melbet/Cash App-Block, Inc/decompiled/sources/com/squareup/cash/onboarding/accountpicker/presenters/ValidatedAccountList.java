package com.squareup.cash.onboarding.accountpicker.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ValidatedAccountList {
    public final List accounts;

    public ValidatedAccountList(List list) {
        list.getClass();
        this.accounts = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidatedAccountList) && Intrinsics.areEqual(this.accounts, ((ValidatedAccountList) obj).accounts);
    }

    public final int hashCode() {
        return this.accounts.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ValidatedAccountList(accounts=", ")", this.accounts);
    }
}

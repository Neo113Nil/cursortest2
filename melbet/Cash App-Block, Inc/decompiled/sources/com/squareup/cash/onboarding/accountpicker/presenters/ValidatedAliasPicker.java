package com.squareup.cash.onboarding.accountpicker.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ValidatedAliasPicker {
    public final String accountId;
    public final ArrayList aliases;
    public final String cashTag;
    public final String preSelectedAliasId;

    public ValidatedAliasPicker(String str, String str2, String str3, ArrayList arrayList) {
        str3.getClass();
        this.cashTag = str;
        this.accountId = str2;
        this.aliases = arrayList;
        this.preSelectedAliasId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidatedAliasPicker)) {
            return false;
        }
        ValidatedAliasPicker validatedAliasPicker = (ValidatedAliasPicker) obj;
        return this.cashTag.equals(validatedAliasPicker.cashTag) && this.accountId.equals(validatedAliasPicker.accountId) && this.aliases.equals(validatedAliasPicker.aliases) && Intrinsics.areEqual(this.preSelectedAliasId, validatedAliasPicker.preSelectedAliasId);
    }

    public final int hashCode() {
        return this.preSelectedAliasId.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.aliases, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashTag.hashCode() * 31, 31, this.accountId), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ValidatedAliasPicker(cashTag=", this.cashTag, ", accountId=", this.accountId, ", aliases=");
        m.append(this.aliases);
        m.append(", preSelectedAliasId=");
        m.append(this.preSelectedAliasId);
        m.append(")");
        return m.toString();
    }
}

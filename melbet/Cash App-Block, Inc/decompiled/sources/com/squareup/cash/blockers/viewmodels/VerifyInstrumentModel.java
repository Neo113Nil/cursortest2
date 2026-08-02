package com.squareup.cash.blockers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VerifyInstrumentModel {
    public final String inputHint;
    public final boolean isLoading;
    public final boolean showHelp;
    public final String title;

    public VerifyInstrumentModel(String str, String str2, boolean z, boolean z2) {
        this.title = str;
        this.inputHint = str2;
        this.isLoading = z;
        this.showHelp = z2;
    }

    public static VerifyInstrumentModel copy$default(VerifyInstrumentModel verifyInstrumentModel, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = verifyInstrumentModel.title;
        }
        String str2 = verifyInstrumentModel.inputHint;
        if ((i & 4) != 0) {
            z = verifyInstrumentModel.isLoading;
        }
        boolean z2 = verifyInstrumentModel.showHelp;
        verifyInstrumentModel.getClass();
        return new VerifyInstrumentModel(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyInstrumentModel)) {
            return false;
        }
        VerifyInstrumentModel verifyInstrumentModel = (VerifyInstrumentModel) obj;
        return Intrinsics.areEqual(this.title, verifyInstrumentModel.title) && Intrinsics.areEqual(this.inputHint, verifyInstrumentModel.inputHint) && this.isLoading == verifyInstrumentModel.isLoading && this.showHelp == verifyInstrumentModel.showHelp;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inputHint;
        return Boolean.hashCode(this.showHelp) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isLoading);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VerifyInstrumentModel(title=", this.title, ", inputHint=", this.inputHint, ", isLoading="), this.isLoading, ", showHelp=", this.showHelp, ")");
    }
}

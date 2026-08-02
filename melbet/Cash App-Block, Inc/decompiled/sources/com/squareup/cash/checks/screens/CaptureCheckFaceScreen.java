package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CaptureCheckFaceScreen implements BlockersScreens.ChildBlockersScreens {
    public static final Parcelable.Creator<CaptureCheckFaceScreen> CREATOR = new CheckCaptureQuestion.Creator(24);
    public final BlockersData blockersData;
    public final CheckFace checkFace;
    public final String miSnapLicense;
    public final AskedQuestion question;

    public CaptureCheckFaceScreen(CheckFace checkFace, AskedQuestion askedQuestion, String str, BlockersData blockersData) {
        checkFace.getClass();
        askedQuestion.getClass();
        str.getClass();
        blockersData.getClass();
        this.checkFace = checkFace;
        this.question = askedQuestion;
        this.miSnapLicense = str;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureCheckFaceScreen)) {
            return false;
        }
        CaptureCheckFaceScreen captureCheckFaceScreen = (CaptureCheckFaceScreen) obj;
        return this.checkFace == captureCheckFaceScreen.checkFace && Intrinsics.areEqual(this.question, captureCheckFaceScreen.question) && Intrinsics.areEqual(this.miSnapLicense, captureCheckFaceScreen.miSnapLicense) && Intrinsics.areEqual(this.blockersData, captureCheckFaceScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.question.hashCode() + (this.checkFace.hashCode() * 31)) * 31, 31, this.miSnapLicense);
    }

    public final String toString() {
        return "CaptureCheckFaceScreen(checkFace=" + this.checkFace + ", question=" + this.question + ", miSnapLicense=" + this.miSnapLicense + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.checkFace.name());
        parcel.writeParcelable(this.question, i);
        parcel.writeString(this.miSnapLicense);
        parcel.writeParcelable(this.blockersData, i);
    }
}

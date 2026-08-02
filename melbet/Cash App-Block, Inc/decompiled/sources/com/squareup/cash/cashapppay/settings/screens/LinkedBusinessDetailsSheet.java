package com.squareup.cash.cashapppay.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LinkedBusinessDetailsSheet implements BottomSheetScreen {
    public static final Parcelable.Creator<LinkedBusinessDetailsSheet> CREATOR = new CheckCaptureQuestion.Creator(20);
    public final SyncBusinessGrant.ActionType actionType;
    public final String businessGrantId;
    public final Image image;
    public final SyncBusinessGrant.RenderingBehavior renderingBehavior;
    public final String title;

    public LinkedBusinessDetailsSheet(String str, Image image, String str2, SyncBusinessGrant.ActionType actionType, SyncBusinessGrant.RenderingBehavior renderingBehavior) {
        str.getClass();
        str2.getClass();
        actionType.getClass();
        this.businessGrantId = str;
        this.image = image;
        this.title = str2;
        this.actionType = actionType;
        this.renderingBehavior = renderingBehavior;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedBusinessDetailsSheet)) {
            return false;
        }
        LinkedBusinessDetailsSheet linkedBusinessDetailsSheet = (LinkedBusinessDetailsSheet) obj;
        return Intrinsics.areEqual(this.businessGrantId, linkedBusinessDetailsSheet.businessGrantId) && Intrinsics.areEqual(this.image, linkedBusinessDetailsSheet.image) && Intrinsics.areEqual(this.title, linkedBusinessDetailsSheet.title) && this.actionType == linkedBusinessDetailsSheet.actionType && this.renderingBehavior == linkedBusinessDetailsSheet.renderingBehavior;
    }

    public final int hashCode() {
        int hashCode = this.businessGrantId.hashCode() * 31;
        Image image = this.image;
        int hashCode2 = (this.actionType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.title)) * 31;
        SyncBusinessGrant.RenderingBehavior renderingBehavior = this.renderingBehavior;
        return hashCode2 + (renderingBehavior != null ? renderingBehavior.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedBusinessDetailsSheet(businessGrantId=" + this.businessGrantId + ", image=" + this.image + ", title=" + this.title + ", actionType=" + this.actionType + ", renderingBehavior=" + this.renderingBehavior + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.businessGrantId);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.title);
        parcel.writeString(this.actionType.name());
        SyncBusinessGrant.RenderingBehavior renderingBehavior = this.renderingBehavior;
        if (renderingBehavior == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(renderingBehavior.name());
        }
    }
}

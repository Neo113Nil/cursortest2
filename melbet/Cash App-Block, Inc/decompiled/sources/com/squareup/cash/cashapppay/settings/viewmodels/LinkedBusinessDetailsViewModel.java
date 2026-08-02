package com.squareup.cash.cashapppay.settings.viewmodels;

import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LinkedBusinessDetailsViewModel {
    public final SyncBusinessGrant.ActionType actionType;
    public final Image image;
    public final String merchantId;
    public final SyncBusinessGrant.RenderingBehavior renderingBehavior;
    public final String title;

    public LinkedBusinessDetailsViewModel(String str, Image image, String str2, SyncBusinessGrant.ActionType actionType, SyncBusinessGrant.RenderingBehavior renderingBehavior) {
        str.getClass();
        str2.getClass();
        actionType.getClass();
        this.merchantId = str;
        this.image = image;
        this.title = str2;
        this.actionType = actionType;
        this.renderingBehavior = renderingBehavior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedBusinessDetailsViewModel)) {
            return false;
        }
        LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) obj;
        return Intrinsics.areEqual(this.merchantId, linkedBusinessDetailsViewModel.merchantId) && Intrinsics.areEqual(this.image, linkedBusinessDetailsViewModel.image) && Intrinsics.areEqual(this.title, linkedBusinessDetailsViewModel.title) && this.actionType == linkedBusinessDetailsViewModel.actionType && this.renderingBehavior == linkedBusinessDetailsViewModel.renderingBehavior;
    }

    public final int hashCode() {
        int hashCode = this.merchantId.hashCode() * 31;
        Image image = this.image;
        int hashCode2 = (this.actionType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.title)) * 31;
        SyncBusinessGrant.RenderingBehavior renderingBehavior = this.renderingBehavior;
        return hashCode2 + (renderingBehavior != null ? renderingBehavior.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedBusinessDetailsViewModel(merchantId=" + this.merchantId + ", image=" + this.image + ", title=" + this.title + ", actionType=" + this.actionType + ", renderingBehavior=" + this.renderingBehavior + ")";
    }
}

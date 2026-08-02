package com.squareup.cash.cashapppay.settings.viewmodels;

import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashAppPaySettingsRowViewModel$BusinessViewModel {
    public final SyncBusinessGrant.ActionType actionType;
    public final String businessGrantId;
    public final Image image;
    public final SyncBusinessGrant.RenderingBehavior renderingBehavior;
    public final String title;

    public CashAppPaySettingsRowViewModel$BusinessViewModel(String str, Image image, String str2, SyncBusinessGrant.ActionType actionType, SyncBusinessGrant.RenderingBehavior renderingBehavior) {
        str2.getClass();
        actionType.getClass();
        this.businessGrantId = str;
        this.image = image;
        this.title = str2;
        this.actionType = actionType;
        this.renderingBehavior = renderingBehavior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPaySettingsRowViewModel$BusinessViewModel)) {
            return false;
        }
        CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel = (CashAppPaySettingsRowViewModel$BusinessViewModel) obj;
        return this.businessGrantId.equals(cashAppPaySettingsRowViewModel$BusinessViewModel.businessGrantId) && Intrinsics.areEqual(this.image, cashAppPaySettingsRowViewModel$BusinessViewModel.image) && Intrinsics.areEqual(this.title, cashAppPaySettingsRowViewModel$BusinessViewModel.title) && this.actionType == cashAppPaySettingsRowViewModel$BusinessViewModel.actionType && this.renderingBehavior == cashAppPaySettingsRowViewModel$BusinessViewModel.renderingBehavior;
    }

    public final int hashCode() {
        int hashCode = this.businessGrantId.hashCode() * 31;
        Image image = this.image;
        int hashCode2 = (this.actionType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.title)) * 31;
        SyncBusinessGrant.RenderingBehavior renderingBehavior = this.renderingBehavior;
        return hashCode2 + (renderingBehavior != null ? renderingBehavior.hashCode() : 0);
    }

    public final String toString() {
        return "BusinessViewModel(businessGrantId=" + this.businessGrantId + ", image=" + this.image + ", title=" + this.title + ", actionType=" + this.actionType + ", renderingBehavior=" + this.renderingBehavior + ")";
    }
}

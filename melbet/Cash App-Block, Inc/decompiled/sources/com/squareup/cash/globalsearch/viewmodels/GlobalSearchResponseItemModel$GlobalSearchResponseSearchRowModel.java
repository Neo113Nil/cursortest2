package com.squareup.cash.globalsearch.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel {
    public final GlobalSearchViewModel$Item$Accessory$ButtonAccessory accessory;
    public final String actionUrl;
    public final GlobalSearchViewModel.Avatar avatar;
    public final String entityId;
    public final String entityType;
    public final String metadataJson;
    public final String subtitle;
    public final String title;
    public final Icons titleIcon;

    public GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel(String str, String str2, String str3, GlobalSearchViewModel.Avatar avatar, GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory, String str4, String str5, String str6, Icons icons) {
        this.title = str;
        this.subtitle = str2;
        this.actionUrl = str3;
        this.avatar = avatar;
        this.accessory = globalSearchViewModel$Item$Accessory$ButtonAccessory;
        this.entityId = str4;
        this.entityType = str5;
        this.metadataJson = str6;
        this.titleIcon = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel)) {
            return false;
        }
        GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel = (GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel) obj;
        return this.title.equals(globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.title) && Intrinsics.areEqual(this.subtitle, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.subtitle) && Intrinsics.areEqual(this.actionUrl, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.actionUrl) && Intrinsics.areEqual(this.avatar, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.avatar) && Intrinsics.areEqual(this.accessory, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.accessory) && Intrinsics.areEqual(this.entityId, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.entityId) && Intrinsics.areEqual(this.entityType, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.entityType) && Intrinsics.areEqual(this.metadataJson, globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.metadataJson) && this.titleIcon == globalSearchResponseItemModel$GlobalSearchResponseSearchRowModel.titleIcon;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GlobalSearchViewModel.Avatar avatar = this.avatar;
        int hashCode4 = (hashCode3 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory = this.accessory;
        int hashCode5 = (hashCode4 + (globalSearchViewModel$Item$Accessory$ButtonAccessory == null ? 0 : globalSearchViewModel$Item$Accessory$ButtonAccessory.button.hashCode())) * 31;
        String str3 = this.entityId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entityType;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.metadataJson;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Icons icons = this.titleIcon;
        return hashCode8 + (icons != null ? icons.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSearchResponseSearchRowModel(title=", this.title, ", subtitle=", this.subtitle, ", actionUrl=");
        m.append(this.actionUrl);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", accessory=");
        m.append(this.accessory);
        m.append(", entityId=");
        m.append(this.entityId);
        m.append(", entityType=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.entityType, ", metadataJson=", this.metadataJson, ", titleIcon=");
        m.append(this.titleIcon);
        m.append(")");
        return m.toString();
    }
}

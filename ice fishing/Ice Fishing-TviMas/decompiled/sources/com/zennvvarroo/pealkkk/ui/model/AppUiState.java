package com.zennvvarroo.pealkkk.ui.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppUiState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$¨\u00069"}, d2 = {"Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "", "selectedTab", "Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;", "selectedAreaId", "", "selectedShelfId", "showAreaDialog", "", "showShelfDialog", "showItemDialog", "editingAreaId", "editingShelfId", "editingItemId", "areaToDelete", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "shelfToDelete", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "itemToDelete", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "(Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zennvvarroo/pealkkk/data/model/StorageArea;Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;Lcom/zennvvarroo/pealkkk/data/model/StoredItem;)V", "getAreaToDelete", "()Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "getEditingAreaId", "()Ljava/lang/String;", "getEditingItemId", "getEditingShelfId", "getItemToDelete", "()Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "getSelectedAreaId", "getSelectedShelfId", "getSelectedTab", "()Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;", "getShelfToDelete", "()Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "getShowAreaDialog", "()Z", "getShowItemDialog", "getShowShelfDialog", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppUiState {
    public static final int $stable = 0;
    private final StorageArea areaToDelete;
    private final String editingAreaId;
    private final String editingItemId;
    private final String editingShelfId;
    private final StoredItem itemToDelete;
    private final String selectedAreaId;
    private final String selectedShelfId;
    private final ZenvaroTab selectedTab;
    private final StorageShelf shelfToDelete;
    private final boolean showAreaDialog;
    private final boolean showItemDialog;
    private final boolean showShelfDialog;

    public AppUiState() {
        this(null, null, null, false, false, false, null, null, null, null, null, null, 4095, null);
    }

    /* renamed from: component1, reason: from getter */
    public final ZenvaroTab getSelectedTab() {
        return this.selectedTab;
    }

    /* renamed from: component10, reason: from getter */
    public final StorageArea getAreaToDelete() {
        return this.areaToDelete;
    }

    /* renamed from: component11, reason: from getter */
    public final StorageShelf getShelfToDelete() {
        return this.shelfToDelete;
    }

    /* renamed from: component12, reason: from getter */
    public final StoredItem getItemToDelete() {
        return this.itemToDelete;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedAreaId() {
        return this.selectedAreaId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedShelfId() {
        return this.selectedShelfId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowAreaDialog() {
        return this.showAreaDialog;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowShelfDialog() {
        return this.showShelfDialog;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowItemDialog() {
        return this.showItemDialog;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEditingAreaId() {
        return this.editingAreaId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEditingShelfId() {
        return this.editingShelfId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEditingItemId() {
        return this.editingItemId;
    }

    public final AppUiState copy(ZenvaroTab selectedTab, String selectedAreaId, String selectedShelfId, boolean showAreaDialog, boolean showShelfDialog, boolean showItemDialog, String editingAreaId, String editingShelfId, String editingItemId, StorageArea areaToDelete, StorageShelf shelfToDelete, StoredItem itemToDelete) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new AppUiState(selectedTab, selectedAreaId, selectedShelfId, showAreaDialog, showShelfDialog, showItemDialog, editingAreaId, editingShelfId, editingItemId, areaToDelete, shelfToDelete, itemToDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUiState)) {
            return false;
        }
        AppUiState appUiState = (AppUiState) other;
        return this.selectedTab == appUiState.selectedTab && Intrinsics.areEqual(this.selectedAreaId, appUiState.selectedAreaId) && Intrinsics.areEqual(this.selectedShelfId, appUiState.selectedShelfId) && this.showAreaDialog == appUiState.showAreaDialog && this.showShelfDialog == appUiState.showShelfDialog && this.showItemDialog == appUiState.showItemDialog && Intrinsics.areEqual(this.editingAreaId, appUiState.editingAreaId) && Intrinsics.areEqual(this.editingShelfId, appUiState.editingShelfId) && Intrinsics.areEqual(this.editingItemId, appUiState.editingItemId) && Intrinsics.areEqual(this.areaToDelete, appUiState.areaToDelete) && Intrinsics.areEqual(this.shelfToDelete, appUiState.shelfToDelete) && Intrinsics.areEqual(this.itemToDelete, appUiState.itemToDelete);
    }

    public int hashCode() {
        int hashCode = this.selectedTab.hashCode() * 31;
        String str = this.selectedAreaId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedShelfId;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showAreaDialog)) * 31) + Boolean.hashCode(this.showShelfDialog)) * 31) + Boolean.hashCode(this.showItemDialog)) * 31;
        String str3 = this.editingAreaId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.editingShelfId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.editingItemId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StorageArea storageArea = this.areaToDelete;
        int hashCode7 = (hashCode6 + (storageArea == null ? 0 : storageArea.hashCode())) * 31;
        StorageShelf storageShelf = this.shelfToDelete;
        int hashCode8 = (hashCode7 + (storageShelf == null ? 0 : storageShelf.hashCode())) * 31;
        StoredItem storedItem = this.itemToDelete;
        return hashCode8 + (storedItem != null ? storedItem.hashCode() : 0);
    }

    public String toString() {
        return "AppUiState(selectedTab=" + this.selectedTab + ", selectedAreaId=" + this.selectedAreaId + ", selectedShelfId=" + this.selectedShelfId + ", showAreaDialog=" + this.showAreaDialog + ", showShelfDialog=" + this.showShelfDialog + ", showItemDialog=" + this.showItemDialog + ", editingAreaId=" + this.editingAreaId + ", editingShelfId=" + this.editingShelfId + ", editingItemId=" + this.editingItemId + ", areaToDelete=" + this.areaToDelete + ", shelfToDelete=" + this.shelfToDelete + ", itemToDelete=" + this.itemToDelete + ")";
    }

    public AppUiState(ZenvaroTab selectedTab, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, StorageArea storageArea, StorageShelf storageShelf, StoredItem storedItem) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.selectedTab = selectedTab;
        this.selectedAreaId = str;
        this.selectedShelfId = str2;
        this.showAreaDialog = z;
        this.showShelfDialog = z2;
        this.showItemDialog = z3;
        this.editingAreaId = str3;
        this.editingShelfId = str4;
        this.editingItemId = str5;
        this.areaToDelete = storageArea;
        this.shelfToDelete = storageShelf;
        this.itemToDelete = storedItem;
    }

    public /* synthetic */ AppUiState(ZenvaroTab zenvaroTab, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, StorageArea storageArea, StorageShelf storageShelf, StoredItem storedItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ZenvaroTab.OVERVIEW : zenvaroTab, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : storageArea, (i & 1024) != 0 ? null : storageShelf, (i & 2048) == 0 ? storedItem : null);
    }

    public final ZenvaroTab getSelectedTab() {
        return this.selectedTab;
    }

    public final String getSelectedAreaId() {
        return this.selectedAreaId;
    }

    public final String getSelectedShelfId() {
        return this.selectedShelfId;
    }

    public final boolean getShowAreaDialog() {
        return this.showAreaDialog;
    }

    public final boolean getShowShelfDialog() {
        return this.showShelfDialog;
    }

    public final boolean getShowItemDialog() {
        return this.showItemDialog;
    }

    public final String getEditingAreaId() {
        return this.editingAreaId;
    }

    public final String getEditingShelfId() {
        return this.editingShelfId;
    }

    public final String getEditingItemId() {
        return this.editingItemId;
    }

    public final StorageArea getAreaToDelete() {
        return this.areaToDelete;
    }

    public final StorageShelf getShelfToDelete() {
        return this.shelfToDelete;
    }

    public final StoredItem getItemToDelete() {
        return this.itemToDelete;
    }
}

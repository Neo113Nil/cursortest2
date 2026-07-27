package com.zennvvarroo.pealkkk.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoredItem.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u0006/"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "", "id", "", "shelfId", "title", "quantity", "", "minimumQuantity", "category", "Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "container", "note", "createdAt", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/zennvvarroo/pealkkk/data/model/ItemCategory;Ljava/lang/String;Ljava/lang/String;JJ)V", "getCategory", "()Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "getContainer", "()Ljava/lang/String;", "getCreatedAt", "()J", "getId", "getMinimumQuantity", "()I", "getNote", "getQuantity", "getShelfId", "getTitle", "getUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoredItem {
    public static final int $stable = 0;
    private final ItemCategory category;
    private final String container;
    private final long createdAt;
    private final String id;
    private final int minimumQuantity;
    private final String note;
    private final int quantity;
    private final String shelfId;
    private final String title;
    private final long updatedAt;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShelfId() {
        return this.shelfId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /* renamed from: component6, reason: from getter */
    public final ItemCategory getCategory() {
        return this.category;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContainer() {
        return this.container;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final StoredItem copy(String id, String shelfId, String title, int quantity, int minimumQuantity, ItemCategory category, String container, String note, long createdAt, long updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shelfId, "shelfId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(note, "note");
        return new StoredItem(id, shelfId, title, quantity, minimumQuantity, category, container, note, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredItem)) {
            return false;
        }
        StoredItem storedItem = (StoredItem) other;
        return Intrinsics.areEqual(this.id, storedItem.id) && Intrinsics.areEqual(this.shelfId, storedItem.shelfId) && Intrinsics.areEqual(this.title, storedItem.title) && this.quantity == storedItem.quantity && this.minimumQuantity == storedItem.minimumQuantity && this.category == storedItem.category && Intrinsics.areEqual(this.container, storedItem.container) && Intrinsics.areEqual(this.note, storedItem.note) && this.createdAt == storedItem.createdAt && this.updatedAt == storedItem.updatedAt;
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.shelfId.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Integer.hashCode(this.minimumQuantity)) * 31) + this.category.hashCode()) * 31) + this.container.hashCode()) * 31) + this.note.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "StoredItem(id=" + this.id + ", shelfId=" + this.shelfId + ", title=" + this.title + ", quantity=" + this.quantity + ", minimumQuantity=" + this.minimumQuantity + ", category=" + this.category + ", container=" + this.container + ", note=" + this.note + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public StoredItem(String id, String shelfId, String title, int i, int i2, ItemCategory category, String container, String note, long j, long j2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shelfId, "shelfId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(note, "note");
        this.id = id;
        this.shelfId = shelfId;
        this.title = title;
        this.quantity = i;
        this.minimumQuantity = i2;
        this.category = category;
        this.container = container;
        this.note = note;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getShelfId() {
        return this.shelfId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final int getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public final ItemCategory getCategory() {
        return this.category;
    }

    public final String getContainer() {
        return this.container;
    }

    public final String getNote() {
        return this.note;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}

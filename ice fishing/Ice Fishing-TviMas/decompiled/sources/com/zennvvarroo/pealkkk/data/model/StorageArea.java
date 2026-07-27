package com.zennvvarroo.pealkkk.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageArea.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "", "id", "", "title", "note", "color", "Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "createdAt", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zennvvarroo/pealkkk/data/model/AreaColor;JJ)V", "getColor", "()Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "getCreatedAt", "()J", "getId", "()Ljava/lang/String;", "getNote", "getTitle", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StorageArea {
    public static final int $stable = 0;
    private final AreaColor color;
    private final long createdAt;
    private final String id;
    private final String note;
    private final String title;
    private final long updatedAt;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component4, reason: from getter */
    public final AreaColor getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final StorageArea copy(String id, String title, String note, AreaColor color, long createdAt, long updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(color, "color");
        return new StorageArea(id, title, note, color, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageArea)) {
            return false;
        }
        StorageArea storageArea = (StorageArea) other;
        return Intrinsics.areEqual(this.id, storageArea.id) && Intrinsics.areEqual(this.title, storageArea.title) && Intrinsics.areEqual(this.note, storageArea.note) && this.color == storageArea.color && this.createdAt == storageArea.createdAt && this.updatedAt == storageArea.updatedAt;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.note.hashCode()) * 31) + this.color.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "StorageArea(id=" + this.id + ", title=" + this.title + ", note=" + this.note + ", color=" + this.color + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public StorageArea(String id, String title, String note, AreaColor color, long j, long j2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = id;
        this.title = title;
        this.note = note;
        this.color = color;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNote() {
        return this.note;
    }

    public final AreaColor getColor() {
        return this.color;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}

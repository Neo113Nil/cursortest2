package com.emeraldpulse.kyra;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0012HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/emeraldpulse/kyra/RoomChecklist;", "", "id", "", "room", "focus", "items", "", "Lcom/emeraldpulse/kyra/RoomCheckItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getRoom", "getFocus", "getItems", "()Ljava/util/List;", "completed", "", "getCompleted", "()I", NotificationCompat.CATEGORY_PROGRESS, "", "getProgress", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* data */ class RoomChecklist {
    private final String focus;
    private final String id;
    private final List<RoomCheckItem> items;
    private final String room;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomChecklist copy$default(RoomChecklist roomChecklist, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roomChecklist.id;
        }
        if ((i & 2) != 0) {
            str2 = roomChecklist.room;
        }
        if ((i & 4) != 0) {
            str3 = roomChecklist.focus;
        }
        if ((i & 8) != 0) {
            list = roomChecklist.items;
        }
        return roomChecklist.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFocus() {
        return this.focus;
    }

    public final List<RoomCheckItem> component4() {
        return this.items;
    }

    public final RoomChecklist copy(String id, String room, String focus, List<RoomCheckItem> items) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(items, "items");
        return new RoomChecklist(id, room, focus, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomChecklist)) {
            return false;
        }
        RoomChecklist roomChecklist = (RoomChecklist) other;
        return Intrinsics.areEqual(this.id, roomChecklist.id) && Intrinsics.areEqual(this.room, roomChecklist.room) && Intrinsics.areEqual(this.focus, roomChecklist.focus) && Intrinsics.areEqual(this.items, roomChecklist.items);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.room.hashCode()) * 31) + this.focus.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "RoomChecklist(id=" + this.id + ", room=" + this.room + ", focus=" + this.focus + ", items=" + this.items + ")";
    }

    public RoomChecklist(String id, String room, String focus, List<RoomCheckItem> items) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id;
        this.room = room;
        this.focus = focus;
        this.items = items;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRoom() {
        return this.room;
    }

    public final String getFocus() {
        return this.focus;
    }

    public final List<RoomCheckItem> getItems() {
        return this.items;
    }

    public final int getCompleted() {
        List<RoomCheckItem> list = this.items;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((RoomCheckItem) it.next()).getDone() && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final float getProgress() {
        if (this.items.isEmpty()) {
            return 0.0f;
        }
        return getCompleted() / this.items.size();
    }
}

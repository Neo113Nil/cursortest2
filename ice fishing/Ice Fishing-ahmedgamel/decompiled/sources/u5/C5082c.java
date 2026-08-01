package u5;

import kotlin.jvm.internal.h;

/* renamed from: u5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5082c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;
    private final String id;
    private final String message;
    private final String title;

    public C5082c(int i, String id, String fullData, long j6, String str, String str2) {
        h.e(id, "id");
        h.e(fullData, "fullData");
        this.androidId = i;
        this.id = id;
        this.fullData = fullData;
        this.createdAt = j6;
        this.title = str;
        this.message = str2;
    }

    public final int getAndroidId() {
        return this.androidId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}

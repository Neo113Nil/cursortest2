package oa;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;

    /* renamed from: id, reason: collision with root package name */
    private final String f5388id;
    private final String message;
    private final String title;

    public c(int i10, String str, String str2, long j3, String str3, String str4) {
        j.e(str, "id");
        j.e(str2, "fullData");
        this.androidId = i10;
        this.f5388id = str;
        this.fullData = str2;
        this.createdAt = j3;
        this.title = str3;
        this.message = str4;
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
        return this.f5388id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}

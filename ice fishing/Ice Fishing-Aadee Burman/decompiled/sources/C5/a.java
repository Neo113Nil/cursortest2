package C5;

import Z5.f;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a {
    private final String id;
    private final f status;

    public a(String str, f status) {
        h.e(status, "status");
        this.id = str;
        this.status = status;
    }

    public final String getId() {
        return this.id;
    }

    public final f getStatus() {
        return this.status;
    }
}

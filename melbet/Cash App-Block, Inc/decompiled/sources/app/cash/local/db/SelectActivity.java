package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SelectActivity {
    public final LocalCashActivity activity;

    public SelectActivity(LocalCashActivity localCashActivity) {
        this.activity = localCashActivity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectActivity) && Intrinsics.areEqual(this.activity, ((SelectActivity) obj).activity);
    }

    public final int hashCode() {
        LocalCashActivity localCashActivity = this.activity;
        if (localCashActivity == null) {
            return 0;
        }
        return localCashActivity.hashCode();
    }

    public final String toString() {
        return "SelectActivity(activity=" + this.activity + ")";
    }
}

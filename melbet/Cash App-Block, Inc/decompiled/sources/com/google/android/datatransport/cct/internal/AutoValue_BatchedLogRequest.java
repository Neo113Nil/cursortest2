package com.google.android.datatransport.cct.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class AutoValue_BatchedLogRequest extends BatchedLogRequest {
    public final ArrayList logRequests;

    public AutoValue_BatchedLogRequest(ArrayList arrayList) {
        this.logRequests = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchedLogRequest)) {
            return false;
        }
        return this.logRequests.equals(((AutoValue_BatchedLogRequest) ((BatchedLogRequest) obj)).logRequests);
    }

    public final int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("}", new StringBuilder("BatchedLogRequest{logRequests="), this.logRequests);
    }
}

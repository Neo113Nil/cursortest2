package p0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4823b {
    public static /* synthetic */ GetTopicsRequest.Builder c() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse g(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic h(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager i(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void l() {
        new DeletionRequest.Builder();
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }
}

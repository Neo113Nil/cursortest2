package coil3.request;

import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class BaseRequestDelegate implements RequestDelegate {
    public final Job job;

    public /* synthetic */ BaseRequestDelegate(Job job) {
        this.job = job;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaseRequestDelegate m1462boximpl(Job job) {
        return new BaseRequestDelegate(job);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BaseRequestDelegate) {
            return this.job.equals(((BaseRequestDelegate) obj).job);
        }
        return false;
    }

    public final int hashCode() {
        return this.job.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.job + ")";
    }
}

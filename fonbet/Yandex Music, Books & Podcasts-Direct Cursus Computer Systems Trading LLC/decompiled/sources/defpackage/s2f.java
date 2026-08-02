package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s2f {
    public Function2 a;
    public JobParameters b;

    public final JobParameters a() {
        JobParameters jobParameters = this.b;
        if (jobParameters != null) {
            return jobParameters;
        }
        Intrinsics.j("parameters");
        throw null;
    }

    public abstract void b(Context context, JobParameters jobParameters);

    public abstract boolean c(Context context, JobParameters jobParameters);
}

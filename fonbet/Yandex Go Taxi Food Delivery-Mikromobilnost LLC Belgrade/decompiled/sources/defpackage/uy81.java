package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class uy81 implements wx60 {
    public final GoogleApiManager a;
    public final int b;
    public final wn2 c;
    public final long w;
    public final long x;

    public uy81(GoogleApiManager googleApiManager, int i, wn2 wn2Var, long j, long j2) {
        this.a = googleApiManager;
        this.b = i;
        this.c = wn2Var;
        this.w = j;
        this.x = j2;
    }

    public static ConnectionTelemetryConfiguration a(jy81 jy81Var, a aVar, int i) {
        ConnectionTelemetryConfiguration l = aVar.l();
        if (l == null || !l.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = l.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = l.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && qza1.c(i, methodInvocationMethodKeyDisallowlist)) {
                return null;
            }
        } else if (!qza1.c(i, methodInvocationMethodKeyAllowlist)) {
            return null;
        }
        if (jy81Var.E < l.getMaxMethodInvocationsLogged()) {
            return l;
        }
        return null;
    }

    @Override // defpackage.wx60
    public final void onComplete(Task task) {
        jy81 zai;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        long j3 = this.w;
        GoogleApiManager googleApiManager = this.a;
        if (googleApiManager.zaD()) {
            RootTelemetryConfiguration a = mwk0.b().a();
            if ((a == null || a.getMethodInvocationTelemetryEnabled()) && (zai = googleApiManager.zai(this.c)) != null) {
                Object obj = zai.b;
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    boolean z = j3 > 0;
                    int i7 = aVar.O;
                    if (a != null) {
                        z &= a.getMethodTimingTelemetryEnabled();
                        int batchPeriodMillis = a.getBatchPeriodMillis();
                        int maxMethodInvocationsInBatch = a.getMaxMethodInvocationsInBatch();
                        int version = a.getVersion();
                        if (aVar.T == null || aVar.isConnecting()) {
                            i = version;
                        } else {
                            ConnectionTelemetryConfiguration a2 = a(zai, aVar, this.b);
                            if (a2 == null) {
                                return;
                            }
                            boolean z2 = a2.getMethodTimingTelemetryEnabled() && j3 > 0;
                            maxMethodInvocationsInBatch = a2.getMaxMethodInvocationsLogged();
                            i = version;
                            z = z2;
                        }
                        i3 = batchPeriodMillis;
                        i2 = maxMethodInvocationsInBatch;
                    } else {
                        i = 0;
                        i2 = 100;
                        i3 = 5000;
                    }
                    GoogleApiManager googleApiManager2 = this.a;
                    int i8 = -1;
                    if (task.o()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (task.m()) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        Exception j4 = task.j();
                        if (j4 instanceof ApiException) {
                            Status a3 = ((ApiException) j4).a();
                            i4 = a3.getStatusCode();
                            ConnectionResult connectionResult = a3.getConnectionResult();
                            if (connectionResult != null) {
                                i5 = connectionResult.getErrorCode();
                                i6 = i4;
                            }
                        } else {
                            i4 = 101;
                        }
                        i5 = -1;
                        i6 = i4;
                    }
                    if (z) {
                        long j5 = this.x;
                        long currentTimeMillis = System.currentTimeMillis();
                        i8 = (int) (SystemClock.elapsedRealtime() - j5);
                        j = j3;
                        j2 = currentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    googleApiManager2.zaw(new MethodInvocation(this.b, i6, i5, j, j2, null, null, i7, i8), i, i3, i2);
                }
            }
        }
    }
}

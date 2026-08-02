package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* loaded from: classes.dex */
public final class kzr {
    public static final String d = jsg.n("SystemJobInfoConverter");
    public final ComponentName a;
    public final z7l b;
    public final boolean c;

    public kzr(Context context, z7l z7lVar, boolean z) {
        this.b = z7lVar;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(t4w t4wVar, int i) {
        int i2;
        String str;
        fa6 fa6Var = t4wVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", t4wVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", t4wVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", t4wVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = fa6Var.c;
        Set<ca6> set = fa6Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = fa6Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a = fa6Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || a == null) {
            g2j g2jVar = fa6Var.a;
            if (i3 < 30 || g2jVar != g2j.f) {
                int ordinal = g2jVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4 || i3 < 26) {
                                    jsg.j().e(d, "API version too low. Cannot convert network type value " + g2jVar);
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a);
        }
        if (!z2) {
            extras.setBackoffCriteria(t4wVar.m, t4wVar.l == bk2.b ? 0 : 1);
        }
        long a2 = t4wVar.a();
        this.b.getClass();
        long max = Math.max(a2 - System.currentTimeMillis(), 0L);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!t4wVar.q && this.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (ca6 ca6Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(ca6Var.a, ca6Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(fa6Var.g);
            extras.setTriggerContentMaxDelay(fa6Var.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(fa6Var.e);
            extras.setRequiresStorageNotLow(fa6Var.f);
        }
        Object[] objArr = t4wVar.k > 0;
        boolean z3 = max > 0;
        if (i4 >= 31 && t4wVar.q && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = t4wVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}

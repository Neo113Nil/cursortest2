package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class jxr extends s2f {
    public rar d;
    public final tf6 c = gld.e(dm6.b);
    public final jyr e = l18.b.b(hag.I(jrk.class), true);

    @Override // defpackage.s2f
    public final void b(Context context, JobParameters jobParameters) {
        Continuation continuation = null;
        v3w.k("onStartJob ", jobParameters.getJobId(), 4, "SyncSchedulerJob", null);
        Iterator it = pxr.a.iterator();
        while (it.hasNext()) {
            fme fmeVar = (fme) it.next();
            switch (fmeVar.a) {
                case 0:
                    Timber.d("onSyncStarted", new Object[0]);
                    Iterator it2 = eme.a.iterator();
                    while (it2.hasNext()) {
                        ktm ktmVar = (ktm) ((dme) it2.next()).a;
                        ktmVar.getClass();
                        etn.k0(ktmVar, Float.valueOf(0.0f));
                    }
                    break;
                default:
                    ktm ktmVar2 = (ktm) ((ltm) fmeVar.b);
                    ktmVar2.getClass();
                    etn.k0(ktmVar2, oxr.a);
                    break;
            }
        }
        rar y = x97.y(this.c, null, null, new v0r(this, continuation, 14), 3);
        y.R(new kzp(this, jobParameters));
        this.d = y;
    }

    @Override // defpackage.s2f
    public final boolean c(Context context, JobParameters jobParameters) {
        v3w.k("onStopJob ", jobParameters.getJobId(), 4, "SyncSchedulerJob", null);
        rar rarVar = this.d;
        boolean z = false;
        if (rarVar != null && rarVar.b()) {
            z = true;
        }
        rar rarVar2 = this.d;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        return z;
    }
}

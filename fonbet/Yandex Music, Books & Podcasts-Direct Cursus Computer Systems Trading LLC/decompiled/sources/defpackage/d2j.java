package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.yandex.pulse.histogram.ComponentHistograms;
import j$.time.Duration;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class d2j extends s2f {
    public static final Duration f;
    public static final Duration g;
    public static final Duration h;
    public rar d;
    public final tf6 c = gld.e(dm6.b);
    public final jyr e = l18.b.b(hag.I(w87.class), true);

    static {
        Duration ofHours = Duration.ofHours(24L);
        ofHours.getClass();
        f = ofHours;
        Duration ofHours2 = Duration.ofHours(1L);
        ofHours2.getClass();
        g = ofHours2;
        Duration ofHours3 = Duration.ofHours(2L);
        ofHours3.getClass();
        h = ofHours3;
    }

    @Override // defpackage.s2f
    public final void b(Context context, JobParameters jobParameters) {
        Continuation continuation = null;
        ssg.a(3, null, "NetworkTrafficAnalyticsJob: onStartJob", null);
        long j = jobParameters.getExtras().getLong("override_interval_duration");
        Duration ofMillis = j > 0 ? Duration.ofMillis(j) : f;
        long j2 = jobParameters.getExtras().getLong("override_window_size");
        Duration ofMillis2 = j2 > 0 ? Duration.ofMillis(j2) : h;
        ofMillis.getClass();
        ofMillis2.getClass();
        this.d = x97.y(this.c, null, null, new v3(this, ofMillis, ofMillis2, continuation, 2), 3);
    }

    @Override // defpackage.s2f
    public final boolean c(Context context, JobParameters jobParameters) {
        ssg.a(3, null, "NetworkTrafficAnalyticsJob: onStopJob", null);
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

    public final void d(e2j e2jVar, Duration duration, Duration duration2) {
        v87 v87Var;
        u87 u87Var;
        w87 w87Var = (w87) this.e.getValue();
        Function0 function0 = w87Var.c;
        p4t p4tVar = w87Var.b;
        ssg.a(3, null, "Measure for " + e2jVar, null);
        n4t n4tVar = w87Var.a;
        SharedPreferences sharedPreferences = n4tVar.a;
        if (sharedPreferences.getLong("pulse_job_traffic_timestamp:" + e2jVar.name(), 0L) != 0) {
            long j = sharedPreferences.getLong("pulse_job_traffic_timestamp:" + e2jVar.name(), 0L);
            long j2 = sharedPreferences.getLong("pulse_job_key_traffic_size:" + e2jVar.name(), 0L);
            long a = p4tVar.a(e2jVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long longValue = ((Number) function0.invoke()).longValue();
            n4tVar.a(p4tVar.a(e2jVar), longValue, e2jVar);
            if (((Number) function0.invoke()).longValue() - SystemClock.elapsedRealtime() <= j) {
                a -= j2;
                elapsedRealtime = longValue - j;
            }
            long j3 = a;
            Duration ofMillis = Duration.ofMillis(elapsedRealtime);
            ofMillis.getClass();
            v87Var = new v87(j3, ofMillis);
        } else {
            ssg.a(3, null, "Baseline for " + e2jVar + " was reset or was not set yet. Set it now", null);
            w87Var.a(e2jVar);
            v87Var = null;
        }
        if (v87Var == null) {
            return;
        }
        Duration minus = duration.minus(duration2);
        minus.getClass();
        Duration plus = duration.plus(duration2);
        plus.getClass();
        long j4 = v87Var.a;
        Duration duration3 = v87Var.b;
        if (j4 < 0 || duration3.compareTo(minus) < 0 || duration3.compareTo(plus) > 0) {
            ssg.a(3, null, "Try to record " + j4 + " bytes for " + duration3 + ". Allowed interval is " + minus + " – " + plus, null);
            return;
        }
        long j5 = 1024;
        int i = (int) ((j4 / j5) / j5);
        int ordinal = e2jVar.ordinal();
        if (ordinal == 0) {
            u87Var = u87.RECEIVED;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            u87Var = u87.TRANSMITTED;
        }
        String str = u87Var.a;
        Object obj = ComponentHistograms.b;
        xee.B().b(str, 1, 20480, 100).b(i);
        if (e2jVar == e2j.a) {
            y60 e = m4t.b.e();
            arf g2 = tlm.g(bwf.c);
            ((Map) g2.getValue()).put("mb", Integer.valueOf(i));
            tlm.o(e, "Traffic_Received_Measured", g2.isInitialized() ? (Map) g2.getValue() : null);
            if (i > 10000) {
                v3w.k("Too large received traffic value: ", i, 7, null, null);
            }
        }
        ssg.a(3, null, dfi.c(i, "Traffic data recorded: ", " MB"), null);
    }
}

package defpackage;

import com.yandex.go.network_metrics.experiment.ReportingDestination;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class sqo {
    public static final ReportingDestination f = new ReportingDestination(Collections.singletonList("regular"), EmptyList.a);
    public final boolean a;
    public final boolean b;
    public final Map c;
    public final Set d;
    public final ReportingDestination e;

    public /* synthetic */ sqo(int i) {
        this(false, false, b.f(), EmptySet.a, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqo)) {
            return false;
        }
        sqo sqoVar = (sqo) obj;
        return this.a == sqoVar.a && this.b == sqoVar.b && jl40.l(this.c, sqoVar.c) && jl40.l(this.d, sqoVar.d) && jl40.l(this.e, sqoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g8e.e(this.d, unr0.d(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ExperimentState(isEnabled=", ", reportNetworkMetrics=", ", disabledEndpoints=", this.a, this.b);
        u.append(this.c);
        u.append(", logHostEndpointsPostfixes=");
        u.append(this.d);
        u.append(", destination=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public sqo(boolean z, boolean z2, Map map, Set set, ReportingDestination reportingDestination) {
        this.a = z;
        this.b = z2;
        this.c = map;
        this.d = set;
        this.e = reportingDestination;
    }

    public sqo() {
        this(0);
    }
}

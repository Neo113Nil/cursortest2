package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public final class id {
    public final d9 a;
    public long b;
    public final long c;
    public jd d;
    public int e;
    public Integer f;
    public long g;
    public int h;

    public id(d9 d9Var, long j, long j2) {
        jd jdVar = jd.PENDING_START;
        d9Var.getClass();
        jdVar.getClass();
        this.a = d9Var;
        this.b = j;
        this.c = j2;
        this.d = jdVar;
        this.e = 0;
        this.f = null;
        this.g = j2;
    }

    public final String a(long j) {
        int hashCode = this.a.hashCode();
        kd e = ((i2) this.a).e();
        long j2 = this.b - j;
        long j3 = this.c - j;
        jd jdVar = this.d;
        long j4 = this.g - j;
        int i = this.h;
        StringBuilder sb = new StringBuilder("\n            |RequestInfo for ");
        sb.append(hashCode);
        sb.append(" \n            | at ");
        sb.append(j);
        sb.append("\n            | request.target = ");
        sb.append(e);
        sb.append("\n            | nextAdvance = ");
        sb.append(j2);
        Boxes$$ExternalSyntheticOutline1.m1151m(j3, "\n            | createdAt = ", "\n            | state = ", sb);
        sb.append(jdVar);
        sb.append("\n            | lastStateMovedAt = ");
        sb.append(j4);
        sb.append("\n            | timesMovedToRetry = ");
        sb.append(i);
        sb.append("\n        ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }

    public static final String a(id idVar, jd jdVar, long j) {
        return "Moving from " + idVar.d + " -> " + jdVar + " with time " + j + " for \n" + idVar.a(j);
    }

    public static final String a(id idVar, long j) {
        return "Moving to pending retry.Updated retry count: " + idVar.h + " for: \n" + idVar.a(j);
    }

    public final void a(long j, jd jdVar) {
        jdVar.getClass();
        if (this.d != jdVar) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new q$$ExternalSyntheticLambda1(this, jdVar, j, 4), 2, (Object) null);
            this.g = j;
            this.d = jdVar;
            if (jdVar == jd.PENDING_RETRY) {
                this.h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new c7$$ExternalSyntheticLambda5(this, j, 3), 2, (Object) null);
            }
        }
    }
}

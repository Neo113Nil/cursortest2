package defpackage;

import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class wf0 implements x42, jms {
    public final /* synthetic */ tf0 a;

    public wf0(tf0 tf0Var) {
        this.a = tf0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x42) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.x42
    public final Map getEventAnalyticsParams(lq31 lq31Var) {
        return this.a.B.w;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, tf0.class, "getAnalyticsParams", "getAnalyticsParams(Lru/yandex/taxi/analytics/events/ViewEvent;)Ljava/util/Map;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

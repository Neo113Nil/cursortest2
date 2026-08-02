package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class o8h {
    public static final js3 g = new js3("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 0);
    public final Long a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final tbo e;
    public final zwd f;

    public o8h(Map map, boolean z, int i, int i2) {
        long j;
        boolean z2;
        tbo tboVar;
        zwd zwdVar;
        this.a = qwp.Y("timeout", map);
        this.b = qwp.N("waitForReady", map);
        Integer U = qwp.U("maxResponseMessageBytes", map);
        this.c = U;
        if (U != null) {
            o2g.H(U, "maxInboundMessageSize %s exceeds bounds", U.intValue() >= 0);
        }
        Integer U2 = qwp.U("maxRequestMessageBytes", map);
        this.d = U2;
        if (U2 != null) {
            o2g.H(U2, "maxOutboundMessageSize %s exceeds bounds", U2.intValue() >= 0);
        }
        Map V = z ? qwp.V("retryPolicy", map) : null;
        if (V == null) {
            j = 0;
            tboVar = null;
            z2 = true;
        } else {
            Integer U3 = qwp.U("maxAttempts", V);
            o2g.O(U3, "maxAttempts cannot be empty");
            int intValue = U3.intValue();
            o2g.G(intValue, "maxAttempts must be greater than 1: %s", intValue >= 2);
            int min = Math.min(intValue, i);
            Long Y = qwp.Y("initialBackoff", V);
            o2g.O(Y, "initialBackoff cannot be empty");
            long longValue = Y.longValue();
            o2g.I("initialBackoffNanos must be greater than 0: %s", longValue, longValue > 0);
            Long Y2 = qwp.Y("maxBackoff", V);
            o2g.O(Y2, "maxBackoff cannot be empty");
            long longValue2 = Y2.longValue();
            j = 0;
            z2 = true;
            o2g.I("maxBackoff must be greater than 0: %s", longValue2, longValue2 > 0);
            Double T = qwp.T("backoffMultiplier", V);
            o2g.O(T, "backoffMultiplier cannot be empty");
            double doubleValue = T.doubleValue();
            o2g.H(T, "backoffMultiplier must be greater than 0: %s", doubleValue > 0.0d);
            Long Y3 = qwp.Y("perAttemptRecvTimeout", V);
            o2g.H(Y3, "perAttemptRecvTimeout cannot be negative: %s", Y3 == null || Y3.longValue() >= 0);
            Set g0 = bkp.g0("retryableStatusCodes", V);
            szf.v0("retryableStatusCodes", "%s is required in retry policy", g0 != null);
            szf.v0("retryableStatusCodes", "%s must not contain OK", !g0.contains(rgr.OK));
            o2g.J("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (Y3 == null && g0.isEmpty()) ? false : true);
            tboVar = new tbo(min, longValue, longValue2, doubleValue, Y3, g0);
        }
        this.e = tboVar;
        Map V2 = z ? qwp.V("hedgingPolicy", map) : null;
        if (V2 == null) {
            zwdVar = null;
        } else {
            Integer U4 = qwp.U("maxAttempts", V2);
            o2g.O(U4, "maxAttempts cannot be empty");
            int intValue2 = U4.intValue();
            o2g.G(intValue2, "maxAttempts must be greater than 1: %s", intValue2 >= 2 ? z2 : false);
            int min2 = Math.min(intValue2, i2);
            Long Y4 = qwp.Y("hedgingDelay", V2);
            o2g.O(Y4, "hedgingDelay cannot be empty");
            long longValue3 = Y4.longValue();
            o2g.I("hedgingDelay must not be negative: %s", longValue3, longValue3 >= j ? z2 : false);
            Set g02 = bkp.g0("nonFatalStatusCodes", V2);
            if (g02 == null) {
                g02 = Collections.unmodifiableSet(EnumSet.noneOf(rgr.class));
            } else {
                szf.v0("nonFatalStatusCodes", "%s must not contain OK", !g02.contains(rgr.OK));
            }
            zwdVar = new zwd(min2, longValue3, g02);
        }
        this.f = zwdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o8h)) {
            return false;
        }
        o8h o8hVar = (o8h) obj;
        return hdg.S(this.a, o8hVar.a) && hdg.S(this.b, o8hVar.b) && hdg.S(this.c, o8hVar.c) && hdg.S(this.d, o8hVar.d) && hdg.S(this.e, o8hVar.e) && hdg.S(this.f, o8hVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "timeoutNanos");
        Y.q(this.b, "waitForReady");
        Y.q(this.c, "maxInboundMessageSize");
        Y.q(this.d, "maxOutboundMessageSize");
        Y.q(this.e, "retryPolicy");
        Y.q(this.f, "hedgingPolicy");
        return Y.toString();
    }
}

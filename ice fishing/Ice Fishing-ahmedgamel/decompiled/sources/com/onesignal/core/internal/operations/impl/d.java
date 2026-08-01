package com.onesignal.core.internal.operations.impl;

import H4.g;
import com.onesignal.common.threading.f;
import com.onesignal.core.internal.operations.impl.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public abstract class d {
    public static final boolean handleFailUnauthorized(b bVar, b.C0192b startingOp, List<b.C0192b> ops, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z3) {
        String externalId;
        h.e(bVar, "<this>");
        h.e(startingOp, "startingOp");
        h.e(ops, "ops");
        h.e(jwtTokenStore, "jwtTokenStore");
        if (!z3 || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            f waiter = ((b.C0192b) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
        synchronized (bVar.getQueue$com_onesignal_core()) {
            for (b.C0192b c0192b : AbstractC5129j.I(ops)) {
                bVar.getQueue$com_onesignal_core().add(0, new b.C0192b(c0192b.getOperation(), null, c0192b.getBucket(), c0192b.getRetries()));
            }
        }
        return true;
    }

    public static final boolean hasValidJwtIfRequired(b bVar, com.onesignal.user.internal.jwt.c jwtTokenStore, g op, boolean z3) {
        h.e(bVar, "<this>");
        h.e(jwtTokenStore, "jwtTokenStore");
        h.e(op, "op");
        if (!z3 || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }
}

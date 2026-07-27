package com.onesignal.core.internal.operations.impl;

import D4.g;
import com.onesignal.common.threading.f;
import com.onesignal.core.internal.operations.impl.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import r7.AbstractC4979j;

/* loaded from: classes2.dex */
public abstract class d {
    public static final boolean handleFailUnauthorized(b bVar, b.C0191b startingOp, List<b.C0191b> ops, com.onesignal.user.internal.jwt.c jwtTokenStore, boolean z8) {
        String externalId;
        h.e(bVar, "<this>");
        h.e(startingOp, "startingOp");
        h.e(ops, "ops");
        h.e(jwtTokenStore, "jwtTokenStore");
        if (!z8 || (externalId = startingOp.getOperation().getExternalId()) == null) {
            return false;
        }
        jwtTokenStore.invalidateJwt(externalId);
        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed with 401 Unauthorized, JWT invalidated for user: " + externalId + ". Operations re-queued.", null, 2, null);
        Iterator<T> it = ops.iterator();
        while (it.hasNext()) {
            f waiter = ((b.C0191b) it.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
        synchronized (bVar.getQueue$com_onesignal_core()) {
            for (b.C0191b c0191b : AbstractC4979j.O(ops)) {
                bVar.getQueue$com_onesignal_core().add(0, new b.C0191b(c0191b.getOperation(), null, c0191b.getBucket(), c0191b.getRetries()));
            }
        }
        return true;
    }

    public static final boolean hasValidJwtIfRequired(b bVar, com.onesignal.user.internal.jwt.c jwtTokenStore, g op, boolean z8) {
        h.e(bVar, "<this>");
        h.e(jwtTokenStore, "jwtTokenStore");
        h.e(op, "op");
        if (!z8 || !op.getRequiresJwt()) {
            return true;
        }
        String externalId = op.getExternalId();
        return (externalId == null || jwtTokenStore.getJwt(externalId) == null) ? false : true;
    }
}

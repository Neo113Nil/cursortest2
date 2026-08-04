package com.gamericefishpro.space.oh;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h, Serializable {
    public static final q i = new q(null);
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "e");
    public volatile Function0 d;
    public volatile Object e;

    @Override // com.gamericefishpro.space.oh.h
    public final Object getValue() {
        Object obj = this.e;
        y yVar = y.a;
        if (obj != yVar) {
            return obj;
        }
        Function0 function0 = this.d;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != yVar) {
                }
            }
            this.d = null;
            return objInvoke;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != y.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

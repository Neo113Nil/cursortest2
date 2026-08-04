package com.gamericefishpro.space.oh;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h, Serializable {
    public Function0 d;
    public volatile Object e;
    public final Object i;

    public s(Function0 initializer, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.d = initializer;
        this.e = y.a;
        this.i = obj == null ? this : obj;
    }

    @Override // com.gamericefishpro.space.oh.h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.e;
        y yVar = y.a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.i) {
            objInvoke = this.e;
            if (objInvoke == yVar) {
                Function0 function0 = this.d;
                Intrinsics.b(function0);
                objInvoke = function0.invoke();
                this.e = objInvoke;
                this.d = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.e != y.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package io.appmetrica.analytics.impl;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class P3 implements BatchProcessor, jms {
    public final /* synthetic */ Q3 a;

    public P3(Q3 q3) {
        this.a = q3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof BatchProcessor) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, Q3.class, "processTasks", "processTasks(Ljava/util/List;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor
    public final void processBatch(List list) {
        Q3 q3 = this.a;
        q3.getClass();
        try {
            q3.a.invoke(list);
        } catch (Exception unused) {
        }
    }
}

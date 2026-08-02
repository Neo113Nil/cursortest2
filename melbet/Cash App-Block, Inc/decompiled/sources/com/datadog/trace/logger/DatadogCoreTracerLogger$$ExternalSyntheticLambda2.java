package com.datadog.trace.logger;

import com.google.android.gms.auth.api.zbc;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DatadogCoreTracerLogger$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zbc f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DatadogCoreTracerLogger$$ExternalSyntheticLambda2(zbc zbcVar, String str, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = zbcVar;
        this.f$1 = str;
        this.f$2 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        String str = this.f$1;
        zbc zbcVar = this.f$0;
        switch (i) {
        }
        return zbc.generateLogMessage((String) zbcVar.zbb, str, obj);
    }
}

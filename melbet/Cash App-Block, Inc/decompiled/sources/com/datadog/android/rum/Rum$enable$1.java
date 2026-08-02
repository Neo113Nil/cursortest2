package com.datadog.android.rum;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class Rum$enable$1 extends Lambda implements Function0 {
    public static final Rum$enable$1 INSTANCE;
    public static final Rum$enable$1 INSTANCE$1;
    public static final Rum$enable$1 INSTANCE$2;
    public static final Rum$enable$1 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new Rum$enable$1(i, 1);
        INSTANCE = new Rum$enable$1(i, 0);
        INSTANCE$2 = new Rum$enable$1(i, 2);
        INSTANCE$3 = new Rum$enable$1(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rum$enable$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "SDK instance provided doesn't implement InternalSdkCore.";
            case 1:
                return "A RumMonitor has already been registered for this SDK instance";
            case 2:
                return "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
            default:
                return "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
        }
    }
}

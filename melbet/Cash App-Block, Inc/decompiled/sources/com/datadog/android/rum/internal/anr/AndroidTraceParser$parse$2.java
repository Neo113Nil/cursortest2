package com.datadog.android.rum.internal.anr;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class AndroidTraceParser$parse$2 extends Lambda implements Function0 {
    public static final AndroidTraceParser$parse$2 INSTANCE;
    public static final AndroidTraceParser$parse$2 INSTANCE$1;
    public static final AndroidTraceParser$parse$2 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new AndroidTraceParser$parse$2(i, 1);
        INSTANCE = new AndroidTraceParser$parse$2(i, 0);
        INSTANCE$2 = new AndroidTraceParser$parse$2(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidTraceParser$parse$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
            case 1:
                return "Failed to get all stack traces.";
            default:
                return "Failed to read crash trace stream.";
        }
    }
}

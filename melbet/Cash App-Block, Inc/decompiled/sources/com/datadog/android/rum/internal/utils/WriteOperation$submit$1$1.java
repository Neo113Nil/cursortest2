package com.datadog.android.rum.internal.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class WriteOperation$submit$1$1 extends Lambda implements Function0 {
    public static final WriteOperation$submit$1$1 INSTANCE;
    public static final WriteOperation$submit$1$1 INSTANCE$1;
    public static final WriteOperation$submit$1$1 INSTANCE$2;
    public static final WriteOperation$submit$1$1 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new WriteOperation$submit$1$1(i, 1);
        INSTANCE$2 = new WriteOperation$submit$1$1(i, 2);
        INSTANCE$3 = new WriteOperation$submit$1$1(i, 3);
        INSTANCE = new WriteOperation$submit$1$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WriteOperation$submit$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Write operation ignored, session is expired or RUM feature is disabled.";
            case 1:
                return "Internal operation failed on ComponentPredicate";
            case 2:
                return "Write operation failed.";
            default:
                return "Write operation failed, but no onError callback was provided.";
        }
    }
}

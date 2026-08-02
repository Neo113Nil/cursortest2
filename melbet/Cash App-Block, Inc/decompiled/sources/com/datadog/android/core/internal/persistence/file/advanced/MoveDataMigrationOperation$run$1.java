package com.datadog.android.core.internal.persistence.file.advanced;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class MoveDataMigrationOperation$run$1 extends Lambda implements Function0 {
    public static final MoveDataMigrationOperation$run$1 INSTANCE;
    public static final MoveDataMigrationOperation$run$1 INSTANCE$1;
    public static final MoveDataMigrationOperation$run$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new MoveDataMigrationOperation$run$1(i, 0);
        INSTANCE$1 = new MoveDataMigrationOperation$run$1(i, 1);
        INSTANCE$2 = new MoveDataMigrationOperation$run$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoveDataMigrationOperation$run$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Can't move data from a null directory";
            case 1:
                return "Can't move data to a null directory";
            default:
                return "Can't wipe data from a null directory";
        }
    }
}

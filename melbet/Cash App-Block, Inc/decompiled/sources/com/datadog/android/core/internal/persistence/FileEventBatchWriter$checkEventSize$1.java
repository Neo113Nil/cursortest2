package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.net.Request;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class FileEventBatchWriter$checkEventSize$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $eventSize;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileEventBatchWriter$checkEventSize$1(int i, Object obj, int i2) {
        super(0);
        this.$r8$classId = i2;
        this.$eventSize = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        int i2 = this.$eventSize;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(((FileEventBatchWriter) obj).filePersistenceConfig.maxItemSize)}, 2));
            default:
                return "Unexpected status code " + i2 + " on upload request: " + ((Request) obj).description;
        }
    }
}

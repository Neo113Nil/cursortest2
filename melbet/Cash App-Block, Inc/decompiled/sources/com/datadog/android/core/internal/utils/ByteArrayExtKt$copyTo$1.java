package com.datadog.android.core.internal.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ByteArrayExtKt$copyTo$1 extends Lambda implements Function0 {
    public static final ByteArrayExtKt$copyTo$1 INSTANCE;
    public static final ByteArrayExtKt$copyTo$1 INSTANCE$1;
    public static final ByteArrayExtKt$copyTo$1 INSTANCE$2;
    public static final ByteArrayExtKt$copyTo$1 INSTANCE$3;
    public static final ByteArrayExtKt$copyTo$1 INSTANCE$4;
    public static final ByteArrayExtKt$copyTo$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new ByteArrayExtKt$copyTo$1(i, 0);
        INSTANCE$1 = new ByteArrayExtKt$copyTo$1(i, 1);
        INSTANCE$2 = new ByteArrayExtKt$copyTo$1(i, 2);
        INSTANCE$3 = new ByteArrayExtKt$copyTo$1(i, 3);
        INSTANCE$4 = new ByteArrayExtKt$copyTo$1(i, 4);
        INSTANCE$5 = new ByteArrayExtKt$copyTo$1(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ByteArrayExtKt$copyTo$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Cannot copy ByteArray, dest doesn't have enough space";
            case 1:
                return "Cannot copy ByteArray, src doesn't have enough data";
            case 2:
                return "Internal I/O operation failed";
            case 3:
                return "Error cancelling the UploadWorker";
            case 4:
                return "UploadWorker was scheduled.";
            default:
                return "Error while trying to setup the UploadWorker";
        }
    }
}

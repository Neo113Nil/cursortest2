package com.datadog.android.core.internal.data.upload;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DataOkHttpUploader$upload$request$1 extends Lambda implements Function0 {
    public static final DataOkHttpUploader$upload$request$1 INSTANCE;
    public static final DataOkHttpUploader$upload$request$1 INSTANCE$1;
    public static final DataOkHttpUploader$upload$request$1 INSTANCE$2;
    public static final DataOkHttpUploader$upload$request$1 INSTANCE$3;
    public static final DataOkHttpUploader$upload$request$1 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new DataOkHttpUploader$upload$request$1(i, 1);
        INSTANCE = new DataOkHttpUploader$upload$request$1(i, 0);
        INSTANCE$2 = new DataOkHttpUploader$upload$request$1(i, 2);
        INSTANCE$3 = new DataOkHttpUploader$upload$request$1(i, 3);
        INSTANCE$4 = new DataOkHttpUploader$upload$request$1(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataOkHttpUploader$upload$request$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
            case 1:
                return "Ignoring provided User-Agent header, because it is reserved.";
            case 2:
                return "Unable to execute the request; we will retry later.";
            case 3:
                return "Unable to execute the request; we will retry later.";
            default:
                return "Unable to gzip request body";
        }
    }
}

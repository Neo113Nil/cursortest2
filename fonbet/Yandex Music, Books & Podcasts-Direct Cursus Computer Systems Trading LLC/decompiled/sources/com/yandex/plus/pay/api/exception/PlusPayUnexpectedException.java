package com.yandex.plus.pay.api.exception;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayUnexpectedException;", "Lcom/yandex/plus/pay/api/exception/a;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class PlusPayUnexpectedException extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlusPayUnexpectedException(Throwable th) {
        super(r0 == null ? "Unexpected error" : r0, th);
        th.getClass();
        String message = th.getMessage();
    }
}

package com.yandex.plus.pay.api.exception;

import androidx.core.app.n0;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.common.network.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lcom/yandex/plus/pay/api/exception/a;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public class PlusPayNetworkException extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlusPayNetworkException(n0 n0Var) {
        super(r0, r3 != null ? r3.getCause() : null);
        n0Var.getClass();
        String str = n0Var instanceof com.yandex.plus.home.common.network.c ? ((com.yandex.plus.home.common.network.c) n0Var).c : n0Var instanceof g ? ((g) n0Var).c : null;
        if (str == null) {
            Throwable j = n0Var.j();
            str = j != null ? j.getMessage() : null;
        }
        Throwable j2 = n0Var.j();
    }
}

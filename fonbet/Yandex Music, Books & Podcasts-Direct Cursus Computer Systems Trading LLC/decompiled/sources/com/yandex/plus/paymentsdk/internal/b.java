package com.yandex.plus.paymentsdk.internal;

import android.content.Context;
import com.yandex.plus.bdui.plus.webview.r;
import defpackage.dfs;
import defpackage.ues;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b implements ues {
    @Override // defpackage.ues
    public final dfs a(Context context) {
        context.getClass();
        r rVar = new r();
        rVar.a = com.yandex.plus.home.common.utils.a.i(context) ? R.style.PlusSDK_Theme_PaymentSdk_Dark : R.style.PlusSDK_Theme_PaymentSdk_Light;
        return rVar;
    }
}

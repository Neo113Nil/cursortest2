package ru.yandex.yx_platform_api;

import android.telephony.TelephonyCallback;
import defpackage.tcs0;
import defpackage.ucs0;
import defpackage.yeo;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/yx_platform_api/SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$UserMobileDataStateListener;", "", "isEnabled", "Lzy11;", "onUserMobileDataStateChanged", "(Z)V", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1 extends TelephonyCallback implements TelephonyCallback.UserMobileDataStateListener {
    final /* synthetic */ ucs0 this$0;
    final /* synthetic */ tcs0 this$1;

    public SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1(ucs0 ucs0Var, tcs0 tcs0Var) {
        this.this$0 = ucs0Var;
        this.this$1 = tcs0Var;
    }

    public void onUserMobileDataStateChanged(boolean isEnabled) {
        List a = this.this$0.a();
        yeo yeoVar = this.this$1.a;
        if (yeoVar != null) {
            yeoVar.success(a);
        }
    }
}

package ru.yandex.yx_platform_api;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import defpackage.usw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/yx_platform_api/InternetConnectionManager$newTelephonyDisplayInfoListener$2$1", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$DisplayInfoListener;", "Landroid/telephony/TelephonyDisplayInfo;", "newTelephonyDisplayInfo", "Lzy11;", "onDisplayInfoChanged", "(Landroid/telephony/TelephonyDisplayInfo;)V", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternetConnectionManager$newTelephonyDisplayInfoListener$2$1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    final /* synthetic */ usw this$0;

    public InternetConnectionManager$newTelephonyDisplayInfoListener$2$1(usw uswVar) {
        this.this$0 = uswVar;
    }

    public void onDisplayInfoChanged(TelephonyDisplayInfo newTelephonyDisplayInfo) {
        this.this$0.d = newTelephonyDisplayInfo;
    }
}

package ru.yandex.yx_platform_api;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import defpackage.jxi;
import defpackage.usw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/yx_platform_api/InternetConnectionManager$oldStrengthListener$2$1", "Landroid/telephony/PhoneStateListener;", "Landroid/telephony/SignalStrength;", "signalStrength", "Lzy11;", "onSignalStrengthsChanged", "(Landroid/telephony/SignalStrength;)V", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternetConnectionManager$oldStrengthListener$2$1 extends PhoneStateListener {
    final /* synthetic */ usw this$0;

    public InternetConnectionManager$oldStrengthListener$2$1(usw uswVar) {
        this.this$0 = uswVar;
    }

    @Override // android.telephony.PhoneStateListener
    @jxi
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        this.this$0.getClass();
    }
}

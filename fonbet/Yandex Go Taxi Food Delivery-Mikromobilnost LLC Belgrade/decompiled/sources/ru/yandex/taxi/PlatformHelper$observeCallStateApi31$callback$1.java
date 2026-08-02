package ru.yandex.taxi;

import android.telephony.TelephonyCallback;
import defpackage.x6f0;
import defpackage.y6f0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/PlatformHelper$observeCallStateApi31$callback$1", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$CallStateListener;", "", ClidProvider.STATE, "Lzy11;", "onCallStateChanged", "(I)V", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlatformHelper$observeCallStateApi31$callback$1 extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    final /* synthetic */ y6f0 $producerScope;

    public PlatformHelper$observeCallStateApi31$callback$1(y6f0 y6f0Var) {
        this.$producerScope = y6f0Var;
    }

    public void onCallStateChanged(int state) {
        ((x6f0) this.$producerScope).d(Integer.valueOf(state));
    }
}

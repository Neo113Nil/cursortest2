package ru.yandex.common.location;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* loaded from: classes4.dex */
public class SignalLevelListener extends PhoneStateListener {
    private int signalStrength;
    private TelephonyManager telephonyManager;

    public SignalLevelListener(Context context) {
        this.telephonyManager = (TelephonyManager) context.getSystemService("phone");
    }

    public int getSignalStrength() {
        return this.signalStrength;
    }

    public void listenUntilRetrieved() {
        this.telephonyManager.listen(this, 2);
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthChanged(int i) {
        this.telephonyManager.listen(this, 0);
        this.signalStrength = (i * 2) - 113;
        synchronized (this) {
            notify();
        }
    }
}

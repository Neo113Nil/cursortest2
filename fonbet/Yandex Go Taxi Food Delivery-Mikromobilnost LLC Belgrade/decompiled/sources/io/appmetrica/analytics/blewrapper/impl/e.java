package io.appmetrica.analytics.blewrapper.impl;

import android.app.PendingIntent;
import android.bluetooth.le.BluetoothLeScanner;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.blewrapper.internal.BleScanner;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class e extends Lambda implements tls {
    public final /* synthetic */ BleScanner a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BleScanner bleScanner) {
        super(1);
        this.a = bleScanner;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PendingIntent pendingIntent;
        pendingIntent = this.a.g;
        ((BluetoothLeScanner) obj).stopScan(pendingIntent);
        this.a.g = null;
        return zy11.a;
    }
}

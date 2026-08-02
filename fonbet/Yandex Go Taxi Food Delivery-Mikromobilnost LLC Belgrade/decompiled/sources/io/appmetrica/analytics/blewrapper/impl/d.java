package io.appmetrica.analytics.blewrapper.impl;

import android.app.PendingIntent;
import android.bluetooth.le.BluetoothLeScanner;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.blewrapper.internal.BleScanner;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class d extends Lambda implements tls {
    public final /* synthetic */ BleScanner a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ ScanSettingsConfig c;
    public final /* synthetic */ PendingIntent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BleScanner bleScanner, Set set, ScanSettingsConfig scanSettingsConfig, PendingIntent pendingIntent) {
        super(1);
        this.a = bleScanner;
        this.b = set;
        this.c = scanSettingsConfig;
        this.d = pendingIntent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g gVar;
        i iVar;
        gVar = this.a.c;
        Set set = this.b;
        gVar.getClass();
        ArrayList a = g.a(set);
        iVar = this.a.b;
        ((BluetoothLeScanner) obj).startScan(a, iVar.a(this.c), this.d);
        return zy11.a;
    }
}

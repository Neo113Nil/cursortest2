package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.ycc;
import io.appmetrica.analytics.blecollecting.internal.BleScanReceiver;
import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.blewrapper.internal.BleScanner;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0158m {
    public final Context a;
    public final BleScanner b;
    public final C0157l c;
    public final C0165u d;

    public C0158m(Context context, BleScanner bleScanner, C0157l c0157l, C0165u c0165u) {
        this.a = context;
        this.b = bleScanner;
        this.c = c0157l;
        this.d = c0165u;
    }

    public final void a(RemoteBleCollectingConfig remoteBleCollectingConfig) {
        C0157l c0157l = this.c;
        Iterable iterable = (Iterable) c0157l.c.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!c0157l.b.hasPermission(c0157l.a, (String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
        }
        if (arrayList.isEmpty()) {
            if (remoteBleCollectingConfig != null) {
                this.c.getClass();
                if (remoteBleCollectingConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String()) {
                    BleScanner bleScanner = this.b;
                    ScanSettingsConfig scanSettingsConfig = remoteBleCollectingConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().a;
                    Set set = remoteBleCollectingConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ycc.r(((G) it2.next()).a, arrayList2);
                    }
                    bleScanner.start(scanSettingsConfig, kotlin.collections.a.N0(arrayList2), new Intent(this.a, (Class<?>) BleScanReceiver.class).putExtra("io.appmetrica.analytics.blecollecting.REMOTE_BLE_COLLECTING_CONFIG_PROTO_KEY", MessageNano.toByteArray(this.d.a.fromModel(remoteBleCollectingConfig))));
                    return;
                }
            }
            this.b.stop();
        }
    }
}

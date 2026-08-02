package io.appmetrica.analytics.blewrapper.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import io.appmetrica.analytics.blewrapper.impl.e;
import io.appmetrica.analytics.blewrapper.impl.f;
import io.appmetrica.analytics.blewrapper.impl.g;
import io.appmetrica.analytics.blewrapper.impl.i;
import io.appmetrica.analytics.blewrapper.internal.config.ScanFilterConfig;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/BleScanner;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/blewrapper/impl/i;", "scanSettingsConverter", "Lio/appmetrica/analytics/blewrapper/impl/g;", "scanFiltersConverter", "Lio/appmetrica/analytics/blewrapper/impl/f;", "bleScannerInteractor", "<init>", "(Landroid/content/Context;Lio/appmetrica/analytics/blewrapper/impl/i;Lio/appmetrica/analytics/blewrapper/impl/g;Lio/appmetrica/analytics/blewrapper/impl/f;)V", "(Landroid/content/Context;)V", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig;", "scanSettings", "", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanFilterConfig;", "scanFilters", "Landroid/content/Intent;", "intent", "Lzy11;", "start", "(Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig;Ljava/util/Set;Landroid/content/Intent;)V", "stop", "()V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BleScanner {
    private final Context a;
    private final i b;
    private final g c;
    private final f d;
    private ScanSettingsConfig e;
    private Set f;
    private PendingIntent g;

    public BleScanner(Context context) {
        this(context, new i(), new g(), new f(context));
    }

    public final void start(ScanSettingsConfig scanSettings, Set<ScanFilterConfig> scanFilters, Intent intent) {
        if (((this.g != null) & jl40.l(scanSettings, this.e)) && jl40.l(scanFilters, this.f)) {
            return;
        }
        stop();
        this.e = scanSettings;
        this.f = scanFilters;
        PendingIntent pendingIntent = this.g;
        if (pendingIntent == null) {
            try {
                pendingIntent = PendingIntent.getBroadcast(this.a, 7695436, intent, 167772160);
            } catch (Throwable unused) {
                pendingIntent = null;
            }
        }
        this.g = pendingIntent;
        if (pendingIntent == null) {
            return;
        }
    }

    public final void stop() {
        if (this.g == null) {
            return;
        }
        this.d.a("stop scan", new e(this));
    }

    public BleScanner(Context context, i iVar, g gVar, f fVar) {
        this.a = context;
        this.b = iVar;
        this.c = gVar;
        this.d = fVar;
        this.f = EmptySet.a;
    }
}

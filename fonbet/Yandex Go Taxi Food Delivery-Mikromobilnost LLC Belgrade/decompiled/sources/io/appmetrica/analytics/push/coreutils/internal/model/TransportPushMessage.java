package io.appmetrica.analytics.push.coreutils.internal.model;

import android.os.Bundle;
import defpackage.i3y;
import io.appmetrica.analytics.push.coreutils.impl.i;
import io.appmetrica.analytics.push.coreutils.impl.j;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/model/TransportPushMessage;", "Lio/appmetrica/analytics/push/coreutils/internal/model/BasePushMessage;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lio/appmetrica/analytics/push/coreutils/internal/model/ServiceType;", "d", "Li3y;", "getServiceType", "()Lio/appmetrica/analytics/push/coreutils/internal/model/ServiceType;", "serviceType", "", "e", "getProcessingMinTime", "()Ljava/lang/Long;", "processingMinTime", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class TransportPushMessage extends BasePushMessage {

    /* renamed from: d, reason: from kotlin metadata */
    private final i3y serviceType;

    /* renamed from: e, reason: from kotlin metadata */
    private final i3y processingMinTime;

    public TransportPushMessage(Bundle bundle) {
        super(bundle);
        this.serviceType = a.a(new j(this));
        this.processingMinTime = a.a(new i(this));
    }

    public final Long getProcessingMinTime() {
        return (Long) this.processingMinTime.getValue();
    }

    public final ServiceType getServiceType() {
        return (ServiceType) this.serviceType.getValue();
    }
}

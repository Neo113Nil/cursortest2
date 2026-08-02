package io.appmetrica.analytics.push.coreutils.impl;

import defpackage.sls;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.model.ServiceType;
import io.appmetrica.analytics.push.coreutils.internal.model.TransportPushMessage;
import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class j extends Lambda implements sls {
    public final /* synthetic */ TransportPushMessage a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TransportPushMessage transportPushMessage) {
        super(0);
        this.a = transportPushMessage;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ServiceType fromValue;
        Integer extractIntegerSafely = JsonUtils.extractIntegerSafely(this.a.getRoot(), CoreConstants.PushMessage.SERVICE_TYPE);
        return (extractIntegerSafely == null || (fromValue = ServiceType.INSTANCE.fromValue(extractIntegerSafely.intValue())) == null) ? ServiceType.UNKNOWN : fromValue;
    }
}

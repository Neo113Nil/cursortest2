package io.appmetrica.analytics.push.coreutils.impl;

import defpackage.sls;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.model.TransportPushMessage;
import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class i extends Lambda implements sls {
    public final /* synthetic */ TransportPushMessage a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransportPushMessage transportPushMessage) {
        super(0);
        this.a = transportPushMessage;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return JsonUtils.extractLongSafely(this.a.getRoot(), CoreConstants.PushMessage.PROCESSING_MIN_TIME);
    }
}

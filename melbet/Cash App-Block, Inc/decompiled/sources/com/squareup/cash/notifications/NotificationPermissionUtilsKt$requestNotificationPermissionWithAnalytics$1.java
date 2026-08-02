package com.squareup.cash.notifications;

import androidx.compose.runtime.internal.Utils_androidKt;
import com.squareup.cash.cdf.notificationsoptin.NotificationPromptEntryPoint;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1 extends ContinuationImpl {
    public Analytics L$1;
    public NotificationPromptEntryPoint L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return Utils_androidKt.requestNotificationPermissionWithAnalytics(null, null, null, this);
    }
}

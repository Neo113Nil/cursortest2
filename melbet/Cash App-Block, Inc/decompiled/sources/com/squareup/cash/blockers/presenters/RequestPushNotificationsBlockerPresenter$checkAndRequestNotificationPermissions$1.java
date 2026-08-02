package com.squareup.cash.blockers.presenters;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1 extends ContinuationImpl {
    public LinkedHashMap L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RequestPushNotificationsBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1(RequestPushNotificationsBlockerPresenter requestPushNotificationsBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = requestPushNotificationsBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RequestPushNotificationsBlockerPresenter.access$checkAndRequestNotificationPermissions(this.this$0, null, this);
    }
}

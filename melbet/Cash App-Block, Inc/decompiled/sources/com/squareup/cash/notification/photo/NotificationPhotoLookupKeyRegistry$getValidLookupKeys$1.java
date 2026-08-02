package com.squareup.cash.notification.photo;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public String L$0;
    public Collection L$3;
    public Iterator L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NotificationPhotoLookupKeyRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1(NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = notificationPhotoLookupKeyRegistry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getValidLookupKeys(null, this);
    }
}

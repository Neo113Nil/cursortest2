package com.squareup.cash.data.contacts;

import com.datadog.trace.core.util.JsonObjectUtils;
import com.squareup.cash.integration.contacts.RealContactBook;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ContactResolverKt$recoverLostContacts$1 extends ContinuationImpl {
    public int I$0;
    public RealContactBook L$0;
    public String L$11;
    public Map L$2;
    public Map L$4;
    public Map L$7;
    public Iterator L$9;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return JsonObjectUtils.recoverLostContacts(null, null, null, this);
    }
}

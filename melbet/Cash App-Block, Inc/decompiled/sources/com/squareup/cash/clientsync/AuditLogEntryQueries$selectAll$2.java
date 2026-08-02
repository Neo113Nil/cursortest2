package com.squareup.cash.clientsync;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AuditLogEntryQueries$selectAll$2 extends FunctionReferenceImpl implements Function2 {
    public static final AuditLogEntryQueries$selectAll$2 INSTANCE = new AuditLogEntryQueries$selectAll$2(2, SelectAll.class, "<init>", "<init>(JLjava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        String str = (String) obj2;
        str.getClass();
        return new SelectAll(longValue, str);
    }
}

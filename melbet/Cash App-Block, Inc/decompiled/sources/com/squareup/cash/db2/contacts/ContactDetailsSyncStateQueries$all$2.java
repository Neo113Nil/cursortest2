package com.squareup.cash.db2.contacts;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactDetailsSyncStateQueries$all$2 extends FunctionReferenceImpl implements Function4 {
    public static final ContactDetailsSyncStateQueries$all$2 INSTANCE = new ContactDetailsSyncStateQueries$all$2(4, Contact_detailed_sync_state.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new Contact_detailed_sync_state(str, str2, str3, (Long) obj3);
    }
}

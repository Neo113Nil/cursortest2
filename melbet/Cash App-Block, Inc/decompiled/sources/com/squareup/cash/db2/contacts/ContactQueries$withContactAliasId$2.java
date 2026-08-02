package com.squareup.cash.db2.contacts;

import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactQueries$withContactAliasId$2 extends FunctionReferenceImpl implements Function5 {
    public static final ContactQueries$withContactAliasId$2 INSTANCE = new ContactQueries$withContactAliasId$2(5, WithContactAliasId.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj;
        str.getClass();
        return new WithContactAliasId(str, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
    }
}

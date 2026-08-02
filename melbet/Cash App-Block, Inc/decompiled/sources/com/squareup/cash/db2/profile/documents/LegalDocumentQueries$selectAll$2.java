package com.squareup.cash.db2.profile.documents;

import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class LegalDocumentQueries$selectAll$2 extends FunctionReferenceImpl implements Function6 {
    public static final LegalDocumentQueries$selectAll$2 INSTANCE = new LegalDocumentQueries$selectAll$2(6, LegalDocument.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj5;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new LegalDocument(str, str2, str3, (Long) obj4, str4, (String) obj6);
    }
}

package com.squareup.cash.db2.contacts;

import com.squareup.cash.db.contacts.AliasSyncState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AliasQueries$selectForSyncState$2 extends FunctionReferenceImpl implements Function2 {
    public static final AliasQueries$selectForSyncState$2 INSTANCE = new AliasQueries$selectForSyncState$2(2, SelectForSyncState.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/cash/db/contacts/AliasSyncState;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        return new SelectForSyncState(str, (AliasSyncState) obj2);
    }
}

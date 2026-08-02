package com.squareup.cash.data.contacts;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public interface ContactsSyncRoutine {
    Object contactsSync(List list, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl);
}

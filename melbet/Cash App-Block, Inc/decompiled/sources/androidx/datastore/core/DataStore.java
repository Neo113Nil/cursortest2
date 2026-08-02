package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface DataStore {
    Flow getData();

    Object updateData(Function2 function2, ContinuationImpl continuationImpl);
}

package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface ConnectionPool extends AutoCloseable {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/coroutines/ConnectionPool$RollbackException", "", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RollbackException extends Throwable {
    }

    Object useConnection(boolean z, Function2 function2, Continuation continuation);
}

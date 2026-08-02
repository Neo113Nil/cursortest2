package androidx.room;

import androidx.room.CoroutinesRoom;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$1 extends ContinuationImpl {
    public Callable L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$1(CoroutinesRoom.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.execute((RoomDatabase) null, false, (Callable) null, (ContinuationImpl) this);
    }
}

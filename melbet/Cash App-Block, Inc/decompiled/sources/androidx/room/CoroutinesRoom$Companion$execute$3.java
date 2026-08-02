package androidx.room;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$3 extends ContinuationImpl {
    public RoomDatabase L$0;
    public CancellationSignal L$1;
    public Callable L$2;
    public CoroutineContext L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$3(CoroutinesRoom.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.execute((RoomDatabase) null, (CancellationSignal) null, (Callable) null, this);
    }
}

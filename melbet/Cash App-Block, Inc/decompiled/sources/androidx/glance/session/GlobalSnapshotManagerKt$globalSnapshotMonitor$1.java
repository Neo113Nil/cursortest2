package androidx.glance.session;

import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlobalSnapshotManagerKt$globalSnapshotMonitor$1 extends ContinuationImpl {
    public AtomicBoolean L$0;
    public Snapshot$Companion$$ExternalSyntheticLambda0 L$1;
    public ReceiveChannel L$2;
    public BufferedChannel.BufferedChannelIterator L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GlobalSnapshotManagerKt.globalSnapshotMonitor(this);
    }
}

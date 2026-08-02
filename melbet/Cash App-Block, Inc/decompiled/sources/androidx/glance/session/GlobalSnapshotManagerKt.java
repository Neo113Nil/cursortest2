package androidx.glance.session;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser$parse$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class GlobalSnapshotManagerKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.VerifyStripeRedirect.deepLinkSpecs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x007a, B:14:0x0082, B:15:0x008d, B:22:0x009d, B:24:0x0069, B:28:0x00a0, B:32:0x00a5, B:33:0x00a6, B:46:0x0063, B:17:0x008e, B:19:0x0094), top: B:7:0x0021, outer: #0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x00a7, B:58:0x00b4, B:59:0x00b7, B:11:0x002d, B:12:0x007a, B:14:0x0082, B:15:0x008d, B:22:0x009d, B:24:0x0069, B:28:0x00a0, B:32:0x00a5, B:33:0x00a6, B:46:0x0063, B:55:0x00b2), top: B:7:0x0021, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:12:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object globalSnapshotMonitor(ContinuationImpl continuationImpl) {
        GlobalSnapshotManagerKt$globalSnapshotMonitor$1 globalSnapshotManagerKt$globalSnapshotMonitor$1;
        int i;
        BufferedChannel Channel$default;
        Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda0;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        AtomicBoolean atomicBoolean;
        boolean z;
        try {
            try {
                if (continuationImpl instanceof GlobalSnapshotManagerKt$globalSnapshotMonitor$1) {
                    globalSnapshotManagerKt$globalSnapshotMonitor$1 = (GlobalSnapshotManagerKt$globalSnapshotMonitor$1) continuationImpl;
                    int i2 = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        globalSnapshotManagerKt$globalSnapshotMonitor$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = globalSnapshotManagerKt$globalSnapshotMonitor$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Channel$default = PapaEvent.Channel$default(1, null, null, 6);
                            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                            TraceParser$parse$1 traceParser$parse$1 = new TraceParser$parse$1(5, atomicBoolean2, Channel$default);
                            synchronized (SnapshotKt.lock) {
                                SnapshotKt.globalWriteObservers = CollectionsKt.plus((Collection) SnapshotKt.globalWriteObservers, (Object) traceParser$parse$1);
                            }
                            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                            snapshot$Companion$$ExternalSyntheticLambda0 = new Snapshot$Companion$$ExternalSyntheticLambda0(traceParser$parse$1, 0);
                            bufferedChannelIterator = Channel$default.new BufferedChannelIterator();
                            atomicBoolean = atomicBoolean2;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0 = atomicBoolean;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1 = snapshot$Companion$$ExternalSyntheticLambda0;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2 = Channel$default;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$3 = bufferedChannelIterator;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.label = 1;
                            obj = bufferedChannelIterator.hasNext(globalSnapshotManagerKt$globalSnapshotMonitor$1);
                            Channel$default = Channel$default;
                            if (obj == coroutineSingletons) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bufferedChannelIterator = globalSnapshotManagerKt$globalSnapshotMonitor$1.L$3;
                            ?? r6 = globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2;
                            snapshot$Companion$$ExternalSyntheticLambda0 = globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1;
                            atomicBoolean = globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Channel$default = r6;
                            if (((Boolean) obj).booleanValue()) {
                                atomicBoolean.set(false);
                                synchronized (SnapshotKt.lock) {
                                    MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                                    z = mutableScatterSet != null && mutableScatterSet.isNotEmpty();
                                }
                                if (z) {
                                    SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                                }
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0 = atomicBoolean;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1 = snapshot$Companion$$ExternalSyntheticLambda0;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2 = Channel$default;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$3 = bufferedChannelIterator;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.label = 1;
                                obj = bufferedChannelIterator.hasNext(globalSnapshotManagerKt$globalSnapshotMonitor$1);
                                Channel$default = Channel$default;
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    Channel$default.cancel(null);
                                    snapshot$Companion$$ExternalSyntheticLambda0.dispose();
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                if (i != 0) {
                }
            } finally {
            }
        } catch (Throwable th) {
            snapshot$Companion$$ExternalSyntheticLambda0.dispose();
            throw th;
        }
        globalSnapshotManagerKt$globalSnapshotMonitor$1 = new GlobalSnapshotManagerKt$globalSnapshotMonitor$1(continuationImpl);
        Object obj2 = globalSnapshotManagerKt$globalSnapshotMonitor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
    }

    public static final boolean isImage(MessageBody.FileBody fileBody) {
        fileBody.getClass();
        return StringsKt__StringsJVMKt.startsWith(fileBody.metadata.mimeType, "image/", true);
    }
}

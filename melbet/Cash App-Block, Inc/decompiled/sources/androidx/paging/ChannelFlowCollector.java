package androidx.paging;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.JWECryptoParts;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ChannelFlowCollector implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final Object channel;

    public ChannelFlowCollector(SendChannel sendChannel) {
        this.$r8$classId = 0;
        sendChannel.getClass();
        this.channel = sendChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r6.record(r7, r1) != r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r6.emit(r7, r1) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(IndexedValue indexedValue, Continuation continuation) {
        CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
        int i;
        JWECryptoParts jWECryptoParts = (JWECryptoParts) this.channel;
        if (continuation instanceof CachedPageEventFlow$job$1$1$emit$1) {
            cachedPageEventFlow$job$1$1$emit$1 = (CachedPageEventFlow$job$1$1$emit$1) continuation;
            int i2 = cachedPageEventFlow$job$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cachedPageEventFlow$job$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cachedPageEventFlow$job$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cachedPageEventFlow$job$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) jWECryptoParts.encryptedKey;
                    cachedPageEventFlow$job$1$1$emit$1.L$0 = indexedValue;
                    cachedPageEventFlow$job$1$1$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    indexedValue = cachedPageEventFlow$job$1$1$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) jWECryptoParts.header;
                cachedPageEventFlow$job$1$1$emit$1.L$0 = null;
                cachedPageEventFlow$job$1$1$emit$1.label = 2;
            }
        }
        cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
        Object obj2 = cachedPageEventFlow$job$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cachedPageEventFlow$job$1$1$emit$1.label;
        if (i != 0) {
        }
        HuffmanTreeGroup huffmanTreeGroup2 = (HuffmanTreeGroup) jWECryptoParts.header;
        cachedPageEventFlow$job$1$1$emit$1.L$0 = null;
        cachedPageEventFlow$job$1$1$emit$1.label = 2;
    }

    public /* synthetic */ ChannelFlowCollector(Object obj, int i) {
        this.$r8$classId = i;
        this.channel = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(PageEvent pageEvent, Continuation continuation) {
        PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1;
        int i;
        if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) {
            pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) continuation;
            int i2 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleProducerScopeImpl simpleProducerScopeImpl = (SimpleProducerScopeImpl) this.channel;
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label = 1;
                    if (simpleProducerScopeImpl.channel.send(pageEvent, pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, continuation);
        Object obj2 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.channel;
        switch (i) {
            case 0:
                Object send = ((SendChannel) obj2).send(obj, continuation);
                return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
            case 1:
                return emit((IndexedValue) obj, continuation);
            case 2:
                return emit((PageEvent) obj, continuation);
            default:
                ((BufferedChannel) obj2).mo1159trySendJP2dKIU((Unit) obj);
                return Unit.INSTANCE;
        }
    }
}

package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class FetcherKt {
    /* JADX WARN: Can't wrap try/catch for region: R(10:21|22|23|24|25|26|27|28|(4:32|14|15|(3:48|44|45)(0))|30) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:10|(3:11|12|13)|14|15|(4:17|18|19|(10:21|22|23|24|25|26|27|28|(4:32|14|15|(3:48|44|45)(0))|30)(1:(3:43|44|45)(1:46)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0177, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0178, code lost:
    
        r12 = r23;
        r8 = r24;
        r2 = r25;
        r15 = r26;
        r9 = r27;
        r7 = r29;
        r4 = r30;
        r18 = r31;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018a, code lost:
    
        r1 = r11;
        r11 = r0;
        r0 = r1;
        r1 = r12;
        r12 = r8;
        r8 = r15;
        r15 = r1;
        r1 = r7;
        r7 = r2;
        r2 = r18;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a5, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0197, code lost:
    
        r3 = r15;
        r15 = r8;
        r8 = r12;
        r12 = r3;
        r18 = r2;
        r2 = r7;
        r3 = r17;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016e, code lost:
    
        r1 = r11;
        r11 = r0;
        r0 = r1;
        r1 = r7;
        r7 = r8;
        r8 = r15;
        r15 = r17;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0169, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #4 {all -> 0x0169, blocks: (B:15:0x015a, B:19:0x00fc, B:21:0x0102, B:24:0x010c, B:27:0x013b, B:46:0x01b0), top: B:14:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v18, types: [kotlinx.coroutines.sync.Semaphore] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [kotlinx.coroutines.sync.Semaphore, kotlinx.coroutines.sync.SemaphoreAndMutexImpl, kotlinx.coroutines.sync.SemaphoreImpl] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0154 -> B:14:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01a2 -> B:18:0x0163). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01a5 -> B:18:0x0163). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fetch(List list, SemaphoreImpl semaphoreImpl, String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, ContinuationImpl continuationImpl) {
        FetcherKt$fetch$1 fetcherKt$fetch$1;
        int i;
        Exception exc;
        String str5;
        ByteString byteString2;
        List list2;
        int i2;
        Semaphore semaphore;
        String str6;
        String str7;
        EventListener eventListener2;
        String str8;
        long j2;
        ?? r12;
        Iterator it;
        int i3;
        int i4;
        String str9;
        Semaphore semaphore2;
        String str10;
        String str11;
        EventListener eventListener3;
        Exception exc2;
        Object obj;
        ByteString byteString3;
        Object fetch;
        String str12;
        String str13;
        String str14;
        try {
            if (continuationImpl instanceof FetcherKt$fetch$1) {
                fetcherKt$fetch$1 = (FetcherKt$fetch$1) continuationImpl;
                int i5 = fetcherKt$fetch$1.label;
                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                    fetcherKt$fetch$1.label = i5 - PKIFailureInfo.systemUnavail;
                    Object obj2 = fetcherKt$fetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fetcherKt$fetch$1.label;
                    if (i != 0) {
                        exc = null;
                        SafeTrace.throwOnFailure(obj2);
                        fetcherKt$fetch$1.L$0 = list;
                        fetcherKt$fetch$1.L$2 = str;
                        fetcherKt$fetch$1.L$3 = eventListener;
                        str5 = str2;
                        fetcherKt$fetch$1.L$4 = str5;
                        byteString2 = byteString;
                        fetcherKt$fetch$1.L$5 = byteString2;
                        fetcherKt$fetch$1.L$6 = str3;
                        fetcherKt$fetch$1.L$7 = str4;
                        fetcherKt$fetch$1.L$8 = semaphoreImpl;
                        fetcherKt$fetch$1.J$0 = j;
                        fetcherKt$fetch$1.I$0 = 0;
                        fetcherKt$fetch$1.label = 1;
                        if (semaphoreImpl.acquire(fetcherKt$fetch$1) != coroutineSingletons) {
                            list2 = list;
                            i2 = 0;
                            semaphore = semaphoreImpl;
                            str6 = str3;
                            str7 = str;
                            eventListener2 = eventListener;
                            str8 = str4;
                            j2 = j;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        exc = null;
                        int i6 = fetcherKt$fetch$1.I$0;
                        long j3 = fetcherKt$fetch$1.J$0;
                        semaphore = fetcherKt$fetch$1.L$8;
                        str8 = fetcherKt$fetch$1.L$7;
                        String str15 = fetcherKt$fetch$1.L$6;
                        ByteString byteString4 = fetcherKt$fetch$1.L$5;
                        String str16 = fetcherKt$fetch$1.L$4;
                        eventListener2 = fetcherKt$fetch$1.L$3;
                        str7 = fetcherKt$fetch$1.L$2;
                        list2 = fetcherKt$fetch$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        i2 = i6;
                        str6 = str15;
                        byteString2 = byteString4;
                        str5 = str16;
                        j2 = j3;
                    } else {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i7 = fetcherKt$fetch$1.I$1;
                        i4 = fetcherKt$fetch$1.I$0;
                        j2 = fetcherKt$fetch$1.J$0;
                        Iterator it2 = fetcherKt$fetch$1.L$10;
                        exc2 = fetcherKt$fetch$1.L$9;
                        r12 = fetcherKt$fetch$1.L$8;
                        String str17 = fetcherKt$fetch$1.L$7;
                        String str18 = fetcherKt$fetch$1.L$6;
                        ByteString byteString5 = fetcherKt$fetch$1.L$5;
                        String str19 = fetcherKt$fetch$1.L$4;
                        EventListener eventListener4 = fetcherKt$fetch$1.L$3;
                        String str20 = fetcherKt$fetch$1.L$2;
                        List list3 = fetcherKt$fetch$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            str13 = str20;
                            fetch = obj2;
                            i3 = i7;
                            str8 = str17;
                            it = it2;
                            str12 = str18;
                            semaphore2 = r12;
                            eventListener3 = eventListener4;
                            str14 = str19;
                        } catch (Exception e) {
                            exc2 = e;
                            Exception exc3 = exc2;
                            str10 = str20;
                            str11 = str18;
                            semaphore2 = r12;
                            eventListener3 = eventListener4;
                            byteString2 = byteString5;
                            i3 = i7;
                            str8 = str17;
                            it = it2;
                            str9 = str19;
                            if (exc3 != null) {
                            }
                            exc = null;
                            semaphore2 = semaphore2;
                            if (it.hasNext()) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            ((SemaphoreAndMutexImpl) r12).release();
                            throw th;
                        }
                        ByteString byteString6 = (ByteString) fetch;
                        if (byteString6 != null) {
                            str11 = str12;
                            str9 = str14;
                            byteString2 = byteString5;
                            str10 = str13;
                            exc = null;
                            semaphore2 = semaphore2;
                            if (it.hasNext()) {
                                if (exc2 != null) {
                                    throw exc2;
                                }
                                byteString3 = null;
                                obj = semaphore2;
                                ((SemaphoreAndMutexImpl) obj).release();
                                return byteString3;
                            }
                            Fetcher fetcher = (Fetcher) it.next();
                            CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                            fetcherKt$fetch$1.L$0 = exc;
                            fetcherKt$fetch$1.L$2 = str10;
                            fetcherKt$fetch$1.L$3 = eventListener3;
                            fetcherKt$fetch$1.L$4 = str9;
                            fetcherKt$fetch$1.L$5 = byteString2;
                            fetcherKt$fetch$1.L$6 = str11;
                            fetcherKt$fetch$1.L$7 = str8;
                            fetcherKt$fetch$1.L$8 = semaphore2;
                            fetcherKt$fetch$1.L$9 = exc2;
                            fetcherKt$fetch$1.L$10 = it;
                            fetcherKt$fetch$1.J$0 = j2;
                            fetcherKt$fetch$1.I$0 = i4;
                            fetcherKt$fetch$1.I$1 = i3;
                            fetcherKt$fetch$1.label = 2;
                            String str21 = str11;
                            FetcherKt$fetch$1 fetcherKt$fetch$12 = fetcherKt$fetch$1;
                            String str22 = str8;
                            String str23 = str9;
                            ByteString byteString7 = byteString2;
                            long j4 = j2;
                            EventListener eventListener5 = eventListener3;
                            String str24 = str10;
                            fetch = fetcher.fetch(str24, eventListener5, str23, byteString7, j4, str21, str22, fetcherKt$fetch$12);
                            byteString5 = byteString7;
                            j2 = j4;
                            str12 = str21;
                            str8 = str22;
                            coroutineSingletons = coroutineSingletons2;
                            if (fetch != coroutineSingletons) {
                                str13 = str24;
                                eventListener3 = eventListener5;
                                str14 = str23;
                                fetcherKt$fetch$1 = fetcherKt$fetch$12;
                                semaphore2 = semaphore2;
                                ByteString byteString62 = (ByteString) fetch;
                                if (byteString62 != null) {
                                    byteString3 = byteString62;
                                    obj = semaphore2;
                                    ((SemaphoreAndMutexImpl) obj).release();
                                    return byteString3;
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    it = list2.iterator();
                    String str25 = str5;
                    i3 = 0;
                    i4 = i2;
                    str9 = str25;
                    semaphore2 = semaphore;
                    str10 = str7;
                    str11 = str6;
                    eventListener3 = eventListener2;
                    exc2 = exc;
                    if (it.hasNext()) {
                    }
                }
            }
            it = list2.iterator();
            String str252 = str5;
            i3 = 0;
            i4 = i2;
            str9 = str252;
            semaphore2 = semaphore;
            str10 = str7;
            str11 = str6;
            eventListener3 = eventListener2;
            exc2 = exc;
            if (it.hasNext()) {
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = semaphore;
            ((SemaphoreAndMutexImpl) r12).release();
            throw th;
        }
        fetcherKt$fetch$1 = new FetcherKt$fetch$1(continuationImpl);
        Object obj22 = fetcherKt$fetch$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetcherKt$fetch$1.label;
        if (i != 0) {
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewFamilySafetyEducationHubPage.deepLinkSpecs;
    }
}

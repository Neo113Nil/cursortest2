package app.cash.cdp.backend.jvm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CashCdpMessageBackfiller;
import app.cash.cdp.persistence.api.Event;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.cdp.persistence.repository.PersistedEventRepository$getEventsBatch$2;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.cash.cdpproxy.api.AnalyticsMessage;
import com.squareup.protos.cash.cdpproxy.api.BatchContext;
import com.squareup.protos.cash.cdpproxy.api.SendAnalyticsMessageBatchRequest;
import com.squareup.protos.cash.cdpproxy.api.TrackMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class JvmBatchUploadWorker {
    public final CashCdpMessageBackfiller backfiller;
    public final BatchUploader batchUploader;
    public final CashCdpConfigProvider cdpConfigProvider;
    public final PersistedEventRepository repository;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Result {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result RETRY;
        public static final Result SUCCESS;

        static {
            Result result = new Result("SUCCESS", 0);
            SUCCESS = result;
            Result result2 = new Result("RETRY", 1);
            RETRY = result2;
            $VALUES = new Result[]{result, result2};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    public JvmBatchUploadWorker(PersistedEventRepository persistedEventRepository, CashCdpConfigProvider cashCdpConfigProvider, BatchUploader batchUploader, CashCdpMessageBackfiller cashCdpMessageBackfiller) {
        batchUploader.getClass();
        this.repository = persistedEventRepository;
        this.cdpConfigProvider = cashCdpConfigProvider;
        this.batchUploader = batchUploader;
        this.backfiller = cashCdpMessageBackfiller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0268 A[LOOP:3: B:95:0x0262->B:97:0x0268, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0296 -> B:12:0x0298). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum processNextBatches(long j, ContinuationImpl continuationImpl) {
        JvmBatchUploadWorker$processNextBatches$1 jvmBatchUploadWorker$processNextBatches$1;
        int i;
        JvmBatchUploadWorker$processNextBatches$1 jvmBatchUploadWorker$processNextBatches$12;
        Ref$ObjectRef ref$ObjectRef;
        long j2;
        Ref$ObjectRef ref$ObjectRef2;
        long j3;
        List<Event> list;
        ArrayList arrayList;
        SendAnalyticsMessageBatchRequest sendAnalyticsMessageBatchRequest;
        int ordinal;
        Iterator it;
        Continuation continuation;
        char c;
        Object withContext;
        Object obj;
        TrackMessage value;
        Ref$ObjectRef ref$ObjectRef3;
        AnalyticsMessage analyticsMessage;
        TrackMessage value2;
        Object withContext2;
        if (continuationImpl instanceof JvmBatchUploadWorker$processNextBatches$1) {
            jvmBatchUploadWorker$processNextBatches$1 = (JvmBatchUploadWorker$processNextBatches$1) continuationImpl;
            int i2 = jvmBatchUploadWorker$processNextBatches$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                jvmBatchUploadWorker$processNextBatches$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = jvmBatchUploadWorker$processNextBatches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jvmBatchUploadWorker$processNextBatches$1.label;
                int i3 = 0;
                int i4 = 1;
                ?? r10 = 0;
                AnalyticsMessage analyticsMessage2 = null;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    m.element = this;
                    jvmBatchUploadWorker$processNextBatches$12 = jvmBatchUploadWorker$processNextBatches$1;
                    ref$ObjectRef = m;
                    j2 = j;
                    PersistedEventRepository persistedEventRepository = ((JvmBatchUploadWorker) ref$ObjectRef.element).repository;
                    jvmBatchUploadWorker$processNextBatches$12.L$0 = ref$ObjectRef;
                    jvmBatchUploadWorker$processNextBatches$12.L$1 = r10;
                    jvmBatchUploadWorker$processNextBatches$12.L$3 = r10;
                    jvmBatchUploadWorker$processNextBatches$12.J$0 = j2;
                    jvmBatchUploadWorker$processNextBatches$12.label = i4;
                    withContext2 = JobKt.withContext(persistedEventRepository.ioDispatcher, new PersistedEventRepository$getEventsBatch$2(j2, persistedEventRepository, r10), jvmBatchUploadWorker$processNextBatches$12);
                    if (withContext2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        j3 = jvmBatchUploadWorker$processNextBatches$1.J$0;
                        arrayList = jvmBatchUploadWorker$processNextBatches$1.L$3;
                        list = jvmBatchUploadWorker$processNextBatches$1.L$1;
                        ref$ObjectRef2 = jvmBatchUploadWorker$processNextBatches$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ByteString byteString = ByteString.EMPTY;
                        sendAnalyticsMessageBatchRequest = new SendAnalyticsMessageBatchRequest(arrayList, new BatchContext(null, byteString), byteString);
                        Response execute = ((JvmBatchUploadWorker) ref$ObjectRef2.element).batchUploader.upload(sendAnalyticsMessageBatchRequest).execute();
                        execute.getClass();
                        okhttp3.Response response = execute.rawResponse;
                        int i5 = response.code;
                        ordinal = (!response.isSuccessful ? (400 > i5 || i5 >= 500) ? ResponseStatus.RECOVERABLE_FAILURE : ResponseStatus.UNRECOVERABLE_FAILURE : ResponseStatus.SUCCESS).ordinal();
                        if (ordinal == 0) {
                        }
                        PersistedEventRepository persistedEventRepository2 = ((JvmBatchUploadWorker) ref$ObjectRef2.element).repository;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        jvmBatchUploadWorker$processNextBatches$1.L$0 = ref$ObjectRef2;
                        continuation = null;
                        jvmBatchUploadWorker$processNextBatches$1.L$1 = null;
                        jvmBatchUploadWorker$processNextBatches$1.L$3 = null;
                        jvmBatchUploadWorker$processNextBatches$1.J$0 = j3;
                        c = 3;
                        jvmBatchUploadWorker$processNextBatches$1.label = 3;
                        withContext = JobKt.withContext(persistedEventRepository2.ioDispatcher, new RealGcmRegistrar$unregister$2(persistedEventRepository2, linkedHashSet, continuation, 7), jvmBatchUploadWorker$processNextBatches$1);
                        obj = withContext;
                        if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = jvmBatchUploadWorker$processNextBatches$1.J$0;
                    List list2 = jvmBatchUploadWorker$processNextBatches$1.L$1;
                    Ref$ObjectRef ref$ObjectRef4 = jvmBatchUploadWorker$processNextBatches$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    JvmBatchUploadWorker$processNextBatches$1 jvmBatchUploadWorker$processNextBatches$13 = jvmBatchUploadWorker$processNextBatches$1;
                    ref$ObjectRef = ref$ObjectRef4;
                    JvmBatchUploadWorker$processNextBatches$1 jvmBatchUploadWorker$processNextBatches$14 = jvmBatchUploadWorker$processNextBatches$13;
                    int i6 = 0;
                    c = 3;
                    int i7 = 1;
                    continuation = null;
                    ref$ObjectRef.element = (JvmBatchUploadWorker) ref$ObjectRef.element;
                    i4 = i7;
                    r10 = continuation;
                    i3 = i6;
                    jvmBatchUploadWorker$processNextBatches$12 = jvmBatchUploadWorker$processNextBatches$14;
                    j2 = j3;
                    PersistedEventRepository persistedEventRepository3 = ((JvmBatchUploadWorker) ref$ObjectRef.element).repository;
                    jvmBatchUploadWorker$processNextBatches$12.L$0 = ref$ObjectRef;
                    jvmBatchUploadWorker$processNextBatches$12.L$1 = r10;
                    jvmBatchUploadWorker$processNextBatches$12.L$3 = r10;
                    jvmBatchUploadWorker$processNextBatches$12.J$0 = j2;
                    jvmBatchUploadWorker$processNextBatches$12.label = i4;
                    withContext2 = JobKt.withContext(persistedEventRepository3.ioDispatcher, new PersistedEventRepository$getEventsBatch$2(j2, persistedEventRepository3, r10), jvmBatchUploadWorker$processNextBatches$12);
                    if (withContext2 != coroutineSingletons) {
                        obj2 = withContext2;
                        j3 = j2;
                        ref$ObjectRef3 = ref$ObjectRef;
                        jvmBatchUploadWorker$processNextBatches$1 = jvmBatchUploadWorker$processNextBatches$12;
                        analyticsMessage2 = r10;
                        list = (List) obj2;
                        Timber.Forest.v(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "CDP BatchUploadWorker.processNextBatches batch.size: "), new Object[i3]);
                        if (!list.isEmpty()) {
                            return Result.SUCCESS;
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        ArrayList arrayList2 = new ArrayList();
                        AnalyticsMessage analyticsMessage3 = analyticsMessage2;
                        for (Event event : list) {
                            try {
                                event.getClass();
                                analyticsMessage = (AnalyticsMessage) AnalyticsMessage.ADAPTER.decode(event.payload);
                            } catch (IOException unused) {
                                linkedHashSet2.add(event.id);
                                analyticsMessage = analyticsMessage3;
                            }
                            if (analyticsMessage != null) {
                                AnalyticsMessage.Payload payload = analyticsMessage.payload;
                                AnalyticsMessage.Payload.Track track = payload instanceof AnalyticsMessage.Payload.Track ? (AnalyticsMessage.Payload.Track) payload : analyticsMessage3;
                                if (((track == null || (value2 = track.getValue()) == null) ? analyticsMessage3 : value2.event_name) == null) {
                                    Timber.Forest.e(new IllegalStateException("CASHA-8148: Tracked message deserialization shouldn't have null event name: message = " + analyticsMessage));
                                    linkedHashSet2.add(event.id);
                                    analyticsMessage = null;
                                }
                            }
                            if (analyticsMessage != null) {
                                arrayList2.add(analyticsMessage);
                            }
                            analyticsMessage3 = null;
                        }
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AnalyticsMessage analyticsMessage4 = (AnalyticsMessage) it2.next();
                            CashCdpMessageBackfiller cashCdpMessageBackfiller = ((JvmBatchUploadWorker) ref$ObjectRef3.element).backfiller;
                            analyticsMessage4.getClass();
                            if (analyticsMessage4.app_token == null) {
                                analyticsMessage4 = AnalyticsMessage.copy$default(analyticsMessage4, null, PlatformKt.appTokenOrNull(cashCdpMessageBackfiller.sessionManager), null, null, 2039);
                            }
                            arrayList3.add(analyticsMessage4);
                        }
                        PersistedEventRepository persistedEventRepository4 = ((JvmBatchUploadWorker) ref$ObjectRef3.element).repository;
                        jvmBatchUploadWorker$processNextBatches$1.L$0 = ref$ObjectRef3;
                        jvmBatchUploadWorker$processNextBatches$1.L$1 = list;
                        jvmBatchUploadWorker$processNextBatches$1.L$3 = arrayList3;
                        jvmBatchUploadWorker$processNextBatches$1.J$0 = j3;
                        jvmBatchUploadWorker$processNextBatches$1.label = 2;
                        Object withContext3 = JobKt.withContext(persistedEventRepository4.ioDispatcher, new RealGcmRegistrar$unregister$2(persistedEventRepository4, linkedHashSet2, null, 7), jvmBatchUploadWorker$processNextBatches$1);
                        Object obj3 = withContext3;
                        if (withContext3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj3 = Unit.INSTANCE;
                        }
                        if (obj3 != coroutineSingletons) {
                            try {
                                ref$ObjectRef2 = ref$ObjectRef3;
                                arrayList = arrayList3;
                                Response execute2 = ((JvmBatchUploadWorker) ref$ObjectRef2.element).batchUploader.upload(sendAnalyticsMessageBatchRequest).execute();
                                execute2.getClass();
                                okhttp3.Response response2 = execute2.rawResponse;
                                int i52 = response2.code;
                                ordinal = (!response2.isSuccessful ? (400 > i52 || i52 >= 500) ? ResponseStatus.RECOVERABLE_FAILURE : ResponseStatus.UNRECOVERABLE_FAILURE : ResponseStatus.SUCCESS).ordinal();
                                if (ordinal == 0) {
                                    i7 = 1;
                                    if (ordinal == 1) {
                                        ((JvmBatchUploadWorker) ref$ObjectRef2.element).getClass();
                                        return Result.RETRY;
                                    }
                                    if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    ((JvmBatchUploadWorker) ref$ObjectRef2.element).getClass();
                                    List<AnalyticsMessage> list3 = sendAnalyticsMessageBatchRequest.messages;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator<T> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        AnalyticsMessage.Payload payload2 = ((AnalyticsMessage) it3.next()).payload;
                                        AnalyticsMessage.Payload.Track track2 = payload2 instanceof AnalyticsMessage.Payload.Track ? (AnalyticsMessage.Payload.Track) payload2 : null;
                                        String m2 = (track2 == null || (value = track2.getValue()) == null) ? null : Recorder$$ExternalSyntheticOutline2.m("\n\t", value.event_name);
                                        if (m2 != null) {
                                            arrayList4.add(m2);
                                        }
                                    }
                                    String joinToString$default = CollectionsKt.joinToString$default(arrayList4, null, null, null, 0, null, null, 63);
                                    Timber.Forest forest = Timber.Forest;
                                    String m3 = Recorder$$ExternalSyntheticOutline2.m(i52, sendAnalyticsMessageBatchRequest.messages.size(), "Failed to upload analytics batch: ", ", messages.size: ", joinToString$default);
                                    i6 = 0;
                                    forest.e(m3, new Object[0]);
                                } else {
                                    i6 = 0;
                                    i7 = 1;
                                }
                                PersistedEventRepository persistedEventRepository22 = ((JvmBatchUploadWorker) ref$ObjectRef2.element).repository;
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                it = list.iterator();
                                while (it.hasNext()) {
                                    linkedHashSet3.add(((Event) it.next()).id);
                                }
                                jvmBatchUploadWorker$processNextBatches$1.L$0 = ref$ObjectRef2;
                                continuation = null;
                                jvmBatchUploadWorker$processNextBatches$1.L$1 = null;
                                jvmBatchUploadWorker$processNextBatches$1.L$3 = null;
                                jvmBatchUploadWorker$processNextBatches$1.J$0 = j3;
                                c = 3;
                                jvmBatchUploadWorker$processNextBatches$1.label = 3;
                                withContext = JobKt.withContext(persistedEventRepository22.ioDispatcher, new RealGcmRegistrar$unregister$2(persistedEventRepository22, linkedHashSet3, continuation, 7), jvmBatchUploadWorker$processNextBatches$1);
                                obj = withContext;
                                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    obj = Unit.INSTANCE;
                                }
                                if (obj != coroutineSingletons) {
                                    jvmBatchUploadWorker$processNextBatches$14 = jvmBatchUploadWorker$processNextBatches$1;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    ref$ObjectRef.element = (JvmBatchUploadWorker) ref$ObjectRef.element;
                                    i4 = i7;
                                    r10 = continuation;
                                    i3 = i6;
                                    jvmBatchUploadWorker$processNextBatches$12 = jvmBatchUploadWorker$processNextBatches$14;
                                    j2 = j3;
                                    PersistedEventRepository persistedEventRepository32 = ((JvmBatchUploadWorker) ref$ObjectRef.element).repository;
                                    jvmBatchUploadWorker$processNextBatches$12.L$0 = ref$ObjectRef;
                                    jvmBatchUploadWorker$processNextBatches$12.L$1 = r10;
                                    jvmBatchUploadWorker$processNextBatches$12.L$3 = r10;
                                    jvmBatchUploadWorker$processNextBatches$12.J$0 = j2;
                                    jvmBatchUploadWorker$processNextBatches$12.label = i4;
                                    withContext2 = JobKt.withContext(persistedEventRepository32.ioDispatcher, new PersistedEventRepository$getEventsBatch$2(j2, persistedEventRepository32, r10), jvmBatchUploadWorker$processNextBatches$12);
                                    if (withContext2 != coroutineSingletons) {
                                    }
                                }
                            } catch (IOException unused2) {
                                ((JvmBatchUploadWorker) ref$ObjectRef2.element).getClass();
                                return Result.RETRY;
                            }
                            ByteString byteString2 = ByteString.EMPTY;
                            sendAnalyticsMessageBatchRequest = new SendAnalyticsMessageBatchRequest(arrayList, new BatchContext(null, byteString2), byteString2);
                        }
                    }
                    return coroutineSingletons;
                }
                j3 = jvmBatchUploadWorker$processNextBatches$1.J$0;
                ref$ObjectRef3 = jvmBatchUploadWorker$processNextBatches$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                list = (List) obj2;
                Timber.Forest.v(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "CDP BatchUploadWorker.processNextBatches batch.size: "), new Object[i3]);
                if (!list.isEmpty()) {
                }
            }
        }
        jvmBatchUploadWorker$processNextBatches$1 = new JvmBatchUploadWorker$processNextBatches$1(this, continuationImpl);
        Object obj22 = jvmBatchUploadWorker$processNextBatches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jvmBatchUploadWorker$processNextBatches$1.label;
        int i32 = 0;
        int i42 = 1;
        ?? r102 = 0;
        AnalyticsMessage analyticsMessage22 = null;
        if (i != 0) {
        }
    }
}

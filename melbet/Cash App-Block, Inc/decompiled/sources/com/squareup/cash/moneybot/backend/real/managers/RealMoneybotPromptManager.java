package com.squareup.cash.moneybot.backend.real.managers;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.cash.kgoose.api.v3.GetInChatPromptsRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetInChatPromptsResponse;
import com.squareup.protos.cash.kgoose.api.v3.InChatPrompt;
import com.squareup.protos.cash.kgoose.api.v3.UpdateInChatPromptRequest;
import com.squareup.protos.cash.kgoose.api.v3.UpdateInChatPromptResponse;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes6.dex */
public final class RealMoneybotPromptManager implements HasObservability {
    public final RealMoneybotAnalyticsService analyticsService;
    public volatile List cachedInChatPrompts;
    public final ErrorReporter errorReporter;
    public final CashKgooseService kgooseService;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final MutexImpl promptsMutex = new MutexImpl();

    public RealMoneybotPromptManager(ErrorReporter errorReporter, SampleStrategy sampleStrategy, CashKgooseService cashKgooseService, RealMoneybotAnalyticsService realMoneybotAnalyticsService) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.kgooseService = cashKgooseService;
        this.analyticsService = realMoneybotAnalyticsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInChatPrompts(ContinuationImpl continuationImpl) {
        RealMoneybotPromptManager$fetchInChatPrompts$1 realMoneybotPromptManager$fetchInChatPrompts$1;
        int i;
        Object obj;
        boolean z;
        String simpleName;
        if (continuationImpl instanceof RealMoneybotPromptManager$fetchInChatPrompts$1) {
            realMoneybotPromptManager$fetchInChatPrompts$1 = (RealMoneybotPromptManager$fetchInChatPrompts$1) continuationImpl;
            int i2 = realMoneybotPromptManager$fetchInChatPrompts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotPromptManager$fetchInChatPrompts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realMoneybotPromptManager$fetchInChatPrompts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotPromptManager$fetchInChatPrompts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    CashKgooseService cashKgooseService = this.kgooseService;
                    GetInChatPromptsRequest getInChatPromptsRequest = new GetInChatPromptsRequest(null, ByteString.EMPTY);
                    realMoneybotPromptManager$fetchInChatPrompts$1.label = 1;
                    obj2 = cashKgooseService.getInChatPrompts(getInChatPromptsRequest, realMoneybotPromptManager$fetchInChatPrompts$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                z = obj instanceof ApiResult.Failure;
                if (z) {
                    ApiResult.Failure failure = (ApiResult.Failure) obj;
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService = this.analyticsService;
                    if (failure instanceof ApiResult.Failure.NetworkFailure) {
                        simpleName = "NetworkFailure";
                    } else {
                        simpleName = Reflection.factory.getOrCreateKotlinClass(failure.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "Unknown";
                        }
                    }
                    realMoneybotAnalyticsService.submitChatError(null, simpleName, "getInChatPrompts");
                }
                if (!(obj instanceof ApiResult.Success)) {
                    GetInChatPromptsResponse getInChatPromptsResponse = (GetInChatPromptsResponse) ((ApiResult.Success) obj).response;
                    getInChatPromptsResponse.getClass();
                    List<InChatPrompt> list = getInChatPromptsResponse.prompts;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        com.squareup.cash.moneybot.backend.api.model.chat.InChatPrompt inChatPrompt = WiresAccountInfo.WiresProfile.toInChatPrompt(this, (InChatPrompt) it.next());
                        if (inChatPrompt != null) {
                            arrayList.add(inChatPrompt);
                        }
                    }
                    obj = new ApiResult.Success(arrayList);
                } else if (!z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (obj instanceof ApiResult.Success) {
                    this.cachedInChatPrompts = (List) ((ApiResult.Success) obj).response;
                }
                return obj;
            }
        }
        realMoneybotPromptManager$fetchInChatPrompts$1 = new RealMoneybotPromptManager$fetchInChatPrompts$1(this, continuationImpl);
        Object obj22 = realMoneybotPromptManager$fetchInChatPrompts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotPromptManager$fetchInChatPrompts$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        z = obj instanceof ApiResult.Failure;
        if (z) {
        }
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (obj instanceof ApiResult.Success) {
        }
        return obj;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r8.lock(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x005b, B:28:0x005f, B:29:0x006a), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:26:0x005b, B:28:0x005f, B:29:0x006a), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getInChatPrompts(ContinuationImpl continuationImpl) {
        RealMoneybotPromptManager$getInChatPrompts$1 realMoneybotPromptManager$getInChatPrompts$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        ?? r7;
        List list;
        Object success;
        try {
            if (continuationImpl instanceof RealMoneybotPromptManager$getInChatPrompts$1) {
                realMoneybotPromptManager$getInChatPrompts$1 = (RealMoneybotPromptManager$getInChatPrompts$1) continuationImpl;
                int i3 = realMoneybotPromptManager$getInChatPrompts$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realMoneybotPromptManager$getInChatPrompts$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realMoneybotPromptManager$getInChatPrompts$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realMoneybotPromptManager$getInChatPrompts$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list2 = this.cachedInChatPrompts;
                        if (list2 != null) {
                            return new ApiResult.Success(list2);
                        }
                        mutexImpl = this.promptsMutex;
                        realMoneybotPromptManager$getInChatPrompts$1.L$0 = mutexImpl;
                        i2 = 0;
                        realMoneybotPromptManager$getInChatPrompts$1.I$0 = 0;
                        realMoneybotPromptManager$getInChatPrompts$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r7 = realMoneybotPromptManager$getInChatPrompts$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                r7 = r7;
                                Object obj2 = (ApiResult) obj;
                                mutexImpl = r7;
                                success = obj2;
                                mutexImpl.unlock(null);
                                return success;
                            } catch (Throwable th2) {
                                th = th2;
                                r7.unlock(null);
                                throw th;
                            }
                        }
                        i2 = realMoneybotPromptManager$getInChatPrompts$1.I$0;
                        ?? r4 = realMoneybotPromptManager$getInChatPrompts$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r4;
                    }
                    list = this.cachedInChatPrompts;
                    if (list == null) {
                        success = new ApiResult.Success(list);
                        mutexImpl.unlock(null);
                        return success;
                    }
                    realMoneybotPromptManager$getInChatPrompts$1.L$0 = mutexImpl;
                    realMoneybotPromptManager$getInChatPrompts$1.I$0 = i2;
                    realMoneybotPromptManager$getInChatPrompts$1.label = 2;
                    Object fetchInChatPrompts = fetchInChatPrompts(realMoneybotPromptManager$getInChatPrompts$1);
                    if (fetchInChatPrompts != coroutineSingletons) {
                        MutexImpl mutexImpl2 = mutexImpl;
                        obj = fetchInChatPrompts;
                        r7 = mutexImpl2;
                        Object obj22 = (ApiResult) obj;
                        mutexImpl = r7;
                        success = obj22;
                        mutexImpl.unlock(null);
                        return success;
                    }
                    return coroutineSingletons;
                }
            }
            list = this.cachedInChatPrompts;
            if (list == null) {
            }
        } catch (Throwable th3) {
            MutexImpl mutexImpl3 = mutexImpl;
            th = th3;
            r7 = mutexImpl3;
            r7.unlock(null);
            throw th;
        }
        realMoneybotPromptManager$getInChatPrompts$1 = new RealMoneybotPromptManager$getInChatPrompts$1(this, continuationImpl);
        Object obj3 = realMoneybotPromptManager$getInChatPrompts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotPromptManager$getInChatPrompts$1.label;
        if (i != 0) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r8.lock(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshPrompts(ContinuationImpl continuationImpl) {
        RealMoneybotPromptManager$refreshPrompts$1 realMoneybotPromptManager$refreshPrompts$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        Mutex mutex;
        Object fetchInChatPrompts;
        try {
            if (continuationImpl instanceof RealMoneybotPromptManager$refreshPrompts$1) {
                realMoneybotPromptManager$refreshPrompts$1 = (RealMoneybotPromptManager$refreshPrompts$1) continuationImpl;
                int i3 = realMoneybotPromptManager$refreshPrompts$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realMoneybotPromptManager$refreshPrompts$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realMoneybotPromptManager$refreshPrompts$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realMoneybotPromptManager$refreshPrompts$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.promptsMutex;
                        realMoneybotPromptManager$refreshPrompts$1.L$0 = mutexImpl;
                        i2 = 0;
                        realMoneybotPromptManager$refreshPrompts$1.I$0 = 0;
                        realMoneybotPromptManager$refreshPrompts$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realMoneybotPromptManager$refreshPrompts$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                ApiResult apiResult = (ApiResult) obj;
                                mutex.unlock(null);
                                return apiResult;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i2 = realMoneybotPromptManager$refreshPrompts$1.I$0;
                        ?? r4 = realMoneybotPromptManager$refreshPrompts$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r4;
                    }
                    realMoneybotPromptManager$refreshPrompts$1.L$0 = mutexImpl;
                    realMoneybotPromptManager$refreshPrompts$1.I$0 = i2;
                    realMoneybotPromptManager$refreshPrompts$1.label = 2;
                    fetchInChatPrompts = fetchInChatPrompts(realMoneybotPromptManager$refreshPrompts$1);
                    if (fetchInChatPrompts != coroutineSingletons) {
                        MutexImpl mutexImpl2 = mutexImpl;
                        obj = fetchInChatPrompts;
                        mutex = mutexImpl2;
                        ApiResult apiResult2 = (ApiResult) obj;
                        mutex.unlock(null);
                        return apiResult2;
                    }
                    return coroutineSingletons;
                }
            }
            realMoneybotPromptManager$refreshPrompts$1.L$0 = mutexImpl;
            realMoneybotPromptManager$refreshPrompts$1.I$0 = i2;
            realMoneybotPromptManager$refreshPrompts$1.label = 2;
            fetchInChatPrompts = fetchInChatPrompts(realMoneybotPromptManager$refreshPrompts$1);
            if (fetchInChatPrompts != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            MutexImpl mutexImpl3 = mutexImpl;
            th = th3;
            mutex = mutexImpl3;
            mutex.unlock(null);
            throw th;
        }
        realMoneybotPromptManager$refreshPrompts$1 = new RealMoneybotPromptManager$refreshPrompts$1(this, continuationImpl);
        Object obj2 = realMoneybotPromptManager$refreshPrompts$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotPromptManager$refreshPrompts$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0055, code lost:
    
        if (r11.lock(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:18:0x0097, B:19:0x0085, B:22:0x009d, B:24:0x00a1, B:25:0x00b7, B:27:0x00bd, B:30:0x00c9, B:35:0x00cd, B:36:0x00d7, B:38:0x00db, B:42:0x00d3, B:44:0x00e8, B:45:0x00ed), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:18:0x0097, B:19:0x0085, B:22:0x009d, B:24:0x00a1, B:25:0x00b7, B:27:0x00bd, B:30:0x00c9, B:35:0x00cd, B:36:0x00d7, B:38:0x00db, B:42:0x00d3, B:44:0x00e8, B:45:0x00ed), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:18:0x0097, B:19:0x0085, B:22:0x009d, B:24:0x00a1, B:25:0x00b7, B:27:0x00bd, B:30:0x00c9, B:35:0x00cd, B:36:0x00d7, B:38:0x00db, B:42:0x00d3, B:44:0x00e8, B:45:0x00ed), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:18:0x0097, B:19:0x0085, B:22:0x009d, B:24:0x00a1, B:25:0x00b7, B:27:0x00bd, B:30:0x00c9, B:35:0x00cd, B:36:0x00d7, B:38:0x00db, B:42:0x00d3, B:44:0x00e8, B:45:0x00ed), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateInChatPrompt(String str, ContinuationImpl continuationImpl) {
        RealMoneybotPromptManager$updateInChatPrompt$1 realMoneybotPromptManager$updateInChatPrompt$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        Object updateInChatPrompt;
        Object obj;
        String simpleName;
        try {
            if (continuationImpl instanceof RealMoneybotPromptManager$updateInChatPrompt$1) {
                realMoneybotPromptManager$updateInChatPrompt$1 = (RealMoneybotPromptManager$updateInChatPrompt$1) continuationImpl;
                int i3 = realMoneybotPromptManager$updateInChatPrompt$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realMoneybotPromptManager$updateInChatPrompt$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realMoneybotPromptManager$updateInChatPrompt$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realMoneybotPromptManager$updateInChatPrompt$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = this.promptsMutex;
                        realMoneybotPromptManager$updateInChatPrompt$1.L$0 = str;
                        realMoneybotPromptManager$updateInChatPrompt$1.L$1 = mutexImpl;
                        i2 = 0;
                        realMoneybotPromptManager$updateInChatPrompt$1.I$0 = 0;
                        realMoneybotPromptManager$updateInChatPrompt$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realMoneybotPromptManager$updateInChatPrompt$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                obj = (ApiResult) obj2;
                                if (obj instanceof ApiResult.Failure) {
                                    ApiResult.Failure failure = (ApiResult.Failure) obj;
                                    RealMoneybotAnalyticsService realMoneybotAnalyticsService = this.analyticsService;
                                    if (failure instanceof ApiResult.Failure.NetworkFailure) {
                                        simpleName = "NetworkFailure";
                                    } else {
                                        simpleName = Reflection.factory.getOrCreateKotlinClass(failure.getClass()).getSimpleName();
                                        if (simpleName == null) {
                                            simpleName = "Unknown";
                                        }
                                    }
                                    realMoneybotAnalyticsService.submitChatError(null, simpleName, "updateInChatPrompt");
                                }
                                if (!(obj instanceof ApiResult.Success)) {
                                    UpdateInChatPromptResponse updateInChatPromptResponse = (UpdateInChatPromptResponse) ((ApiResult.Success) obj).response;
                                    updateInChatPromptResponse.getClass();
                                    List<InChatPrompt> list = updateInChatPromptResponse.prompts;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        com.squareup.cash.moneybot.backend.api.model.chat.InChatPrompt inChatPrompt = WiresAccountInfo.WiresProfile.toInChatPrompt(this, (InChatPrompt) it.next());
                                        if (inChatPrompt != null) {
                                            arrayList.add(inChatPrompt);
                                        }
                                    }
                                    obj = new ApiResult.Success(arrayList);
                                } else if (!(obj instanceof ApiResult.Failure)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (obj instanceof ApiResult.Success) {
                                    this.cachedInChatPrompts = (List) ((ApiResult.Success) obj).response;
                                }
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realMoneybotPromptManager$updateInChatPrompt$1.I$0;
                        ?? r2 = realMoneybotPromptManager$updateInChatPrompt$1.L$1;
                        String str2 = realMoneybotPromptManager$updateInChatPrompt$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = r2;
                        i2 = i4;
                        str = str2;
                    }
                    CashKgooseService cashKgooseService = this.kgooseService;
                    UpdateInChatPromptRequest updateInChatPromptRequest = new UpdateInChatPromptRequest(null, str, ByteString.EMPTY);
                    realMoneybotPromptManager$updateInChatPrompt$1.L$0 = null;
                    realMoneybotPromptManager$updateInChatPrompt$1.L$1 = mutexImpl;
                    realMoneybotPromptManager$updateInChatPrompt$1.I$0 = i2;
                    realMoneybotPromptManager$updateInChatPrompt$1.label = 2;
                    updateInChatPrompt = cashKgooseService.updateInChatPrompt(updateInChatPromptRequest, realMoneybotPromptManager$updateInChatPrompt$1);
                    if (updateInChatPrompt != coroutineSingletons) {
                        MutexImpl mutexImpl2 = mutexImpl;
                        obj2 = updateInChatPrompt;
                        mutex = mutexImpl2;
                        obj = (ApiResult) obj2;
                        if (obj instanceof ApiResult.Failure) {
                        }
                        if (!(obj instanceof ApiResult.Success)) {
                        }
                        if (obj instanceof ApiResult.Success) {
                        }
                        mutex.unlock(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            CashKgooseService cashKgooseService2 = this.kgooseService;
            UpdateInChatPromptRequest updateInChatPromptRequest2 = new UpdateInChatPromptRequest(null, str, ByteString.EMPTY);
            realMoneybotPromptManager$updateInChatPrompt$1.L$0 = null;
            realMoneybotPromptManager$updateInChatPrompt$1.L$1 = mutexImpl;
            realMoneybotPromptManager$updateInChatPrompt$1.I$0 = i2;
            realMoneybotPromptManager$updateInChatPrompt$1.label = 2;
            updateInChatPrompt = cashKgooseService2.updateInChatPrompt(updateInChatPromptRequest2, realMoneybotPromptManager$updateInChatPrompt$1);
            if (updateInChatPrompt != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realMoneybotPromptManager$updateInChatPrompt$1 = new RealMoneybotPromptManager$updateInChatPrompt$1(this, continuationImpl);
        Object obj22 = realMoneybotPromptManager$updateInChatPrompt$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotPromptManager$updateInChatPrompt$1.label;
        if (i != 0) {
        }
    }
}

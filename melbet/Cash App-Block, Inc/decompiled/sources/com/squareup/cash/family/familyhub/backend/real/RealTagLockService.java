package com.squareup.cash.family.familyhub.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.SponseeCashAppTag;
import com.squareup.cash.family.familyhub.backend.api.TagLockResult;
import com.squareup.protos.cash.taply.app.v1.LockPaymentTokenDeviceRequest;
import com.squareup.protos.cash.taply.app.v1.TaplyAppService;
import com.squareup.protos.cash.taply.app.v1.UnlockPaymentTokenDeviceRequest;
import com.squareup.protos.cash.taply.model.v1.LockActor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealTagLockService {
    public final RealDependentControlsCache dependentControlsCache;
    public final SponseeWalletSnapshotFetcher snapshotFetcher;
    public final TaplyAppService taplyAppService;

    public RealTagLockService(TaplyAppService taplyAppService, SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher, RealDependentControlsCache realDependentControlsCache) {
        this.taplyAppService = taplyAppService;
        this.snapshotFetcher = sponseeWalletSnapshotFetcher;
        this.dependentControlsCache = realDependentControlsCache;
    }

    public static TagLockResult toTagLockResult(ApiResult apiResult) {
        if (apiResult instanceof ApiResult.Success) {
            return TagLockResult.Success.INSTANCE;
        }
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            return new TagLockResult.Failure(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HTTP "));
        }
        if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
            return new TagLockResult.Failure(((ApiResult.Failure.NetworkFailure) apiResult).error.getMessage());
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final Object applyOptimisticTagLock(String str, boolean z, ContinuationImpl continuationImpl) {
        Object status;
        SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher = this.snapshotFetcher;
        str.getClass();
        Pair pair = sponseeWalletSnapshotFetcher.cached;
        if (pair != null) {
            List<SponseeCashAppTag> list = ((SponseeWalletSnapshot) pair.second).sponseeTags;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SponseeCashAppTag sponseeCashAppTag : list) {
                if (Intrinsics.areEqual(sponseeCashAppTag.deviceId, str)) {
                    sponseeCashAppTag = SponseeCashAppTag.copy$default(sponseeCashAppTag, z);
                }
                arrayList.add(sponseeCashAppTag);
            }
            sponseeWalletSnapshotFetcher.cached = new Pair(pair.first, SponseeWalletSnapshot.copy$default((SponseeWalletSnapshot) pair.second, false, arrayList, 7));
        }
        RealDependentControlsCache realDependentControlsCache = this.dependentControlsCache;
        Object obj = realDependentControlsCache.cache.get(ControlType.CASH_CARD);
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = obj instanceof DependentControlStatus.Loaded.LoadedCardControl ? (DependentControlStatus.Loaded.LoadedCardControl) obj : null;
        if (loadedCardControl == null) {
            status = Unit.INSTANCE;
        } else {
            List list2 = loadedCardControl.sponseeTags;
            List<SponseeCashAppTag> list3 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (SponseeCashAppTag sponseeCashAppTag2 : list3) {
                if (Intrinsics.areEqual(sponseeCashAppTag2.deviceId, str)) {
                    sponseeCashAppTag2 = SponseeCashAppTag.copy$default(sponseeCashAppTag2, z);
                }
                arrayList2.add(sponseeCashAppTag2);
            }
            if (arrayList2.equals(list2)) {
                status = Unit.INSTANCE;
            } else {
                status = realDependentControlsCache.setStatus(ControlType.CASH_CARD, DependentControlStatus.Loaded.LoadedCardControl.copy$default(loadedCardControl, false, null, arrayList2, 63), continuationImpl);
                if (status != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    status = Unit.INSTANCE;
                }
            }
        }
        return status == CoroutineSingletons.COROUTINE_SUSPENDED ? status : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lockTag(String str, ContinuationImpl continuationImpl) {
        RealTagLockService$lockTag$1 realTagLockService$lockTag$1;
        int i;
        TagLockResult tagLockResult;
        if (continuationImpl instanceof RealTagLockService$lockTag$1) {
            realTagLockService$lockTag$1 = (RealTagLockService$lockTag$1) continuationImpl;
            int i2 = realTagLockService$lockTag$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTagLockService$lockTag$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTagLockService$lockTag$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTagLockService$lockTag$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = new LockPaymentTokenDeviceRequest(str, LockActor.LOCK_ACTOR_SPONSOR, ByteString.EMPTY);
                    realTagLockService$lockTag$1.L$0 = str;
                    realTagLockService$lockTag$1.label = 1;
                    obj = this.taplyAppService.lockPaymentTokenDevice(lockPaymentTokenDeviceRequest, realTagLockService$lockTag$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        TagLockResult.Success success = realTagLockService$lockTag$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return success;
                    }
                    str = realTagLockService$lockTag$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                tagLockResult = toTagLockResult((ApiResult) obj);
                if (tagLockResult instanceof TagLockResult.Success) {
                    realTagLockService$lockTag$1.L$0 = null;
                    realTagLockService$lockTag$1.L$2 = (TagLockResult.Success) tagLockResult;
                    realTagLockService$lockTag$1.label = 2;
                    if (applyOptimisticTagLock(str, true, realTagLockService$lockTag$1) == obj2) {
                        return obj2;
                    }
                }
                return tagLockResult;
            }
        }
        realTagLockService$lockTag$1 = new RealTagLockService$lockTag$1(this, continuationImpl);
        Object obj3 = realTagLockService$lockTag$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTagLockService$lockTag$1.label;
        if (i != 0) {
        }
        tagLockResult = toTagLockResult((ApiResult) obj3);
        if (tagLockResult instanceof TagLockResult.Success) {
        }
        return tagLockResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unlockTag(String str, ContinuationImpl continuationImpl) {
        RealTagLockService$unlockTag$1 realTagLockService$unlockTag$1;
        int i;
        TagLockResult tagLockResult;
        if (continuationImpl instanceof RealTagLockService$unlockTag$1) {
            realTagLockService$unlockTag$1 = (RealTagLockService$unlockTag$1) continuationImpl;
            int i2 = realTagLockService$unlockTag$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTagLockService$unlockTag$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTagLockService$unlockTag$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTagLockService$unlockTag$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = new UnlockPaymentTokenDeviceRequest(str, ByteString.EMPTY);
                    realTagLockService$unlockTag$1.L$0 = str;
                    realTagLockService$unlockTag$1.label = 1;
                    obj = this.taplyAppService.unlockPaymentTokenDevice(unlockPaymentTokenDeviceRequest, realTagLockService$unlockTag$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        TagLockResult.Success success = realTagLockService$unlockTag$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return success;
                    }
                    str = realTagLockService$unlockTag$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                tagLockResult = toTagLockResult((ApiResult) obj);
                if (tagLockResult instanceof TagLockResult.Success) {
                    realTagLockService$unlockTag$1.L$0 = null;
                    realTagLockService$unlockTag$1.L$2 = (TagLockResult.Success) tagLockResult;
                    realTagLockService$unlockTag$1.label = 2;
                    if (applyOptimisticTagLock(str, false, realTagLockService$unlockTag$1) == obj2) {
                        return obj2;
                    }
                }
                return tagLockResult;
            }
        }
        realTagLockService$unlockTag$1 = new RealTagLockService$unlockTag$1(this, continuationImpl);
        Object obj3 = realTagLockService$unlockTag$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTagLockService$unlockTag$1.label;
        if (i != 0) {
        }
        tagLockResult = toTagLockResult((ApiResult) obj3);
        if (tagLockResult instanceof TagLockResult.Success) {
        }
        return tagLockResult;
    }
}

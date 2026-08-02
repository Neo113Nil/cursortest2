package com.squareup.cash.deviceintegrity;

import android.app.Application;
import android.os.RemoteException;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.be;
import com.google.android.play.core.integrity.bw;
import com.google.android.play.core.integrity.bx;
import com.google.android.play.core.integrity.i;
import com.google.android.play.core.integrity.k;
import com.google.android.play.core.integrity.o;
import com.google.android.play.core.integrity.q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealPlayIntegrityClient implements PlayIntegrityClient {
    public final MutexImpl initializationMutex;
    public final IntegrityManager playIntegrityClient;
    public final be standardIntegrityManager;
    public bx tokenProvider;

    public RealPlayIntegrityClient(Application application) {
        IntegrityManager create = IntegrityManagerFactory.create(application);
        create.getClass();
        this.playIntegrityClient = create;
        be createStandard = IntegrityManagerFactory.createStandard(application);
        createStandard.getClass();
        this.standardIntegrityManager = createStandard;
        this.initializationMutex = new MutexImpl();
    }

    public static void handleIntegrityException(Exception exc) {
        if (exc instanceof InterruptedException) {
            throw new IntegrityCheckException(exc, IntegrityErrorType.INTEGRITY_EXCEPTION, 14, null);
        }
        if (exc instanceof TimeoutException) {
            throw new IntegrityCheckException(exc, IntegrityErrorType.TIMEOUT_EXCEPTION, 15, null);
        }
        if (!(exc instanceof ExecutionException)) {
            throw exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof IntegrityServiceException) {
            IntegrityServiceException integrityServiceException = (IntegrityServiceException) cause;
            int i = integrityServiceException.mStatus.zza;
            throw new IntegrityCheckException(integrityServiceException, IntegrityErrorType.INTEGRITY_EXCEPTION, Integer.valueOf(i), Integer.valueOf(i));
        }
        if (cause instanceof StandardIntegrityException) {
            StandardIntegrityException standardIntegrityException = (StandardIntegrityException) cause;
            int i2 = standardIntegrityException.mStatus.zza;
            throw new IntegrityCheckException(standardIntegrityException, IntegrityErrorType.STANDARD_INTEGRITY_EXCEPTION, Integer.valueOf(i2), Integer.valueOf(i2));
        }
        if (!(cause instanceof RemoteException)) {
            throw exc;
        }
        throw new IntegrityCheckException(exc, IntegrityErrorType.REMOTE_EXCEPTION, 19, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeStandardTokenProvider(ContinuationImpl continuationImpl) {
        RealPlayIntegrityClient$initializeStandardTokenProvider$1 realPlayIntegrityClient$initializeStandardTokenProvider$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof RealPlayIntegrityClient$initializeStandardTokenProvider$1) {
                realPlayIntegrityClient$initializeStandardTokenProvider$1 = (RealPlayIntegrityClient$initializeStandardTokenProvider$1) continuationImpl;
                int i2 = realPlayIntegrityClient$initializeStandardTokenProvider$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realPlayIntegrityClient$initializeStandardTokenProvider$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realPlayIntegrityClient$initializeStandardTokenProvider$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realPlayIntegrityClient$initializeStandardTokenProvider$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.tokenProvider == null) {
                            MutexImpl mutexImpl2 = this.initializationMutex;
                            realPlayIntegrityClient$initializeStandardTokenProvider$1.L$0 = mutexImpl2;
                            realPlayIntegrityClient$initializeStandardTokenProvider$1.label = 1;
                            if (mutexImpl2.lock(realPlayIntegrityClient$initializeStandardTokenProvider$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            mutexImpl = mutexImpl2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutexImpl = realPlayIntegrityClient$initializeStandardTokenProvider$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (this.tokenProvider == null) {
                        try {
                            be beVar = this.standardIntegrityManager;
                            i builder = k.builder();
                            builder.a = 92014030588L;
                            builder.c = (byte) (builder.c | 1);
                            Object await = Room.await(beVar.prepareIntegrityToken(builder.build()));
                            await.getClass();
                            this.tokenProvider = (bx) await;
                        } catch (Exception e) {
                            handleIntegrityException(e);
                            throw null;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (this.tokenProvider == null) {
            }
            return Unit.INSTANCE;
        } finally {
            mutexImpl.unlock(null);
        }
        realPlayIntegrityClient$initializeStandardTokenProvider$1 = new RealPlayIntegrityClient$initializeStandardTokenProvider$1(this, continuationImpl);
        Object obj2 = realPlayIntegrityClient$initializeStandardTokenProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPlayIntegrityClient$initializeStandardTokenProvider$1.label;
        if (i != 0) {
        }
    }

    public final String requestIntegrityToken(String str) {
        try {
            return ((IntegrityTokenResponse) Room.await(this.playIntegrityClient.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(92014030588L).build()))).token();
        } catch (Exception e) {
            handleIntegrityException(e);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:17:0x0062, B:18:0x0068, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:17:0x0062, B:18:0x0068, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestStandardIntegrityVerdict(String str, ContinuationImpl continuationImpl) {
        RealPlayIntegrityClient$requestStandardIntegrityVerdict$1 realPlayIntegrityClient$requestStandardIntegrityVerdict$1;
        int i;
        bx bxVar;
        try {
            if (continuationImpl instanceof RealPlayIntegrityClient$requestStandardIntegrityVerdict$1) {
                realPlayIntegrityClient$requestStandardIntegrityVerdict$1 = (RealPlayIntegrityClient$requestStandardIntegrityVerdict$1) continuationImpl;
                int i2 = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realPlayIntegrityClient$requestStandardIntegrityVerdict$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realPlayIntegrityClient$requestStandardIntegrityVerdict$1.L$0 = str;
                        realPlayIntegrityClient$requestStandardIntegrityVerdict$1.label = 1;
                        if (initializeStandardTokenProvider(realPlayIntegrityClient$requestStandardIntegrityVerdict$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    bxVar = this.tokenProvider;
                    if (bxVar != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tokenProvider");
                        throw null;
                    }
                    o builder = q.builder();
                    builder.setRequestHash(str);
                    return ((bw) Room.await(bxVar.request(builder.build()), 10L, TimeUnit.SECONDS)).token();
                }
            }
            if (i != 0) {
            }
            bxVar = this.tokenProvider;
            if (bxVar != null) {
            }
        } catch (Exception e) {
            handleIntegrityException(e);
            throw null;
        }
        realPlayIntegrityClient$requestStandardIntegrityVerdict$1 = new RealPlayIntegrityClient$requestStandardIntegrityVerdict$1(this, continuationImpl);
        Object obj3 = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPlayIntegrityClient$requestStandardIntegrityVerdict$1.label;
    }
}

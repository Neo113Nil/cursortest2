package com.squareup.cash.deviceintegrity;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.deviceattestation.PlayIntegrityAttestationType;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealDeviceIntegrity$attestStandard$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DeviceIntegrity$EntryPoint $entryPoint;
    public final /* synthetic */ String $requestHash;
    public final /* synthetic */ String $userAction;
    public int I$0;
    public long J$0;
    public int label;
    public final /* synthetic */ RealDeviceIntegrity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeviceIntegrity$attestStandard$2(RealDeviceIntegrity realDeviceIntegrity, String str, String str2, DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realDeviceIntegrity;
        this.$requestHash = str;
        this.$userAction = str2;
        this.$entryPoint = deviceIntegrity$EntryPoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealDeviceIntegrity$attestStandard$2(this.this$0, this.$requestHash, this.$userAction, this.$entryPoint, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealDeviceIntegrity$attestStandard$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #1 {all -> 0x0160, blocks: (B:34:0x0120, B:36:0x012e), top: B:33:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        int i2;
        RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker;
        int i3;
        Object obj2;
        int i4;
        int i5;
        int i6;
        String str;
        String str2;
        long j2;
        int i7;
        Exception exc;
        String str3;
        String simpleName;
        DeviceIntegrity$Result buildFailureResult;
        DeviceIntegrity$Result buildFailureResult2;
        RealDeviceIntegrity realDeviceIntegrity = this.this$0;
        RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrity.analyticsTracker;
        AndroidClock androidClock = realDeviceIntegrity.clock;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        String str4 = this.$requestHash;
        int i9 = 1;
        String str5 = " ms";
        String str6 = "Standard attestation took: ";
        if (i8 != 0) {
            try {
                if (i8 == 1) {
                    j = this.J$0;
                    i2 = this.I$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                        i4 = 0;
                        i5 = i2;
                    } catch (IntegrityCheckException e) {
                        e = e;
                        realDeviceIntegrityAnalyticsTracker = realDeviceIntegrityAnalyticsTracker2;
                        i3 = 0;
                        try {
                            String str7 = this.$requestHash;
                            j2 = j;
                            String str8 = str4;
                            try {
                                IntegrityErrorType integrityErrorType = e.errorType;
                                i7 = i2;
                                PlayIntegrityAttestation.AttestationType attestationType = PlayIntegrityAttestation.AttestationType.STANDARD;
                                Integer num = e.integrityCheckStatusCode;
                                String str9 = str5;
                                try {
                                    Integer num2 = e.playIntegrityErrorCode;
                                    exc = e.cause;
                                    if (exc != null) {
                                        try {
                                            str3 = str6;
                                            simpleName = exc.getClass().getSimpleName();
                                        } catch (Throwable th) {
                                            th = th;
                                            j = j2;
                                            str2 = str6;
                                            i = i3;
                                            str = str9;
                                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                                            throw th;
                                        }
                                    } else {
                                        str3 = str6;
                                        simpleName = null;
                                    }
                                    try {
                                        buildFailureResult = realDeviceIntegrity.buildFailureResult(str7, j2, integrityErrorType, i7, attestationType, num, num2, simpleName);
                                        if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
                                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j2, str3, str9), new Object[0]);
                                            return buildFailureResult;
                                        }
                                        int i10 = i7 + 1;
                                        this.I$0 = i10;
                                        this.J$0 = j2;
                                        this.label = 2;
                                        if (JobKt.delay(5000L, this) != coroutineSingletons) {
                                            j = j2;
                                            i6 = i10;
                                            String str10 = str3;
                                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str10, str9), new Object[0]);
                                            i4 = 0;
                                            str6 = str10;
                                            str4 = str8;
                                            i9 = 1;
                                            str5 = str9;
                                            realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrityAnalyticsTracker;
                                            if (i6 <= 3) {
                                            }
                                        }
                                        return coroutineSingletons;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str9;
                                        str2 = str3;
                                        i = 0;
                                        j = j2;
                                        Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str2 = str6;
                                    i = i3;
                                    str = str9;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = str5;
                                str2 = str6;
                                i = i3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str = str5;
                            str2 = str6;
                            i = i3;
                        }
                    }
                    long j3 = j;
                    try {
                    } catch (IntegrityCheckException e2) {
                        e = e2;
                        realDeviceIntegrityAnalyticsTracker = realDeviceIntegrityAnalyticsTracker2;
                        i3 = i4;
                        j = j3;
                        i2 = i5;
                        String str72 = this.$requestHash;
                        j2 = j;
                        String str82 = str4;
                        IntegrityErrorType integrityErrorType2 = e.errorType;
                        i7 = i2;
                        PlayIntegrityAttestation.AttestationType attestationType2 = PlayIntegrityAttestation.AttestationType.STANDARD;
                        Integer num3 = e.integrityCheckStatusCode;
                        String str92 = str5;
                        Integer num22 = e.playIntegrityErrorCode;
                        exc = e.cause;
                        if (exc != null) {
                        }
                        buildFailureResult = realDeviceIntegrity.buildFailureResult(str72, j2, integrityErrorType2, i7, attestationType2, num3, num22, simpleName);
                        if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i = i4;
                        str = str5;
                        str2 = str6;
                        j = j3;
                        Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                        throw th;
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    DeviceIntegrity$Result deviceIntegrity$Result = new DeviceIntegrity$Result((String) obj2, valueOf, valueOf, j3, i5, null, null);
                    str4.getClass();
                    RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestSucceeded$default(realDeviceIntegrityAnalyticsTracker2, null, str4, deviceIntegrity$Result, PlayIntegrityAttestationType.STANDARD, 1);
                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j3, str6, str5), new Object[i4]);
                    return deviceIntegrity$Result;
                }
                if (i8 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                int i11 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i6 = i11;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, "Standard attestation took: ", " ms"), new Object[0]);
                i4 = 0;
                str6 = "Standard attestation took: ";
                str4 = str4;
                i9 = 1;
                str5 = " ms";
                realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrityAnalyticsTracker2;
            } catch (Throwable th7) {
                th = th7;
                i = 0;
                str = str5;
                str2 = str6;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                throw th;
            }
        } else {
            SafeTrace.throwOnFailure(obj);
            long millis = androidClock.millis();
            str4.getClass();
            String str11 = this.$userAction;
            str11.getClass();
            DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = this.$entryPoint;
            deviceIntegrity$EntryPoint.getClass();
            i4 = 0;
            RealDeviceIntegrityAnalyticsTracker.trackAttestationStarted$default(realDeviceIntegrityAnalyticsTracker2, null, str4, deviceIntegrity$EntryPoint, str11, PlayIntegrityAttestationType.STANDARD, 1);
            i6 = 0;
            j = millis;
        }
        if (i6 <= 3) {
            IntegrityErrorType integrityErrorType3 = IntegrityErrorType.INTEGRITY_EXCEPTION;
            buildFailureResult2 = realDeviceIntegrity.buildFailureResult(str4, j, IntegrityErrorType.TOO_MANY_RETRIES, 3, PlayIntegrityAttestation.AttestationType.STANDARD, 13, 0, null);
            return buildFailureResult2;
        }
        try {
        } catch (IntegrityCheckException e3) {
            e = e3;
            realDeviceIntegrityAnalyticsTracker = realDeviceIntegrityAnalyticsTracker2;
            i3 = i4;
            i2 = i6;
            String str722 = this.$requestHash;
            j2 = j;
            String str822 = str4;
            IntegrityErrorType integrityErrorType22 = e.errorType;
            i7 = i2;
            PlayIntegrityAttestation.AttestationType attestationType22 = PlayIntegrityAttestation.AttestationType.STANDARD;
            Integer num32 = e.integrityCheckStatusCode;
            String str922 = str5;
            Integer num222 = e.playIntegrityErrorCode;
            exc = e.cause;
            if (exc != null) {
            }
            buildFailureResult = realDeviceIntegrity.buildFailureResult(str722, j2, integrityErrorType22, i7, attestationType22, num32, num222, simpleName);
            if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
            }
        } catch (Throwable th8) {
            th = th8;
            i = i4;
            str = str5;
            str2 = str6;
            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
            throw th;
        }
        PlayIntegrityClient playIntegrityClient = realDeviceIntegrity.playIntegrityClient;
        this.I$0 = i6;
        this.J$0 = j;
        this.label = i9;
        obj2 = ((RealPlayIntegrityClient) playIntegrityClient).requestStandardIntegrityVerdict(str4, this);
        if (obj2 != coroutineSingletons) {
            i5 = i6;
            long j32 = j;
            Integer valueOf2 = Integer.valueOf(i4);
            DeviceIntegrity$Result deviceIntegrity$Result2 = new DeviceIntegrity$Result((String) obj2, valueOf2, valueOf2, j32, i5, null, null);
            str4.getClass();
            RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestSucceeded$default(realDeviceIntegrityAnalyticsTracker2, null, str4, deviceIntegrity$Result2, PlayIntegrityAttestationType.STANDARD, 1);
            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j32, str6, str5), new Object[i4]);
            return deviceIntegrity$Result2;
        }
        return coroutineSingletons;
    }
}

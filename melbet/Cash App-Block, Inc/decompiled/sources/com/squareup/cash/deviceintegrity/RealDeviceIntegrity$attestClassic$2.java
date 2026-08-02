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

/* loaded from: classes.dex */
public final class RealDeviceIntegrity$attestClassic$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DeviceIntegrity$EntryPoint $entryPoint;
    public final /* synthetic */ String $playIntegrityNonce;
    public int I$0;
    public long J$0;
    public int label;
    public final /* synthetic */ RealDeviceIntegrity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeviceIntegrity$attestClassic$2(RealDeviceIntegrity realDeviceIntegrity, String str, DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realDeviceIntegrity;
        this.$playIntegrityNonce = str;
        this.$entryPoint = deviceIntegrity$EntryPoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealDeviceIntegrity$attestClassic$2(this.this$0, this.$playIntegrityNonce, this.$entryPoint, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealDeviceIntegrity$attestClassic$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[Catch: all -> 0x015d, TRY_LEAVE, TryCatch #8 {all -> 0x015d, blocks: (B:34:0x011d, B:36:0x012b), top: B:33:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        long j;
        int i2;
        RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker;
        int i3;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        String str3;
        int i8;
        String str4;
        Exception exc;
        String str5;
        String simpleName;
        DeviceIntegrity$Result buildFailureResult;
        DeviceIntegrity$Result buildFailureResult2;
        RealDeviceIntegrity realDeviceIntegrity = this.this$0;
        RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrity.analyticsTracker;
        AndroidClock androidClock = realDeviceIntegrity.clock;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        String str6 = this.$playIntegrityNonce;
        int i10 = 1;
        String str7 = " ms";
        String str8 = "Attestation took: ";
        if (i9 != 0) {
            try {
                if (i9 == 1) {
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
                            String str9 = this.$playIntegrityNonce;
                            j2 = j;
                            str3 = str6;
                            try {
                                IntegrityErrorType integrityErrorType = e.errorType;
                                i8 = i2;
                                PlayIntegrityAttestation.AttestationType attestationType = PlayIntegrityAttestation.AttestationType.CLASSIC;
                                Integer num = e.integrityCheckStatusCode;
                                str4 = str7;
                                try {
                                    Integer num2 = e.playIntegrityErrorCode;
                                    exc = e.cause;
                                    if (exc != null) {
                                        try {
                                            str5 = str8;
                                            simpleName = exc.getClass().getSimpleName();
                                        } catch (Throwable th) {
                                            th = th;
                                            j = j2;
                                            str2 = str8;
                                            i = i3;
                                            str = str4;
                                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                                            throw th;
                                        }
                                    } else {
                                        str5 = str8;
                                        simpleName = null;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str2 = str8;
                                    i = i3;
                                    str = str4;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str = str7;
                                str2 = str8;
                                i = i3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = str7;
                            str2 = str8;
                            i = i3;
                        }
                        try {
                            buildFailureResult = realDeviceIntegrity.buildFailureResult(str9, j2, integrityErrorType, i8, attestationType, num, num2, simpleName);
                            if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
                                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j2, str5, str4), new Object[0]);
                                return buildFailureResult;
                            }
                            int i11 = i8 + 1;
                            this.I$0 = i11;
                            this.J$0 = j2;
                            this.label = 2;
                            if (JobKt.delay(5000L, this) != coroutineSingletons) {
                                j = j2;
                                i6 = i11;
                                String str10 = str5;
                                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str10, str4), new Object[0]);
                                str8 = str10;
                                i4 = 0;
                                str6 = str3;
                                realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrityAnalyticsTracker;
                                i10 = 1;
                                str7 = str4;
                                if (i6 <= 3) {
                                }
                            }
                            return coroutineSingletons;
                        } catch (Throwable th5) {
                            th = th5;
                            str = str4;
                            str2 = str5;
                            i = 0;
                            j = j2;
                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                            throw th;
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
                        String str92 = this.$playIntegrityNonce;
                        j2 = j;
                        str3 = str6;
                        IntegrityErrorType integrityErrorType2 = e.errorType;
                        i8 = i2;
                        PlayIntegrityAttestation.AttestationType attestationType2 = PlayIntegrityAttestation.AttestationType.CLASSIC;
                        Integer num3 = e.integrityCheckStatusCode;
                        str4 = str7;
                        Integer num22 = e.playIntegrityErrorCode;
                        exc = e.cause;
                        if (exc != null) {
                        }
                        buildFailureResult = realDeviceIntegrity.buildFailureResult(str92, j2, integrityErrorType2, i8, attestationType2, num3, num22, simpleName);
                        if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i7 = i4;
                        str = str7;
                        str2 = str8;
                        j = j3;
                        i = i7;
                        Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                        throw th;
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    DeviceIntegrity$Result deviceIntegrity$Result = new DeviceIntegrity$Result((String) obj2, valueOf, valueOf, j3, i5, null, null);
                    str6.getClass();
                    RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestSucceeded$default(realDeviceIntegrityAnalyticsTracker2, str6, null, deviceIntegrity$Result, PlayIntegrityAttestationType.CLASSIC, 2);
                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j3, str8, str7), new Object[i4]);
                    return deviceIntegrity$Result;
                }
                if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                int i12 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i6 = i12;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, "Attestation took: ", " ms"), new Object[0]);
                str8 = "Attestation took: ";
                i4 = 0;
                str6 = str6;
                realDeviceIntegrityAnalyticsTracker2 = realDeviceIntegrityAnalyticsTracker2;
                i10 = 1;
                str7 = " ms";
            } catch (Throwable th7) {
                th = th7;
                str = " ms";
                str2 = "Attestation took: ";
                i = 0;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
                throw th;
            }
        } else {
            SafeTrace.throwOnFailure(obj);
            long millis = androidClock.millis();
            str6.getClass();
            DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = this.$entryPoint;
            deviceIntegrity$EntryPoint.getClass();
            i4 = 0;
            RealDeviceIntegrityAnalyticsTracker.trackAttestationStarted$default(realDeviceIntegrityAnalyticsTracker2, str6, null, deviceIntegrity$EntryPoint, null, PlayIntegrityAttestationType.CLASSIC, 10);
            i6 = 0;
            j = millis;
        }
        if (i6 <= 3) {
            IntegrityErrorType integrityErrorType3 = IntegrityErrorType.INTEGRITY_EXCEPTION;
            buildFailureResult2 = realDeviceIntegrity.buildFailureResult(str6, j, IntegrityErrorType.TOO_MANY_RETRIES, 3, PlayIntegrityAttestation.AttestationType.CLASSIC, 13, 0, null);
            return buildFailureResult2;
        }
        try {
        } catch (IntegrityCheckException e3) {
            e = e3;
            realDeviceIntegrityAnalyticsTracker = realDeviceIntegrityAnalyticsTracker2;
            i3 = i4;
            i2 = i6;
            String str922 = this.$playIntegrityNonce;
            j2 = j;
            str3 = str6;
            IntegrityErrorType integrityErrorType22 = e.errorType;
            i8 = i2;
            PlayIntegrityAttestation.AttestationType attestationType22 = PlayIntegrityAttestation.AttestationType.CLASSIC;
            Integer num32 = e.integrityCheckStatusCode;
            str4 = str7;
            Integer num222 = e.playIntegrityErrorCode;
            exc = e.cause;
            if (exc != null) {
            }
            buildFailureResult = realDeviceIntegrity.buildFailureResult(str922, j2, integrityErrorType22, i8, attestationType22, num32, num222, simpleName);
            if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, buildFailureResult.playIntegrityErrorCode, buildFailureResult.errorType)) {
            }
        } catch (Throwable th8) {
            th = th8;
            i7 = i4;
            str = str7;
            str2 = str8;
            i = i7;
            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j, str2, str), new Object[i]);
            throw th;
        }
        PlayIntegrityClient playIntegrityClient = realDeviceIntegrity.playIntegrityClient;
        this.I$0 = i6;
        this.J$0 = j;
        this.label = i10;
        obj2 = ((RealPlayIntegrityClient) playIntegrityClient).requestIntegrityToken(str6);
        if (obj2 != coroutineSingletons) {
            i5 = i6;
            long j32 = j;
            Integer valueOf2 = Integer.valueOf(i4);
            DeviceIntegrity$Result deviceIntegrity$Result2 = new DeviceIntegrity$Result((String) obj2, valueOf2, valueOf2, j32, i5, null, null);
            str6.getClass();
            RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestSucceeded$default(realDeviceIntegrityAnalyticsTracker2, str6, null, deviceIntegrity$Result2, PlayIntegrityAttestationType.CLASSIC, 2);
            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(androidClock.millis() - j32, str8, str7), new Object[i4]);
            return deviceIntegrity$Result2;
        }
        return coroutineSingletons;
    }
}

package com.squareup.cash.deviceintegrity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db2.Instrument$Adapter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealDeviceIntegrityAttester {
    public final RealDeviceIntegrity deviceIntegrity;
    public final Instrument$Adapter deviceIntegrityBackend;

    public RealDeviceIntegrityAttester(RealDeviceIntegrity realDeviceIntegrity, Instrument$Adapter instrument$Adapter) {
        this.deviceIntegrity = realDeviceIntegrity;
        this.deviceIntegrityBackend = instrument$Adapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attestClassicRequest(String str, DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint, ContinuationImpl continuationImpl) {
        RealDeviceIntegrityAttester$attestClassicRequest$1 realDeviceIntegrityAttester$attestClassicRequest$1;
        int i;
        if (continuationImpl instanceof RealDeviceIntegrityAttester$attestClassicRequest$1) {
            realDeviceIntegrityAttester$attestClassicRequest$1 = (RealDeviceIntegrityAttester$attestClassicRequest$1) continuationImpl;
            int i2 = realDeviceIntegrityAttester$attestClassicRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceIntegrityAttester$attestClassicRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceIntegrityAttester$attestClassicRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceIntegrityAttester$attestClassicRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realDeviceIntegrityAttester$attestClassicRequest$1.L$0 = str;
                    realDeviceIntegrityAttester$attestClassicRequest$1.label = 1;
                    RealDeviceIntegrity realDeviceIntegrity = this.deviceIntegrity;
                    obj = JobKt.withContext(realDeviceIntegrity.ioContext, new RealDeviceIntegrity$attestClassic$2(realDeviceIntegrity, str, deviceIntegrity$EntryPoint, null), realDeviceIntegrityAttester$attestClassicRequest$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realDeviceIntegrityAttester$attestClassicRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                realDeviceIntegrityAttester$attestClassicRequest$1.L$0 = null;
                realDeviceIntegrityAttester$attestClassicRequest$1.label = 2;
                Object validateClassicAttestation = this.deviceIntegrityBackend.validateClassicAttestation(str, (DeviceIntegrity$Result) obj, realDeviceIntegrityAttester$attestClassicRequest$1);
                return validateClassicAttestation != coroutineSingletons ? coroutineSingletons : validateClassicAttestation;
            }
        }
        realDeviceIntegrityAttester$attestClassicRequest$1 = new RealDeviceIntegrityAttester$attestClassicRequest$1(this, continuationImpl);
        Object obj2 = realDeviceIntegrityAttester$attestClassicRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceIntegrityAttester$attestClassicRequest$1.label;
        if (i != 0) {
        }
        realDeviceIntegrityAttester$attestClassicRequest$1.L$0 = null;
        realDeviceIntegrityAttester$attestClassicRequest$1.label = 2;
        Object validateClassicAttestation2 = this.deviceIntegrityBackend.validateClassicAttestation(str, (DeviceIntegrity$Result) obj2, realDeviceIntegrityAttester$attestClassicRequest$1);
        if (validateClassicAttestation2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r0 == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attestStandardRequest(String str, String str2, DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint, ContinuationImpl continuationImpl) {
        RealDeviceIntegrityAttester$attestStandardRequest$1 realDeviceIntegrityAttester$attestStandardRequest$1;
        int i;
        if (continuationImpl instanceof RealDeviceIntegrityAttester$attestStandardRequest$1) {
            realDeviceIntegrityAttester$attestStandardRequest$1 = (RealDeviceIntegrityAttester$attestStandardRequest$1) continuationImpl;
            int i2 = realDeviceIntegrityAttester$attestStandardRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceIntegrityAttester$attestStandardRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceIntegrityAttester$attestStandardRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceIntegrityAttester$attestStandardRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realDeviceIntegrityAttester$attestStandardRequest$1.L$0 = str;
                    realDeviceIntegrityAttester$attestStandardRequest$1.label = 1;
                    RealDeviceIntegrity realDeviceIntegrity = this.deviceIntegrity;
                    obj = JobKt.withContext(realDeviceIntegrity.ioContext, new RealDeviceIntegrity$attestStandard$2(realDeviceIntegrity, str, str2, deviceIntegrity$EntryPoint, null), realDeviceIntegrityAttester$attestStandardRequest$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realDeviceIntegrityAttester$attestStandardRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                realDeviceIntegrityAttester$attestStandardRequest$1.L$0 = null;
                realDeviceIntegrityAttester$attestStandardRequest$1.label = 2;
                Object validateStandardAttestation = this.deviceIntegrityBackend.validateStandardAttestation(str, (DeviceIntegrity$Result) obj, realDeviceIntegrityAttester$attestStandardRequest$1);
                return validateStandardAttestation != coroutineSingletons ? coroutineSingletons : validateStandardAttestation;
            }
        }
        realDeviceIntegrityAttester$attestStandardRequest$1 = new RealDeviceIntegrityAttester$attestStandardRequest$1(this, continuationImpl);
        Object obj2 = realDeviceIntegrityAttester$attestStandardRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceIntegrityAttester$attestStandardRequest$1.label;
        if (i != 0) {
        }
        realDeviceIntegrityAttester$attestStandardRequest$1.L$0 = null;
        realDeviceIntegrityAttester$attestStandardRequest$1.label = 2;
        Object validateStandardAttestation2 = this.deviceIntegrityBackend.validateStandardAttestation(str, (DeviceIntegrity$Result) obj2, realDeviceIntegrityAttester$attestStandardRequest$1);
        if (validateStandardAttestation2 != coroutineSingletons2) {
        }
    }
}

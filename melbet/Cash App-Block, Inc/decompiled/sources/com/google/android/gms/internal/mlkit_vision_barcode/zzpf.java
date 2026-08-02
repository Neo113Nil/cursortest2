package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.glance.layout.BoxKt;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import androidx.media3.extractor.VorbisBitArray;
import app.cash.api.ApiResult;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessActionPhoneVerificationAttempt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Expired;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$FailedPin;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Invalid;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Pending;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Rejected;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Unknown;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationAttemptState$Verified;
import com.squareup.cash.support.backend.api.PhoneVerificationService$PhoneVerificationResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public abstract class zzpf {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayAppletHome.deepLinkSpecs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.media3.exoplayer.video.spherical.Projection$Mesh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList parseMshp(ParsableByteArray parsableByteArray) {
        char c;
        ArrayList arrayList;
        boolean z;
        int i;
        ArrayList arrayList2;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        ArrayList arrayList3 = null;
        if (parsableByteArray2.readUnsignedByte() == 0) {
            char c2 = 7;
            parsableByteArray2.skipBytes(7);
            int readInt = parsableByteArray2.readInt();
            boolean z2 = true;
            if (readInt == 1684433976) {
                ParsableByteArray parsableByteArray3 = new ParsableByteArray();
                Inflater inflater = new Inflater(true);
                try {
                    if (!Util.inflate(parsableByteArray2, parsableByteArray3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    parsableByteArray2 = parsableByteArray3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int i2 = parsableByteArray2.position;
            int i3 = parsableByteArray2.limit;
            while (i2 < i3) {
                int readInt2 = parsableByteArray2.readInt() + i2;
                if (readInt2 > i2 && readInt2 <= i3) {
                    if (parsableByteArray2.readInt() == 1835365224) {
                        int readInt3 = parsableByteArray2.readInt();
                        if (readInt3 <= 10000) {
                            float[] fArr = new float[readInt3];
                            for (int i4 = 0; i4 < readInt3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(parsableByteArray2.readInt());
                            }
                            int readInt4 = parsableByteArray2.readInt();
                            if (readInt4 <= 32000) {
                                double log = Math.log(2.0d);
                                c = c2;
                                ArrayList arrayList5 = arrayList3;
                                int ceil = (int) Math.ceil(Math.log(readInt3 * 2.0d) / log);
                                z = z2;
                                byte[] bArr = parsableByteArray2.data;
                                VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, bArr.length);
                                vorbisBitArray.setPosition(parsableByteArray2.position * 8);
                                float[] fArr2 = new float[readInt4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                arrayList = arrayList5;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < readInt4) {
                                        int i8 = 0;
                                        while (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int readBits = vorbisBitArray.readBits(ceil);
                                            int i10 = ((readBits >> 1) ^ (-(readBits & 1))) + i9;
                                            if (i10 >= readInt3 || i10 < 0) {
                                                break;
                                            }
                                            fArr2[i7] = fArr[i10];
                                            iArr[i8] = i10;
                                            i8++;
                                            i7++;
                                            i5 = 5;
                                        }
                                        i6++;
                                        i5 = 5;
                                    } else {
                                        vorbisBitArray.setPosition((vorbisBitArray.getPosition() + 7) & (-8));
                                        int i11 = 32;
                                        int readBits2 = vorbisBitArray.readBits(32);
                                        TimedValueQueue[] timedValueQueueArr = new TimedValueQueue[readBits2];
                                        int i12 = 0;
                                        while (i12 < readBits2) {
                                            int readBits3 = vorbisBitArray.readBits(8);
                                            int readBits4 = vorbisBitArray.readBits(8);
                                            int readBits5 = vorbisBitArray.readBits(i11);
                                            if (readBits5 <= 128000) {
                                                int i13 = readBits2;
                                                float[] fArr3 = fArr2;
                                                int ceil2 = (int) Math.ceil(Math.log(readInt4 * 2.0d) / log);
                                                float[] fArr4 = new float[readBits5 * 3];
                                                float[] fArr5 = new float[readBits5 * 2];
                                                i = i3;
                                                int i14 = 0;
                                                int i15 = 0;
                                                while (i14 < readBits5) {
                                                    int readBits6 = vorbisBitArray.readBits(ceil2);
                                                    VorbisBitArray vorbisBitArray2 = vorbisBitArray;
                                                    int i16 = ((readBits6 >> 1) ^ (-(readBits6 & 1))) + i15;
                                                    if (i16 >= 0 && i16 < readInt4) {
                                                        int i17 = i14 * 3;
                                                        int i18 = i16 * 5;
                                                        fArr4[i17] = fArr3[i18];
                                                        fArr4[i17 + 1] = fArr3[i18 + 1];
                                                        fArr4[i17 + 2] = fArr3[i18 + 2];
                                                        int i19 = i14 * 2;
                                                        fArr5[i19] = fArr3[i18 + 3];
                                                        fArr5[i19 + 1] = fArr3[i18 + 4];
                                                        i14++;
                                                        i15 = i16;
                                                        vorbisBitArray = vorbisBitArray2;
                                                    }
                                                }
                                                timedValueQueueArr[i12] = new TimedValueQueue(readBits3, readBits4, fArr4, fArr5);
                                                i12++;
                                                readBits2 = i13;
                                                fArr2 = fArr3;
                                                i3 = i;
                                                vorbisBitArray = vorbisBitArray;
                                                i11 = 32;
                                            }
                                        }
                                        i = i3;
                                        arrayList2 = new Projection.Mesh(timedValueQueueArr);
                                    }
                                }
                                i = i3;
                                arrayList2 = arrayList;
                                if (arrayList2 != null) {
                                    return arrayList;
                                }
                                arrayList4.add(arrayList2);
                            }
                        }
                        c = c2;
                        ArrayList arrayList6 = arrayList3;
                        arrayList = arrayList6;
                        z = z2;
                        i = i3;
                        arrayList2 = arrayList6;
                        if (arrayList2 != null) {
                        }
                    } else {
                        c = c2;
                        arrayList = arrayList3;
                        z = z2;
                        i = i3;
                    }
                    parsableByteArray2.setPosition(readInt2);
                    i2 = readInt2;
                    c2 = c;
                    z2 = z;
                    arrayList3 = arrayList;
                    i3 = i;
                }
            }
            return arrayList4;
        }
        return arrayList3;
    }

    public static final void trackRejectPhoneVerification(Analytics analytics, String str, String str2, BoxKt boxKt, PhoneVerificationService$PhoneVerificationResult.Failure failure) {
        CustomerSupportAccessActionPhoneVerificationAttempt.Status status;
        str.getClass();
        str2.getClass();
        ApiResult.Failure failure2 = failure != null ? failure.failureType : null;
        CustomerSupportAccessActionPhoneVerificationAttempt.ErrorType errorType = failure2 instanceof ApiResult.Failure.HttpFailure ? CustomerSupportAccessActionPhoneVerificationAttempt.ErrorType.SERVER : failure2 instanceof ApiResult.Failure.NetworkFailure ? CustomerSupportAccessActionPhoneVerificationAttempt.ErrorType.NETWORK : null;
        CustomerSupportAccessActionPhoneVerificationAttempt.Action action = CustomerSupportAccessActionPhoneVerificationAttempt.Action.REJECT;
        if (boxKt == null) {
            status = null;
        } else if (boxKt instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending) {
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.PENDING;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Rejected.INSTANCE)) {
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.REJECTED;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Verified.INSTANCE)) {
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.VERIFIED;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Expired.INSTANCE)) {
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.EXPIRED;
        } else if (boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$FailedPin.INSTANCE)) {
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.FAILED_PIN;
        } else {
            if (!boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Invalid.INSTANCE) && !boxKt.equals(PhoneVerificationService$PhoneVerificationAttemptState$Unknown.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            status = CustomerSupportAccessActionPhoneVerificationAttempt.Status.INVALID;
        }
        analytics.track(new CustomerSupportAccessActionPhoneVerificationAttempt(str, str2, status, errorType), null);
    }
}

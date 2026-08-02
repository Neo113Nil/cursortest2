package com.squareup.cash.multiplatform.bitcoin.parsers.encoding;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.AddressFormatException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Base58 {
    public static final int[] INDEXES;
    public static final Base58 INSTANCE = new Base58();
    public static final char[] ALPHABET = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    static {
        int[] iArr = new int[128];
        INDEXES = iArr;
        Arrays.fill(iArr, 0, 128, -1);
        for (int i = 0; i < 58; i++) {
            INDEXES[ALPHABET[i]] = i;
        }
    }

    public static Object decode(String str) {
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            int i2 = charAt < 128 ? INDEXES[charAt] : -1;
            if (i2 < 0) {
                throw new AddressFormatException.InvalidCharacter(charAt, i);
            }
            bArr[i] = (byte) i2;
        }
        int i3 = 0;
        while (i3 < length && bArr[i3] == 0) {
            i3++;
        }
        int length3 = str.length();
        byte[] bArr2 = new byte[length3];
        int i4 = length3;
        int i5 = i3;
        while (i5 < length) {
            i4--;
            int i6 = 0;
            for (int i7 = i5; i7 < length; i7++) {
                int i8 = (i6 * 58) + (bArr[i7] & 255);
                bArr[i7] = (byte) (i8 / 256);
                i6 = i8 % 256;
            }
            bArr2[i4] = (byte) i6;
            if (bArr[i5] == 0) {
                i5++;
            }
        }
        while (i4 < length3 && bArr2[i4] == 0) {
            i4++;
        }
        return ArraysKt___ArraysJvmKt.copyOfRange(bArr2, i4 - i3, length3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.squareup.cash.multiplatform.bitcoin.parsers.encoding.Base58] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable decodeChecked(String str, ContinuationImpl continuationImpl) {
        Base58$decodeChecked$1 base58$decodeChecked$1;
        int i;
        byte[] bArr;
        byte[] bArr2;
        ?? r9;
        if (continuationImpl instanceof Base58$decodeChecked$1) {
            base58$decodeChecked$1 = (Base58$decodeChecked$1) continuationImpl;
            int i2 = base58$decodeChecked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                base58$decodeChecked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = base58$decodeChecked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = base58$decodeChecked$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    base58$decodeChecked$1.label = 1;
                    obj = decode(str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bArr2 = base58$decodeChecked$1.L$3;
                        byte[] bArr3 = base58$decodeChecked$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        r9 = bArr3;
                        if (Arrays.equals(bArr2, ArraysKt___ArraysJvmKt.copyOfRange((byte[]) obj, 0, 4))) {
                            throw new AddressFormatException.InvalidChecksum();
                        }
                        return r9;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                bArr = (byte[]) obj;
                if (bArr.length >= 4) {
                    throw new AddressFormatException.InvalidDataLength(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bArr.length, "Input too short: "));
                }
                byte[] copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, bArr.length - 4);
                byte[] copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(bArr, bArr.length - 4, bArr.length);
                base58$decodeChecked$1.L$2 = copyOfRange;
                base58$decodeChecked$1.L$3 = copyOfRange2;
                base58$decodeChecked$1.label = 2;
                Object hashTwice = hashTwice(copyOfRange, base58$decodeChecked$1);
                if (hashTwice != coroutineSingletons) {
                    obj = hashTwice;
                    bArr2 = copyOfRange2;
                    r9 = copyOfRange;
                    if (Arrays.equals(bArr2, ArraysKt___ArraysJvmKt.copyOfRange((byte[]) obj, 0, 4))) {
                    }
                }
                return coroutineSingletons;
            }
        }
        base58$decodeChecked$1 = new Base58$decodeChecked$1(this, continuationImpl);
        Object obj2 = base58$decodeChecked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = base58$decodeChecked$1.label;
        if (i != 0) {
        }
        bArr = (byte[]) obj2;
        if (bArr.length >= 4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hashTwice(byte[] bArr, ContinuationImpl continuationImpl) {
        Base58$hashTwice$1 base58$hashTwice$1;
        int i;
        zzr zzrVar;
        if (continuationImpl instanceof Base58$hashTwice$1) {
            base58$hashTwice$1 = (Base58$hashTwice$1) continuationImpl;
            int i2 = base58$hashTwice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                base58$hashTwice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = base58$hashTwice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = base58$hashTwice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzr zzrVar2 = new zzr(27);
                    base58$hashTwice$1.L$2 = zzrVar2;
                    base58$hashTwice$1.label = 1;
                    Object digest = ((MessageDigest) zzrVar2.zza).digest(bArr);
                    digest.getClass();
                    if (digest != coroutineSingletons) {
                        zzrVar = zzrVar2;
                        obj = digest;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzrVar = base58$hashTwice$1.L$2;
                SafeTrace.throwOnFailure(obj);
                base58$hashTwice$1.L$2 = null;
                base58$hashTwice$1.label = 2;
                Object digest2 = ((MessageDigest) zzrVar.zza).digest((byte[]) obj);
                digest2.getClass();
                return digest2 != coroutineSingletons ? coroutineSingletons : digest2;
            }
        }
        base58$hashTwice$1 = new Base58$hashTwice$1(this, continuationImpl);
        Object obj2 = base58$hashTwice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = base58$hashTwice$1.label;
        if (i != 0) {
        }
        base58$hashTwice$1.L$2 = null;
        base58$hashTwice$1.label = 2;
        Object digest22 = ((MessageDigest) zzrVar.zza).digest((byte[]) obj2);
        digest22.getClass();
        if (digest22 != coroutineSingletons2) {
        }
    }
}

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1jSDK extends AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = {15268, 15348, 15353, 15344, 15350, 15357, 15356, 15351, 15344, 15349, 15351, 15346};
    private static int valueOf = 0;
    private static int values = 1;
    private final AFi1jSDK copy;
    private final AFd1qSDK hashCode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v2 */
    private static void a(String str, boolean z, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
        char[] cArr;
        char c2;
        ?? bytes = str;
        int i2 = $11 + 15;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bytes != 0) {
            bytes = bytes.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = AFInAppEventParameterName;
        if ((cArr2 != null ? (char) 14 : '+') != '+') {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                int i10 = $11 + 33;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr3[i9] = (char) (((long) cArr2[i9]) ^ 740144413554588574L);
                i9++;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if ((bArr != null ? '\'' : 'V') == '\'') {
            int i12 = $10 + 67;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i4];
                aFk1oSDK.getCurrencyIso4217Code = 1;
                c2 = 1;
            } else {
                cArr = new char[i4];
                aFk1oSDK.getCurrencyIso4217Code = 0;
                c2 = 0;
            }
            while (true) {
                int i13 = aFk1oSDK.getCurrencyIso4217Code;
                if (i13 >= i4) {
                    break;
                }
                if (bArr[i13] == 1) {
                    cArr[i13] = (char) (((cArr4[i13] * 2) + 1) - c2);
                } else {
                    cArr[i13] = (char) ((cArr4[i13] * 2) - c2);
                }
                c2 = cArr[i13];
                aFk1oSDK.getCurrencyIso4217Code = i13 + 1;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i15 = aFk1oSDK.getCurrencyIso4217Code;
                if (i15 >= i4) {
                    break;
                }
                cArr6[i15] = cArr4[(i4 - i15) - 1];
                aFk1oSDK.getCurrencyIso4217Code = i15 + 1;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            int i16 = $10 + 101;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            while (true) {
                int i18 = aFk1oSDK.getCurrencyIso4217Code;
                if ((i18 < i4 ? '9' : (char) 3) != '9') {
                    break;
                }
                cArr4[i18] = (char) (cArr4[i18] - iArr[2]);
                aFk1oSDK.getCurrencyIso4217Code = i18 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final void component3(AFa1oSDK aFa1oSDK) {
        try {
            Map<String, ?> mapEquals = equals();
            if (!(mapEquals == null)) {
                int i2 = values + 39;
                valueOf = i2 % 128;
                if (i2 % 2 != 0) {
                    aFa1oSDK.getRevenue(mapEquals);
                    throw null;
                }
                aFa1oSDK.getRevenue(mapEquals);
            }
            if ((!this.copy.getRevenue() ? 'Y' : '<') != '<') {
                int i3 = valueOf + 115;
                values = i3 % 128;
                int i4 = i3 % 2;
                Map<String, Object> mapComponent1 = AFf1eSDK.component1(aFa1oSDK);
                Intrinsics.checkNotNullExpressionValue(mapComponent1, "");
                mapComponent1.put("pia_disabled", Boolean.TRUE);
                int i5 = values + 33;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
        int i7 = valueOf + 45;
        values = i7 % 128;
        int i8 = i7 % 2;
    }

    private final Map<String, Object> equals() {
        AFi1gSDK mediationNetwork = this.copy.getMediationNetwork();
        if (mediationNetwork == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMonetizationNetwork));
        linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getRevenue));
        String str = mediationNetwork.AFAdRevenueData;
        if (!(str == null)) {
            int i2 = values + 125;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = mediationNetwork.getCurrencyIso4217Code;
        if (!(str2 == null)) {
            int i4 = values + 53;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            linkedHashMap2.put("error_code", str2);
        }
        linkedHashMap.put("pia", linkedHashMap2);
        int i6 = values + 35;
        valueOf = i6 % 128;
        int i7 = i6 % 2;
        return linkedHashMap;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i2, int i3, int i4) {
        ((Number) objArr[1]).intValue();
        int i5 = values + 47;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.appsflyer.internal.AFf1fSDK, com.appsflyer.internal.AFf1eSDK
    public final void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, new int[]{0, 12, 0, 4}, objArr);
        monetizationNetwork.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.getCurrencyIso4217Code(aFa1oSDK);
        component3(aFa1oSDK);
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.hashCode, null, 2, null);
        aFa1oSDK.getRevenue(aFj1jSDK.getRevenue(AFj1jSDK.getMonetizationNetwork(aFj1jSDK.getMediationNetwork(aFj1jSDK.AFAdRevenueData.getMonetizationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=")), false)));
        AFg1kSDK aFg1kSDK = ((AFf1eSDK) this).equals;
        Map<String, Object> monetizationNetwork2 = aFa1oSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        aFg1kSDK.getCurrencyIso4217Code(monetizationNetwork2, this.hashCode.getRevenue.getMediationNetwork("appsFlyerCount", 0), this.hashCode.getRevenue.getMediationNetwork("appsFlyerInAppEventCount", 0));
        int i2 = valueOf + 47;
        values = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        TimeUnit timeUnit;
        long j2;
        int i2 = valueOf + 97;
        values = i2 % 128;
        if ((i2 % 2 == 0 ? '?' : '>') != '>') {
            timeUnit = TimeUnit.MINUTES;
            j2 = 0;
        } else {
            timeUnit = TimeUnit.MINUTES;
            j2 = 1;
        }
        return timeUnit.toMillis(j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK) {
        super(aFh1fSDK, aFd1kSDK);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFh1fSDK, "");
        this.copy = aFi1jSDK;
        this.hashCode = aFd1qSDK;
        this.getRevenue.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        int i2 = values + 117;
        int i3 = i2 % 128;
        valueOf = i3;
        boolean z = (i2 % 2 != 0 ? '\t' : (char) 17) != 17;
        int i4 = i3 + 7;
        values = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 23 : (char) 5) == 5) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final void getMonetizationNetwork(int i2) {
        getMediationNetwork(new Object[]{this, Integer.valueOf(i2)}, 36511501, -36511501, i2);
    }

    public /* synthetic */ AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, (i2 & 8) != 0 ? new AFh1fSDK() : aFh1fSDK);
    }
}

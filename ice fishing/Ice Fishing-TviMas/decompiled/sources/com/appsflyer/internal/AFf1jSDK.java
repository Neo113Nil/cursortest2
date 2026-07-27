package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", "Lcom/appsflyer/internal/AFf1fSDK;", "Lcom/appsflyer/internal/AFi1jSDK;", "p0", "Lcom/appsflyer/internal/AFd1qSDK;", "p1", "Lcom/appsflyer/internal/AFd1kSDK;", "p2", "Lcom/appsflyer/internal/AFh1fSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/internal/AFh1fSDK;)V", "Lcom/appsflyer/internal/AFa1oSDK;", "", "component3", "(Lcom/appsflyer/internal/AFa1oSDK;)V", "", "getMonetizationNetwork", "()J", "", "", "", "equals", "()Ljava/util/Map;", "getCurrencyIso4217Code", "", "getMediationNetwork", "()Z", "", "(I)V", "hashCode", "Lcom/appsflyer/internal/AFd1qSDK;", "copy", "Lcom/appsflyer/internal/AFi1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AFf1jSDK extends AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = {15268, 15348, 15353, 15344, 15350, 15357, 15356, 15351, 15344, 15349, 15351, 15346};
    private static int valueOf = 0;
    private static int values = 1;

    /* renamed from: copy, reason: from kotlin metadata */
    private final AFi1jSDK getCurrencyIso4217Code;

    /* renamed from: hashCode, reason: from kotlin metadata */
    private final AFd1qSDK getMonetizationNetwork;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        ((Number) objArr[1]).intValue();
        int i4 = 2 % 2;
        int i5 = values + 47;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public /* synthetic */ AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, (i & 8) != 0 ? new AFh1fSDK() : aFh1fSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK) {
        super(aFh1fSDK, aFd1kSDK);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFh1fSDK, "");
        this.getCurrencyIso4217Code = aFi1jSDK;
        this.getMonetizationNetwork = aFd1qSDK;
        this.getRevenue.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        int i = 2 % 2;
        int i2 = values + 117;
        int i3 = i2 % 128;
        valueOf = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 7;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = valueOf + 97;
        values = i2 % 128;
        return TimeUnit.MINUTES.toMillis(i2 % 2 == 0 ? 0L : 1L);
    }

    @Override // com.appsflyer.internal.AFf1fSDK, com.appsflyer.internal.AFf1eSDK
    protected final void getCurrencyIso4217Code(AFa1oSDK p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Map<String, Object> monetizationNetwork = p0.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, new int[]{0, 12, 0, 4}, objArr);
        monetizationNetwork.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.getCurrencyIso4217Code(p0);
        component3(p0);
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMonetizationNetwork, null, 2, null);
        p0.getRevenue(aFj1jSDK.getRevenue(AFj1jSDK.getMonetizationNetwork(aFj1jSDK.getMediationNetwork(aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=")), false)));
        AFg1kSDK aFg1kSDK = ((AFf1eSDK) this).equals;
        Map<String, Object> monetizationNetwork2 = p0.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        aFg1kSDK.getCurrencyIso4217Code(monetizationNetwork2, this.getMonetizationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0), this.getMonetizationNetwork.getRevenue.getMediationNetwork("appsFlyerInAppEventCount", 0));
        int i2 = valueOf + 47;
        values = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void component3(AFa1oSDK p0) {
        int i = 2 % 2;
        try {
            Map<String, ?> equals = equals();
            if (equals != null) {
                int i2 = values + 39;
                valueOf = i2 % 128;
                if (i2 % 2 != 0) {
                    p0.getRevenue(equals);
                    throw null;
                }
                p0.getRevenue(equals);
            }
            if (!this.getCurrencyIso4217Code.getRevenue()) {
                int i3 = valueOf + 115;
                values = i3 % 128;
                int i4 = i3 % 2;
                Map<String, Object> component1 = component1(p0);
                Intrinsics.checkNotNullExpressionValue(component1, "");
                component1.put("pia_disabled", Boolean.TRUE);
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
        int i = 2 % 2;
        AFi1gSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        if (mediationNetwork == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMonetizationNetwork));
        linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getRevenue));
        if (mediationNetwork.AFAdRevenueData != null) {
            int i2 = values + 125;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap2.put("pia_token", mediationNetwork.AFAdRevenueData);
        }
        if (mediationNetwork.getCurrencyIso4217Code != null) {
            int i4 = values + 53;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            linkedHashMap2.put("error_code", mediationNetwork.getCurrencyIso4217Code);
        }
        linkedHashMap.put("pia", linkedHashMap2);
        int i6 = values + 35;
        valueOf = i6 % 128;
        int i7 = i6 % 2;
        return linkedHashMap;
    }

    private static void a(String str, boolean z, int[] iArr, Object[] objArr) {
        char[] cArr;
        char c;
        String str2 = str;
        int i = 2 % 2;
        int i2 = $11 + 15;
        $10 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr3[i9] = (char) (cArr2[i9] ^ 740144413554588574L);
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            int i12 = $10 + 67;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i4];
                aFk1oSDK.getCurrencyIso4217Code = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                aFk1oSDK.getCurrencyIso4217Code = 0;
                c = 0;
            }
            while (aFk1oSDK.getCurrencyIso4217Code < i4) {
                if (bArr2[aFk1oSDK.getCurrencyIso4217Code] == 1) {
                    cArr[aFk1oSDK.getCurrencyIso4217Code] = (char) (((cArr4[aFk1oSDK.getCurrencyIso4217Code] * 2) + 1) - c);
                } else {
                    cArr[aFk1oSDK.getCurrencyIso4217Code] = (char) ((cArr4[aFk1oSDK.getCurrencyIso4217Code] * 2) - c);
                }
                c = cArr[aFk1oSDK.getCurrencyIso4217Code];
                aFk1oSDK.getCurrencyIso4217Code++;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i13, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (aFk1oSDK.getCurrencyIso4217Code < i4) {
                cArr6[aFk1oSDK.getCurrencyIso4217Code] = cArr4[(i4 - aFk1oSDK.getCurrencyIso4217Code) - 1];
                aFk1oSDK.getCurrencyIso4217Code++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            int i14 = $10 + 101;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            while (aFk1oSDK.getCurrencyIso4217Code < i4) {
                cArr4[aFk1oSDK.getCurrencyIso4217Code] = (char) (cArr4[aFk1oSDK.getCurrencyIso4217Code] - iArr[2]);
                aFk1oSDK.getCurrencyIso4217Code++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    protected final void getMonetizationNetwork(int p0) {
        getMediationNetwork(new Object[]{this, Integer.valueOf(p0)}, 36511501, -36511501, p0);
    }
}

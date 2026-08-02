package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

/* loaded from: classes5.dex */
public class setAddStatesFromChildren implements CertificateInfo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static long get;
    private static int getWarnings;
    private final String ThreeDS2ServiceInstance;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getWarnings = 0;
        ThreeDS2Service = 1;
        get = -1301650851739122708L;
    }

    public setAddStatesFromChildren(String str) {
        this.ThreeDS2ServiceInstance = str;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 121) % 128;
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(get ^ (-2776494906517314268L), cArr, i);
        int i4 = 4;
        oncompleted.initialize = 4;
        while (true) {
            int i5 = oncompleted.initialize;
            if (i5 >= initialize.length) {
                objArr[0] = new String(initialize, i4, initialize.length - 4);
                return;
            }
            $11 = ($10 + 67) % 128;
            int i6 = i5 - 4;
            oncompleted.ThreeDS2Service = i6;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i5] ^ initialize[i5 % 4]), Long.valueOf(i6), Long.valueOf(get)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i4;
                    i3 = 0;
                } else {
                    Class cls = (Class) removeParam.initialize(49 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 27780), TextUtils.getCapsMode("", 0, 0) + 2441);
                    byte b = $$a[0];
                    byte b2 = b;
                    i2 = i4;
                    i3 = 0;
                    Object[] objArr3 = new Object[1];
                    b(b, b2, b2, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = oncompleted;
                objArr4[i3] = oncompleted;
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(66 - Color.blue(i3), (char) TextUtils.getOffsetBefore("", i3), 14236 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                i4 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3 = 3 - (s * 4);
        int i4 = b * 2;
        int i5 = 112 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += -i7;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i5 += -i7;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{0, -50, 44, -33};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getCertPrefix() {
        getWarnings = (ThreeDS2Service + 121) % 128;
        String warnings = oj.getWarnings(this.ThreeDS2ServiceInstance, 50);
        int i = ThreeDS2Service + 39;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
        return warnings;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public Date getExpiryDate() {
        int i = ThreeDS2Service + 9;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
        return null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getName() {
        ThreeDS2Service = (getWarnings + 39) % 128;
        Object[] objArr = new Object[1];
        a("뇷敡婷놹渘莆鞦", ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (getWarnings + 1) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public CertificateInfo.CertificateType getType() {
        int i = getWarnings + 29;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            CertificateInfo.CertificateType certificateType = CertificateInfo.CertificateType.CERTIFICATE;
            throw null;
        }
        CertificateInfo.CertificateType certificateType2 = CertificateInfo.CertificateType.PUBLIC_KEY;
        int i2 = getWarnings + 97;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return certificateType2;
    }
}

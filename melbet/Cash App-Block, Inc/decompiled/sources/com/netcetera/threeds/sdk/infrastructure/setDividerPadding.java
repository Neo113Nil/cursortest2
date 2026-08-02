package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setDividerPadding implements setColorFilter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ThreeDS2Service;
    private static char ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    private static char get;
    private static char getWarnings;
    private final String initialize;

    static {
        init$0();
        createTransaction = 0;
        cleanup = 1;
        ThreeDS2Service = (char) 45073;
        ThreeDS2ServiceInstance = (char) 32964;
        get = (char) 51467;
        getWarnings = (char) 26711;
    }

    public setDividerPadding(Object obj) {
        Object obj2;
        try {
            Object[] objArr = {((Class) removeParam.initialize(78 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10195), 7934 - ExpandableListView.getPackedPositionChild(0L))).getField("cleanup").get(null)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj3 = map.get(-145099091);
            if (obj3 == null) {
                Class cls = (Class) removeParam.initialize(Color.alpha(0) + 78, (char) (59652 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf("", "") + 7711);
                byte b = $$a[10];
                byte b2 = (byte) (b + 1);
                byte b3 = b;
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                obj3 = cls.getMethod((String) objArr2[0], (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 78, (char) (ExpandableListView.getPackedPositionGroup(0L) + 10195), 7935 - TextUtils.getCapsMode("", 0, 0)));
                map.put(-145099091, obj3);
            }
            if (((Boolean) ((Method) obj3).invoke(obj, objArr)).booleanValue()) {
                Object[] objArr3 = new Object[1];
                b("笲繽⭎ਔ", View.getDefaultSize(0, 0) + 4, objArr3);
                obj2 = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                b("⭎ਔ䤀䵫럺齉", 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
                obj2 = objArr4[0];
            }
            this.initialize = ((String) obj2).intern();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = (b * 3) + 105;
        int i7 = (i2 * 3) + 10;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i6 = i7;
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i5;
            i6 = (i6 + i5) - 2;
            i5 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i9 = i5 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i5 = b2;
            bArr3 = bArr4;
            i6 = (i6 + i5) - 2;
            i5 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i92 = i5 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i922 = i5 + 1;
            if (i4 == i7) {
            }
        }
    }

    private static void b(String str, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        $11 = ($10 + 55) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr3 = new char[charArray.length];
        int i2 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i3 = 2;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i4 >= charArray.length) {
                break;
            }
            char c = 3;
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = 58224;
            char c2 = 1;
            if (i5 % i3 == 0) {
                cArr4[1] = charArray[i4];
                cArr4[1] = charArray[i4 >> 1];
            } else {
                cArr4[i2] = charArray[i4];
                cArr4[1] = charArray[i4 + 1];
            }
            int i7 = i2;
            while (true) {
                char c3 = c;
                if (i7 >= 16) {
                    break;
                }
                char c4 = cArr4[c2];
                char c5 = cArr4[i2];
                char c6 = c2;
                int i8 = (c5 + i6) ^ ((c5 << 4) + ((char) (get ^ (-1730380012335540218L))));
                int i9 = c5 >>> 5;
                int i10 = i3;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[c3] = Integer.valueOf(getWarnings);
                    objArr2[i10] = Integer.valueOf(i9);
                    objArr2[c6] = Integer.valueOf(i8);
                    objArr2[i2] = Integer.valueOf(c4);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        cArr = charArray;
                        cArr2 = cArr4;
                    } else {
                        cArr = charArray;
                        cArr2 = cArr4;
                        obj = ((Class) removeParam.initialize(67 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (62396 - ExpandableListView.getPackedPositionType(0L)), 5351 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[c6] = charValue;
                    char c7 = cArr2[0];
                    int i11 = i7;
                    int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (ThreeDS2Service ^ (-1730380012335540218L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(ThreeDS2ServiceInstance);
                    objArr3[i10] = Integer.valueOf(i13);
                    objArr3[c6] = Integer.valueOf(i12);
                    objArr3[0] = Integer.valueOf(c7);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(67 - TextUtils.getOffsetAfter("", 0), (char) (62396 - ExpandableListView.getPackedPositionGroup(0L)), 5352 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr2[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i11 + 1;
                    c = c3;
                    i3 = i10;
                    charArray = cArr;
                    c2 = c6;
                    cArr4 = cArr2;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = charArray;
            int i14 = i3;
            char[] cArr6 = cArr4;
            char c8 = c2;
            int i15 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr3[i15] = cArr6[0];
            cArr3[i15 + 1] = cArr6[c8];
            Object[] objArr4 = new Object[i14];
            objArr4[c8] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(54 - TextUtils.getOffsetAfter("", 0), (char) (39910 - View.combineMeasuredStates(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7058)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            charArray = cArr5;
            cArr4 = cArr6;
            i2 = 0;
            i3 = 2;
        }
        String str2 = new String(cArr3, 0, i);
        int i16 = $10 + 19;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static void init$0() {
        $$a = new byte[]{114, 64, -72, -72, 7, -3, 13, -9, -6, 13, -1, 19, -19};
        $$b = 7;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setColorFilter
    public String ThreeDS2Service() {
        int i = cleanup;
        String str = this.initialize;
        createTransaction = (i + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return str;
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class af extends ae implements containsValue, elements {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static short[] ConfigParameters;
    private static byte[] cleanup;
    private static int createTransaction;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private static final String getWarnings;
    private static int onCompleted;
    private static int onError;
    private boolean ThreeDS2Service;
    private boolean ThreeDS2ServiceInitializationCallback;
    private setScroller ThreeDS2ServiceInstance;
    private boolean get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        onError = 0;
        onCompleted = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        c((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58), 1602585792 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) - 730175004, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 68, (byte) TextUtils.getCapsMode("", 0, 0), objArr);
        getWarnings = ((String) objArr[0]).intern();
        int i = onError + 95;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public af(Context context, jr jrVar, ai aiVar, isEmpty isempty) {
        super(context, jrVar, aiVar, isempty);
        this.ThreeDS2Service = false;
        this.ThreeDS2ServiceInitializationCallback = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.initialize(r4) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.af.onError + 95;
        com.netcetera.threeds.sdk.infrastructure.af.onCompleted = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        ThreeDS2Service(r4);
        initialize(com.netcetera.threeds.sdk.infrastructure.addSuppressed.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        ThreeDS2Service(r4);
        initialize(com.netcetera.threeds.sdk.infrastructure.addSuppressed.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.get == r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.getLocalizedMessage.get == r5) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ThreeDS2ServiceInstance(String str, getLocalizedMessage getlocalizedmessage) {
        int i = onError + 101;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            initialize();
            int i2 = 62 / 0;
        } else {
            initialize();
        }
        int i3 = onCompleted + 69;
        onError = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02f3, code lost:
    
        if (r0 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0313, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.af.ConfigParameters;
        r4.ThreeDS2ServiceInstance = r4.ThreeDS2ServiceInstance - 1;
        r4.ThreeDS2Service = (char) (r4.getWarnings + (((short) (((short) (r1[r2] ^ r17)) + r26)) ^ r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f8, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.af.cleanup;
        r4.ThreeDS2ServiceInstance = r4.ThreeDS2ServiceInstance - 1;
        r4.ThreeDS2Service = (char) (r4.getWarnings + (((byte) (((byte) (r1[r2] ^ r17)) + r26)) ^ r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f6, code lost:
    
        if (r0 != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, int i3, byte b, Object[] objArr) {
        int i4;
        long j;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getSDKVersion)};
            int i8 = 0;
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj == null) {
                Class cls2 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 63, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (Process.myTid() >> 22) + 654);
                Object[] objArr3 = new Object[1];
                f((byte) 2, (short) 0, (byte) 0, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            int i9 = intValue == -1 ? 1 : 0;
            if (i9 != 0) {
                byte[] bArr2 = cleanup;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    j = 2786809877878216728L;
                    byte[] bArr3 = new byte[length];
                    i5 = 2;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 69;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i10])};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-1684720202);
                            if (obj2 != null) {
                                i7 = i10;
                                i6 = i9;
                                method = obj2;
                                bArr = bArr2;
                            } else {
                                i7 = i10;
                                bArr = bArr2;
                                i6 = i9;
                                Class cls3 = (Class) removeParam.initialize(TextUtils.getCapsMode("", i8, i8) + 59, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 3162);
                                Object[] objArr5 = new Object[1];
                                f((byte) 0, (short) 0, (byte) 0, objArr5);
                                method = cls3.getMethod((String) objArr5[0], cls);
                                map2.put(-1684720202, method);
                            }
                            bArr3[i7] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            bArr2 = bArr;
                            i10 = i7;
                        } else {
                            int i12 = i10;
                            byte[] bArr4 = bArr2;
                            i6 = i9;
                            Object[] objArr6 = {Integer.valueOf(bArr4[i12])};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(-1684720202);
                            if (obj3 == null) {
                                Class cls4 = (Class) removeParam.initialize(60 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3162);
                                Object[] objArr7 = new Object[1];
                                f((byte) 0, (short) 0, (byte) 0, objArr7);
                                obj3 = cls4.getMethod((String) objArr7[0], cls);
                                map3.put(-1684720202, obj3);
                            }
                            bArr3[i12] = ((Byte) ((Method) obj3).invoke(null, objArr6)).byteValue();
                            i10 = i12 + 1;
                            bArr2 = bArr4;
                        }
                        i9 = i6;
                        i8 = 0;
                    }
                    bArr2 = bArr3;
                } else {
                    i5 = 2;
                    j = 2786809877878216728L;
                }
                i4 = i9;
                if (bArr2 != null) {
                    byte[] bArr5 = cleanup;
                    Object[] objArr8 = new Object[i5];
                    objArr8[1] = Integer.valueOf(createTransaction);
                    objArr8[0] = Integer.valueOf(i);
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(981393365);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 62, (char) Gravity.getAbsoluteGravity(0, 0), 654 - TextUtils.indexOf("", ""));
                        Object[] objArr9 = new Object[1];
                        f((byte) 2, (short) 0, (byte) 0, objArr9);
                        obj4 = cls5.getMethod((String) objArr9[0], cls, cls);
                        map4.put(981393365, obj4);
                    }
                    intValue = (byte) (((byte) (bArr5[((Integer) ((Method) obj4).invoke(null, objArr8)).intValue()] ^ j)) + ((int) (getSDKVersion ^ j)));
                } else {
                    intValue = (short) (((short) (ConfigParameters[i + ((int) (createTransaction ^ j))] ^ j)) + ((int) (getSDKVersion ^ j)));
                }
            } else {
                i4 = i9;
                j = 2786809877878216728L;
            }
            if (intValue > 0) {
                getsdkversion.ThreeDS2ServiceInstance = ((i + intValue) - 2) + ((int) (createTransaction ^ j)) + i4;
                Object[] objArr10 = {getsdkversion, Integer.valueOf(i2), Integer.valueOf(getSDKInfo), sb};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(-1855485602);
                if (obj5 == null) {
                    Class cls6 = (Class) removeParam.initialize(54 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.getDefaultSize(0, 0) + 13764), 2802 - (ViewConfiguration.getScrollBarSize() >> 8));
                    byte b2 = (byte) ($$h & 7);
                    byte b3 = (byte) (b2 - 1);
                    Object[] objArr11 = new Object[1];
                    f(b2, b3, b3, objArr11);
                    obj5 = cls6.getMethod((String) objArr11[0], Object.class, cls, cls, Object.class);
                    map5.put(-1855485602, obj5);
                }
                ((StringBuilder) ((Method) obj5).invoke(null, objArr10)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr6 = cleanup;
                if (bArr6 != null) {
                    int length2 = bArr6.length;
                    byte[] bArr7 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 59;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            bArr7[i13] = (byte) (bArr6[i13] | j);
                        } else {
                            bArr7[i13] = (byte) (bArr6[i13] ^ j);
                        }
                    }
                    bArr6 = bArr7;
                }
                if (bArr6 != null) {
                    $11 = ($10 + 35) % 128;
                    z = true;
                } else {
                    z = false;
                }
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    int i15 = $11 + 43;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 41 / 0;
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    getsdkversion.initialize++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        r1 = r4.ThreeDS2ServiceInstance;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r4.ThreeDS2ServiceInitializationCallback == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = r0 + 95;
        com.netcetera.threeds.sdk.infrastructure.af.onError = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        ThreeDS2ServiceInstance(r1.onCompleted(), r4.ThreeDS2ServiceInstance.ConfigParameters());
        r4.ThreeDS2Service = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        ThreeDS2ServiceInstance(r1.onCompleted(), r4.ThreeDS2ServiceInstance.ConfigParameters());
        r4.ThreeDS2Service = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
    
        if (r2 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void cleanup() {
        int i = onCompleted;
        int i2 = i + 101;
        onError = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ThreeDS2Service;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = onError + 109;
        onCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, short s, byte b2, Object[] objArr) {
        int i;
        byte[] bArr = $$g;
        int i2 = b + 102;
        int i3 = b2 * 3;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            i2 = i3;
            byte[] bArr3 = bArr;
            int i5 = 0;
            int i6 = i4;
            i2 += -i4;
            i4 = i6;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            int i7 = i4 + 1;
            i5 = i + 1;
            if (i == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i7];
            byte[] bArr4 = bArr;
            i6 = i7;
            i4 = b3;
            bArr3 = bArr4;
            i2 += -i4;
            i4 = i6;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            int i72 = i4 + 1;
            i5 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i722 = i4 + 1;
            i5 = i + 1;
            if (i == i3) {
            }
        }
    }

    public static void init$0() {
        $$g = new byte[]{82, -9, -80, -97};
        $$h = 97;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ae, com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = onError + 69;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            super.ThreeDS2Service(setscroller);
            this.ThreeDS2ServiceInstance = setscroller;
        } else {
            super.ThreeDS2Service(setscroller);
            this.ThreeDS2ServiceInstance = setscroller;
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        onError = (onCompleted + 89) % 128;
        Object[] objArr = new Object[1];
        c((short) (59 - Color.blue(0)), 1602585790 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-730175004) + (ViewConfiguration.getPressedStateDuration() >> 16), (-67) - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (byte) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        eqVar.get(((String) objArr[0]).intern(), this.ThreeDS2ServiceInitializationCallback);
        int i = onError + 45;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static ae ThreeDS2Service(Context context, jr jrVar, isEmpty isempty) {
        af afVar = new af(context, jrVar, new ai(), isempty);
        onCompleted = (onError + 109) % 128;
        return afVar;
    }

    public static void ThreeDS2ServiceInstance() {
        createTransaction = 989946713;
        getSDKVersion = -1686431653;
        getSDKInfo = -1325494647;
        cleanup = new byte[]{-54, -42, -91, -14, -70, -56, -96, -36, -45, -94, -56, -46, -35, -16, -71, -82, -64, -86, -2, -73, -95};
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.af.onCompleted = (r0 + 111) % 128;
        r2.ThreeDS2ServiceInitializationCallback = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(keys keysVar) {
        int i = onCompleted + 33;
        int i2 = i % 128;
        onError = i2;
        int i3 = i % 2;
        boolean z = this.get;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        cleanup();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings() {
        int i = onError + 63;
        onCompleted = i % 128;
        this.get = i % 2 != 0;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        onCompleted = (onError + 63) % 128;
        Object[] objArr = new Object[1];
        c((short) ('k' - AndroidCharacter.getMirror('0')), 1602585790 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) - 730175004, TextUtils.indexOf((CharSequence) "", '0', 0) - 67, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        this.ThreeDS2ServiceInitializationCallback = erVar.getWarnings(((String) objArr[0]).intern(), false).booleanValue();
        onError = (onCompleted + 59) % 128;
    }
}

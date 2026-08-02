package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class bo extends loadFromXML<LinearLayout> implements containsValue, getServices {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ThreeDS2ServiceInitializationCallback;
    private static final String ThreeDS2ServiceInstance;
    private static int cleanup;
    private static char[] createTransaction;
    private static int getSDKVersion;
    private final jq ThreeDS2Service;
    private final String get;
    private EditText getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        cleanup = 1;
        get();
        Object[] objArr = new Object[1];
        a((byte) (65 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0007\u0001\u0013\u0015\u0018\t\u0003\b\u0015\u0004\u0005\n\n\r\u0018\r\u0000\u0003\t\u0004\u0002\u0001\u000e\u0017\u000e\u0014\u0007\u0002\u0001\f", (ViewConfiguration.getTapTimeout() >> 16) + 30, objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        int i = cleanup + 75;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public bo(Context context, jq jqVar, String str) {
        super(context);
        this.ThreeDS2Service = jqVar;
        this.get = str;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        char c2;
        Object method;
        char[] cArr2;
        Object method2;
        int i3 = ($10 + 91) % 128;
        $11 = i3;
        char c3 = 2;
        if (str != null) {
            int i4 = i3 + 63;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr4 = createTransaction;
        Class cls = Integer.TYPE;
        int i5 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    char c4 = c3;
                    Object[] objArr2 = {Integer.valueOf(cArr4[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr2 = cArr3;
                        method2 = obj;
                    } else {
                        cArr2 = cArr3;
                        Class cls2 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", i5) + 94, (char) (ViewConfiguration.getTapTimeout() >> 16), 1560 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        Object[] objArr3 = new Object[1];
                        b((short) 0, 0, (byte) 0, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                    }
                    cArr5[i6] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i6++;
                    c3 = c4;
                    cArr3 = cArr2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        char[] cArr6 = cArr3;
        char c5 = c3;
        Object[] objArr4 = {Integer.valueOf(ThreeDS2ServiceInitializationCallback)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(93 - TextUtils.lastIndexOf("", '0'), (char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1558);
            Object[] objArr5 = new Object[1];
            b((short) 0, 0, (byte) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr7 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr7[i2] = (char) (cArr6[i2] - b);
            $11 = ($10 + 25) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            getparamvalue.getWarnings = 0;
            while (true) {
                int i9 = getparamvalue.getWarnings;
                if (i9 >= i2) {
                    break;
                }
                int i10 = $10;
                $11 = (i10 + 57) % 128;
                char c6 = cArr6[i9];
                getparamvalue.get = c6;
                char c7 = cArr6[i9 + 1];
                getparamvalue.initialize = c7;
                if (c6 == c7) {
                    $11 = (i10 + 111) % 128;
                    cArr7[i9] = (char) (c6 - b);
                    cArr7[i9 + 1] = (char) (c7 - b);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[c5] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = 7;
                        method = obj3;
                        c2 = '\b';
                    } else {
                        c = 7;
                        c2 = '\b';
                        Class cls4 = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 48, (char) View.combineMeasuredStates(0, 0), 3220 - TextUtils.lastIndexOf("", '0', 0, 0));
                        Object[] objArr7 = new Object[1];
                        b((short) 0, 0, (byte) 1, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i11 = getparamvalue.cleanup;
                    if (intValue == i11) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[9] = Integer.valueOf(charValue);
                        objArr8[c2] = getparamvalue;
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[6] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c5] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 47, (char) (25644 - (Process.myPid() >> 22)), 11488 - TextUtils.lastIndexOf("", '0', 0, 0));
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i12 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i13 = getparamvalue.getWarnings;
                        cArr7[i13] = cArr4[intValue2];
                        cArr7[i13 + 1] = cArr4[i12];
                    } else {
                        int i14 = getparamvalue.ThreeDS2Service;
                        int i15 = getparamvalue.ThreeDS2ServiceInstance;
                        int i16 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i14 == i15) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i16, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i11, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i17 = (i15 * charValue) + m2;
                            int i18 = getparamvalue.getWarnings;
                            cArr7[i18] = cArr4[(i14 * charValue) + m];
                            cArr7[i18 + 1] = cArr4[i17];
                        } else {
                            int i19 = (i14 * charValue) + i11;
                            int i20 = getparamvalue.getWarnings;
                            cArr7[i20] = cArr4[i19];
                            cArr7[i20 + 1] = cArr4[(i15 * charValue) + i16];
                        }
                        getparamvalue.getWarnings += 2;
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        $11 = ($10 + 23) % 128;
        for (int i21 = 0; i21 < i; i21++) {
            cArr7[i21] = (char) (cArr7[i21] ^ 13722);
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 3) + 1;
        int i5 = 119 - (b * 2);
        int i6 = (s * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            int i9 = i7 + 1;
            i5 = i6 + i8;
            i6 = i9;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            int i10 = i5;
            i7 = i6;
            i6 = i10;
            int i92 = i7 + 1;
            i5 = i6 + i8;
            i6 = i92;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static bo get(Context context, jq jqVar) {
        Object[] objArr = new Object[1];
        a((byte) (107 - TextUtils.getOffsetAfter("", 0)), "\u0007\u0013\u000b\u0014\u0016\u0001\u0002\t\u0003\u0007\u0004\u0001\t\u0005\u000f\f㙡㙡\u0003\u0000\f\u0007\u0007\u0003\t\u0004\u0010\r\u0006\u0017\u0007\f\u000e\u0005\r\u0006\u0001\u0000\u0003\b㙙", 41 - TextUtils.indexOf("", "", 0, 0), objArr);
        bo boVar = new bo(context, jqVar, ((String) objArr[0]).intern());
        cleanup = (getSDKVersion + 9) % 128;
        return boVar;
    }

    public static void init$0() {
        $$a = new byte[]{121, -78, -70, -38};
        $$b = 34;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        getSDKVersion = (cleanup + 89) % 128;
        initialize();
        if (oj.initialize(setscroller.ConfigurationBuilder())) {
            getSDKVersion = (cleanup + 23) % 128;
            this.getWarnings.setContentDescription(setscroller.ConfigurationBuilder());
        }
        if (((Boolean) setContentInsetsRelative.get(new Object[]{setscroller}, 2090782263, -2090782262, (int) System.currentTimeMillis())).booleanValue()) {
            this.getWarnings.setInputType(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r4.getWarnings.setEnabled(false);
        r0 = new com.netcetera.threeds.sdk.infrastructure.bg(r4.getWarnings.getText().toString());
        r4 = com.netcetera.threeds.sdk.infrastructure.bo.cleanup + com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        com.netcetera.threeds.sdk.infrastructure.bo.getSDKVersion = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r4 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return r0;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.getServices
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public size ThreeDS2ServiceInstance() {
        int i = cleanup + 21;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        EditText editText = this.getWarnings;
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
    }

    public LinearLayout aP_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int i = es.getSDKVersion;
        linearLayout.setPadding(i, es.initialize, i, 0);
        EditText editText = new EditText(context);
        this.getWarnings = editText;
        editText.setLayoutParams((LinearLayout.LayoutParams) eu.ThreeDS2Service(new Object[0], -691514327, 691514327, (int) System.currentTimeMillis()));
        EditText editText2 = this.getWarnings;
        int i2 = es.getWarnings;
        editText2.setPadding(i2, 0, i2, 0);
        this.getWarnings.setSingleLine(true);
        this.getWarnings.setFilters(new InputFilter[]{new InputFilter.LengthFilter(45)});
        this.getWarnings.setMinHeight(es.getSDKInfo);
        this.getWarnings.setInputType(524432);
        getWarnings(this.getWarnings, this.get);
        linearLayout.addView(this.getWarnings);
        et.getWarnings(new Object[]{this.getWarnings, this.ThreeDS2Service}, -297979556, 297979556, (int) System.currentTimeMillis());
        int i3 = getSDKVersion + 91;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        String valueOf;
        Object obj;
        int i = getSDKVersion + 121;
        cleanup = i % 128;
        int i2 = i % 2;
        EditText editText = this.getWarnings;
        if (i2 == 0) {
            valueOf = String.valueOf(editText.getText());
            Object[] objArr = new Object[1];
            a((byte) (31 >>> (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1))), "\u0007\u0001\u0013\u0015\u0018\t\u0003\b\u0015\u0004\u0005\n\n\r\u0018\r\u0000\u0003\t\u0004\u0002\u0001\u000e\u0017\u000e\u0014\u0007\u0002\u0001\f", ((byte) KeyEvent.getModifierMetaStateMask()) + 111, objArr);
            obj = objArr[0];
        } else {
            valueOf = String.valueOf(editText.getText());
            Object[] objArr2 = new Object[1];
            a((byte) (65 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "\u0007\u0001\u0013\u0015\u0018\t\u0003\b\u0015\u0004\u0005\n\n\r\u0018\r\u0000\u0003\t\u0004\u0002\u0001\u000e\u0017\u000e\u0014\u0007\u0002\u0001\f", 29 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            obj = objArr2[0];
        }
        eqVar.ThreeDS2Service(((String) obj).intern(), valueOf);
    }

    public static void get() {
        createTransaction = new char[]{37907, 37935, 37919, 37903, 37908, 37945, 37934, 37917, 37925, 37913, 37915, 37891, 37911, 37929, 37909, 37912, 37890, 37906, 37896, 37939, 37914, 37910, 37937, 37898, 37902};
        ThreeDS2ServiceInitializationCallback = (char) 41445;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = getSDKVersion + 113;
        cleanup = i % 128;
        int i2 = i % 2;
        LinearLayout aP_ = aP_(context);
        if (i2 == 0) {
            int i3 = 19 / 0;
        }
        int i4 = getSDKVersion + 43;
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            return aP_;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        cleanup = (getSDKVersion + 113) % 128;
        initialize();
        Object[] objArr = new Object[1];
        a((byte) (65 - Color.argb(0, 0, 0, 0)), "\u0007\u0001\u0013\u0015\u0018\t\u0003\b\u0015\u0004\u0005\n\n\r\u0018\r\u0000\u0003\t\u0004\u0002\u0001\u000e\u0017\u000e\u0014\u0007\u0002\u0001\f", ExpandableListView.getPackedPositionType(0L) + 30, objArr);
        String initialize = erVar.initialize(((String) objArr[0]).intern(), null);
        if (oj.initialize(initialize)) {
            this.getWarnings.setText(initialize);
        }
        int i = getSDKVersion + 9;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }
}

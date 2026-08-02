package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class setTranscriptMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ setTranscriptMode[] ConfigParameters;
    private static byte[] ConfigurationBuilder;
    public static final setTranscriptMode ThreeDS2Service;
    public static final setTranscriptMode ThreeDS2ServiceInitializationCallback;
    public static final setTranscriptMode ThreeDS2ServiceInstance;
    private static int addParam;
    private static char[] apiKey;
    public static final setTranscriptMode cleanup;
    private static int configureScheme;
    public static final setTranscriptMode createTransaction;
    public static final setTranscriptMode get;
    private static int getParamValue;
    public static final setTranscriptMode getSDKInfo;
    public static final setTranscriptMode getSDKVersion;
    public static final setTranscriptMode getWarnings;
    public static final setTranscriptMode initialize;
    private static int onCompleted;
    private static short[] removeParam;
    private static char restrictedParameters;
    private static int visaSchemeConfiguration;
    final String onError;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        configureScheme = 0;
        visaSchemeConfiguration = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(17912278 - TextUtils.indexOf("", "", 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (short) KeyEvent.getDeadChar(0, 0), (-599276832) + Gravity.getAbsoluteGravity(0, 0), (-15) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 17912310, (byte) Color.green(0), (short) TextUtils.indexOf("", "", 0, 0), (-599276810) - View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) - 15, objArr2);
        getWarnings = new setTranscriptMode(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 17912278, (byte) (Process.myPid() >> 22), (short) Color.red(0), AndroidCharacter.getMirror('0') - 15633, (-15) - Color.green(0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b((byte) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 49), 38 - TextUtils.lastIndexOf("", '0'), "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#\u001e㘊㘊\u0000\u000e\u0012\u0006\u0003\u001b \u0001\u0005\f\u001b\u0019!\u000b\u0014\u001b㘅", objArr4);
        ThreeDS2Service = new setTranscriptMode(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b((byte) (Color.red(0) + 73), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u001e\u001d\u001a\u0000㘒㘒\u0001\u0005\u001b\u0003\u0012\u0003\u000f\u0006!\u000b㘨", objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b((byte) (Drawable.resolveOpacity(0, 0) + 9), Gravity.getAbsoluteGravity(0, 0) + 36, "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#\u001e㗢㗢\u0000\u000e\u0012\u0006\u0003\u0016\u0003\u001b\u0006\u0012\u000b!\b\u0003", objArr6);
        ThreeDS2ServiceInstance = new setTranscriptMode(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b((byte) (60 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), MotionEvent.axisFromString("") + 21, "\u001e\u001d\u001a\u0000㘅㘅\u0001\u001e\u0003\b\u0002\u001c\u001e\b\u0006\u0012\u000b!\b\u0003", objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b((byte) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 95), (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#\u001e㘸㘸\u0000\u000e\u0012\u0006 \u0001\n\u0003 \u0002\f\u0006\u000f\u0006!\u000b㘾", objArr8);
        get = new setTranscriptMode(intern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 104), View.MeasureSpec.getSize(0) + 9, "\u0017\f\u0002\u0003\b\u001b\u001b\b㘺", objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 17912310, (byte) ExpandableListView.getPackedPositionType(0L), (short) Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') - 15613, (ViewConfiguration.getTouchSlop() >> 8) - 15, objArr10);
        initialize = new setTranscriptMode(intern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        b((byte) (Color.argb(0, 0, 0, 0) + 94), ExpandableListView.getPackedPositionChild(0L) + 18, "\u0017\f\u0002\u0003\b\u001b\u001b\b\f\u0004\u0019\u001b㘲㘲\u0000\u001a㘬", objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(MotionEvent.axisFromString("") + 17912311, (byte) KeyEvent.keyCodeFromString(""), (short) KeyEvent.keyCodeFromString(""), (-599276722) - ExpandableListView.getPackedPositionChild(0L), (-15) - (Process.myTid() >> 22), objArr12);
        ThreeDS2ServiceInitializationCallback = new setTranscriptMode(intern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(17912295 - ExpandableListView.getPackedPositionGroup(0L), (byte) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (short) (Process.myPid() >> 22), (-599276685) - ((Process.getThreadPriority(0) + 20) >> 6), (-14) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 17912310, (byte) View.resolveSizeAndState(0, 0, 0), (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) - 599276669, (-15) - Color.blue(0), objArr14);
        cleanup = new setTranscriptMode(intern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        b((byte) (11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 18 - (Process.myTid() >> 22), "\u0002\b!\u0005\u0001\u0018\u000e\u001c \u0001\u0001\u001e\u0005\u0013\u0014\u0000\u001e\u000e", objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b((byte) (TextUtils.getOffsetBefore("", 0) + 4), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#!\u0005 \u0004\u0001\u001c\r\u0019 \u0003\u0001\u0001\u0007\u0012\u0013\b\u0002㗍", objArr16);
        createTransaction = new setTranscriptMode(intern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a(17912295 - View.MeasureSpec.getSize(0), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (short) (ViewConfiguration.getScrollBarSize() >> 8), (-599276634) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-15) - KeyEvent.keyCodeFromString(""), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b((byte) (View.MeasureSpec.getSize(0) + 40), 28 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#!\u0005 \u0004\u0001\u0011\u0012㗱", objArr18);
        getSDKInfo = new setTranscriptMode(intern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        b((byte) (89 - Color.argb(0, 0, 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, "\u0002\b\u0019\u0003\u0000\u000e\u0006\u0003\u0013!\u000f\u0006\u0005\u0017\f\u0005\u001d\u001f\u001e\f \u0011\u0000\u000e", objArr19);
        String intern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b((byte) (73 - Color.green(0)), 43 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\b\u0006\u0001\u0017\u001a\u0017\u0004#\u0010\u0007\u0015\r\u0015\u0017\u0017\u0015#\u0011#!\u0003\u001a\u0002\u0003\u000f\u0006\u0003\u0012\u001e\r\u000b!㘟㘟\u0001\u0018\u001e\u001d\u000b\u001e\u0014\b㘒", objArr20);
        getSDKVersion = new setTranscriptMode(intern10, 9, ((String) objArr20[0]).intern());
        ConfigParameters = ThreeDS2Service();
        int i = configureScheme + 103;
        visaSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private setTranscriptMode(String str, int i, String str2) {
        this.onError = str2;
    }

    private static /* synthetic */ setTranscriptMode[] ThreeDS2Service() {
        int i = visaSchemeConfiguration;
        setTranscriptMode[] settranscriptmodeArr = {getWarnings, ThreeDS2Service, ThreeDS2ServiceInstance, get, initialize, ThreeDS2ServiceInitializationCallback, cleanup, createTransaction, getSDKInfo, getSDKVersion};
        configureScheme = (i + 95) % 128;
        return settranscriptmodeArr;
    }

    public static void ThreeDS2ServiceInstance() {
        getParamValue = -1195170504;
        onCompleted = -1686431722;
        addParam = 1704310387;
        ConfigurationBuilder = new byte[]{16, -25, 30, -19, 11, -26, -20, 27, -11, 2, -22, 25, 9, -22, 20, -4, 20, 24, 22, 26, 24, 26, 3, -25, 30, -19, 11, -26, -20, 27, -11, 2, -22, 25, 9, -22, 20, -4, 20, 24, 22, 26, 24, 26, 11, -40, -25, 30, -18, 24, 18, -28, -29, 21, -19, 90, -46, -29, -30, -27, 22, -18, 21, 30, -25, 30, -19, 11, -26, -20, 27, -11, 2, -17, 29, 27, -1, 20, 24, 22, 26, 24, 26, 22, -20, 29, 24, -29, 23, -24, 17, 18, 12, -40, -25, 30, -18, 24, 18, -28, -29, 21, -19, 90, -46, -29, -30, -27, 22, -18, 21, 14, 9, -26, -17, 24, -25, 20, -4, 15, -20, 29, 24, -29, 23, -24, 17, 18, 12, -40, -25, 30, -18, 24, 18, -28, -29, 21, -19, 90, -46, -29, -30, -27, 22, -18, 21, 26, -23, 11, -11, 25, -20, 2, -17, -25, 31, -32, -23, 3, 27, -28, -21, 13, -23, 11, -11, 25, -20, 2, -17, -25, 31, -32, -23, 3, 27, -28, -21, 60, -40, -25, 30, -18, 24, 18, -28, -29, 21, -19, 90, -46, -29, -30, -27, 22, -18, 21, -30, 30, -30, -20, 3, 27, -28, -21};
        apiKey = new char[]{37925, 37935, 37951, 37950, 37933, 37918, 37937, 37915, 37927, 37934, 37919, 37908, 37929, 37898, 37949, 37911, 37938, 37942, 37944, 37896, 37907, 37939, 37897, 37943, 37945, 37930, 37941, 37931, 37932, 37909, 37926, 37940, 37928, 37948, 37972, 37947};
        restrictedParameters = (char) 41446;
    }

    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        boolean z;
        int i6;
        byte[] bArr;
        int i7;
        int i8;
        byte[] bArr2;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onCompleted)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj != null) {
                i4 = 16;
            } else {
                i4 = 16;
                Class cls2 = (Class) removeParam.initialize(62 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.MeasureSpec.getSize(0), 654 - Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr3 = new Object[1];
                c((short) 0, (byte) 0, 15, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            int i9 = intValue == -1 ? 1 : 0;
            if (i9 != 0) {
                byte[] bArr3 = ConfigurationBuilder;
                if (bArr3 != null) {
                    int length = bArr3.length;
                    i6 = 2;
                    byte[] bArr4 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 121;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object[] objArr4 = {Integer.valueOf(bArr3[i10])};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-1684720202);
                            if (obj2 != null) {
                                i8 = i10;
                                bArr = bArr3;
                                i7 = i9;
                                method = obj2;
                                bArr2 = bArr4;
                            } else {
                                i8 = i10;
                                bArr2 = bArr4;
                                bArr = bArr3;
                                i7 = i9;
                                Class cls3 = (Class) removeParam.initialize(58 - Process.getGidForName(""), (char) TextUtils.indexOf("", "", 0), 3161 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                Object[] objArr5 = new Object[1];
                                c((short) 0, (byte) 0, 17, objArr5);
                                method = cls3.getMethod((String) objArr5[0], cls);
                                map2.put(-1684720202, method);
                            }
                            bArr2[i8] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            bArr4 = bArr2;
                            i10 = i8;
                        } else {
                            int i12 = i10;
                            byte[] bArr5 = bArr4;
                            bArr = bArr3;
                            i7 = i9;
                            Object[] objArr6 = {Integer.valueOf(bArr[i12])};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(-1684720202);
                            if (obj3 == null) {
                                Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3161);
                                Object[] objArr7 = new Object[1];
                                c((short) 0, (byte) 0, 17, objArr7);
                                obj3 = cls4.getMethod((String) objArr7[0], cls);
                                map3.put(-1684720202, obj3);
                            }
                            bArr5[i12] = ((Byte) ((Method) obj3).invoke(null, objArr6)).byteValue();
                            i10 = i12 + 1;
                            bArr4 = bArr5;
                        }
                        bArr3 = bArr;
                        i9 = i7;
                    }
                    bArr3 = bArr4;
                } else {
                    i6 = 2;
                }
                i5 = i9;
                if (bArr3 != null) {
                    byte[] bArr6 = ConfigurationBuilder;
                    Object[] objArr8 = new Object[i6];
                    objArr8[1] = Integer.valueOf(getParamValue);
                    objArr8[0] = Integer.valueOf(i2);
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(981393365);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize(62 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 653);
                        Object[] objArr9 = new Object[1];
                        c((short) 0, (byte) 0, 15, objArr9);
                        obj4 = cls5.getMethod((String) objArr9[0], cls, cls);
                        map4.put(981393365, obj4);
                    }
                    intValue = (byte) (((byte) (bArr6[((Integer) ((Method) obj4).invoke(null, objArr8)).intValue()] ^ 2786809877878216728L)) + ((int) (onCompleted ^ 2786809877878216728L)));
                } else {
                    intValue = (short) (((short) (removeParam[i2 + ((int) (getParamValue ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (onCompleted ^ 2786809877878216728L)));
                }
            } else {
                i5 = i9;
            }
            if (intValue > 0) {
                $11 = ($10 + 3) % 128;
                getsdkversion.ThreeDS2ServiceInstance = ((i2 + intValue) - 2) + ((int) (getParamValue ^ 2786809877878216728L)) + i5;
                Object[] objArr10 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(addParam), sb};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(-1855485602);
                if (obj5 == null) {
                    Class cls6 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 55, (char) (13764 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 2803);
                    Object[] objArr11 = new Object[1];
                    c((short) 0, (byte) 0, i4, objArr11);
                    obj5 = cls6.getMethod((String) objArr11[0], Object.class, cls, cls, Object.class);
                    map5.put(-1855485602, obj5);
                }
                ((StringBuilder) ((Method) obj5).invoke(null, objArr10)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr7 = ConfigurationBuilder;
                if (bArr7 != null) {
                    int length2 = bArr7.length;
                    byte[] bArr8 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr8[i13] = (byte) (bArr7[i13] ^ 2786809877878216728L);
                    }
                    bArr7 = bArr8;
                }
                if (bArr7 != null) {
                    $10 = ($11 + 57) % 128;
                    z = true;
                } else {
                    z = false;
                }
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    $10 = ($11 + 33) % 128;
                    int i14 = getsdkversion.ThreeDS2ServiceInstance;
                    if (z) {
                        byte[] bArr9 = ConfigurationBuilder;
                        getsdkversion.ThreeDS2ServiceInstance = i14 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr9[i14] ^ 2786809877878216728L)) + s)) ^ b));
                    } else {
                        short[] sArr = removeParam;
                        getsdkversion.ThreeDS2ServiceInstance = i14 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[i14] ^ 2786809877878216728L)) + s)) ^ b));
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    getsdkversion.initialize++;
                }
            }
            String sb2 = sb.toString();
            $11 = ($10 + 65) % 128;
            objArr[0] = sb2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(byte b, int i, String str, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        $11 = ($10 + 59) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr = apiKey;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            $11 = ($10 + 45) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj == null) {
                        Class cls2 = (Class) removeParam.initialize(94 - ExpandableListView.getPackedPositionGroup(0L), (char) View.combineMeasuredStates(0, 0), KeyEvent.getDeadChar(0, 0) + 1559);
                        Object[] objArr3 = new Object[1];
                        c((short) 0, (byte) 0, 0, objArr3);
                        obj = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, obj);
                    }
                    cArr2[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(restrictedParameters)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        char c4 = 6;
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(94 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1558);
            Object[] objArr5 = new Object[1];
            c((short) 0, (byte) 0, 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i4 = getparamvalue.getWarnings;
                if (i4 >= i2) {
                    break;
                }
                $11 = ($10 + 19) % 128;
                char c5 = charArray[i4];
                getparamvalue.get = c5;
                char c6 = charArray[i4 + 1];
                getparamvalue.initialize = c6;
                if (c5 == c6) {
                    cArr3[i4] = (char) (c5 - b);
                    cArr3[i4 + 1] = (char) (c6 - b);
                    c = c4;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[c4] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[2] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    c = c4;
                    if (obj3 != null) {
                        c2 = '\t';
                        c3 = 7;
                    } else {
                        c2 = '\t';
                        c3 = 7;
                        Class cls4 = (Class) removeParam.initialize(48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 3220 - TextUtils.lastIndexOf("", '0', 0, 0));
                        Object[] objArr7 = new Object[1];
                        c((short) 0, (byte) 0, 2, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        Method method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                        obj3 = method;
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    int i5 = getparamvalue.cleanup;
                    if (intValue == i5) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[c2] = Integer.valueOf(charValue);
                        objArr8[8] = getparamvalue;
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[2] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(47 - View.MeasureSpec.getSize(0), (char) (25644 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11489);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i6 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i7 = getparamvalue.getWarnings;
                        cArr3[i7] = cArr[intValue2];
                        cArr3[i7 + 1] = cArr[i6];
                    } else {
                        int i8 = getparamvalue.ThreeDS2Service;
                        int i9 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i8 == i9) {
                            $11 = ($10 + 81) % 128;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i5, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i10 = (i9 * charValue) + m2;
                            int i11 = getparamvalue.getWarnings;
                            cArr3[i11] = cArr[(i8 * charValue) + m];
                            cArr3[i11 + 1] = cArr[i10];
                        } else {
                            int i12 = (i8 * charValue) + i5;
                            int i13 = (i9 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i14 = getparamvalue.getWarnings;
                            cArr3[i14] = cArr[i12];
                            cArr3[i14 + 1] = cArr[i13];
                            getparamvalue.getWarnings += 2;
                            c4 = c;
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
                c4 = c;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 1;
        int i5 = 119 - i;
        int i6 = 4 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 += i7;
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

    public static void init$0() {
        $$a = new byte[]{83, 79, -10, 64};
        $$b = 91;
    }

    public static setTranscriptMode valueOf(String str) {
        int i = visaSchemeConfiguration + 27;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            Enum.valueOf(setTranscriptMode.class, str);
            throw null;
        }
        setTranscriptMode settranscriptmode = (setTranscriptMode) Enum.valueOf(setTranscriptMode.class, str);
        int i2 = configureScheme + 73;
        visaSchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
        return settranscriptmode;
    }

    public static setTranscriptMode[] values() {
        int i = configureScheme + 29;
        visaSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            ConfigParameters.clone();
            throw null;
        }
        setTranscriptMode[] settranscriptmodeArr = (setTranscriptMode[]) ConfigParameters.clone();
        int i2 = visaSchemeConfiguration + 59;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return settranscriptmodeArr;
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class aw extends loadFromXML<WebView> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char[] get;
    private static int getSDKVersion;
    private computeIfAbsent ThreeDS2ServiceInstance;
    private final au getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        get = new char[]{37954, 37896, 37948, 37965, 37902, 37962, 37977, 37907, 37908, 37973, 37925, 37911, 37890, 37915, 37919, 37934, 37917, 37959, 37963, 37897, 37906, 37913, 37975, 37957, 37935, 37953, 37955, 37961, 37916, 37978, 37960, 37958, 37964, 37956, 37910, 37903};
        ThreeDS2Service = (char) 41446;
    }

    public aw(Context context, au auVar) {
        super(context);
        this.getWarnings = auVar;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char c;
        long j;
        int i2;
        char c2;
        char c3;
        char c4;
        char c5;
        Object method;
        int length;
        char[] cArr;
        char[] cArr2;
        Object method2;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = get;
        Class cls = Integer.TYPE;
        char c6 = 2;
        if (cArr3 != null) {
            j = 0;
            int i3 = $11 + 109;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            c = '\b';
            int i4 = 0;
            while (i4 < length) {
                char c7 = c6;
                int i5 = $10 + 15;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj != null) {
                            cArr2 = charArray;
                            method2 = obj;
                        } else {
                            Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 94, (char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 1560);
                            Object[] objArr3 = new Object[1];
                            cArr2 = charArray;
                            b(1, 0, (short) 0, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method2);
                        }
                        cArr[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = charArray;
                    Object[] objArr4 = {Integer.valueOf(cArr3[i4])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-78420608);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(93 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1559 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        Object[] objArr5 = new Object[1];
                        b(1, 0, (short) 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-78420608, obj2);
                    }
                    cArr[i4] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i4++;
                }
                c6 = c7;
                charArray = cArr2;
            }
            cArr3 = cArr;
        } else {
            c = '\b';
            j = 0;
        }
        char[] cArr4 = charArray;
        char c8 = c6;
        Object[] objArr6 = {Integer.valueOf(ThreeDS2Service)};
        Map map3 = removeParam.visaSchemeConfiguration;
        Object obj3 = map3.get(-78420608);
        if (obj3 == null) {
            Class cls4 = (Class) removeParam.initialize(94 - (ViewConfiguration.getTapTimeout() >> 16), (char) (Process.getGidForName("") + 1), 1558 - ImageFormat.getBitsPerPixel(0));
            Object[] objArr7 = new Object[1];
            b(1, 0, (short) 0, objArr7);
            obj3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-78420608, obj3);
        }
        char charValue = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr4[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i6 = getparamvalue.getWarnings;
                if (i6 >= i2) {
                    break;
                }
                char c9 = cArr4[i6];
                getparamvalue.get = c9;
                char c10 = cArr4[i6 + 1];
                getparamvalue.initialize = c10;
                if (c9 == c10) {
                    $10 = ($11 + 121) % 128;
                    cArr5[i6] = (char) (c9 - b);
                    cArr5[i6 + 1] = (char) (c10 - b);
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = getparamvalue;
                    objArr8[11] = Integer.valueOf(charValue);
                    objArr8[10] = getparamvalue;
                    objArr8[9] = getparamvalue;
                    objArr8[c] = Integer.valueOf(charValue);
                    objArr8[7] = getparamvalue;
                    objArr8[6] = getparamvalue;
                    objArr8[5] = Integer.valueOf(charValue);
                    objArr8[4] = getparamvalue;
                    objArr8[3] = getparamvalue;
                    objArr8[c8] = Integer.valueOf(charValue);
                    objArr8[1] = getparamvalue;
                    objArr8[0] = getparamvalue;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-1395483366);
                    if (obj4 != null) {
                        c2 = '\t';
                        c3 = 7;
                        c4 = 6;
                        method = obj4;
                        c5 = 4;
                    } else {
                        c2 = '\t';
                        c3 = 7;
                        c4 = 6;
                        c5 = 4;
                        Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 3221 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        Object[] objArr9 = new Object[1];
                        b(0, 0, (short) 0, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr8)).intValue();
                    int i7 = getparamvalue.cleanup;
                    if (intValue == i7) {
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = getparamvalue;
                        objArr10[c2] = Integer.valueOf(charValue);
                        objArr10[c] = getparamvalue;
                        objArr10[c3] = Integer.valueOf(charValue);
                        objArr10[c4] = Integer.valueOf(charValue);
                        objArr10[5] = getparamvalue;
                        objArr10[c5] = getparamvalue;
                        objArr10[3] = Integer.valueOf(charValue);
                        objArr10[c8] = Integer.valueOf(charValue);
                        objArr10[1] = getparamvalue;
                        objArr10[0] = getparamvalue;
                        Object obj5 = map4.get(1507360409);
                        if (obj5 == null) {
                            Class cls7 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 25643), 11488 - Process.getGidForName(""));
                            Class cls8 = Integer.TYPE;
                            obj5 = cls7.getMethod("x", Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(1507360409, obj5);
                        }
                        int intValue2 = ((Integer) ((Method) obj5).invoke(null, objArr10)).intValue();
                        int i8 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i9 = getparamvalue.getWarnings;
                        cArr5[i9] = cArr3[intValue2];
                        cArr5[i9 + 1] = cArr3[i8];
                    } else {
                        int i10 = getparamvalue.ThreeDS2Service;
                        int i11 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i10 == i11) {
                            $11 = ($10 + 119) % 128;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i7, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i12 = (i10 * charValue) + m;
                            int i13 = getparamvalue.getWarnings;
                            cArr5[i13] = cArr3[i12];
                            cArr5[i13 + 1] = cArr3[(i11 * charValue) + m2];
                        } else {
                            int i14 = (i11 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i15 = getparamvalue.getWarnings;
                            cArr5[i15] = cArr3[(i10 * charValue) + i7];
                            cArr5[i15 + 1] = cArr3[i14];
                            getparamvalue.getWarnings += 2;
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            $11 = ($10 + 125) % 128;
            cArr5[i16] = (char) (cArr5[i16] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4 = (i * 2) + 117;
        int i5 = (i2 * 2) + 4;
        int i6 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            i4 = i6;
            i3 = 0;
            i5++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        aw awVar = (aw) objArr[0];
        String str = (String) objArr[1];
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 47) % 128;
        computeIfAbsent computeifabsent = awVar.ThreeDS2ServiceInstance;
        if (computeifabsent == null) {
            return null;
        }
        computeifabsent.get(new bg(str));
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 81) % 128;
        return null;
    }

    public static /* synthetic */ void getWarnings(aw awVar, String str) {
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 69) % 128;
        get(new Object[]{awVar, str}, 516779692, -516779692, System.identityHashCode(awVar));
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 65) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{56, 17, -71, -44};
        $$b = 144;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = getSDKVersion + 27;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            initialize();
            ThreeDS2ServiceInstance(this.getWarnings.get(setscroller.addParam()));
        } else {
            initialize();
            ThreeDS2ServiceInstance(this.getWarnings.get(setscroller.addParam()));
            throw null;
        }
    }

    public final void ThreeDS2ServiceInstance(String str) {
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 69) % 128;
        WebView ThreeDS2Service2 = ThreeDS2Service();
        Object[] objArr = new Object[1];
        a((byte) (TextUtils.getOffsetBefore("", 0) + 25), "\u0002\u0010\u0010\u0000\b\u0015\u0005\n\u001f\u001c\u001b\u0017\u0013\u000e\u0007\u0019\u0010\u0002\u0017\u0005\n\"\u0012\u0004", 25 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((byte) (13 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u001b\f\u0004\u0014㖯", (ViewConfiguration.getTouchSlop() >> 8) + 5, objArr2);
        ThreeDS2Service2.loadDataWithBaseURL(null, str, intern, ((String) objArr2[0]).intern(), null);
        int i = getSDKVersion + 3;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final WebView aD_(Context context) {
        WebView webView = new WebView(context);
        Object[] objArr = new Object[1];
        a((byte) (3 - View.MeasureSpec.getSize(0)), "\n\u0018㗿㗿㗿㗿㗿", 7 - Color.blue(0), objArr);
        webView.setBackgroundColor(Color.parseColor(((String) objArr[0]).intern()));
        webView.setWebViewClient(aE_(context));
        webView.getSettings().setJavaScriptEnabled(false);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        Object[] objArr2 = new Object[1];
        a((byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10), "\u0016\u0015\u0010\u001f \u0010\n\u000e\u0010\b\u001f\u000b\b\u0016\u0005\n㘀", 16 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        getWarnings(webView, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 61) % 128;
        return webView;
    }

    public WebViewClient aE_(Context context) {
        ar arVar = (ar) ar.initialize(new Object[]{new az(this)}, -769679435, 769679435, (int) System.currentTimeMillis());
        int i = ThreeDS2ServiceInitializationCallback + 91;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return arVar;
        }
        throw null;
    }

    public au get() {
        int i = getSDKVersion;
        au auVar = this.getWarnings;
        ThreeDS2ServiceInitializationCallback = (i + 119) % 128;
        return auVar;
    }

    public final void ThreeDS2Service(computeIfAbsent computeifabsent) {
        int i = (ThreeDS2ServiceInitializationCallback + 61) % 128;
        getSDKVersion = i;
        this.ThreeDS2ServiceInstance = computeifabsent;
        int i2 = i + 99;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public computeIfAbsent ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback;
        computeIfAbsent computeifabsent = this.ThreeDS2ServiceInstance;
        int i2 = i + 41;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return computeifabsent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ WebView ThreeDS2ServiceInstance(Context context) {
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 15) % 128;
        WebView aD_ = aD_(context);
        int i = getSDKVersion + 85;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return aD_;
        }
        throw null;
    }
}

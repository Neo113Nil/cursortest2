package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFc1jSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFAdRevenueData = false;
    private static boolean areAllFieldsValid = false;
    private static int component2 = 1;
    private static int component3;
    private static int component4;
    private static char[] getMonetizationNetwork;
    private static int getRevenue;
    private final Context getCurrencyIso4217Code;
    private final Map<String, Object> getMediationNetwork;

    public static class AFa1vSDK {
        @NonNull
        public static byte[] getMonetizationNetwork(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] getRevenue(@NonNull byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getMonetizationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSize(0, 0);
        Process.getThreadPriority(0);
        ViewConfiguration.getTouchSlop();
        View.MeasureSpec.getSize(0);
        TextUtils.lastIndexOf("", '0');
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getPressedStateDuration();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getTapTimeout();
        Color.argb(0, 0, 0, 0);
        View.resolveSize(0, 0);
        int i = component2 + 1;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AFc1jSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getCurrencyIso4217Code = context;
        put(getMediationNetwork(), AFAdRevenueData());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFAdRevenueData() {
        String obj;
        int i;
        int length;
        int i2;
        String hexString;
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a(null, null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", (-16777089) - Color.rgb(0, 0, 0), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a(null, null, "\u0087\u0084\u0081\u009f\u0097\u0099\u008c\u009e\u0081\u009d\u0084\u0088\u008b\u0085\u0082", (-16777089) - Color.rgb(0, 0, 0), objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b(2 - TextUtils.indexOf((CharSequence) "", '0'), 7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 88, "\u0000�\u0005\u0001�\u0005", true, objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((-16777214) - Color.rgb(0, 0, 0), 5 - (ViewConfiguration.getFadingEdgeLength() >> 16), 109 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "￩￥￨-\u001e", false, objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(obj2);
            sb.append(obj3);
            sb.append(replaceAll);
            obj = AFj1hSDK.getCurrencyIso4217Code(sb.toString()).substring(0, 16);
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            a(null, null, "\u0087\u009e\u0094\u0081 \u008e\u0082\u0087\u0095\u008e\u008f\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u008f\u008e\u008d\u0087\u0094\u0085\u0081\u0082\u008e\u0087\u009e\u0094\u0081\u0090\u0091\u0090\u0084\u0087\u008f", View.resolveSize(0, 0) + 127, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(6 - (ViewConfiguration.getScrollBarSize() >> 8), 44 - TextUtils.getOffsetBefore("", 0), Process.getGidForName("") + 135, "\u0015\n\u0010\u000fￛ\uffc1\u0007\u0002\n\r\u0006\u0005\uffc1\b\u0006\u000f\u0006\u0013\u0002\u0015\n\u000f\b\uffc1\f\u0006\u0007\uffc1\u0017\u0002\r\u0016\u0006\uffc1\u0018\n\u0015\t\uffc1\u0006\u0019\u0004\u0006\u0011", false, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a(null, null, "¥¤¡\u0091\u0082¤\u009c\u008d¡£¢¡\u0087\u0081\u0087\u008a\u0081\u008a", TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr7);
            sb3.append(((String) objArr7[0]).intern());
            obj = sb3.toString();
        }
        String str = obj;
        try {
            Context context = this.getCurrencyIso4217Code;
            Object[] objArr8 = new Object[1];
            b(36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 128 - Color.argb(0, 0, 0, 0), "\u000b\u0019\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015", false, objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int i3 = -2700;
            if (registerReceiver != null) {
                component2 = (component3 + 51) % 128;
                Object[] objArr9 = new Object[1];
                a(null, null, "\u0087\u008b\u009e\u0084\u0081\u008b\u0087\u0089\u0086\u0087\u0084", 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                i3 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getCurrencyIso4217Code.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, Color.blue(0) + 3, 116 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "￪￬,", true, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i = 1;
                    Context context2 = this.getCurrencyIso4217Code;
                    Object[] objArr11 = new Object[1];
                    a(null, null, "\u008b\u009a\u0088\u008c\u0087\u0088", ImageFormat.getBitsPerPixel(0) + 128, objArr11);
                    int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                    StringBuilder sb4 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 137, "\u0000", false, objArr12);
                    sb4.append(((String) objArr12[0]).intern());
                    sb4.append(i3);
                    Object[] objArr13 = new Object[1];
                    a(null, null, "\u0098¦", 126 - ImageFormat.getBitsPerPixel(0), objArr13);
                    sb4.append(((String) objArr13[0]).intern());
                    sb4.append(i);
                    Object[] objArr14 = new Object[1];
                    b(1 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 2, (ViewConfiguration.getJumpTapTimeout() >> 16) + 115, "ￚ'", true, objArr14);
                    sb4.append(((String) objArr14[0]).intern());
                    sb4.append(size);
                    Object[] objArr15 = new Object[1];
                    b(TextUtils.indexOf("", "") + 2, 2 - View.MeasureSpec.getSize(0), 114 - Color.green(0), "ￛ%", false, objArr15);
                    sb4.append(((String) objArr15[0]).intern());
                    sb4.append(this.getMediationNetwork.size());
                    String obj4 = sb4.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    byte[] revenue = AFa1vSDK.getRevenue(AFa1vSDK.getMonetizationNetwork(obj4));
                    StringBuilder sb6 = new StringBuilder();
                    length = revenue.length;
                    for (i2 = 0; i2 < length; i2++) {
                        int i4 = component3 + 45;
                        component2 = i4 % 128;
                        if (i4 % 2 == 0) {
                            hexString = Integer.toHexString(revenue[i2]);
                            if (hexString.length() == 1) {
                                hexString = CommonUrlParts.Values.FALSE_INTEGER.concat(hexString);
                                sb6.append(hexString);
                            } else {
                                sb6.append(hexString);
                            }
                        } else {
                            hexString = Integer.toHexString(revenue[i2]);
                            if (hexString.length() != 1) {
                                sb6.append(hexString);
                            }
                            hexString = CommonUrlParts.Values.FALSE_INTEGER.concat(hexString);
                            sb6.append(hexString);
                        }
                    }
                    sb5.append(sb6.toString());
                    return sb5.toString();
                }
            }
            i = 0;
            Context context22 = this.getCurrencyIso4217Code;
            Object[] objArr112 = new Object[1];
            a(null, null, "\u008b\u009a\u0088\u008c\u0087\u0088", ImageFormat.getBitsPerPixel(0) + 128, objArr112);
            int size2 = ((SensorManager) context22.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
            StringBuilder sb42 = new StringBuilder();
            Object[] objArr122 = new Object[1];
            b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 137, "\u0000", false, objArr122);
            sb42.append(((String) objArr122[0]).intern());
            sb42.append(i3);
            Object[] objArr132 = new Object[1];
            a(null, null, "\u0098¦", 126 - ImageFormat.getBitsPerPixel(0), objArr132);
            sb42.append(((String) objArr132[0]).intern());
            sb42.append(i);
            Object[] objArr142 = new Object[1];
            b(1 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 2, (ViewConfiguration.getJumpTapTimeout() >> 16) + 115, "ￚ'", true, objArr142);
            sb42.append(((String) objArr142[0]).intern());
            sb42.append(size2);
            Object[] objArr152 = new Object[1];
            b(TextUtils.indexOf("", "") + 2, 2 - View.MeasureSpec.getSize(0), 114 - Color.green(0), "ￛ%", false, objArr152);
            sb42.append(((String) objArr152[0]).intern());
            sb42.append(this.getMediationNetwork.size());
            String obj42 = sb42.toString();
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str);
            byte[] revenue2 = AFa1vSDK.getRevenue(AFa1vSDK.getMonetizationNetwork(obj42));
            StringBuilder sb62 = new StringBuilder();
            length = revenue2.length;
            while (i2 < length) {
            }
            sb52.append(sb62.toString());
            return sb52.toString();
        } catch (Exception e2) {
            Object[] objArr16 = new Object[1];
            a(null, null, "\u008b\u009a\u008b\u008b\u0087\u008e\u0087\u009e\u0094\u0081\u0090\u0091\u0090\u0084\u0087\u008f", 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
            StringBuilder sb7 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            b(5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 44 - TextUtils.getTrimmedLength(""), (Process.myTid() >> 22) + 134, "\u0015\n\u0010\u000fￛ\uffc1\u0007\u0002\n\r\u0006\u0005\uffc1\b\u0006\u000f\u0006\u0013\u0002\u0015\n\u000f\b\uffc1\f\u0006\u0007\uffc1\u0017\u0002\r\u0016\u0006\uffc1\u0018\n\u0015\t\uffc1\u0006\u0019\u0004\u0006\u0011", false, objArr17);
            sb7.append(((String) objArr17[0]).intern());
            sb7.append(e2);
            AFLogger.afRDLog(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            Object[] objArr18 = new Object[1];
            b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, 124 - TextUtils.indexOf("", ""), "\u000e\u0013\u001f\f\u0018\u0011ￛ\u001cￛ\u001cￜ\u001bￜ\u001b\uffdd\uffdd", false, objArr18);
            sb8.append(((String) objArr18[0]).intern());
            return sb8.toString();
        }
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) {
        int i2;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $10 = ($11 + 47) % 128;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFk1vSDK aFk1vSDK = new AFk1vSDK();
        char[] cArr3 = getMonetizationNetwork;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr4[i3] = (char) (cArr3[i3] ^ 2910800062654154531L);
            }
            cArr3 = cArr4;
        }
        int i4 = (int) (2910800062654154531L ^ getRevenue);
        if (areAllFieldsValid) {
            $11 = ($10 + 87) % 128;
            int length2 = bArr2.length;
            aFk1vSDK.getMediationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1vSDK.AFAdRevenueData = 0;
            while (true) {
                int i5 = aFk1vSDK.AFAdRevenueData;
                int i6 = aFk1vSDK.getMediationNetwork;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 11) % 128;
                    cArr5[i5] = (char) (cArr3[bArr2[(i6 - 1) - i5] + i] - i4);
                    aFk1vSDK.AFAdRevenueData = i5 + 1;
                }
            }
        } else {
            if (AFAdRevenueData) {
                int length3 = cArr2.length;
                aFk1vSDK.getMediationNetwork = length3;
                char[] cArr6 = new char[length3];
                aFk1vSDK.AFAdRevenueData = 0;
                while (true) {
                    int i7 = aFk1vSDK.AFAdRevenueData;
                    int i8 = aFk1vSDK.getMediationNetwork;
                    if (i7 >= i8) {
                        break;
                    }
                    cArr6[i7] = (char) (cArr3[cArr2[(i8 - 1) - i7] - i] - i4);
                    aFk1vSDK.AFAdRevenueData = i7 + 1;
                }
                String str3 = new String(cArr6);
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str3;
                return;
            }
            int length4 = iArr.length;
            aFk1vSDK.getMediationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1vSDK.AFAdRevenueData = 0;
            while (true) {
                int i10 = aFk1vSDK.AFAdRevenueData;
                int i11 = aFk1vSDK.getMediationNetwork;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i12 = $10 + 119;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr7[i10] = (char) (cArr3[iArr[i11 >> i10] << i] >>> i4);
                    i2 = i10 % 0;
                } else {
                    cArr7[i10] = (char) (cArr3[iArr[(i11 - 1) - i10] - i] - i4);
                    i2 = i10 + 1;
                }
                aFk1vSDK.AFAdRevenueData = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0015, code lost:
    
        r13 = r13.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0013, code lost:
    
        if (r13 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r13 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, String str, boolean z, Object[] objArr) {
        int i4 = $11 + 47;
        $10 = i4 % 128;
        char[] cArr = str;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[i2];
        aFk1qSDK.getRevenue = 0;
        while (true) {
            int i6 = aFk1qSDK.getRevenue;
            if (i6 >= i2) {
                break;
            }
            int i7 = ($10 + 57) % 128;
            $11 = i7;
            char c = cArr2[i6];
            aFk1qSDK.getMediationNetwork = c;
            char c2 = (char) (c + i3);
            cArr3[i6] = c2;
            cArr3[i6] = (char) (c2 - ((int) (component4 ^ 6822747700087044992L)));
            aFk1qSDK.getRevenue = i6 + 1;
            $10 = (i7 + 125) % 128;
        }
        if (i > 0) {
            aFk1qSDK.getMonetizationNetwork = i;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            int i8 = aFk1qSDK.getMonetizationNetwork;
            System.arraycopy(cArr4, 0, cArr3, i2 - i8, i8);
            int i9 = aFk1qSDK.getMonetizationNetwork;
            System.arraycopy(cArr4, i9, cArr3, 0, i2 - i9);
        }
        if (z) {
            char[] cArr5 = new char[i2];
            aFk1qSDK.getRevenue = 0;
            while (true) {
                int i10 = aFk1qSDK.getRevenue;
                if (i10 >= i2) {
                    break;
                }
                int i11 = $10 + 105;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[i10] = cArr3[i2 - i10];
                } else {
                    cArr5[i10] = cArr3[(i2 - i10) - 1];
                }
                aFk1qSDK.getRevenue = i10 + 1;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    @NonNull
    private String getMediationNetwork() {
        component3 = (component2 + 53) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a(null, null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", ExpandableListView.getPackedPositionGroup(0L) + 127, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a(null, null, "\u008d\u008c\u0081\u008b\u008a", 127 - KeyEvent.getDeadChar(0, 0), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                component2 = (component3 + 123) % 128;
                Object[] objArr3 = new Object[1];
                b(2 - (ViewConfiguration.getScrollBarSize() >> 8), 8 - View.MeasureSpec.getSize(0), (Process.myTid() >> 22) + 115, "\u0002\ufff8\u0002\u0003\u0013\ufff6\u0006\ufff5", false, objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFAdRevenueData2 = AFAdRevenueData(num, obj2, sb.toString());
            int length = AFAdRevenueData2.length();
            if (length > 4) {
                component3 = (component2 + 43) % 128;
                AFAdRevenueData2.delete(4, length);
                component2 = (component3 + 75) % 128;
            } else {
                while (length < 4) {
                    int i = component2 + 5;
                    component3 = i % 128;
                    if (i % 2 != 0) {
                        length += 39;
                        AFAdRevenueData2.append('F');
                    } else {
                        length++;
                        AFAdRevenueData2.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            b(Color.blue(0) + 2, 3 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 142, "\ufffe\uffff\u0004", false, objArr4);
            AFAdRevenueData2.insert(0, ((String) objArr4[0]).intern());
            return AFAdRevenueData2.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            a(null, null, "\u0097\u0084\u0085\u0096\u008e\u0093\u0087\u0095\u008e\u0082\u0087\u0095\u008e\u008f\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u008f\u008e\u008d\u0087\u0094\u0085\u0081\u0082\u008e\u0093\u0087\u0092\u0091\u0090\u0084\u0087\u008f\u008e", 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(null, null, "\u008e\u009b\u008c\u009a\u0085\u0084\u0089\u0087\u0099\u0098\u0087\u008e\u0097\u0084\u0085\u0096\u008e\u0093\u0087\u0095\u008e\u0082\u0087\u0095\u008e\u008f\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u008f\u008e\u008d\u0087\u0094\u0085\u0081\u0082", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            a(null, null, "\u009c\u009c\u009c\u009c\u0082\u0087\u0095", 127 - Drawable.resolveOpacity(0, 0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    public static void getMonetizationNetwork() {
        getMonetizationNetwork = new char[]{34688, 34699, 34690, 34709, 34696, 34700, 34692, 34710, 34705, 34695, 34711, 34707, 34693, 34625, 34698, 34747, 34647, 34734, 34712, 34701, 34702, 34714, 34697, 34713, 34694, 34706, 34655, 34648, 34733, 34708, 34725, 34715, 34641, 34644, 34645, 34640, 34649, 34635};
        getRevenue = 581928801;
        AFAdRevenueData = true;
        areAllFieldsValid = true;
        component4 = 2144156583;
    }

    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            arrayList.add(Integer.valueOf(strArr[i].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < intValue) {
            component2 = (component3 + 1) % 128;
            Integer num = null;
            int i3 = 0;
            while (i3 < 3) {
                component3 = (component2 + 65) % 128;
                int charAt = strArr[i3].charAt(i2);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
                i3++;
                component3 = (component2 + 17) % 128;
            }
            sb.append(Integer.toHexString(num.intValue()));
            i2++;
            component2 = (component3 + 27) % 128;
        }
        return sb;
    }
}

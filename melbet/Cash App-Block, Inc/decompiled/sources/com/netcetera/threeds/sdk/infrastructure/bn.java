package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class bn implements isEmpty {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static char[] ThreeDS2ServiceInstance;
    private static int get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2Service = 0;
        get = 1;
        ThreeDS2ServiceInstance = new char[]{52953, 52880, 52864, 52901, 52943, 52953, 52912, 52898, 52898, 52953, 52951, 52948, 52943, 52929, 52919, 52880, 52864, 52901, 52917, 52915, 52937, 52913, 52872, 52871, 52901, 52947, 52947, 52941, 52900, 52901, 52917, 52915, 52937, 52913, 52872, 52871, 52901, 52929, 52962, 52983, 52937, 52904, 52877, 52927, 52936, 52979, 52953, 52912, 52898, 52898, 52953, 52951, 52948, 52917, 52912, 52913, 52917, 52900, 52901, 52947, 52947, 52939, 52940, 52917, 52912, 52913, 52917, 52900, 52985, 52904, 52919, 52950, 52941, 52945, 52946, 52911, 52919, 52979, 52901, 52871, 52872, 52913, 52937, 52915, 52917, 52901, 52864, 52880, 52919, 52929, 52943, 52948, 52951, 52953, 52898, 52898, 52912, 52953, 52943, 52901, 52864, 52880, 52919, 52929, 52901, 52871, 52872, 52913, 52937, 52915, 52917, 52901, 52902, 52943, 52947};
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0035, code lost:
    
        r0 = r0.getBytes("ISO-8859-1");
        com.netcetera.threeds.sdk.infrastructure.bn.$10 = (com.netcetera.threeds.sdk.infrastructure.bn.$11 + 31) % 128;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0033, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        char[] cArr;
        char[] cArr2;
        char c;
        char[] cArr3;
        int i2;
        int i3;
        Object method;
        String str2 = str;
        int i4 = $11 + 47;
        $10 = i4 % 128;
        byte[] bArr = str2;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
            bArr = str2;
        }
        byte[] bArr2 = bArr;
        cleanup cleanupVar = new cleanup();
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr4 = ThreeDS2ServiceInstance;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            $11 = ($10 + 77) % 128;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    byte[] bArr3 = bArr2;
                    Object[] objArr2 = {Integer.valueOf(cArr4[i10])};
                    int i11 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cArr3 = cArr5;
                        i2 = i10;
                        method = obj;
                        i3 = i8;
                    } else {
                        cArr3 = cArr5;
                        i2 = i10;
                        i3 = i8;
                        Class cls2 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), 2296 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        Object[] objArr3 = new Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method);
                    }
                    cArr3[i2] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i10 = i2 + 1;
                    length = i11;
                    bArr2 = bArr3;
                    i8 = i3;
                    cArr5 = cArr3;
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
        byte[] bArr4 = bArr2;
        int i12 = i8;
        char[] cArr6 = new char[i7];
        System.arraycopy(cArr4, i6, cArr6, 0, i7);
        if (bArr4 != null) {
            char[] cArr7 = new char[i7];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i13 = cleanupVar.get;
                if (i13 >= i7) {
                    break;
                }
                if (bArr4[i13] == 1) {
                    c = '0';
                    Object[] objArr4 = {Integer.valueOf(cArr6[i13]), Integer.valueOf(c2)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 != null) {
                        cArr2 = cArr6;
                    } else {
                        Class cls3 = (Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 85, (char) (Gravity.getAbsoluteGravity(0, 0) + 25857), AndroidCharacter.getMirror('0') + 1678);
                        Object[] objArr5 = new Object[1];
                        cArr2 = cArr6;
                        b((short) 0, (short) 0, (byte) 1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr7[i13] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    cArr2 = cArr6;
                    c = '0';
                    Object[] objArr6 = {Integer.valueOf(cArr2[i13]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65, (char) (32825 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 446)).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i13] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr7[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(74 - View.resolveSize(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), AndroidCharacter.getMirror(c) + 9772)).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cArr6 = cArr2;
            }
            cArr6 = cArr7;
        }
        if (i9 > 0) {
            char[] cArr8 = new char[i7];
            System.arraycopy(cArr6, 0, cArr8, 0, i7);
            int i14 = i7 - i9;
            System.arraycopy(cArr8, 0, cArr6, i14, i9);
            System.arraycopy(cArr8, i9, cArr6, 0, i14);
        }
        if (z) {
            int i15 = $10 + 77;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i7];
                i = 0;
            } else {
                i = 0;
                cArr = new char[i7];
            }
            cleanupVar.get = i;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i7) {
                    break;
                }
                cArr[i16] = cArr6[(i7 - i16) - 1];
                cleanupVar.get = i16 + 1;
            }
            cArr6 = cArr;
        }
        if (i12 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i7) {
                    break;
                }
                cArr6[i17] = (char) (cArr6[i17] - iArr[2]);
                cleanupVar.get = i17 + 1;
                $11 = ($10 + 89) % 128;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(short s, short s2, byte b, Object[] objArr) {
        byte[] bArr = $$a;
        int i = s * 2;
        int i2 = 122 - (b * 57);
        int i3 = 3 - (s2 * 4);
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2);
            i3 = i3;
        }
        while (true) {
            i5++;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 += -bArr[i6];
                i3 = i6;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PPM_TEXT_CODE, 35, -121, -57};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.isEmpty
    public void aU_(TextView textView, String str) {
        String str2;
        int i = ThreeDS2Service + 39;
        get = i % 128;
        if (i % 2 == 0) {
            str2 = get(str);
            if (Build.VERSION.SDK_INT < 109) {
                textView.setText(Html.fromHtml(str2));
                return;
            }
        } else {
            str2 = get(str);
        }
        int i2 = get + 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            textView.setText(Html.fromHtml(str2, 80));
        } else {
            textView.setText(Html.fromHtml(str2, 63));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r5 = new java.lang.Object[1];
        a(true, new int[]{0, 38, 0, 4}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", r5);
        r11 = get(r11, ((java.lang.String) r5[0]).intern(), '*', '&');
        r6 = new java.lang.Object[1];
        a(false, new int[]{38, 1, 0, 0}, org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, r6);
        r0 = ((java.lang.String) r6[0]).intern();
        r8 = new java.lang.Object[1];
        a(false, new int[]{39, 6, 0, 6}, "\u0000\u0000\u0000\u0000\u0000\u0000", r8);
        r11 = r11.replaceAll(r0, ((java.lang.String) r8[0]).intern());
        r7 = new java.lang.Object[1];
        a(true, new int[]{45, 23, 0, 0}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000", r7);
        r0 = ((java.lang.String) r7[0]).intern();
        r8 = new java.lang.Object[1];
        a(false, new int[]{68, 9, 0, 0}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", r8);
        r11 = r11.replaceAll(r0, ((java.lang.String) r8[0]).intern());
        r4 = new java.lang.Object[1];
        a(false, new int[]{77, 38, 0, 21}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001", r4);
        r10 = get(r11, ((java.lang.String) r4[0]).intern(), '&', '*');
        r11 = com.netcetera.threeds.sdk.infrastructure.bn.get + 39;
        com.netcetera.threeds.sdk.infrastructure.bn.ThreeDS2Service = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b7, code lost:
    
        if ((r11 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b9, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String get(String str) {
        int i = ThreeDS2Service + 57;
        get = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r2.charAt(r3) == r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        r1.append(r2.charAt(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r1.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r2.charAt(r3) == r9) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String get(String str, String str2, char c, char c2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        StringBuilder sb = new StringBuilder();
        get = (ThreeDS2Service + 101) % 128;
        int i = 0;
        while (matcher.find()) {
            sb.append((CharSequence) str, i, matcher.start());
            StringBuilder sb2 = new StringBuilder();
            String group = matcher.group();
            int i2 = 0;
            while (i2 < group.length()) {
                int i3 = get + 87;
                ThreeDS2Service = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 44 / 0;
                }
                i2++;
            }
            sb.append((CharSequence) sb2);
            i = matcher.end();
        }
        if (i < str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        return sb.toString();
    }
}

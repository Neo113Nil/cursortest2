package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setBaselineAlignedChildIndex implements setBaselineAligned {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static long ThreeDS2ServiceInstance;
    private static long get;
    private static int getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        getWarnings = 1;
        ThreeDS2Service = new char[]{61002, 26128, 65236, 30337, 53090, 18213, 35161, 259, 39390, 4496, 43120, 27547, 58332, 31488, 62317, 19121, 49889, 23118, 53693, 10689, 41256, 14718, 25915, 60769, 30140, 65023, 17439, 52318, 21740, 57125, 10091, 44955, 14273, 48663, 1719, 36602, 4398, 39292, 57730, 27072, 61554, 30885, 49379, 19217, 37249, 6614, 33068, 2422, 45234, 14588, 24475, 55249, 20255, 51063, 32432, 63213, 28276, 58780, 7617, 38195, 20694, 55448, 16453, 51263, 29167, 63913, 24858, 60116, 4750, 39544, 528, 35808, 13141, 47895, 9439, 44223, 54374, 23608, 50584, 19785, 62725, 59352, 28560, 63301, 32513, 50922, 20130, 54808, 24010, 42381, 11636, 46382, 15588, 33887, 3093, 37853, 14404, 45066, 10461, 41132, 6506, 37164, 2447, 43000, 12196, 46970, 16142, 34516, 3736, 38438, 7652, 58807, 28007, 62737, 31966, 50284, 19488, 54242, 35146, 278, 39391, 4524, 43121, 8252, 47246, 13171, 51986, 17406, 56231, 21108, 60121, 25241, 64833, 29988, 3532, 34210, 7175, 38106, 2816, 33614, 7059, 37865, 10809, 41599, 15052, 45314, 18776, 49582, 22987, 53305, 26769, 57551, 14811, 45440, 10582, 41260, 6377, 37050, 2084, 33732, 31645, 62318, 35147, 272, 39366, 4540, 43129, 8234, 47283, 13137, 51987, 35146, 284, 39361, 4525, 43095, 8234, 47240, 13121, 51977, 17405, 56255, 21090, 60125, 25219, 64839, 29998, 35164, 274, 39388, 4530, 43096, 8224, 47261, 13146, 52021, 17385, 56250, 21073, 60125, 25219, 64842};
        get = -7336365539088662157L;
        ThreeDS2ServiceInstance = 5773280727164908773L;
    }

    private setFooterDividersEnabled ThreeDS2Service(nq nqVar) {
        Object[] objArr = new Object[1];
        b("\uf4d5룧没၁쐞蠫㷇\ue1b5镝夛ങ닥暧⩕\ude12舣㟯", 19507 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        String warnings = nqVar.getWarnings(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 103, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11954), objArr2);
        String warnings2 = nqVar.getWarnings(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        a(21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 119, (char) TextUtils.getOffsetBefore("", 0), objArr3);
        setFooterDividersEnabled setfooterdividersenabled = new setFooterDividersEnabled(warnings, warnings2, Integer.parseInt(nqVar.getWarnings(((String) objArr3[0]).intern(), String.valueOf(om.initialize))));
        int i = initialize + 95;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
        return setfooterdividersenabled;
    }

    private setOverscrollHeader ThreeDS2ServiceInstance(nq nqVar) {
        Object[] objArr = new Object[1];
        a(10 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 153, (char) (45200 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr);
        String warnings = nqVar.getWarnings(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(9 - (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionType(0L) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, (char) TextUtils.getCapsMode("", 0, 0), objArr2);
        List<String> list = nqVar.get(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b("\uf4d4䮂詨쫔়䠐裫콓ึ亚赐찫ಟ䍼菎스Ĉ䇿聚윢ސ", 48988 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        String warnings2 = nqVar.getWarnings(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b("\uf4d4ꂀ屬\u09deꖴ儚\u0eff멁嘦Έ뽌品¼밫槇", View.MeasureSpec.getMode(0) + 21599, objArr4);
        String warnings3 = nqVar.getWarnings(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        a(16 - (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, (char) Drawable.resolveOpacity(0, 0), objArr5);
        List<String> list2 = nqVar.get(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        b("\uf4d5肉ᱭ꧇▰넌仫\uda76嘶\ue393罼ଛ肟ᱤ꧷▣넕仴", ExpandableListView.getPackedPositionType(0L) + 29789, objArr6);
        String warnings4 = nqVar.getWarnings(((String) objArr6[0]).intern(), "");
        Object[] objArr7 = new Object[1];
        a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 15, 187 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
        setOverscrollHeader setoverscrollheader = new setOverscrollHeader(warnings, list, warnings2, warnings3, list2, warnings4, nqVar.getWarnings(((String) objArr7[0]).intern(), ""));
        getWarnings = (initialize + 25) % 128;
        return setoverscrollheader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        r1[r2] = (char) r5[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
    
        r0 = new java.lang.Object[]{r4, r4};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(1724349229);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a6, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (27781 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2441);
        r4 = new java.lang.Object[1];
        c(-1, 0, (byte) 3, r4);
        r2 = r2.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r1.put(1724349229, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        Object method;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i3 = threeDS2ServiceInitializationCallback.initialize;
            if (i3 >= i) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(ThreeDS2Service[i2 + i3])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls2 = (Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777264, (char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.getOffsetAfter("", 0) + 3221);
                    Object[] objArr3 = new Object[1];
                    c(-1, (short) 0, (byte) 0, objArr3);
                    method = cls2.getMethod((String) objArr3[0], cls);
                    map.put(-54653524, method);
                }
                Long l = (Long) ((Method) method).invoke(null, objArr2);
                l.longValue();
                Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(get), Integer.valueOf(c)};
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(68 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionChild(0L) + 50705), Process.getGidForName("") + 7790);
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - View.resolveSize(0, 0), (char) (27781 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 2441);
                    Object[] objArr6 = new Object[1];
                    c(-1, (short) 0, (byte) 3, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 121) % 128;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i5 = $11 + 57;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                break;
            }
            cArr[i4] = (char) jArr[i4];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 == null) {
                Class cls6 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, (char) (27781 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 2441);
                Object[] objArr8 = new Object[1];
                c(-1, (short) 0, (byte) 3, objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0023, code lost:
    
        r2 = r19.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0021, code lost:
    
        if (r19 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r19 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        char[] charArray;
        Throwable cause;
        char c;
        int i2 = $11 + 55;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        char[] cArr = charArray;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= cArr.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[i4]), addparam, addparam};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    c = 1;
                } else {
                    c = 1;
                    obj = ((Class) removeParam.initialize(65 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.alpha(0), Color.red(0) + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, obj);
                }
                jArr[i4] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[c] = addparam;
                objArr3[0] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(76 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ImageFormat.getBitsPerPixel(0) + 62098), 2102 - Gravity.getAbsoluteGravity(0, 0));
                    int i5 = c;
                    Object[] objArr4 = new Object[i5];
                    c(-1, (short) 0, i5, objArr4);
                    obj2 = cls.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i6 = addparam.ThreeDS2Service;
            if (i6 >= cArr.length) {
                String str2 = new String(cArr2);
                $11 = ($10 + 81) % 128;
                objArr[0] = str2;
                return;
            }
            $11 = ($10 + 87) % 128;
            cArr2[i6] = (char) jArr[i6];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 76, (char) (Color.argb(0, 0, 0, 0) + 62097), ((Process.getThreadPriority(0) + 20) >> 6) + 2102);
                Object[] objArr6 = new Object[1];
                c(-1, (short) 0, (byte) 1, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, byte b, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = s * 2;
        int i5 = 100 - b;
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

    private setIndeterminateDrawable get(nq nqVar) {
        Object[] objArr = new Object[1];
        b("\uf4dd日효䝣뀫⋳鎺\u0c51紼\uefed", View.combineMeasuredStates(0, 0) + 37181, objArr);
        String warnings = nqVar.getWarnings(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b("\uf4d8భԹḝᝡ⡳⅏", 63727 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        setIndeterminateDrawable setindeterminatedrawable = new setIndeterminateDrawable(warnings, nqVar.ThreeDS2Service(((String) objArr2[0]).intern(), Boolean.TRUE));
        getWarnings = (initialize + 67) % 128;
        return setindeterminatedrawable;
    }

    public static void init$0() {
        $$a = new byte[]{47, -124, 44, 16};
        $$b = 95;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setBaselineAligned
    public String getWarnings(setDividerHeight setdividerheight) {
        initialize = (getWarnings + 13) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 11, View.resolveSize(0, 0) + 11, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58047), objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setdividerheight.getWarnings());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 14, View.getDefaultSize(0, 0) + 81, (char) (28300 - Color.blue(0)), objArr2);
        ThreeDS2ServiceInstance2.getWarnings(((String) objArr2[0]).intern(), setdividerheight.ThreeDS2Service());
        setIndeterminateDrawable initialize2 = setdividerheight.initialize();
        nq ThreeDS2ServiceInstance3 = nq.ThreeDS2ServiceInstance();
        Object[] objArr3 = new Object[1];
        b("\uf4dd日효䝣뀫⋳鎺\u0c51紼\uefed", Color.blue(0) + 37181, objArr3);
        ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr3[0]).intern(), initialize2.get());
        Object[] objArr4 = new Object[1];
        b("\uf4d8భԹḝᝡ⡳⅏", 63727 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        ThreeDS2ServiceInstance3.getWarnings(((String) objArr4[0]).intern(), initialize2.ThreeDS2ServiceInstance());
        Object[] objArr5 = new Object[1];
        a(7 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 96, (char) (View.resolveSize(0, 0) + 45328), objArr5);
        ThreeDS2ServiceInstance2.initialize(((String) objArr5[0]).intern(), ThreeDS2ServiceInstance3);
        setFooterDividersEnabled setfooterdividersenabled = setdividerheight.get();
        nq ThreeDS2ServiceInstance4 = nq.ThreeDS2ServiceInstance();
        Object[] objArr6 = new Object[1];
        b("\uf4d5룧没၁쐞蠫㷇\ue1b5镝夛ങ닥暧⩕\ude12舣㟯", View.combineMeasuredStates(0, 0) + 19507, objArr6);
        ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr6[0]).intern(), setfooterdividersenabled.initialize());
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 14, 103 - KeyEvent.normalizeMetaState(0), (char) (Color.rgb(0, 0, 0) + 16789170), objArr7);
        ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr7[0]).intern(), setfooterdividersenabled.get());
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, 118 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
        ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr8[0]).intern(), String.valueOf(setfooterdividersenabled.getWarnings()));
        Object[] objArr9 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 14, TextUtils.getCapsMode("", 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, (char) (33369 - View.resolveSize(0, 0)), objArr9);
        ThreeDS2ServiceInstance2.initialize(((String) objArr9[0]).intern(), ThreeDS2ServiceInstance4);
        List<setOverscrollHeader> ThreeDS2ServiceInstance5 = setdividerheight.ThreeDS2ServiceInstance();
        ns ThreeDS2Service2 = ns.ThreeDS2Service();
        for (setOverscrollHeader setoverscrollheader : ThreeDS2ServiceInstance5) {
            initialize = (getWarnings + 49) % 128;
            nq ThreeDS2ServiceInstance6 = nq.ThreeDS2ServiceInstance();
            Object[] objArr10 = new Object[1];
            a(10 - TextUtils.getOffsetAfter("", 0), 152 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (45200 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr10);
            ThreeDS2ServiceInstance6.ThreeDS2Service(((String) objArr10[0]).intern(), setoverscrollheader.initialize());
            Object[] objArr11 = new Object[1];
            a((Process.myTid() >> 22) + 9, TextUtils.indexOf("", "", 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr11);
            ThreeDS2ServiceInstance6.ThreeDS2ServiceInstance(((String) objArr11[0]).intern(), setoverscrollheader.getWarnings());
            Object[] objArr12 = new Object[1];
            b("\uf4d4䮂詨쫔়䠐裫콓ึ亚赐찫ಟ䍼菎스Ĉ䇿聚윢ސ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 48989, objArr12);
            ThreeDS2ServiceInstance6.ThreeDS2Service(((String) objArr12[0]).intern(), setoverscrollheader.get());
            Object[] objArr13 = new Object[1];
            b("\uf4d4ꂀ屬\u09deꖴ儚\u0eff멁嘦Έ뽌品¼밫槇", 21647 - AndroidCharacter.getMirror('0'), objArr13);
            ThreeDS2ServiceInstance6.ThreeDS2Service(((String) objArr13[0]).intern(), setoverscrollheader.ThreeDS2Service());
            Object[] objArr14 = new Object[1];
            a(View.getDefaultSize(0, 0) + 16, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr14);
            ThreeDS2ServiceInstance6.ThreeDS2ServiceInstance(((String) objArr14[0]).intern(), setoverscrollheader.ThreeDS2ServiceInstance());
            Object[] objArr15 = new Object[1];
            b("\uf4d5肉ᱭ꧇▰넌仫\uda76嘶\ue393罼ଛ肟ᱤ꧷▣넕仴", TextUtils.indexOf("", "", 0, 0) + 29789, objArr15);
            ThreeDS2ServiceInstance6.ThreeDS2Service(((String) objArr15[0]).intern(), setoverscrollheader.ThreeDS2ServiceInitializationCallback());
            Object[] objArr16 = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) + 15, (ViewConfiguration.getLongPressTimeout() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, (char) View.combineMeasuredStates(0, 0), objArr16);
            ThreeDS2ServiceInstance6.ThreeDS2Service(((String) objArr16[0]).intern(), setoverscrollheader.getSDKVersion());
            ThreeDS2Service2.ThreeDS2Service(ThreeDS2ServiceInstance6);
            getWarnings = (initialize + 37) % 128;
        }
        Object[] objArr17 = new Object[1];
        b("\uf4d5ꃷ岘ࡁꐋ凞෦릥啬Ğ뻂檂ڤ뉯渹", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21556, objArr17);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr17[0]).intern(), ThreeDS2Service2);
        return ThreeDS2ServiceInstance2.toString();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setBaselineAligned
    public String initialize(setDivider setdivider) {
        Object obj;
        initialize = (getWarnings + 31) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ViewConfiguration.getEdgeSlop() >> 16, (char) (ExpandableListView.getPackedPositionGroup(0L) + 26387), objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setdivider.getWarnings());
        Object[] objArr2 = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, 6 - (Process.myTid() >> 22), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setdivider.ThreeDS2Service());
        Object[] objArr3 = new Object[1];
        b("\uf4d0\uf64c\uf1db\uf35fﻫ\uf803ﮋ\ue50b\ue0b7\ue227\ued56\ue8f7\uea49", View.MeasureSpec.makeMeasureSpec(0, 0) + 653, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setdivider.get());
        Object[] objArr4 = new Object[1];
        b("\uf4c2䁠鶰\ueaf8☀獊주Ы其꺂", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 46260, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setdivider.initialize());
        Object[] objArr5 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 12, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (char) (58049 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), setdivider.createTransaction());
        Object[] objArr6 = new Object[1];
        a(22 - (ViewConfiguration.getTouchSlop() >> 8), 22 - Color.argb(0, 0, 0, 0), (char) (60514 - (Process.myPid() >> 22)), objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), setdivider.cleanup());
        setHeaderDividersEnabled ThreeDS2ServiceInstance3 = setdivider.ThreeDS2ServiceInstance();
        if (ThreeDS2ServiceInstance3 != null) {
            getWarnings = (initialize + 17) % 128;
            nq ThreeDS2ServiceInstance4 = nq.ThreeDS2ServiceInstance();
            Object[] objArr7 = new Object[1];
            a(6 - (KeyEvent.getMaxKeyCode() >> 16), 44 - TextUtils.getTrimmedLength(""), (char) (6359 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr7);
            ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2ServiceInstance3.ThreeDS2ServiceInstance());
            Object[] objArr8 = new Object[1];
            b("\uf4de톱븁蒍意俽ᑪ\uf2fb\udf47", TextUtils.getCapsMode("", 0, 0) + 9587, objArr8);
            ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr8[0]).intern(), ThreeDS2ServiceInstance3.getWarnings());
            Object[] objArr9 = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, 50 - View.resolveSizeAndState(0, 0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 54983), objArr9);
            ThreeDS2ServiceInstance2.initialize(((String) objArr9[0]).intern(), ThreeDS2ServiceInstance4);
        }
        if (!setdivider.getSDKInfo().isEmpty()) {
            int i = getWarnings + 67;
            initialize = i % 128;
            if (i % 2 != 0) {
                Object[] objArr10 = new Object[1];
                a((ViewConfiguration.getScrollBarSize() % 87) + 72, 88 >>> Color.argb(0, 0, 1, 0), (char) (55695 << (ViewConfiguration.getLongPressTimeout() % 56)), objArr10);
                obj = objArr10[0];
            } else {
                Object[] objArr11 = new Object[1];
                a((ViewConfiguration.getScrollBarSize() >> 8) + 21, Color.argb(0, 0, 0, 0) + 60, (char) (55695 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr11);
                obj = objArr11[0];
            }
            ThreeDS2ServiceInstance2.initialize(((String) obj).intern(), nq.ThreeDS2ServiceInstance(setdivider.getSDKInfo()));
        }
        return ThreeDS2ServiceInstance2.toString();
    }

    private List<setOverscrollHeader> ThreeDS2Service(ns nsVar) {
        ArrayList arrayList = new ArrayList();
        getWarnings = (initialize + 57) % 128;
        for (int i = 0; i < nsVar.getWarnings(); i++) {
            arrayList.add(ThreeDS2ServiceInstance(nsVar.get(i)));
        }
        initialize = (getWarnings + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return arrayList;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setBaselineAligned
    public setDividerHeight initialize(String str) {
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance((String) oj.getWarnings(str, ""));
        Object[] objArr = new Object[1];
        a(11 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 11, (char) (ImageFormat.getBitsPerPixel(0) + 58049), objArr);
        String warnings = ThreeDS2ServiceInstance2.getWarnings(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(7 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 96, (char) (Color.alpha(0) + 45328), objArr2);
        setIndeterminateDrawable setindeterminatedrawable = get(ThreeDS2ServiceInstance2.getSDKVersion(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 14, 137 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33369), objArr3);
        setFooterDividersEnabled ThreeDS2Service2 = ThreeDS2Service(ThreeDS2ServiceInstance2.getSDKVersion(((String) objArr3[0]).intern()));
        Object[] objArr4 = new Object[1];
        b("\uf4d5ꃷ岘ࡁꐋ凞෦릥啬Ğ뻂檂ڤ뉯渹", TextUtils.getTrimmedLength("") + 21557, objArr4);
        List<setOverscrollHeader> ThreeDS2Service3 = ThreeDS2Service(ThreeDS2ServiceInstance2.ThreeDS2ServiceInitializationCallback(((String) objArr4[0]).intern()));
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, ExpandableListView.getPackedPositionChild(0L) + 82, (char) (28299 - TextUtils.indexOf((CharSequence) "", '0')), objArr5);
        setDividerHeight setdividerheight = new setDividerHeight(ThreeDS2Service3, setindeterminatedrawable, ThreeDS2Service2, warnings, ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), Boolean.TRUE));
        initialize = (getWarnings + 107) % 128;
        return setdividerheight;
    }
}

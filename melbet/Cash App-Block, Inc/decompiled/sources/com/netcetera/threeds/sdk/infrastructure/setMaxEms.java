package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.getClass;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class setMaxEms implements setLines {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static long getWarnings;
    private static char[] initialize;
    private final no get = (no) nu.initialize(new Object[]{setMaxEms.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        ThreeDS2Service = 1;
        getWarnings = -1096853466576241040L;
        initialize = new char[]{52744, 52764, 52780, 52791, 52765, 52754, 52751, 52766, 52796, 52766, 52747, 52762, 52766, 52747, 52797, 52797, 52780, 52747, 52747, 52766, 52944, 52926, 52916, 52877, 52877, 52917, 52911, 52907, 52919, 52905, 52913, 52865, 52877, 52878, 52879, 52875, 52865, 52867, 52866, 52873, 52882, 52884, 52944, 52873, 52875, 52873, 52887, 52878, 52875, 52881, 52921, 52914, 52865, 52867, 52877, 52884, 52875, 52878, 52814, 52893, 52888, 52814, 52803, 52848, 52815, 52845, 52806, 52861, 52892, 52910, 52880, 52891, 52924, 52893, 52874, 52891, 52881, 52890, 52880, 52908, 52884, 52875, 52949, 52908, 52950, 52941, 52933, 52897, 52921, 52887, 52864, 52878, 52868, 52868, 52876, 52883, 52767, 53239, 53225, 53230, 53225, 53227, 53224, 53233, 53235, 53235, 52949, 52867, 52878, 52926, 52925, 52887, 52887, 52885, 52876, 52908, 52852, 52844, 52844, 52855, 52854, 52855, 52855, 52892, 52891, 52853, 52853, 52851, 52842, 52931, 52924, 52878, 52865, 52865, 52869, 52877, 52886, 52887, 52877, 52877, 52874, 52873, 52873, 52865, 52869, 52865, 52877, 52873, 52881, 52908, 52862, 52951, 52877, 52877, 52869, 52957, 52877, 52877, 52883, 52883, 52886, 52872, 52879, 52918, 52927, 52887, 52870, 52941, 52916, 52904, 52909, 52924, 52878, 52878, 52872, 52879, 52918, 52927, 52887, 52929, 52904, 52916, 52869, 52887, 52927, 52918, 52879, 52872, 52950, 52866, 52867, 52865, 52875, 52879, 52878, 52877, 52865, 52915, 52917, 52877, 52877};
    }

    private static void a(boolean z, String str, int[] iArr, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        Object method;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr4 = initialize;
        float f = RecyclerView.DECELERATION_RATE;
        char c = '0';
        Class cls = Integer.TYPE;
        int i8 = 2;
        short s = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            bArr = bArr3;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                int i11 = $10 + 35;
                int i12 = length;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i10])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-1866317650);
                        if (obj != null) {
                            cArr2 = cArr5;
                            i2 = i6;
                            cArr3 = cArr4;
                            method = obj;
                            i3 = i7;
                        } else {
                            cArr2 = cArr5;
                            i2 = i6;
                            cArr3 = cArr4;
                            Class cls2 = (Class) removeParam.initialize(48 - Color.alpha((int) s), (char) (AndroidCharacter.getMirror('0') - '0'), (TypedValue.complexToFloat(s) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(s) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2295);
                            Object[] objArr3 = new Object[1];
                            i3 = i7;
                            short s2 = s;
                            c((short) 57, s2, s2, objArr3);
                            method = cls2.getMethod((String) objArr3[s2], cls);
                            map.put(-1866317650, method);
                        }
                        cArr2[i10] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i9 = i10 % 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = cArr5;
                    i2 = i6;
                    i3 = i7;
                    cArr3 = cArr4;
                    Object[] objArr4 = {Integer.valueOf(cArr3[i10])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-1866317650);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(48 - Color.blue(0), (char) TextUtils.indexOf("", "", 0), 2295 - KeyEvent.normalizeMetaState(0));
                        Object[] objArr5 = new Object[1];
                        c((short) 57, (short) 0, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1866317650, obj2);
                    }
                    cArr2[i10] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i9 = i10 + 1;
                }
                length = i12;
                i7 = i3;
                cArr5 = cArr2;
                i6 = i2;
                cArr4 = cArr3;
                s = 0;
            }
            cArr4 = cArr5;
        } else {
            bArr = bArr3;
        }
        int i13 = i6;
        int i14 = i7;
        char[] cArr6 = new char[i5];
        System.arraycopy(cArr4, i4, cArr6, 0, i5);
        if (bArr != null) {
            $11 = ($10 + 47) % 128;
            char[] cArr7 = new char[i5];
            cleanupVar.get = 0;
            char c2 = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i5) {
                    break;
                }
                int i16 = $10;
                int i17 = i16 + 23;
                $11 = i17 % 128;
                if (i17 % 2 != 0 ? bArr[i15] != 1 : bArr[i15] != 0) {
                    cArr = cArr6;
                    Object[] objArr6 = {Integer.valueOf(cArr[i15]), Integer.valueOf(c2)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(65 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 32825), 447 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i15] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i18 = i16 + 73;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        char c3 = cArr6[i15];
                        Object[] objArr7 = new Object[i8];
                        objArr7[1] = Integer.valueOf(c2);
                        objArr7[0] = Integer.valueOf(c3);
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(715226994);
                        if (obj4 == null) {
                            Class cls4 = (Class) removeParam.initialize(84 - TextUtils.lastIndexOf("", c), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25856), 1726 - (KeyEvent.getMaxKeyCode() >> 16));
                            Object[] objArr8 = new Object[1];
                            c((short) 0, (short) 0, 0, objArr8);
                            obj4 = cls4.getMethod((String) objArr8[0], cls, cls);
                            map4.put(715226994, obj4);
                        }
                        cArr7[i15] = ((Character) ((Method) obj4).invoke(null, objArr7)).charValue();
                        int i19 = 44 / 0;
                        cArr = cArr6;
                    } else {
                        Object[] objArr9 = {Integer.valueOf(cArr6[i15]), Integer.valueOf(c2)};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj5 = map5.get(715226994);
                        if (obj5 != null) {
                            cArr = cArr6;
                        } else {
                            float f2 = f;
                            cArr = cArr6;
                            Class cls5 = (Class) removeParam.initialize(85 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), (char) (25857 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getOffsetAfter("", 0) + 1726);
                            Object[] objArr10 = new Object[1];
                            c((short) 0, (short) 0, 0, objArr10);
                            obj5 = cls5.getMethod((String) objArr10[0], cls, cls);
                            map5.put(715226994, obj5);
                        }
                        cArr7[i15] = ((Character) ((Method) obj5).invoke(null, objArr9)).charValue();
                    }
                }
                c2 = cArr7[cleanupVar.get];
                Object[] objArr11 = {cleanupVar, cleanupVar};
                Map map6 = removeParam.visaSchemeConfiguration;
                Object obj6 = map6.get(102334785);
                if (obj6 == null) {
                    obj6 = ((Class) removeParam.initialize((ViewConfiguration.getScrollBarSize() >> 8) + 74, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 9820)).getMethod("I", Object.class, Object.class);
                    map6.put(102334785, obj6);
                }
                ((Method) obj6).invoke(null, objArr11);
                cArr6 = cArr;
                f = RecyclerView.DECELERATION_RATE;
                c = '0';
                i8 = 2;
            }
            cArr6 = cArr7;
        }
        if (i14 > 0) {
            char[] cArr8 = new char[i5];
            i = 0;
            System.arraycopy(cArr6, 0, cArr8, 0, i5);
            int i20 = i5 - i14;
            System.arraycopy(cArr8, 0, cArr6, i20, i14);
            System.arraycopy(cArr8, i14, cArr6, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr9 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i21 = cleanupVar.get;
                if (i21 >= i5) {
                    break;
                }
                int i22 = $10 + 83;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr9[i21] = cArr6[i5 * i21];
                    cleanupVar.get = 0;
                } else {
                    cArr9[i21] = cArr6[(i5 - i21) - 1];
                    cleanupVar.get = i21 + 1;
                }
            }
            cArr6 = cArr9;
        }
        if (i13 > 0) {
            $11 = ($10 + 67) % 128;
            cleanupVar.get = 0;
            while (true) {
                int i23 = cleanupVar.get;
                if (i23 >= i5) {
                    break;
                }
                cArr6[i23] = (char) (cArr6[i23] - iArr[2]);
                cleanupVar.get = i23 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(String str, int i, Object[] objArr) {
        char[] cArr;
        char c;
        int i2;
        int i3 = ($10 + 17) % 128;
        $11 = i3;
        if (str != null) {
            $10 = (i3 + 85) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(getWarnings ^ (-2776494906517314268L), cArr, i);
        int i4 = 4;
        oncompleted.initialize = 4;
        while (true) {
            int i5 = oncompleted.initialize;
            if (i5 >= initialize2.length) {
                objArr[0] = new String(initialize2, i4, initialize2.length - 4);
                return;
            }
            int i6 = i5 - 4;
            oncompleted.ThreeDS2Service = i6;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i5] ^ initialize2[i5 % 4]), Long.valueOf(i6), Long.valueOf(getWarnings)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i4;
                    c = '0';
                } else {
                    c = '0';
                    i2 = i4;
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (char) (Color.red(0) + 27780), 2442 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                    Object[] objArr3 = new Object[1];
                    c((short) 47, (short) 0, 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(AndroidCharacter.getMirror(c) + 18, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 14235 - (Process.myTid() >> 22))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 47) % 128;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3 = s + 65;
        int i4 = i * 4;
        int i5 = 4 - (s2 * 3);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            i5++;
            i3 += i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i5];
            byte[] bArr4 = bArr;
            i8 = i3;
            i3 = b;
            i7 = i2 + 1;
            bArr3 = bArr4;
            i5++;
            i3 += i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{107, 82, -52, 66};
        $$e = EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLines
    public String ThreeDS2Service(setMinEms setminems) {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 11) % 128;
        KeyEvent.getModifierMetaStateMask();
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(true, null, new int[]{0, 20, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 2}, objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setminems.get());
        Object[] objArr2 = new Object[1];
        b("ⴑ뻷⵰雦◀倍ꀽ膥䀳똲㕰漲\uf7f8쭇", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setminems.initialize());
        Object[] objArr3 = new Object[1];
        b("\ue2af䓬\ue2cc큪\udfd0⣰\ue6a3怒输䰭珼៛㡪ㅜ셃萘ꔾ\ua7ed꺜ㅨ垝ᐁ", ViewConfiguration.getFadingEdgeLength() >> 16, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setminems.getWarnings());
        Object[] objArr4 = new Object[1];
        a(true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{20, 22, 0, 19}, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setminems.cleanup());
        setMarqueeRepeatLimit sDKInfo = setminems.getSDKInfo();
        if (sDKInfo != null) {
            ns ThreeDS2Service2 = ns.ThreeDS2Service();
            ThreeDS2Service2.ThreeDS2Service(get(sDKInfo));
            Object[] objArr5 = new Object[1];
            a(true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{42, 16, 0, 0}, objArr5);
            ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), ThreeDS2Service2);
        }
        Object[] objArr6 = new Object[1];
        b("㽱䖺㼒流\ude86ﶙ챞Ⰹ前䵻夁슲\ue5b4」\uebbe八磢ꚛ董", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), ThreeDS2Service((setMaxEms) setminems.ThreeDS2Service()));
        Object[] objArr7 = new Object[1];
        b("䰭ᐶ䱀ꅧ輇咅鞼蔊ℜᳵ˺殝雴憲끊", ViewConfiguration.getTapTimeout() >> 16, objArr7);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2Service((setMaxEms) setminems.createTransaction()));
        Object[] objArr8 = new Object[1];
        b("鞷豸韚\uf574ᝉ癸쎯ꟷ惘蒻囩䥢䵲茶\ue44f\uda8d퀨潒", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr8);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr8[0]).intern(), ThreeDS2Service((setMaxEms) setminems.getSDKVersion()));
        Object[] objArr9 = new Object[1];
        b("錺䨂鍈\ueca9턳⃫\uda72\uf172︄䋂伒῏䧻㾚ﶍ谒풤ꤡ鉔", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr9);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr9[0]).intern(), ThreeDS2Service((setMaxEms) setminems.removeParam()));
        Object[] objArr10 = new Object[1];
        a(true, null, new int[]{58, 10, 54, 1}, objArr10);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr10[0]).intern(), setminems.apiKey());
        Object[] objArr11 = new Object[1];
        a(true, null, new int[]{68, 14, 8, 1}, objArr11);
        String intern = ((String) objArr11[0]).intern();
        Locale locale = Locale.US;
        Object[] objArr12 = new Object[1];
        a(true, "\u0000\u0001\u0001\u0001", new int[]{82, 4, 0, 0}, objArr12);
        ThreeDS2ServiceInstance2.ThreeDS2Service(intern, String.format(locale, ((String) objArr12[0]).intern(), Integer.valueOf(setminems.configureScheme())));
        getWarnings(ThreeDS2ServiceInstance2, setminems);
        String nqVar = ThreeDS2ServiceInstance2.toString();
        ThreeDS2Service = (ThreeDS2ServiceInstance + 19) % 128;
        return nqVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLines
    public String get(setCursorVisible setcursorvisible) {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 1) % 128;
        ExpandableListView.getPackedPositionGroup(0L);
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a(true, null, new int[]{0, 20, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 2}, objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setcursorvisible.get());
        Object[] objArr2 = new Object[1];
        b("ⴑ뻷⵰雦◀倍ꀽ膥䀳똲㕰漲\uf7f8쭇", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setcursorvisible.getWarnings());
        Object[] objArr3 = new Object[1];
        a(true, null, new int[]{58, 10, 54, 1}, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setcursorvisible.ThreeDS2Service());
        Object[] objArr4 = new Object[1];
        a(true, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{86, 9, 0, 0}, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setcursorvisible.getSchemePublicRootKeys());
        Object[] objArr5 = new Object[1];
        b("\ue617ᬦ\ue672\udbe5耀⯝\ued3f祈謵Ꮖ硸ᓢ㳔溠쫄蜱ꆓ\uf80bꔒ㉟", ViewConfiguration.getPressedStateDuration() >> 16, objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), setcursorvisible.rootPublicKey());
        Object[] objArr6 = new Object[1];
        a(false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{95, 11, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 6}, objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), setcursorvisible.logoDark());
        Object[] objArr7 = new Object[1];
        a(true, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{106, 9, 0, 0}, objArr7);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2Service((setMaxEms) setcursorvisible.ids()));
        Object[] objArr8 = new Object[1];
        a(true, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{115, 14, 34, 0}, objArr8);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr8[0]).intern(), ThreeDS2Service((setMaxEms) setcursorvisible.encryptionPublicKey()));
        Object[] objArr9 = new Object[1];
        b("䰭ᐶ䱀ꅧ輇咅鞼蔊ℜᳵ˺殝雴憲끊", TextUtils.getCapsMode("", 0, 0), objArr9);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr9[0]).intern(), ThreeDS2Service((setMaxEms) setcursorvisible.ThreeDS2ServiceInstance()));
        Object[] objArr10 = new Object[1];
        b("鞷豸韚\uf574ᝉ癸쎯ꟷ惘蒻囩䥢䵲茶\ue44f\uda8d퀨潒", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr10);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr10[0]).intern(), ThreeDS2Service((setMaxEms) setcursorvisible.initialize()));
        Object[] objArr11 = new Object[1];
        b("ﯩ김ﮌ䯱㕦粅紫괖雋ꚩ\ue86c䎺℺\udbd5嫞큼뱍䵽㔙攌", Color.blue(0), objArr11);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr11[0]).intern(), ThreeDS2Service((setMaxEms) setcursorvisible.encryptionPublicKeyFromAssetCertificate()));
        String nqVar = ThreeDS2ServiceInstance2.toString();
        ThreeDS2Service = (ThreeDS2ServiceInstance + 67) % 128;
        return nqVar;
    }

    public abstract void getWarnings(nq nqVar, setMinEms setminems);

    private nq get(setMarqueeRepeatLimit setmarqueerepeatlimit) {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 25) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        b("郝ﶨ邳ܺ暝嘼ㇿ螥", '0' - AndroidCharacter.getMirror('0'), objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setmarqueerepeatlimit.ThreeDS2ServiceInstance());
        Object[] objArr2 = new Object[1];
        a(false, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 20, 0, 9}, objArr2);
        ThreeDS2ServiceInstance2.getWarnings(((String) objArr2[0]).intern(), setmarqueerepeatlimit.get());
        Object[] objArr3 = new Object[1];
        a(true, "\u0001\u0001", new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 2, 51, 0}, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setmarqueerepeatlimit.getWarnings());
        Object[] objArr4 = new Object[1];
        a(true, "\u0001\u0001\u0001\u0001", new int[]{151, 4, 0, 0}, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setmarqueerepeatlimit.initialize());
        get(setmarqueerepeatlimit, ThreeDS2ServiceInstance2);
        ThreeDS2ServiceInstance = (ThreeDS2Service + 117) % 128;
        return ThreeDS2ServiceInstance2;
    }

    private void get(setMarqueeRepeatLimit setmarqueerepeatlimit, nq nqVar) {
        if (setmarqueerepeatlimit instanceof setTitleMarginStart) {
            int i = ThreeDS2Service + 59;
            ThreeDS2ServiceInstance = i % 128;
            if (i % 2 == 0) {
                setTitleMarginStart settitlemarginstart = (setTitleMarginStart) setmarqueerepeatlimit;
                nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
                ThreeDS2ServiceInstance2.ThreeDS2Service(getClass.ThreeDS2ServiceInstance.createTransaction, settitlemarginstart.getSDKInfo().ThreeDS2Service());
                if (settitlemarginstart.ThreeDS2Service() != null) {
                    setTitleMarginStart.getWarnings ThreeDS2Service2 = settitlemarginstart.ThreeDS2Service();
                    nq ThreeDS2ServiceInstance3 = nq.ThreeDS2ServiceInstance();
                    Object[] objArr = new Object[1];
                    b("芒洐苽\ue26a\uf62b\uf05b풠⇦\uefb2旄䇞콶塐ᢁ\uf34e", TextUtils.indexOf("", "", 0), objArr);
                    ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr[0]).intern(), ThreeDS2Service2.getWarnings());
                    Object[] objArr2 = new Object[1];
                    a(false, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, 12, 0, 5}, objArr2);
                    ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr2[0]).intern(), ThreeDS2Service2.ThreeDS2ServiceInstance());
                    Object[] objArr3 = new Object[1];
                    a(false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{167, 12, 0, 6}, objArr3);
                    ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr3[0]).intern(), ThreeDS2Service2.initialize());
                    Object[] objArr4 = new Object[1];
                    a(true, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 9, 0, 0}, objArr4);
                    ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr4[0]).intern(), ThreeDS2Service2.ThreeDS2Service());
                    Object[] objArr5 = new Object[1];
                    b("䫒\ua6f9䪽\uf12b㷂쎷쟡ለ⟭긳劧ﲒ逜퍸\ue006", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr5);
                    ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr5[0]).intern(), ThreeDS2Service2.get());
                    Object[] objArr6 = new Object[1];
                    a(false, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{188, 13, 0, 0}, objArr6);
                    ThreeDS2ServiceInstance2.initialize(((String) objArr6[0]).intern(), ThreeDS2ServiceInstance3);
                }
                if (settitlemarginstart.getSDKVersion() != null) {
                    ThreeDS2ServiceInstance = (ThreeDS2Service + 1) % 128;
                    setTitleMarginStart.initialize sDKVersion = settitlemarginstart.getSDKVersion();
                    nq ThreeDS2ServiceInstance4 = nq.ThreeDS2ServiceInstance();
                    Object[] objArr7 = new Object[1];
                    b("㽱䖺㼒流\ude86ﶙ챞Ⰹ前䵻夁슲\ue5b4」\uebbe八磢ꚛ董", (-1) - TextUtils.lastIndexOf("", '0', 0), objArr7);
                    ThreeDS2ServiceInstance4.ThreeDS2Service(((String) objArr7[0]).intern(), ThreeDS2Service((setMaxEms) sDKVersion.ThreeDS2ServiceInstance()));
                    Object[] objArr8 = new Object[1];
                    b("Ṵ缢ḕἙ\ue412幨⧕运獅矲벀", TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr8);
                    ThreeDS2ServiceInstance2.initialize(((String) objArr8[0]).intern(), ThreeDS2ServiceInstance4);
                    ThreeDS2ServiceInstance = (ThreeDS2Service + 95) % 128;
                }
                Object[] objArr9 = new Object[1];
                a(true, "\u0001\u0001\u0001\u0001", new int[]{151, 4, 0, 0}, objArr9);
                nqVar.initialize(((String) objArr9[0]).intern(), ThreeDS2ServiceInstance2);
                return;
            }
            setTitleMarginStart settitlemarginstart2 = (setTitleMarginStart) setmarqueerepeatlimit;
            nq.ThreeDS2ServiceInstance().ThreeDS2Service(getClass.ThreeDS2ServiceInstance.createTransaction, settitlemarginstart2.getSDKInfo().ThreeDS2Service());
            settitlemarginstart2.ThreeDS2Service();
            throw null;
        }
    }

    public <T extends notify> String ThreeDS2Service(T t) {
        int i = (ThreeDS2Service + 85) % 128;
        ThreeDS2ServiceInstance = i;
        if (t == null) {
            return null;
        }
        ThreeDS2Service = (i + 101) % 128;
        String warnings = t.getWarnings();
        ThreeDS2ServiceInstance = (ThreeDS2Service + 107) % 128;
        return warnings;
    }
}

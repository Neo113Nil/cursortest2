package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class bb extends loadFromXML<LinearLayout> implements containsValue, getServices {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final ArrayList<String> ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static int[] cleanup;
    private static int createTransaction;
    private static int getSDKInfo;
    private final Set<String> ThreeDS2ServiceInitializationCallback;
    private final jr get;
    private LinearLayout getSDKVersion;
    private final Set<String> getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        createTransaction = 1;
        get();
        Object[] objArr = new Object[1];
        a(new int[]{203202140, 1105650222, 814330144, 1282008031, -849468597, -1109199554, -2006909490, 1621278365, 293646222, 414265772, 62052744, 293335323, 137452151, 1395710948, -1796898196, -11376012, 750010068, -1593886546, 767345120, -1208244277}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        ThreeDS2Service = new ArrayList<String>() { // from class: com.netcetera.threeds.sdk.infrastructure.bb.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static long get;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                get = -8966637125822476891L;
            }

            {
                Object[] objArr2 = new Object[1];
                a("趒蛢魦꿬ꁱ듳쥽\uddcb홌\ueafdｊ\uf3d1Ѫ\u18adⴣ↥㨭亶䌲垾栊粃焼薏鸜銞\ua7ea롫쳱셁헲\uee7a\ue2f7\uf745௸ᰐ", 2938 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
                add(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                a("趒\u1af6ꍎ䯐퀡碿ąꦟ㛬\udf49柒ౝ钚㴱얋刑ﭭ菂⡚낢夺\ue18f踤\u177b뿼䑊\uecd2甧ᶡ\uaa3d㊚\udbee恷࣑鄐㧭", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38766, objArr3);
                add(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                a("趒䡶َ\udc50騡倿⸅\ue41fꋬ磉㛒ೝ쪚肱庋ᒑ퍭ꥂ杚㴢ךּ넏輤䗻ϼ\ud9ca韒涧⮡\ue1bd뾚穮ぷ๑쐐艮", 50671 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr4);
                add(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                a("趒\uded8⬒瑞삙ⷑ縙쭑វ惧촎ṓ檢럟\u0017浟릍ૌ圆ꁌಂ姁\uaa38\uf755䎌계癩䩉隙\ue3f3䰆饀\ue5b7㛿茌\uec21", 21312 - ExpandableListView.getPackedPositionChild(0L), objArr5);
                add(((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                a("趒昲嫆亜⌱ៃ\u0b9dﰻ탌쒭뤪귁膪稽滃䊕㜭⯆ᾒ\uf02e\ue4ca\ud893촜ꇟ閜踮拊嚛䬱㿱᎒Ъ\uf8f7\uec95섘떤", ExpandableListView.getPackedPositionType(0L) + 60331, objArr6);
                add(((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                a("趒\u10cc뜺婢\uf8c9鼽≡샅朼\u0a53꣖伿퉒烃\u173f멫壍Ｘ艮⃐윲橭࣠꼡㉬탐眶ᩥ룉式\ue26e胔✷쩫棤ཛ", ((Process.getThreadPriority(0) + 20) >> 6) + 40277, objArr7);
                add(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                a("趒醾뗞\ud9e8ﴁŗ╵䢇沬烱鐂렵\udc7a\ue069\u07bb⯙俭匊眪魺뺚슧\ue6f4ਃ⸼㉒噢疏駁뷅섊\ue526ॷⲙむ咒", 7207 - TextUtils.indexOf("", ""), objArr8);
                add(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                a("趒䂦\u17ee\uea20륡辯䋥ᄯ\ue46c몙觲尭ፚ\ue1a1듫謡幭Ⲳ\ue3fa똲蕺宿⻄ﴫ끼蚺嗲⠷｡춍胺圾⩷\uf881쿰艛", 52544 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr9);
                add(((String) objArr9[0]).intern());
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(String str, int i, Object[] objArr2) {
                Throwable cause;
                int i2;
                Object method;
                char[] charArray = str != null ? str.toCharArray() : str;
                addParam addparam = new addParam();
                addparam.initialize = i;
                int length = charArray.length;
                long[] jArr = new long[length];
                addparam.ThreeDS2Service = 0;
                while (true) {
                    int i3 = addparam.ThreeDS2Service;
                    if (i3 >= charArray.length) {
                        break;
                    }
                    try {
                        Object[] objArr3 = {Integer.valueOf(charArray[i3]), addparam, addparam};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-983980093);
                        if (obj != null) {
                            i2 = 1;
                            method = obj;
                        } else {
                            i2 = 1;
                            method = ((Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 66, (char) (ViewConfiguration.getPressedStateDuration() >> 16), View.getDefaultSize(0, 0) + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                            map.put(-983980093, method);
                        }
                        jArr[i3] = ((Long) ((Method) method).invoke(null, objArr3)).longValue() ^ (get ^ 6009743645011411028L);
                        Object[] objArr4 = new Object[2];
                        objArr4[i2] = addparam;
                        objArr4[0] = addparam;
                        Object obj2 = map.get(-1840119381);
                        if (obj2 == null) {
                            Class cls = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 76, (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62097), 2102 - TextUtils.indexOf("", ""));
                            Object[] objArr5 = new Object[i2];
                            b((byte) -1, 0, (byte) 0, objArr5);
                            obj2 = cls.getMethod((String) objArr5[0], Object.class, Object.class);
                            map.put(-1840119381, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
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
                char[] cArr = new char[length];
                addparam.ThreeDS2Service = 0;
                $11 = ($10 + 23) % 128;
                while (true) {
                    int i4 = addparam.ThreeDS2Service;
                    if (i4 >= charArray.length) {
                        break;
                    }
                    cArr[i4] = (char) jArr[i4];
                    Object[] objArr6 = {addparam, addparam};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(-1840119381);
                    if (obj3 == null) {
                        Class cls2 = (Class) removeParam.initialize(76 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (62096 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetBefore("", 0) + 2102);
                        Object[] objArr7 = new Object[1];
                        b((byte) -1, 0, (byte) 0, objArr7);
                        obj3 = cls2.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1840119381, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                    $10 = ($11 + 101) % 128;
                }
                String str2 = new String(cArr);
                int i5 = $11 + 5;
                $10 = i5 % 128;
                if (i5 % 2 == 0) {
                    objArr2[0] = str2;
                } else {
                    int i6 = 88 / 0;
                    objArr2[0] = str2;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, int i, byte b2, Object[] objArr2) {
                int i2;
                int i3;
                int i4 = b + 4;
                int i5 = 99 - (i * 2);
                int i6 = b2 * 3;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i6 + 1];
                if (bArr == null) {
                    i2 = i4;
                    int i7 = i6;
                    int i8 = 0;
                    i4 += -i7;
                    i3 = i8;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i7 = bArr[i2];
                    i4 += -i7;
                    i3 = i8;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                    }
                } else {
                    i2 = i4;
                    i4 = i5;
                    i3 = 0;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{93, 117, 76, -7};
                $$b = 60;
            }
        };
        int i = createTransaction + 39;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public bb(Context context, jr jrVar) {
        super(context);
        this.get = jrVar;
        this.getWarnings = new HashSet();
        this.ThreeDS2ServiceInitializationCallback = new HashSet();
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        long j;
        Object method;
        char c;
        int[] iArr2;
        int i3;
        int i4;
        Object method2;
        int i5;
        char[] cArr;
        Object method3;
        int[] iArr3 = iArr;
        createTransaction createtransaction = new createTransaction();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr3.length * 2];
        int[] iArr4 = cleanup;
        Class cls = Integer.TYPE;
        byte b = 0;
        if (iArr4 != null) {
            int length = iArr4.length;
            i2 = 2;
            int[] iArr5 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i6])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i5 = i6;
                        method3 = obj;
                        cArr = cArr2;
                    } else {
                        i5 = i6;
                        cArr = cArr2;
                        Class cls2 = (Class) removeParam.initialize(Color.blue(0) + 64, (char) (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1197);
                        Object[] objArr3 = new Object[1];
                        b((short) 0, (byte) 0, (short) 0, objArr3);
                        method3 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method3);
                    }
                    iArr5[i5] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i6 = i5 + 1;
                    cArr2 = cArr;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        } else {
            i2 = 2;
        }
        char[] cArr4 = cArr2;
        int i7 = 16;
        int length2 = iArr4.length;
        int[] iArr6 = new int[length2];
        int[] iArr7 = cleanup;
        if (iArr7 != null) {
            $10 = ($11 + 79) % 128;
            int length3 = iArr7.length;
            int[] iArr8 = new int[length3];
            int i8 = 0;
            j = 0;
            while (i8 < length3) {
                $11 = ($10 + 103) % 128;
                Object[] objArr4 = {Integer.valueOf(iArr7[i8])};
                byte b2 = b;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    iArr2 = iArr7;
                    i4 = length3;
                    method2 = obj2;
                    i3 = i8;
                } else {
                    iArr2 = iArr7;
                    i3 = i8;
                    i4 = length3;
                    Class cls3 = (Class) removeParam.initialize(64 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ExpandableListView.getPackedPositionForGroup(b2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(b2) == 0L ? 0 : -1)), 1197 - TextUtils.getTrimmedLength(""));
                    Object[] objArr5 = new Object[1];
                    b(b2, b2, b2, objArr5);
                    method2 = cls3.getMethod((String) objArr5[b2], cls);
                    map2.put(2095751688, method2);
                }
                iArr8[i3] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i8 = i3 + 1;
                iArr7 = iArr2;
                length3 = i4;
                b = 0;
            }
            iArr7 = iArr8;
        } else {
            j = 0;
        }
        byte b3 = b;
        System.arraycopy(iArr7, b3, iArr6, b3, length2);
        createtransaction.initialize = b3;
        while (true) {
            int i9 = createtransaction.initialize;
            if (i9 >= iArr3.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            $11 = ($10 + 113) % 128;
            int i10 = iArr3[i9];
            char c2 = (char) (i10 >> 16);
            cArr4[0] = c2;
            char c3 = (char) i10;
            cArr4[1] = c3;
            char c4 = (char) (iArr3[i9 + 1] >> 16);
            cArr4[i2] = c4;
            char c5 = (char) iArr3[i9 + 1];
            char c6 = 3;
            cArr4[3] = c5;
            createtransaction.getWarnings = (c2 << 16) + c3;
            createtransaction.get = (c4 << 16) + c5;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i11 = 0;
            while (i11 < i7) {
                int i12 = $11 + 43;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = createtransaction.getWarnings;
                if (i13 != 0) {
                    int i15 = iArr6[i11] ^ i14;
                    createtransaction.getWarnings = i15;
                    int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i15);
                    Object[] objArr6 = new Object[4];
                    objArr6[c6] = createtransaction;
                    objArr6[i2] = createtransaction;
                    objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                    objArr6[0] = createtransaction;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-411264147);
                    if (obj3 != null) {
                        c = c6;
                    } else {
                        c = c6;
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getTrimmedLength("") + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                        map3.put(-411264147, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    createtransaction.getWarnings = createtransaction.get;
                    createtransaction.get = intValue;
                    i11 += 59;
                } else {
                    c = c6;
                    int i16 = iArr6[i11] ^ i14;
                    createtransaction.getWarnings = i16;
                    int ThreeDS2Service3 = createTransaction.ThreeDS2Service(i16);
                    Object[] objArr7 = new Object[4];
                    objArr7[c] = createtransaction;
                    objArr7[i2] = createtransaction;
                    objArr7[1] = Integer.valueOf(ThreeDS2Service3);
                    objArr7[0] = createtransaction;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-411264147);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(49 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 13120 - TextUtils.lastIndexOf("", '0', 0))).getMethod("y", Object.class, cls, Object.class, Object.class);
                        map4.put(-411264147, obj4);
                    }
                    int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr7)).intValue();
                    createtransaction.getWarnings = createtransaction.get;
                    createtransaction.get = intValue2;
                    i11++;
                }
                c6 = c;
                i7 = 16;
            }
            char c7 = c6;
            int i17 = createtransaction.getWarnings;
            int i18 = createtransaction.get;
            createtransaction.getWarnings = i18;
            createtransaction.get = i17;
            int i19 = i17 ^ iArr6[16];
            createtransaction.get = i19;
            int i20 = i18 ^ iArr6[17];
            createtransaction.getWarnings = i20;
            cArr4[0] = (char) (i20 >>> 16);
            cArr4[1] = (char) i20;
            cArr4[i2] = (char) (i19 >>> 16);
            cArr4[c7] = (char) i19;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i21 = createtransaction.initialize;
            cArr3[i21 * 2] = cArr4[0];
            cArr3[(i21 * 2) + 1] = cArr4[1];
            cArr3[(i21 * 2) + 2] = cArr4[i2];
            cArr3[(i21 * 2) + 3] = cArr4[c7];
            int i22 = i2;
            Object[] objArr8 = new Object[i22];
            objArr8[1] = createtransaction;
            objArr8[0] = createtransaction;
            Map map5 = removeParam.visaSchemeConfiguration;
            Object obj5 = map5.get(-1870831722);
            if (obj5 != null) {
                method = obj5;
                i7 = 16;
            } else {
                i7 = 16;
                Class cls4 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 100, (char) View.resolveSizeAndState(0, 0, 0), 1880 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr9 = new Object[1];
                b((short) 0, (byte) 0, (short) 1, objArr9);
                method = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map5.put(-1870831722, method);
            }
            ((Method) method).invoke(null, objArr8);
            i2 = i22;
            iArr3 = iArr;
        }
    }

    private /* synthetic */ void aI_(String[] strArr, int i, String[] strArr2, CompoundButton compoundButton, boolean z) {
        if (!compoundButton.isChecked()) {
            this.getWarnings.remove(strArr[i]);
            this.ThreeDS2ServiceInitializationCallback.remove(strArr2[i]);
        } else {
            getSDKInfo = (createTransaction + 21) % 128;
            this.getWarnings.add(strArr[i]);
            this.ThreeDS2ServiceInitializationCallback.add(strArr2[i]);
            getSDKInfo = (createTransaction + 59) % 128;
        }
    }

    public static /* synthetic */ void aJ_(bb bbVar, String[] strArr, int i, String[] strArr2, CompoundButton compoundButton, boolean z) {
        getSDKInfo = (createTransaction + 63) % 128;
        bbVar.aI_(strArr, i, strArr2, compoundButton, z);
        createTransaction = (getSDKInfo + 115) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3 = 1 - (s * 2);
        int i4 = (s2 * 5) + 113;
        int i5 = 3 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            i6 = bArr[i5];
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static void get() {
        cleanup = new int[]{-1626001686, 528497578, -897100102, 1198225741, 635681879, -1570835048, 1895701896, -1770613063, -776328612, -1854851395, -461292869, -1996610513, -1482773545, 137015825, 1034836079, 1341676829, 479068849, 1797264513};
    }

    public static void init$0() {
        $$a = new byte[]{7, Byte.MAX_VALUE, -125, 18};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        initialize();
        List<setTextIsSelectable> amexConfiguration = setscroller.amexConfiguration();
        this.getWarnings.clear();
        this.getSDKVersion.removeAllViews();
        if (amexConfiguration == null || amexConfiguration.isEmpty()) {
            int i = getSDKInfo + 77;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        int size = amexConfiguration.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[amexConfiguration.size()];
        int i2 = 0;
        while (i2 < amexConfiguration.size()) {
            int i3 = getSDKInfo + 47;
            createTransaction = i3 % 128;
            if (i3 % 2 == 0) {
                strArr[i2] = amexConfiguration.get(i2).get();
                strArr2[i2] = amexConfiguration.get(i2).getWarnings();
                i2 += 70;
            } else {
                strArr[i2] = amexConfiguration.get(i2).get();
                strArr2[i2] = amexConfiguration.get(i2).getWarnings();
                i2++;
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            CheckBox checkBox = new CheckBox(this.getSDKVersion.getContext());
            int i5 = es.ThreeDS2Service;
            checkBox.setPadding(0, i5, 0, i5);
            checkBox.setMinHeight(es.getSDKInfo);
            checkBox.setText(strArr[i4]);
            checkBox.setOnCheckedChangeListener(new bk(this, strArr2, i4, strArr));
            ArrayList<String> arrayList = ThreeDS2Service;
            if (i4 < arrayList.size()) {
                getWarnings(checkBox, arrayList.get(i4));
            }
            et.bm_(checkBox, this.get);
            this.getSDKVersion.addView(checkBox);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getServices
    public size ThreeDS2ServiceInstance() {
        String str;
        if (this.getWarnings.isEmpty()) {
            str = "";
        } else {
            ArrayList arrayList = new ArrayList(this.getWarnings);
            Collections.sort(arrayList);
            Object[] objArr = new Object[1];
            a(new int[]{379456192, -412502719}, 1 - View.resolveSizeAndState(0, 0, 0), objArr);
            str = oj.ThreeDS2Service(arrayList, ((String) objArr[0]).intern());
            getSDKInfo = (createTransaction + 43) % 128;
        }
        bg bgVar = new bg(str);
        getSDKInfo = (createTransaction + 1) % 128;
        return bgVar;
    }

    public LinearLayout aH_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        int i = es.getSDKVersion;
        linearLayout.setPadding(i, es.initialize, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.getSDKVersion = linearLayout2;
        linearLayout2.setLayoutParams((LinearLayout.LayoutParams) eu.ThreeDS2Service(new Object[0], -691514327, 691514327, (int) System.currentTimeMillis()));
        this.getSDKVersion.setOrientation(1);
        linearLayout.addView(this.getSDKVersion);
        int i2 = createTransaction + 107;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        initialize();
        Object[] objArr = new Object[1];
        a(new int[]{203202140, 1105650222, 814330144, 1282008031, -849468597, -1109199554, -2006909490, 1621278365, 293646222, 414265772, 62052744, 293335323, 137452151, 1395710948, -1796898196, -11376012, 750010068, -1593886546, 767345120, -1208244277}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, objArr);
        List<String> ThreeDS2ServiceInstance2 = erVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), new ArrayList());
        if (ThreeDS2ServiceInstance2.isEmpty()) {
            int i = createTransaction + 125;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        for (int i2 = 0; i2 < this.getSDKVersion.getChildCount(); i2++) {
            CheckBox checkBox = (CheckBox) this.getSDKVersion.getChildAt(i2);
            Iterator<String> it = ThreeDS2ServiceInstance2.iterator();
            while (it.hasNext()) {
                if (oj.initialize(it.next(), checkBox.getText())) {
                    getSDKInfo = (createTransaction + 37) % 128;
                    checkBox.setChecked(true);
                }
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        createTransaction = (getSDKInfo + 31) % 128;
        LinearLayout aH_ = aH_(context);
        createTransaction = (getSDKInfo + 83) % 128;
        return aH_;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r4 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r1.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r3 = new java.lang.Object[1];
        a(new int[]{203202140, 1105650222, 814330144, 1282008031, -849468597, -1109199554, -2006909490, 1621278365, 293646222, 414265772, 62052744, 293335323, 137452151, 1395710948, -1796898196, -11376012, 750010068, -1593886546, 767345120, -1208244277}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 37, r3);
        r5.ThreeDS2Service(((java.lang.String) r3[0]).intern(), new java.util.ArrayList(r4.ThreeDS2ServiceInitializationCallback));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.bb.createTransaction + 13;
        com.netcetera.threeds.sdk.infrastructure.bb.getSDKInfo = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(eq eqVar) {
        int i = createTransaction + 23;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        Set<String> set = this.ThreeDS2ServiceInitializationCallback;
        if (i2 != 0) {
            boolean isEmpty = set.isEmpty();
            int i3 = 18 / 0;
        }
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class getCause implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ConfigParameters = 0;
    public static final getCause ThreeDS2Service;
    private static final /* synthetic */ getCause[] ThreeDS2ServiceInitializationCallback;
    public static final getCause ThreeDS2ServiceInstance;
    private static int addParam = 0;
    public static final getCause createTransaction;
    public static final getCause get;
    private static int getParamValue = 0;
    public static final getCause getSDKInfo;
    private static long getSDKVersion = 0;
    public static final getCause getWarnings;
    public static final getCause initialize;
    private static int onCompleted = 1;
    private static char onError;
    private final String cleanup;

    static {
        get();
        Object[] objArr = new Object[1];
        b(17 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0003￼\ufffa\u0005\ufff8\ufffa\u0016\t￼\ufffb\u0003\u0006\uffff\ufffb\t\ufff8\ufffa", true, 139 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(2 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0001\u0000", true, 115 - TextUtils.getOffsetBefore("", 0), 2 - TextUtils.indexOf("", ""), objArr2);
        ThreeDS2ServiceInstance = new getCause(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b(16 - View.resolveSizeAndState(0, 0, 0), "\ufff7\u0013\u0006\ufff9\b\u0007\ufff9\t\u0005\ufff9\u0006\u0000\ufff9\ufff7\u0002\ufff5", true, (KeyEvent.getMaxKeyCode() >> 16) + EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 11 - Drawable.resolveOpacity(0, 0), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, "\u0001\uffff", true, (Process.myTid() >> 22) + 116, (KeyEvent.getMaxKeyCode() >> 16) + 2, objArr4);
        initialize = new getCause(intern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20, "\ufffb\ufffa\n\b\ufff7\u0004\t\ufff7\ufff9\n\uffff\u0005\u0004\u0015\ufff7\ufff8\ufff7\u0004\ufffa\u0005\u0004", false, View.MeasureSpec.getSize(0) + EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 3 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, "\u0002\uffff", false, 117 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.resolveSize(0, 0) + 1, objArr6);
        ThreeDS2Service = new getCause(intern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a("\ue281翭帺켆", (-1301017929) - Drawable.resolveOpacity(0, 0), (char) (21071 - (ViewConfiguration.getLongPressTimeout() >> 16)), "ᾘ╅\ueb7a嶞\uf31a缜腚\uf2e3㲳╤仜툑讨얣逮ሔᝥᲅ\ue4e4", "럵琊侲潒", objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, "\ufffe\u0002", false, 117 - View.resolveSize(0, 0), 2 - (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
        getWarnings = new getCause(intern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a("\ue281翭帺켆", Drawable.resolveOpacity(0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 48697), "緞㽼殮㐆\udcef将ૌ\uddbf暛ꂧ绊㱧⟤\uf4de盞줜쳧尾", "ￕ⼗㥝\uf1be", objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, "\ufffe\u0003", true, 116 - ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
        get = new getCause(intern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a("\ue281翭帺켆", (-692076751) - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.lastIndexOf("", '0', 0) + IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION), "\ueecf䎊旤\uea7e➵ں삐甲㑛嵥瀆\uf152廤毵竉\u0a3d昝", "㊋뾿\uf0d6樃", objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(3 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "�\u0003", true, TextUtils.getTrimmedLength("") + 118, View.MeasureSpec.getSize(0) + 1, objArr12);
        createTransaction = new getCause(intern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a("\ue281翭帺켆", TextUtils.lastIndexOf("", '0', 0) - 1801161474, (char) (ImageFormat.getBitsPerPixel(0) + 1), "뵍䩢녶뜽ṥᰙ圕", "ﴩꑴ㒔\uead1", objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(AndroidCharacter.getMirror('0') - '.', "\u0004�", true, 117 - TextUtils.lastIndexOf("", '0', 0), '2' - AndroidCharacter.getMirror('0'), objArr14);
        getSDKInfo = new getCause(intern7, 6, ((String) objArr14[0]).intern());
        ThreeDS2ServiceInitializationCallback = ThreeDS2ServiceInstance();
        addParam = (onCompleted + 5) % 128;
    }

    private getCause(String str, int i, String str2) {
        this.cleanup = str2;
    }

    private static /* synthetic */ getCause[] ThreeDS2ServiceInstance() {
        int i = addParam + 55;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return new getCause[]{ThreeDS2ServiceInstance, initialize, ThreeDS2Service, getWarnings, get, createTransaction, getSDKInfo};
        }
        getCause[] getcauseArr = new getCause[41];
        getcauseArr[0] = ThreeDS2ServiceInstance;
        getcauseArr[1] = initialize;
        getcauseArr[5] = ThreeDS2Service;
        getcauseArr[5] = getWarnings;
        getcauseArr[2] = get;
        getcauseArr[3] = createTransaction;
        getcauseArr[105] = getSDKInfo;
        return getcauseArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            $10 = ($11 + 93) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr4 = new char[length];
        int length2 = charArray2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(charArray, 0, cArr4, 0, length);
        System.arraycopy(charArray2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        int i5 = 2;
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        $10 = ($11 + 53) % 128;
        while (configParameters.initialize < length3) {
            $10 = ($11 + 29) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                int i6 = i5;
                if (obj != null) {
                    cArr2 = cArr3;
                    i2 = length3;
                } else {
                    cArr2 = cArr3;
                    i2 = length3;
                    obj = ((Class) removeParam.initialize(58 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Process.myPid() >> 22), 6414 - TextUtils.getCapsMode("", i4, i4))).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    i3 = i4;
                } else {
                    i3 = i4;
                    obj2 = ((Class) removeParam.initialize(63 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (11345 - View.getDefaultSize(i4, i4)), 8578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i6] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i3] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num = num3;
                    num2 = num4;
                } else {
                    num = num3;
                    num2 = num4;
                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 74, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 9820 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i8 = cArr4[intValue2] * 32718;
                char c2 = cArr5[intValue];
                i5 = i6;
                Object[] objArr5 = new Object[i5];
                objArr5[1] = Integer.valueOf(c2);
                objArr5[i3] = Integer.valueOf(i8);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    int i9 = i3;
                    obj4 = ((Class) removeParam.initialize(48 - ExpandableListView.getPackedPositionType(0L), (char) (63349 - TextUtils.lastIndexOf("", '0', i9, i9)), 11536 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[intValue2] = configParameters.get;
                int i10 = configParameters.initialize;
                cArr6[i10] = (char) ((((r2 ^ cArr2[i10]) ^ (getSDKVersion ^ (-8880716800597159563L))) ^ ((int) (ConfigParameters ^ (-8880716800597159563L)))) ^ ((char) (onError ^ (-8880716800597159563L))));
                configParameters.initialize = i10 + 1;
                $11 = ($10 + 41) % 128;
                cArr3 = cArr2;
                length3 = i2;
                num3 = num;
                num4 = num2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, String str, boolean z, int i2, int i3, Object[] objArr) {
        int i4;
        Throwable cause;
        int i5;
        $11 = ($10 + 13) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i) {
                break;
            }
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i2 + c);
            cArr[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getParamValue);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(68 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (View.getDefaultSize(i6, i6) + 45769), 4879 - KeyEvent.normalizeMetaState(i5));
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i8 = i5;
                    obj2 = ((Class) removeParam.initialize(60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) View.resolveSizeAndState(i8, i8, i8), Color.green(i8) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = 0;
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
        if (i3 > 0) {
            getsdkinfo.get = i3;
            char[] cArr2 = new char[i];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr2, i10, cArr, 0, i - i10);
            $10 = ($11 + 57) % 128;
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr3 = new char[i];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i) {
                    break;
                }
                cArr3[i11] = cArr[(i - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - View.getDefaultSize(0, 0), (char) KeyEvent.keyCodeFromString(""), 12373 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                $10 = ($11 + 35) % 128;
            }
            cArr = cArr3;
        }
        String str2 = new String(cArr);
        $11 = ($10 + 107) % 128;
        objArr[0] = str2;
    }

    public static void get() {
        getSDKVersion = 5460338730931713012L;
        ConfigParameters = 898634101;
        onError = (char) 4469;
        getParamValue = 1141902401;
    }

    public static getCause valueOf(String str) {
        int i = addParam + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return (getCause) Enum.valueOf(getCause.class, str);
        }
        Enum.valueOf(getCause.class, str);
        throw null;
    }

    public static getCause[] values() {
        addParam = (onCompleted + 35) % 128;
        getCause[] getcauseArr = (getCause[]) ThreeDS2ServiceInitializationCallback.clone();
        int i = onCompleted + 25;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getcauseArr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = (addParam + 3) % 128;
        onCompleted = i;
        String str = this.cleanup;
        int i2 = i + 27;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object[] objArr = new Object[1];
        a("\ue281翭帺켆", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (char) (7741 - Color.red(0)), "渋鼌풒苒ꑈ巗쁶პ啮ၪ殑焜澠\uaac9뽡ᛅ", "༔㊄㴢蔞", objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("\ue281翭帺켆", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1137745944, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3992), "ຫȰ껛픱뎎\uda64䇃\u0bbc췼禽῀풦Ʊ읆겔\ueb1b㚙", "ᠴ킠靃瀏", objArr2);
        sb.append(((String) objArr2[0]).intern());
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cleanup, "'}");
        int i = addParam + 87;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return m;
        }
        throw null;
    }
}

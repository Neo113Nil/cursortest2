package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class mq {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final getWarnings ThreeDS2ServiceInstance;
    private final int getWarnings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long ThreeDS2Service;
        public static final getWarnings ThreeDS2ServiceInstance;
        private static int get;
        private static int getSDKInfo;
        private static final /* synthetic */ getWarnings[] getWarnings;
        public static final getWarnings initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            get = 0;
            getSDKInfo = 1;
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            a("渷֮뤑ⲉ쁭矶", 27538 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            ThreeDS2ServiceInstance = new getWarnings(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a("渡ֵ뤷Ⲽ쀔", 27530 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            initialize = new getWarnings(((String) objArr2[0]).intern(), 1);
            getWarnings = get();
            getSDKInfo = (get + 9) % 128;
        }

        private getWarnings(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2Service = -7247087999936008656L;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            Throwable cause;
            int i2;
            Object method;
            if (str != null) {
                $10 = ($11 + 29) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            addParam addparam = new addParam();
            addparam.initialize = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            addparam.ThreeDS2Service = 0;
            while (true) {
                int i3 = addparam.ThreeDS2Service;
                if (i3 >= cArr2.length) {
                    break;
                }
                $11 = ($10 + 89) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3]), addparam, addparam};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        i2 = 1;
                        method = obj;
                    } else {
                        i2 = 1;
                        method = ((Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 65, (char) (ViewConfiguration.getTouchSlop() >> 8), 12510 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i3] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (ThreeDS2Service ^ 6009743645011411028L);
                    Object[] objArr3 = new Object[2];
                    objArr3[i2] = addparam;
                    objArr3[0] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        Class cls = (Class) removeParam.initialize(76 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 62097), TextUtils.indexOf((CharSequence) "", '0') + 2103);
                        Object[] objArr4 = new Object[i2];
                        b((short) 0, (short) 0, (short) 0, objArr4);
                        obj2 = cls.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                    $10 = ($11 + 51) % 128;
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
            char[] cArr3 = new char[length];
            addparam.ThreeDS2Service = 0;
            while (true) {
                int i4 = addparam.ThreeDS2Service;
                if (i4 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                $10 = ($11 + 81) % 128;
                cArr3[i4] = (char) jArr[i4];
                Object[] objArr5 = {addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-1840119381);
                if (obj3 == null) {
                    Class cls2 = (Class) removeParam.initialize(76 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (KeyEvent.keyCodeFromString("") + 62097), 2102 - Color.blue(0));
                    Object[] objArr6 = new Object[1];
                    b((short) 0, (short) 0, (short) 0, objArr6);
                    obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                    map2.put(-1840119381, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, short s2, short s3, Object[] objArr) {
            int i;
            int i2;
            int i3 = 99 - (s3 * 2);
            int i4 = 1 - (s * 4);
            byte[] bArr = $$a;
            int i5 = 4 - (s2 * 3);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i2 = 0;
                int i6 = i3;
                int i7 = i5;
                int i8 = i7 + 1;
                i3 = i5 + i6;
                i5 = i8;
                bArr = bArr3;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i9 = i3;
                i7 = i5;
                i5 = bArr[i5];
                bArr3 = bArr;
                i6 = i9;
                int i82 = i7 + 1;
                i3 = i5 + i6;
                i5 = i82;
                bArr = bArr3;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        private static /* synthetic */ getWarnings[] get() {
            int i = get + 15;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                return new getWarnings[]{ThreeDS2ServiceInstance, initialize};
            }
            getWarnings[] getwarningsArr = new getWarnings[3];
            getwarningsArr[1] = ThreeDS2ServiceInstance;
            getwarningsArr[1] = initialize;
            return getwarningsArr;
        }

        public static void init$0() {
            $$a = new byte[]{96, PnmConstants.PPM_RAW_CODE, 36, PnmConstants.PGM_RAW_CODE};
            $$b = EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE;
        }

        public static getWarnings valueOf(String str) {
            int i = getSDKInfo + 73;
            get = i % 128;
            if (i % 2 != 0) {
                Enum.valueOf(getWarnings.class, str);
                throw null;
            }
            getWarnings getwarnings = (getWarnings) Enum.valueOf(getWarnings.class, str);
            int i2 = get + 115;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                return getwarnings;
            }
            throw null;
        }

        public static getWarnings[] values() {
            getWarnings[] getwarningsArr;
            int i = get + 51;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                getwarningsArr = (getWarnings[]) getWarnings.clone();
                int i2 = 76 / 0;
            } else {
                getwarningsArr = (getWarnings[]) getWarnings.clone();
            }
            int i3 = getSDKInfo + 51;
            get = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 31 / 0;
            }
            return getwarningsArr;
        }
    }

    private mq(getWarnings getwarnings, int i) {
        this.ThreeDS2ServiceInstance = getwarnings;
        this.getWarnings = i;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i3);
        int i6 = ~i3;
        int i7 = ((i5 | (~(i6 | i2))) * (-1808)) + (i2 * (-903)) + (i * 905);
        int i8 = ~i2;
        int i9 = i | i6;
        if ((((~i9) | (~(i2 | i4)) | (~(i3 | i8))) * 904) + (((~(i9 | i2)) | (~(i4 | i8 | i3))) * 904) + i7 == 1) {
            mq mqVar = new mq(getWarnings.ThreeDS2ServiceInstance, 0);
            int i10 = get;
            ThreeDS2Service = ((i10 & 57) + (i10 | 57)) % 128;
            return mqVar;
        }
        mq mqVar2 = new mq(getWarnings.initialize, ((Number) objArr[0]).intValue());
        int i11 = ThreeDS2Service;
        int i12 = i11 & 93;
        get = ((((i11 ^ 93) | i12) << 1) - ((i11 | 93) & (~i12))) % 128;
        return mqVar2;
    }

    public static mq getWarnings(int i) {
        return (mq) get(new Object[]{Integer.valueOf(i)}, 385114565, -385114565, i);
    }

    public int initialize() {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 15) | (i & 15)) << 1;
        int i3 = -(((~i) & 15) | (i & (-16)));
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.getWarnings;
        if (i5 != 0) {
            return i6;
        }
        throw null;
    }

    public static mq getWarnings() {
        return (mq) get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis());
    }

    public getWarnings get() {
        int i = get;
        int i2 = i & 75;
        int i3 = ((i ^ 75) | i2) << 1;
        int i4 = -((i | 75) & (~i2));
        int i5 = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        ThreeDS2Service = i5;
        getWarnings getwarnings = this.ThreeDS2ServiceInstance;
        int i6 = i5 & 49;
        int i7 = ((i5 ^ 49) | i6) << 1;
        int i8 = -((~i6) & (i5 | 49));
        get = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
        return getwarnings;
    }
}

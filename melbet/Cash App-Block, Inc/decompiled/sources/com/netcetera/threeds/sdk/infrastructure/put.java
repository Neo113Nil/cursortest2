package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class put implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final put ThreeDS2Service;
    private static long ThreeDS2ServiceInitializationCallback;

    @Deprecated
    public static final put ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int createTransaction;
    public static final put get;
    private static final /* synthetic */ put[] getSDKInfo;
    public static final put initialize;
    private String getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        createTransaction = 0;
        cleanup = 1;
        initialize();
        Object[] objArr = new Object[1];
        a("鸔䴙㢠\ue449", View.getDefaultSize(0, 0) + 54121, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("鹰碑嘼눙\u0eee", 25638 - MotionEvent.axisFromString(""), objArr2);
        ThreeDS2ServiceInstance = new put(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("鸔숷⛽誧", (ViewConfiguration.getFadingEdgeLength() >> 16) + 23623, objArr3);
        ThreeDS2Service = new put(((String) objArr3[0]).intern(), 1, setCacheColorHint.getWarnings.getWarnings.getWarnings());
        Object[] objArr4 = new Object[1];
        a("鸔꧓\uf136㢛", (ViewConfiguration.getJumpTapTimeout() >> 16) + 14243, objArr4);
        get = new put(((String) objArr4[0]).intern(), 2, setCacheColorHint.getWarnings.ThreeDS2ServiceInstance.getWarnings());
        Object[] objArr5 = new Object[1];
        a("鸔\u0cc9묃♘", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37561, objArr5);
        initialize = new put(((String) objArr5[0]).intern(), 3, setCacheColorHint.getWarnings.get.getWarnings());
        getSDKInfo = ThreeDS2ServiceInstance();
        createTransaction = (cleanup + 9) % 128;
    }

    private put(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    public static put ThreeDS2ServiceInstance(setCacheColorHint.getWarnings getwarnings) {
        String name;
        put[] values;
        int length;
        if (getwarnings != null) {
            int i = cleanup + 125;
            createTransaction = i % 128;
            if (i % 2 != 0) {
                values = values();
                length = values.length;
            } else {
                values = values();
                length = values.length;
            }
            for (int i2 = 0; i2 < length; i2++) {
                put putVar = values[i2];
                if (putVar.getWarnings.equals(getwarnings.getWarnings())) {
                    createTransaction = (cleanup + 5) % 128;
                    return putVar;
                }
            }
        }
        setTextAlignment settextalignment = setTextAlignment.mastercardSchemeConfiguration;
        if (getwarnings == null) {
            Object[] objArr = new Object[1];
            a("鸬ﬦ同넝", View.getDefaultSize(0, 0) + 25873, objArr);
            name = ((String) objArr[0]).intern();
        } else {
            name = getwarnings.name();
        }
        throw settextalignment.initialize(name);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        float f;
        Throwable cause;
        int i2;
        short s;
        int i3 = 2;
        if (str != null) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        short s2 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= cArr2.length) {
                break;
            }
            $10 = ($11 + 11) % 128;
            char c = cArr2[i5];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[s2] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    s = s2;
                    i2 = 1;
                } else {
                    i2 = 1;
                    s = s2;
                    Method method = ((Class) removeParam.initialize(66 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 12512 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                    obj = method;
                }
                jArr[i5] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (ThreeDS2ServiceInitializationCallback ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[s] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    short s3 = s;
                    Class cls = (Class) removeParam.initialize(76 - TextUtils.getTrimmedLength(""), (char) (TextUtils.lastIndexOf("", '0', s3) + 62098), 2101 - TextUtils.indexOf((CharSequence) "", '0', (int) s3, (int) s3));
                    Object[] objArr4 = new Object[i2];
                    b(s3, s3, s3, objArr4);
                    obj2 = cls.getMethod((String) objArr4[s3], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                s2 = 0;
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
        float f2 = RecyclerView.DECELERATION_RATE;
        char[] cArr3 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i6 = addparam.ThreeDS2Service;
            if (i6 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i6] = (char) jArr[i6];
            Object[] objArr5 = new Object[i3];
            objArr5[1] = addparam;
            objArr5[0] = addparam;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 != null) {
                f = f2;
            } else {
                f = f2;
                Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 76, (char) (TextUtils.lastIndexOf("", '0', 0) + 62098), 2102 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)));
                Object[] objArr6 = new Object[1];
                b(0, (short) 0, 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
            f2 = f;
            i3 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 1 - (i2 * 4);
        int i6 = (s * 2) + 99;
        int i7 = 3 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            int i9 = i7;
            int i10 = i7 + (-i8);
            int i11 = i9;
            i6 = i10;
            i7 = i11;
            i3 = i4;
            int i12 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i12];
            int i13 = i6;
            i9 = i12;
            i7 = i13;
            int i102 = i7 + (-i8);
            int i112 = i9;
            i6 = i102;
            i7 = i112;
            i3 = i4;
            int i122 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{107, 110, -109, -32};
        $$b = 144;
    }

    public static void initialize() {
        ThreeDS2ServiceInitializationCallback = 3577786821605891606L;
    }

    public static put valueOf(String str) {
        int i = cleanup + 5;
        createTransaction = i % 128;
        int i2 = i % 2;
        put putVar = (put) Enum.valueOf(put.class, str);
        if (i2 != 0) {
            int i3 = 9 / 0;
        }
        return putVar;
    }

    public static put[] values() {
        int i = createTransaction + 103;
        cleanup = i % 128;
        if (i % 2 == 0) {
            getSDKInfo.clone();
            throw null;
        }
        put[] putVarArr = (put[]) getSDKInfo.clone();
        cleanup = (createTransaction + 79) % 128;
        return putVarArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = createTransaction;
        String str = this.getWarnings;
        int i2 = i + 65;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ put[] ThreeDS2ServiceInstance() {
        put[] putVarArr;
        int i = createTransaction + 33;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 == 0) {
            putVarArr = new put[4];
            putVarArr[1] = ThreeDS2ServiceInstance;
            putVarArr[1] = ThreeDS2Service;
            putVarArr[3] = get;
            putVarArr[3] = initialize;
        } else {
            putVarArr = new put[]{ThreeDS2ServiceInstance, ThreeDS2Service, get, initialize};
        }
        int i3 = i2 + 93;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            return putVarArr;
        }
        throw null;
    }
}

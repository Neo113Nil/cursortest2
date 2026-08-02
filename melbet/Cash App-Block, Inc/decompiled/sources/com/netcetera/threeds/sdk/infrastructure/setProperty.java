package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class setProperty extends loadFromXML<FrameLayout> implements computeIfPresent, containsValue {
    private static int createTransaction = 1;
    private static int getSDKVersion;
    private FrameLayout ThreeDS2Service;
    private initialize ThreeDS2ServiceInstance;
    private CheckBox get;
    private final jr getWarnings;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setProperty$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ThreeDS2ServiceInstance;
        private static int get = 1;
        private static int initialize;

        static {
            int[] iArr = new int[initialize.values().length];
            ThreeDS2ServiceInstance = iArr;
            try {
                iArr[initialize.getWarnings.ordinal()] = 1;
                int i = get;
                int i2 = i & 27;
                int i3 = -(-((i ^ 27) | i2));
                initialize = ((i2 & i3) + (i3 | i2)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2ServiceInstance[initialize.ThreeDS2Service.ordinal()] = 2;
                int i4 = initialize;
                int i5 = (i4 | 105) << 1;
                int i6 = -(((~i4) & 105) | (i4 & (-106)));
                get = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2ServiceInstance[initialize.ThreeDS2ServiceInstance.ordinal()] = 3;
                int i7 = get;
                int i8 = i7 & 67;
                int i9 = -(-((i7 ^ 67) | i8));
                initialize = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i10 = initialize + 111;
            get = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class initialize {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final initialize ThreeDS2Service;
        public static final initialize ThreeDS2ServiceInstance;
        private static int get = 0;
        private static int getSDKInfo = 1;
        private static int getSDKVersion;
        public static final initialize getWarnings;
        private static final /* synthetic */ initialize[] initialize;

        static {
            initialize();
            Object[] objArr = new Object[1];
            a(false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, View.MeasureSpec.getMode(0) + 3, "\t\ufff5\u0003", 233 - TextUtils.lastIndexOf("", '0', 0), objArr);
            getWarnings = new initialize(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(false, 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000\u0001", 233 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            ThreeDS2Service = new initialize(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            a(false, 3 - TextUtils.indexOf((CharSequence) "", '0', 0), 3 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0002\u0003\u0002\ufff9", 229 - ImageFormat.getBitsPerPixel(0), objArr3);
            ThreeDS2ServiceInstance = new initialize(((String) objArr3[0]).intern(), 2);
            initialize = getWarnings();
            getSDKVersion = (getSDKInfo + 53) % 128;
        }

        private initialize(String str, int i) {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0181  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
            char[] cArr;
            int i4;
            Throwable cause;
            int i5;
            int i6 = $11;
            $10 = (i6 + 81) % 128;
            int i7 = 2;
            if (str != null) {
                int i8 = i6 + 53;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            getSDKInfo getsdkinfo = new getSDKInfo();
            char[] cArr3 = new char[i2];
            int i9 = 0;
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i10 = getsdkinfo.getWarnings;
                if (i10 >= i2) {
                    break;
                }
                char c = cArr2[i10];
                getsdkinfo.ThreeDS2ServiceInstance = c;
                char c2 = (char) (i3 + c);
                cArr3[i10] = c2;
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[1] = Integer.valueOf(get);
                    objArr2[i9] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1313942774);
                    if (obj != null) {
                        i5 = i9;
                    } else {
                        i5 = i9;
                        Class cls = (Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 66, (char) (TextUtils.getOffsetAfter("", i9) + 45769), 4880 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        Class cls2 = Integer.TYPE;
                        obj = cls.getMethod("t", cls2, cls2);
                        map.put(-1313942774, obj);
                    }
                    cArr3[i10] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = getsdkinfo;
                    objArr3[i5] = getsdkinfo;
                    Object obj2 = map.get(1981656970);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 59, (char) (ViewConfiguration.getEdgeSlop() >> 16), 12373 - (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", Object.class, Object.class);
                        map.put(1981656970, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                    i9 = i5;
                    i7 = 2;
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
            int i11 = i9;
            if (i > 0) {
                $10 = ($11 + 81) % 128;
                getsdkinfo.get = i;
                char[] cArr4 = new char[i2];
                i4 = i11;
                System.arraycopy(cArr3, i4, cArr4, i4, i2);
                int i12 = getsdkinfo.get;
                System.arraycopy(cArr4, i4, cArr3, i2 - i12, i12);
                int i13 = getsdkinfo.get;
                System.arraycopy(cArr4, i13, cArr3, i4, i2 - i13);
            } else {
                i4 = i11;
            }
            if (z) {
                char[] cArr5 = new char[i2];
                getsdkinfo.getWarnings = i4;
                $10 = ($11 + 67) % 128;
                while (true) {
                    int i14 = getsdkinfo.getWarnings;
                    if (i14 >= i2) {
                        break;
                    }
                    $10 = ($11 + 11) % 128;
                    cArr5[i14] = cArr3[(i2 - i14) - 1];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12373 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                }
                cArr3 = cArr5;
            }
            objArr[0] = new String(cArr3);
        }

        private static /* synthetic */ initialize[] getWarnings() {
            int i = getSDKVersion + 79;
            int i2 = i % 128;
            getSDKInfo = i2;
            initialize[] initializeVarArr = i % 2 == 0 ? new initialize[]{getWarnings, ThreeDS2Service, ThreeDS2ServiceInstance} : new initialize[]{getWarnings, ThreeDS2Service, ThreeDS2ServiceInstance};
            int i3 = i2 + 53;
            getSDKVersion = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 61 / 0;
            }
            return initializeVarArr;
        }

        public static void initialize() {
            get = 1141902488;
        }

        public static initialize valueOf(String str) {
            getSDKVersion = (getSDKInfo + 93) % 128;
            initialize initializeVar = (initialize) Enum.valueOf(initialize.class, str);
            int i = getSDKVersion + 77;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                return initializeVar;
            }
            throw null;
        }

        public static initialize[] values() {
            getSDKInfo = (getSDKVersion + 11) % 128;
            initialize[] initializeVarArr = (initialize[]) initialize.clone();
            getSDKVersion = (getSDKInfo + 83) % 128;
            return initializeVarArr;
        }
    }

    public setProperty(Context context, jr jrVar) {
        super(context);
        this.ThreeDS2ServiceInstance = initialize.ThreeDS2ServiceInstance;
        this.getWarnings = jrVar;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setProperty setproperty = (setProperty) objArr[0];
        Boolean bool = (Boolean) objArr[2];
        bool.booleanValue();
        int i = getSDKVersion;
        createTransaction = SVG$Unit$EnumUnboxingLocalUtility.m(i ^ 100, (i & 100) << 1, -1, 128);
        get(new Object[]{setproperty, bool}, -921422079, 921422080, System.identityHashCode(setproperty));
        int i2 = getSDKVersion;
        int i3 = (((i2 & (-68)) | ((~i2) & 67)) - (~((i2 & 67) << 1))) - 1;
        createTransaction = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        initialize initializeVar;
        setProperty setproperty = (setProperty) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = getSDKVersion;
        int i2 = (((i & (-18)) | ((~i) & 17)) - (~((i & 17) << 1))) - 1;
        int i3 = i2 % 128;
        createTransaction = i3;
        if (i2 % 2 == 0) {
            CheckBox checkBox = setproperty.get;
            throw null;
        }
        if (setproperty.get != null) {
            getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3 & 1, ~(i3 | 1), 1, 128);
            if (booleanValue) {
                getSDKVersion = (i3 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                initializeVar = initialize.getWarnings;
                int i4 = createTransaction;
                int i5 = i4 & 7;
                getSDKVersion = (((i4 | 7) & (~i5)) + (i5 << 1)) % 128;
            } else {
                initializeVar = initialize.ThreeDS2Service;
                int i6 = getSDKVersion;
                int i7 = i6 & 113;
                createTransaction = (((i6 | 113) & (~i7)) + (i7 << 1)) % 128;
            }
            setproperty.ThreeDS2ServiceInstance = initializeVar;
            int i8 = createTransaction;
            int i9 = i8 & 91;
            int i10 = i8 | 91;
            getSDKVersion = ((i9 & i10) + (i10 | i9)) % 128;
        }
        int i11 = createTransaction;
        getSDKVersion = ((i11 & 49) + (i11 | 49)) % 128;
        return null;
    }

    public abstract replace ThreeDS2Service(replace replaceVar);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.setProperty.getSDKVersion;
        r2 = r1 & 9;
        r1 = -(-((r1 ^ 9) | r2));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction = r3 % 128;
        r3 = r3 % 2;
        r1 = r6.ThreeDS2Service;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r3 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r1.setVisibility(0);
        r6.get.setText(r7);
        get(new java.lang.Object[]{r6, java.lang.Boolean.valueOf(r6.get.isChecked())}, -921422079, 921422080, java.lang.System.identityHashCode(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        r6 = com.netcetera.threeds.sdk.infrastructure.setProperty.getSDKVersion;
        com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r6 & 114, r6 | 114, 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r1.setVisibility(0);
        r6.get.setText(r7);
        get(new java.lang.Object[]{r6, java.lang.Boolean.valueOf(r6.get.isChecked())}, -921422079, 921422080, java.lang.System.identityHashCode(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r7) != false) goto L9;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service(setScroller setscroller) {
        String warnings;
        int i = getSDKVersion;
        int i2 = i & 87;
        int i3 = -(-((i ^ 87) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            initialize();
            warnings = getWarnings(setscroller);
            int i5 = 99 / 0;
        } else {
            initialize();
            warnings = getWarnings(setscroller);
        }
        int i6 = getSDKVersion + 57;
        createTransaction = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ FrameLayout ThreeDS2ServiceInstance(Context context) {
        int i = createTransaction;
        getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m(i & 44, i | 44, -1, 128);
        FrameLayout V_ = V_(context);
        int i2 = createTransaction;
        int i3 = i2 & 85;
        int i4 = (i2 ^ 85) | i3;
        getSDKVersion = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return V_;
    }

    public FrameLayout V_(Context context) {
        this.ThreeDS2Service = new FrameLayout(context);
        this.ThreeDS2Service.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        FrameLayout frameLayout = this.ThreeDS2Service;
        int i = es.getSDKVersion;
        int i2 = es.initialize;
        frameLayout.setPadding(i, i2, i, i2);
        CheckBox checkBox = new CheckBox(context);
        this.get = checkBox;
        checkBox.setPadding(es.ThreeDS2Service, i2, 0, i2);
        this.get.setMinHeight(es.getSDKInfo);
        this.get.setOnCheckedChangeListener(new containsKey(this));
        aX_(this.get);
        et.bm_(this.get, this.getWarnings);
        this.ThreeDS2Service.addView(this.get);
        this.ThreeDS2Service.setVisibility(8);
        FrameLayout frameLayout2 = this.ThreeDS2Service;
        int i3 = getSDKVersion;
        createTransaction = SVG$Unit$EnumUnboxingLocalUtility.m(i3 & 26, i3 | 26, -1, 128);
        return frameLayout2;
    }

    public abstract void aX_(CheckBox checkBox);

    public abstract replace get(replace replaceVar);

    public abstract String get();

    public replace getWarnings(replace replaceVar) {
        int i = createTransaction;
        int i2 = i & 25;
        getSDKVersion = (((i | 25) & (~i2)) + (i2 << 1)) % 128;
        int i3 = AnonymousClass5.ThreeDS2ServiceInstance[this.ThreeDS2ServiceInstance.ordinal()];
        if (i3 == 1) {
            replace ThreeDS2Service = ThreeDS2Service(replaceVar);
            int i4 = getSDKVersion;
            int i5 = (i4 ^ 77) + ((i4 & 77) << 1);
            createTransaction = i5 % 128;
            if (i5 % 2 != 0) {
                return ThreeDS2Service;
            }
            throw null;
        }
        if (i3 == 2) {
            replace replaceVar2 = get(replaceVar);
            int i6 = getSDKVersion;
            int i7 = (((i6 & (-112)) | ((~i6) & 111)) - (~(-(-((i6 & 111) << 1))))) - 1;
            createTransaction = i7 % 128;
            if (i7 % 2 != 0) {
                return replaceVar2;
            }
            throw null;
        }
        int identityHashCode = System.identityHashCode(this);
        int i8 = ~identityHashCode;
        int i9 = ((-1187993) & i8) | ((~i8) & 1187992);
        int i10 = i8 & 1187992;
        int i11 = -(-(((i9 & i10) | (i9 ^ i10)) * (-192)));
        int i12 = (-281935838) & i11;
        int i13 = i11 | (-281935838);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = (689053944 ^ i8) | (689053944 & i8);
        int i16 = (i15 | (~i15)) & (~i15);
        int i17 = 107808515 ^ i16;
        int i18 = i16 & 107808515;
        int i19 = -(-(((i18 & i17) | (i17 ^ i18)) * (-384)));
        int i20 = (i14 & i19) + (i14 | i19);
        int i21 = (-107808516) ^ identityHashCode;
        int i22 = ~identityHashCode;
        int i23 = (-107808516) & identityHashCode;
        int i24 = ~((i23 & i21) | (i21 ^ i23));
        int i25 = i8 & (i22 | identityHashCode);
        int i26 = ((~i25) & 689053944) | ((-689053945) & i25);
        int i27 = i25 & 689053944;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = ((-108996508) & i28) | ((~i28) & 108996507);
        int i30 = i28 & 108996507;
        int i31 = ~((i30 & i29) | (i29 ^ i30));
        int i32 = i24 ^ i31;
        int i33 = i31 & i24;
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = (identityHashCode & (-687865953)) | ((-687865953) & i22) | (687865952 & identityHashCode);
        int i36 = (i35 | (~i35)) & (~i35);
        int i37 = ((i36 & i34) | ((~i36) & i34) | ((~i34) & i36)) * 192;
        int i38 = i20 | i37;
        int i39 = i38 << 1;
        int i40 = -((~(i37 & i20)) & i38);
        int i41 = (i39 & i40) + (i40 | i39);
        int identityHashCode2 = System.identityHashCode(this);
        int i42 = ~identityHashCode2;
        int i43 = ((i42 & 648003327) | (648003327 ^ i42)) * (-369);
        int i44 = (-1044441704) | i43;
        int i45 = i44 << 1;
        int i46 = -((~(i43 & (-1044441704))) & i44);
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        int i48 = ~identityHashCode2;
        int i49 = ~(((-646952176) ^ i48) | ((-646952176) & i48));
        int i50 = 35098173 ^ i49;
        int i51 = i49 & 35098173;
        int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * (-369)));
        int i53 = ((i47 ^ i52) | (i47 & i52)) << 1;
        int i54 = -(((~i47) & i52) | ((~i52) & i47));
        int i55 = (i53 & i54) + (i53 | i54);
        int i56 = 646952175 ^ identityHashCode2;
        int i57 = identityHashCode2 & 646952175;
        int i58 = (i57 & i56) | (i56 ^ i57);
        int i59 = (i58 | (~i58)) & (~i58);
        int i60 = 1051152 & i59;
        int i61 = ((i59 | 1051152) & (~i60)) | i60;
        int i62 = (-646952176) & i48;
        int i63 = (i48 | (-646952176)) & (~i62);
        int i64 = (i63 & i62) | (i63 ^ i62);
        int i65 = i64 ^ 35098173;
        int i66 = i64 & 35098173;
        int i67 = ~((i66 & i65) | (i65 ^ i66));
        if (i41 <= (i55 - (~(-(~(((i61 & i67) | (i61 ^ i67)) * 369))))) - 2) {
            return replaceVar;
        }
        throw null;
    }

    public abstract String getWarnings(setScroller setscroller);

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((i | i3) * (-859)) + (i2 * (-858)) + (i * 860);
        int i5 = ~i3;
        int i6 = ~(i5 | i);
        int i7 = ~i;
        int i8 = ~i2;
        return (((~(i | i8)) | (~(i8 | i5))) * 859) + ((((~(i3 | (i7 | i8))) | i6) * 859) + i4) != 1 ? get(objArr) : initialize(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction;
        r7 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r7 & 92, r7 | 92, 1, 128);
        com.netcetera.threeds.sdk.infrastructure.setProperty.getSDKVersion = r7;
        com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1((r7 & (-86)) | ((~r7) & 85), ~((r7 & 85) << 1), 1, 128);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r7.ThreeDS2ServiceInstance == com.netcetera.threeds.sdk.infrastructure.setProperty.initialize.getWarnings) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r7.ThreeDS2ServiceInstance == com.netcetera.threeds.sdk.infrastructure.setProperty.initialize.getWarnings) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004e, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction;
        r4 = ((r7 ^ 73) | (r7 & 73)) << 1;
        r7 = -(((~r7) & 73) | (r7 & (-74)));
        com.netcetera.threeds.sdk.infrastructure.setProperty.getSDKVersion = (((r4 | r7) << 1) - (r7 ^ r4)) % 128;
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(eq eqVar) {
        String str;
        boolean z;
        int i = createTransaction;
        int i2 = i & 41;
        int i3 = (((i | 41) & (~i2)) - (~(i2 << 1))) - 1;
        getSDKVersion = i3 % 128;
        if (i3 % 2 != 0) {
            str = get();
            int i4 = 32 / 0;
        } else {
            str = get();
        }
        eqVar.get(str, z);
        int i5 = createTransaction;
        int i6 = i5 ^ 21;
        int i7 = ((i5 & 21) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        getSDKVersion = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 50 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r5.getWarnings(get(), false).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r5.getWarnings(get(), false).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        r4.get.setChecked(true);
        r4 = com.netcetera.threeds.sdk.infrastructure.setProperty.getSDKVersion;
        r5 = r4 & 113;
        com.netcetera.threeds.sdk.infrastructure.setProperty.createTransaction = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1((r4 | 113) & (~r5), ~(r5 << 1), 1, 128);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(er erVar) {
        int i = createTransaction;
        int i2 = i & 57;
        int i3 = (i | 57) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getSDKVersion = i5 % 128;
        if (i5 % 2 != 0) {
            initialize();
        } else {
            initialize();
        }
        createTransaction = (getSDKVersion + 61) % 128;
    }
}

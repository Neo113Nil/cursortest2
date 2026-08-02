package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public class setMultiChoiceModeListener implements setHorizontalScrollbarOverlay {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2ServiceInstance;
    private static int getSDKInfo;
    private static int initialize;
    private final Executor ThreeDS2Service;
    private final Executor get;
    private final setHorizontalScrollbarOverlay getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        getSDKInfo = 1;
        ThreeDS2ServiceInstance = 1938603593152535027L;
    }

    public setMultiChoiceModeListener(Executor executor, Executor executor2, setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay) {
        this.get = executor;
        this.ThreeDS2Service = executor2;
        this.getWarnings = sethorizontalscrollbaroverlay;
    }

    public static setHorizontalScrollbarOverlay ThreeDS2ServiceInstance(setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay) {
        setMultiChoiceModeListener setmultichoicemodelistener = new setMultiChoiceModeListener(Executors.newSingleThreadExecutor(), (Executor) setFriction.get(new Object[0], -409402454, 409402454, (int) System.currentTimeMillis()), sethorizontalscrollbaroverlay);
        initialize = (getSDKInfo + 41) % 128;
        return setmultichoicemodelistener;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        int i2;
        Object method;
        int i3 = 2;
        int i4 = 0;
        if (str != null) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr = str.toCharArray();
                int i6 = 30 / 0;
            } else {
                cArr = str.toCharArray();
            }
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
            int i7 = addparam.ThreeDS2Service;
            if (i7 >= cArr2.length) {
                break;
            }
            int i8 = $10 + 11;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            Class cls = Integer.TYPE;
            if (i9 == 0) {
                char c = cArr2[i7];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i3] = addparam;
                    objArr2[1] = addparam;
                    objArr2[i4] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        i2 = i4;
                        method = obj;
                    } else {
                        i2 = i4;
                        method = ((Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 66, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i2) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i2) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12511)).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i7] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() & ThreeDS2ServiceInstance & 6009743645011411028L;
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[i2] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        int i10 = i2;
                        Class cls2 = (Class) removeParam.initialize(76 - View.MeasureSpec.getMode(i2), (char) (Drawable.resolveOpacity(i10, i10) + 62097), (ViewConfiguration.getTouchSlop() >> 8) + 2102);
                        Object[] objArr4 = new Object[1];
                        b(0, 0, (byte) 0, objArr4);
                        obj2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr2[i7]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(65 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getScrollBarSize() >> 8), 12511 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i7] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (ThreeDS2ServiceInstance ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') + 28, (char) (62097 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2101 - ExpandableListView.getPackedPositionChild(0L));
                    Object[] objArr7 = new Object[1];
                    b(0, 0, (byte) 0, objArr7);
                    obj4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1840119381, obj4);
                }
                ((Method) obj4).invoke(null, objArr6);
            }
            i3 = 2;
            i4 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i11 = addparam.ThreeDS2Service;
            if (i11 >= cArr2.length) {
                String str2 = new String(cArr3);
                $10 = ($11 + 71) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[i11] = (char) jArr[i11];
            Object[] objArr8 = {addparam, addparam};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj5 = map3.get(-1840119381);
            if (obj5 == null) {
                Class cls4 = (Class) removeParam.initialize(77 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0) + 62097), Color.rgb(0, 0, 0) + 16779318);
                Object[] objArr9 = new Object[1];
                b(0, 0, (byte) 0, objArr9);
                obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(-1840119381, obj5);
            }
            ((Method) obj5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (b * 4);
        int i5 = 99 - (i2 * 4);
        int i6 = i * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i4;
            i5 += -i4;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            byte[] bArr4 = bArr;
            i9 = i4;
            i4 = b2;
            i8 = i3 + 1;
            bArr3 = bArr4;
            i5 += -i4;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private /* synthetic */ void get(setCursorVisible setcursorvisible, setCertificate setcertificate) {
        getSDKInfo = (initialize + 77) % 128;
        try {
            this.getWarnings.ThreeDS2ServiceInstance(setcursorvisible, setcertificate);
            initialize = (getSDKInfo + 119) % 128;
        } catch (Throwable th) {
            setTextAlignment settextalignment = setTextAlignment.getMessage;
            Object[] objArr = new Object[1];
            a("᧔ᜁя㖊⋮倚䅇纝濍鴱詜뮵꣰꘡흪쒯\uf5c5\ue331ၠƫ㻾Ⱛ崑", 3779 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            setcertificate.initialize(settextalignment.initialize(((String) objArr[0]).intern(), th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object getWarnings(Object[] objArr) {
        setMultiChoiceModeListener setmultichoicemodelistener = (setMultiChoiceModeListener) objArr[0];
        setCursorVisible setcursorvisible = (setCursorVisible) objArr[1];
        setCertificate setcertificate = (setCertificate) objArr[2];
        int i = getSDKInfo + 21;
        initialize = i % 128;
        int i2 = i % 2;
        setmultichoicemodelistener.get(setcursorvisible, setcertificate);
        if (i2 == 0) {
            return null;
        }
        int i3 = 96 / 0;
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{106, -113, 65, 83};
        $$b = EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay
    public void ThreeDS2Service(setMinEms setminems, setNetworkAvailable setnetworkavailable) {
        this.get.execute(new setFastScrollEnabled(this, setminems, new getWarnings(this.ThreeDS2Service, setnetworkavailable)));
        getSDKInfo = (initialize + 89) % 128;
    }

    public static class ThreeDS2Service implements setCertificate {
        private static int ThreeDS2ServiceInstance = 1;
        private static int get;
        private final Executor getWarnings;
        private final setCertificate initialize;

        public ThreeDS2Service(Executor executor, setCertificate setcertificate) {
            this.getWarnings = executor;
            this.initialize = setcertificate;
        }

        private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) objArr[0];
            setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
            int i = get;
            int i2 = i & 17;
            int i3 = (i | 17) & (~i2);
            int i4 = i2 << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 != 0) {
                threeDS2Service.initialize.initialize(setscrollcapturecallback);
                return null;
            }
            threeDS2Service.initialize.initialize(setscrollcapturecallback);
            int i6 = 93 / 0;
            return null;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setCertificate
        public void ThreeDS2ServiceInstance() {
            Executor executor = this.getWarnings;
            setCertificate setcertificate = this.initialize;
            Objects.requireNonNull(setcertificate);
            executor.execute(new setSelectedChildViewEnabled(setcertificate));
            int i = get;
            int i2 = (i & 60) + (i | 60);
            ThreeDS2ServiceInstance = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setCertificate
        public void initialize(setScrollCaptureCallback setscrollcapturecallback) {
            this.getWarnings.execute(new setDrawSelectorOnTop(this, setscrollcapturecallback));
            int i = ThreeDS2ServiceInstance;
            int i2 = (((i | 82) << 1) - (i ^ 82)) - 1;
            get = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
        }

        public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
            return ThreeDS2Service(objArr);
        }
    }

    public static class getWarnings implements setNetworkAvailable {
        private static int ThreeDS2Service = 1;
        private static int get;
        private final setNetworkAvailable ThreeDS2ServiceInstance;
        private final Executor initialize;

        public getWarnings(Executor executor, setNetworkAvailable setnetworkavailable) {
            this.initialize = executor;
            this.ThreeDS2ServiceInstance = setnetworkavailable;
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            getWarnings getwarnings = (getWarnings) objArr[0];
            setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
            ThreeDS2Service = (get + 83) % 128;
            getwarnings.ThreeDS2ServiceInstance.get(setscrollcapturecallback);
            int identityHashCode = System.identityHashCode(getwarnings);
            int i = (-626485483) & identityHashCode;
            int i2 = (~i) & ((-626485483) | identityHashCode);
            int i3 = (i & i2) | (i2 ^ i);
            int i4 = (i3 | (~i3)) & (~i3);
            int i5 = ~identityHashCode;
            int i6 = ~identityHashCode;
            int i7 = i5 & (i6 | identityHashCode);
            int i8 = (i7 & (-350523135)) | ((~i7) & 350523134);
            int i9 = i7 & 350523134;
            int i10 = (i8 & i9) | (i8 ^ i9);
            int i11 = i10 ^ 626485482;
            int i12 = i10 & 626485482;
            int i13 = ~((i12 & i11) | (i11 ^ i12));
            int i14 = i4 & i13;
            int i15 = (i4 | i13) & (~i14);
            int i16 = -(-(((i15 & i14) | (i15 ^ i14)) * (-406)));
            int i17 = 1348572208 & i16;
            int i18 = i17 + ((i16 ^ 1348572208) | i17);
            int i19 = (-626485483) ^ i6;
            int i20 = (-626485483) & i6;
            int i21 = (i20 & i19) | (i19 ^ i20);
            int i22 = i21 ^ 350523134;
            int i23 = i21 & 350523134;
            int i24 = -(-((~((i23 & i22) | (i22 ^ i23))) * (-406)));
            int i25 = (i18 & i24) + (i24 | i18);
            int i26 = ~((identityHashCode & (-350523135)) | ((-350523135) & i6) | (identityHashCode & 350523134));
            int i27 = ~((i7 ^ 626485482) | (i7 & 626485482));
            int i28 = -(-(((i26 & i27) | (i26 ^ i27)) * 406));
            int i29 = i25 & i28;
            int i30 = (((i25 ^ i28) | i29) << 1) - ((i28 | i25) & (~i29));
            int identityHashCode2 = System.identityHashCode(getwarnings);
            int i31 = ~identityHashCode2;
            int i32 = 18329859 ^ i31;
            int i33 = 18329859 & i31;
            int i34 = (i33 & i32) | (i32 ^ i33);
            int i35 = ~((i34 & 2056089028) | (i34 ^ 2056089028));
            int i36 = (i31 & (-17993732)) | (17993731 & identityHashCode2);
            int i37 = (-17993732) & identityHashCode2;
            int i38 = ~((i36 & i37) | (i36 ^ i37));
            int i39 = i35 & i38;
            int i40 = (i38 | i35) & (~i39);
            int i41 = -(-(((i40 & i39) | (i40 ^ i39)) * (-302)));
            int i42 = (-1666487088) & i41;
            int i43 = (i41 ^ (-1666487088)) | i42;
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            int i45 = 2074082759 & identityHashCode2;
            int i46 = (2074082759 | identityHashCode2) & (~i45);
            int i47 = (i46 & i45) | (i46 ^ i45);
            int i48 = ((i47 | (~i47)) & (~i47)) * (-604);
            int i49 = (((~i48) & i44) | ((~i44) & i48)) + ((i48 & i44) << 1);
            int i50 = 2056089028 & identityHashCode2;
            int i51 = ~(((identityHashCode2 | 2056089028) & (~i50)) | i50);
            int i52 = 336128 & i51;
            int i53 = -(-((((i51 | 336128) & (~i52)) | i52) * EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE));
            int i54 = ((i49 ^ i53) | (i49 & i53)) << 1;
            int i55 = -((i53 & (~i49)) | ((~i53) & i49));
            if (i30 > ((i54 | i55) << 1) - (i55 ^ i54)) {
                int i56 = 20 / 0;
            }
            return null;
        }

        private static /* synthetic */ Object get(Object[] objArr) {
            getWarnings getwarnings = (getWarnings) objArr[0];
            setCursorVisible setcursorvisible = (setCursorVisible) objArr[1];
            int i = ThreeDS2Service;
            int i2 = (i & (-54)) | ((~i) & 53);
            int i3 = (i & 53) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            get = i4 % 128;
            if (i4 % 2 == 0) {
                getwarnings.ThreeDS2ServiceInstance.ThreeDS2Service(setcursorvisible);
                return null;
            }
            getwarnings.ThreeDS2ServiceInstance.ThreeDS2Service(setcursorvisible);
            throw null;
        }

        private static /* synthetic */ Object getWarnings(Object[] objArr) {
            getWarnings getwarnings = (getWarnings) objArr[0];
            setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
            int i = ThreeDS2Service;
            int i2 = i & 119;
            int i3 = ((i | 119) & (~i2)) + (i2 << 1);
            get = i3 % 128;
            if (i3 % 2 != 0) {
                getwarnings.ThreeDS2ServiceInstance.ThreeDS2Service(setscrollcapturecallback);
                throw null;
            }
            getwarnings.ThreeDS2ServiceInstance.ThreeDS2Service(setscrollcapturecallback);
            int i4 = ThreeDS2Service;
            int i5 = ((i4 ^ 57) | (i4 & 57)) << 1;
            int i6 = -(((~i4) & 57) | (i4 & (-58)));
            int i7 = (i5 & i6) + (i6 | i5);
            get = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~(i4 | i2);
            int i6 = ~i2;
            int i7 = ((i3 | i5 | (~(i6 | i))) * 614) + (i2 * (-613)) + (i * 615);
            int i8 = ~i3;
            int i9 = (((~(i | i8 | i2)) | (~(i4 | i6 | i8))) * 614) + (((~(i4 | i8)) | i5 | (~(i8 | i2))) * (-1228)) + i7;
            if (i9 == 1) {
                getWarnings getwarnings = (getWarnings) objArr[0];
                setScroller setscroller = (setScroller) objArr[1];
                int i10 = ThreeDS2Service;
                int i11 = i10 & 9;
                int i12 = (i10 ^ 9) | i11;
                get = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                getwarnings.ThreeDS2ServiceInstance.ThreeDS2Service(setscroller);
                int i13 = get;
                ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i13 ^ 121) | (i13 & 121)) << 1, ~(-(((~i13) & 121) | (i13 & (-122)))), 1, 128);
                return null;
            }
            if (i9 == 2) {
                return get(objArr);
            }
            if (i9 == 3) {
                return ThreeDS2ServiceInstance(objArr);
            }
            if (i9 != 4) {
                return i9 != 5 ? getWarnings(objArr) : initialize(objArr);
            }
            getWarnings getwarnings2 = (getWarnings) objArr[0];
            setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
            get = (ThreeDS2Service + 41) % 128;
            getwarnings2.ThreeDS2ServiceInstance.initialize(setscrollcapturecallback);
            int i14 = ThreeDS2Service;
            int i15 = i14 & 91;
            int i16 = (i14 | 91) & (~i15);
            int i17 = i15 << 1;
            get = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
            return null;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void ThreeDS2Service(setScrollCaptureCallback setscrollcapturecallback) {
            this.initialize.execute(new setTextFilterEnabled(this, setscrollcapturecallback));
            int i = get;
            int i2 = (i & (-36)) | ((~i) & 35);
            int i3 = (i & 35) << 1;
            ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void ThreeDS2Service(setCursorVisible setcursorvisible) {
            this.initialize.execute(new setSmoothScrollbarEnabled(this, setcursorvisible));
            int i = get;
            int i2 = ((i | 43) << 1) - (i ^ 43);
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void ThreeDS2Service(setScroller setscroller) {
            this.initialize.execute(new setOnScrollListener(this, setscroller));
            int i = ThreeDS2Service;
            int i2 = (i & 73) + (i | 73);
            get = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void get(setScrollCaptureCallback setscrollcapturecallback) {
            this.initialize.execute(new setFilterText(this, setscrollcapturecallback));
            int i = ThreeDS2Service + 105;
            get = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private static /* synthetic */ Object initialize(Object[] objArr) {
            getWarnings getwarnings = (getWarnings) objArr[0];
            setAllCaps setallcaps = (setAllCaps) objArr[1];
            int i = ThreeDS2Service;
            int i2 = (i ^ 77) + ((i & 77) << 1);
            get = i2 % 128;
            if (i2 % 2 != 0) {
                getwarnings.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(setallcaps);
                int i3 = 79 / 0;
                return null;
            }
            getwarnings.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(setallcaps);
            return null;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void initialize(setScrollCaptureCallback setscrollcapturecallback) {
            this.initialize.execute(new setSelector(this, setscrollcapturecallback));
            int i = ThreeDS2Service;
            int i2 = i & 105;
            int i3 = ((i ^ 105) | i2) << 1;
            int i4 = -((i | 105) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            get = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setNetworkAvailable
        public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
            this.initialize.execute(new setScrollingCacheEnabled(this, setallcaps));
            int i = ThreeDS2Service;
            get = SVG$Unit$EnumUnboxingLocalUtility.m(i & 116, i | 116, -1, 128);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHorizontalScrollbarOverlay
    public void ThreeDS2ServiceInstance(setCursorVisible setcursorvisible, setCertificate setcertificate) {
        this.get.execute(new setStackFromBottom(this, setcursorvisible, new ThreeDS2Service(this.ThreeDS2Service, setcertificate)));
        getSDKInfo = (initialize + 99) % 128;
    }

    public static /* synthetic */ void ThreeDS2ServiceInstance(setMultiChoiceModeListener setmultichoicemodelistener, setMinEms setminems, setNetworkAvailable setnetworkavailable) {
        int i = getSDKInfo + 91;
        initialize = i % 128;
        int i2 = i % 2;
        setmultichoicemodelistener.get(setminems, setnetworkavailable);
        if (i2 != 0) {
            int i3 = 78 / 0;
        }
    }

    private /* synthetic */ void get(setMinEms setminems, setNetworkAvailable setnetworkavailable) {
        getSDKInfo = (initialize + 105) % 128;
        try {
            this.getWarnings.ThreeDS2Service(setminems, setnetworkavailable);
        } catch (Throwable th) {
            setTextAlignment settextalignment = setTextAlignment.getMessage;
            Object[] objArr = new Object[1];
            a("᧔悕\ueb67痆ﲸ䝼쇌䢪퍳巍꒯⽽꧖ゞ묀\u05cf貢ᜅ释ᢦ", 31062 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            setnetworkavailable.get(settextalignment.initialize(((String) objArr[0]).intern(), th));
        }
        getSDKInfo = (initialize + 21) % 128;
    }
}
